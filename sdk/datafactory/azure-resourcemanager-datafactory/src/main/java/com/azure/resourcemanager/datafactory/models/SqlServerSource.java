// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity SQL server source.
 */
@Fluent
public final class SqlServerSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "SqlServerSource";

    /*
     * SQL reader query. Type: string (or Expression with resultType string).
     */
    private Object sqlReaderQuery;

    /*
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery.
     * Type: string (or Expression with resultType string).
     */
    private Object sqlReaderStoredProcedureName;

    /*
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     */
    private Object storedProcedureParameters;

    /*
     * Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     */
    private Object isolationLevel;

    /*
     * Which additional types to produce.
     */
    private Object produceAdditionalTypes;

    /*
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None",
     * "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType string).
     */
    private Object partitionOption;

    /*
     * The settings that will be leveraged for Sql source partitioning.
     */
    private SqlPartitionSettings partitionSettings;

    /**
     * Creates an instance of SqlServerSource class.
     */
    public SqlServerSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     * 
     * @return the sqlReaderQuery value.
     */
    public Object sqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     * 
     * @param sqlReaderQuery the sqlReaderQuery value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get the sqlReaderStoredProcedureName property: Name of the stored procedure for a SQL Database source. This
     * cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     * @return the sqlReaderStoredProcedureName value.
     */
    public Object sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set the sqlReaderStoredProcedureName property: Name of the stored procedure for a SQL Database source. This
     * cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     * 
     * @return the storedProcedureParameters value.
     */
    public Object storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     * 
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withStoredProcedureParameters(Object storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     * 
     * @return the isolationLevel value.
     */
    public Object isolationLevel() {
        return this.isolationLevel;
    }

    /**
     * Set the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     * 
     * @param isolationLevel the isolationLevel value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withIsolationLevel(Object isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * Get the produceAdditionalTypes property: Which additional types to produce.
     * 
     * @return the produceAdditionalTypes value.
     */
    public Object produceAdditionalTypes() {
        return this.produceAdditionalTypes;
    }

    /**
     * Set the produceAdditionalTypes property: Which additional types to produce.
     * 
     * @param produceAdditionalTypes the produceAdditionalTypes value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withProduceAdditionalTypes(Object produceAdditionalTypes) {
        this.produceAdditionalTypes = produceAdditionalTypes;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType
     * string).
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange". Type: string (or Expression with resultType
     * string).
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public SqlPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withPartitionSettings(SqlPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (partitionSettings() != null) {
            partitionSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (sourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", sourceRetryCount());
        }
        if (sourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", sourceRetryWait());
        }
        if (maxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        }
        if (disableMetricsCollection() != null) {
            jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        }
        if (queryTimeout() != null) {
            jsonWriter.writeUntypedField("queryTimeout", queryTimeout());
        }
        if (additionalColumns() != null) {
            jsonWriter.writeUntypedField("additionalColumns", additionalColumns());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.sqlReaderQuery != null) {
            jsonWriter.writeUntypedField("sqlReaderQuery", this.sqlReaderQuery);
        }
        if (this.sqlReaderStoredProcedureName != null) {
            jsonWriter.writeUntypedField("sqlReaderStoredProcedureName", this.sqlReaderStoredProcedureName);
        }
        if (this.storedProcedureParameters != null) {
            jsonWriter.writeUntypedField("storedProcedureParameters", this.storedProcedureParameters);
        }
        if (this.isolationLevel != null) {
            jsonWriter.writeUntypedField("isolationLevel", this.isolationLevel);
        }
        if (this.produceAdditionalTypes != null) {
            jsonWriter.writeUntypedField("produceAdditionalTypes", this.produceAdditionalTypes);
        }
        if (this.partitionOption != null) {
            jsonWriter.writeUntypedField("partitionOption", this.partitionOption);
        }
        jsonWriter.writeJsonField("partitionSettings", this.partitionSettings);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlServerSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlServerSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlServerSource.
     */
    public static SqlServerSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlServerSource deserializedSqlServerSource = new SqlServerSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedSqlServerSource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedSqlServerSource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSqlServerSource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedSqlServerSource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedSqlServerSource.withQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedSqlServerSource.withAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSqlServerSource.type = reader.getString();
                } else if ("sqlReaderQuery".equals(fieldName)) {
                    deserializedSqlServerSource.sqlReaderQuery = reader.readUntyped();
                } else if ("sqlReaderStoredProcedureName".equals(fieldName)) {
                    deserializedSqlServerSource.sqlReaderStoredProcedureName = reader.readUntyped();
                } else if ("storedProcedureParameters".equals(fieldName)) {
                    deserializedSqlServerSource.storedProcedureParameters = reader.readUntyped();
                } else if ("isolationLevel".equals(fieldName)) {
                    deserializedSqlServerSource.isolationLevel = reader.readUntyped();
                } else if ("produceAdditionalTypes".equals(fieldName)) {
                    deserializedSqlServerSource.produceAdditionalTypes = reader.readUntyped();
                } else if ("partitionOption".equals(fieldName)) {
                    deserializedSqlServerSource.partitionOption = reader.readUntyped();
                } else if ("partitionSettings".equals(fieldName)) {
                    deserializedSqlServerSource.partitionSettings = SqlPartitionSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSqlServerSource.withAdditionalProperties(additionalProperties);

            return deserializedSqlServerSource;
        });
    }
}
