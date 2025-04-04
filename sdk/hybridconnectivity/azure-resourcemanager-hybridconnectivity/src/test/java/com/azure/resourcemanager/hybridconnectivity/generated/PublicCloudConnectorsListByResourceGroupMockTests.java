// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager;
import com.azure.resourcemanager.hybridconnectivity.models.HostType;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnector;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PublicCloudConnectorsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"awsCloudProfile\":{\"accountId\":\"wznm\",\"excludedAccounts\":[\"knso\",\"gj\",\"xbldtlwwrlkdmtn\"],\"isOrganizationalAccount\":false},\"hostType\":\"AWS\",\"provisioningState\":\"Failed\",\"connectorPrimaryIdentifier\":\"lxdy\"},\"location\":\"syocogjltdtbnnha\",\"tags\":{\"amqgxqquezikyw\":\"crkvcikhnv\",\"lla\":\"gxk\",\"z\":\"melwuipiccjz\"},\"id\":\"v\",\"name\":\"vvcnayr\",\"type\":\"yrnxxmueedn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridConnectivityManager manager = HybridConnectivityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PublicCloudConnector> response
            = manager.publicCloudConnectors().listByResourceGroup("pcdpumnz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("syocogjltdtbnnha", response.iterator().next().location());
        Assertions.assertEquals("crkvcikhnv", response.iterator().next().tags().get("amqgxqquezikyw"));
        Assertions.assertEquals("wznm", response.iterator().next().properties().awsCloudProfile().accountId());
        Assertions.assertEquals("knso",
            response.iterator().next().properties().awsCloudProfile().excludedAccounts().get(0));
        Assertions.assertEquals(false,
            response.iterator().next().properties().awsCloudProfile().isOrganizationalAccount());
        Assertions.assertEquals(HostType.AWS, response.iterator().next().properties().hostType());
    }
}
