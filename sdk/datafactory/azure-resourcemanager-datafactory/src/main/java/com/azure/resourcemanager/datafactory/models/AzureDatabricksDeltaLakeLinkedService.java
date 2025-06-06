// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureDatabricksDetltaLakeLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure Databricks Delta Lake linked service.
 */
@Fluent
public final class AzureDatabricksDeltaLakeLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureDatabricksDeltaLake";

    /*
     * Azure Databricks Delta Lake linked service properties.
     */
    private AzureDatabricksDetltaLakeLinkedServiceTypeProperties innerTypeProperties
        = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureDatabricksDeltaLakeLinkedService class.
     */
    public AzureDatabricksDeltaLakeLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure Databricks Delta Lake linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    AzureDatabricksDetltaLakeLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDatabricksDeltaLakeLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDatabricksDeltaLakeLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDatabricksDeltaLakeLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDatabricksDeltaLakeLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDatabricksDeltaLakeLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     * 
     * @return the domain value.
     */
    public Object domain() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().domain();
    }

    /**
     * Set the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     * 
     * @param domain the domain value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withDomain(Object domain) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDomain(domain);
        return this;
    }

    /**
     * Get the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessToken();
    }

    /**
     * Set the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param accessToken the accessToken value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withAccessToken(SecretBase accessToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessToken(accessToken);
        return this;
    }

    /**
     * Get the clusterId property: The id of an existing interactive cluster that will be used for all runs of this job.
     * Type: string (or Expression with resultType string).
     * 
     * @return the clusterId value.
     */
    public Object clusterId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clusterId();
    }

    /**
     * Set the clusterId property: The id of an existing interactive cluster that will be used for all runs of this job.
     * Type: string (or Expression with resultType string).
     * 
     * @param clusterId the clusterId value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withClusterId(Object clusterId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClusterId(clusterId);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     * 
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().workspaceResourceId();
    }

    /**
     * Set the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     * 
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureDatabricksDeltaLakeLinkedService object itself.
     */
    public AzureDatabricksDeltaLakeLinkedService withWorkspaceResourceId(Object workspaceResourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDetltaLakeLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withWorkspaceResourceId(workspaceResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureDatabricksDeltaLakeLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
        if (connectVia() != null) {
            connectVia().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDatabricksDeltaLakeLinkedService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeJsonField("connectVia", connectVia());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDatabricksDeltaLakeLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDatabricksDeltaLakeLinkedService if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDatabricksDeltaLakeLinkedService.
     */
    public static AzureDatabricksDeltaLakeLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDatabricksDeltaLakeLinkedService deserializedAzureDatabricksDeltaLakeLinkedService
                = new AzureDatabricksDeltaLakeLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeLinkedService
                        .withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureDatabricksDeltaLakeLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureDatabricksDeltaLakeLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeLinkedService.innerTypeProperties
                        = AzureDatabricksDetltaLakeLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureDatabricksDeltaLakeLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureDatabricksDeltaLakeLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedAzureDatabricksDeltaLakeLinkedService;
        });
    }
}
