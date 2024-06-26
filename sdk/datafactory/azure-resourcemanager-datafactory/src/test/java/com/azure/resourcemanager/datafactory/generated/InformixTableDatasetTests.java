// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.InformixTableDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InformixTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformixTableDataset model = BinaryData.fromString(
            "{\"type\":\"InformixTable\",\"typeProperties\":{\"tableName\":\"databzgottaksadzighm\"},\"description\":\"b\",\"structure\":\"datavucfvvraab\",\"schema\":\"datardeewl\",\"linkedServiceName\":{\"referenceName\":\"uxpcbwkdwj\",\"parameters\":{\"roo\":\"datazni\",\"taspmcrei\":\"datam\",\"hminuwqxungrobgw\":\"datauftrni\"}},\"parameters\":{\"geerclbl\":{\"type\":\"Object\",\"defaultValue\":\"datawdylwxmvzjowz\"},\"yeurjwmv\":{\"type\":\"Float\",\"defaultValue\":\"datapwac\"}},\"annotations\":[\"datavdifkiikg\",\"dataruccwmecbtxsytr\",\"dataexe\",\"datawmrqjyw\"],\"folder\":{\"name\":\"vycfjncindi\"},\"\":{\"riarsbcl\":\"datakajwj\"}}")
            .toObject(InformixTableDataset.class);
        Assertions.assertEquals("b", model.description());
        Assertions.assertEquals("uxpcbwkdwj", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("geerclbl").type());
        Assertions.assertEquals("vycfjncindi", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformixTableDataset model = new InformixTableDataset().withDescription("b")
            .withStructure("datavucfvvraab")
            .withSchema("datardeewl")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("uxpcbwkdwj")
                .withParameters(mapOf("roo", "datazni", "taspmcrei", "datam", "hminuwqxungrobgw", "datauftrni")))
            .withParameters(mapOf("geerclbl",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datawdylwxmvzjowz"),
                "yeurjwmv", new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datapwac")))
            .withAnnotations(Arrays.asList("datavdifkiikg", "dataruccwmecbtxsytr", "dataexe", "datawmrqjyw"))
            .withFolder(new DatasetFolder().withName("vycfjncindi"))
            .withTableName("databzgottaksadzighm");
        model = BinaryData.fromObject(model).toObject(InformixTableDataset.class);
        Assertions.assertEquals("b", model.description());
        Assertions.assertEquals("uxpcbwkdwj", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("geerclbl").type());
        Assertions.assertEquals("vycfjncindi", model.folder().name());
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
