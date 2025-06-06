// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Azure Data Lake Store linked service properties.
 */
@Fluent
public final class AzureDataLakeStoreLinkedServiceTypeProperties
    implements JsonSerializable<AzureDataLakeStoreLinkedServiceTypeProperties> {
    /*
     * Data Lake Store service URI. Type: string (or Expression with resultType string).
     */
    private Object dataLakeStoreUri;

    /*
     * The ID of the application used to authenticate against the Azure Data Lake Store account. Type: string (or
     * Expression with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data Lake Store account.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    private Object azureCloudType;

    /*
     * Data Lake Store account name. Type: string (or Expression with resultType string).
     */
    private Object accountName;

    /*
     * Data Lake Store account subscription ID (if different from Data Factory account). Type: string (or Expression
     * with resultType string).
     */
    private Object subscriptionId;

    /*
     * Data Lake Store account resource group name (if different from Data Factory account). Type: string (or Expression
     * with resultType string).
     */
    private Object resourceGroupName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    private CredentialReference credential;

    /**
     * Creates an instance of AzureDataLakeStoreLinkedServiceTypeProperties class.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties() {
    }

    /**
     * Get the dataLakeStoreUri property: Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     * 
     * @return the dataLakeStoreUri value.
     */
    public Object dataLakeStoreUri() {
        return this.dataLakeStoreUri;
    }

    /**
     * Set the dataLakeStoreUri property: Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     * 
     * @param dataLakeStoreUri the dataLakeStoreUri value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withDataLakeStoreUri(Object dataLakeStoreUri) {
        this.dataLakeStoreUri = dataLakeStoreUri;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Store account. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Store account. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Store account.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Store account.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the accountName property: Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
     * @return the accountName value.
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Store account resource group name (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Store account resource group name (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
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
     * @return the AzureDataLakeStoreLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeStoreLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataLakeStoreUri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dataLakeStoreUri in model AzureDataLakeStoreLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDataLakeStoreLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("dataLakeStoreUri", this.dataLakeStoreUri);
        if (this.servicePrincipalId != null) {
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        }
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        if (this.tenant != null) {
            jsonWriter.writeUntypedField("tenant", this.tenant);
        }
        if (this.azureCloudType != null) {
            jsonWriter.writeUntypedField("azureCloudType", this.azureCloudType);
        }
        if (this.accountName != null) {
            jsonWriter.writeUntypedField("accountName", this.accountName);
        }
        if (this.subscriptionId != null) {
            jsonWriter.writeUntypedField("subscriptionId", this.subscriptionId);
        }
        if (this.resourceGroupName != null) {
            jsonWriter.writeUntypedField("resourceGroupName", this.resourceGroupName);
        }
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataLakeStoreLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeStoreLinkedServiceTypeProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDataLakeStoreLinkedServiceTypeProperties.
     */
    public static AzureDataLakeStoreLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeStoreLinkedServiceTypeProperties deserializedAzureDataLakeStoreLinkedServiceTypeProperties
                = new AzureDataLakeStoreLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataLakeStoreUri".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.dataLakeStoreUri = reader.readUntyped();
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.servicePrincipalId = reader.readUntyped();
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.servicePrincipalKey
                        = SecretBase.fromJson(reader);
                } else if ("tenant".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.tenant = reader.readUntyped();
                } else if ("azureCloudType".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.azureCloudType = reader.readUntyped();
                } else if ("accountName".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.accountName = reader.readUntyped();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.subscriptionId = reader.readUntyped();
                } else if ("resourceGroupName".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.resourceGroupName = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else if ("credential".equals(fieldName)) {
                    deserializedAzureDataLakeStoreLinkedServiceTypeProperties.credential
                        = CredentialReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDataLakeStoreLinkedServiceTypeProperties;
        });
    }
}
