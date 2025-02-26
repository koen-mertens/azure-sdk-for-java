// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties describing the software upgrade state of the cache.
 */
@Immutable
public final class CacheUpgradeStatus implements JsonSerializable<CacheUpgradeStatus> {
    /*
     * Version string of the firmware currently installed on this cache.
     */
    private String currentFirmwareVersion;

    /*
     * True if there is a firmware update ready to install on this cache. The firmware will automatically be installed
     * after firmwareUpdateDeadline if not triggered earlier via the upgrade operation.
     */
    private FirmwareStatusType firmwareUpdateStatus;

    /*
     * Time at which the pending firmware update will automatically be installed on the cache.
     */
    private OffsetDateTime firmwareUpdateDeadline;

    /*
     * Time of the last successful firmware update.
     */
    private OffsetDateTime lastFirmwareUpdate;

    /*
     * When firmwareUpdateAvailable is true, this field holds the version string for the update.
     */
    private String pendingFirmwareVersion;

    /**
     * Creates an instance of CacheUpgradeStatus class.
     */
    public CacheUpgradeStatus() {
    }

    /**
     * Get the currentFirmwareVersion property: Version string of the firmware currently installed on this cache.
     * 
     * @return the currentFirmwareVersion value.
     */
    public String currentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /**
     * Get the firmwareUpdateStatus property: True if there is a firmware update ready to install on this cache. The
     * firmware will automatically be installed after firmwareUpdateDeadline if not triggered earlier via the upgrade
     * operation.
     * 
     * @return the firmwareUpdateStatus value.
     */
    public FirmwareStatusType firmwareUpdateStatus() {
        return this.firmwareUpdateStatus;
    }

    /**
     * Get the firmwareUpdateDeadline property: Time at which the pending firmware update will automatically be
     * installed on the cache.
     * 
     * @return the firmwareUpdateDeadline value.
     */
    public OffsetDateTime firmwareUpdateDeadline() {
        return this.firmwareUpdateDeadline;
    }

    /**
     * Get the lastFirmwareUpdate property: Time of the last successful firmware update.
     * 
     * @return the lastFirmwareUpdate value.
     */
    public OffsetDateTime lastFirmwareUpdate() {
        return this.lastFirmwareUpdate;
    }

    /**
     * Get the pendingFirmwareVersion property: When firmwareUpdateAvailable is true, this field holds the version
     * string for the update.
     * 
     * @return the pendingFirmwareVersion value.
     */
    public String pendingFirmwareVersion() {
        return this.pendingFirmwareVersion;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CacheUpgradeStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CacheUpgradeStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CacheUpgradeStatus.
     */
    public static CacheUpgradeStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CacheUpgradeStatus deserializedCacheUpgradeStatus = new CacheUpgradeStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currentFirmwareVersion".equals(fieldName)) {
                    deserializedCacheUpgradeStatus.currentFirmwareVersion = reader.getString();
                } else if ("firmwareUpdateStatus".equals(fieldName)) {
                    deserializedCacheUpgradeStatus.firmwareUpdateStatus
                        = FirmwareStatusType.fromString(reader.getString());
                } else if ("firmwareUpdateDeadline".equals(fieldName)) {
                    deserializedCacheUpgradeStatus.firmwareUpdateDeadline = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastFirmwareUpdate".equals(fieldName)) {
                    deserializedCacheUpgradeStatus.lastFirmwareUpdate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("pendingFirmwareVersion".equals(fieldName)) {
                    deserializedCacheUpgradeStatus.pendingFirmwareVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCacheUpgradeStatus;
        });
    }
}
