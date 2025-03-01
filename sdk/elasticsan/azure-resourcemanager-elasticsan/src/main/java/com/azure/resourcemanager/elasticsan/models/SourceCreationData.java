// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Data source used when creating the volume.
 */
@Fluent
public final class SourceCreationData implements JsonSerializable<SourceCreationData> {
    /*
     * This enumerates the possible sources of a volume creation.
     */
    private VolumeCreateOption createSource;

    /*
     * Fully qualified resource ID for the resource. E.g.
     * "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}"
     */
    private String sourceId;

    /**
     * Creates an instance of SourceCreationData class.
     */
    public SourceCreationData() {
    }

    /**
     * Get the createSource property: This enumerates the possible sources of a volume creation.
     * 
     * @return the createSource value.
     */
    public VolumeCreateOption createSource() {
        return this.createSource;
    }

    /**
     * Set the createSource property: This enumerates the possible sources of a volume creation.
     * 
     * @param createSource the createSource value to set.
     * @return the SourceCreationData object itself.
     */
    public SourceCreationData withCreateSource(VolumeCreateOption createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * Get the sourceId property: Fully qualified resource ID for the resource. E.g.
     * "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}".
     * 
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: Fully qualified resource ID for the resource. E.g.
     * "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}".
     * 
     * @param sourceId the sourceId value to set.
     * @return the SourceCreationData object itself.
     */
    public SourceCreationData withSourceId(String sourceId) {
        this.sourceId = sourceId;
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
        jsonWriter.writeStringField("createSource", this.createSource == null ? null : this.createSource.toString());
        jsonWriter.writeStringField("sourceId", this.sourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceCreationData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceCreationData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SourceCreationData.
     */
    public static SourceCreationData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceCreationData deserializedSourceCreationData = new SourceCreationData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createSource".equals(fieldName)) {
                    deserializedSourceCreationData.createSource = VolumeCreateOption.fromString(reader.getString());
                } else if ("sourceId".equals(fieldName)) {
                    deserializedSourceCreationData.sourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceCreationData;
        });
    }
}
