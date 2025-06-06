// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.ProvisionedNetworkProvisioningState;
import com.azure.resourcemanager.avs.models.ProvisionedNetworkTypes;
import java.io.IOException;

/**
 * A provisioned network resource.
 */
@Immutable
public final class ProvisionedNetworkInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private ProvisionedNetworkProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ProvisionedNetworkInner class.
     */
    public ProvisionedNetworkInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private ProvisionedNetworkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisionedNetworkProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the addressPrefix property: The address prefixes of the provisioned network in CIDR notation.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Get the networkType property: The type of network provisioned.
     * 
     * @return the networkType value.
     */
    public ProvisionedNetworkTypes networkType() {
        return this.innerProperties() == null ? null : this.innerProperties().networkType();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisionedNetworkInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisionedNetworkInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProvisionedNetworkInner.
     */
    public static ProvisionedNetworkInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisionedNetworkInner deserializedProvisionedNetworkInner = new ProvisionedNetworkInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProvisionedNetworkInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProvisionedNetworkInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProvisionedNetworkInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedProvisionedNetworkInner.innerProperties = ProvisionedNetworkProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedProvisionedNetworkInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisionedNetworkInner;
        });
    }
}
