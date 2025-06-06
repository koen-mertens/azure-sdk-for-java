// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A resource identity that is managed by the user of the service.
 */
@Immutable
public final class UserIdentity implements JsonSerializable<UserIdentity> {
    /*
     * The principal ID of the user-assigned identity.
     */
    private String principalId;

    /*
     * The client ID of the user-assigned identity.
     */
    private String clientId;

    /**
     * Creates an instance of UserIdentity class.
     */
    public UserIdentity() {
    }

    /**
     * Get the principalId property: The principal ID of the user-assigned identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The client ID of the user-assigned identity.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserIdentity.
     */
    public static UserIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserIdentity deserializedUserIdentity = new UserIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedUserIdentity.principalId = reader.getString();
                } else if ("clientId".equals(fieldName)) {
                    deserializedUserIdentity.clientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserIdentity;
        });
    }
}
