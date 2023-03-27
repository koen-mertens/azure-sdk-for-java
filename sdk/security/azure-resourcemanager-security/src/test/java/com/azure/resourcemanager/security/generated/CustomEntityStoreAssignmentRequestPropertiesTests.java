// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.CustomEntityStoreAssignmentRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class CustomEntityStoreAssignmentRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEntityStoreAssignmentRequestProperties model =
            BinaryData
                .fromString("{\"principal\":\"wryoqpsoacc\"}")
                .toObject(CustomEntityStoreAssignmentRequestProperties.class);
        Assertions.assertEquals("wryoqpsoacc", model.principal());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEntityStoreAssignmentRequestProperties model =
            new CustomEntityStoreAssignmentRequestProperties().withPrincipal("wryoqpsoacc");
        model = BinaryData.fromObject(model).toObject(CustomEntityStoreAssignmentRequestProperties.class);
        Assertions.assertEquals("wryoqpsoacc", model.principal());
    }
}