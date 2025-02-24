// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logz.fluent.models.LogzMonitorResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of LogzMonitorResource.
 */
public interface LogzMonitorResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Properties specific to the monitor resource.
     * 
     * @return the properties value.
     */
    MonitorProperties properties();

    /**
     * Gets the identity property: The identity property.
     * 
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.logz.fluent.models.LogzMonitorResourceInner object.
     * 
     * @return the inner object.
     */
    LogzMonitorResourceInner innerModel();

    /**
     * The entirety of the LogzMonitorResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The LogzMonitorResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the LogzMonitorResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the LogzMonitorResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the LogzMonitorResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the LogzMonitorResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithProperties, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            LogzMonitorResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LogzMonitorResource create(Context context);
        }

        /**
         * The stage of the LogzMonitorResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the LogzMonitorResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties specific to the monitor resource..
             * 
             * @param properties Properties specific to the monitor resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(MonitorProperties properties);
        }

        /**
         * The stage of the LogzMonitorResource definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             * 
             * @param identity The identity property.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
    }

    /**
     * Begins update for the LogzMonitorResource resource.
     * 
     * @return the stage of resource update.
     */
    LogzMonitorResource.Update update();

    /**
     * The template for LogzMonitorResource update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        LogzMonitorResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LogzMonitorResource apply(Context context);
    }

    /**
     * The LogzMonitorResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the LogzMonitorResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The new tags of the monitor resource..
             * 
             * @param tags The new tags of the monitor resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the LogzMonitorResource update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The set of properties that can be update in a PATCH request to a
             * monitor resource..
             * 
             * @param properties The set of properties that can be update in a PATCH request to a monitor resource.
             * @return the next definition stage.
             */
            Update withProperties(MonitorUpdateProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    LogzMonitorResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LogzMonitorResource refresh(Context context);

    /**
     * List the resources currently being monitored by the Logz monitor resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources();

    /**
     * List the resources currently being monitored by the Logz monitor resource.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources(Context context);

    /**
     * List the user's roles configured on Logz.io side for the account corresponding to the monitor resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list of user's role for Logz.io account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserRoleResponse> listUserRoles();

    /**
     * List the user's roles configured on Logz.io side for the account corresponding to the monitor resource.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list of user's role for Logz.io account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserRoleResponse> listUserRoles(UserRoleRequest body, Context context);
}
