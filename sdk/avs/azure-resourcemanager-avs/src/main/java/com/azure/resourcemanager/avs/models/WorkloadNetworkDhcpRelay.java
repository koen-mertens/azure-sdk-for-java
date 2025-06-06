// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * NSX DHCP Relay.
 */
@Fluent
public final class WorkloadNetworkDhcpRelay extends WorkloadNetworkDhcpEntity {
    /*
     * Type of DHCP: SERVER or RELAY.
     */
    private DhcpTypeEnum dhcpType = DhcpTypeEnum.RELAY;

    /*
     * DHCP Relay Addresses. Max 3.
     */
    private List<String> serverAddresses;

    /**
     * Creates an instance of WorkloadNetworkDhcpRelay class.
     */
    public WorkloadNetworkDhcpRelay() {
    }

    /**
     * Get the dhcpType property: Type of DHCP: SERVER or RELAY.
     * 
     * @return the dhcpType value.
     */
    @Override
    public DhcpTypeEnum dhcpType() {
        return this.dhcpType;
    }

    /**
     * Get the serverAddresses property: DHCP Relay Addresses. Max 3.
     * 
     * @return the serverAddresses value.
     */
    public List<String> serverAddresses() {
        return this.serverAddresses;
    }

    /**
     * Set the serverAddresses property: DHCP Relay Addresses. Max 3.
     * 
     * @param serverAddresses the serverAddresses value to set.
     * @return the WorkloadNetworkDhcpRelay object itself.
     */
    public WorkloadNetworkDhcpRelay withServerAddresses(List<String> serverAddresses) {
        this.serverAddresses = serverAddresses;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkloadNetworkDhcpRelay withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkloadNetworkDhcpRelay withRevision(Long revision) {
        super.withRevision(revision);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", displayName());
        jsonWriter.writeNumberField("revision", revision());
        jsonWriter.writeStringField("dhcpType", this.dhcpType == null ? null : this.dhcpType.toString());
        jsonWriter.writeArrayField("serverAddresses", this.serverAddresses,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkDhcpRelay from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkDhcpRelay if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadNetworkDhcpRelay.
     */
    public static WorkloadNetworkDhcpRelay fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkDhcpRelay deserializedWorkloadNetworkDhcpRelay = new WorkloadNetworkDhcpRelay();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpRelay.withDisplayName(reader.getString());
                } else if ("segments".equals(fieldName)) {
                    List<String> segments = reader.readArray(reader1 -> reader1.getString());
                    deserializedWorkloadNetworkDhcpRelay.withSegments(segments);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpRelay
                        .withProvisioningState(WorkloadNetworkDhcpProvisioningState.fromString(reader.getString()));
                } else if ("revision".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpRelay.withRevision(reader.getNullable(JsonReader::getLong));
                } else if ("dhcpType".equals(fieldName)) {
                    deserializedWorkloadNetworkDhcpRelay.dhcpType = DhcpTypeEnum.fromString(reader.getString());
                } else if ("serverAddresses".equals(fieldName)) {
                    List<String> serverAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedWorkloadNetworkDhcpRelay.serverAddresses = serverAddresses;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkDhcpRelay;
        });
    }
}
