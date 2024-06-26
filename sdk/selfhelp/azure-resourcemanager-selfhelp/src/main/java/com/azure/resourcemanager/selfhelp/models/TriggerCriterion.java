// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Solution request trigger criterion. SolutionId/ProblemClassificationId is the only supported trigger type for
 * Solution PUT request. ReplacementKey is the only supported trigger type for Solution PATCH request.
 */
@Fluent
public final class TriggerCriterion implements JsonSerializable<TriggerCriterion> {
    /*
     * Trigger criterion name.
     */
    private Name name;

    /*
     * Trigger criterion value.
     */
    private String value;

    /**
     * Creates an instance of TriggerCriterion class.
     */
    public TriggerCriterion() {
    }

    /**
     * Get the name property: Trigger criterion name.
     * 
     * @return the name value.
     */
    public Name name() {
        return this.name;
    }

    /**
     * Set the name property: Trigger criterion name.
     * 
     * @param name the name value to set.
     * @return the TriggerCriterion object itself.
     */
    public TriggerCriterion withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Trigger criterion value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Trigger criterion value.
     * 
     * @param value the value value to set.
     * @return the TriggerCriterion object itself.
     */
    public TriggerCriterion withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerCriterion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerCriterion if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggerCriterion.
     */
    public static TriggerCriterion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerCriterion deserializedTriggerCriterion = new TriggerCriterion();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTriggerCriterion.name = Name.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedTriggerCriterion.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerCriterion;
        });
    }
}
