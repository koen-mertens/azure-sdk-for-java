// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.UpdateVirtualNetworkRuleParameters;
import org.junit.jupiter.api.Assertions;

public final class UpdateVirtualNetworkRuleParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateVirtualNetworkRuleParameters model =
            BinaryData
                .fromString("{\"properties\":{\"subnetId\":\"lzu\"}}")
                .toObject(UpdateVirtualNetworkRuleParameters.class);
        Assertions.assertEquals("lzu", model.subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateVirtualNetworkRuleParameters model = new UpdateVirtualNetworkRuleParameters().withSubnetId("lzu");
        model = BinaryData.fromObject(model).toObject(UpdateVirtualNetworkRuleParameters.class);
        Assertions.assertEquals("lzu", model.subnetId());
    }
}
