// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.PacketCaptureInner;
import com.azure.resourcemanager.network.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.models.PcProtocol;
import java.util.Arrays;

/**
 * Samples for PacketCaptures Create.
 */
public final class PacketCapturesCreateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkWatcherPacketCaptureCreate.json
     */
    /**
     * Sample code: Create packet capture.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPacketCapture(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPacketCaptures()
            .create("rg1", "nw1", "pc1", new PacketCaptureInner()
                .withTarget("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1")
                .withBytesToCapturePerPacket(10000L)
                .withTotalBytesPerSession(100000L)
                .withTimeLimitInSeconds(100)
                .withStorageLocation(new PacketCaptureStorageLocation()
                    .withStorageId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Storage/storageAccounts/pcstore")
                    .withStoragePath("https://mytestaccountname.blob.core.windows.net/capture/pc1.cap")
                    .withFilePath("D:\\capture\\pc1.cap"))
                .withFilters(Arrays.asList(new PacketCaptureFilter().withProtocol(PcProtocol.TCP)
                    .withLocalIpAddress("10.0.0.4")
                    .withLocalPort("80"))),
                com.azure.core.util.Context.NONE);
    }
}
