// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of maintenances.
 */
@Fluent
public final class MaintenanceListResult {
    /*
     * The list of maintenances in a server.
     */
    @JsonProperty(value = "value")
    private List<MaintenanceInner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of MaintenanceListResult class.
     */
    public MaintenanceListResult() {
    }

    /**
     * Get the value property: The list of maintenances in a server.
     * 
     * @return the value value.
     */
    public List<MaintenanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of maintenances in a server.
     * 
     * @param value the value value to set.
     * @return the MaintenanceListResult object itself.
     */
    public MaintenanceListResult withValue(List<MaintenanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the MaintenanceListResult object itself.
     */
    public MaintenanceListResult withNextLink(String nextLink) {
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
