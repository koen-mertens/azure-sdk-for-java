// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import java.io.IOException;

/**
 * Represents an allowed environment type.
 */
@Immutable
public final class AllowedEnvironmentTypeInner extends ProxyResource {
    /*
     * Properties of an allowed environment type.
     */
    private AllowedEnvironmentTypeProperties innerProperties;

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
     * Creates an instance of AllowedEnvironmentTypeInner class.
     */
    public AllowedEnvironmentTypeInner() {
    }

    /**
     * Get the innerProperties property: Properties of an allowed environment type.
     * 
     * @return the innerProperties value.
     */
    private AllowedEnvironmentTypeProperties innerProperties() {
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
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the displayName property: The display name of the allowed environment type.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
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
     * Reads an instance of AllowedEnvironmentTypeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AllowedEnvironmentTypeInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AllowedEnvironmentTypeInner.
     */
    public static AllowedEnvironmentTypeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AllowedEnvironmentTypeInner deserializedAllowedEnvironmentTypeInner = new AllowedEnvironmentTypeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAllowedEnvironmentTypeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAllowedEnvironmentTypeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAllowedEnvironmentTypeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAllowedEnvironmentTypeInner.innerProperties
                        = AllowedEnvironmentTypeProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAllowedEnvironmentTypeInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAllowedEnvironmentTypeInner;
        });
    }
}
