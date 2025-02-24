// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/**
 * Samples for Updates ListParent.
 */
public final class UpdatesListParentSamples {
    /*
     * x-ms-original-file:
     * specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/
     * Updates_ListParent.json
     */
    /**
     * Sample code: Updates_ListParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void updatesListParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.updates()
            .listParent("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1", "virtualMachines", "1",
                com.azure.core.util.Context.NONE);
    }
}
