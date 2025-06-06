// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.HostModelInner;

/**
 * An instance of this class provides access to all the operations defined in HostsClient.
 */
public interface HostsClient {
    /**
     * List Host resources by Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Host list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HostModelInner> list(String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * List Host resources by Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Host list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HostModelInner> list(String resourceGroupName, String privateCloudName, String clusterName,
        Context context);

    /**
     * Get a Host.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster.
     * @param hostId The host identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Host along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HostModelInner> getWithResponse(String resourceGroupName, String privateCloudName, String clusterName,
        String hostId, Context context);

    /**
     * Get a Host.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster.
     * @param hostId The host identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HostModelInner get(String resourceGroupName, String privateCloudName, String clusterName, String hostId);
}
