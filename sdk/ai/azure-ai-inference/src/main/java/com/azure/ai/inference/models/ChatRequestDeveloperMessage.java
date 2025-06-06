// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A request chat message containing developer instructions that influence how the model will generate a chat
 * completions
 * response. Some AI models support a developer message instead of a system message.
 */
@Immutable
public final class ChatRequestDeveloperMessage extends ChatRequestMessage {

    /*
     * The chat role associated with this message.
     */
    @Generated
    private ChatRole role = ChatRole.DEVELOPER;

    /*
     * The contents of the developer message.
     */
    @Generated
    private final String content;

    /**
     * Creates an instance of ChatRequestDeveloperMessage class.
     *
     * @param content the content value to set.
     */
    @Generated
    public ChatRequestDeveloperMessage(String content) {
        this.content = content;
    }

    /**
     * Get the role property: The chat role associated with this message.
     *
     * @return the role value.
     */
    @Generated
    @Override
    public ChatRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The contents of the developer message.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatRequestDeveloperMessage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatRequestDeveloperMessage if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatRequestDeveloperMessage.
     */
    @Generated
    public static ChatRequestDeveloperMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String content = null;
            ChatRole role = ChatRole.DEVELOPER;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("role".equals(fieldName)) {
                    role = ChatRole.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            ChatRequestDeveloperMessage deserializedChatRequestDeveloperMessage
                = new ChatRequestDeveloperMessage(content);
            deserializedChatRequestDeveloperMessage.role = role;
            return deserializedChatRequestDeveloperMessage;
        });
    }
}
