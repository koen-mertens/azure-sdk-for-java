// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnServerConfigurations Delete.
 */
public final class VpnServerConfigurationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/VpnServerConfigurationDelete.
     * json
     */
    /**
     * Sample code: VpnServerConfigurationDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnServerConfigurationDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnServerConfigurations()
            .delete("rg1", "vpnServerConfiguration1", com.azure.core.util.Context.NONE);
    }
}
