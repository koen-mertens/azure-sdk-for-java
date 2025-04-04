// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowOptionsInner;
import java.util.List;

/**
 * An immutable client-side representation of MaintenanceWindowOptions.
 */
public interface MaintenanceWindowOptions {
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
     * Gets the isEnabled property: Whether maintenance windows are enabled for the database.
     * 
     * @return the isEnabled value.
     */
    Boolean isEnabled();

    /**
     * Gets the maintenanceWindowCycles property: Available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0,
     * 24*60}.
     * 
     * @return the maintenanceWindowCycles value.
     */
    List<MaintenanceWindowTimeRange> maintenanceWindowCycles();

    /**
     * Gets the minDurationInMinutes property: Minimum duration of maintenance window.
     * 
     * @return the minDurationInMinutes value.
     */
    Integer minDurationInMinutes();

    /**
     * Gets the defaultDurationInMinutes property: Default duration for maintenance window.
     * 
     * @return the defaultDurationInMinutes value.
     */
    Integer defaultDurationInMinutes();

    /**
     * Gets the minCycles property: Minimum number of maintenance windows cycles to be set on the database.
     * 
     * @return the minCycles value.
     */
    Integer minCycles();

    /**
     * Gets the timeGranularityInMinutes property: Time granularity in minutes for maintenance windows.
     * 
     * @return the timeGranularityInMinutes value.
     */
    Integer timeGranularityInMinutes();

    /**
     * Gets the allowMultipleMaintenanceWindowsPerCycle property: Whether we allow multiple maintenance windows per
     * cycle.
     * 
     * @return the allowMultipleMaintenanceWindowsPerCycle value.
     */
    Boolean allowMultipleMaintenanceWindowsPerCycle();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowOptionsInner object.
     * 
     * @return the inner object.
     */
    MaintenanceWindowOptionsInner innerModel();
}
