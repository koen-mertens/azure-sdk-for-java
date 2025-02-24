// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.resourcemanager.costmanagement.fluent.models.DownloadUrlInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of DownloadUrl.
 */
public interface DownloadUrl {
    /**
     * Gets the expiryTime property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     * 
     * @return the expiryTime value.
     */
    OffsetDateTime expiryTime();

    /**
     * Gets the validTill property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     * 
     * @return the validTill value.
     */
    OffsetDateTime validTill();

    /**
     * Gets the downloadUrl property: The URL to download the generated report.
     * 
     * @return the downloadUrl value.
     */
    String downloadUrl();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.fluent.models.DownloadUrlInner object.
     * 
     * @return the inner object.
     */
    DownloadUrlInner innerModel();
}
