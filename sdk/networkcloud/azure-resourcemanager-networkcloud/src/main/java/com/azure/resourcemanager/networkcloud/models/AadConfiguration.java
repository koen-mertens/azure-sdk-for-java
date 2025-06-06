// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * AadConfiguration represents the Azure Active Directory Integration properties.
 */
@Fluent
public final class AadConfiguration implements JsonSerializable<AadConfiguration> {
    /*
     * The list of Azure Active Directory group object IDs that will have an administrative role on the Kubernetes
     * cluster.
     */
    private List<String> adminGroupObjectIds;

    /**
     * Creates an instance of AadConfiguration class.
     */
    public AadConfiguration() {
    }

    /**
     * Get the adminGroupObjectIds property: The list of Azure Active Directory group object IDs that will have an
     * administrative role on the Kubernetes cluster.
     * 
     * @return the adminGroupObjectIds value.
     */
    public List<String> adminGroupObjectIds() {
        return this.adminGroupObjectIds;
    }

    /**
     * Set the adminGroupObjectIds property: The list of Azure Active Directory group object IDs that will have an
     * administrative role on the Kubernetes cluster.
     * 
     * @param adminGroupObjectIds the adminGroupObjectIds value to set.
     * @return the AadConfiguration object itself.
     */
    public AadConfiguration withAdminGroupObjectIds(List<String> adminGroupObjectIds) {
        this.adminGroupObjectIds = adminGroupObjectIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminGroupObjectIds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property adminGroupObjectIds in model AadConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AadConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("adminGroupObjectIds", this.adminGroupObjectIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AadConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AadConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AadConfiguration.
     */
    public static AadConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AadConfiguration deserializedAadConfiguration = new AadConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("adminGroupObjectIds".equals(fieldName)) {
                    List<String> adminGroupObjectIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedAadConfiguration.adminGroupObjectIds = adminGroupObjectIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAadConfiguration;
        });
    }
}
