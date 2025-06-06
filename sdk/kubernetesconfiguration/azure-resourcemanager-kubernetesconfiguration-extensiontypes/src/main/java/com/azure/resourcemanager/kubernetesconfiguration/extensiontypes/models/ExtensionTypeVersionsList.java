// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.kubernetesconfiguration.extensiontypes.fluent.models.VersionForReleaseTrainInner;
import java.io.IOException;
import java.util.List;

/**
 * List Extension Type Versions. It contains a list of ExtensionTypeVersionForReleaseTrain objects.
 */
@Immutable
public final class ExtensionTypeVersionsList implements JsonSerializable<ExtensionTypeVersionsList> {
    /*
     * List of Extension Type Versions for an Extension Type in a Release Train.
     */
    private List<VersionForReleaseTrainInner> value;

    /*
     * URL to get the next set of extension objects, if any.
     */
    private String nextLink;

    /**
     * Creates an instance of ExtensionTypeVersionsList class.
     */
    public ExtensionTypeVersionsList() {
    }

    /**
     * Get the value property: List of Extension Type Versions for an Extension Type in a Release Train.
     * 
     * @return the value value.
     */
    public List<VersionForReleaseTrainInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of extension objects, if any.
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
     * Reads an instance of ExtensionTypeVersionsList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionTypeVersionsList if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionTypeVersionsList.
     */
    public static ExtensionTypeVersionsList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionTypeVersionsList deserializedExtensionTypeVersionsList = new ExtensionTypeVersionsList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VersionForReleaseTrainInner> value
                        = reader.readArray(reader1 -> VersionForReleaseTrainInner.fromJson(reader1));
                    deserializedExtensionTypeVersionsList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExtensionTypeVersionsList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionTypeVersionsList;
        });
    }
}
