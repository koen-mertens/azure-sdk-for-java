// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databricks.fluent.models.PrivateEndpointConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * List of private link connections.
 */
@Fluent
public final class PrivateEndpointConnectionsList implements JsonSerializable<PrivateEndpointConnectionsList> {
    /*
     * The list of returned private endpoint connection.
     */
    private List<PrivateEndpointConnectionInner> value;

    /*
     * The URL to get the next set of endpoint connections.
     */
    private String nextLink;

    /**
     * Creates an instance of PrivateEndpointConnectionsList class.
     */
    public PrivateEndpointConnectionsList() {
    }

    /**
     * Get the value property: The list of returned private endpoint connection.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of returned private endpoint connection.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionsList object itself.
     */
    public PrivateEndpointConnectionsList withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of endpoint connections.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of endpoint connections.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionsList object itself.
     */
    public PrivateEndpointConnectionsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionsList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionsList if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionsList.
     */
    public static PrivateEndpointConnectionsList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionsList deserializedPrivateEndpointConnectionsList
                = new PrivateEndpointConnectionsList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> value
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedPrivateEndpointConnectionsList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionsList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionsList;
        });
    }
}
