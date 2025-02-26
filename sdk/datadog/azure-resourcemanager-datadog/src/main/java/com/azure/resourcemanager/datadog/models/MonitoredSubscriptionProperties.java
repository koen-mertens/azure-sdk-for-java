// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datadog.fluent.models.MonitoredSubscriptionPropertiesInner;

/**
 * An immutable client-side representation of MonitoredSubscriptionProperties.
 */
public interface MonitoredSubscriptionProperties {
    /**
     * Gets the name property: Name of the monitored subscription resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: The id of the monitored subscription resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: The type of the monitored subscription resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The request to update subscriptions needed to be monitored by the Datadog monitor
     * resource.
     * 
     * @return the properties value.
     */
    SubscriptionList properties();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datadog.fluent.models.MonitoredSubscriptionPropertiesInner object.
     * 
     * @return the inner object.
     */
    MonitoredSubscriptionPropertiesInner innerModel();

    /**
     * The entirety of the MonitoredSubscriptionProperties definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The MonitoredSubscriptionProperties definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MonitoredSubscriptionProperties definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the MonitoredSubscriptionProperties definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, monitorName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param monitorName Monitor resource name.
             * @return the next definition stage.
             */
            WithCreate withExistingMonitor(String resourceGroupName, String monitorName);
        }

        /**
         * The stage of the MonitoredSubscriptionProperties definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MonitoredSubscriptionProperties create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MonitoredSubscriptionProperties create(Context context);
        }

        /**
         * The stage of the MonitoredSubscriptionProperties definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The request to update subscriptions needed to be monitored by the
             * Datadog monitor resource..
             * 
             * @param properties The request to update subscriptions needed to be monitored by the Datadog monitor
             * resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(SubscriptionList properties);
        }
    }

    /**
     * Begins update for the MonitoredSubscriptionProperties resource.
     * 
     * @return the stage of resource update.
     */
    MonitoredSubscriptionProperties.Update update();

    /**
     * The template for MonitoredSubscriptionProperties update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MonitoredSubscriptionProperties apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MonitoredSubscriptionProperties apply(Context context);
    }

    /**
     * The MonitoredSubscriptionProperties update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MonitoredSubscriptionProperties update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The request to update subscriptions needed to be monitored by the
             * Datadog monitor resource..
             * 
             * @param properties The request to update subscriptions needed to be monitored by the Datadog monitor
             * resource.
             * @return the next definition stage.
             */
            Update withProperties(SubscriptionList properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MonitoredSubscriptionProperties refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MonitoredSubscriptionProperties refresh(Context context);
}
