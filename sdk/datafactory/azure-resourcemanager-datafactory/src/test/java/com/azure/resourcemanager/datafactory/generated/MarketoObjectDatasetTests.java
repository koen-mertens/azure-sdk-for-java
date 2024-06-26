// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MarketoObjectDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MarketoObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketoObjectDataset model = BinaryData.fromString(
            "{\"type\":\"MarketoObject\",\"typeProperties\":{\"tableName\":\"datatnpkbvzpk\"},\"description\":\"ngvnqdj\",\"structure\":\"databtwgn\",\"schema\":\"dataxuczlhvbqycznrir\",\"linkedServiceName\":{\"referenceName\":\"iiuv\",\"parameters\":{\"cwtvmijccp\":\"dataqkqwucqsdgb\"}},\"parameters\":{\"jmaih\":{\"type\":\"Array\",\"defaultValue\":\"datamyvwp\"},\"vo\":{\"type\":\"Bool\",\"defaultValue\":\"datalbhxjppcbqetfzfp\"}},\"annotations\":[\"datayjwdunjhmprk\"],\"folder\":{\"name\":\"wiuujxsujk\"},\"\":{\"epdp\":\"dataxeegxbnjnc\",\"uyyaescjxna\":\"dataymgbfmd\",\"inzkefkzlxvc\":\"datapyxqbkxdtbfkih\",\"eozlibcbn\":\"datazcg\"}}")
            .toObject(MarketoObjectDataset.class);
        Assertions.assertEquals("ngvnqdj", model.description());
        Assertions.assertEquals("iiuv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("jmaih").type());
        Assertions.assertEquals("wiuujxsujk", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketoObjectDataset model = new MarketoObjectDataset().withDescription("ngvnqdj")
            .withStructure("databtwgn")
            .withSchema("dataxuczlhvbqycznrir")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("iiuv")
                .withParameters(mapOf("cwtvmijccp", "dataqkqwucqsdgb")))
            .withParameters(mapOf("jmaih",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datamyvwp"), "vo",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datalbhxjppcbqetfzfp")))
            .withAnnotations(Arrays.asList("datayjwdunjhmprk"))
            .withFolder(new DatasetFolder().withName("wiuujxsujk"))
            .withTableName("datatnpkbvzpk");
        model = BinaryData.fromObject(model).toObject(MarketoObjectDataset.class);
        Assertions.assertEquals("ngvnqdj", model.description());
        Assertions.assertEquals("iiuv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("jmaih").type());
        Assertions.assertEquals("wiuujxsujk", model.folder().name());
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
