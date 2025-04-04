// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Clusters.
 */
public interface Clusters {
    /**
     * Gets a cluster.
     * 
     * Implements cluster GET method.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @param clusterName Name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the cluster along with {@link Response}.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a cluster.
     * 
     * Implements cluster GET method.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @param clusterName Name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the cluster.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes an cluster.
     * 
     * Implements cluster DELETE method.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @param clusterName Name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes an cluster.
     * 
     * Implements cluster DELETE method.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @param clusterName Name of the cluster.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, Boolean force, Context context);

    /**
     * Implements GET clusters in a subscription.
     * 
     * List of clusters in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list();

    /**
     * Implements GET clusters in a subscription.
     * 
     * List of clusters in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list(Context context);

    /**
     * Implements GET clusters in a resource group.
     * 
     * List of clusters in a resource group.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET clusters in a resource group.
     * 
     * List of clusters in a resource group.
     * 
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a cluster.
     * 
     * Implements cluster GET method.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the cluster along with {@link Response}.
     */
    Cluster getById(String id);

    /**
     * Gets a cluster.
     * 
     * Implements cluster GET method.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the cluster along with {@link Response}.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an cluster.
     * 
     * Implements cluster DELETE method.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an cluster.
     * 
     * Implements cluster DELETE method.
     * 
     * @param id the resource ID.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new Cluster resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}
