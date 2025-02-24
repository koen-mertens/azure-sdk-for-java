// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.Capability;

public final class CapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Capability model
            = BinaryData.fromString("{\"name\":\"krlgnyhm\",\"value\":\"sxkkg\"}").toObject(Capability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Capability model = new Capability();
        model = BinaryData.fromObject(model).toObject(Capability.class);
    }
}
