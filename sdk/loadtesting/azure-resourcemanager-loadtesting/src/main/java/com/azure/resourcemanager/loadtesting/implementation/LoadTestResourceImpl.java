// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loadtesting.fluent.models.LoadTestResourceInner;
import com.azure.resourcemanager.loadtesting.models.EncryptionProperties;
import com.azure.resourcemanager.loadtesting.models.LoadTestResource;
import com.azure.resourcemanager.loadtesting.models.LoadTestResourcePatchRequestBody;
import com.azure.resourcemanager.loadtesting.models.ManagedServiceIdentity;
import com.azure.resourcemanager.loadtesting.models.ResourceState;
import java.util.Collections;
import java.util.Map;

public final class LoadTestResourceImpl
    implements LoadTestResource, LoadTestResource.Definition, LoadTestResource.Update {
    private LoadTestResourceInner innerObject;

    private final com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public ResourceState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String dataPlaneUri() {
        return this.innerModel().dataPlaneUri();
    }

    public EncryptionProperties encryption() {
        return this.innerModel().encryption();
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

    public LoadTestResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loadtesting.LoadTestManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String loadTestName;

    private LoadTestResourcePatchRequestBody updateProperties;

    public LoadTestResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public LoadTestResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .createOrUpdate(resourceGroupName, loadTestName, this.innerModel(), Context.NONE);
        return this;
    }

    public LoadTestResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .createOrUpdate(resourceGroupName, loadTestName, this.innerModel(), context);
        return this;
    }

    LoadTestResourceImpl(String name, com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager) {
        this.innerObject = new LoadTestResourceInner();
        this.serviceManager = serviceManager;
        this.loadTestName = name;
    }

    public LoadTestResourceImpl update() {
        this.updateProperties = new LoadTestResourcePatchRequestBody();
        return this;
    }

    public LoadTestResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .update(resourceGroupName, loadTestName, updateProperties, Context.NONE);
        return this;
    }

    public LoadTestResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .update(resourceGroupName, loadTestName, updateProperties, context);
        return this;
    }

    LoadTestResourceImpl(LoadTestResourceInner innerObject,
        com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.loadTestName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "loadTests");
    }

    public LoadTestResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .getByResourceGroupWithResponse(resourceGroupName, loadTestName, Context.NONE)
            .getValue();
        return this;
    }

    public LoadTestResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLoadTests()
            .getByResourceGroupWithResponse(resourceGroupName, loadTestName, context)
            .getValue();
        return this;
    }

    public LoadTestResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LoadTestResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LoadTestResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public LoadTestResourceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateProperties.withIdentity(identity);
            return this;
        }
    }

    public LoadTestResourceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateProperties.withDescription(description);
            return this;
        }
    }

    public LoadTestResourceImpl withEncryption(EncryptionProperties encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateProperties.withEncryption(encryption);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
