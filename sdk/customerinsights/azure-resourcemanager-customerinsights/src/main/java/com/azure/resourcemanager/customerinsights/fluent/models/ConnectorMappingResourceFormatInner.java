// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingProperties;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingStates;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The connector mapping resource format.
 */
@Fluent
public final class ConnectorMappingResourceFormatInner extends ProxyResource {
    /*
     * The connector mapping definition.
     */
    private ConnectorMapping innerProperties;

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
     * Creates an instance of ConnectorMappingResourceFormatInner class.
     */
    public ConnectorMappingResourceFormatInner() {
    }

    /**
     * Get the innerProperties property: The connector mapping definition.
     * 
     * @return the innerProperties value.
     */
    private ConnectorMapping innerProperties() {
        return this.innerProperties;
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
     * Get the connectorName property: The connector name.
     * 
     * @return the connectorName value.
     */
    public String connectorName() {
        return this.innerProperties() == null ? null : this.innerProperties().connectorName();
    }

    /**
     * Get the connectorType property: Type of connector.
     * 
     * @return the connectorType value.
     */
    public ConnectorTypes connectorType() {
        return this.innerProperties() == null ? null : this.innerProperties().connectorType();
    }

    /**
     * Set the connectorType property: Type of connector.
     * 
     * @param connectorType the connectorType value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withConnectorType(ConnectorTypes connectorType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withConnectorType(connectorType);
        return this;
    }

    /**
     * Get the created property: The created time.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the lastModified property: The last modified time.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
    }

    /**
     * Get the entityType property: Defines which entity type the file should map to.
     * 
     * @return the entityType value.
     */
    public EntityTypes entityType() {
        return this.innerProperties() == null ? null : this.innerProperties().entityType();
    }

    /**
     * Set the entityType property: Defines which entity type the file should map to.
     * 
     * @param entityType the entityType value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withEntityType(EntityTypes entityType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withEntityType(entityType);
        return this;
    }

    /**
     * Get the entityTypeName property: The mapping entity name.
     * 
     * @return the entityTypeName value.
     */
    public String entityTypeName() {
        return this.innerProperties() == null ? null : this.innerProperties().entityTypeName();
    }

    /**
     * Set the entityTypeName property: The mapping entity name.
     * 
     * @param entityTypeName the entityTypeName value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withEntityTypeName(String entityTypeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withEntityTypeName(entityTypeName);
        return this;
    }

    /**
     * Get the connectorMappingName property: The connector mapping name.
     * 
     * @return the connectorMappingName value.
     */
    public String connectorMappingName() {
        return this.innerProperties() == null ? null : this.innerProperties().connectorMappingName();
    }

    /**
     * Get the displayName property: Display name for the connector mapping.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name for the connector mapping.
     * 
     * @param displayName the displayName value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The description of the connector mapping.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the connector mapping.
     * 
     * @param description the description value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the dataFormatId property: The DataFormat ID.
     * 
     * @return the dataFormatId value.
     */
    public String dataFormatId() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormatId();
    }

    /**
     * Get the mappingProperties property: The properties of the mapping.
     * 
     * @return the mappingProperties value.
     */
    public ConnectorMappingProperties mappingProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().mappingProperties();
    }

    /**
     * Set the mappingProperties property: The properties of the mapping.
     * 
     * @param mappingProperties the mappingProperties value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withMappingProperties(ConnectorMappingProperties mappingProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorMapping();
        }
        this.innerProperties().withMappingProperties(mappingProperties);
        return this;
    }

    /**
     * Get the nextRunTime property: The next run time based on customer's settings.
     * 
     * @return the nextRunTime value.
     */
    public OffsetDateTime nextRunTime() {
        return this.innerProperties() == null ? null : this.innerProperties().nextRunTime();
    }

    /**
     * Get the runId property: The RunId.
     * 
     * @return the runId value.
     */
    public String runId() {
        return this.innerProperties() == null ? null : this.innerProperties().runId();
    }

    /**
     * Get the state property: State of connector mapping.
     * 
     * @return the state value.
     */
    public ConnectorMappingStates state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the tenantId property: The hub name.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectorMappingResourceFormatInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectorMappingResourceFormatInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConnectorMappingResourceFormatInner.
     */
    public static ConnectorMappingResourceFormatInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectorMappingResourceFormatInner deserializedConnectorMappingResourceFormatInner
                = new ConnectorMappingResourceFormatInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConnectorMappingResourceFormatInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedConnectorMappingResourceFormatInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedConnectorMappingResourceFormatInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedConnectorMappingResourceFormatInner.innerProperties = ConnectorMapping.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectorMappingResourceFormatInner;
        });
    }
}
