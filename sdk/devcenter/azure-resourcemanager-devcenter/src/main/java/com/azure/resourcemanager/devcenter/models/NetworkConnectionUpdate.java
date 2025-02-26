// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.fluent.models.NetworkConnectionUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * The network connection properties for partial update. Properties not provided in the update request will not be
 * changed.
 */
@Fluent
public final class NetworkConnectionUpdate extends TrackedResourceUpdate {
    /*
     * Properties of a network connection resource to be updated.
     */
    private NetworkConnectionUpdateProperties innerProperties;

    /**
     * Creates an instance of NetworkConnectionUpdate class.
     */
    public NetworkConnectionUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of a network connection resource to be updated.
     * 
     * @return the innerProperties value.
     */
    private NetworkConnectionUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkConnectionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkConnectionUpdate withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the subnetId property: The subnet to attach Virtual Machines to.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: The subnet to attach Virtual Machines to.
     * 
     * @param subnetId the subnetId value to set.
     * @return the NetworkConnectionUpdate object itself.
     */
    public NetworkConnectionUpdate withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkConnectionUpdateProperties();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Get the domainName property: Active Directory domain name.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.innerProperties() == null ? null : this.innerProperties().domainName();
    }

    /**
     * Set the domainName property: Active Directory domain name.
     * 
     * @param domainName the domainName value to set.
     * @return the NetworkConnectionUpdate object itself.
     */
    public NetworkConnectionUpdate withDomainName(String domainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkConnectionUpdateProperties();
        }
        this.innerProperties().withDomainName(domainName);
        return this;
    }

    /**
     * Get the organizationUnit property: Active Directory domain Organization Unit (OU).
     * 
     * @return the organizationUnit value.
     */
    public String organizationUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().organizationUnit();
    }

    /**
     * Set the organizationUnit property: Active Directory domain Organization Unit (OU).
     * 
     * @param organizationUnit the organizationUnit value to set.
     * @return the NetworkConnectionUpdate object itself.
     */
    public NetworkConnectionUpdate withOrganizationUnit(String organizationUnit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkConnectionUpdateProperties();
        }
        this.innerProperties().withOrganizationUnit(organizationUnit);
        return this;
    }

    /**
     * Get the domainUsername property: The username of an Active Directory account (user or service account) that has
     * permissions to create computer objects in Active Directory. Required format: admin&#064;contoso.com.
     * 
     * @return the domainUsername value.
     */
    public String domainUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().domainUsername();
    }

    /**
     * Set the domainUsername property: The username of an Active Directory account (user or service account) that has
     * permissions to create computer objects in Active Directory. Required format: admin&#064;contoso.com.
     * 
     * @param domainUsername the domainUsername value to set.
     * @return the NetworkConnectionUpdate object itself.
     */
    public NetworkConnectionUpdate withDomainUsername(String domainUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkConnectionUpdateProperties();
        }
        this.innerProperties().withDomainUsername(domainUsername);
        return this;
    }

    /**
     * Get the domainPassword property: The password for the account used to join domain.
     * 
     * @return the domainPassword value.
     */
    public String domainPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().domainPassword();
    }

    /**
     * Set the domainPassword property: The password for the account used to join domain.
     * 
     * @param domainPassword the domainPassword value to set.
     * @return the NetworkConnectionUpdate object itself.
     */
    public NetworkConnectionUpdate withDomainPassword(String domainPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkConnectionUpdateProperties();
        }
        this.innerProperties().withDomainPassword(domainPassword);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkConnectionUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkConnectionUpdate if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkConnectionUpdate.
     */
    public static NetworkConnectionUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkConnectionUpdate deserializedNetworkConnectionUpdate = new NetworkConnectionUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNetworkConnectionUpdate.withTags(tags);
                } else if ("location".equals(fieldName)) {
                    deserializedNetworkConnectionUpdate.withLocation(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkConnectionUpdate.innerProperties
                        = NetworkConnectionUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkConnectionUpdate;
        });
    }
}
