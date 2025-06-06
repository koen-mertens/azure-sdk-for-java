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
import com.azure.resourcemanager.elasticsan.models.Snapshot;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumeSnapshotsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"creationData\":{\"sourceId\":\"ttpkiwkkbnujrywv\"},\"provisioningState\":\"Deleted\",\"sourceVolumeSizeGiB\":9175524620575954054,\"volumeName\":\"curdoiwiitht\"},\"id\":\"ubxcbihw\",\"name\":\"knfd\",\"type\":\"twjchrdg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Snapshot response = manager.volumeSnapshots()
            .getWithResponse("mdscwxqupev", "hfstotxhojujbyp", "lmcuvhixb", "xyfwnylrcool",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ttpkiwkkbnujrywv", response.creationData().sourceId());
    }
}
