// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.P2SVpnConnectionHealthRequest;
import java.util.Arrays;

/**
 * Samples for P2SVpnGateways GetP2SVpnConnectionHealthDetailed.
 */
public final class P2SVpnGatewaysGetP2SVpnConnectionHealthDetailedSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * P2SVpnGatewayGetConnectionHealthDetailed.json
     */
    /**
     * Sample code: P2SVpnGatewayGetConnectionHealthDetailed.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void p2SVpnGatewayGetConnectionHealthDetailed(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getP2SVpnGateways()
            .getP2SVpnConnectionHealthDetailed("p2s-vpn-gateway-test", "p2svpngateway",
                new P2SVpnConnectionHealthRequest().withVpnUserNamesFilter(Arrays.asList("vpnUser1", "vpnUser2"))
                    .withOutputBlobSasUrl(
                        "https://blobcortextesturl.blob.core.windows.net/folderforconfig/p2sconnectionhealths?sp=rw&se=2018-01-10T03%3A42%3A04Z&sv=2017-04-17&sig=WvXrT5bDmDFfgHs%2Brz%2BjAu123eRCNE9BO0eQYcPDT7pY%3D&sr=b"),
                com.azure.core.util.Context.NONE);
    }
}
