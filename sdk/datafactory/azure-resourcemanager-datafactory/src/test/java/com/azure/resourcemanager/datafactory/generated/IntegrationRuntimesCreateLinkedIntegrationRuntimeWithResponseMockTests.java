// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.CreateLinkedIntegrationRuntimeRequest;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeStatusResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesCreateLinkedIntegrationRuntimeWithResponseMockTests {
    @Test
    public void testCreateLinkedIntegrationRuntimeWithResponse() throws Exception {
        String responseStr
            = "{\"name\":\"yknsdwcxyagid\",\"properties\":{\"type\":\"IntegrationRuntimeStatus\",\"dataFactoryName\":\"nsnunvgqtvgxpe\",\"state\":\"Stopped\",\"qrmibmnmxsp\":\"datadyvrdsvsjgt\",\"vzngpa\":\"datatirvzbmhmkoxs\",\"c\":\"dataymeb\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        IntegrationRuntimeStatusResponse response = manager.integrationRuntimes()
            .createLinkedIntegrationRuntimeWithResponse("oqjmlzlkizjss", "wo", "fngm",
                new CreateLinkedIntegrationRuntimeRequest().withName("rjsbwdsitypa")
                    .withSubscriptionId("vjr")
                    .withDataFactoryName("i")
                    .withDataFactoryLocation("gadusln"),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
