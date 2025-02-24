// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.Backup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupsListByVaultMockTests {
    @Test
    public void testListByVault() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"backupId\":\"oznnhdrlktgj\",\"creationDate\":\"2021-11-15T20:11:36Z\",\"provisioningState\":\"uxhemlwywaeeczg\",\"size\":8887879852420122717,\"label\":\"lelssxblycsxzujk\",\"backupType\":\"Scheduled\",\"failureReason\":\"mdesqp\",\"volumeResourceId\":\"pvmjcdoewbid\",\"useExistingSnapshot\":false,\"snapshotName\":\"owx\",\"backupPolicyResourceId\":\"piudeugfsxzecpa\",\"isLargeVolume\":false},\"id\":\"fykhvuhxepmru\",\"name\":\"znabaobns\",\"type\":\"ujdjltymkmvg\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Backup> response
            = manager.backups().listByVault("n", "naoyank", "oe", "swankltytmh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lelssxblycsxzujk", response.iterator().next().label());
        Assertions.assertEquals("pvmjcdoewbid", response.iterator().next().volumeResourceId());
        Assertions.assertEquals(false, response.iterator().next().useExistingSnapshot());
        Assertions.assertEquals("owx", response.iterator().next().snapshotName());
    }
}
