// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for GetPrivateDnsZoneSuffix Execute.
 */
public final class GetPrivateDnsZoneSuffixExecuteSamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/ServiceOperations/stable/2023-12-30/examples/
     * GetPrivateDnsZoneSuffix.json
     */
    /**
     * Sample code: GetPrivateDnsZoneSuffix.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void getPrivateDnsZoneSuffix(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.getPrivateDnsZoneSuffixes().executeWithResponse(com.azure.core.util.Context.NONE);
    }
}
