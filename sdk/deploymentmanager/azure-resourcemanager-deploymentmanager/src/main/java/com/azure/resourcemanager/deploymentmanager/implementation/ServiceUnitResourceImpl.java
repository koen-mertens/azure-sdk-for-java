// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceUnitResourceInner;
import com.azure.resourcemanager.deploymentmanager.models.DeploymentMode;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitArtifacts;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitResource;
import java.util.Collections;
import java.util.Map;

public final class ServiceUnitResourceImpl
    implements ServiceUnitResource, ServiceUnitResource.Definition, ServiceUnitResource.Update {
    private ServiceUnitResourceInner innerObject;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

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

    public String targetResourceGroup() {
        return this.innerModel().targetResourceGroup();
    }

    public DeploymentMode deploymentMode() {
        return this.innerModel().deploymentMode();
    }

    public ServiceUnitArtifacts artifacts() {
        return this.innerModel().artifacts();
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

    public ServiceUnitResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceTopologyName;

    private String serviceName;

    private String serviceUnitName;

    public ServiceUnitResourceImpl withExistingService(String resourceGroupName, String serviceTopologyName,
        String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceTopologyName = serviceTopologyName;
        this.serviceName = serviceName;
        return this;
    }

    public ServiceUnitResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .createOrUpdate(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public ServiceUnitResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .createOrUpdate(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, this.innerModel(),
                context);
        return this;
    }

    ServiceUnitResourceImpl(String name, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = new ServiceUnitResourceInner();
        this.serviceManager = serviceManager;
        this.serviceUnitName = name;
    }

    public ServiceUnitResourceImpl update() {
        return this;
    }

    public ServiceUnitResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .createOrUpdate(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public ServiceUnitResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .createOrUpdate(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, this.innerModel(),
                context);
        return this;
    }

    ServiceUnitResourceImpl(ServiceUnitResourceInner innerObject,
        com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceTopologyName = Utils.getValueFromIdByName(innerObject.id(), "serviceTopologies");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
        this.serviceUnitName = Utils.getValueFromIdByName(innerObject.id(), "serviceUnits");
    }

    public ServiceUnitResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, Context.NONE)
            .getValue();
        return this;
    }

    public ServiceUnitResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServiceUnits()
            .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, context)
            .getValue();
        return this;
    }

    public ServiceUnitResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceUnitResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceUnitResourceImpl withTargetResourceGroup(String targetResourceGroup) {
        this.innerModel().withTargetResourceGroup(targetResourceGroup);
        return this;
    }

    public ServiceUnitResourceImpl withDeploymentMode(DeploymentMode deploymentMode) {
        this.innerModel().withDeploymentMode(deploymentMode);
        return this;
    }

    public ServiceUnitResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ServiceUnitResourceImpl withArtifacts(ServiceUnitArtifacts artifacts) {
        this.innerModel().withArtifacts(artifacts);
        return this;
    }
}
