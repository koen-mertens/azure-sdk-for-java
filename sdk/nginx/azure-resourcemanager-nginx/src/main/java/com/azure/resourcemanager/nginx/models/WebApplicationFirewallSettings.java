// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings for the NGINX App Protect Web Application Firewall (WAF).
 */
@Fluent
public final class WebApplicationFirewallSettings implements JsonSerializable<WebApplicationFirewallSettings> {
    /*
     * The activation state of the WAF. Use 'Enabled' to enable the WAF and 'Disabled' to disable it.
     */
    private ActivationState activationState;

    /**
     * Creates an instance of WebApplicationFirewallSettings class.
     */
    public WebApplicationFirewallSettings() {
    }

    /**
     * Get the activationState property: The activation state of the WAF. Use 'Enabled' to enable the WAF and 'Disabled'
     * to disable it.
     * 
     * @return the activationState value.
     */
    public ActivationState activationState() {
        return this.activationState;
    }

    /**
     * Set the activationState property: The activation state of the WAF. Use 'Enabled' to enable the WAF and 'Disabled'
     * to disable it.
     * 
     * @param activationState the activationState value to set.
     * @return the WebApplicationFirewallSettings object itself.
     */
    public WebApplicationFirewallSettings withActivationState(ActivationState activationState) {
        this.activationState = activationState;
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
        jsonWriter.writeStringField("activationState",
            this.activationState == null ? null : this.activationState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebApplicationFirewallSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebApplicationFirewallSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebApplicationFirewallSettings.
     */
    public static WebApplicationFirewallSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebApplicationFirewallSettings deserializedWebApplicationFirewallSettings
                = new WebApplicationFirewallSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("activationState".equals(fieldName)) {
                    deserializedWebApplicationFirewallSettings.activationState
                        = ActivationState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebApplicationFirewallSettings;
        });
    }
}
