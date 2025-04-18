// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elastic.ElasticManager;
import com.azure.resourcemanager.elastic.models.MonitoringTagRules;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import com.azure.resourcemanager.elastic.models.TagAction;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TagRulesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"logRules\":{\"sendAadLogs\":false,\"sendSubscriptionLogs\":false,\"sendActivityLogs\":true,\"filteringTags\":[{\"name\":\"mwzn\",\"value\":\"biknsorgjhxbld\",\"action\":\"Exclude\"},{\"name\":\"rlkdmtncvokotl\",\"value\":\"d\",\"action\":\"Include\"},{\"name\":\"y\",\"value\":\"ogjltdtbnnhad\",\"action\":\"Exclude\"},{\"name\":\"kvci\",\"value\":\"nvpamq\",\"action\":\"Include\"}]}},\"id\":\"u\",\"name\":\"zikywgg\",\"type\":\"kallatmel\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticManager manager = ElasticManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<MonitoringTagRules> response
            = manager.tagRules().list("zynkedya", "rwyhqmibzyhwitsm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(ProvisioningState.DELETED, response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(false, response.iterator().next().properties().logRules().sendAadLogs());
        Assertions.assertEquals(false, response.iterator().next().properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(true, response.iterator().next().properties().logRules().sendActivityLogs());
        Assertions.assertEquals("mwzn",
            response.iterator().next().properties().logRules().filteringTags().get(0).name());
        Assertions.assertEquals("biknsorgjhxbld",
            response.iterator().next().properties().logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE,
            response.iterator().next().properties().logRules().filteringTags().get(0).action());
    }
}
