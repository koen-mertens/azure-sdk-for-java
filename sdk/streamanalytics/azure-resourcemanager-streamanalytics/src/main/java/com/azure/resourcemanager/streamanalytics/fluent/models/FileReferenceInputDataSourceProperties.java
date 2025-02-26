// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties that are associated with a file input containing reference data.
 */
@Fluent
public final class FileReferenceInputDataSourceProperties
    implements JsonSerializable<FileReferenceInputDataSourceProperties> {
    /*
     * The path of the file.
     */
    private String path;

    /**
     * Creates an instance of FileReferenceInputDataSourceProperties class.
     */
    public FileReferenceInputDataSourceProperties() {
    }

    /**
     * Get the path property: The path of the file.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of the file.
     * 
     * @param path the path value to set.
     * @return the FileReferenceInputDataSourceProperties object itself.
     */
    public FileReferenceInputDataSourceProperties withPath(String path) {
        this.path = path;
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
        jsonWriter.writeStringField("path", this.path);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileReferenceInputDataSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileReferenceInputDataSourceProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FileReferenceInputDataSourceProperties.
     */
    public static FileReferenceInputDataSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileReferenceInputDataSourceProperties deserializedFileReferenceInputDataSourceProperties
                = new FileReferenceInputDataSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedFileReferenceInputDataSourceProperties.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileReferenceInputDataSourceProperties;
        });
    }
}
