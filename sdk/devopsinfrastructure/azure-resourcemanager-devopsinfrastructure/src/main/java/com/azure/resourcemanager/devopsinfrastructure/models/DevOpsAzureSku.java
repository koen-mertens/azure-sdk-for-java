// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Azure SKU of the machines in the pool.
 */
@Fluent
public final class DevOpsAzureSku implements JsonSerializable<DevOpsAzureSku> {
    /*
     * The Azure SKU name of the machines in the pool.
     */
    private String name;

    /**
     * Creates an instance of DevOpsAzureSku class.
     */
    public DevOpsAzureSku() {
    }

    /**
     * Get the name property: The Azure SKU name of the machines in the pool.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Azure SKU name of the machines in the pool.
     * 
     * @param name the name value to set.
     * @return the DevOpsAzureSku object itself.
     */
    public DevOpsAzureSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model DevOpsAzureSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DevOpsAzureSku.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DevOpsAzureSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DevOpsAzureSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DevOpsAzureSku.
     */
    public static DevOpsAzureSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DevOpsAzureSku deserializedDevOpsAzureSku = new DevOpsAzureSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDevOpsAzureSku.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDevOpsAzureSku;
        });
    }
}
