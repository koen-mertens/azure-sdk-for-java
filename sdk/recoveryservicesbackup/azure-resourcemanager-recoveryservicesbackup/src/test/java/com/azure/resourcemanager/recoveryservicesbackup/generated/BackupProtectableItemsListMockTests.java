// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadProtectableItemResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupProtectableItemsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"protectableItemType\":\"WorkloadProtectableItem\",\"backupManagementType\":\"ektm\",\"workloadType\":\"z\",\"friendlyName\":\"tzamicbig\",\"protectionState\":\"ProtectionFailed\"},\"eTag\":\"zseznuxkeuairaa\",\"location\":\"m\",\"tags\":{\"z\":\"jbedpfixlhupmomi\",\"yxelyicghflr\":\"dnpxpkcdpr\",\"yghsf\":\"fss\"},\"id\":\"rkbhammgmqfm\",\"name\":\"fgvqcpdw\",\"type\":\"gquxweysland\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<WorkloadProtectableItemResource> response = manager.backupProtectableItems()
            .list("gejkbvhh", "aurghooxa", "xb", "hxjxjoezlqxrkdkn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("m", response.iterator().next().location());
        Assertions.assertEquals("jbedpfixlhupmomi", response.iterator().next().tags().get("z"));
        Assertions.assertEquals("ektm", response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("z", response.iterator().next().properties().workloadType());
        Assertions.assertEquals("tzamicbig", response.iterator().next().properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED,
            response.iterator().next().properties().protectionState());
        Assertions.assertEquals("zseznuxkeuairaa", response.iterator().next().etag());
    }
}
