// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricControllerInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabricControllerPatch;

/**
 * An instance of this class provides access to all the operations defined in NetworkFabricControllersClient.
 */
public interface NetworkFabricControllersClient {
    /**
     * Create Network fabric controller.
     * 
     * Creates a Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFabricControllerInner>, NetworkFabricControllerInner>
        beginCreate(String resourceGroupName, String networkFabricControllerName, NetworkFabricControllerInner body);

    /**
     * Create Network fabric controller.
     * 
     * Creates a Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFabricControllerInner>, NetworkFabricControllerInner> beginCreate(
        String resourceGroupName, String networkFabricControllerName, NetworkFabricControllerInner body,
        Context context);

    /**
     * Create Network fabric controller.
     * 
     * Creates a Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricControllerInner create(String resourceGroupName, String networkFabricControllerName,
        NetworkFabricControllerInner body);

    /**
     * Create Network fabric controller.
     * 
     * Creates a Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricControllerInner create(String resourceGroupName, String networkFabricControllerName,
        NetworkFabricControllerInner body, Context context);

    /**
     * Gets a Network Fabric Controller.
     * 
     * Shows the provisioning status of Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkFabricControllerInner> getByResourceGroupWithResponse(String resourceGroupName,
        String networkFabricControllerName, Context context);

    /**
     * Gets a Network Fabric Controller.
     * 
     * Shows the provisioning status of Network Fabric Controller.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricControllerInner getByResourceGroup(String resourceGroupName, String networkFabricControllerName);

    /**
     * Updates a Network Fabric Controller.
     * 
     * Updates are currently not supported for the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Network Fabric Controller properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFabricControllerInner>, NetworkFabricControllerInner>
        beginUpdate(String resourceGroupName, String networkFabricControllerName, NetworkFabricControllerPatch body);

    /**
     * Updates a Network Fabric Controller.
     * 
     * Updates are currently not supported for the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Network Fabric Controller properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFabricControllerInner>, NetworkFabricControllerInner> beginUpdate(
        String resourceGroupName, String networkFabricControllerName, NetworkFabricControllerPatch body,
        Context context);

    /**
     * Updates a Network Fabric Controller.
     * 
     * Updates are currently not supported for the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Network Fabric Controller properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricControllerInner update(String resourceGroupName, String networkFabricControllerName,
        NetworkFabricControllerPatch body);

    /**
     * Updates a Network Fabric Controller.
     * 
     * Updates are currently not supported for the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param body Network Fabric Controller properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Fabric Controller resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFabricControllerInner update(String resourceGroupName, String networkFabricControllerName,
        NetworkFabricControllerPatch body, Context context);

    /**
     * Deletes a Network Fabric Controller.
     * 
     * Deletes the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkFabricControllerName);

    /**
     * Deletes a Network Fabric Controller.
     * 
     * Deletes the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkFabricControllerName,
        Context context);

    /**
     * Deletes a Network Fabric Controller.
     * 
     * Deletes the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkFabricControllerName);

    /**
     * Deletes a Network Fabric Controller.
     * 
     * Deletes the Network Fabric Controller resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFabricControllerName Name of the Network Fabric Controller.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkFabricControllerName, Context context);

    /**
     * List NetworkFabricControllers by resource group.
     * 
     * Lists all the NetworkFabricControllers thats available in the resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Fabric Controllers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricControllerInner> listByResourceGroup(String resourceGroupName);

    /**
     * List NetworkFabricControllers by resource group.
     * 
     * Lists all the NetworkFabricControllers thats available in the resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Fabric Controllers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricControllerInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List NetworkFabricControllers by subscription.
     * 
     * Lists all the NetworkFabricControllers by subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Fabric Controllers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricControllerInner> list();

    /**
     * List NetworkFabricControllers by subscription.
     * 
     * Lists all the NetworkFabricControllers by subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Fabric Controllers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFabricControllerInner> list(Context context);
}
