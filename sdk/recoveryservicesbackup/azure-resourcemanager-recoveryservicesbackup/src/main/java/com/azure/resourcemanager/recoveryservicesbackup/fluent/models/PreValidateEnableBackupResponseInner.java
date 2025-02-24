// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidationStatus;
import java.io.IOException;

/**
 * Response contract for enable backup validation request.
 */
@Fluent
public final class PreValidateEnableBackupResponseInner
    implements JsonSerializable<PreValidateEnableBackupResponseInner> {
    /*
     * Validation Status
     */
    private ValidationStatus status;

    /*
     * Response error code
     */
    private String errorCode;

    /*
     * Response error message
     */
    private String errorMessage;

    /*
     * Recommended action for user
     */
    private String recommendation;

    /*
     * Specifies the product specific container name. E.g. iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is
     * required
     * for portal
     */
    private String containerName;

    /*
     * Specifies the product specific ds name. E.g. vm;iaasvmcontainer;rgname;vmname. This is required for portal
     */
    private String protectedItemName;

    /**
     * Creates an instance of PreValidateEnableBackupResponseInner class.
     */
    public PreValidateEnableBackupResponseInner() {
    }

    /**
     * Get the status property: Validation Status.
     * 
     * @return the status value.
     */
    public ValidationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Validation Status.
     * 
     * @param status the status value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withStatus(ValidationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorCode property: Response error code.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Response error code.
     * 
     * @param errorCode the errorCode value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Response error message.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Response error message.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the recommendation property: Recommended action for user.
     * 
     * @return the recommendation value.
     */
    public String recommendation() {
        return this.recommendation;
    }

    /**
     * Set the recommendation property: Recommended action for user.
     * 
     * @param recommendation the recommendation value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    /**
     * Get the containerName property: Specifies the product specific container name. E.g.
     * iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is required
     * for portal.
     * 
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Specifies the product specific container name. E.g.
     * iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is required
     * for portal.
     * 
     * @param containerName the containerName value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the protectedItemName property: Specifies the product specific ds name. E.g.
     * vm;iaasvmcontainer;rgname;vmname. This is required for portal.
     * 
     * @return the protectedItemName value.
     */
    public String protectedItemName() {
        return this.protectedItemName;
    }

    /**
     * Set the protectedItemName property: Specifies the product specific ds name. E.g.
     * vm;iaasvmcontainer;rgname;vmname. This is required for portal.
     * 
     * @param protectedItemName the protectedItemName value to set.
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withProtectedItemName(String protectedItemName) {
        this.protectedItemName = protectedItemName;
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
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        jsonWriter.writeStringField("recommendation", this.recommendation);
        jsonWriter.writeStringField("containerName", this.containerName);
        jsonWriter.writeStringField("protectedItemName", this.protectedItemName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PreValidateEnableBackupResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PreValidateEnableBackupResponseInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PreValidateEnableBackupResponseInner.
     */
    public static PreValidateEnableBackupResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PreValidateEnableBackupResponseInner deserializedPreValidateEnableBackupResponseInner
                = new PreValidateEnableBackupResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.status
                        = ValidationStatus.fromString(reader.getString());
                } else if ("errorCode".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.errorCode = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.errorMessage = reader.getString();
                } else if ("recommendation".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.recommendation = reader.getString();
                } else if ("containerName".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.containerName = reader.getString();
                } else if ("protectedItemName".equals(fieldName)) {
                    deserializedPreValidateEnableBackupResponseInner.protectedItemName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPreValidateEnableBackupResponseInner;
        });
    }
}
