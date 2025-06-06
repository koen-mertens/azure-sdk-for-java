// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * HDInsight Pig activity properties.
 */
@Fluent
public final class HDInsightPigActivityTypeProperties implements JsonSerializable<HDInsightPigActivityTypeProperties> {
    /*
     * Storage linked service references.
     */
    private List<LinkedServiceReference> storageLinkedServices;

    /*
     * User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
     */
    private Object arguments;

    /*
     * Debug info option.
     */
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /*
     * Script path. Type: string (or Expression with resultType string).
     */
    private Object scriptPath;

    /*
     * Script linked service reference.
     */
    private LinkedServiceReference scriptLinkedService;

    /*
     * Allows user to specify defines for Pig job request.
     */
    private Map<String, Object> defines;

    /**
     * Creates an instance of HDInsightPigActivityTypeProperties class.
     */
    public HDInsightPigActivityTypeProperties() {
    }

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     * 
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     * 
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties
        withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity. Type: array (or Expression with
     * resultType array).
     * 
     * @return the arguments value.
     */
    public Object arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity. Type: array (or Expression with
     * resultType array).
     * 
     * @param arguments the arguments value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     * 
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     * 
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get the scriptPath property: Script path. Type: string (or Expression with resultType string).
     * 
     * @return the scriptPath value.
     */
    public Object scriptPath() {
        return this.scriptPath;
    }

    /**
     * Set the scriptPath property: Script path. Type: string (or Expression with resultType string).
     * 
     * @param scriptPath the scriptPath value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withScriptPath(Object scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Get the scriptLinkedService property: Script linked service reference.
     * 
     * @return the scriptLinkedService value.
     */
    public LinkedServiceReference scriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Set the scriptLinkedService property: Script linked service reference.
     * 
     * @param scriptLinkedService the scriptLinkedService value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        this.scriptLinkedService = scriptLinkedService;
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for Pig job request.
     * 
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set the defines property: Allows user to specify defines for Pig job request.
     * 
     * @param defines the defines value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageLinkedServices() != null) {
            storageLinkedServices().forEach(e -> e.validate());
        }
        if (scriptLinkedService() != null) {
            scriptLinkedService().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("storageLinkedServices", this.storageLinkedServices,
            (writer, element) -> writer.writeJson(element));
        if (this.arguments != null) {
            jsonWriter.writeUntypedField("arguments", this.arguments);
        }
        jsonWriter.writeStringField("getDebugInfo", this.getDebugInfo == null ? null : this.getDebugInfo.toString());
        if (this.scriptPath != null) {
            jsonWriter.writeUntypedField("scriptPath", this.scriptPath);
        }
        jsonWriter.writeJsonField("scriptLinkedService", this.scriptLinkedService);
        jsonWriter.writeMapField("defines", this.defines, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HDInsightPigActivityTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HDInsightPigActivityTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HDInsightPigActivityTypeProperties.
     */
    public static HDInsightPigActivityTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HDInsightPigActivityTypeProperties deserializedHDInsightPigActivityTypeProperties
                = new HDInsightPigActivityTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageLinkedServices".equals(fieldName)) {
                    List<LinkedServiceReference> storageLinkedServices
                        = reader.readArray(reader1 -> LinkedServiceReference.fromJson(reader1));
                    deserializedHDInsightPigActivityTypeProperties.storageLinkedServices = storageLinkedServices;
                } else if ("arguments".equals(fieldName)) {
                    deserializedHDInsightPigActivityTypeProperties.arguments = reader.readUntyped();
                } else if ("getDebugInfo".equals(fieldName)) {
                    deserializedHDInsightPigActivityTypeProperties.getDebugInfo
                        = HDInsightActivityDebugInfoOption.fromString(reader.getString());
                } else if ("scriptPath".equals(fieldName)) {
                    deserializedHDInsightPigActivityTypeProperties.scriptPath = reader.readUntyped();
                } else if ("scriptLinkedService".equals(fieldName)) {
                    deserializedHDInsightPigActivityTypeProperties.scriptLinkedService
                        = LinkedServiceReference.fromJson(reader);
                } else if ("defines".equals(fieldName)) {
                    Map<String, Object> defines = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedHDInsightPigActivityTypeProperties.defines = defines;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHDInsightPigActivityTypeProperties;
        });
    }
}
