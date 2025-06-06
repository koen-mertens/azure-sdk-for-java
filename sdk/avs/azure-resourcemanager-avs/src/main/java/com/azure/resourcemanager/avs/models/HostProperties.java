// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties of a host.
 */
@Fluent
public class HostProperties implements JsonSerializable<HostProperties> {
    /*
     * The kind of host
     */
    private HostKind kind = HostKind.fromString("HostProperties");

    /*
     * The state of the host provisioning.
     */
    private HostProvisioningState provisioningState;

    /*
     * Display name of the host in VMware vCenter.
     */
    private String displayName;

    /*
     * vCenter managed object reference ID of the host.
     */
    private String moRefId;

    /*
     * Fully qualified domain name of the host.
     */
    private String fqdn;

    /*
     * If provided, the host is in maintenance. The value is the reason for maintenance.
     */
    private HostMaintenance maintenance;

    /*
     * The faultDomain property.
     */
    private String faultDomain;

    /**
     * Creates an instance of HostProperties class.
     */
    public HostProperties() {
    }

    /**
     * Get the kind property: The kind of host.
     * 
     * @return the kind value.
     */
    public HostKind kind() {
        return this.kind;
    }

    /**
     * Get the provisioningState property: The state of the host provisioning.
     * 
     * @return the provisioningState value.
     */
    public HostProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The state of the host provisioning.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the HostProperties object itself.
     */
    HostProperties withProvisioningState(HostProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the displayName property: Display name of the host in VMware vCenter.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the host in VMware vCenter.
     * 
     * @param displayName the displayName value to set.
     * @return the HostProperties object itself.
     */
    public HostProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the moRefId property: vCenter managed object reference ID of the host.
     * 
     * @return the moRefId value.
     */
    public String moRefId() {
        return this.moRefId;
    }

    /**
     * Set the moRefId property: vCenter managed object reference ID of the host.
     * 
     * @param moRefId the moRefId value to set.
     * @return the HostProperties object itself.
     */
    HostProperties withMoRefId(String moRefId) {
        this.moRefId = moRefId;
        return this;
    }

    /**
     * Get the fqdn property: Fully qualified domain name of the host.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fully qualified domain name of the host.
     * 
     * @param fqdn the fqdn value to set.
     * @return the HostProperties object itself.
     */
    HostProperties withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the maintenance property: If provided, the host is in maintenance. The value is the reason for maintenance.
     * 
     * @return the maintenance value.
     */
    public HostMaintenance maintenance() {
        return this.maintenance;
    }

    /**
     * Set the maintenance property: If provided, the host is in maintenance. The value is the reason for maintenance.
     * 
     * @param maintenance the maintenance value to set.
     * @return the HostProperties object itself.
     */
    public HostProperties withMaintenance(HostMaintenance maintenance) {
        this.maintenance = maintenance;
        return this;
    }

    /**
     * Get the faultDomain property: The faultDomain property.
     * 
     * @return the faultDomain value.
     */
    public String faultDomain() {
        return this.faultDomain;
    }

    /**
     * Set the faultDomain property: The faultDomain property.
     * 
     * @param faultDomain the faultDomain value to set.
     * @return the HostProperties object itself.
     */
    HostProperties withFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
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
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("maintenance", this.maintenance == null ? null : this.maintenance.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HostProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HostProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HostProperties.
     */
    public static HostProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("General".equals(discriminatorValue)) {
                    return GeneralHostProperties.fromJson(readerToUse.reset());
                } else if ("Specialized".equals(discriminatorValue)) {
                    return SpecializedHostProperties.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static HostProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HostProperties deserializedHostProperties = new HostProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedHostProperties.kind = HostKind.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedHostProperties.provisioningState = HostProvisioningState.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedHostProperties.displayName = reader.getString();
                } else if ("moRefId".equals(fieldName)) {
                    deserializedHostProperties.moRefId = reader.getString();
                } else if ("fqdn".equals(fieldName)) {
                    deserializedHostProperties.fqdn = reader.getString();
                } else if ("maintenance".equals(fieldName)) {
                    deserializedHostProperties.maintenance = HostMaintenance.fromString(reader.getString());
                } else if ("faultDomain".equals(fieldName)) {
                    deserializedHostProperties.faultDomain = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHostProperties;
        });
    }
}
