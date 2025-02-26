// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointResource;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpointType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VirtualEndpointsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"id\":\"jqirwrw\",\"name\":\"oxffif\",\"type\":\"wrsnewmozqvbu\",\"properties\":{\"endpointType\":\"ReadWrite\",\"members\":[\"ycxhxzgaztta\",\"o\",\"dvmfqhppub\"],\"virtualEndpoints\":[\"epdfgkmtdherng\",\"tcjuahokqto\"]}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualEndpointResource response = manager.virtualEndpoints()
            .getWithResponse("viauogphua", "tvt", "ukyefchnmnahmnxh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(VirtualEndpointType.READ_WRITE, response.endpointType());
        Assertions.assertEquals("ycxhxzgaztta", response.members().get(0));
    }
}
