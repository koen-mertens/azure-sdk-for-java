// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.IncidentComment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IncidentCommentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdTimeUtc\":\"2021-02-21T09:44:27Z\",\"lastModifiedTimeUtc\":\"2020-12-24T02:22:44Z\",\"message\":\"p\",\"author\":{\"email\":\"zwv\",\"name\":\"rgyngydgrpxnca\",\"objectId\":\"7ab9689a-8b98-4836-bfe3-ad4c95c8e09b\",\"userPrincipalName\":\"aondjrkclamgg\"}},\"etag\":\"lmf\",\"id\":\"doqey\",\"name\":\"gltygxhqfgq\",\"type\":\"ayejsxtlgflwfgz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IncidentComment response = manager.incidentComments()
            .getWithResponse("ilfjqqacdmk", "wxdcvjwcyz", "akeciqchx", "tuicds", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lmf", response.etag());
        Assertions.assertEquals("p", response.message());
    }
}
