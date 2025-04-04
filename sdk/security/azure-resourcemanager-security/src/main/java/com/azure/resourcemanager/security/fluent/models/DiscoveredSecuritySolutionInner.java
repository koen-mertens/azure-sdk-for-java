// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.SecurityFamily;
import java.io.IOException;

/**
 * The DiscoveredSecuritySolution model.
 */
@Fluent
public final class DiscoveredSecuritySolutionInner extends ProxyResource {
    /*
     * The properties property.
     */
    private DiscoveredSecuritySolutionProperties innerProperties = new DiscoveredSecuritySolutionProperties();

    /*
     * Location where the resource is stored
     */
    private String location;

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
     * Creates an instance of DiscoveredSecuritySolutionInner class.
     */
    public DiscoveredSecuritySolutionInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private DiscoveredSecuritySolutionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Location where the resource is stored.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
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
     * Get the securityFamily property: The security family of the discovered solution.
     * 
     * @return the securityFamily value.
     */
    public SecurityFamily securityFamily() {
        return this.innerProperties() == null ? null : this.innerProperties().securityFamily();
    }

    /**
     * Set the securityFamily property: The security family of the discovered solution.
     * 
     * @param securityFamily the securityFamily value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSecurityFamily(SecurityFamily securityFamily) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withSecurityFamily(securityFamily);
        return this;
    }

    /**
     * Get the offer property: The security solutions' image offer.
     * 
     * @return the offer value.
     */
    public String offer() {
        return this.innerProperties() == null ? null : this.innerProperties().offer();
    }

    /**
     * Set the offer property: The security solutions' image offer.
     * 
     * @param offer the offer value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withOffer(String offer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withOffer(offer);
        return this;
    }

    /**
     * Get the publisher property: The security solutions' image publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Set the publisher property: The security solutions' image publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withPublisher(String publisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withPublisher(publisher);
        return this;
    }

    /**
     * Get the sku property: The security solutions' image sku.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The security solutions' image sku.
     * 
     * @param sku the sku value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSku(String sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model DiscoveredSecuritySolutionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiscoveredSecuritySolutionInner.class);

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
     * Reads an instance of DiscoveredSecuritySolutionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiscoveredSecuritySolutionInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiscoveredSecuritySolutionInner.
     */
    public static DiscoveredSecuritySolutionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiscoveredSecuritySolutionInner deserializedDiscoveredSecuritySolutionInner
                = new DiscoveredSecuritySolutionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDiscoveredSecuritySolutionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDiscoveredSecuritySolutionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDiscoveredSecuritySolutionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDiscoveredSecuritySolutionInner.innerProperties
                        = DiscoveredSecuritySolutionProperties.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedDiscoveredSecuritySolutionInner.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiscoveredSecuritySolutionInner;
        });
    }
}
