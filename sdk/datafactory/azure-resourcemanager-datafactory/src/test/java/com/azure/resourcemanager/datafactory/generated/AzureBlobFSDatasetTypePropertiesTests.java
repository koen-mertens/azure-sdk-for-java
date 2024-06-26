// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobFSDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.util.HashMap;
import java.util.Map;

public final class AzureBlobFSDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSDatasetTypeProperties model = BinaryData.fromString(
            "{\"folderPath\":\"datagucbmt\",\"fileName\":\"datadscnns\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"datayyuvtzrxzhclec\",\"deserializer\":\"datatzqzcloy\",\"\":{\"wbyorjplbchych\":\"datapgidhzgyresgzsdt\"}},\"compression\":{\"type\":\"datavyrfbqvum\",\"level\":\"dataqj\",\"\":{\"t\":\"dataepmaxfnzlpqmp\"}}}")
            .toObject(AzureBlobFSDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSDatasetTypeProperties model = new AzureBlobFSDatasetTypeProperties().withFolderPath("datagucbmt")
            .withFileName("datadscnns")
            .withFormat(new DatasetStorageFormat().withSerializer("datayyuvtzrxzhclec")
                .withDeserializer("datatzqzcloy")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withCompression(new DatasetCompression().withType("datavyrfbqvum")
                .withLevel("dataqj")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSDatasetTypeProperties.class);
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
