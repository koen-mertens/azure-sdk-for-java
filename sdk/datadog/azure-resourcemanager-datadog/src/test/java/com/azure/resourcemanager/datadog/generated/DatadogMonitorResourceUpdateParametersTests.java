// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.models.DatadogMonitorResourceUpdateParameters;
import com.azure.resourcemanager.datadog.models.MonitorUpdateProperties;
import com.azure.resourcemanager.datadog.models.MonitoringStatus;
import com.azure.resourcemanager.datadog.models.ResourceSku;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatadogMonitorResourceUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatadogMonitorResourceUpdateParameters model = BinaryData.fromString(
            "{\"properties\":{\"monitoringStatus\":\"Enabled\",\"cspm\":true},\"tags\":{\"ebxetqgtzxdp\":\"ccfwnfnbacfion\",\"feallnwsu\":\"qbqqwxr\"},\"sku\":{\"name\":\"snjampmng\"}}")
            .toObject(DatadogMonitorResourceUpdateParameters.class);
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.properties().monitoringStatus());
        Assertions.assertEquals(true, model.properties().cspm());
        Assertions.assertEquals("ccfwnfnbacfion", model.tags().get("ebxetqgtzxdp"));
        Assertions.assertEquals("snjampmng", model.sku().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatadogMonitorResourceUpdateParameters model = new DatadogMonitorResourceUpdateParameters()
            .withProperties(new MonitorUpdateProperties().withMonitoringStatus(MonitoringStatus.ENABLED).withCspm(true))
            .withTags(mapOf("ebxetqgtzxdp", "ccfwnfnbacfion", "feallnwsu", "qbqqwxr"))
            .withSku(new ResourceSku().withName("snjampmng"));
        model = BinaryData.fromObject(model).toObject(DatadogMonitorResourceUpdateParameters.class);
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.properties().monitoringStatus());
        Assertions.assertEquals(true, model.properties().cspm());
        Assertions.assertEquals("ccfwnfnbacfion", model.tags().get("ebxetqgtzxdp"));
        Assertions.assertEquals("snjampmng", model.sku().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
