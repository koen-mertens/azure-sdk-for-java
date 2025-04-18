// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.loganalytics.fluent.WorkspacePurgesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.WorkspacePurgeResponseInner;
import com.azure.resourcemanager.loganalytics.fluent.models.WorkspacePurgeStatusResponseInner;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurgeBody;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurgesPurgeResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkspacePurgesClient.
 */
public final class WorkspacePurgesClientImpl implements WorkspacePurgesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final WorkspacePurgesService service;

    /**
     * The service client containing this operation class.
     */
    private final OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of WorkspacePurgesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    WorkspacePurgesClientImpl(OperationalInsightsManagementClientImpl client) {
        this.service
            = RestProxy.create(WorkspacePurgesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationalInsightsManagementClientWorkspacePurges to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OperationalInsightsM")
    public interface WorkspacePurgesService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/purge")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<WorkspacePurgesPurgeResponse> purge(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("workspaceName") String workspaceName,
            @BodyParam("application/json") WorkspacePurgeBody body, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/operations/{purgeId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkspacePurgeStatusResponseInner>> getPurgeStatus(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("workspaceName") String workspaceName,
            @PathParam("purgeId") String purgeId, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     * 
     * In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the
     * execution of purge requests by sending a single command whose predicate includes all user identities that require
     * purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge
     * request to verify that the results are expected.
     * Log Analytics only supports purge operations required for compliance with GDPR. The Log Analytics product team
     * reserves the right to reject requests for purge operations that are not for the purpose of GDPR compliance. In
     * the event of a dispute, please create a support ticket.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkspacePurgesPurgeResponse> purgeWithResponseAsync(String resourceGroupName, String workspaceName,
        WorkspacePurgeBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.purge(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), workspaceName, body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     * 
     * In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the
     * execution of purge requests by sending a single command whose predicate includes all user identities that require
     * purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge
     * request to verify that the results are expected.
     * Log Analytics only supports purge operations required for compliance with GDPR. The Log Analytics product team
     * reserves the right to reject requests for purge operations that are not for the purpose of GDPR compliance. In
     * the event of a dispute, please create a support ticket.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkspacePurgesPurgeResponse> purgeWithResponseAsync(String resourceGroupName, String workspaceName,
        WorkspacePurgeBody body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.purge(this.client.getEndpoint(), resourceGroupName, apiVersion, this.client.getSubscriptionId(),
            workspaceName, body, accept, context);
    }

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     * 
     * In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the
     * execution of purge requests by sending a single command whose predicate includes all user identities that require
     * purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge
     * request to verify that the results are expected.
     * Log Analytics only supports purge operations required for compliance with GDPR. The Log Analytics product team
     * reserves the right to reject requests for purge operations that are not for the purpose of GDPR compliance. In
     * the event of a dispute, please create a support ticket.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkspacePurgeResponseInner> purgeAsync(String resourceGroupName, String workspaceName,
        WorkspacePurgeBody body) {
        return purgeWithResponseAsync(resourceGroupName, workspaceName, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     * 
     * In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the
     * execution of purge requests by sending a single command whose predicate includes all user identities that require
     * purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge
     * request to verify that the results are expected.
     * Log Analytics only supports purge operations required for compliance with GDPR. The Log Analytics product team
     * reserves the right to reject requests for purge operations that are not for the purpose of GDPR compliance. In
     * the event of a dispute, please create a support ticket.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkspacePurgesPurgeResponse purgeWithResponse(String resourceGroupName, String workspaceName,
        WorkspacePurgeBody body, Context context) {
        return purgeWithResponseAsync(resourceGroupName, workspaceName, body, context).block();
    }

    /**
     * Purges data in an Log Analytics workspace by a set of user-defined filters.
     * 
     * In order to manage system resources, purge requests are throttled at 50 requests per hour. You should batch the
     * execution of purge requests by sending a single command whose predicate includes all user identities that require
     * purging. Use the in operator to specify multiple identities. You should run the query prior to using for a purge
     * request to verify that the results are expected.
     * Log Analytics only supports purge operations required for compliance with GDPR. The Log Analytics product team
     * reserves the right to reject requests for purge operations that are not for the purpose of GDPR compliance. In
     * the event of a dispute, please create a support ticket.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param body Describes the body of a request to purge data in a single table of an Log Analytics Workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing operationId for a specific purge action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkspacePurgeResponseInner purge(String resourceGroupName, String workspaceName, WorkspacePurgeBody body) {
        return purgeWithResponse(resourceGroupName, workspaceName, body, Context.NONE).getValue();
    }

    /**
     * Gets status of an ongoing purge operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkspacePurgeStatusResponseInner>> getPurgeStatusWithResponseAsync(String resourceGroupName,
        String workspaceName, String purgeId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (purgeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter purgeId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getPurgeStatus(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), workspaceName, purgeId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets status of an ongoing purge operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkspacePurgeStatusResponseInner>> getPurgeStatusWithResponseAsync(String resourceGroupName,
        String workspaceName, String purgeId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (purgeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter purgeId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getPurgeStatus(this.client.getEndpoint(), resourceGroupName, apiVersion,
            this.client.getSubscriptionId(), workspaceName, purgeId, accept, context);
    }

    /**
     * Gets status of an ongoing purge operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkspacePurgeStatusResponseInner> getPurgeStatusAsync(String resourceGroupName, String workspaceName,
        String purgeId) {
        return getPurgeStatusWithResponseAsync(resourceGroupName, workspaceName, purgeId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets status of an ongoing purge operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<WorkspacePurgeStatusResponseInner> getPurgeStatusWithResponse(String resourceGroupName,
        String workspaceName, String purgeId, Context context) {
        return getPurgeStatusWithResponseAsync(resourceGroupName, workspaceName, purgeId, context).block();
    }

    /**
     * Gets status of an ongoing purge operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param purgeId In a purge status request, this is the Id of the operation the status of which is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of an ongoing purge operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkspacePurgeStatusResponseInner getPurgeStatus(String resourceGroupName, String workspaceName,
        String purgeId) {
        return getPurgeStatusWithResponse(resourceGroupName, workspaceName, purgeId, Context.NONE).getValue();
    }
}
