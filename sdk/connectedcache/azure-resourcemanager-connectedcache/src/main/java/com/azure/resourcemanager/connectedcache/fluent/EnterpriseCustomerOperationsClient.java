// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.connectedcache.fluent.models.EnterprisePreviewResourceInner;
import com.azure.resourcemanager.connectedcache.models.ConnectedCachePatchResource;

/**
 * An instance of this class provides access to all the operations defined in EnterpriseCustomerOperationsClient.
 */
public interface EnterpriseCustomerOperationsClient {
    /**
     * Retrieves the properties of a Enterprise customer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnterprisePreviewResourceInner> getByResourceGroupWithResponse(String resourceGroupName,
        String customerResourceName, Context context);

    /**
     * Retrieves the properties of a Enterprise customer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePreviewResourceInner getByResourceGroup(String resourceGroupName, String customerResourceName);

    /**
     * Creates a cacheNodes with the specified create parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EnterprisePreviewResourceInner>, EnterprisePreviewResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customerResourceName, EnterprisePreviewResourceInner resource);

    /**
     * Creates a cacheNodes with the specified create parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EnterprisePreviewResourceInner>, EnterprisePreviewResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customerResourceName, EnterprisePreviewResourceInner resource,
        Context context);

    /**
     * Creates a cacheNodes with the specified create parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePreviewResourceInner createOrUpdate(String resourceGroupName, String customerResourceName,
        EnterprisePreviewResourceInner resource);

    /**
     * Creates a cacheNodes with the specified create parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePreviewResourceInner createOrUpdate(String resourceGroupName, String customerResourceName,
        EnterprisePreviewResourceInner resource, Context context);

    /**
     * updates an existing enterpriseCustomers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnterprisePreviewResourceInner> updateWithResponse(String resourceGroupName, String customerResourceName,
        ConnectedCachePatchResource properties, Context context);

    /**
     * updates an existing enterpriseCustomers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connectedCache Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePreviewResourceInner update(String resourceGroupName, String customerResourceName,
        ConnectedCachePatchResource properties);

    /**
     * Deletes an existing customer Enterprise resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String customerResourceName, Context context);

    /**
     * Deletes an existing customer Enterprise resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String customerResourceName);

    /**
     * Retrieves the properties of all ConnectedCache enterpriseCustomers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterprisePreviewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePreviewResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieves the properties of all ConnectedCache enterpriseCustomers.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterprisePreviewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePreviewResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves the properties of all ConnectedCaches.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterprisePreviewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePreviewResourceInner> list();

    /**
     * Retrieves the properties of all ConnectedCaches.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterprisePreviewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePreviewResourceInner> list(Context context);
}
