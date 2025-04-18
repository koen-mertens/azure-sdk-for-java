// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.OperationInner;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model = BinaryData.fromString(
            "{\"name\":\"fogknygjofjdde\",\"isDataAction\":false,\"display\":{\"provider\":\"upewnwreitjzy\",\"resource\":\"usarhmofc\",\"operation\":\"smy\",\"description\":\"kdtmlxhekuk\"}}")
            .toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withIsDataAction(false);
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
    }
}
