// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for StaticSites GetBuildDatabaseConnectionWithDetails. */
public final class StaticSitesGetBuildDatabaseConnectionWithDetailsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetStaticSiteBuildDatabaseConnectionWithDetails.json
     */
    /**
     * Sample code: Get details of database connections for the static site build.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDetailsOfDatabaseConnectionsForTheStaticSiteBuild(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .getBuildDatabaseConnectionWithDetailsWithResponse(
                "rg", "testStaticSite0", "default", "default", com.azure.core.util.Context.NONE);
    }
}