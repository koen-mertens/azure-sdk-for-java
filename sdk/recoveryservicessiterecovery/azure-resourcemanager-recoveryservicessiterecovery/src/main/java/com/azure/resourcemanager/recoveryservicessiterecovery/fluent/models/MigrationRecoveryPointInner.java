// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationRecoveryPointProperties;
import java.io.IOException;

/**
 * Recovery point for a migration item.
 */
@Fluent
public final class MigrationRecoveryPointInner extends ProxyResource {
    /*
     * Recovery point properties.
     */
    private MigrationRecoveryPointProperties properties;

    /*
     * Resource Location
     */
    private String location;

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
     * Creates an instance of MigrationRecoveryPointInner class.
     */
    public MigrationRecoveryPointInner() {
    }

    /**
     * Get the properties property: Recovery point properties.
     * 
     * @return the properties value.
     */
    public MigrationRecoveryPointProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Recovery point properties.
     * 
     * @param properties the properties value to set.
     * @return the MigrationRecoveryPointInner object itself.
     */
    public MigrationRecoveryPointInner withProperties(MigrationRecoveryPointProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     * 
     * @param location the location value to set.
     * @return the MigrationRecoveryPointInner object itself.
     */
    public MigrationRecoveryPointInner withLocation(String location) {
        this.location = location;
        return this;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MigrationRecoveryPointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MigrationRecoveryPointInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MigrationRecoveryPointInner.
     */
    public static MigrationRecoveryPointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MigrationRecoveryPointInner deserializedMigrationRecoveryPointInner = new MigrationRecoveryPointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMigrationRecoveryPointInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMigrationRecoveryPointInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMigrationRecoveryPointInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedMigrationRecoveryPointInner.properties
                        = MigrationRecoveryPointProperties.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedMigrationRecoveryPointInner.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMigrationRecoveryPointInner;
        });
    }
}
