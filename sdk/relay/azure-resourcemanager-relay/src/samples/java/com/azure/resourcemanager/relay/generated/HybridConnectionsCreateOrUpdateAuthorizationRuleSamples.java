// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.resourcemanager.relay.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.relay.models.AccessRights;
import java.util.Arrays;

/**
 * Samples for HybridConnections CreateOrUpdateAuthorizationRule.
 */
public final class HybridConnectionsCreateOrUpdateAuthorizationRuleSamples {
    /*
     * x-ms-original-file:
     * specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/HybridConnection/
     * RelayHybridConnectionAuthorizationRuleCreate.json
     */
    /**
     * Sample code: RelayHybridConnectionAuthorizationRuleCreate.
     * 
     * @param manager Entry point to RelayManager.
     */
    public static void
        relayHybridConnectionAuthorizationRuleCreate(com.azure.resourcemanager.relay.RelayManager manager) {
        manager.hybridConnections()
            .createOrUpdateAuthorizationRuleWithResponse("resourcegroup", "example-RelayNamespace-01",
                "example-Relay-Hybrid-01", "example-RelayAuthRules-01",
                new AuthorizationRuleInner().withRights(Arrays.asList(AccessRights.LISTEN, AccessRights.SEND)),
                com.azure.core.util.Context.NONE);
    }
}
