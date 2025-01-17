// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Vault extended information.
 */
@Fluent
public final class VaultExtendedInfoResourceInner extends ProxyResource {
    /*
     * Vault extended information.
     */
    private VaultExtendedInfo innerProperties;

    /*
     * Optional ETag.
     */
    private String etag;

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
     * Creates an instance of VaultExtendedInfoResourceInner class.
     */
    public VaultExtendedInfoResourceInner() {
    }

    /**
     * Get the innerProperties property: Vault extended information.
     * 
     * @return the innerProperties value.
     */
    private VaultExtendedInfo innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Optional ETag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     * 
     * @param etag the etag value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * Get the integrityKey property: Integrity key.
     * 
     * @return the integrityKey value.
     */
    public String integrityKey() {
        return this.innerProperties() == null ? null : this.innerProperties().integrityKey();
    }

    /**
     * Set the integrityKey property: Integrity key.
     * 
     * @param integrityKey the integrityKey value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withIntegrityKey(String integrityKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VaultExtendedInfo();
        }
        this.innerProperties().withIntegrityKey(integrityKey);
        return this;
    }

    /**
     * Get the encryptionKey property: Encryption key.
     * 
     * @return the encryptionKey value.
     */
    public String encryptionKey() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionKey();
    }

    /**
     * Set the encryptionKey property: Encryption key.
     * 
     * @param encryptionKey the encryptionKey value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKey(String encryptionKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VaultExtendedInfo();
        }
        this.innerProperties().withEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * Get the encryptionKeyThumbprint property: Encryption key thumbprint.
     * 
     * @return the encryptionKeyThumbprint value.
     */
    public String encryptionKeyThumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionKeyThumbprint();
    }

    /**
     * Set the encryptionKeyThumbprint property: Encryption key thumbprint.
     * 
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VaultExtendedInfo();
        }
        this.innerProperties().withEncryptionKeyThumbprint(encryptionKeyThumbprint);
        return this;
    }

    /**
     * Get the algorithm property: Algorithm for Vault ExtendedInfo.
     * 
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.innerProperties() == null ? null : this.innerProperties().algorithm();
    }

    /**
     * Set the algorithm property: Algorithm for Vault ExtendedInfo.
     * 
     * @param algorithm the algorithm value to set.
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withAlgorithm(String algorithm) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VaultExtendedInfo();
        }
        this.innerProperties().withAlgorithm(algorithm);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("etag", this.etag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultExtendedInfoResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultExtendedInfoResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VaultExtendedInfoResourceInner.
     */
    public static VaultExtendedInfoResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultExtendedInfoResourceInner deserializedVaultExtendedInfoResourceInner
                = new VaultExtendedInfoResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVaultExtendedInfoResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVaultExtendedInfoResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVaultExtendedInfoResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVaultExtendedInfoResourceInner.innerProperties = VaultExtendedInfo.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedVaultExtendedInfoResourceInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultExtendedInfoResourceInner;
        });
    }
}
