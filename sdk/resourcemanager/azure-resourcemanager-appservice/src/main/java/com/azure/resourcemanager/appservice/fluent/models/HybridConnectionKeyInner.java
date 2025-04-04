// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Hybrid Connection key contract. This has the send key name and value for a Hybrid Connection.
 */
@Fluent
public final class HybridConnectionKeyInner extends ProxyOnlyResource {
    /*
     * HybridConnectionKey resource specific properties
     */
    private HybridConnectionKeyProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of HybridConnectionKeyInner class.
     */
    public HybridConnectionKeyInner() {
    }

    /**
     * Get the innerProperties property: HybridConnectionKey resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private HybridConnectionKeyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HybridConnectionKeyInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the sendKeyName property: The name of the send key.
     * 
     * @return the sendKeyName value.
     */
    public String sendKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyName();
    }

    /**
     * Get the sendKeyValue property: The value of the send key.
     * 
     * @return the sendKeyValue value.
     */
    public String sendKeyValue() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyValue();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridConnectionKeyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridConnectionKeyInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HybridConnectionKeyInner.
     */
    public static HybridConnectionKeyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridConnectionKeyInner deserializedHybridConnectionKeyInner = new HybridConnectionKeyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHybridConnectionKeyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedHybridConnectionKeyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedHybridConnectionKeyInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedHybridConnectionKeyInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedHybridConnectionKeyInner.innerProperties
                        = HybridConnectionKeyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridConnectionKeyInner;
        });
    }
}
