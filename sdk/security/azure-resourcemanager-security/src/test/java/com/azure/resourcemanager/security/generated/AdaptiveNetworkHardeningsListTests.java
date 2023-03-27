// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AdaptiveNetworkHardeningInner;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningsList;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AdaptiveNetworkHardeningsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdaptiveNetworkHardeningsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"rules\":[],\"rulesCalculationTime\":\"2021-02-04T03:03:52Z\",\"effectiveNetworkSecurityGroups\":[]},\"id\":\"pgclrciv\",\"name\":\"soxfrken\",\"type\":\"pmyyefrpmpdnqq\"},{\"properties\":{\"rules\":[],\"rulesCalculationTime\":\"2021-07-14T06:34:32Z\",\"effectiveNetworkSecurityGroups\":[]},\"id\":\"qvmmbn\",\"name\":\"qfr\",\"type\":\"qlkzme\"}],\"nextLink\":\"itgvkx\"}")
                .toObject(AdaptiveNetworkHardeningsList.class);
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-04T03:03:52Z"), model.value().get(0).rulesCalculationTime());
        Assertions.assertEquals("itgvkx", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdaptiveNetworkHardeningsList model =
            new AdaptiveNetworkHardeningsList()
                .withValue(
                    Arrays
                        .asList(
                            new AdaptiveNetworkHardeningInner()
                                .withRules(Arrays.asList())
                                .withRulesCalculationTime(OffsetDateTime.parse("2021-02-04T03:03:52Z"))
                                .withEffectiveNetworkSecurityGroups(Arrays.asList()),
                            new AdaptiveNetworkHardeningInner()
                                .withRules(Arrays.asList())
                                .withRulesCalculationTime(OffsetDateTime.parse("2021-07-14T06:34:32Z"))
                                .withEffectiveNetworkSecurityGroups(Arrays.asList())))
                .withNextLink("itgvkx");
        model = BinaryData.fromObject(model).toObject(AdaptiveNetworkHardeningsList.class);
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-04T03:03:52Z"), model.value().get(0).rulesCalculationTime());
        Assertions.assertEquals("itgvkx", model.nextLink());
    }
}