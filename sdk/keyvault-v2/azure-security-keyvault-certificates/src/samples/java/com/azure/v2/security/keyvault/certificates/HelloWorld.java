// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.certificates;

import com.azure.v2.core.http.polling.LongRunningOperationStatus;
import com.azure.v2.core.http.polling.PollResponse;
import com.azure.v2.core.http.polling.Poller;
import com.azure.v2.identity.DefaultAzureCredentialBuilder;
import com.azure.v2.security.keyvault.certificates.models.CertificateIssuer;
import com.azure.v2.security.keyvault.certificates.models.CertificateKeyCurveName;
import com.azure.v2.security.keyvault.certificates.models.CertificateKeyType;
import com.azure.v2.security.keyvault.certificates.models.CertificateOperation;
import com.azure.v2.security.keyvault.certificates.models.CertificatePolicy;
import com.azure.v2.security.keyvault.certificates.models.DeletedCertificate;
import com.azure.v2.security.keyvault.certificates.models.KeyVaultCertificate;
import com.azure.v2.security.keyvault.certificates.models.KeyVaultCertificateWithPolicy;
import com.azure.v2.security.keyvault.certificates.models.SubjectAlternativeNames;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Sample demonstrates how to set, get, update and delete a certificate.
 */
public class HelloWorld {
    /**
     * Authenticates with the key vault and shows how to set, get, update and delete a certificate in the key vault.
     *
     * @param args Unused. Arguments to the program.
     * @throws IllegalArgumentException when invalid key vault endpoint is passed.
     * @throws InterruptedException when the thread is interrupted in sleep mode.
     */
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {
        /* Instantiate a CertificateClient that will be used to call the service. Notice that the client is using
        default Azure credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault. See the README
        (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-certificates/README.md)
        for links and instructions. */
        CertificateClient certificateClient = new CertificateClientBuilder()
            .endpoint("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        // Let's create a self-signed certificate valid for 1 year. If the certificate already exists in the key vault,
        // then a new version of the certificate is created.
        CertificatePolicy policy = new CertificatePolicy("Self", "CN=SelfSignedJavaPkcs12")
            .setSubjectAlternativeNames(new SubjectAlternativeNames().setEmails(Arrays.asList("wow@gmail.com")))
            .setKeyReusable(true)
            .setKeyType(CertificateKeyType.EC)
            .setKeyCurveName(CertificateKeyCurveName.P_256)
            .setValidityInMonths(12);
        Map<String, String> tags = new HashMap<>();
        tags.put("foo", "bar");

        Poller<CertificateOperation, KeyVaultCertificateWithPolicy> certificatePoller = null;
            //certificateClient.beginCreateCertificate("certificateName", policy, true, tags);
        certificatePoller.waitUntil(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED);

        KeyVaultCertificate cert = certificatePoller.getFinalResult();

        // Let's get the latest version of the certificate from the key vault.
        KeyVaultCertificate certificate = certificateClient.getCertificate("certificateName");

        System.out.printf("Certificate is returned with name %s and secret id %s \n",
            certificate.getProperties().getName(), certificate.getSecretId());

        // After some time, we need to disable the certificate temporarily, so we update the enabled status of the
        // certificate. The update method can be used to update the enabled status of the certificate.
        certificate.getProperties().setEnabled(false);

        KeyVaultCertificate updatedCertificate = certificateClient.updateCertificateProperties(certificate.getProperties());

        System.out.printf("Certificate's updated enabled status is %s \n", updatedCertificate.getProperties().isEnabled());

        // Let's create a certificate issuer.
        CertificateIssuer issuer = new CertificateIssuer("myIssuer", "Test");
        CertificateIssuer myIssuer = certificateClient.createIssuer(issuer);

        System.out.printf("Issuer created with name %s and provider %s", myIssuer.getName(), myIssuer.getProvider());

        // Let's fetch the issuer we just created from the key vault.
        myIssuer = certificateClient.getIssuer("myIssuer");

        System.out.printf("Issuer retrieved with name %s and provider %s", myIssuer.getName(), myIssuer.getProvider());

        // Let's create a certificate signed by our issuer.
        /*certificateClient.beginCreateCertificate("myCertificate",
                new CertificatePolicy("myIssuer", "CN=SelfSignedJavaPkcs12"), true, tags)
            .waitUntil(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED);*/

        // Let's get the latest version of our certificate from the key vault.
        KeyVaultCertificate myCert = certificateClient.getCertificate("myCertificate");

        System.out.printf("Certificate is returned with name %s and secret id %s \n", myCert.getProperties().getName(),
            myCert.getSecretId());

        // The certificates and issuers are no longer needed, need to delete it from the key vault.
        Poller<DeletedCertificate, Void> deletedCertificatePoller = null;
            //certificateClient.beginDeleteCertificate("certificateName");
        // Deleted certificate is accessible as soon as polling beings.
        PollResponse<DeletedCertificate> pollResponse = deletedCertificatePoller.poll();

        System.out.printf("Deleted certificate with name %s and recovery id %s", pollResponse.getValue().getName(),
            pollResponse.getValue().getRecoveryId());

        deletedCertificatePoller.waitForCompletion();

        Poller<DeletedCertificate, Void> deletedCertPoller = null;
            //certificateClient.beginDeleteCertificate("myCertificate");
        // Deleted certificate is accessible as soon as polling beings.
        PollResponse<DeletedCertificate> deletePollResponse = deletedCertPoller.poll();

        System.out.printf("Deleted certificate with name %s and recovery id %s", deletePollResponse.getValue().getName(),
            deletePollResponse.getValue().getRecoveryId());

        deletedCertificatePoller.waitForCompletion();

        CertificateIssuer deleteCertificateIssuer = certificateClient.deleteIssuer("myIssuer");

        System.out.printf("Certificate issuer is permanently deleted with name %s and provider is %s \n",
            deleteCertificateIssuer.getName(), deleteCertificateIssuer.getProvider());

        // To ensure the certificate is deleted server-side.
        Thread.sleep(30000);

        // If the key vault is soft-delete enabled, then deleted certificates need to be purged for permanent deletion.
        certificateClient.purgeDeletedCertificate("certificateName");
        certificateClient.purgeDeletedCertificate("myCertificate");
    }
}
