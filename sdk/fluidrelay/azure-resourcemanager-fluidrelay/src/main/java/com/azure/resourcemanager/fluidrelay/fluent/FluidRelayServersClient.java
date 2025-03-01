// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerInner;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerKeysInner;
import com.azure.resourcemanager.fluidrelay.models.FluidRelayServerUpdate;
import com.azure.resourcemanager.fluidrelay.models.RegenerateKeyRequest;

/**
 * An instance of this class provides access to all the operations defined in FluidRelayServersClient.
 */
public interface FluidRelayServersClient {
    /**
     * Get a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fluid Relay server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FluidRelayServerInner> getByResourceGroupWithResponse(String resourceGroup, String fluidRelayServerName,
        Context context);

    /**
     * Get a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fluid Relay server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FluidRelayServerInner getByResourceGroup(String resourceGroup, String fluidRelayServerName);

    /**
     * Create or Update a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param resource The details of the Fluid Relay server resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FluidRelay Server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FluidRelayServerInner> createOrUpdateWithResponse(String resourceGroup, String fluidRelayServerName,
        FluidRelayServerInner resource, Context context);

    /**
     * Create or Update a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param resource The details of the Fluid Relay server resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FluidRelay Server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FluidRelayServerInner createOrUpdate(String resourceGroup, String fluidRelayServerName,
        FluidRelayServerInner resource);

    /**
     * Update a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param resource The details of the Fluid Relay server resource included in update calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FluidRelay Server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FluidRelayServerInner> updateWithResponse(String resourceGroup, String fluidRelayServerName,
        FluidRelayServerUpdate resource, Context context);

    /**
     * Update a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param resource The details of the Fluid Relay server resource included in update calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FluidRelay Server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FluidRelayServerInner update(String resourceGroup, String fluidRelayServerName, FluidRelayServerUpdate resource);

    /**
     * Delete a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroup, String fluidRelayServerName, Context context);

    /**
     * Delete a Fluid Relay server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroup, String fluidRelayServerName);

    /**
     * Regenerate the primary or secondary key for this server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param parameters The details of which keys to generate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FluidRelayServerKeysInner> regenerateKeyWithResponse(String resourceGroup, String fluidRelayServerName,
        RegenerateKeyRequest parameters, Context context);

    /**
     * Regenerate the primary or secondary key for this server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param parameters The details of which keys to generate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of available keys for this server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FluidRelayServerKeysInner regenerateKey(String resourceGroup, String fluidRelayServerName,
        RegenerateKeyRequest parameters);

    /**
     * Get primary and secondary key for this server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return primary and secondary key for this server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FluidRelayServerKeysInner> listKeysWithResponse(String resourceGroup, String fluidRelayServerName,
        Context context);

    /**
     * Get primary and secondary key for this server.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param fluidRelayServerName The Fluid Relay server resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return primary and secondary key for this server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FluidRelayServerKeysInner listKeys(String resourceGroup, String fluidRelayServerName);

    /**
     * List all Fluid Relay servers in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FluidRelayServerInner> list();

    /**
     * List all Fluid Relay servers in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FluidRelayServerInner> list(Context context);

    /**
     * List all Fluid Relay servers in a resource group.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FluidRelayServerInner> listByResourceGroup(String resourceGroup);

    /**
     * List all Fluid Relay servers in a resource group.
     * 
     * @param resourceGroup The resource group containing the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FluidRelayServerInner> listByResourceGroup(String resourceGroup, Context context);
}
