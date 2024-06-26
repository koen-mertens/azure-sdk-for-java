// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleAdWordsSource;

public final class GoogleAdWordsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleAdWordsSource model = BinaryData.fromString(
            "{\"type\":\"GoogleAdWordsSource\",\"query\":\"datasclpnbidnlodk\",\"queryTimeout\":\"dataqnkptixa\",\"additionalColumns\":\"datay\",\"sourceRetryCount\":\"dataaevry\",\"sourceRetryWait\":\"datagccpzmh\",\"maxConcurrentConnections\":\"datalqtzgtpsbym\",\"disableMetricsCollection\":\"datactorqzbq\",\"\":{\"ahbynlbwcnnfp\":\"datafqqrarolc\",\"lehgeeygsojtza\":\"datagstdifbyfj\",\"dsjhx\":\"dataliigrtvqv\"}}")
            .toObject(GoogleAdWordsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleAdWordsSource model = new GoogleAdWordsSource().withSourceRetryCount("dataaevry")
            .withSourceRetryWait("datagccpzmh")
            .withMaxConcurrentConnections("datalqtzgtpsbym")
            .withDisableMetricsCollection("datactorqzbq")
            .withQueryTimeout("dataqnkptixa")
            .withAdditionalColumns("datay")
            .withQuery("datasclpnbidnlodk");
        model = BinaryData.fromObject(model).toObject(GoogleAdWordsSource.class);
    }
}
