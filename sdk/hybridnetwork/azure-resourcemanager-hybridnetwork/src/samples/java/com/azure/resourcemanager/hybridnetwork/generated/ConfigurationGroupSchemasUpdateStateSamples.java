// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.resourcemanager.hybridnetwork.fluent.models.ConfigurationGroupSchemaVersionUpdateStateInner;
import com.azure.resourcemanager.hybridnetwork.models.VersionState;

/**
 * Samples for ConfigurationGroupSchemas UpdateState.
 */
public final class ConfigurationGroupSchemasUpdateStateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ConfigurationGroupSchemaVersionUpdateState.json
     */
    /**
     * Sample code: Update network service design version state.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        updateNetworkServiceDesignVersionState(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.configurationGroupSchemas()
            .updateState("rg1", "testPublisher", "testConfigurationGroupSchema",
                new ConfigurationGroupSchemaVersionUpdateStateInner().withVersionState(VersionState.ACTIVE),
                com.azure.core.util.Context.NONE);
    }
}
