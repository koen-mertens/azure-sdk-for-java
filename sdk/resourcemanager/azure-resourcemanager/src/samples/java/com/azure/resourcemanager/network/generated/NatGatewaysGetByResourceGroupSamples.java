// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NatGateways GetByResourceGroup.
 */
public final class NatGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-05-01/examples/NatGatewayGet.json
     */
    /**
     * Sample code: Get nat gateway.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNatGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNatGateways()
            .getByResourceGroupWithResponse("rg1", "test-natGateway", null, com.azure.core.util.Context.NONE);
    }
}
