// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Number of cloud to device messages (AMQP protocol) is not in allowed range.
 */
@Fluent
public final class AmqpC2DMessagesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /*
     * The type of the custom alert rule.
     */
    private String ruleType = "AmqpC2DMessagesNotInAllowedRange";

    /**
     * Creates an instance of AmqpC2DMessagesNotInAllowedRange class.
     */
    public AmqpC2DMessagesNotInAllowedRange() {
    }

    /**
     * Get the ruleType property: The type of the custom alert rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public String ruleType() {
        return this.ruleType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmqpC2DMessagesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmqpC2DMessagesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmqpC2DMessagesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmqpC2DMessagesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (timeWindowSize() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property timeWindowSize in model AmqpC2DMessagesNotInAllowedRange"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmqpC2DMessagesNotInAllowedRange.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isEnabled", isEnabled());
        jsonWriter.writeIntField("minThreshold", minThreshold());
        jsonWriter.writeIntField("maxThreshold", maxThreshold());
        jsonWriter.writeStringField("timeWindowSize", CoreUtils.durationToStringWithDays(timeWindowSize()));
        jsonWriter.writeStringField("ruleType", this.ruleType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmqpC2DMessagesNotInAllowedRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmqpC2DMessagesNotInAllowedRange if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AmqpC2DMessagesNotInAllowedRange.
     */
    public static AmqpC2DMessagesNotInAllowedRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmqpC2DMessagesNotInAllowedRange deserializedAmqpC2DMessagesNotInAllowedRange
                = new AmqpC2DMessagesNotInAllowedRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isEnabled".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withIsEnabled(reader.getBoolean());
                } else if ("minThreshold".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withMinThreshold(reader.getInt());
                } else if ("maxThreshold".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withMaxThreshold(reader.getInt());
                } else if ("timeWindowSize".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withTimeWindowSize(
                        reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString())));
                } else if ("displayName".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withDisplayName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.withDescription(reader.getString());
                } else if ("ruleType".equals(fieldName)) {
                    deserializedAmqpC2DMessagesNotInAllowedRange.ruleType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmqpC2DMessagesNotInAllowedRange;
        });
    }
}
