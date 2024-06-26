// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.CertBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerSku;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import com.azure.resourcemanager.confidentialledger.models.RunningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LedgerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LedgerProperties model = BinaryData.fromString(
            "{\"ledgerName\":\"crzevdphlx\",\"ledgerUri\":\"lthqtrgqjbp\",\"identityServiceUri\":\"fsinzgvfcjrwzoxx\",\"ledgerInternalNamespace\":\"felluwfzitonpe\",\"runningState\":\"Paused\",\"ledgerType\":\"Unknown\",\"provisioningState\":\"Canceled\",\"ledgerSku\":\"Standard\",\"aadBasedSecurityPrincipals\":[{\"principalId\":\"vhpfxxypininmay\",\"tenantId\":\"ybb\",\"ledgerRoleName\":\"Contributor\"},{\"principalId\":\"epoo\",\"tenantId\":\"nuvamiheogna\",\"ledgerRoleName\":\"Administrator\"},{\"principalId\":\"theotusiv\",\"tenantId\":\"v\",\"ledgerRoleName\":\"Administrator\"}],\"certBasedSecurityPrincipals\":[{\"cert\":\"nhungbw\",\"ledgerRoleName\":\"Administrator\"},{\"cert\":\"fygxgispemvtzfk\",\"ledgerRoleName\":\"Reader\"}]}")
            .toObject(LedgerProperties.class);
        Assertions.assertEquals(RunningState.PAUSED, model.runningState());
        Assertions.assertEquals(LedgerType.UNKNOWN, model.ledgerType());
        Assertions.assertEquals(LedgerSku.STANDARD, model.ledgerSku());
        Assertions.assertEquals("vhpfxxypininmay", model.aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("ybb", model.aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions.assertEquals(LedgerRoleName.CONTRIBUTOR, model.aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("nhungbw", model.certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR,
            model.certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LedgerProperties model = new LedgerProperties().withRunningState(RunningState.PAUSED)
            .withLedgerType(LedgerType.UNKNOWN)
            .withLedgerSku(LedgerSku.STANDARD)
            .withAadBasedSecurityPrincipals(Arrays.asList(
                new AadBasedSecurityPrincipal().withPrincipalId("vhpfxxypininmay")
                    .withTenantId("ybb")
                    .withLedgerRoleName(LedgerRoleName.CONTRIBUTOR),
                new AadBasedSecurityPrincipal().withPrincipalId("epoo")
                    .withTenantId("nuvamiheogna")
                    .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                new AadBasedSecurityPrincipal().withPrincipalId("theotusiv")
                    .withTenantId("v")
                    .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR)))
            .withCertBasedSecurityPrincipals(Arrays.asList(
                new CertBasedSecurityPrincipal().withCert("nhungbw").withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                new CertBasedSecurityPrincipal().withCert("fygxgispemvtzfk")
                    .withLedgerRoleName(LedgerRoleName.READER)));
        model = BinaryData.fromObject(model).toObject(LedgerProperties.class);
        Assertions.assertEquals(RunningState.PAUSED, model.runningState());
        Assertions.assertEquals(LedgerType.UNKNOWN, model.ledgerType());
        Assertions.assertEquals(LedgerSku.STANDARD, model.ledgerSku());
        Assertions.assertEquals("vhpfxxypininmay", model.aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("ybb", model.aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions.assertEquals(LedgerRoleName.CONTRIBUTOR, model.aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("nhungbw", model.certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR,
            model.certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }
}
