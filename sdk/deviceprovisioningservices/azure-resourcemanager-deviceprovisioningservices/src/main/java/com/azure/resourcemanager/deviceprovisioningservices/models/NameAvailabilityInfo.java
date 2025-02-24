// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.NameAvailabilityInfoInner;

/**
 * An immutable client-side representation of NameAvailabilityInfo.
 */
public interface NameAvailabilityInfo {
    /**
     * Gets the nameAvailable property: specifies if a name is available or not.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: specifies the reason a name is unavailable.
     * 
     * @return the reason value.
     */
    NameUnavailabilityReason reason();

    /**
     * Gets the message property: message containing a detailed reason name is unavailable.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.deviceprovisioningservices.fluent.models.NameAvailabilityInfoInner
     * object.
     * 
     * @return the inner object.
     */
    NameAvailabilityInfoInner innerModel();
}
