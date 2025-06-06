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
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Jira Service linked service properties.
 */
@Fluent
public final class JiraLinkedServiceTypeProperties implements JsonSerializable<JiraLinkedServiceTypeProperties> {
    /*
     * The IP address or host name of the Jira service. (e.g. jira.example.com)
     */
    private Object host;

    /*
     * The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting
     * through HTTPS, or 8080 if connecting through HTTP.
     */
    private Object port;

    /*
     * The user name that you use to access Jira Service.
     */
    private Object username;

    /*
     * The password corresponding to the user name that you provided in the username field.
     */
    private SecretBase password;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of JiraLinkedServiceTypeProperties class.
     */
    public JiraLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The IP address or host name of the Jira service. (e.g. jira.example.com).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Jira service. (e.g. jira.example.com).
     * 
     * @param host the host value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Jira server uses to listen for client connections. The default value
     * is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Jira server uses to listen for client connections. The default value
     * is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     * 
     * @param port the port value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Jira Service.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name that you use to access Jira Service.
     * 
     * @param username the username value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name that you provided in the username field.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name that you provided in the username field.
     * 
     * @param password the password value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the JiraLinkedServiceTypeProperties object itself.
     */
    public JiraLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model JiraLinkedServiceTypeProperties"));
        }
        if (username() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property username in model JiraLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JiraLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("host", this.host);
        jsonWriter.writeUntypedField("username", this.username);
        if (this.port != null) {
            jsonWriter.writeUntypedField("port", this.port);
        }
        jsonWriter.writeJsonField("password", this.password);
        if (this.useEncryptedEndpoints != null) {
            jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
        }
        if (this.useHostVerification != null) {
            jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
        }
        if (this.usePeerVerification != null) {
            jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
        }
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JiraLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JiraLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JiraLinkedServiceTypeProperties.
     */
    public static JiraLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JiraLinkedServiceTypeProperties deserializedJiraLinkedServiceTypeProperties
                = new JiraLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("host".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.host = reader.readUntyped();
                } else if ("username".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("port".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.port = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("useEncryptedEndpoints".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.useEncryptedEndpoints = reader.readUntyped();
                } else if ("useHostVerification".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.useHostVerification = reader.readUntyped();
                } else if ("usePeerVerification".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.usePeerVerification = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedJiraLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJiraLinkedServiceTypeProperties;
        });
    }
}
