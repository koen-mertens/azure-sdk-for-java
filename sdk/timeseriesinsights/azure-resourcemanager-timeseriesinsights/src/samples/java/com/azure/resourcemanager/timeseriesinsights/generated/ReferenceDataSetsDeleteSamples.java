// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

/**
 * Samples for ReferenceDataSets Delete.
 */
public final class ReferenceDataSetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/timeseriesinsights/resource-manager/Microsoft.TimeSeriesInsights/stable/2020-05-15/examples/
     * ReferenceDataSetsDelete.json
     */
    /**
     * Sample code: ReferenceDataSetsDelete.
     * 
     * @param manager Entry point to TimeSeriesInsightsManager.
     */
    public static void
        referenceDataSetsDelete(com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager) {
        manager.referenceDataSets().deleteWithResponse("rg1", "env1", "rds1", com.azure.core.util.Context.NONE);
    }
}
