// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Sql always encrypted properties.
 */
@Fluent
public final class SqlAlwaysEncryptedProperties implements JsonSerializable<SqlAlwaysEncryptedProperties> {
    /*
     * Sql always encrypted AKV authentication type. Type: string.
     */
    private SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType;

    /*
     * The client ID of the application in Azure Active Directory used for Azure Key Vault authentication. Type: string
     * (or Expression with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure Key Vault.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The credential reference containing authentication information.
     */
    private CredentialReference credential;

    /**
     * Creates an instance of SqlAlwaysEncryptedProperties class.
     */
    public SqlAlwaysEncryptedProperties() {
    }

    /**
     * Get the alwaysEncryptedAkvAuthType property: Sql always encrypted AKV authentication type. Type: string.
     * 
     * @return the alwaysEncryptedAkvAuthType value.
     */
    public SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType() {
        return this.alwaysEncryptedAkvAuthType;
    }

    /**
     * Set the alwaysEncryptedAkvAuthType property: Sql always encrypted AKV authentication type. Type: string.
     * 
     * @param alwaysEncryptedAkvAuthType the alwaysEncryptedAkvAuthType value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties
        withAlwaysEncryptedAkvAuthType(SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType) {
        this.alwaysEncryptedAkvAuthType = alwaysEncryptedAkvAuthType;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for Azure
     * Key Vault authentication. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for Azure
     * Key Vault authentication. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure Key
     * Vault.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure Key
     * Vault.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alwaysEncryptedAkvAuthType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property alwaysEncryptedAkvAuthType in model SqlAlwaysEncryptedProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlAlwaysEncryptedProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("alwaysEncryptedAkvAuthType",
            this.alwaysEncryptedAkvAuthType == null ? null : this.alwaysEncryptedAkvAuthType.toString());
        if (this.servicePrincipalId != null) {
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        }
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlAlwaysEncryptedProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlAlwaysEncryptedProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SqlAlwaysEncryptedProperties.
     */
    public static SqlAlwaysEncryptedProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlAlwaysEncryptedProperties deserializedSqlAlwaysEncryptedProperties = new SqlAlwaysEncryptedProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alwaysEncryptedAkvAuthType".equals(fieldName)) {
                    deserializedSqlAlwaysEncryptedProperties.alwaysEncryptedAkvAuthType
                        = SqlAlwaysEncryptedAkvAuthType.fromString(reader.getString());
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedSqlAlwaysEncryptedProperties.servicePrincipalId = reader.readUntyped();
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedSqlAlwaysEncryptedProperties.servicePrincipalKey = SecretBase.fromJson(reader);
                } else if ("credential".equals(fieldName)) {
                    deserializedSqlAlwaysEncryptedProperties.credential = CredentialReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlAlwaysEncryptedProperties;
        });
    }
}
