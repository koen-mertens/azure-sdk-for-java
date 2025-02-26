// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings concerning key vault encryption for a configuration store.
 */
@Fluent
public final class KeyVaultProperties implements JsonSerializable<KeyVaultProperties> {
    /*
     * The URI of the key vault key used to encrypt data.
     */
    private String keyIdentifier;

    /*
     * The client id of the identity which will be used to access key vault.
     */
    private String identityClientId;

    /**
     * Creates an instance of KeyVaultProperties class.
     */
    public KeyVaultProperties() {
    }

    /**
     * Get the keyIdentifier property: The URI of the key vault key used to encrypt data.
     * 
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The URI of the key vault key used to encrypt data.
     * 
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the identityClientId property: The client id of the identity which will be used to access key vault.
     * 
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: The client id of the identity which will be used to access key vault.
     * 
     * @param identityClientId the identityClientId value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withIdentityClientId(String identityClientId) {
        this.identityClientId = identityClientId;
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
        jsonWriter.writeStringField("keyIdentifier", this.keyIdentifier);
        jsonWriter.writeStringField("identityClientId", this.identityClientId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultProperties.
     */
    public static KeyVaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultProperties deserializedKeyVaultProperties = new KeyVaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyIdentifier".equals(fieldName)) {
                    deserializedKeyVaultProperties.keyIdentifier = reader.getString();
                } else if ("identityClientId".equals(fieldName)) {
                    deserializedKeyVaultProperties.identityClientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultProperties;
        });
    }
}
