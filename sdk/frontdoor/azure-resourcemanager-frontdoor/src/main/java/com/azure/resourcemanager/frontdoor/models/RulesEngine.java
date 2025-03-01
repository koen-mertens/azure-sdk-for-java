// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.fluent.models.RulesEngineInner;
import java.util.List;

/**
 * An immutable client-side representation of RulesEngine.
 */
public interface RulesEngine {
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
     * Gets the resourceState property: Resource status.
     * 
     * @return the resourceState value.
     */
    FrontDoorResourceState resourceState();

    /**
     * Gets the rules property: A list of rules that define a particular Rules Engine Configuration.
     * 
     * @return the rules value.
     */
    List<RulesEngineRule> rules();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.frontdoor.fluent.models.RulesEngineInner object.
     * 
     * @return the inner object.
     */
    RulesEngineInner innerModel();

    /**
     * The entirety of the RulesEngine definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The RulesEngine definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the RulesEngine definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the RulesEngine definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, frontDoorName.
             * 
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param frontDoorName Name of the Front Door which is globally unique.
             * @return the next definition stage.
             */
            WithCreate withExistingFrontDoor(String resourceGroupName, String frontDoorName);
        }

        /**
         * The stage of the RulesEngine definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithRules {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            RulesEngine create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RulesEngine create(Context context);
        }

        /**
         * The stage of the RulesEngine definition allowing to specify rules.
         */
        interface WithRules {
            /**
             * Specifies the rules property: A list of rules that define a particular Rules Engine Configuration..
             * 
             * @param rules A list of rules that define a particular Rules Engine Configuration.
             * @return the next definition stage.
             */
            WithCreate withRules(List<RulesEngineRule> rules);
        }
    }

    /**
     * Begins update for the RulesEngine resource.
     * 
     * @return the stage of resource update.
     */
    RulesEngine.Update update();

    /**
     * The template for RulesEngine update.
     */
    interface Update extends UpdateStages.WithRules {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        RulesEngine apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RulesEngine apply(Context context);
    }

    /**
     * The RulesEngine update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the RulesEngine update allowing to specify rules.
         */
        interface WithRules {
            /**
             * Specifies the rules property: A list of rules that define a particular Rules Engine Configuration..
             * 
             * @param rules A list of rules that define a particular Rules Engine Configuration.
             * @return the next definition stage.
             */
            Update withRules(List<RulesEngineRule> rules);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    RulesEngine refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RulesEngine refresh(Context context);
}
