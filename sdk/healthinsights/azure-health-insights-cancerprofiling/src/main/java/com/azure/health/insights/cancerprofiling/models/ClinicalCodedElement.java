// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.cancerprofiling.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A piece of clinical information, expressed as a code in a clinical coding system. */
@Fluent
public final class ClinicalCodedElement {
    /*
     * The clinical coding system, e.g. ICD-10, SNOMED-CT, UMLS.
     */
    @JsonProperty(value = "system", required = true)
    private String system;

    /*
     * The code within the given clinical coding system.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The name of this coded concept in the coding system.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A value associated with the code within the given clinical coding system.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of ClinicalCodedElement class.
     *
     * @param system the system value to set.
     * @param code the code value to set.
     */
    @JsonCreator
    public ClinicalCodedElement(
            @JsonProperty(value = "system", required = true) String system,
            @JsonProperty(value = "code", required = true) String code) {
        this.system = system;
        this.code = code;
    }

    /**
     * Get the system property: The clinical coding system, e.g. ICD-10, SNOMED-CT, UMLS.
     *
     * @return the system value.
     */
    public String getSystem() {
        return this.system;
    }

    /**
     * Get the code property: The code within the given clinical coding system.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the name property: The name of this coded concept in the coding system.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this coded concept in the coding system.
     *
     * @param name the name value to set.
     * @return the ClinicalCodedElement object itself.
     */
    public ClinicalCodedElement setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: A value associated with the code within the given clinical coding system.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: A value associated with the code within the given clinical coding system.
     *
     * @param value the value value to set.
     * @return the ClinicalCodedElement object itself.
     */
    public ClinicalCodedElement setValue(String value) {
        this.value = value;
        return this;
    }
}
