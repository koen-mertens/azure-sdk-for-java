// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.models.BillingResources;
import com.azure.resourcemanager.hdinsight.models.VmSizeCompatibilityFilterV2;
import com.azure.resourcemanager.hdinsight.models.VmSizeProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response for the operation to get regional billingSpecs for a subscription. */
@Fluent
public final class BillingResponseListResultInner {
    /*
     * The virtual machine sizes to include or exclude.
     */
    @JsonProperty(value = "vmSizes")
    private List<String> vmSizes;

    /*
     * The vm sizes which enable encryption at host.
     */
    @JsonProperty(value = "vmSizesWithEncryptionAtHost")
    private List<String> vmSizesWithEncryptionAtHost;

    /*
     * The virtual machine filtering mode. Effectively this can enabling or disabling the virtual machine sizes in a
     * particular set.
     */
    @JsonProperty(value = "vmSizeFilters")
    private List<VmSizeCompatibilityFilterV2> vmSizeFilters;

    /*
     * The vm size properties.
     */
    @JsonProperty(value = "vmSizeProperties", access = JsonProperty.Access.WRITE_ONLY)
    private List<VmSizeProperty> vmSizeProperties;

    /*
     * The billing and managed disk billing resources for a region.
     */
    @JsonProperty(value = "billingResources")
    private List<BillingResources> billingResources;

    /** Creates an instance of BillingResponseListResultInner class. */
    public BillingResponseListResultInner() {
    }

    /**
     * Get the vmSizes property: The virtual machine sizes to include or exclude.
     *
     * @return the vmSizes value.
     */
    public List<String> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: The virtual machine sizes to include or exclude.
     *
     * @param vmSizes the vmSizes value to set.
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withVmSizes(List<String> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Get the vmSizesWithEncryptionAtHost property: The vm sizes which enable encryption at host.
     *
     * @return the vmSizesWithEncryptionAtHost value.
     */
    public List<String> vmSizesWithEncryptionAtHost() {
        return this.vmSizesWithEncryptionAtHost;
    }

    /**
     * Set the vmSizesWithEncryptionAtHost property: The vm sizes which enable encryption at host.
     *
     * @param vmSizesWithEncryptionAtHost the vmSizesWithEncryptionAtHost value to set.
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withVmSizesWithEncryptionAtHost(List<String> vmSizesWithEncryptionAtHost) {
        this.vmSizesWithEncryptionAtHost = vmSizesWithEncryptionAtHost;
        return this;
    }

    /**
     * Get the vmSizeFilters property: The virtual machine filtering mode. Effectively this can enabling or disabling
     * the virtual machine sizes in a particular set.
     *
     * @return the vmSizeFilters value.
     */
    public List<VmSizeCompatibilityFilterV2> vmSizeFilters() {
        return this.vmSizeFilters;
    }

    /**
     * Set the vmSizeFilters property: The virtual machine filtering mode. Effectively this can enabling or disabling
     * the virtual machine sizes in a particular set.
     *
     * @param vmSizeFilters the vmSizeFilters value to set.
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withVmSizeFilters(List<VmSizeCompatibilityFilterV2> vmSizeFilters) {
        this.vmSizeFilters = vmSizeFilters;
        return this;
    }

    /**
     * Get the vmSizeProperties property: The vm size properties.
     *
     * @return the vmSizeProperties value.
     */
    public List<VmSizeProperty> vmSizeProperties() {
        return this.vmSizeProperties;
    }

    /**
     * Get the billingResources property: The billing and managed disk billing resources for a region.
     *
     * @return the billingResources value.
     */
    public List<BillingResources> billingResources() {
        return this.billingResources;
    }

    /**
     * Set the billingResources property: The billing and managed disk billing resources for a region.
     *
     * @param billingResources the billingResources value to set.
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withBillingResources(List<BillingResources> billingResources) {
        this.billingResources = billingResources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSizeFilters() != null) {
            vmSizeFilters().forEach(e -> e.validate());
        }
        if (vmSizeProperties() != null) {
            vmSizeProperties().forEach(e -> e.validate());
        }
        if (billingResources() != null) {
            billingResources().forEach(e -> e.validate());
        }
    }
}
