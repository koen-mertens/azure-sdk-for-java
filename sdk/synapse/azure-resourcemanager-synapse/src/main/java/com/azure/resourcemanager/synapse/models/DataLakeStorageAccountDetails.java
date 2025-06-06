// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of the data lake storage account associated with the workspace.
 */
@Fluent
public final class DataLakeStorageAccountDetails implements JsonSerializable<DataLakeStorageAccountDetails> {
    /*
     * Account URL
     */
    private String accountUrl;

    /*
     * Filesystem name
     */
    private String filesystem;

    /**
     * Creates an instance of DataLakeStorageAccountDetails class.
     */
    public DataLakeStorageAccountDetails() {
    }

    /**
     * Get the accountUrl property: Account URL.
     * 
     * @return the accountUrl value.
     */
    public String accountUrl() {
        return this.accountUrl;
    }

    /**
     * Set the accountUrl property: Account URL.
     * 
     * @param accountUrl the accountUrl value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    /**
     * Get the filesystem property: Filesystem name.
     * 
     * @return the filesystem value.
     */
    public String filesystem() {
        return this.filesystem;
    }

    /**
     * Set the filesystem property: Filesystem name.
     * 
     * @param filesystem the filesystem value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withFilesystem(String filesystem) {
        this.filesystem = filesystem;
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
        jsonWriter.writeStringField("accountUrl", this.accountUrl);
        jsonWriter.writeStringField("filesystem", this.filesystem);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataLakeStorageAccountDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataLakeStorageAccountDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataLakeStorageAccountDetails.
     */
    public static DataLakeStorageAccountDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataLakeStorageAccountDetails deserializedDataLakeStorageAccountDetails
                = new DataLakeStorageAccountDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountUrl".equals(fieldName)) {
                    deserializedDataLakeStorageAccountDetails.accountUrl = reader.getString();
                } else if ("filesystem".equals(fieldName)) {
                    deserializedDataLakeStorageAccountDetails.filesystem = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataLakeStorageAccountDetails;
        });
    }
}
