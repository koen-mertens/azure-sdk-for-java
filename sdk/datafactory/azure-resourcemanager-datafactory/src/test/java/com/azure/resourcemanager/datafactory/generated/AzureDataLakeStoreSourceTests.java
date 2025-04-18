// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreSource;

public final class AzureDataLakeStoreSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreSource model = BinaryData.fromString(
            "{\"type\":\"AzureDataLakeStoreSource\",\"recursive\":\"datazythxzrvjfsmfkd\",\"sourceRetryCount\":\"datawfrmhookef\",\"sourceRetryWait\":\"datafexakctlcps\",\"maxConcurrentConnections\":\"datancco\",\"disableMetricsCollection\":\"dataqxmdievkmrso\",\"\":{\"imuqqmdxcwx\":\"dataiheh\",\"ypsypmthf\":\"datamrmwd\",\"afcxdldh\":\"datasz\",\"urhsmg\":\"datakdeviwpzhfxvlc\"}}")
            .toObject(AzureDataLakeStoreSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreSource model = new AzureDataLakeStoreSource().withSourceRetryCount("datawfrmhookef")
            .withSourceRetryWait("datafexakctlcps")
            .withMaxConcurrentConnections("datancco")
            .withDisableMetricsCollection("dataqxmdievkmrso")
            .withRecursive("datazythxzrvjfsmfkd");
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreSource.class);
    }
}
