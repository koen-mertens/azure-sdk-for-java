// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CloudServicesNetworks. */
public interface CloudServicesNetworks {
    /**
     * List cloud services networks in the subscription.
     *
     * <p>Get a list of cloud services networks in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of cloud services networks in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CloudServicesNetwork> list();

    /**
     * List cloud services networks in the subscription.
     *
     * <p>Get a list of cloud services networks in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of cloud services networks in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CloudServicesNetwork> list(Context context);

    /**
     * List cloud services networks in the resource group.
     *
     * <p>Get a list of cloud services networks in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of cloud services networks in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CloudServicesNetwork> listByResourceGroup(String resourceGroupName);

    /**
     * List cloud services networks in the resource group.
     *
     * <p>Get a list of cloud services networks in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of cloud services networks in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CloudServicesNetwork> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the cloud services network.
     *
     * <p>Get properties of the provided cloud services network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudServicesNetworkName The name of the cloud services network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided cloud services network along with {@link Response}.
     */
    Response<CloudServicesNetwork> getByResourceGroupWithResponse(
        String resourceGroupName, String cloudServicesNetworkName, Context context);

    /**
     * Retrieve the cloud services network.
     *
     * <p>Get properties of the provided cloud services network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudServicesNetworkName The name of the cloud services network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided cloud services network.
     */
    CloudServicesNetwork getByResourceGroup(String resourceGroupName, String cloudServicesNetworkName);

    /**
     * Delete the cloud services network.
     *
     * <p>Delete the provided cloud services network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudServicesNetworkName The name of the cloud services network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String cloudServicesNetworkName);

    /**
     * Delete the cloud services network.
     *
     * <p>Delete the provided cloud services network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudServicesNetworkName The name of the cloud services network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudServicesNetworkName, Context context);

    /**
     * Retrieve the cloud services network.
     *
     * <p>Get properties of the provided cloud services network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided cloud services network along with {@link Response}.
     */
    CloudServicesNetwork getById(String id);

    /**
     * Retrieve the cloud services network.
     *
     * <p>Get properties of the provided cloud services network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided cloud services network along with {@link Response}.
     */
    Response<CloudServicesNetwork> getByIdWithResponse(String id, Context context);

    /**
     * Delete the cloud services network.
     *
     * <p>Delete the provided cloud services network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the cloud services network.
     *
     * <p>Delete the provided cloud services network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CloudServicesNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new CloudServicesNetwork definition.
     */
    CloudServicesNetwork.DefinitionStages.Blank define(String name);
}