// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Model that represents the execution properties of an Experiment.
 */
@Immutable
public final class ExperimentExecutionProperties implements JsonSerializable<ExperimentExecutionProperties> {
    /*
     * The status of the execution.
     */
    private String status;

    /*
     * String that represents the start date time.
     */
    private OffsetDateTime startedAt;

    /*
     * String that represents the stop date time.
     */
    private OffsetDateTime stoppedAt;

    /**
     * Creates an instance of ExperimentExecutionProperties class.
     */
    private ExperimentExecutionProperties() {
    }

    /**
     * Get the status property: The status of the execution.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the startedAt property: String that represents the start date time.
     * 
     * @return the startedAt value.
     */
    public OffsetDateTime startedAt() {
        return this.startedAt;
    }

    /**
     * Get the stoppedAt property: String that represents the stop date time.
     * 
     * @return the stoppedAt value.
     */
    public OffsetDateTime stoppedAt() {
        return this.stoppedAt;
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
     * Reads an instance of ExperimentExecutionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentExecutionProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExperimentExecutionProperties.
     */
    public static ExperimentExecutionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExperimentExecutionProperties deserializedExperimentExecutionProperties
                = new ExperimentExecutionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedExperimentExecutionProperties.status = reader.getString();
                } else if ("startedAt".equals(fieldName)) {
                    deserializedExperimentExecutionProperties.startedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("stoppedAt".equals(fieldName)) {
                    deserializedExperimentExecutionProperties.stoppedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExperimentExecutionProperties;
        });
    }
}
