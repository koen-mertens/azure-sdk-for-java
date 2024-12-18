// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Server information of the environment.
 */
@Fluent
public final class EnvironmentServer implements JsonSerializable<EnvironmentServer> {
    /*
     * Type of the server that represents the environment.
     */
    private EnvironmentServerType type;

    /*
     * The location of the management portal
     */
    private List<String> managementPortalUri;

    /**
     * Creates an instance of EnvironmentServer class.
     */
    public EnvironmentServer() {
    }

    /**
     * Get the type property: Type of the server that represents the environment.
     * 
     * @return the type value.
     */
    public EnvironmentServerType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the server that represents the environment.
     * 
     * @param type the type value to set.
     * @return the EnvironmentServer object itself.
     */
    public EnvironmentServer withType(EnvironmentServerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the managementPortalUri property: The location of the management portal.
     * 
     * @return the managementPortalUri value.
     */
    public List<String> managementPortalUri() {
        return this.managementPortalUri;
    }

    /**
     * Set the managementPortalUri property: The location of the management portal.
     * 
     * @param managementPortalUri the managementPortalUri value to set.
     * @return the EnvironmentServer object itself.
     */
    public EnvironmentServer withManagementPortalUri(List<String> managementPortalUri) {
        this.managementPortalUri = managementPortalUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("managementPortalUri", this.managementPortalUri,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnvironmentServer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnvironmentServer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnvironmentServer.
     */
    public static EnvironmentServer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnvironmentServer deserializedEnvironmentServer = new EnvironmentServer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedEnvironmentServer.type = EnvironmentServerType.fromString(reader.getString());
                } else if ("managementPortalUri".equals(fieldName)) {
                    List<String> managementPortalUri = reader.readArray(reader1 -> reader1.getString());
                    deserializedEnvironmentServer.managementPortalUri = managementPortalUri;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnvironmentServer;
        });
    }
}
