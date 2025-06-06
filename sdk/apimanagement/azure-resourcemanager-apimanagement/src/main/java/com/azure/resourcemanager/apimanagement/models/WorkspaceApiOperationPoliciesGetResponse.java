// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;

/**
 * Contains all response data for the get operation.
 */
public final class WorkspaceApiOperationPoliciesGetResponse
    extends ResponseBase<WorkspaceApiOperationPoliciesGetHeaders, PolicyContractInner> {
    /**
     * Creates an instance of WorkspaceApiOperationPoliciesGetResponse.
     * 
     * @param request the request which resulted in this WorkspaceApiOperationPoliciesGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public WorkspaceApiOperationPoliciesGetResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        PolicyContractInner value, WorkspaceApiOperationPoliciesGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public PolicyContractInner getValue() {
        return super.getValue();
    }
}
