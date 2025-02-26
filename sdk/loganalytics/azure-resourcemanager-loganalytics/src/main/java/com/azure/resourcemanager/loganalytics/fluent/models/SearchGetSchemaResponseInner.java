// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.loganalytics.models.SearchMetadata;
import com.azure.resourcemanager.loganalytics.models.SearchSchemaValue;
import java.io.IOException;
import java.util.List;

/**
 * The get schema operation response.
 */
@Fluent
public final class SearchGetSchemaResponseInner implements JsonSerializable<SearchGetSchemaResponseInner> {
    /*
     * The metadata from search results.
     */
    private SearchMetadata metadata;

    /*
     * The array of result values.
     */
    private List<SearchSchemaValue> value;

    /**
     * Creates an instance of SearchGetSchemaResponseInner class.
     */
    public SearchGetSchemaResponseInner() {
    }

    /**
     * Get the metadata property: The metadata from search results.
     * 
     * @return the metadata value.
     */
    public SearchMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata from search results.
     * 
     * @param metadata the metadata value to set.
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withMetadata(SearchMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the value property: The array of result values.
     * 
     * @return the value value.
     */
    public List<SearchSchemaValue> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of result values.
     * 
     * @param value the value value to set.
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withValue(List<SearchSchemaValue> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
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
        jsonWriter.writeJsonField("metadata", this.metadata);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchGetSchemaResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchGetSchemaResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchGetSchemaResponseInner.
     */
    public static SearchGetSchemaResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SearchGetSchemaResponseInner deserializedSearchGetSchemaResponseInner = new SearchGetSchemaResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metadata".equals(fieldName)) {
                    deserializedSearchGetSchemaResponseInner.metadata = SearchMetadata.fromJson(reader);
                } else if ("value".equals(fieldName)) {
                    List<SearchSchemaValue> value = reader.readArray(reader1 -> SearchSchemaValue.fromJson(reader1));
                    deserializedSearchGetSchemaResponseInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSearchGetSchemaResponseInner;
        });
    }
}
