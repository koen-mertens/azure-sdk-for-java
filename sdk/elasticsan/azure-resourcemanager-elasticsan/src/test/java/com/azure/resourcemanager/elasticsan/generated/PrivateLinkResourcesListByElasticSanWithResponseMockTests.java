// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResourceListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkResourcesListByElasticSanWithResponseMockTests {
    @Test
    public void testListByElasticSanWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"groupId\":\"mcwaekrrjr\",\"requiredMembers\":[\"xt\",\"gumhjglikkxws\"],\"requiredZoneNames\":[\"bq\",\"vuzlm\",\"felfktg\",\"lcrpw\"]},\"id\":\"eznoig\",\"name\":\"rnjwmw\",\"type\":\"pn\"}],\"nextLink\":\"azej\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PrivateLinkResourceListResult response = manager.privateLinkResources()
            .listByElasticSanWithResponse("rvmtgjq", "pyostronzmyhgfi", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("bq", response.value().get(0).requiredZoneNames().get(0));
    }
}
