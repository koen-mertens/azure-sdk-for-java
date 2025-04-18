// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.models.OperationActionType;
import com.azure.resourcemanager.providerhub.models.OperationOrigins;
import com.azure.resourcemanager.providerhub.models.OperationsDefinition;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProviderRegistrationsGenerateOperationsWithResponseMockTests {
    @Test
    public void testGenerateOperationsWithResponse() throws Exception {
        String responseStr
            = "[{\"name\":\"ptysprq\",\"isDataAction\":true,\"origin\":\"System\",\"display\":{\"provider\":\"ojpslsvjgpliufi\",\"resource\":\"woyxqvapcohhou\",\"operation\":\"qpqojxcxzrzd\",\"description\":\"gdzbenr\"},\"actionType\":\"Internal\",\"properties\":\"datawetzqddtjwfljh\"},{\"name\":\"namtuatmzw\",\"isDataAction\":true,\"origin\":\"System\",\"display\":{\"provider\":\"qtjzmizvgbg\",\"resource\":\"tzuuvb\",\"operation\":\"ngrebwg\",\"description\":\"ahttzlswvajqfut\"},\"actionType\":\"NotSpecified\",\"properties\":\"dataqzasunwqrjzfrgqh\"},{\"name\":\"ohcmbu\",\"isDataAction\":true,\"origin\":\"User\",\"display\":{\"provider\":\"ohmbpyr\",\"resource\":\"xameblydyvkfkm\",\"operation\":\"ocxnehvsmtodl\",\"description\":\"pyapucygvoav\"},\"actionType\":\"NotSpecified\",\"properties\":\"datasxlghieegjlg\"}]";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ProviderHubManager manager = ProviderHubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        List<OperationsDefinition> response = manager.providerRegistrations()
            .generateOperationsWithResponse("jklinh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ptysprq", response.get(0).name());
        Assertions.assertEquals(true, response.get(0).isDataAction());
        Assertions.assertEquals(OperationOrigins.SYSTEM, response.get(0).origin());
        Assertions.assertEquals("ojpslsvjgpliufi", response.get(0).display().provider());
        Assertions.assertEquals("woyxqvapcohhou", response.get(0).display().resource());
        Assertions.assertEquals("qpqojxcxzrzd", response.get(0).display().operation());
        Assertions.assertEquals("gdzbenr", response.get(0).display().description());
        Assertions.assertEquals(OperationActionType.INTERNAL, response.get(0).actionType());
    }
}
