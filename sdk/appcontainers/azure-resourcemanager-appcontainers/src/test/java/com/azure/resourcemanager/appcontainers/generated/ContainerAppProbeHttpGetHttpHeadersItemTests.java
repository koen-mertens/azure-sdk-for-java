// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import org.junit.jupiter.api.Assertions;

public final class ContainerAppProbeHttpGetHttpHeadersItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppProbeHttpGetHttpHeadersItem model
            = BinaryData.fromString("{\"name\":\"lihhyuspskasdvlm\",\"value\":\"wdgzxulucv\"}")
                .toObject(ContainerAppProbeHttpGetHttpHeadersItem.class);
        Assertions.assertEquals("lihhyuspskasdvlm", model.name());
        Assertions.assertEquals("wdgzxulucv", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppProbeHttpGetHttpHeadersItem model
            = new ContainerAppProbeHttpGetHttpHeadersItem().withName("lihhyuspskasdvlm").withValue("wdgzxulucv");
        model = BinaryData.fromObject(model).toObject(ContainerAppProbeHttpGetHttpHeadersItem.class);
        Assertions.assertEquals("lihhyuspskasdvlm", model.name());
        Assertions.assertEquals("wdgzxulucv", model.value());
    }
}
