// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the Virtual Instance for SAP state.
 */
public final class SapVirtualInstanceState extends ExpandableStringEnum<SapVirtualInstanceState> {
    /**
     * Static value InfrastructureDeploymentPending for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState INFRASTRUCTURE_DEPLOYMENT_PENDING
        = fromString("InfrastructureDeploymentPending");

    /**
     * Static value InfrastructureDeploymentInProgress for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState INFRASTRUCTURE_DEPLOYMENT_IN_PROGRESS
        = fromString("InfrastructureDeploymentInProgress");

    /**
     * Static value InfrastructureDeploymentFailed for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState INFRASTRUCTURE_DEPLOYMENT_FAILED
        = fromString("InfrastructureDeploymentFailed");

    /**
     * Static value SoftwareInstallationPending for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState SOFTWARE_INSTALLATION_PENDING
        = fromString("SoftwareInstallationPending");

    /**
     * Static value SoftwareInstallationInProgress for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState SOFTWARE_INSTALLATION_IN_PROGRESS
        = fromString("SoftwareInstallationInProgress");

    /**
     * Static value SoftwareInstallationFailed for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState SOFTWARE_INSTALLATION_FAILED = fromString("SoftwareInstallationFailed");

    /**
     * Static value SoftwareDetectionInProgress for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState SOFTWARE_DETECTION_IN_PROGRESS
        = fromString("SoftwareDetectionInProgress");

    /**
     * Static value SoftwareDetectionFailed for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState SOFTWARE_DETECTION_FAILED = fromString("SoftwareDetectionFailed");

    /**
     * Static value DiscoveryPending for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState DISCOVERY_PENDING = fromString("DiscoveryPending");

    /**
     * Static value DiscoveryInProgress for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState DISCOVERY_IN_PROGRESS = fromString("DiscoveryInProgress");

    /**
     * Static value DiscoveryFailed for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState DISCOVERY_FAILED = fromString("DiscoveryFailed");

    /**
     * Static value RegistrationComplete for SapVirtualInstanceState.
     */
    public static final SapVirtualInstanceState REGISTRATION_COMPLETE = fromString("RegistrationComplete");

    /**
     * Creates a new instance of SapVirtualInstanceState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SapVirtualInstanceState() {
    }

    /**
     * Creates or finds a SapVirtualInstanceState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapVirtualInstanceState.
     */
    public static SapVirtualInstanceState fromString(String name) {
        return fromString(name, SapVirtualInstanceState.class);
    }

    /**
     * Gets known SapVirtualInstanceState values.
     * 
     * @return known SapVirtualInstanceState values.
     */
    public static Collection<SapVirtualInstanceState> values() {
        return values(SapVirtualInstanceState.class);
    }
}
