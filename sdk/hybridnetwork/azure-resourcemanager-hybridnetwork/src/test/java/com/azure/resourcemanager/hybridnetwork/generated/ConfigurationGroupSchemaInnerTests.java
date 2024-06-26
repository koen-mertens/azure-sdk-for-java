// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ConfigurationGroupSchemaInner;
import com.azure.resourcemanager.hybridnetwork.models.ConfigurationGroupSchemaPropertiesFormat;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationGroupSchemaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationGroupSchemaInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Unknown\",\"versionState\":\"ValidationFailed\",\"description\":\"yejhk\",\"schemaDefinition\":\"htnapczwlokjyem\"},\"location\":\"vnipjox\",\"tags\":{\"ilzyd\":\"chgejspodm\",\"jwyahuxinpmqnja\":\"h\"},\"id\":\"wixjsprozvcp\",\"name\":\"tegjvwmf\",\"type\":\"atscmd\"}")
            .toObject(ConfigurationGroupSchemaInner.class);
        Assertions.assertEquals("vnipjox", model.location());
        Assertions.assertEquals("chgejspodm", model.tags().get("ilzyd"));
        Assertions.assertEquals("yejhk", model.properties().description());
        Assertions.assertEquals("htnapczwlokjyem", model.properties().schemaDefinition());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationGroupSchemaInner model = new ConfigurationGroupSchemaInner().withLocation("vnipjox")
            .withTags(mapOf("ilzyd", "chgejspodm", "jwyahuxinpmqnja", "h"))
            .withProperties(new ConfigurationGroupSchemaPropertiesFormat().withDescription("yejhk")
                .withSchemaDefinition("htnapczwlokjyem"));
        model = BinaryData.fromObject(model).toObject(ConfigurationGroupSchemaInner.class);
        Assertions.assertEquals("vnipjox", model.location());
        Assertions.assertEquals("chgejspodm", model.tags().get("ilzyd"));
        Assertions.assertEquals("yejhk", model.properties().description());
        Assertions.assertEquals("htnapczwlokjyem", model.properties().schemaDefinition());
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
