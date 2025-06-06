// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Replications Delete.
 */
public final class ReplicationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2025-04-01/examples/
     * ReplicationDelete.json
     */
    /**
     * Sample code: ReplicationDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void replicationDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getReplications()
            .delete("myResourceGroup", "myRegistry", "myReplication", com.azure.core.util.Context.NONE);
    }
}
