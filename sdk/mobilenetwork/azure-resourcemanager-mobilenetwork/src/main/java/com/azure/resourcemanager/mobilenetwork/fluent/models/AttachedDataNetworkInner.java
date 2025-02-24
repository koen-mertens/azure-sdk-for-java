// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Attached data network resource. Must be created in the same location as its parent packet core data plane.
 */
@Fluent
public final class AttachedDataNetworkInner extends Resource {
    /*
     * Attached data network properties.
     */
    private AttachedDataNetworkPropertiesFormat innerProperties = new AttachedDataNetworkPropertiesFormat();

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
     * Creates an instance of AttachedDataNetworkInner class.
     */
    public AttachedDataNetworkInner() {
    }

    /**
     * Get the innerProperties property: Attached data network properties.
     * 
     * @return the innerProperties value.
     */
    private AttachedDataNetworkPropertiesFormat innerProperties() {
        return this.innerProperties;
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
    public AttachedDataNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachedDataNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the attached data network resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the userPlaneDataInterface property: The user plane interface on the data network. For 5G networks, this is
     * the N6 interface. For 4G networks, this is the SGi interface.
     * 
     * @return the userPlaneDataInterface value.
     */
    public InterfaceProperties userPlaneDataInterface() {
        return this.innerProperties() == null ? null : this.innerProperties().userPlaneDataInterface();
    }

    /**
     * Set the userPlaneDataInterface property: The user plane interface on the data network. For 5G networks, this is
     * the N6 interface. For 4G networks, this is the SGi interface.
     * 
     * @param userPlaneDataInterface the userPlaneDataInterface value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withUserPlaneDataInterface(InterfaceProperties userPlaneDataInterface) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserPlaneDataInterface(userPlaneDataInterface);
        return this;
    }

    /**
     * Get the dnsAddresses property: The DNS servers to signal to UEs to use for this attached data network. This
     * configuration is mandatory - if you don't want DNS servers, you must provide an empty array.
     * 
     * @return the dnsAddresses value.
     */
    public List<String> dnsAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsAddresses();
    }

    /**
     * Set the dnsAddresses property: The DNS servers to signal to UEs to use for this attached data network. This
     * configuration is mandatory - if you don't want DNS servers, you must provide an empty array.
     * 
     * @param dnsAddresses the dnsAddresses value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withDnsAddresses(List<String> dnsAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withDnsAddresses(dnsAddresses);
        return this;
    }

    /**
     * Get the naptConfiguration property: The network address and port translation (NAPT) configuration.
     * If this is not specified, the attached data network will use a default NAPT configuration with NAPT enabled.
     * 
     * @return the naptConfiguration value.
     */
    public NaptConfiguration naptConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().naptConfiguration();
    }

    /**
     * Set the naptConfiguration property: The network address and port translation (NAPT) configuration.
     * If this is not specified, the attached data network will use a default NAPT configuration with NAPT enabled.
     * 
     * @param naptConfiguration the naptConfiguration value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withNaptConfiguration(NaptConfiguration naptConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withNaptConfiguration(naptConfiguration);
        return this;
    }

    /**
     * Get the userEquipmentAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the attached
     * data network from which the packet core instance will dynamically assign IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session.
     * You must define at least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix. If you
     * define both, they must be of the same size.
     * 
     * @return the userEquipmentAddressPoolPrefix value.
     */
    public List<String> userEquipmentAddressPoolPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().userEquipmentAddressPoolPrefix();
    }

    /**
     * Set the userEquipmentAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the attached
     * data network from which the packet core instance will dynamically assign IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session.
     * You must define at least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix. If you
     * define both, they must be of the same size.
     * 
     * @param userEquipmentAddressPoolPrefix the userEquipmentAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withUserEquipmentAddressPoolPrefix(List<String> userEquipmentAddressPoolPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserEquipmentAddressPoolPrefix(userEquipmentAddressPoolPrefix);
        return this;
    }

    /**
     * Get the userEquipmentStaticAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the
     * attached data network from which the packet core instance will assign static IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session. The static IP address
     * for a specific UE is set in StaticIPConfiguration on the corresponding SIM resource.
     * At least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both
     * are defined, they must be of the same size.
     * 
     * @return the userEquipmentStaticAddressPoolPrefix value.
     */
    public List<String> userEquipmentStaticAddressPoolPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().userEquipmentStaticAddressPoolPrefix();
    }

    /**
     * Set the userEquipmentStaticAddressPoolPrefix property: The user equipment (UE) address pool prefixes for the
     * attached data network from which the packet core instance will assign static IP addresses to UEs.
     * The packet core instance assigns an IP address to a UE when the UE sets up a PDU session. The static IP address
     * for a specific UE is set in StaticIPConfiguration on the corresponding SIM resource.
     * At least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both
     * are defined, they must be of the same size.
     * 
     * @param userEquipmentStaticAddressPoolPrefix the userEquipmentStaticAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner
        withUserEquipmentStaticAddressPoolPrefix(List<String> userEquipmentStaticAddressPoolPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserEquipmentStaticAddressPoolPrefix(userEquipmentStaticAddressPoolPrefix);
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
                    "Missing required property innerProperties in model AttachedDataNetworkInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AttachedDataNetworkInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AttachedDataNetworkInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AttachedDataNetworkInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AttachedDataNetworkInner.
     */
    public static AttachedDataNetworkInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AttachedDataNetworkInner deserializedAttachedDataNetworkInner = new AttachedDataNetworkInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAttachedDataNetworkInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.innerProperties
                        = AttachedDataNetworkPropertiesFormat.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAttachedDataNetworkInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAttachedDataNetworkInner;
        });
    }
}
