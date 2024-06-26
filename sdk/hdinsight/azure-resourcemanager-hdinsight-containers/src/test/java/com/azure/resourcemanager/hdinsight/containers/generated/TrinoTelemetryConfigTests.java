// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.TrinoTelemetryConfig;
import org.junit.jupiter.api.Assertions;

public final class TrinoTelemetryConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrinoTelemetryConfig model = BinaryData.fromString(
            "{\"hivecatalogName\":\"ccm\",\"hivecatalogSchema\":\"udxytlmoyrx\",\"partitionRetentionInDays\":2130871697,\"path\":\"dw\"}")
            .toObject(TrinoTelemetryConfig.class);
        Assertions.assertEquals("ccm", model.hivecatalogName());
        Assertions.assertEquals("udxytlmoyrx", model.hivecatalogSchema());
        Assertions.assertEquals(2130871697, model.partitionRetentionInDays());
        Assertions.assertEquals("dw", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrinoTelemetryConfig model = new TrinoTelemetryConfig().withHivecatalogName("ccm")
            .withHivecatalogSchema("udxytlmoyrx").withPartitionRetentionInDays(2130871697).withPath("dw");
        model = BinaryData.fromObject(model).toObject(TrinoTelemetryConfig.class);
        Assertions.assertEquals("ccm", model.hivecatalogName());
        Assertions.assertEquals("udxytlmoyrx", model.hivecatalogSchema());
        Assertions.assertEquals(2130871697, model.partitionRetentionInDays());
        Assertions.assertEquals("dw", model.path());
    }
}
