// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties model for replication eligibility results API.
 */
@Fluent
public final class ReplicationEligibilityResultsProperties {
    /*
     * The client request Id.
     */
    @JsonProperty(value = "clientRequestId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientRequestId;

    /*
     * The error details.
     */
    @JsonProperty(value = "errors")
    private List<ReplicationEligibilityResultsErrorInfo> errors;

    /**
     * Creates an instance of ReplicationEligibilityResultsProperties class.
     */
    public ReplicationEligibilityResultsProperties() {
    }

    /**
     * Get the clientRequestId property: The client request Id.
     * 
     * @return the clientRequestId value.
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Get the errors property: The error details.
     * 
     * @return the errors value.
     */
    public List<ReplicationEligibilityResultsErrorInfo> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The error details.
     * 
     * @param errors the errors value to set.
     * @return the ReplicationEligibilityResultsProperties object itself.
     */
    public ReplicationEligibilityResultsProperties withErrors(List<ReplicationEligibilityResultsErrorInfo> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
