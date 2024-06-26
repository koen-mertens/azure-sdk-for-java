// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.largeinstance.models.IpAddress;
import com.azure.resourcemanager.largeinstance.models.NetworkProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfile model = BinaryData
            .fromString("{\"networkInterfaces\":[{\"ipAddress\":\"zfkufubljofx\"}],\"circuitId\":\"ofjaeqjhqjb\"}")
            .toObject(NetworkProfile.class);
        Assertions.assertEquals("zfkufubljofx", model.networkInterfaces().get(0).ipAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfile model
            = new NetworkProfile().withNetworkInterfaces(Arrays.asList(new IpAddress().withIpAddress("zfkufubljofx")));
        model = BinaryData.fromObject(model).toObject(NetworkProfile.class);
        Assertions.assertEquals("zfkufubljofx", model.networkInterfaces().get(0).ipAddress());
    }
}
