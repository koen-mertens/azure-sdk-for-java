// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.CloudInventoryItem;

public final class CloudInventoryItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudInventoryItem model = BinaryData.fromString(
            "{\"inventoryType\":\"Cloud\",\"managedResourceId\":\"iivwzjbhyzsxjrka\",\"uuid\":\"trnegvmnvuqeqvld\",\"inventoryItemName\":\"astjbkkdmflvestm\",\"provisioningState\":\"Deleting\"}")
            .toObject(CloudInventoryItem.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudInventoryItem model = new CloudInventoryItem();
        model = BinaryData.fromObject(model).toObject(CloudInventoryItem.class);
    }
}
