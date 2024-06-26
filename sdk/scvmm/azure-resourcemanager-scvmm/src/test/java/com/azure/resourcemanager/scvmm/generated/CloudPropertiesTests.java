// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.CloudProperties;
import org.junit.jupiter.api.Assertions;

public final class CloudPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudProperties model = BinaryData.fromString(
            "{\"inventoryItemId\":\"dvxzbncblylpst\",\"uuid\":\"hh\",\"vmmServerId\":\"rzdzucerscdnt\",\"cloudName\":\"vfiwjmygtdss\",\"cloudCapacity\":{\"cpuCount\":4029880181936290822,\"memoryMB\":2056289881259732229,\"vmCount\":3002295961372287593},\"storageQoSPolicies\":[{\"name\":\"qsemwabne\",\"id\":\"hhszh\",\"iopsMaximum\":6111204244847646570,\"iopsMinimum\":6033840789921327792,\"bandwidthLimit\":2247461655033792564,\"policyId\":\"wmbesldnkw\"}],\"provisioningState\":\"Succeeded\"}")
            .toObject(CloudProperties.class);
        Assertions.assertEquals("dvxzbncblylpst", model.inventoryItemId());
        Assertions.assertEquals("hh", model.uuid());
        Assertions.assertEquals("rzdzucerscdnt", model.vmmServerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudProperties model = new CloudProperties().withInventoryItemId("dvxzbncblylpst")
            .withUuid("hh")
            .withVmmServerId("rzdzucerscdnt");
        model = BinaryData.fromObject(model).toObject(CloudProperties.class);
        Assertions.assertEquals("dvxzbncblylpst", model.inventoryItemId());
        Assertions.assertEquals("hh", model.uuid());
        Assertions.assertEquals("rzdzucerscdnt", model.vmmServerId());
    }
}
