// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The DocumentModelsBuildModelHeaders model.
 */
@Fluent
public final class DocumentModelsBuildModelHeaders {
    /*
     * The Operation-Location property.
     */
    @Generated
    private String operationLocation;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of DocumentModelsBuildModelHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public DocumentModelsBuildModelHeaders(HttpHeaders rawHeaders) {
        this.operationLocation = rawHeaders.getValue(HttpHeaderName.OPERATION_LOCATION);
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     * 
     * @return the operationLocation value.
     */
    @Generated
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     * 
     * @param operationLocation the operationLocation value to set.
     * @return the DocumentModelsBuildModelHeaders object itself.
     */
    @Generated
    public DocumentModelsBuildModelHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}
