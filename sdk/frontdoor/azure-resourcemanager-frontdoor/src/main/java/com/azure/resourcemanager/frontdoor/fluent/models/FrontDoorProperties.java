// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.models.BackendPool;
import com.azure.resourcemanager.frontdoor.models.BackendPoolsSettings;
import com.azure.resourcemanager.frontdoor.models.FrontDoorEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorUpdateParameters;
import com.azure.resourcemanager.frontdoor.models.HealthProbeSettingsModel;
import com.azure.resourcemanager.frontdoor.models.LoadBalancingSettingsModel;
import com.azure.resourcemanager.frontdoor.models.RoutingRule;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The JSON object that contains the properties required to create an endpoint.
 */
@Fluent
public final class FrontDoorProperties extends FrontDoorUpdateParameters {
    /*
     * Resource status of the Front Door.
     */
    private FrontDoorResourceState resourceState;

    /*
     * Provisioning state of the Front Door.
     */
    private String provisioningState;

    /*
     * The host that each frontendEndpoint must CNAME to.
     */
    private String cname;

    /*
     * The Id of the frontdoor.
     */
    private String frontdoorId;

    /*
     * Rules Engine Configurations available to routing rules.
     */
    private List<RulesEngineInner> rulesEngines;

    /*
     * Key-Value pair representing additional properties for frontdoor.
     */
    private Map<String, String> extendedProperties;

    /**
     * Creates an instance of FrontDoorProperties class.
     */
    public FrontDoorProperties() {
    }

    /**
     * Get the resourceState property: Resource status of the Front Door.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Front Door.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the cname property: The host that each frontendEndpoint must CNAME to.
     * 
     * @return the cname value.
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Get the frontdoorId property: The Id of the frontdoor.
     * 
     * @return the frontdoorId value.
     */
    public String frontdoorId() {
        return this.frontdoorId;
    }

    /**
     * Get the rulesEngines property: Rules Engine Configurations available to routing rules.
     * 
     * @return the rulesEngines value.
     */
    public List<RulesEngineInner> rulesEngines() {
        return this.rulesEngines;
    }

    /**
     * Get the extendedProperties property: Key-Value pair representing additional properties for frontdoor.
     * 
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withRoutingRules(List<RoutingRule> routingRules) {
        super.withRoutingRules(routingRules);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withLoadBalancingSettings(List<LoadBalancingSettingsModel> loadBalancingSettings) {
        super.withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withHealthProbeSettings(List<HealthProbeSettingsModel> healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withBackendPools(List<BackendPool> backendPools) {
        super.withBackendPools(backendPools);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withFrontendEndpoints(List<FrontendEndpointInner> frontendEndpoints) {
        super.withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withBackendPoolsSettings(BackendPoolsSettings backendPoolsSettings) {
        super.withBackendPoolsSettings(backendPoolsSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontDoorProperties withEnabledState(FrontDoorEnabledState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (rulesEngines() != null) {
            rulesEngines().forEach(e -> e.validate());
        }
        if (routingRules() != null) {
            routingRules().forEach(e -> e.validate());
        }
        if (loadBalancingSettings() != null) {
            loadBalancingSettings().forEach(e -> e.validate());
        }
        if (healthProbeSettings() != null) {
            healthProbeSettings().forEach(e -> e.validate());
        }
        if (backendPools() != null) {
            backendPools().forEach(e -> e.validate());
        }
        if (frontendEndpoints() != null) {
            frontendEndpoints().forEach(e -> e.validate());
        }
        if (backendPoolsSettings() != null) {
            backendPoolsSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("friendlyName", friendlyName());
        jsonWriter.writeArrayField("routingRules", routingRules(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("loadBalancingSettings", loadBalancingSettings(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("healthProbeSettings", healthProbeSettings(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("backendPools", backendPools(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("frontendEndpoints", frontendEndpoints(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("backendPoolsSettings", backendPoolsSettings());
        jsonWriter.writeStringField("enabledState", enabledState() == null ? null : enabledState().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FrontDoorProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FrontDoorProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FrontDoorProperties.
     */
    public static FrontDoorProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FrontDoorProperties deserializedFrontDoorProperties = new FrontDoorProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("friendlyName".equals(fieldName)) {
                    deserializedFrontDoorProperties.withFriendlyName(reader.getString());
                } else if ("routingRules".equals(fieldName)) {
                    List<RoutingRule> routingRules = reader.readArray(reader1 -> RoutingRule.fromJson(reader1));
                    deserializedFrontDoorProperties.withRoutingRules(routingRules);
                } else if ("loadBalancingSettings".equals(fieldName)) {
                    List<LoadBalancingSettingsModel> loadBalancingSettings
                        = reader.readArray(reader1 -> LoadBalancingSettingsModel.fromJson(reader1));
                    deserializedFrontDoorProperties.withLoadBalancingSettings(loadBalancingSettings);
                } else if ("healthProbeSettings".equals(fieldName)) {
                    List<HealthProbeSettingsModel> healthProbeSettings
                        = reader.readArray(reader1 -> HealthProbeSettingsModel.fromJson(reader1));
                    deserializedFrontDoorProperties.withHealthProbeSettings(healthProbeSettings);
                } else if ("backendPools".equals(fieldName)) {
                    List<BackendPool> backendPools = reader.readArray(reader1 -> BackendPool.fromJson(reader1));
                    deserializedFrontDoorProperties.withBackendPools(backendPools);
                } else if ("frontendEndpoints".equals(fieldName)) {
                    List<FrontendEndpointInner> frontendEndpoints
                        = reader.readArray(reader1 -> FrontendEndpointInner.fromJson(reader1));
                    deserializedFrontDoorProperties.withFrontendEndpoints(frontendEndpoints);
                } else if ("backendPoolsSettings".equals(fieldName)) {
                    deserializedFrontDoorProperties.withBackendPoolsSettings(BackendPoolsSettings.fromJson(reader));
                } else if ("enabledState".equals(fieldName)) {
                    deserializedFrontDoorProperties
                        .withEnabledState(FrontDoorEnabledState.fromString(reader.getString()));
                } else if ("resourceState".equals(fieldName)) {
                    deserializedFrontDoorProperties.resourceState
                        = FrontDoorResourceState.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedFrontDoorProperties.provisioningState = reader.getString();
                } else if ("cname".equals(fieldName)) {
                    deserializedFrontDoorProperties.cname = reader.getString();
                } else if ("frontdoorId".equals(fieldName)) {
                    deserializedFrontDoorProperties.frontdoorId = reader.getString();
                } else if ("rulesEngines".equals(fieldName)) {
                    List<RulesEngineInner> rulesEngines
                        = reader.readArray(reader1 -> RulesEngineInner.fromJson(reader1));
                    deserializedFrontDoorProperties.rulesEngines = rulesEngines;
                } else if ("extendedProperties".equals(fieldName)) {
                    Map<String, String> extendedProperties = reader.readMap(reader1 -> reader1.getString());
                    deserializedFrontDoorProperties.extendedProperties = extendedProperties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFrontDoorProperties;
        });
    }
}
