// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Category;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CategoryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Category model = BinaryData
            .fromString(
                "{\"urlCustom\":[\"ewgdrjervn\",\"enq\",\"eh\"],\"feeds\":[\"doy\",\"mifthnzdnd\",\"l\",\"nayqi\"]}")
            .toObject(Category.class);
        Assertions.assertEquals("ewgdrjervn", model.urlCustom().get(0));
        Assertions.assertEquals("doy", model.feeds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Category model = new Category().withUrlCustom(Arrays.asList("ewgdrjervn", "enq", "eh"))
            .withFeeds(Arrays.asList("doy", "mifthnzdnd", "l", "nayqi"));
        model = BinaryData.fromObject(model).toObject(Category.class);
        Assertions.assertEquals("ewgdrjervn", model.urlCustom().get(0));
        Assertions.assertEquals("doy", model.feeds().get(0));
    }
}
