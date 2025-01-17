// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayContainerInner;
import com.azure.resourcemanager.fluidrelay.models.FluidRelayContainerList;
import java.util.Arrays;

public final class FluidRelayContainerListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FluidRelayContainerList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"frsTenantId\":\"lwckbasyypnddhs\",\"frsContainerId\":\"bacphejko\",\"provisioningState\":\"Succeeded\",\"creationTime\":\"2021-04-11T19:57:28Z\",\"lastAccessTime\":\"2021-03-12T16:35:22Z\"},\"id\":\"zndlikwy\",\"name\":\"kgfg\",\"type\":\"bmadgak\"},{\"properties\":{\"frsTenantId\":\"rxybz\",\"frsContainerId\":\"e\",\"provisioningState\":\"Failed\",\"creationTime\":\"2021-11-23T05:43:53Z\",\"lastAccessTime\":\"2021-07-02T01:03:40Z\"},\"id\":\"fouflmmnkzsmo\",\"name\":\"mglougpbkw\",\"type\":\"mutduqktaps\"},{\"properties\":{\"frsTenantId\":\"cuertu\",\"frsContainerId\":\"dosvqwhbmdgbbjf\",\"provisioningState\":\"Succeeded\",\"creationTime\":\"2020-12-21T12:36:22Z\",\"lastAccessTime\":\"2021-07-03T00:59:28Z\"},\"id\":\"xppbhtqqro\",\"name\":\"fpfpsalgbquxigj\",\"type\":\"jgzjaoyfhrtx\"},{\"properties\":{\"frsTenantId\":\"erkujys\",\"frsContainerId\":\"eju\",\"provisioningState\":\"Succeeded\",\"creationTime\":\"2021-11-11T16:20:30Z\",\"lastAccessTime\":\"2021-11-26T22:23:23Z\"},\"id\":\"xwjkcprbnwbxg\",\"name\":\"vtb\",\"type\":\"p\"}],\"nextLink\":\"szdnr\"}")
            .toObject(FluidRelayContainerList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FluidRelayContainerList model
            = new FluidRelayContainerList().withValue(Arrays.asList(new FluidRelayContainerInner(),
                new FluidRelayContainerInner(), new FluidRelayContainerInner(), new FluidRelayContainerInner()));
        model = BinaryData.fromObject(model).toObject(FluidRelayContainerList.class);
    }
}
