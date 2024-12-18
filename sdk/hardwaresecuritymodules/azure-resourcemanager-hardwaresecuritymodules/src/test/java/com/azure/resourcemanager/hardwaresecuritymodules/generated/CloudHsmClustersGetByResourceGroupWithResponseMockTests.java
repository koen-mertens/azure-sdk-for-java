// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager;
import com.azure.resourcemanager.hardwaresecuritymodules.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmCluster;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuFamily;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuName;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PublicNetworkAccess;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CloudHsmClustersGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"activationState\":\"Active\",\"autoGeneratedDomainNameLabelScope\":\"SubscriptionReuse\",\"hsms\":[{\"fqdn\":\"uwsyrsndsytgadg\",\"state\":\"aeaeneqnzarrw\",\"stateMessage\":\"uu\"},{\"fqdn\":\"fqka\",\"state\":\"wiipfpub\",\"stateMessage\":\"bwwift\"}],\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"sgplsakn\",\"n\"]},\"etag\":\"ynl\",\"id\":\"huopxodlqiynto\",\"name\":\"zihleosjswsr\",\"type\":\"slyzrpzbchckqq\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\",\"groupIds\":[\"suiizynkedyat\",\"wyhqmibzyhwits\",\"ypyynpcdpumnzg\",\"wznm\"]},\"etag\":\"iknsorgjh\",\"id\":\"ldtlwwr\",\"name\":\"kdmtncvokotll\",\"type\":\"d\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"InternalError\",\"groupIds\":[\"ogjltdtbnnhad\",\"ocrkvcikh\",\"vpa\"]},\"etag\":\"gxqquezik\",\"id\":\"ggxkallatmelwuip\",\"name\":\"ccjzkzivgvv\",\"type\":\"nayrhyrnxxmueedn\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Failed\",\"groupIds\":[\"wq\",\"tchealmf\",\"tdaaygdvwvg\"]},\"etag\":\"ohgwxrtfudxepxg\",\"id\":\"agvrvmnpkuk\",\"name\":\"himdbl\",\"type\":\"gwimfn\"}],\"provisioningState\":\"Succeeded\",\"publicNetworkAccess\":\"Disabled\",\"statusMessage\":\"mszkkfo\"},\"identity\":{\"principalId\":\"dc46539d-aa96-49ff-9615-e2586ba5df0b\",\"tenantId\":\"2076415c-8d21-460e-826b-0b9464865b97\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"fjawneaivxwczel\":{\"principalId\":\"fb0cb8f2-51f5-4415-852a-b98d44615e60\",\"clientId\":\"63e0a780-718c-48b1-bd3d-62f471ea9327\"}}},\"sku\":{\"family\":\"B\",\"name\":\"Standard_B1\",\"capacity\":2047901217},\"location\":\"feaenwab\",\"tags\":{\"dxbjhwuaanozj\":\"kl\"},\"id\":\"sphyoulpjrvxa\",\"name\":\"l\",\"type\":\"vimjwos\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HardwareSecurityModulesManager manager = HardwareSecurityModulesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CloudHsmCluster response = manager.cloudHsmClusters()
            .getByResourceGroupWithResponse("ymkcdyhb", "kkpwdreqnovvq", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("feaenwab", response.location());
        Assertions.assertEquals("kl", response.tags().get("dxbjhwuaanozj"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(CloudHsmClusterSkuFamily.B, response.sku().family());
        Assertions.assertEquals(CloudHsmClusterSkuName.STANDARD_B1, response.sku().name());
        Assertions.assertEquals(2047901217, response.sku().capacity());
        Assertions.assertEquals(AutoGeneratedDomainNameLabelScope.SUBSCRIPTION_REUSE,
            response.properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, response.properties().publicNetworkAccess());
    }
}
