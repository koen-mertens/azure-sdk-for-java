// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.fluent.models.DatadogSingleSignOnResourceInner;
import com.azure.resourcemanager.datadog.models.DatadogSingleSignOnProperties;
import com.azure.resourcemanager.datadog.models.DatadogSingleSignOnResourceListResponse;
import com.azure.resourcemanager.datadog.models.SingleSignOnStates;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatadogSingleSignOnResourceListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatadogSingleSignOnResourceListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"singleSignOnState\":\"Enable\",\"enterpriseAppId\":\"vyifqrvkdvjsl\",\"singleSignOnUrl\":\"mvvd\"},\"id\":\"atkpnp\",\"name\":\"lexxbczwtru\",\"type\":\"iqzbq\"}],\"nextLink\":\"sovmyokacspkwl\"}")
            .toObject(DatadogSingleSignOnResourceListResponse.class);
        Assertions.assertEquals(SingleSignOnStates.ENABLE, model.value().get(0).properties().singleSignOnState());
        Assertions.assertEquals("vyifqrvkdvjsl", model.value().get(0).properties().enterpriseAppId());
        Assertions.assertEquals("sovmyokacspkwl", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatadogSingleSignOnResourceListResponse model = new DatadogSingleSignOnResourceListResponse()
            .withValue(Arrays.asList(new DatadogSingleSignOnResourceInner()
                .withProperties(new DatadogSingleSignOnProperties().withSingleSignOnState(SingleSignOnStates.ENABLE)
                    .withEnterpriseAppId("vyifqrvkdvjsl"))))
            .withNextLink("sovmyokacspkwl");
        model = BinaryData.fromObject(model).toObject(DatadogSingleSignOnResourceListResponse.class);
        Assertions.assertEquals(SingleSignOnStates.ENABLE, model.value().get(0).properties().singleSignOnState());
        Assertions.assertEquals("vyifqrvkdvjsl", model.value().get(0).properties().enterpriseAppId());
        Assertions.assertEquals("sovmyokacspkwl", model.nextLink());
    }
}
