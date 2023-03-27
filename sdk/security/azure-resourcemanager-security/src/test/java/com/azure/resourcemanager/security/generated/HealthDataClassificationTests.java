// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.HealthDataClassification;
import com.azure.resourcemanager.security.models.ScopeName;
import org.junit.jupiter.api.Assertions;

public final class HealthDataClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthDataClassification model =
            BinaryData
                .fromString("{\"component\":\"w\",\"scenario\":\"vgmmbugtyw\",\"scope\":\"Unknown\"}")
                .toObject(HealthDataClassification.class);
        Assertions.assertEquals("w", model.component());
        Assertions.assertEquals("vgmmbugtyw", model.scenario());
        Assertions.assertEquals(ScopeName.UNKNOWN, model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthDataClassification model =
            new HealthDataClassification().withComponent("w").withScenario("vgmmbugtyw").withScope(ScopeName.UNKNOWN);
        model = BinaryData.fromObject(model).toObject(HealthDataClassification.class);
        Assertions.assertEquals("w", model.component());
        Assertions.assertEquals("vgmmbugtyw", model.scenario());
        Assertions.assertEquals(ScopeName.UNKNOWN, model.scope());
    }
}