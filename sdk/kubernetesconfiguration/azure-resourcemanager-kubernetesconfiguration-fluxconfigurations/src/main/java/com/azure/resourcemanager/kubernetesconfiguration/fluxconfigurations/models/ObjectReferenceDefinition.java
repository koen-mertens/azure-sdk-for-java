// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluxconfigurations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Object reference to a Kubernetes object on a cluster.
 */
@Fluent
public final class ObjectReferenceDefinition implements JsonSerializable<ObjectReferenceDefinition> {
    /*
     * Name of the object
     */
    private String name;

    /*
     * Namespace of the object
     */
    private String namespace;

    /**
     * Creates an instance of ObjectReferenceDefinition class.
     */
    public ObjectReferenceDefinition() {
    }

    /**
     * Get the name property: Name of the object.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the object.
     * 
     * @param name the name value to set.
     * @return the ObjectReferenceDefinition object itself.
     */
    public ObjectReferenceDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: Namespace of the object.
     * 
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Namespace of the object.
     * 
     * @param namespace the namespace value to set.
     * @return the ObjectReferenceDefinition object itself.
     */
    public ObjectReferenceDefinition withNamespace(String namespace) {
        this.namespace = namespace;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("namespace", this.namespace);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObjectReferenceDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObjectReferenceDefinition if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObjectReferenceDefinition.
     */
    public static ObjectReferenceDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObjectReferenceDefinition deserializedObjectReferenceDefinition = new ObjectReferenceDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedObjectReferenceDefinition.name = reader.getString();
                } else if ("namespace".equals(fieldName)) {
                    deserializedObjectReferenceDefinition.namespace = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedObjectReferenceDefinition;
        });
    }
}
