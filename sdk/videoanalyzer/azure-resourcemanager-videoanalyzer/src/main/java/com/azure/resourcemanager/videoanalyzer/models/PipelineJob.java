// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.PipelineJobInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of PipelineJob. */
public interface PipelineJob {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the topologyName property: Reference to an existing pipeline topology. When activated, this pipeline job
     * will process content according to the pipeline topology definition.
     *
     * @return the topologyName value.
     */
    String topologyName();

    /**
     * Gets the description property: An optional description for the pipeline.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the state property: Current state of the pipeline (read-only).
     *
     * @return the state value.
     */
    PipelineJobState state();

    /**
     * Gets the expiration property: The date-time by when this pipeline job will be automatically deleted from your
     * account.
     *
     * @return the expiration value.
     */
    OffsetDateTime expiration();

    /**
     * Gets the error property: Details about the error, in case the pipeline job fails.
     *
     * @return the error value.
     */
    PipelineJobError error();

    /**
     * Gets the parameters property: List of the instance level parameter values for the user-defined topology
     * parameters. A pipeline can only define or override parameters values for parameters which have been declared in
     * the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a
     * default value can be optionally be overridden.
     *
     * @return the parameters value.
     */
    List<ParameterDefinition> parameters();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.videoanalyzer.fluent.models.PipelineJobInner object.
     *
     * @return the inner object.
     */
    PipelineJobInner innerModel();

    /** The entirety of the PipelineJob definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The PipelineJob definition stages. */
    interface DefinitionStages {
        /** The first stage of the PipelineJob definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the PipelineJob definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The Azure Video Analyzer account name.
             * @return the next definition stage.
             */
            WithCreate withExistingVideoAnalyzer(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the PipelineJob definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTopologyName, DefinitionStages.WithDescription,
            DefinitionStages.WithParameters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PipelineJob create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PipelineJob create(Context context);
        }

        /** The stage of the PipelineJob definition allowing to specify topologyName. */
        interface WithTopologyName {
            /**
             * Specifies the topologyName property: Reference to an existing pipeline topology. When activated, this
             * pipeline job will process content according to the pipeline topology definition..
             *
             * @param topologyName Reference to an existing pipeline topology. When activated, this pipeline job will
             *     process content according to the pipeline topology definition.
             * @return the next definition stage.
             */
            WithCreate withTopologyName(String topologyName);
        }

        /** The stage of the PipelineJob definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: An optional description for the pipeline..
             *
             * @param description An optional description for the pipeline.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /** The stage of the PipelineJob definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: List of the instance level parameter values for the user-defined
             * topology parameters. A pipeline can only define or override parameters values for parameters which have
             * been declared in the referenced topology. Topology parameters without a default value must be defined.
             * Topology parameters with a default value can be optionally be overridden..
             *
             * @param parameters List of the instance level parameter values for the user-defined topology parameters. A
             *     pipeline can only define or override parameters values for parameters which have been declared in the
             *     referenced topology. Topology parameters without a default value must be defined. Topology parameters
             *     with a default value can be optionally be overridden.
             * @return the next definition stage.
             */
            WithCreate withParameters(List<ParameterDefinition> parameters);
        }
    }

    /**
     * Begins update for the PipelineJob resource.
     *
     * @return the stage of resource update.
     */
    PipelineJob.Update update();

    /** The template for PipelineJob update. */
    interface Update extends UpdateStages.WithTopologyName, UpdateStages.WithDescription, UpdateStages.WithParameters {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PipelineJob apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PipelineJob apply(Context context);
    }

    /** The PipelineJob update stages. */
    interface UpdateStages {
        /** The stage of the PipelineJob update allowing to specify topologyName. */
        interface WithTopologyName {
            /**
             * Specifies the topologyName property: Reference to an existing pipeline topology. When activated, this
             * pipeline job will process content according to the pipeline topology definition..
             *
             * @param topologyName Reference to an existing pipeline topology. When activated, this pipeline job will
             *     process content according to the pipeline topology definition.
             * @return the next definition stage.
             */
            Update withTopologyName(String topologyName);
        }

        /** The stage of the PipelineJob update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: An optional description for the pipeline..
             *
             * @param description An optional description for the pipeline.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /** The stage of the PipelineJob update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: List of the instance level parameter values for the user-defined
             * topology parameters. A pipeline can only define or override parameters values for parameters which have
             * been declared in the referenced topology. Topology parameters without a default value must be defined.
             * Topology parameters with a default value can be optionally be overridden..
             *
             * @param parameters List of the instance level parameter values for the user-defined topology parameters. A
             *     pipeline can only define or override parameters values for parameters which have been declared in the
             *     referenced topology. Topology parameters without a default value must be defined. Topology parameters
             *     with a default value can be optionally be overridden.
             * @return the next definition stage.
             */
            Update withParameters(List<ParameterDefinition> parameters);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PipelineJob refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PipelineJob refresh(Context context);

    /**
     * Cancels a pipeline job with the given name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel();

    /**
     * Cancels a pipeline job with the given name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(Context context);
}
