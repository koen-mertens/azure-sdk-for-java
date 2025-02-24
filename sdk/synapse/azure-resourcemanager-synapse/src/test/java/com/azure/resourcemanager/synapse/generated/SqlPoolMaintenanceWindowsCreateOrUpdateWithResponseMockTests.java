// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowsInner;
import com.azure.resourcemanager.synapse.models.DayOfWeek;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SqlPoolMaintenanceWindowsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr = "{}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        manager.sqlPoolMaintenanceWindows()
            .createOrUpdateWithResponse("wp", "chgjtnhtukfacih", "bfntumeezbxvq", "bnuvwcg",
                new MaintenanceWindowsInner().withTimeRanges(Arrays.asList(
                    new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.WEDNESDAY)
                        .withStartTime("jzwxuqgovsxpwwz")
                        .withDuration("fmkk"),
                    new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.WEDNESDAY)
                        .withStartTime("redmlscgrllcc")
                        .withDuration("ovjowazhpabacom"),
                    new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.MONDAY)
                        .withStartTime("gkw")
                        .withDuration("nsrqor"),
                    new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.SUNDAY)
                        .withStartTime("mv")
                        .withDuration("bxeetqujxcxxqn"))),
                com.azure.core.util.Context.NONE);

    }
}
