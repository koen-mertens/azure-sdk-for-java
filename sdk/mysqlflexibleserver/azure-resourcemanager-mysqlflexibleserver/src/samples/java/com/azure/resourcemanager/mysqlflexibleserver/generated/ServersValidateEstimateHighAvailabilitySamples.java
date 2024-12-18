// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.HighAvailabilityValidationEstimationInner;

/**
 * Samples for Servers ValidateEstimateHighAvailability.
 */
public final class ServersValidateEstimateHighAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/FlexibleServers/stable/2023-12-30/examples/
     * ServerValidateEstimateHighAvailability.json
     */
    /**
     * Sample code: Validate a validation and estimation of high availability.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void validateAValidationAndEstimationOfHighAvailability(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.servers()
            .validateEstimateHighAvailabilityWithResponse("TestGroup", "testserver",
                new HighAvailabilityValidationEstimationInner().withExpectedStandbyAvailabilityZone("1"),
                com.azure.core.util.Context.NONE);
    }
}
