// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.peering.models.LearnedType;
import com.azure.resourcemanager.peering.models.PeeringServicePrefixEvent;
import com.azure.resourcemanager.peering.models.PrefixValidationState;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * The peering service prefix class.
 */
@Fluent
public final class PeeringServicePrefixInner extends ProxyResource {
    /*
     * Gets or sets the peering prefix properties.
     */
    private PeeringServicePrefixProperties innerProperties;

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
     * Creates an instance of PeeringServicePrefixInner class.
     */
    public PeeringServicePrefixInner() {
    }

    /**
     * Get the innerProperties property: Gets or sets the peering prefix properties.
     * 
     * @return the innerProperties value.
     */
    private PeeringServicePrefixProperties innerProperties() {
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
     * Get the prefix property: The prefix from which your traffic originates.
     * 
     * @return the prefix value.
     */
    public String prefix() {
        return this.innerProperties() == null ? null : this.innerProperties().prefix();
    }

    /**
     * Set the prefix property: The prefix from which your traffic originates.
     * 
     * @param prefix the prefix value to set.
     * @return the PeeringServicePrefixInner object itself.
     */
    public PeeringServicePrefixInner withPrefix(String prefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServicePrefixProperties();
        }
        this.innerProperties().withPrefix(prefix);
        return this;
    }

    /**
     * Get the prefixValidationState property: The prefix validation state.
     * 
     * @return the prefixValidationState value.
     */
    public PrefixValidationState prefixValidationState() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixValidationState();
    }

    /**
     * Get the learnedType property: The prefix learned type.
     * 
     * @return the learnedType value.
     */
    public LearnedType learnedType() {
        return this.innerProperties() == null ? null : this.innerProperties().learnedType();
    }

    /**
     * Get the errorMessage property: The error message for validation state.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
    }

    /**
     * Get the events property: The list of events for peering service prefix.
     * 
     * @return the events value.
     */
    public List<PeeringServicePrefixEvent> events() {
        return this.innerProperties() == null ? null : this.innerProperties().events();
    }

    /**
     * Get the peeringServicePrefixKey property: The peering service prefix key.
     * 
     * @return the peeringServicePrefixKey value.
     */
    public String peeringServicePrefixKey() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringServicePrefixKey();
    }

    /**
     * Set the peeringServicePrefixKey property: The peering service prefix key.
     * 
     * @param peeringServicePrefixKey the peeringServicePrefixKey value to set.
     * @return the PeeringServicePrefixInner object itself.
     */
    public PeeringServicePrefixInner withPeeringServicePrefixKey(String peeringServicePrefixKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServicePrefixProperties();
        }
        this.innerProperties().withPeeringServicePrefixKey(peeringServicePrefixKey);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
     * Reads an instance of PeeringServicePrefixInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeeringServicePrefixInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PeeringServicePrefixInner.
     */
    public static PeeringServicePrefixInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeeringServicePrefixInner deserializedPeeringServicePrefixInner = new PeeringServicePrefixInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPeeringServicePrefixInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPeeringServicePrefixInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPeeringServicePrefixInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPeeringServicePrefixInner.innerProperties
                        = PeeringServicePrefixProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeeringServicePrefixInner;
        });
    }
}
