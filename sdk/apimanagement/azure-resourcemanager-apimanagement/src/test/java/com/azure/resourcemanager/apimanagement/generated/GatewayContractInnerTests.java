// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractInner;
import com.azure.resourcemanager.apimanagement.models.ResourceLocationDataContract;
import org.junit.jupiter.api.Assertions;

public final class GatewayContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayContractInner model = BinaryData.fromString(
            "{\"properties\":{\"locationData\":{\"name\":\"ymjc\",\"city\":\"vsnvlaq\",\"district\":\"z\",\"countryOrRegion\":\"awatuwqkokbczo\"},\"description\":\"ymgobll\"},\"id\":\"snwgwimaa\",\"name\":\"eakhtmhobcya\",\"type\":\"rfvqtvkhgvo\"}")
            .toObject(GatewayContractInner.class);
        Assertions.assertEquals("ymjc", model.locationData().name());
        Assertions.assertEquals("vsnvlaq", model.locationData().city());
        Assertions.assertEquals("z", model.locationData().district());
        Assertions.assertEquals("awatuwqkokbczo", model.locationData().countryOrRegion());
        Assertions.assertEquals("ymgobll", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayContractInner model
            = new GatewayContractInner().withLocationData(new ResourceLocationDataContract().withName("ymjc")
                .withCity("vsnvlaq")
                .withDistrict("z")
                .withCountryOrRegion("awatuwqkokbczo")).withDescription("ymgobll");
        model = BinaryData.fromObject(model).toObject(GatewayContractInner.class);
        Assertions.assertEquals("ymjc", model.locationData().name());
        Assertions.assertEquals("vsnvlaq", model.locationData().city());
        Assertions.assertEquals("z", model.locationData().district());
        Assertions.assertEquals("awatuwqkokbczo", model.locationData().countryOrRegion());
        Assertions.assertEquals("ymgobll", model.description());
    }
}
