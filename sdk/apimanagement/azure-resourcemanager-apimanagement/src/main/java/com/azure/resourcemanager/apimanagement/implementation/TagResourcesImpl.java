// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.TagResourcesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.azure.resourcemanager.apimanagement.models.TagResourceContract;
import com.azure.resourcemanager.apimanagement.models.TagResources;

public final class TagResourcesImpl implements TagResources {
    private static final ClientLogger LOGGER = new ClientLogger(TagResourcesImpl.class);

    private final TagResourcesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public TagResourcesImpl(TagResourcesClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TagResourceContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<TagResourceContractInner> inner
            = this.serviceClient().listByService(resourceGroupName, serviceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagResourceContract> listByService(String resourceGroupName, String serviceName, String filter,
        Integer top, Integer skip, Context context) {
        PagedIterable<TagResourceContractInner> inner
            = this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    private TagResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
