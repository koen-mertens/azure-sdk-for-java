// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticDataProviderMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticDataProviderMetadata model = BinaryData.fromString(
            "{\"providerName\":\"b\",\"propertyBag\":[{\"name\":\"hv\",\"value\":\"lkvn\"},{\"name\":\"lrigjkskyri\",\"value\":\"vzidsxwaab\"}]}")
            .toObject(DiagnosticDataProviderMetadata.class);
        Assertions.assertEquals("b", model.providerName());
        Assertions.assertEquals("hv", model.propertyBag().get(0).name());
        Assertions.assertEquals("lkvn", model.propertyBag().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticDataProviderMetadata model = new DiagnosticDataProviderMetadata().withProviderName("b")
            .withPropertyBag(Arrays.asList(
                new DiagnosticDataProviderMetadataPropertyBagItem().withName("hv").withValue("lkvn"),
                new DiagnosticDataProviderMetadataPropertyBagItem().withName("lrigjkskyri").withValue("vzidsxwaab")));
        model = BinaryData.fromObject(model).toObject(DiagnosticDataProviderMetadata.class);
        Assertions.assertEquals("b", model.providerName());
        Assertions.assertEquals("hv", model.propertyBag().get(0).name());
        Assertions.assertEquals("lkvn", model.propertyBag().get(0).value());
    }
}
