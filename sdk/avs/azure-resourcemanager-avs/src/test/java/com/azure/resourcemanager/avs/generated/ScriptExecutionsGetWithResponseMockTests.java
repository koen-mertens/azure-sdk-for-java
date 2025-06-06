// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.ScriptExecution;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScriptExecutionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"scriptCmdletId\":\"ohec\",\"parameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"pwndyqlea\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"lklmtkhlo\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"kxxpvbrd\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"jmzsyzfh\"}],\"hiddenParameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"h\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"k\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"yych\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"nsjlpjrtws\"}],\"failureReason\":\"vv\",\"timeout\":\"icphvtrrmhw\",\"retention\":\"fdpyflubh\",\"submittedAt\":\"2021-03-31T10:36:55Z\",\"startedAt\":\"2021-06-05T23:01:13Z\",\"finishedAt\":\"2021-05-09T12:14:46Z\",\"provisioningState\":\"Canceled\",\"output\":[\"whhmemhooc\"],\"namedOutputs\":{\"qmemc\":\"datan\",\"mykyujxsglhs\":\"datajk\",\"fihotj\":\"datarryejylmbkzudnig\"},\"information\":[\"pxuzzjg\",\"refqy\",\"qotoihiqakydiwfb\",\"kwpzdqtvh\"],\"warnings\":[\"odaqaxsi\",\"ietgbebjfu\"],\"errors\":[\"oichdlpnfpubnt\",\"batzviqsows\",\"aelcat\",\"cjuhplrvkm\"]},\"id\":\"wmj\",\"name\":\"lgfggcvk\",\"type\":\"y\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ScriptExecution response = manager.scriptExecutions()
            .getWithResponse("ycjimryvwgcwwpbm", "gwe", "ydsx", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ohec", response.scriptCmdletId());
        Assertions.assertEquals("pwndyqlea", response.parameters().get(0).name());
        Assertions.assertEquals("h", response.hiddenParameters().get(0).name());
        Assertions.assertEquals("vv", response.failureReason());
        Assertions.assertEquals("icphvtrrmhw", response.timeout());
        Assertions.assertEquals("fdpyflubh", response.retention());
        Assertions.assertEquals("whhmemhooc", response.output().get(0));
    }
}
