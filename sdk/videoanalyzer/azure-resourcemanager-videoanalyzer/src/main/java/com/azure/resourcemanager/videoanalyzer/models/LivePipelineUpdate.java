// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.videoanalyzer.fluent.models.LivePipelinePropertiesUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving and publishing
 * of content for a unique RTSP camera.
 */
@Fluent
public final class LivePipelineUpdate extends ProxyResource {
    /*
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private LivePipelinePropertiesUpdate innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The resource properties.
     *
     * @return the innerProperties value.
     */
    private LivePipelinePropertiesUpdate innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the topologyName property: The reference to an existing pipeline topology defined for real-time content
     * processing. When activated, this live pipeline will process content according to the pipeline topology
     * definition.
     *
     * @return the topologyName value.
     */
    public String topologyName() {
        return this.innerProperties() == null ? null : this.innerProperties().topologyName();
    }

    /**
     * Set the topologyName property: The reference to an existing pipeline topology defined for real-time content
     * processing. When activated, this live pipeline will process content according to the pipeline topology
     * definition.
     *
     * @param topologyName the topologyName value to set.
     * @return the LivePipelineUpdate object itself.
     */
    public LivePipelineUpdate withTopologyName(String topologyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LivePipelinePropertiesUpdate();
        }
        this.innerProperties().withTopologyName(topologyName);
        return this;
    }

    /**
     * Get the description property: An optional description for the pipeline.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: An optional description for the pipeline.
     *
     * @param description the description value to set.
     * @return the LivePipelineUpdate object itself.
     */
    public LivePipelineUpdate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LivePipelinePropertiesUpdate();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the bitrateKbps property: Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range
     * is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service
     * will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff),
     * checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one 'noisy
     * neighbor' does not affect other live pipelines in your account.
     *
     * @return the bitrateKbps value.
     */
    public Integer bitrateKbps() {
        return this.innerProperties() == null ? null : this.innerProperties().bitrateKbps();
    }

    /**
     * Set the bitrateKbps property: Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range
     * is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service
     * will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff),
     * checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one 'noisy
     * neighbor' does not affect other live pipelines in your account.
     *
     * @param bitrateKbps the bitrateKbps value to set.
     * @return the LivePipelineUpdate object itself.
     */
    public LivePipelineUpdate withBitrateKbps(Integer bitrateKbps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LivePipelinePropertiesUpdate();
        }
        this.innerProperties().withBitrateKbps(bitrateKbps);
        return this;
    }

    /**
     * Get the state property: Current state of the pipeline (read-only).
     *
     * @return the state value.
     */
    public LivePipelineState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the parameters property: List of the instance level parameter values for the user-defined topology
     * parameters. A pipeline can only define or override parameters values for parameters which have been declared in
     * the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a
     * default value can be optionally be overridden.
     *
     * @return the parameters value.
     */
    public List<ParameterDefinition> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: List of the instance level parameter values for the user-defined topology
     * parameters. A pipeline can only define or override parameters values for parameters which have been declared in
     * the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a
     * default value can be optionally be overridden.
     *
     * @param parameters the parameters value to set.
     * @return the LivePipelineUpdate object itself.
     */
    public LivePipelineUpdate withParameters(List<ParameterDefinition> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LivePipelinePropertiesUpdate();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
