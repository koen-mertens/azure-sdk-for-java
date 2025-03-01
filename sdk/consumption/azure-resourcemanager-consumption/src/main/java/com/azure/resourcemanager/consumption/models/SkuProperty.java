// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Sku property.
 */
@Immutable
public final class SkuProperty implements JsonSerializable<SkuProperty> {
    /*
     * The name of sku property.
     */
    private String name;

    /*
     * The value of sku property.
     */
    private String value;

    /**
     * Creates an instance of SkuProperty class.
     */
    public SkuProperty() {
    }

    /**
     * Get the name property: The name of sku property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: The value of sku property.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
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
     * Reads an instance of SkuProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkuProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SkuProperty.
     */
    public static SkuProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkuProperty deserializedSkuProperty = new SkuProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSkuProperty.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedSkuProperty.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkuProperty;
        });
    }
}
