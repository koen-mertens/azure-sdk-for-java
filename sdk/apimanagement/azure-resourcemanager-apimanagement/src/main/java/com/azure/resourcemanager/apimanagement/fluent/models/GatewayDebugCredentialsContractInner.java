// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Gateway debug credentials.
 */
@Fluent
public final class GatewayDebugCredentialsContractInner
    implements JsonSerializable<GatewayDebugCredentialsContractInner> {
    /*
     * Gateway debug token.
     */
    private String token;

    /**
     * Creates an instance of GatewayDebugCredentialsContractInner class.
     */
    public GatewayDebugCredentialsContractInner() {
    }

    /**
     * Get the token property: Gateway debug token.
     * 
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: Gateway debug token.
     * 
     * @param token the token value to set.
     * @return the GatewayDebugCredentialsContractInner object itself.
     */
    public GatewayDebugCredentialsContractInner withToken(String token) {
        this.token = token;
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
        jsonWriter.writeStringField("token", this.token);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GatewayDebugCredentialsContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayDebugCredentialsContractInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayDebugCredentialsContractInner.
     */
    public static GatewayDebugCredentialsContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayDebugCredentialsContractInner deserializedGatewayDebugCredentialsContractInner
                = new GatewayDebugCredentialsContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("token".equals(fieldName)) {
                    deserializedGatewayDebugCredentialsContractInner.token = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayDebugCredentialsContractInner;
        });
    }
}
