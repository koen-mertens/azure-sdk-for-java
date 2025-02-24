// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MongoDbV2LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MongoDbV2LinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2LinkedService model = BinaryData.fromString(
            "{\"type\":\"MongoDbV2\",\"typeProperties\":{\"connectionString\":\"dataucmiqsdsnu\",\"database\":\"dataq\"},\"version\":\"qitiut\",\"connectVia\":{\"referenceName\":\"asxjkclzqpasril\",\"parameters\":{\"cvq\":\"datahlbhkijq\"}},\"description\":\"xrqiwxeppuhkizoa\",\"parameters\":{\"vfbmxzobpg\":{\"type\":\"String\",\"defaultValue\":\"datavob\"},\"ybyilhdbb\":{\"type\":\"Object\",\"defaultValue\":\"datalkpajio\"},\"choji\":{\"type\":\"Array\",\"defaultValue\":\"datauyxhcwubtego\"},\"frgiplxrifbsbk\":{\"type\":\"SecureString\",\"defaultValue\":\"dataq\"}},\"annotations\":[\"datav\",\"databbpoijs\",\"datavrutjituufknar\"],\"\":{\"smvnnjwnwo\":\"datanktpjinzosx\",\"xowppvuxqac\":\"datavezwwqc\",\"ir\":\"dataoqqehn\",\"tvnlbkizebbrwlp\":\"datagnvuolv\"}}")
            .toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("qitiut", model.version());
        Assertions.assertEquals("asxjkclzqpasril", model.connectVia().referenceName());
        Assertions.assertEquals("xrqiwxeppuhkizoa", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("vfbmxzobpg").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2LinkedService model = new MongoDbV2LinkedService().withVersion("qitiut")
            .withConnectVia(new IntegrationRuntimeReference().withReferenceName("asxjkclzqpasril")
                .withParameters(mapOf("cvq", "datahlbhkijq")))
            .withDescription("xrqiwxeppuhkizoa")
            .withParameters(mapOf("vfbmxzobpg",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datavob"), "ybyilhdbb",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datalkpajio"), "choji",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datauyxhcwubtego"),
                "frgiplxrifbsbk",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("dataq")))
            .withAnnotations(Arrays.asList("datav", "databbpoijs", "datavrutjituufknar"))
            .withConnectionString("dataucmiqsdsnu")
            .withDatabase("dataq");
        model = BinaryData.fromObject(model).toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("qitiut", model.version());
        Assertions.assertEquals("asxjkclzqpasril", model.connectVia().referenceName());
        Assertions.assertEquals("xrqiwxeppuhkizoa", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("vfbmxzobpg").type());
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
