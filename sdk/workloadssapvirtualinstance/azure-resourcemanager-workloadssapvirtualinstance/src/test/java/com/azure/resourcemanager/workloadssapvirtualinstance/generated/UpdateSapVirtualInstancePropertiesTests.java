// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.ManagedResourcesNetworkAccessType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.UpdateSapVirtualInstanceProperties;
import org.junit.jupiter.api.Assertions;

public final class UpdateSapVirtualInstancePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateSapVirtualInstanceProperties model
            = BinaryData.fromString("{\"managedResourcesNetworkAccessType\":\"Public\"}")
                .toObject(UpdateSapVirtualInstanceProperties.class);
        Assertions.assertEquals(ManagedResourcesNetworkAccessType.PUBLIC, model.managedResourcesNetworkAccessType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateSapVirtualInstanceProperties model = new UpdateSapVirtualInstanceProperties()
            .withManagedResourcesNetworkAccessType(ManagedResourcesNetworkAccessType.PUBLIC);
        model = BinaryData.fromObject(model).toObject(UpdateSapVirtualInstanceProperties.class);
        Assertions.assertEquals(ManagedResourcesNetworkAccessType.PUBLIC, model.managedResourcesNetworkAccessType());
    }
}
