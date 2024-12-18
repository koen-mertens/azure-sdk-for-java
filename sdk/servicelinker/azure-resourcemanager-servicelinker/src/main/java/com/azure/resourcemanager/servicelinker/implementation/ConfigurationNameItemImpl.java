// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.implementation;

import com.azure.resourcemanager.servicelinker.fluent.models.ConfigurationNameItemInner;
import com.azure.resourcemanager.servicelinker.models.AuthType;
import com.azure.resourcemanager.servicelinker.models.ClientType;
import com.azure.resourcemanager.servicelinker.models.ConfigurationName;
import com.azure.resourcemanager.servicelinker.models.ConfigurationNameItem;
import com.azure.resourcemanager.servicelinker.models.DaprProperties;
import com.azure.resourcemanager.servicelinker.models.SecretSourceType;
import java.util.Collections;
import java.util.List;

public final class ConfigurationNameItemImpl implements ConfigurationNameItem {
    private ConfigurationNameItemInner innerObject;

    private final com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager;

    ConfigurationNameItemImpl(ConfigurationNameItemInner innerObject,
        com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String targetService() {
        return this.innerModel().targetService();
    }

    public ClientType clientType() {
        return this.innerModel().clientType();
    }

    public AuthType authType() {
        return this.innerModel().authType();
    }

    public SecretSourceType secretType() {
        return this.innerModel().secretType();
    }

    public DaprProperties daprProperties() {
        return this.innerModel().daprProperties();
    }

    public List<ConfigurationName> names() {
        List<ConfigurationName> inner = this.innerModel().names();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ConfigurationNameItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager() {
        return this.serviceManager;
    }
}
