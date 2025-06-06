// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.notificationhubs.models.AdmCredential;
import com.azure.resourcemanager.notificationhubs.models.ApnsCredential;
import com.azure.resourcemanager.notificationhubs.models.BaiduCredential;
import com.azure.resourcemanager.notificationhubs.models.GcmCredential;
import com.azure.resourcemanager.notificationhubs.models.MpnsCredential;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import com.azure.resourcemanager.notificationhubs.models.WnsCredential;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Description of a NotificationHub Resource.
 */
@Fluent
public final class NotificationHubResourceInner extends Resource {
    /*
     * Properties of the NotificationHub.
     */
    private NotificationHubProperties innerProperties;

    /*
     * The sku of the created namespace
     */
    private Sku sku;

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
     * Creates an instance of NotificationHubResourceInner class.
     */
    public NotificationHubResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the NotificationHub.
     * 
     * @return the innerProperties value.
     */
    private NotificationHubProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: The sku of the created namespace.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the created namespace.
     * 
     * @param sku the sku value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withSku(Sku sku) {
        this.sku = sku;
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
    public NotificationHubResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationHubResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the name property: The NotificationHub name.
     * 
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: The NotificationHub name.
     * 
     * @param name the name value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withNamePropertiesName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Get the registrationTtl property: The RegistrationTtl of the created NotificationHub.
     * 
     * @return the registrationTtl value.
     */
    public String registrationTtl() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationTtl();
    }

    /**
     * Set the registrationTtl property: The RegistrationTtl of the created NotificationHub.
     * 
     * @param registrationTtl the registrationTtl value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withRegistrationTtl(String registrationTtl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withRegistrationTtl(registrationTtl);
        return this;
    }

    /**
     * Get the authorizationRules property: The AuthorizationRules of the created NotificationHub.
     * 
     * @return the authorizationRules value.
     */
    public List<SharedAccessAuthorizationRuleProperties> authorizationRules() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationRules();
    }

    /**
     * Set the authorizationRules property: The AuthorizationRules of the created NotificationHub.
     * 
     * @param authorizationRules the authorizationRules value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner
        withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withAuthorizationRules(authorizationRules);
        return this;
    }

    /**
     * Get the apnsCredential property: The ApnsCredential of the created NotificationHub.
     * 
     * @return the apnsCredential value.
     */
    public ApnsCredential apnsCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().apnsCredential();
    }

    /**
     * Set the apnsCredential property: The ApnsCredential of the created NotificationHub.
     * 
     * @param apnsCredential the apnsCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withApnsCredential(ApnsCredential apnsCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withApnsCredential(apnsCredential);
        return this;
    }

    /**
     * Get the wnsCredential property: The WnsCredential of the created NotificationHub.
     * 
     * @return the wnsCredential value.
     */
    public WnsCredential wnsCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().wnsCredential();
    }

    /**
     * Set the wnsCredential property: The WnsCredential of the created NotificationHub.
     * 
     * @param wnsCredential the wnsCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withWnsCredential(WnsCredential wnsCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withWnsCredential(wnsCredential);
        return this;
    }

    /**
     * Get the gcmCredential property: The GcmCredential of the created NotificationHub.
     * 
     * @return the gcmCredential value.
     */
    public GcmCredential gcmCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().gcmCredential();
    }

    /**
     * Set the gcmCredential property: The GcmCredential of the created NotificationHub.
     * 
     * @param gcmCredential the gcmCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withGcmCredential(GcmCredential gcmCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withGcmCredential(gcmCredential);
        return this;
    }

    /**
     * Get the mpnsCredential property: The MpnsCredential of the created NotificationHub.
     * 
     * @return the mpnsCredential value.
     */
    public MpnsCredential mpnsCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().mpnsCredential();
    }

    /**
     * Set the mpnsCredential property: The MpnsCredential of the created NotificationHub.
     * 
     * @param mpnsCredential the mpnsCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withMpnsCredential(MpnsCredential mpnsCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withMpnsCredential(mpnsCredential);
        return this;
    }

    /**
     * Get the admCredential property: The AdmCredential of the created NotificationHub.
     * 
     * @return the admCredential value.
     */
    public AdmCredential admCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().admCredential();
    }

    /**
     * Set the admCredential property: The AdmCredential of the created NotificationHub.
     * 
     * @param admCredential the admCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withAdmCredential(AdmCredential admCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withAdmCredential(admCredential);
        return this;
    }

    /**
     * Get the baiduCredential property: The BaiduCredential of the created NotificationHub.
     * 
     * @return the baiduCredential value.
     */
    public BaiduCredential baiduCredential() {
        return this.innerProperties() == null ? null : this.innerProperties().baiduCredential();
    }

    /**
     * Set the baiduCredential property: The BaiduCredential of the created NotificationHub.
     * 
     * @param baiduCredential the baiduCredential value to set.
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withBaiduCredential(BaiduCredential baiduCredential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NotificationHubProperties();
        }
        this.innerProperties().withBaiduCredential(baiduCredential);
        return this;
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NotificationHubResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NotificationHubResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NotificationHubResourceInner.
     */
    public static NotificationHubResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NotificationHubResourceInner deserializedNotificationHubResourceInner = new NotificationHubResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNotificationHubResourceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.innerProperties
                        = NotificationHubProperties.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedNotificationHubResourceInner.sku = Sku.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNotificationHubResourceInner;
        });
    }
}
