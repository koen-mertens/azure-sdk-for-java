// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.nginx.models.ScaleProfile;
import java.io.IOException;
import java.util.List;

/**
 * The settings for enabling automatic scaling of the deployment. If this field is specified, 'scale.capacity' must be
 * empty.
 */
@Fluent
public final class NginxDeploymentScalingPropertiesAutoScaleSettings
    implements JsonSerializable<NginxDeploymentScalingPropertiesAutoScaleSettings> {
    /*
     * The profiles property.
     */
    private List<ScaleProfile> profiles;

    /**
     * Creates an instance of NginxDeploymentScalingPropertiesAutoScaleSettings class.
     */
    public NginxDeploymentScalingPropertiesAutoScaleSettings() {
    }

    /**
     * Get the profiles property: The profiles property.
     * 
     * @return the profiles value.
     */
    public List<ScaleProfile> profiles() {
        return this.profiles;
    }

    /**
     * Set the profiles property: The profiles property.
     * 
     * @param profiles the profiles value to set.
     * @return the NginxDeploymentScalingPropertiesAutoScaleSettings object itself.
     */
    public NginxDeploymentScalingPropertiesAutoScaleSettings withProfiles(List<ScaleProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (profiles() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property profiles in model NginxDeploymentScalingPropertiesAutoScaleSettings"));
        } else {
            profiles().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(NginxDeploymentScalingPropertiesAutoScaleSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("profiles", this.profiles, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NginxDeploymentScalingPropertiesAutoScaleSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NginxDeploymentScalingPropertiesAutoScaleSettings if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NginxDeploymentScalingPropertiesAutoScaleSettings.
     */
    public static NginxDeploymentScalingPropertiesAutoScaleSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NginxDeploymentScalingPropertiesAutoScaleSettings deserializedNginxDeploymentScalingPropertiesAutoScaleSettings
                = new NginxDeploymentScalingPropertiesAutoScaleSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("profiles".equals(fieldName)) {
                    List<ScaleProfile> profiles = reader.readArray(reader1 -> ScaleProfile.fromJson(reader1));
                    deserializedNginxDeploymentScalingPropertiesAutoScaleSettings.profiles = profiles;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNginxDeploymentScalingPropertiesAutoScaleSettings;
        });
    }
}
