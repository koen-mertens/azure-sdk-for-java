// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/**
 * Samples for ManagedHsms GetDeleted.
 */
public final class ManagedHsmsGetDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/DeletedManagedHsm_Get.json
     */
    /**
     * Sample code: Retrieve a deleted managed HSM.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveADeletedManagedHSM(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getManagedHsms()
            .getDeletedWithResponse("hsm1", "westus", com.azure.core.util.Context.NONE);
    }
}
