// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import org.junit.jupiter.api.Assertions;

public final class TimeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Time model = BinaryData.fromString("{\"hour\":632380018,\"minute\":737203180}").toObject(Time.class);
        Assertions.assertEquals(632380018, model.hour());
        Assertions.assertEquals(737203180, model.minute());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Time model = new Time().withHour(632380018).withMinute(737203180);
        model = BinaryData.fromObject(model).toObject(Time.class);
        Assertions.assertEquals(632380018, model.hour());
        Assertions.assertEquals(737203180, model.minute());
    }
}