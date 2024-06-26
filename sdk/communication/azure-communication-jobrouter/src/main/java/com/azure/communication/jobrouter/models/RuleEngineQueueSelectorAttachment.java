// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Attaches queue selectors to a job when the RouterRule is resolved.
 */
@Fluent
public final class RuleEngineQueueSelectorAttachment extends QueueSelectorAttachment {

    /*
     * The type discriminator describing a sub-type of QueueSelectorAttachment.
     */
    @Generated
    private QueueSelectorAttachmentKind kind = QueueSelectorAttachmentKind.RULE_ENGINE;

    /*
     * A RouterRule that resolves a collection of queue selectors to attach.
     */
    @Generated
    private RouterRule rule;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of RuleEngineQueueSelectorAttachment class.
     */
    @Generated
    public RuleEngineQueueSelectorAttachment() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of QueueSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public QueueSelectorAttachmentKind getKind() {
        return this.kind;
    }

    /**
     * Get the rule property: A RouterRule that resolves a collection of queue selectors to attach.
     *
     * @return the rule value.
     */
    @Generated
    public RouterRule getRule() {
        return this.rule;
    }

    /**
     * Set the rule property: A RouterRule that resolves a collection of queue selectors to attach.
     * <p>Required when create the resource.</p>
     *
     * @param rule the rule value to set.
     * @return the RuleEngineQueueSelectorAttachment object itself.
     */
    @Generated
    public RuleEngineQueueSelectorAttachment setRule(RouterRule rule) {
        this.rule = rule;
        this.updatedProperties.add("rule");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getQueueSelectorAttachmentAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeJsonField("rule", this.rule);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("rule")) {
            if (this.rule == null) {
                jsonWriter.writeNullField("rule");
            } else {
                JsonMergePatchHelper.getRouterRuleAccessor().prepareModelForJsonMergePatch(this.rule, true);
                jsonWriter.writeJsonField("rule", this.rule);
                JsonMergePatchHelper.getRouterRuleAccessor().prepareModelForJsonMergePatch(this.rule, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleEngineQueueSelectorAttachment from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleEngineQueueSelectorAttachment if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleEngineQueueSelectorAttachment.
     */
    @Generated
    public static RuleEngineQueueSelectorAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleEngineQueueSelectorAttachment deserializedRuleEngineQueueSelectorAttachment
                = new RuleEngineQueueSelectorAttachment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedRuleEngineQueueSelectorAttachment.kind
                        = QueueSelectorAttachmentKind.fromString(reader.getString());
                } else if ("rule".equals(fieldName)) {
                    deserializedRuleEngineQueueSelectorAttachment.rule = RouterRule.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRuleEngineQueueSelectorAttachment;
        });
    }

    /**
     * Creates an instance of RuleEngineQueueSelectorAttachment class.
     *
     * @param rule the rule value to set.
     */
    public RuleEngineQueueSelectorAttachment(RouterRule rule) {
        this.rule = rule;
        this.updatedProperties.add("rule");
    }
}
