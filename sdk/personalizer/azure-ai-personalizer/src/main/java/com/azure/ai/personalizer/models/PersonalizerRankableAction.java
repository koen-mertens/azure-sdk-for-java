// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An action with its associated features used for ranking.
 */
@Fluent
public final class PersonalizerRankableAction implements JsonSerializable<PersonalizerRankableAction> {

    /*
     * Id of the action.
     */
    @Generated
    private String id;

    /*
     * List of dictionaries containing features.
     */
    @Generated
    private List<BinaryData> features;

    /**
     * Creates an instance of PersonalizerRankableAction class.
     */
    @Generated
    public PersonalizerRankableAction() {
    }

    /**
     * Get the id property: Id of the action.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of the action.
     *
     * @param id the id value to set.
     * @return the PersonalizerRankableAction object itself.
     */
    @Generated
    public PersonalizerRankableAction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the features property: List of dictionaries containing features.
     *
     * @return the features value.
     */
    @Generated
    public List<BinaryData> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: List of dictionaries containing features.
     *
     * @param features the features value to set.
     * @return the PersonalizerRankableAction object itself.
     */
    @Generated
    public PersonalizerRankableAction setFeatures(List<BinaryData> features) {
        this.features = features;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeArrayField("features", this.features, (writer, element) -> element.writeTo(writer));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalizerRankableAction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalizerRankableAction if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PersonalizerRankableAction.
     */
    @Generated
    public static PersonalizerRankableAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalizerRankableAction deserializedPersonalizerRankableAction = new PersonalizerRankableAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedPersonalizerRankableAction.id = reader.getString();
                } else if ("features".equals(fieldName)) {
                    List<BinaryData> features = reader.readArray(reader1 -> (reader1.currentToken() == JsonToken.NULL)
                        ? null
                        : BinaryData.fromObject(reader1.readUntyped()));
                    deserializedPersonalizerRankableAction.features = features;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPersonalizerRankableAction;
        });
    }
}
