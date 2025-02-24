// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.models.WorkItemConfiguration;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkItemConfigurationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"ConnectorId\":\"aumweoohguufu\",\"ConfigDisplayName\":\"oyjathwtzol\",\"IsDefault\":true,\"Id\":\"wm\",\"ConfigProperties\":\"mebwjscjpah\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApplicationInsightsManager manager = ApplicationInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkItemConfiguration> response
            = manager.workItemConfigurations().list("sopteecj", "eislstvasylwx", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("aumweoohguufu", response.iterator().next().connectorId());
        Assertions.assertEquals("oyjathwtzol", response.iterator().next().configDisplayName());
        Assertions.assertEquals(true, response.iterator().next().isDefault());
        Assertions.assertEquals("wm", response.iterator().next().id());
        Assertions.assertEquals("mebwjscjpah", response.iterator().next().configProperties());
    }
}
