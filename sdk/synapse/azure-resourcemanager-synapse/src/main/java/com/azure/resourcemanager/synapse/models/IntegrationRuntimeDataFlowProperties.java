// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Data flow properties for managed integration runtime.
 */
@Fluent
public final class IntegrationRuntimeDataFlowProperties
    implements JsonSerializable<IntegrationRuntimeDataFlowProperties> {
    /*
     * Compute type of the cluster which will execute data flow job.
     */
    private DataFlowComputeType computeType;

    /*
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     */
    private Integer coreCount;

    /*
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     */
    private Integer timeToLive;

    /*
     * Data flow properties for managed integration runtime.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntimeDataFlowProperties class.
     */
    public IntegrationRuntimeDataFlowProperties() {
    }

    /**
     * Get the computeType property: Compute type of the cluster which will execute data flow job.
     * 
     * @return the computeType value.
     */
    public DataFlowComputeType computeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster which will execute data flow job.
     * 
     * @param computeType the computeType value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withComputeType(DataFlowComputeType computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272.
     * 
     * @return the coreCount value.
     */
    public Integer coreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272.
     * 
     * @param coreCount the coreCount value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get the timeToLive property: Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     * @return the timeToLive value.
     */
    public Integer timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive property: Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     * @param timeToLive the timeToLive value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the additionalProperties property: Data flow properties for managed integration runtime.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Data flow properties for managed integration runtime.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("computeType", this.computeType == null ? null : this.computeType.toString());
        jsonWriter.writeNumberField("coreCount", this.coreCount);
        jsonWriter.writeNumberField("timeToLive", this.timeToLive);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeDataFlowProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeDataFlowProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeDataFlowProperties.
     */
    public static IntegrationRuntimeDataFlowProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeDataFlowProperties deserializedIntegrationRuntimeDataFlowProperties
                = new IntegrationRuntimeDataFlowProperties();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeType".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataFlowProperties.computeType
                        = DataFlowComputeType.fromString(reader.getString());
                } else if ("coreCount".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataFlowProperties.coreCount = reader.getNullable(JsonReader::getInt);
                } else if ("timeToLive".equals(fieldName)) {
                    deserializedIntegrationRuntimeDataFlowProperties.timeToLive
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedIntegrationRuntimeDataFlowProperties.additionalProperties = additionalProperties;

            return deserializedIntegrationRuntimeDataFlowProperties;
        });
    }
}
