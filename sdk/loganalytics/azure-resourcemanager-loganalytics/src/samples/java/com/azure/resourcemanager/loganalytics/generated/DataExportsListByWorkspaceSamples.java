// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

/**
 * Samples for DataExports ListByWorkspace.
 */
public final class DataExportsListByWorkspaceSamples {
    /*
     * x-ms-original-file:
     * specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/
     * DataExportListByWorkspace.json
     */
    /**
     * Sample code: DataExportGet.
     * 
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void dataExportGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.dataExports().listByWorkspace("RgTest1", "DeWnTest1234", com.azure.core.util.Context.NONE);
    }
}
