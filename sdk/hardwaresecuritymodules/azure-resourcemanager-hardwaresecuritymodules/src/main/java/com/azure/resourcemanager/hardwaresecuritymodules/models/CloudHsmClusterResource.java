// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Cloud HSM Cluster Resource.
 */
@Fluent
public class CloudHsmClusterResource extends Resource {
    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    private ManagedServiceIdentity identity;

    /*
     * SKU details
     */
    private CloudHsmClusterSku sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of CloudHsmClusterResource class.
     */
    public CloudHsmClusterResource() {
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the CloudHsmClusterResource object itself.
     */
    public CloudHsmClusterResource withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: SKU details.
     * 
     * @return the sku value.
     */
    public CloudHsmClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     * 
     * @param sku the sku value to set.
     * @return the CloudHsmClusterResource object itself.
     */
    public CloudHsmClusterResource withSku(CloudHsmClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @param systemData the systemData value to set.
     * @return the CloudHsmClusterResource object itself.
     */
    CloudHsmClusterResource withSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public CloudHsmClusterResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudHsmClusterResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudHsmClusterResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudHsmClusterResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CloudHsmClusterResource.
     */
    public static CloudHsmClusterResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudHsmClusterResource deserializedCloudHsmClusterResource = new CloudHsmClusterResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCloudHsmClusterResource.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.sku = CloudHsmClusterSku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedCloudHsmClusterResource.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudHsmClusterResource;
        });
    }
}
