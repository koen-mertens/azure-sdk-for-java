// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzurePostgreSqlSink;

public final class AzurePostgreSqlSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzurePostgreSqlSink model = BinaryData.fromString(
            "{\"type\":\"AzurePostgreSqlSink\",\"preCopyScript\":\"dataxtkmknacnfzcy\",\"writeBatchSize\":\"datahdjpagwszm\",\"writeBatchTimeout\":\"datagzfeyexbg\",\"sinkRetryCount\":\"datayo\",\"sinkRetryWait\":\"datawigvqgc\",\"maxConcurrentConnections\":\"datacqjg\",\"disableMetricsCollection\":\"dataxpbpj\",\"\":{\"ohehhtl\":\"datanvdabaodiytxq\"}}")
            .toObject(AzurePostgreSqlSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzurePostgreSqlSink model = new AzurePostgreSqlSink().withWriteBatchSize("datahdjpagwszm")
            .withWriteBatchTimeout("datagzfeyexbg")
            .withSinkRetryCount("datayo")
            .withSinkRetryWait("datawigvqgc")
            .withMaxConcurrentConnections("datacqjg")
            .withDisableMetricsCollection("dataxpbpj")
            .withPreCopyScript("dataxtkmknacnfzcy");
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlSink.class);
    }
}
