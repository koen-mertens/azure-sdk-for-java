// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.VariableUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class VariableUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VariableUpdateParameters model = BinaryData
            .fromString("{\"name\":\"vyi\",\"properties\":{\"value\":\"o\",\"description\":\"vpgshoxgsgbp\"}}")
            .toObject(VariableUpdateParameters.class);
        Assertions.assertEquals("vyi", model.name());
        Assertions.assertEquals("o", model.value());
        Assertions.assertEquals("vpgshoxgsgbp", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VariableUpdateParameters model
            = new VariableUpdateParameters().withName("vyi").withValue("o").withDescription("vpgshoxgsgbp");
        model = BinaryData.fromObject(model).toObject(VariableUpdateParameters.class);
        Assertions.assertEquals("vyi", model.name());
        Assertions.assertEquals("o", model.value());
        Assertions.assertEquals("vpgshoxgsgbp", model.description());
    }
}
