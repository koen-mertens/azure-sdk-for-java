// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * A2A provider specific settings.
 */
@Fluent
public final class A2ASharedDiskReplicationDetails extends SharedDiskReplicationProviderSpecificSettings {
    /*
     * Gets the Instance type.
     */
    private String instanceType = "A2A";

    /*
     * The management Id.
     */
    private String managementId;

    /*
     * The list of unprotected disks.
     */
    private List<A2AUnprotectedDiskDetails> unprotectedDisks;

    /*
     * The list of protected managed disks.
     */
    private List<A2AProtectedManagedDiskDetails> protectedManagedDisks;

    /*
     * Primary fabric location.
     */
    private String primaryFabricLocation;

    /*
     * The recovery fabric location.
     */
    private String recoveryFabricLocation;

    /*
     * The recovery point id to which the Virtual node was failed over.
     */
    private String failoverRecoveryPointId;

    /*
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     */
    private Integer monitoringPercentageCompletion;

    /*
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     */
    private String monitoringJobType;

    /*
     * The last RPO value in seconds.
     */
    private Long rpoInSeconds;

    /*
     * The time (in UTC) when the last RPO value was calculated by Protection Service.
     */
    private OffsetDateTime lastRpoCalculatedTime;

    /*
     * The IR Errors.
     */
    private List<A2ASharedDiskIRErrorDetails> sharedDiskIRErrors;

    /**
     * Creates an instance of A2ASharedDiskReplicationDetails class.
     */
    public A2ASharedDiskReplicationDetails() {
    }

    /**
     * Get the instanceType property: Gets the Instance type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the managementId property: The management Id.
     * 
     * @return the managementId value.
     */
    public String managementId() {
        return this.managementId;
    }

    /**
     * Set the managementId property: The management Id.
     * 
     * @param managementId the managementId value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withManagementId(String managementId) {
        this.managementId = managementId;
        return this;
    }

    /**
     * Get the unprotectedDisks property: The list of unprotected disks.
     * 
     * @return the unprotectedDisks value.
     */
    public List<A2AUnprotectedDiskDetails> unprotectedDisks() {
        return this.unprotectedDisks;
    }

    /**
     * Set the unprotectedDisks property: The list of unprotected disks.
     * 
     * @param unprotectedDisks the unprotectedDisks value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withUnprotectedDisks(List<A2AUnprotectedDiskDetails> unprotectedDisks) {
        this.unprotectedDisks = unprotectedDisks;
        return this;
    }

    /**
     * Get the protectedManagedDisks property: The list of protected managed disks.
     * 
     * @return the protectedManagedDisks value.
     */
    public List<A2AProtectedManagedDiskDetails> protectedManagedDisks() {
        return this.protectedManagedDisks;
    }

    /**
     * Set the protectedManagedDisks property: The list of protected managed disks.
     * 
     * @param protectedManagedDisks the protectedManagedDisks value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails
        withProtectedManagedDisks(List<A2AProtectedManagedDiskDetails> protectedManagedDisks) {
        this.protectedManagedDisks = protectedManagedDisks;
        return this;
    }

    /**
     * Get the primaryFabricLocation property: Primary fabric location.
     * 
     * @return the primaryFabricLocation value.
     */
    public String primaryFabricLocation() {
        return this.primaryFabricLocation;
    }

    /**
     * Set the primaryFabricLocation property: Primary fabric location.
     * 
     * @param primaryFabricLocation the primaryFabricLocation value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withPrimaryFabricLocation(String primaryFabricLocation) {
        this.primaryFabricLocation = primaryFabricLocation;
        return this;
    }

    /**
     * Get the recoveryFabricLocation property: The recovery fabric location.
     * 
     * @return the recoveryFabricLocation value.
     */
    public String recoveryFabricLocation() {
        return this.recoveryFabricLocation;
    }

    /**
     * Set the recoveryFabricLocation property: The recovery fabric location.
     * 
     * @param recoveryFabricLocation the recoveryFabricLocation value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withRecoveryFabricLocation(String recoveryFabricLocation) {
        this.recoveryFabricLocation = recoveryFabricLocation;
        return this;
    }

    /**
     * Get the failoverRecoveryPointId property: The recovery point id to which the Virtual node was failed over.
     * 
     * @return the failoverRecoveryPointId value.
     */
    public String failoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }

    /**
     * Set the failoverRecoveryPointId property: The recovery point id to which the Virtual node was failed over.
     * 
     * @param failoverRecoveryPointId the failoverRecoveryPointId value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withFailoverRecoveryPointId(String failoverRecoveryPointId) {
        this.failoverRecoveryPointId = failoverRecoveryPointId;
        return this;
    }

    /**
     * Get the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     * 
     * @return the monitoringPercentageCompletion value.
     */
    public Integer monitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion;
    }

    /**
     * Set the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     * 
     * @param monitoringPercentageCompletion the monitoringPercentageCompletion value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withMonitoringPercentageCompletion(Integer monitoringPercentageCompletion) {
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        return this;
    }

    /**
     * Get the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     * 
     * @return the monitoringJobType value.
     */
    public String monitoringJobType() {
        return this.monitoringJobType;
    }

    /**
     * Set the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     * 
     * @param monitoringJobType the monitoringJobType value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withMonitoringJobType(String monitoringJobType) {
        this.monitoringJobType = monitoringJobType;
        return this;
    }

    /**
     * Get the rpoInSeconds property: The last RPO value in seconds.
     * 
     * @return the rpoInSeconds value.
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set the rpoInSeconds property: The last RPO value in seconds.
     * 
     * @param rpoInSeconds the rpoInSeconds value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the lastRpoCalculatedTime property: The time (in UTC) when the last RPO value was calculated by Protection
     * Service.
     * 
     * @return the lastRpoCalculatedTime value.
     */
    public OffsetDateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the lastRpoCalculatedTime property: The time (in UTC) when the last RPO value was calculated by Protection
     * Service.
     * 
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails withLastRpoCalculatedTime(OffsetDateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the sharedDiskIRErrors property: The IR Errors.
     * 
     * @return the sharedDiskIRErrors value.
     */
    public List<A2ASharedDiskIRErrorDetails> sharedDiskIRErrors() {
        return this.sharedDiskIRErrors;
    }

    /**
     * Set the sharedDiskIRErrors property: The IR Errors.
     * 
     * @param sharedDiskIRErrors the sharedDiskIRErrors value to set.
     * @return the A2ASharedDiskReplicationDetails object itself.
     */
    public A2ASharedDiskReplicationDetails
        withSharedDiskIRErrors(List<A2ASharedDiskIRErrorDetails> sharedDiskIRErrors) {
        this.sharedDiskIRErrors = sharedDiskIRErrors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (unprotectedDisks() != null) {
            unprotectedDisks().forEach(e -> e.validate());
        }
        if (protectedManagedDisks() != null) {
            protectedManagedDisks().forEach(e -> e.validate());
        }
        if (sharedDiskIRErrors() != null) {
            sharedDiskIRErrors().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("managementId", this.managementId);
        jsonWriter.writeArrayField("unprotectedDisks", this.unprotectedDisks,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("protectedManagedDisks", this.protectedManagedDisks,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("primaryFabricLocation", this.primaryFabricLocation);
        jsonWriter.writeStringField("recoveryFabricLocation", this.recoveryFabricLocation);
        jsonWriter.writeStringField("failoverRecoveryPointId", this.failoverRecoveryPointId);
        jsonWriter.writeNumberField("monitoringPercentageCompletion", this.monitoringPercentageCompletion);
        jsonWriter.writeStringField("monitoringJobType", this.monitoringJobType);
        jsonWriter.writeNumberField("rpoInSeconds", this.rpoInSeconds);
        jsonWriter.writeStringField("lastRpoCalculatedTime",
            this.lastRpoCalculatedTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastRpoCalculatedTime));
        jsonWriter.writeArrayField("sharedDiskIRErrors", this.sharedDiskIRErrors,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of A2ASharedDiskReplicationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of A2ASharedDiskReplicationDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the A2ASharedDiskReplicationDetails.
     */
    public static A2ASharedDiskReplicationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            A2ASharedDiskReplicationDetails deserializedA2ASharedDiskReplicationDetails
                = new A2ASharedDiskReplicationDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.instanceType = reader.getString();
                } else if ("managementId".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.managementId = reader.getString();
                } else if ("unprotectedDisks".equals(fieldName)) {
                    List<A2AUnprotectedDiskDetails> unprotectedDisks
                        = reader.readArray(reader1 -> A2AUnprotectedDiskDetails.fromJson(reader1));
                    deserializedA2ASharedDiskReplicationDetails.unprotectedDisks = unprotectedDisks;
                } else if ("protectedManagedDisks".equals(fieldName)) {
                    List<A2AProtectedManagedDiskDetails> protectedManagedDisks
                        = reader.readArray(reader1 -> A2AProtectedManagedDiskDetails.fromJson(reader1));
                    deserializedA2ASharedDiskReplicationDetails.protectedManagedDisks = protectedManagedDisks;
                } else if ("primaryFabricLocation".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.primaryFabricLocation = reader.getString();
                } else if ("recoveryFabricLocation".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.recoveryFabricLocation = reader.getString();
                } else if ("failoverRecoveryPointId".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.failoverRecoveryPointId = reader.getString();
                } else if ("monitoringPercentageCompletion".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.monitoringPercentageCompletion
                        = reader.getNullable(JsonReader::getInt);
                } else if ("monitoringJobType".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.monitoringJobType = reader.getString();
                } else if ("rpoInSeconds".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.rpoInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("lastRpoCalculatedTime".equals(fieldName)) {
                    deserializedA2ASharedDiskReplicationDetails.lastRpoCalculatedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sharedDiskIRErrors".equals(fieldName)) {
                    List<A2ASharedDiskIRErrorDetails> sharedDiskIRErrors
                        = reader.readArray(reader1 -> A2ASharedDiskIRErrorDetails.fromJson(reader1));
                    deserializedA2ASharedDiskReplicationDetails.sharedDiskIRErrors = sharedDiskIRErrors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedA2ASharedDiskReplicationDetails;
        });
    }
}
