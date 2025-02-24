// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.models.FilteringTag;
import com.azure.resourcemanager.datadog.models.TagAction;
import org.junit.jupiter.api.Assertions;

public final class FilteringTagTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FilteringTag model
            = BinaryData.fromString("{\"name\":\"whrdxwzywqsmbsu\",\"value\":\"xim\",\"action\":\"Include\"}")
                .toObject(FilteringTag.class);
        Assertions.assertEquals("whrdxwzywqsmbsu", model.name());
        Assertions.assertEquals("xim", model.value());
        Assertions.assertEquals(TagAction.INCLUDE, model.action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FilteringTag model
            = new FilteringTag().withName("whrdxwzywqsmbsu").withValue("xim").withAction(TagAction.INCLUDE);
        model = BinaryData.fromObject(model).toObject(FilteringTag.class);
        Assertions.assertEquals("whrdxwzywqsmbsu", model.name());
        Assertions.assertEquals("xim", model.value());
        Assertions.assertEquals(TagAction.INCLUDE, model.action());
    }
}
