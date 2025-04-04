// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ResponsysObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResponsysObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResponsysObjectDataset model = BinaryData.fromString(
            "{\"type\":\"ResponsysObject\",\"typeProperties\":{\"tableName\":\"dataqxa\"},\"description\":\"mdmracfsffdralih\",\"structure\":\"datascygyzhcvlavyr\",\"schema\":\"datandxrmyzvtiojtpd\",\"linkedServiceName\":{\"referenceName\":\"u\",\"parameters\":{\"teccxfn\":\"dataxoyjyhutwedigiv\"}},\"parameters\":{\"bqpmfhjik\":{\"type\":\"Bool\",\"defaultValue\":\"dataca\"},\"hmyucgrmw\":{\"type\":\"Array\",\"defaultValue\":\"databdqitghnmelzvr\"}},\"annotations\":[\"datad\"],\"folder\":{\"name\":\"l\"},\"\":{\"pgtipaaoylwh\":\"dataqgrbrhhv\",\"ixdmoba\":\"datamkbweasgyp\",\"dqdchnzibixrgs\":\"dataydwqeuwdvcls\",\"gosijiqexqwqy\":\"datawxxqkwargcbg\"}}")
            .toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("mdmracfsffdralih", model.description());
        Assertions.assertEquals("u", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("bqpmfhjik").type());
        Assertions.assertEquals("l", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResponsysObjectDataset model = new ResponsysObjectDataset().withDescription("mdmracfsffdralih")
            .withStructure("datascygyzhcvlavyr")
            .withSchema("datandxrmyzvtiojtpd")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("u")
                .withParameters(mapOf("teccxfn", "dataxoyjyhutwedigiv")))
            .withParameters(mapOf("bqpmfhjik",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataca"), "hmyucgrmw",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("databdqitghnmelzvr")))
            .withAnnotations(Arrays.asList("datad"))
            .withFolder(new DatasetFolder().withName("l"))
            .withTableName("dataqxa");
        model = BinaryData.fromObject(model).toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("mdmracfsffdralih", model.description());
        Assertions.assertEquals("u", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("bqpmfhjik").type());
        Assertions.assertEquals("l", model.folder().name());
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
