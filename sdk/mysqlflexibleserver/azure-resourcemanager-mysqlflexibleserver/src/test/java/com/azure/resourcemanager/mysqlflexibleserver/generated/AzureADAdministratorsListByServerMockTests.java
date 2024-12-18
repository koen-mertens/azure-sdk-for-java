// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorType;
import com.azure.resourcemanager.mysqlflexibleserver.models.AzureADAdministrator;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AzureADAdministratorsListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"administratorType\":\"ActiveDirectory\",\"login\":\"twbdsrezpdrhn\",\"sid\":\"yowqkdwytisibir\",\"tenantId\":\"pikpz\",\"identityResourceId\":\"ejzanlfz\"},\"id\":\"av\",\"name\":\"mbzonokix\",\"type\":\"jq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AzureADAdministrator> response
            = manager.azureADAdministrators().listByServer("haq", "x", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(AdministratorType.ACTIVE_DIRECTORY, response.iterator().next().administratorType());
        Assertions.assertEquals("twbdsrezpdrhn", response.iterator().next().login());
        Assertions.assertEquals("yowqkdwytisibir", response.iterator().next().sid());
        Assertions.assertEquals("pikpz", response.iterator().next().tenantId());
        Assertions.assertEquals("ejzanlfz", response.iterator().next().identityResourceId());
    }
}
