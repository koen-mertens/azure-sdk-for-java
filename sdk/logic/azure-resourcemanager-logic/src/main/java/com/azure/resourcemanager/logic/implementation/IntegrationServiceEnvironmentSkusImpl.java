// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentSkusClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSkuDefinitionInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuDefinition;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkus;

public final class IntegrationServiceEnvironmentSkusImpl implements IntegrationServiceEnvironmentSkus {
    private static final ClientLogger LOGGER = new ClientLogger(IntegrationServiceEnvironmentSkusImpl.class);

    private final IntegrationServiceEnvironmentSkusClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public IntegrationServiceEnvironmentSkusImpl(IntegrationServiceEnvironmentSkusClient innerClient,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IntegrationServiceEnvironmentSkuDefinition> list(String resourceGroup,
        String integrationServiceEnvironmentName) {
        PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> inner
            = this.serviceClient().list(resourceGroup, integrationServiceEnvironmentName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationServiceEnvironmentSkuDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<IntegrationServiceEnvironmentSkuDefinition> list(String resourceGroup,
        String integrationServiceEnvironmentName, Context context) {
        PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> inner
            = this.serviceClient().list(resourceGroup, integrationServiceEnvironmentName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new IntegrationServiceEnvironmentSkuDefinitionImpl(inner1, this.manager()));
    }

    private IntegrationServiceEnvironmentSkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
