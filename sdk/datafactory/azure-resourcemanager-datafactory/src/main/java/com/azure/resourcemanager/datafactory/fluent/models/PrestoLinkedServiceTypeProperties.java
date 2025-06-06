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
import com.azure.resourcemanager.datafactory.models.PrestoAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Presto server linked service properties.
 */
@Fluent
public final class PrestoLinkedServiceTypeProperties implements JsonSerializable<PrestoLinkedServiceTypeProperties> {
    /*
     * The IP address or host name of the Presto server. (i.e. 192.168.222.160)
     */
    private Object host;

    /*
     * The version of the Presto server. (i.e. 0.148-t) Only used for Version 1.0.
     */
    private Object serverVersion;

    /*
     * The catalog context for all request against the server.
     */
    private Object catalog;

    /*
     * The TCP port that the Presto server uses to listen for client connections. The default value is 8080 when disable
     * SSL, default value is 443 when enable SSL.
     */
    private Object port;

    /*
     * The authentication mechanism used to connect to the Presto server.
     */
    private PrestoAuthenticationType authenticationType;

    /*
     * The user name used to connect to the Presto server.
     */
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value for legacy version is
     * False. The default value for version 2.0 is True.
     */
    private Object enableSsl;

    /*
     * Specifies whether the connections to the server will validate server certificate, the default value is True. Only
     * used for Version 2.0
     */
    private Object enableServerCertificateValidation;

    /*
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over
     * SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file
     * installed with the IR. Only used for Version 1.0.
     */
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default
     * value is false. Only used for Version 1.0.
     */
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false. Only used for Version 1.0.
     */
    private Object allowHostnameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Only used for
     * Version 1.0.
     */
    private Object allowSelfSignedServerCert;

    /*
     * The local time zone used by the connection. Valid values for this option are specified in the IANA Time Zone
     * Database. The default value for Version 1.0 is the client system time zone. The default value for Version 2.0 is
     * server system timeZone
     */
    private Object timeZoneId;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of PrestoLinkedServiceTypeProperties class.
     */
    public PrestoLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     * 
     * @param host the host value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the serverVersion property: The version of the Presto server. (i.e. 0.148-t) Only used for Version 1.0.
     * 
     * @return the serverVersion value.
     */
    public Object serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set the serverVersion property: The version of the Presto server. (i.e. 0.148-t) Only used for Version 1.0.
     * 
     * @param serverVersion the serverVersion value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withServerVersion(Object serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Get the catalog property: The catalog context for all request against the server.
     * 
     * @return the catalog value.
     */
    public Object catalog() {
        return this.catalog;
    }

    /**
     * Set the catalog property: The catalog context for all request against the server.
     * 
     * @param catalog the catalog value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withCatalog(Object catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080 when disable SSL, default value is 443 when enable SSL.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080 when disable SSL, default value is 443 when enable SSL.
     * 
     * @param port the port value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism used to connect to the Presto server.
     * 
     * @return the authenticationType value.
     */
    public PrestoAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism used to connect to the Presto server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withAuthenticationType(PrestoAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the Presto server.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the Presto server.
     * 
     * @param username the username value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     * 
     * @param password the password value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value for legacy version is False. The default value for version 2.0 is True.
     * 
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value for legacy version is False. The default value for version 2.0 is True.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: Specifies whether the connections to the server will validate
     * server certificate, the default value is True. Only used for Version 2.0.
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object enableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: Specifies whether the connections to the server will validate
     * server certificate, the default value is True. Only used for Version 2.0.
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties
        withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR. Only used for Version 1.0.
     * 
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR. Only used for Version 1.0.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false. Only used for Version 1.0.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false. Only used for Version 1.0.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false. Only used for Version 1.0.
     * 
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.allowHostnameCNMismatch;
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false. Only used for Version 1.0.
     * 
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        this.allowHostnameCNMismatch = allowHostnameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Only used for Version 1.0.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Only used for Version 1.0.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the timeZoneId property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value for Version 1.0 is the client system time zone. The
     * default value for Version 2.0 is server system timeZone.
     * 
     * @return the timeZoneId value.
     */
    public Object timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the timeZoneId property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value for Version 1.0 is the client system time zone. The
     * default value for Version 2.0 is server system timeZone.
     * 
     * @param timeZoneId the timeZoneId value to set.
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withTimeZoneId(Object timeZoneId) {
        this.timeZoneId = timeZoneId;
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
     * @return the PrestoLinkedServiceTypeProperties object itself.
     */
    public PrestoLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
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
                    "Missing required property host in model PrestoLinkedServiceTypeProperties"));
        }
        if (catalog() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property catalog in model PrestoLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property authenticationType in model PrestoLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrestoLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("host", this.host);
        jsonWriter.writeUntypedField("catalog", this.catalog);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        if (this.serverVersion != null) {
            jsonWriter.writeUntypedField("serverVersion", this.serverVersion);
        }
        if (this.port != null) {
            jsonWriter.writeUntypedField("port", this.port);
        }
        if (this.username != null) {
            jsonWriter.writeUntypedField("username", this.username);
        }
        jsonWriter.writeJsonField("password", this.password);
        if (this.enableSsl != null) {
            jsonWriter.writeUntypedField("enableSsl", this.enableSsl);
        }
        if (this.enableServerCertificateValidation != null) {
            jsonWriter.writeUntypedField("enableServerCertificateValidation", this.enableServerCertificateValidation);
        }
        if (this.trustedCertPath != null) {
            jsonWriter.writeUntypedField("trustedCertPath", this.trustedCertPath);
        }
        if (this.useSystemTrustStore != null) {
            jsonWriter.writeUntypedField("useSystemTrustStore", this.useSystemTrustStore);
        }
        if (this.allowHostnameCNMismatch != null) {
            jsonWriter.writeUntypedField("allowHostNameCNMismatch", this.allowHostnameCNMismatch);
        }
        if (this.allowSelfSignedServerCert != null) {
            jsonWriter.writeUntypedField("allowSelfSignedServerCert", this.allowSelfSignedServerCert);
        }
        if (this.timeZoneId != null) {
            jsonWriter.writeUntypedField("timeZoneID", this.timeZoneId);
        }
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrestoLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrestoLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrestoLinkedServiceTypeProperties.
     */
    public static PrestoLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrestoLinkedServiceTypeProperties deserializedPrestoLinkedServiceTypeProperties
                = new PrestoLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("host".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.host = reader.readUntyped();
                } else if ("catalog".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.catalog = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.authenticationType
                        = PrestoAuthenticationType.fromString(reader.getString());
                } else if ("serverVersion".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.serverVersion = reader.readUntyped();
                } else if ("port".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.port = reader.readUntyped();
                } else if ("username".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("enableSsl".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.enableSsl = reader.readUntyped();
                } else if ("enableServerCertificateValidation".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.enableServerCertificateValidation
                        = reader.readUntyped();
                } else if ("trustedCertPath".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.trustedCertPath = reader.readUntyped();
                } else if ("useSystemTrustStore".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.useSystemTrustStore = reader.readUntyped();
                } else if ("allowHostNameCNMismatch".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.allowHostnameCNMismatch = reader.readUntyped();
                } else if ("allowSelfSignedServerCert".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.allowSelfSignedServerCert = reader.readUntyped();
                } else if ("timeZoneID".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.timeZoneId = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedPrestoLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrestoLinkedServiceTypeProperties;
        });
    }
}
