// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.powerbidedicated.models.CapacityProvisioningState;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityAdministrators;
import com.azure.resourcemanager.powerbidedicated.models.Mode;
import com.azure.resourcemanager.powerbidedicated.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Dedicated Capacity resource. */
@Fluent
public final class DedicatedCapacityProperties extends DedicatedCapacityMutableProperties {
    /*
     * The current state of PowerBI Dedicated resource. The state is to indicate more states outside of resource
     * provisioning.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /*
     * The current deployment state of PowerBI Dedicated resource. The provisioningState is to indicate states for
     * resource provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CapacityProvisioningState provisioningState;

    /** Creates an instance of DedicatedCapacityProperties class. */
    public DedicatedCapacityProperties() {
    }

    /**
     * Get the state property: The current state of PowerBI Dedicated resource. The state is to indicate more states
     * outside of resource provisioning.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Get the provisioningState property: The current deployment state of PowerBI Dedicated resource. The
     * provisioningState is to indicate states for resource provisioning.
     *
     * @return the provisioningState value.
     */
    public CapacityProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedCapacityProperties withAdministration(DedicatedCapacityAdministrators administration) {
        super.withAdministration(administration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedCapacityProperties withMode(Mode mode) {
        super.withMode(mode);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
