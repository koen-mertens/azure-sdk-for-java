// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appservice.implementation;

import com.azure.resourcemanager.appservice.AppServiceManager;
import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateResourceInner;
import com.azure.resourcemanager.appservice.models.AppServiceCertificateKeyVaultBinding;
import com.azure.resourcemanager.appservice.models.AppServiceCertificateOrder;
import com.azure.resourcemanager.appservice.models.AppServiceDomain;
import com.azure.resourcemanager.appservice.models.AppServicePlan;
import com.azure.resourcemanager.appservice.models.CertificateDetails;
import com.azure.resourcemanager.appservice.models.CertificateOrderStatus;
import com.azure.resourcemanager.appservice.models.CertificateProductType;
import com.azure.resourcemanager.appservice.models.WebAppBase;
import com.azure.resourcemanager.keyvault.models.SecretPermissions;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.core.management.Region;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

/** The implementation for {@link AppServicePlan}. */
class AppServiceCertificateOrderImpl extends
    GroupableResourceImpl<AppServiceCertificateOrder, AppServiceCertificateOrderInner, AppServiceCertificateOrderImpl, AppServiceManager>
    implements AppServiceCertificateOrder, AppServiceCertificateOrder.Definition, AppServiceCertificateOrder.Update {

    private WebAppBase domainVerifyWebApp;
    private AppServiceDomain domainVerifyDomain;
    private Mono<Vault> bindingVault;

    AppServiceCertificateOrderImpl(String key, AppServiceCertificateOrderInner innerObject, AppServiceManager manager) {
        super(key, innerObject, manager);
        this.withRegion("global").withValidYears(1);
    }

    @Override
    protected Mono<AppServiceCertificateOrderInner> getInnerAsync() {
        return this.manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .getByResourceGroupAsync(resourceGroupName(), name());
    }

    @Override
    public AppServiceCertificateKeyVaultBinding getKeyVaultBinding() {
        return getKeyVaultBindingAsync().block();
    }

    @Override
    public Mono<AppServiceCertificateKeyVaultBinding> getKeyVaultBindingAsync() {
        return this.manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .listCertificatesAsync(resourceGroupName(), name())
            .switchIfEmpty(Mono.empty())
            .take(1)
            .singleOrEmpty()
            .map(inner -> new AppServiceCertificateKeyVaultBindingImpl(inner, this));
    }

    @Override
    public void verifyDomainOwnership(AppServiceDomain domain) {
        verifyDomainOwnershipAsync(domain).block();
    }

    @Override
    public Mono<Void> verifyDomainOwnershipAsync(AppServiceDomain domain) {
        return domain.verifyDomainOwnershipAsync(name(), domainVerificationToken());
    }

    @Override
    public String distinguishedName() {
        return innerModel().distinguishedName();
    }

    @Override
    public String domainVerificationToken() {
        return innerModel().domainVerificationToken();
    }

    @Override
    public int validityInYears() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().validityInYears());
    }

    @Override
    public int keySize() {
        return ResourceManagerUtils.toPrimitiveInt(innerModel().keySize());
    }

    @Override
    public CertificateProductType productType() {
        return innerModel().productType();
    }

    @Override
    public boolean autoRenew() {
        return ResourceManagerUtils.toPrimitiveBoolean(innerModel().autoRenew());
    }

    @Override
    public CertificateOrderStatus status() {
        return innerModel().status();
    }

    @Override
    public CertificateDetails signedCertificate() {
        return innerModel().signedCertificate();
    }

    @Override
    public String certificateSigningRequest() {
        return innerModel().csr();
    }

    @Override
    public CertificateDetails intermediate() {
        return innerModel().intermediate();
    }

    @Override
    public CertificateDetails root() {
        return innerModel().root();
    }

    @Override
    public String serialNumber() {
        return innerModel().serialNumber();
    }

    @Override
    public OffsetDateTime lastCertificateIssuanceTime() {
        return innerModel().lastCertificateIssuanceTime();
    }

    @Override
    public OffsetDateTime expirationTime() {
        return innerModel().expirationTime();
    }

    @Override
    public AppServiceCertificateKeyVaultBinding createKeyVaultBinding(String certificateName, Vault vault) {
        return createKeyVaultBindingAsync(certificateName, vault).block();
    }

    @Override
    public Mono<AppServiceCertificateKeyVaultBinding> createKeyVaultBindingAsync(String certificateName, Vault vault) {
        AppServiceCertificateResourceInner certInner = new AppServiceCertificateResourceInner();
        certInner.withLocation(vault.regionName());
        certInner.withKeyVaultId(vault.id());
        certInner.withKeyVaultSecretName(certificateName);
        return this.manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .createOrUpdateCertificateAsync(resourceGroupName(), name(), certificateName, certInner)
            .map(appServiceCertificateInner -> new AppServiceCertificateKeyVaultBindingImpl(appServiceCertificateInner,
                this));
    }

    @Override
    public AppServiceCertificateOrderImpl withHostName(String hostName) {
        innerModel().withDistinguishedName("CN=" + hostName);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withStandardSku() {
        innerModel().withProductType(CertificateProductType.STANDARD_DOMAIN_VALIDATED_SSL);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withWildcardSku() {
        innerModel().withProductType(CertificateProductType.STANDARD_DOMAIN_VALIDATED_WILD_CARD_SSL);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withValidYears(int years) {
        innerModel().withValidityInYears(years);
        return this;
    }

    @Override
    public Mono<AppServiceCertificateOrder> createResourceAsync() {
        return this.manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .createOrUpdateAsync(resourceGroupName(), name(), innerModel())
            .map(innerToFluentMap(this))
            .then(Mono.defer(() -> {
                if (domainVerifyWebApp != null) {
                    return domainVerifyWebApp.verifyDomainOwnershipAsync(name(), domainVerificationToken());
                } else if (domainVerifyDomain != null) {
                    return domainVerifyDomain.verifyDomainOwnershipAsync(name(), domainVerificationToken());
                } else {
                    return Mono.error(
                        new IllegalArgumentException("Please specify a non-null web app or domain to verify the domain"
                            + " ownership for hostname " + distinguishedName()));
                }
            }))
            .then(bindingVault.flatMap(vault -> createKeyVaultBindingAsync(name(), vault)))
            .then(Mono.just(this));
    }

    @Override
    public AppServiceCertificateOrderImpl withAutoRenew(boolean enabled) {
        innerModel().withAutoRenew(enabled);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withDomainVerification(AppServiceDomain domain) {
        this.domainVerifyDomain = domain;
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withWebAppVerification(WebAppBase webApp) {
        this.domainVerifyWebApp = webApp;
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withExistingKeyVault(Vault vault) {
        this.bindingVault = Mono.just(vault);
        return this;
    }

    @Override
    public AppServiceCertificateOrderImpl withNewKeyVault(String vaultName, Region region) {
        this.bindingVault = myManager.keyVaultManager()
            .vaults()
            .define(vaultName)
            .withRegion(region)
            .withExistingResourceGroup(resourceGroupName())
            .defineAccessPolicy()
            .forServicePrincipal("f3c21649-0979-4721-ac85-b0216b2cf413")
            .allowSecretPermissions(SecretPermissions.GET, SecretPermissions.SET, SecretPermissions.DELETE)
            .attach()
            .defineAccessPolicy()
            .forServicePrincipal("abfa0a7c-a6b6-4736-8310-5855508787cd")
            .allowSecretPermissions(SecretPermissions.GET)
            .attach()
            .createAsync();
        return this;
    }
}
