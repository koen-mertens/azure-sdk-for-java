// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.synapse.models.RestorePointType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties of a database restore point.
 */
@Immutable
public final class RestorePointProperties implements JsonSerializable<RestorePointProperties> {
    /*
     * The type of restore point
     */
    private RestorePointType restorePointType;

    /*
     * The earliest time to which this database can be restored
     */
    private OffsetDateTime earliestRestoreDate;

    /*
     * The time the backup was taken
     */
    private OffsetDateTime restorePointCreationDate;

    /*
     * The label of restore point for backup request by user
     */
    private String restorePointLabel;

    /**
     * Creates an instance of RestorePointProperties class.
     */
    public RestorePointProperties() {
    }

    /**
     * Get the restorePointType property: The type of restore point.
     * 
     * @return the restorePointType value.
     */
    public RestorePointType restorePointType() {
        return this.restorePointType;
    }

    /**
     * Get the earliestRestoreDate property: The earliest time to which this database can be restored.
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Get the restorePointCreationDate property: The time the backup was taken.
     * 
     * @return the restorePointCreationDate value.
     */
    public OffsetDateTime restorePointCreationDate() {
        return this.restorePointCreationDate;
    }

    /**
     * Get the restorePointLabel property: The label of restore point for backup request by user.
     * 
     * @return the restorePointLabel value.
     */
    public String restorePointLabel() {
        return this.restorePointLabel;
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
     * Reads an instance of RestorePointProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorePointProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorePointProperties.
     */
    public static RestorePointProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorePointProperties deserializedRestorePointProperties = new RestorePointProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restorePointType".equals(fieldName)) {
                    deserializedRestorePointProperties.restorePointType
                        = RestorePointType.fromString(reader.getString());
                } else if ("earliestRestoreDate".equals(fieldName)) {
                    deserializedRestorePointProperties.earliestRestoreDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("restorePointCreationDate".equals(fieldName)) {
                    deserializedRestorePointProperties.restorePointCreationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("restorePointLabel".equals(fieldName)) {
                    deserializedRestorePointProperties.restorePointLabel = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorePointProperties;
        });
    }
}
