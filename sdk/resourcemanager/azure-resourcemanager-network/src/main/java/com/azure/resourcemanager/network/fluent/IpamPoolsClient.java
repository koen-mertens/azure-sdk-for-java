// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.IpamPoolInner;
import com.azure.resourcemanager.network.fluent.models.PoolAssociationInner;
import com.azure.resourcemanager.network.fluent.models.PoolUsageInner;
import com.azure.resourcemanager.network.models.IpamPoolUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in IpamPoolsClient.
 */
public interface IpamPoolsClient {
    /**
     * Gets list of Pool resources at Network Manager level.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param skipToken Optional skip token.
     * @param skip Optional num entries to skip.
     * @param top Optional num entries to show.
     * @param sortKey Optional key by which to sort.
     * @param sortValue Optional sort value for pagination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Pool resources at Network Manager level as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IpamPoolInner> listAsync(String resourceGroupName, String networkManagerName, String skipToken,
        Integer skip, Integer top, String sortKey, String sortValue);

    /**
     * Gets list of Pool resources at Network Manager level.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Pool resources at Network Manager level as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IpamPoolInner> listAsync(String resourceGroupName, String networkManagerName);

    /**
     * Gets list of Pool resources at Network Manager level.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Pool resources at Network Manager level as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpamPoolInner> list(String resourceGroupName, String networkManagerName);

    /**
     * Gets list of Pool resources at Network Manager level.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param skipToken Optional skip token.
     * @param skip Optional num entries to skip.
     * @param top Optional num entries to show.
     * @param sortKey Optional key by which to sort.
     * @param sortValue Optional sort value for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Pool resources at Network Manager level as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpamPoolInner> list(String resourceGroupName, String networkManagerName, String skipToken,
        Integer skip, Integer top, String sortKey, String sortValue, Context context);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String networkManagerName,
        String poolName, IpamPoolInner body, String ifMatch);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<IpamPoolInner>, IpamPoolInner> beginCreateAsync(String resourceGroupName,
        String networkManagerName, String poolName, IpamPoolInner body, String ifMatch);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<IpamPoolInner>, IpamPoolInner> beginCreateAsync(String resourceGroupName,
        String networkManagerName, String poolName, IpamPoolInner body);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpamPoolInner>, IpamPoolInner> beginCreate(String resourceGroupName,
        String networkManagerName, String poolName, IpamPoolInner body);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpamPoolInner>, IpamPoolInner> beginCreate(String resourceGroupName,
        String networkManagerName, String poolName, IpamPoolInner body, String ifMatch, Context context);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpamPoolInner> createAsync(String resourceGroupName, String networkManagerName, String poolName,
        IpamPoolInner body, String ifMatch);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpamPoolInner> createAsync(String resourceGroupName, String networkManagerName, String poolName,
        IpamPoolInner body);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpamPoolInner create(String resourceGroupName, String networkManagerName, String poolName, IpamPoolInner body);

    /**
     * Creates/Updates the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param body Pool resource object to create/update.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpamPoolInner create(String resourceGroupName, String networkManagerName, String poolName, IpamPoolInner body,
        String ifMatch, Context context);

    /**
     * Updates the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param body Pool resource object to update partially.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IpamPoolInner>> updateWithResponseAsync(String resourceGroupName, String networkManagerName,
        String poolName, String ifMatch, IpamPoolUpdate body);

    /**
     * Updates the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpamPoolInner> updateAsync(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Updates the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param body Pool resource object to update partially.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpamPoolInner> updateWithResponse(String resourceGroupName, String networkManagerName, String poolName,
        String ifMatch, IpamPoolUpdate body, Context context);

    /**
     * Updates the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName IP Address Manager Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of Pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpamPoolInner update(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Gets the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Pool resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IpamPoolInner>> getWithResponseAsync(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * Gets the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Pool resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpamPoolInner> getAsync(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Gets the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Pool resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpamPoolInner> getWithResponse(String resourceGroupName, String networkManagerName, String poolName,
        Context context);

    /**
     * Gets the specific Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpamPoolInner get(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String networkManagerName,
        String poolName, String ifMatch);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkManagerName,
        String poolName, String ifMatch);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName, String poolName,
        String ifMatch, Context context);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkManagerName, String poolName, String ifMatch);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Delete the Pool resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String poolName, String ifMatch, Context context);

    /**
     * Get the Pool Usage.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Pool Usage along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PoolUsageInner>> getPoolUsageWithResponseAsync(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * Get the Pool Usage.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Pool Usage on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PoolUsageInner> getPoolUsageAsync(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * Get the Pool Usage.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Pool Usage along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PoolUsageInner> getPoolUsageWithResponse(String resourceGroupName, String networkManagerName,
        String poolName, Context context);

    /**
     * Get the Pool Usage.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Pool Usage.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolUsageInner getPoolUsage(String resourceGroupName, String networkManagerName, String poolName);

    /**
     * List Associated Resource in the Pool.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of PoolAssociation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PoolAssociationInner> listAssociatedResourcesAsync(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * List Associated Resource in the Pool.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of PoolAssociation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PoolAssociationInner> listAssociatedResources(String resourceGroupName, String networkManagerName,
        String poolName);

    /**
     * List Associated Resource in the Pool.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param poolName Pool resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of PoolAssociation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PoolAssociationInner> listAssociatedResources(String resourceGroupName, String networkManagerName,
        String poolName, Context context);
}
