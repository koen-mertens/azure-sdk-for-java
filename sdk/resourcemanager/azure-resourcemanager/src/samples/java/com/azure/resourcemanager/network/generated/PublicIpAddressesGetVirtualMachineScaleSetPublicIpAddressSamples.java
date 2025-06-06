// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PublicIpAddresses GetVirtualMachineScaleSetPublicIpAddress.
 */
public final class PublicIpAddressesGetVirtualMachineScaleSetPublicIpAddressSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/VmssPublicIpGet.json
     */
    /**
     * Sample code: GetVMSSPublicIP.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVMSSPublicIP(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .getVirtualMachineScaleSetPublicIpAddressWithResponse("vmss-tester", "vmss1", "1", "nic1", "ip1", "pub1",
                null, com.azure.core.util.Context.NONE);
    }
}
