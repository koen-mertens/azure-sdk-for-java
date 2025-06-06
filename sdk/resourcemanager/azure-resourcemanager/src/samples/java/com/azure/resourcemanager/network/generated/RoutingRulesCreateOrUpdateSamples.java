// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.RoutingRuleInner;
import com.azure.resourcemanager.network.models.RoutingRuleDestinationType;
import com.azure.resourcemanager.network.models.RoutingRuleNextHop;
import com.azure.resourcemanager.network.models.RoutingRuleNextHopType;
import com.azure.resourcemanager.network.models.RoutingRuleRouteDestination;

/**
 * Samples for RoutingRules CreateOrUpdate.
 */
public final class RoutingRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/NetworkManagerRoutingRulePut.
     * json
     */
    /**
     * Sample code: Create an routing rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAnRoutingRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getRoutingRules()
            .createOrUpdateWithResponse("rg1", "testNetworkManager", "myTestRoutingConfig", "testRuleCollection",
                "SampleRoutingRule",
                new RoutingRuleInner().withDescription("This is Sample Routing Rule")
                    .withDestination(
                        new RoutingRuleRouteDestination().withType(RoutingRuleDestinationType.ADDRESS_PREFIX)
                            .withDestinationAddress("10.0.0.0/16"))
                    .withNextHop(
                        new RoutingRuleNextHop().withNextHopType(RoutingRuleNextHopType.VIRTUAL_NETWORK_GATEWAY)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/NetworkManagerRoutingRulePut.
     * json
     */
    /**
     * Sample code: Create a default routing rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADefaultRoutingRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getRoutingRules()
            .createOrUpdateWithResponse("rg1", "testNetworkManager", "myTestRoutingConfig", "testRuleCollection",
                "SampleRoutingRule",
                new RoutingRuleInner().withDescription("This is Sample Routing Rule")
                    .withDestination(
                        new RoutingRuleRouteDestination().withType(RoutingRuleDestinationType.ADDRESS_PREFIX)
                            .withDestinationAddress("10.0.0.0/16"))
                    .withNextHop(
                        new RoutingRuleNextHop().withNextHopType(RoutingRuleNextHopType.VIRTUAL_NETWORK_GATEWAY)),
                com.azure.core.util.Context.NONE);
    }
}
