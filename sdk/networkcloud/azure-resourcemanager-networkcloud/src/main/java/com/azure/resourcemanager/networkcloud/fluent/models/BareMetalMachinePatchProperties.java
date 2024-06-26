// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BareMetalMachinePatchProperties represents the properties of the bare metal machine that can be patched. */
@Fluent
public final class BareMetalMachinePatchProperties {
    /*
     * The details provided by the customer during the creation of rack manifests
     * that allows for custom data to be associated with this machine.
     */
    @JsonProperty(value = "machineDetails")
    private String machineDetails;

    /** Creates an instance of BareMetalMachinePatchProperties class. */
    public BareMetalMachinePatchProperties() {
    }

    /**
     * Get the machineDetails property: The details provided by the customer during the creation of rack manifests that
     * allows for custom data to be associated with this machine.
     *
     * @return the machineDetails value.
     */
    public String machineDetails() {
        return this.machineDetails;
    }

    /**
     * Set the machineDetails property: The details provided by the customer during the creation of rack manifests that
     * allows for custom data to be associated with this machine.
     *
     * @param machineDetails the machineDetails value to set.
     * @return the BareMetalMachinePatchProperties object itself.
     */
    public BareMetalMachinePatchProperties withMachineDetails(String machineDetails) {
        this.machineDetails = machineDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
