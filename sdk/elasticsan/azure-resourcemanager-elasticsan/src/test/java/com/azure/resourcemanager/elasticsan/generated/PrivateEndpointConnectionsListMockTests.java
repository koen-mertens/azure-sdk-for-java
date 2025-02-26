// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnection;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"durgkakmokz\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"lffhmouwqlg\",\"actionsRequired\":\"fzeeyebizik\"},\"groupIds\":[\"hqlbjbsybbq\",\"r\",\"t\",\"dgmfpgvmpipasl\"]},\"id\":\"aqfxss\",\"name\":\"wutwbdsre\",\"type\":\"pdrhne\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnection> response = manager.privateEndpointConnections()
            .list("ystawfsdjpvkvp", "jxbkzbzkdvn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("lffhmouwqlg",
            response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("fzeeyebizik",
            response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("hqlbjbsybbq", response.iterator().next().groupIds().get(0));
    }
}
