// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountState;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountStatus;
import com.azure.resourcemanager.datalakestore.models.EncryptionConfig;
import com.azure.resourcemanager.datalakestore.models.EncryptionIdentity;
import com.azure.resourcemanager.datalakestore.models.EncryptionProvisioningState;
import com.azure.resourcemanager.datalakestore.models.EncryptionState;
import com.azure.resourcemanager.datalakestore.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakestore.models.FirewallState;
import com.azure.resourcemanager.datalakestore.models.TierType;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProviderState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** Data Lake Store account information. */
@Fluent
public final class DataLakeStoreAccountInner extends Resource {
    /*
     * The Key Vault encryption identity, if any.
     */
    @JsonProperty(value = "identity", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionIdentity identity;

    /*
     * The Data Lake Store account properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountProperties innerProperties;

    /** Creates an instance of DataLakeStoreAccountInner class. */
    public DataLakeStoreAccountInner() {
    }

    /**
     * Get the identity property: The Key Vault encryption identity, if any.
     *
     * @return the identity value.
     */
    public EncryptionIdentity identity() {
        return this.identity;
    }

    /**
     * Get the innerProperties property: The Data Lake Store account properties.
     *
     * @return the innerProperties value.
     */
    private DataLakeStoreAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeStoreAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeStoreAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the defaultGroup property: The default owner group for all new folders and files created in the Data Lake
     * Store account.
     *
     * @return the defaultGroup value.
     */
    public String defaultGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultGroup();
    }

    /**
     * Get the encryptionConfig property: The Key Vault encryption configuration.
     *
     * @return the encryptionConfig value.
     */
    public EncryptionConfig encryptionConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionConfig();
    }

    /**
     * Get the encryptionState property: The current state of encryption for this Data Lake Store account.
     *
     * @return the encryptionState value.
     */
    public EncryptionState encryptionState() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionState();
    }

    /**
     * Get the encryptionProvisioningState property: The current state of encryption provisioning for this Data Lake
     * Store account.
     *
     * @return the encryptionProvisioningState value.
     */
    public EncryptionProvisioningState encryptionProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionProvisioningState();
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this Data Lake Store account.
     *
     * @return the firewallRules value.
     */
    public List<FirewallRuleInner> firewallRules() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallRules();
    }

    /**
     * Get the virtualNetworkRules property: The list of virtual network rules associated with this Data Lake Store
     * account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRuleInner> virtualNetworkRules() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkRules();
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this Data Lake Store account.
     *
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallState();
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallAllowAzureIps();
    }

    /**
     * Get the trustedIdProviders property: The list of trusted identity providers associated with this Data Lake Store
     * account.
     *
     * @return the trustedIdProviders value.
     */
    public List<TrustedIdProviderInner> trustedIdProviders() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedIdProviders();
    }

    /**
     * Get the trustedIdProviderState property: The current state of the trusted identity provider feature for this Data
     * Lake Store account.
     *
     * @return the trustedIdProviderState value.
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedIdProviderState();
    }

    /**
     * Get the newTier property: The commitment tier to use for next month.
     *
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.innerProperties() == null ? null : this.innerProperties().newTier();
    }

    /**
     * Get the currentTier property: The commitment tier in use for the current month.
     *
     * @return the currentTier value.
     */
    public TierType currentTier() {
        return this.innerProperties() == null ? null : this.innerProperties().currentTier();
    }

    /**
     * Get the accountId property: The unique identifier associated with this Data Lake Store account.
     *
     * @return the accountId value.
     */
    public UUID accountId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountId();
    }

    /**
     * Get the provisioningState property: The provisioning status of the Data Lake Store account.
     *
     * @return the provisioningState value.
     */
    public DataLakeStoreAccountStatus provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the state property: The state of the Data Lake Store account.
     *
     * @return the state value.
     */
    public DataLakeStoreAccountState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the creationTime property: The account creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the lastModifiedTime property: The account last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the endpoint property: The full CName endpoint for this account.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
