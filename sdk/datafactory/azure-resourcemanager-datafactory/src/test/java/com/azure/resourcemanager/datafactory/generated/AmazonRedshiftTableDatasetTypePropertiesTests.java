// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonRedshiftTableDatasetTypeProperties;

public final class AmazonRedshiftTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonRedshiftTableDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"datasofxc\",\"table\":\"datarmvjfmrsuyd\",\"schema\":\"dataprel\"}")
            .toObject(AmazonRedshiftTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonRedshiftTableDatasetTypeProperties model
            = new AmazonRedshiftTableDatasetTypeProperties().withTableName("datasofxc")
                .withTable("datarmvjfmrsuyd")
                .withSchema("dataprel");
        model = BinaryData.fromObject(model).toObject(AmazonRedshiftTableDatasetTypeProperties.class);
    }
}
