// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

/**
 * Samples for PrivateLinkResourceOperations Get.
 */
public final class PrivateLinkResourceOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * PrivateLinkResourceOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateLinkResourceOperations_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void privateLinkResourceOperationsGetMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.privateLinkResourceOperations()
            .getWithResponse("sakanwar", "sakanwar1204project", "Default", com.azure.core.util.Context.NONE);
    }
}
