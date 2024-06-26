// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.fluent.models.MarketplaceGalleryImagesInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MarketplaceGalleryImagesListResult model. */
@Fluent
public final class MarketplaceGalleryImagesListResult {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<MarketplaceGalleryImagesInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of MarketplaceGalleryImagesListResult class. */
    public MarketplaceGalleryImagesListResult() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<MarketplaceGalleryImagesInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the MarketplaceGalleryImagesListResult object itself.
     */
    public MarketplaceGalleryImagesListResult withValue(List<MarketplaceGalleryImagesInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the MarketplaceGalleryImagesListResult object itself.
     */
    public MarketplaceGalleryImagesListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
