// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/**
 * Samples for Keys Get.
 */
public final class KeysGetSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/getKey.json
     */
    /**
     * Sample code: Get a key.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAKey(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getKeys()
            .getWithResponse("sample-group", "sample-vault-name", "sample-key-name", com.azure.core.util.Context.NONE);
    }
}
