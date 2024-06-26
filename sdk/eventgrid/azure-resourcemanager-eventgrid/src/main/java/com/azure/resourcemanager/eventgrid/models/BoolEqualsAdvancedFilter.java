// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BoolEquals Advanced Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = BoolEqualsAdvancedFilter.class,
    visible = true)
@JsonTypeName("BoolEquals")
@Fluent
public final class BoolEqualsAdvancedFilter extends AdvancedFilter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    @JsonTypeId
    @JsonProperty(value = "operatorType", required = true)
    private AdvancedFilterOperatorType operatorType = AdvancedFilterOperatorType.BOOL_EQUALS;

    /*
     * The boolean filter value.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Creates an instance of BoolEqualsAdvancedFilter class.
     */
    public BoolEqualsAdvancedFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public AdvancedFilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the value property: The boolean filter value.
     * 
     * @return the value value.
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value property: The boolean filter value.
     * 
     * @param value the value value to set.
     * @return the BoolEqualsAdvancedFilter object itself.
     */
    public BoolEqualsAdvancedFilter withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoolEqualsAdvancedFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
