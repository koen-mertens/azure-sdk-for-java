// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.fluent.models.ExtensionTypeInner;
import java.io.IOException;
import java.util.List;

/**
 * List Extension Types. It contains a list of ExtensionType objects and a URL link to get the next set of results.
 */
@Immutable
public final class ExtensionTypesList implements JsonSerializable<ExtensionTypesList> {
    /*
     * List of Extension Types.
     */
    private List<ExtensionTypeInner> value;

    /*
     * URL to get the next set of extension type objects, if any.
     */
    private String nextLink;

    /**
     * Creates an instance of ExtensionTypesList class.
     */
    public ExtensionTypesList() {
    }

    /**
     * Get the value property: List of Extension Types.
     * 
     * @return the value value.
     */
    public List<ExtensionTypeInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of extension type objects, if any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionTypesList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionTypesList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionTypesList.
     */
    public static ExtensionTypesList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionTypesList deserializedExtensionTypesList = new ExtensionTypesList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ExtensionTypeInner> value = reader.readArray(reader1 -> ExtensionTypeInner.fromJson(reader1));
                    deserializedExtensionTypesList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExtensionTypesList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionTypesList;
        });
    }
}
