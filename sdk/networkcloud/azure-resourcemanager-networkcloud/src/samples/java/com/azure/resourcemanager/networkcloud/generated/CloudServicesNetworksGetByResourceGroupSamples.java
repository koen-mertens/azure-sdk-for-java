// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for CloudServicesNetworks GetByResourceGroup. */
public final class CloudServicesNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/CloudServicesNetworks_Get.json
     */
    /**
     * Sample code: Get cloud services network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getCloudServicesNetwork(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .cloudServicesNetworks()
            .getByResourceGroupWithResponse(
                "resourceGroupName", "cloudServicesNetworkName", com.azure.core.util.Context.NONE);
    }
}