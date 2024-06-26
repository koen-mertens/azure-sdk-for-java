// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure Sql workload-specific container.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "containerType",
    defaultImpl = AzureSqlContainer.class,
    visible = true)
@JsonTypeName("AzureSqlContainer")
@Fluent
public final class AzureSqlContainer extends ProtectionContainer {
    /*
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     */
    @JsonTypeId
    @JsonProperty(value = "containerType", required = true)
    private ProtectableContainerType containerType = ProtectableContainerType.AZURE_SQL_CONTAINER;

    /**
     * Creates an instance of AzureSqlContainer class.
     */
    public AzureSqlContainer() {
    }

    /**
     * Get the containerType property: Type of the container. The value of this property for: 1. Compute Azure VM is
     * Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer.
     * 
     * @return the containerType value.
     */
    @Override
    public ProtectableContainerType containerType() {
        return this.containerType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSqlContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
