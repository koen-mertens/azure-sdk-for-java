// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Request body of unlock delete API.
 */
@Fluent
public final class UnlockDeleteRequest implements JsonSerializable<UnlockDeleteRequest> {
    /*
     * The resourceGuardOperationRequests property.
     */
    private List<String> resourceGuardOperationRequests;

    /*
     * The resourceToBeDeleted property.
     */
    private String resourceToBeDeleted;

    /**
     * Creates an instance of UnlockDeleteRequest class.
     */
    public UnlockDeleteRequest() {
    }

    /**
     * Get the resourceGuardOperationRequests property: The resourceGuardOperationRequests property.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: The resourceGuardOperationRequests property.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the UnlockDeleteRequest object itself.
     */
    public UnlockDeleteRequest withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Get the resourceToBeDeleted property: The resourceToBeDeleted property.
     * 
     * @return the resourceToBeDeleted value.
     */
    public String resourceToBeDeleted() {
        return this.resourceToBeDeleted;
    }

    /**
     * Set the resourceToBeDeleted property: The resourceToBeDeleted property.
     * 
     * @param resourceToBeDeleted the resourceToBeDeleted value to set.
     * @return the UnlockDeleteRequest object itself.
     */
    public UnlockDeleteRequest withResourceToBeDeleted(String resourceToBeDeleted) {
        this.resourceToBeDeleted = resourceToBeDeleted;
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
        jsonWriter.writeArrayField("resourceGuardOperationRequests", this.resourceGuardOperationRequests,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("resourceToBeDeleted", this.resourceToBeDeleted);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnlockDeleteRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnlockDeleteRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnlockDeleteRequest.
     */
    public static UnlockDeleteRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UnlockDeleteRequest deserializedUnlockDeleteRequest = new UnlockDeleteRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedUnlockDeleteRequest.resourceGuardOperationRequests = resourceGuardOperationRequests;
                } else if ("resourceToBeDeleted".equals(fieldName)) {
                    deserializedUnlockDeleteRequest.resourceToBeDeleted = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUnlockDeleteRequest;
        });
    }
}
