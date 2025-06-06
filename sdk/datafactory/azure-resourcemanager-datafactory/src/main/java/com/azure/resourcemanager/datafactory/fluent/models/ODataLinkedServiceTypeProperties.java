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
import com.azure.resourcemanager.datafactory.models.ODataAadServicePrincipalCredentialType;
import com.azure.resourcemanager.datafactory.models.ODataAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * OData linked service properties.
 */
@Fluent
public final class ODataLinkedServiceTypeProperties implements JsonSerializable<ODataLinkedServiceTypeProperties> {
    /*
     * The URL of the OData service endpoint. Type: string (or Expression with resultType string).
     */
    private Object url;

    /*
     * Type of authentication used to connect to the OData service.
     */
    private ODataAuthenticationType authenticationType;

    /*
     * User name of the OData service. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password of the OData service.
     */
    private SecretBase password;

    /*
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: key value pairs (value
     * should be string type).
     */
    private Object authHeaders;

    /*
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Type: string (or
     * Expression with resultType string).
     */
    private Object tenant;

    /*
     * Specify the application id of your application registered in Azure Active Directory. Type: string (or Expression
     * with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    private Object azureCloudType;

    /*
     * Specify the resource you are requesting authorization to use Directory. Type: string (or Expression with
     * resultType string).
     */
    private Object aadResourceId;

    /*
     * Specify the credential type (key or cert) is used for service principal.
     */
    private ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType;

    /*
     * Specify the secret of your application registered in Azure Active Directory. Type: string (or Expression with
     * resultType string).
     */
    private SecretBase servicePrincipalKey;

    /*
     * Specify the base64 encoded certificate of your application registered in Azure Active Directory. Type: string (or
     * Expression with resultType string).
     */
    private SecretBase servicePrincipalEmbeddedCert;

    /*
     * Specify the password of your certificate if your certificate has a password and you are using AadServicePrincipal
     * authentication. Type: string (or Expression with resultType string).
     */
    private SecretBase servicePrincipalEmbeddedCertPassword;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of ODataLinkedServiceTypeProperties class.
     */
    public ODataLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The URL of the OData service endpoint. Type: string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the OData service endpoint. Type: string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the OData service.
     * 
     * @return the authenticationType value.
     */
    public ODataAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the OData service.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withAuthenticationType(ODataAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name of the OData service. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name of the OData service. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password of the OData service.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password of the OData service.
     * 
     * @param password the password value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: key value pairs (value should be string type).
     * 
     * @return the authHeaders value.
     */
    public Object authHeaders() {
        return this.authHeaders;
    }

    /**
     * Set the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: key value pairs (value should be string type).
     * 
     * @param authHeaders the authHeaders value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withAuthHeaders(Object authHeaders) {
        this.authHeaders = authHeaders;
        return this;
    }

    /**
     * Get the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Type: string (or Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Type: string (or Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application id of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application id of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
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
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the aadResourceId property: Specify the resource you are requesting authorization to use Directory. Type:
     * string (or Expression with resultType string).
     * 
     * @return the aadResourceId value.
     */
    public Object aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: Specify the resource you are requesting authorization to use Directory. Type:
     * string (or Expression with resultType string).
     * 
     * @param aadResourceId the aadResourceId value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the aadServicePrincipalCredentialType property: Specify the credential type (key or cert) is used for service
     * principal.
     * 
     * @return the aadServicePrincipalCredentialType value.
     */
    public ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType() {
        return this.aadServicePrincipalCredentialType;
    }

    /**
     * Set the aadServicePrincipalCredentialType property: Specify the credential type (key or cert) is used for service
     * principal.
     * 
     * @param aadServicePrincipalCredentialType the aadServicePrincipalCredentialType value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withAadServicePrincipalCredentialType(
        ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType) {
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the secret of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the secret of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the servicePrincipalEmbeddedCert property: Specify the base64 encoded certificate of your application
     * registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalEmbeddedCert value.
     */
    public SecretBase servicePrincipalEmbeddedCert() {
        return this.servicePrincipalEmbeddedCert;
    }

    /**
     * Set the servicePrincipalEmbeddedCert property: Specify the base64 encoded certificate of your application
     * registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalEmbeddedCert the servicePrincipalEmbeddedCert value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withServicePrincipalEmbeddedCert(SecretBase servicePrincipalEmbeddedCert) {
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        return this;
    }

    /**
     * Get the servicePrincipalEmbeddedCertPassword property: Specify the password of your certificate if your
     * certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalEmbeddedCertPassword value.
     */
    public SecretBase servicePrincipalEmbeddedCertPassword() {
        return this.servicePrincipalEmbeddedCertPassword;
    }

    /**
     * Set the servicePrincipalEmbeddedCertPassword property: Specify the password of your certificate if your
     * certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalEmbeddedCertPassword the servicePrincipalEmbeddedCertPassword value to set.
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties
        withServicePrincipalEmbeddedCertPassword(SecretBase servicePrincipalEmbeddedCertPassword) {
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
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
     * @return the ODataLinkedServiceTypeProperties object itself.
     */
    public ODataLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property url in model ODataLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (servicePrincipalEmbeddedCert() != null) {
            servicePrincipalEmbeddedCert().validate();
        }
        if (servicePrincipalEmbeddedCertPassword() != null) {
            servicePrincipalEmbeddedCertPassword().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ODataLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("url", this.url);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        if (this.username != null) {
            jsonWriter.writeUntypedField("userName", this.username);
        }
        jsonWriter.writeJsonField("password", this.password);
        if (this.authHeaders != null) {
            jsonWriter.writeUntypedField("authHeaders", this.authHeaders);
        }
        if (this.tenant != null) {
            jsonWriter.writeUntypedField("tenant", this.tenant);
        }
        if (this.servicePrincipalId != null) {
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        }
        if (this.azureCloudType != null) {
            jsonWriter.writeUntypedField("azureCloudType", this.azureCloudType);
        }
        if (this.aadResourceId != null) {
            jsonWriter.writeUntypedField("aadResourceId", this.aadResourceId);
        }
        jsonWriter.writeStringField("aadServicePrincipalCredentialType",
            this.aadServicePrincipalCredentialType == null ? null : this.aadServicePrincipalCredentialType.toString());
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        jsonWriter.writeJsonField("servicePrincipalEmbeddedCert", this.servicePrincipalEmbeddedCert);
        jsonWriter.writeJsonField("servicePrincipalEmbeddedCertPassword", this.servicePrincipalEmbeddedCertPassword);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ODataLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ODataLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ODataLinkedServiceTypeProperties.
     */
    public static ODataLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ODataLinkedServiceTypeProperties deserializedODataLinkedServiceTypeProperties
                = new ODataLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("url".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.url = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.authenticationType
                        = ODataAuthenticationType.fromString(reader.getString());
                } else if ("userName".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("authHeaders".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.authHeaders = reader.readUntyped();
                } else if ("tenant".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.tenant = reader.readUntyped();
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.servicePrincipalId = reader.readUntyped();
                } else if ("azureCloudType".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.azureCloudType = reader.readUntyped();
                } else if ("aadResourceId".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.aadResourceId = reader.readUntyped();
                } else if ("aadServicePrincipalCredentialType".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.aadServicePrincipalCredentialType
                        = ODataAadServicePrincipalCredentialType.fromString(reader.getString());
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.servicePrincipalKey = SecretBase.fromJson(reader);
                } else if ("servicePrincipalEmbeddedCert".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.servicePrincipalEmbeddedCert
                        = SecretBase.fromJson(reader);
                } else if ("servicePrincipalEmbeddedCertPassword".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.servicePrincipalEmbeddedCertPassword
                        = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedODataLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedODataLinkedServiceTypeProperties;
        });
    }
}
