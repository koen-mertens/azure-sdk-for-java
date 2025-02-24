// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.models.NicIpAddressSettings;

public final class NicIpAddressSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NicIpAddressSettings model = BinaryData
            .fromString(
                "{\"allocationMethod\":\"ool\",\"ipAddress\":\"tpkiwkkbnujry\",\"subnetMask\":\"tylbfpncurdoiw\"}")
            .toObject(NicIpAddressSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NicIpAddressSettings model = new NicIpAddressSettings();
        model = BinaryData.fromObject(model).toObject(NicIpAddressSettings.class);
    }
}
