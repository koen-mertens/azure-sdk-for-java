// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings Gateway properties.
 */
@Fluent
public final class SettingsGatewayProperties {
    /*
     * Associated Gateway Resource Id
     */
    @JsonProperty(value = "gatewayResourceId")
    private String gatewayResourceId;

    /**
     * Creates an instance of SettingsGatewayProperties class.
     */
    public SettingsGatewayProperties() {
    }

    /**
     * Get the gatewayResourceId property: Associated Gateway Resource Id.
     * 
     * @return the gatewayResourceId value.
     */
    public String gatewayResourceId() {
        return this.gatewayResourceId;
    }

    /**
     * Set the gatewayResourceId property: Associated Gateway Resource Id.
     * 
     * @param gatewayResourceId the gatewayResourceId value to set.
     * @return the SettingsGatewayProperties object itself.
     */
    public SettingsGatewayProperties withGatewayResourceId(String gatewayResourceId) {
        this.gatewayResourceId = gatewayResourceId;
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
