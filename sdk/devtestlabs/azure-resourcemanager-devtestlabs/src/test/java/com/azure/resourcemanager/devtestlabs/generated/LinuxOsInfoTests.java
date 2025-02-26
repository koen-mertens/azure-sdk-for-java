// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsInfo;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsState;
import org.junit.jupiter.api.Assertions;

public final class LinuxOsInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinuxOsInfo model
            = BinaryData.fromString("{\"linuxOsState\":\"DeprovisionRequested\"}").toObject(LinuxOsInfo.class);
        Assertions.assertEquals(LinuxOsState.DEPROVISION_REQUESTED, model.linuxOsState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinuxOsInfo model = new LinuxOsInfo().withLinuxOsState(LinuxOsState.DEPROVISION_REQUESTED);
        model = BinaryData.fromObject(model).toObject(LinuxOsInfo.class);
        Assertions.assertEquals(LinuxOsState.DEPROVISION_REQUESTED, model.linuxOsState());
    }
}
