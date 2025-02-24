// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointConnectionProxyProvisioningState;
import java.io.IOException;

/**
 * Private endpoint connection proxy object property bag.
 */
@Immutable
public final class PrivateEndpointConnectionProxyProperties
    implements JsonSerializable<PrivateEndpointConnectionProxyProperties> {
    /*
     * The provisioning state of the private endpoint connection proxy resource.
     */
    private PrivateEndpointConnectionProxyProvisioningState provisioningState;

    /**
     * Creates an instance of PrivateEndpointConnectionProxyProperties class.
     */
    public PrivateEndpointConnectionProxyProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection proxy resource.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProxyProvisioningState provisioningState() {
        return this.provisioningState;
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
     * Reads an instance of PrivateEndpointConnectionProxyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionProxyProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionProxyProperties.
     */
    public static PrivateEndpointConnectionProxyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionProxyProperties deserializedPrivateEndpointConnectionProxyProperties
                = new PrivateEndpointConnectionProxyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProxyProperties.provisioningState
                        = PrivateEndpointConnectionProxyProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionProxyProperties;
        });
    }
}
