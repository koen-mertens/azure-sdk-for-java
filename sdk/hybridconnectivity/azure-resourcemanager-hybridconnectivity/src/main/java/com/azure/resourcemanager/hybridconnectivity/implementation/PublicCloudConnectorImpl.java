// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.PublicCloudConnectorInner;
import com.azure.resourcemanager.hybridconnectivity.models.OperationStatusResult;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnector;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnectorProperties;
import java.util.Collections;
import java.util.Map;

public final class PublicCloudConnectorImpl
    implements PublicCloudConnector, PublicCloudConnector.Definition, PublicCloudConnector.Update {
    private PublicCloudConnectorInner innerObject;

    private final com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PublicCloudConnectorProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PublicCloudConnectorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String publicCloudConnector;

    public PublicCloudConnectorImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PublicCloudConnector create() {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .createOrUpdate(resourceGroupName, publicCloudConnector, this.innerModel(), Context.NONE);
        return this;
    }

    public PublicCloudConnector create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .createOrUpdate(resourceGroupName, publicCloudConnector, this.innerModel(), context);
        return this;
    }

    PublicCloudConnectorImpl(String name,
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager serviceManager) {
        this.innerObject = new PublicCloudConnectorInner();
        this.serviceManager = serviceManager;
        this.publicCloudConnector = name;
    }

    public PublicCloudConnectorImpl update() {
        return this;
    }

    public PublicCloudConnector apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .updateWithResponse(resourceGroupName, publicCloudConnector, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public PublicCloudConnector apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .updateWithResponse(resourceGroupName, publicCloudConnector, this.innerModel(), context)
            .getValue();
        return this;
    }

    PublicCloudConnectorImpl(PublicCloudConnectorInner innerObject,
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.publicCloudConnector
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "publicCloudConnectors");
    }

    public PublicCloudConnector refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .getByResourceGroupWithResponse(resourceGroupName, publicCloudConnector, Context.NONE)
            .getValue();
        return this;
    }

    public PublicCloudConnector refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPublicCloudConnectors()
            .getByResourceGroupWithResponse(resourceGroupName, publicCloudConnector, context)
            .getValue();
        return this;
    }

    public OperationStatusResult testPermissions() {
        return serviceManager.publicCloudConnectors().testPermissions(resourceGroupName, publicCloudConnector);
    }

    public OperationStatusResult testPermissions(Context context) {
        return serviceManager.publicCloudConnectors().testPermissions(resourceGroupName, publicCloudConnector, context);
    }

    public PublicCloudConnectorImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PublicCloudConnectorImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PublicCloudConnectorImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PublicCloudConnectorImpl withProperties(PublicCloudConnectorProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
