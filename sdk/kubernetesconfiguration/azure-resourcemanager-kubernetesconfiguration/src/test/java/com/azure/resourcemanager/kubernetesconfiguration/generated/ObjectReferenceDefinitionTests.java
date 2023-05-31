// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ObjectReferenceDefinition;
import org.junit.jupiter.api.Assertions;

public final class ObjectReferenceDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ObjectReferenceDefinition model =
            BinaryData
                .fromString("{\"name\":\"icxm\",\"namespace\":\"iwqvhkh\"}")
                .toObject(ObjectReferenceDefinition.class);
        Assertions.assertEquals("icxm", model.name());
        Assertions.assertEquals("iwqvhkh", model.namespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ObjectReferenceDefinition model = new ObjectReferenceDefinition().withName("icxm").withNamespace("iwqvhkh");
        model = BinaryData.fromObject(model).toObject(ObjectReferenceDefinition.class);
        Assertions.assertEquals("icxm", model.name());
        Assertions.assertEquals("iwqvhkh", model.namespace());
    }
}