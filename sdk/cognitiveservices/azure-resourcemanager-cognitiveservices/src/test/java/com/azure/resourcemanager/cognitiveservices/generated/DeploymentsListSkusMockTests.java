// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.SkuResource;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DeploymentsListSkusMockTests {
    @Test
    public void testListSkus() throws Exception {
        String responseStr
            = "{\"value\":[{\"resourceType\":\"randoypmb\",\"sku\":{\"name\":\"oormkfqlwxldyka\",\"tier\":\"Free\",\"size\":\"aolnjpnnbmjk\",\"family\":\"bjgsjjxxahmrn\",\"capacity\":177973727},\"capacity\":{\"minimum\":1916460685,\"maximum\":156378653,\"step\":319427729,\"default\":1974200246,\"allowedValues\":[739994606]}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SkuResource> response
            = manager.deployments().listSkus("ukkutvl", "hrpqhv", "blcouqehbhbcdszi", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("randoypmb", response.iterator().next().resourceType());
        Assertions.assertEquals("oormkfqlwxldyka", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.FREE, response.iterator().next().sku().tier());
        Assertions.assertEquals("aolnjpnnbmjk", response.iterator().next().sku().size());
        Assertions.assertEquals("bjgsjjxxahmrn", response.iterator().next().sku().family());
        Assertions.assertEquals(177973727, response.iterator().next().sku().capacity());
        Assertions.assertEquals(1916460685, response.iterator().next().capacity().minimum());
        Assertions.assertEquals(156378653, response.iterator().next().capacity().maximum());
        Assertions.assertEquals(319427729, response.iterator().next().capacity().step());
        Assertions.assertEquals(1974200246, response.iterator().next().capacity().defaultProperty());
        Assertions.assertEquals(739994606, response.iterator().next().capacity().allowedValues().get(0));
    }
}
