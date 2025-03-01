// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

/**
 * Samples for Catalogs GetByResourceGroup.
 */
public final class CatalogsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sphere/resource-manager/Microsoft.AzureSphere/stable/2024-04-01/examples/GetCatalog.json
     */
    /**
     * Sample code: Catalogs_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .getByResourceGroupWithResponse("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
