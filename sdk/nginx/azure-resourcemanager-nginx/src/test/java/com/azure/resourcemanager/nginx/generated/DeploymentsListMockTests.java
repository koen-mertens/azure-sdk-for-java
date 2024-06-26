// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.nginx.NginxManager;
import com.azure.resourcemanager.nginx.models.IdentityType;
import com.azure.resourcemanager.nginx.models.NginxDeployment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DeploymentsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"identity\":{\"principalId\":\"wifto\",\"tenantId\":\"kvpuvksgplsaknyn\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"eosjswsr\":{\"principalId\":\"ph\",\"clientId\":\"pxodlqiyntorzih\"},\"zynkedya\":{\"principalId\":\"lyzrpzbchckqqzqi\",\"clientId\":\"iysui\"},\"pcdpumnz\":{\"principalId\":\"wyhqmibzyhwits\",\"clientId\":\"pyy\"}}},\"properties\":{\"provisioningState\":\"Deleting\",\"nginxVersion\":\"mabiknsorgjhxb\",\"managedResourceGroup\":\"tlwwrlk\",\"networkProfile\":{\"frontEndIPConfiguration\":{\"publicIPAddresses\":[{},{},{},{}],\"privateIPAddresses\":[{}]},\"networkInterfaceConfiguration\":{\"subnetId\":\"tllxdyhgsyocogj\"}},\"ipAddress\":\"dtbnnha\",\"enableDiagnosticsSupport\":true,\"logging\":{\"storageAccount\":{\"accountName\":\"vcikhnvpamqgx\",\"containerName\":\"u\"}},\"scalingProperties\":{\"capacity\":1817330156,\"autoScaleSettings\":{\"profiles\":[{\"name\":\"ggxkallatmelwuip\",\"capacity\":{\"min\":555730544,\"max\":1103817240}},{\"name\":\"jzkzi\",\"capacity\":{\"min\":766917495,\"max\":1783583685}},{\"name\":\"vc\",\"capacity\":{\"min\":2028866606,\"max\":192957128}}]}},\"autoUpgradeProfile\":{\"upgradeChannel\":\"hyrnxxmu\"},\"userProfile\":{\"preferredEmail\":\"ndrdvstkwq\"}},\"sku\":{\"name\":\"chea\"},\"location\":\"fmtdaaygdvwvgp\",\"tags\":{\"xrtfudxep\":\"g\",\"himdbl\":\"gyqagvrvmnpkuk\",\"hfjx\":\"gwimfn\"},\"id\":\"mszkkfo\",\"name\":\"rey\",\"type\":\"kzikfjawneaivxwc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NginxManager manager = NginxManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NginxDeployment> response = manager.deployments().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fmtdaaygdvwvgp", response.iterator().next().location());
        Assertions.assertEquals("g", response.iterator().next().tags().get("xrtfudxep"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("tlwwrlk", response.iterator().next().properties().managedResourceGroup());
        Assertions.assertEquals("tllxdyhgsyocogj",
            response.iterator().next().properties().networkProfile().networkInterfaceConfiguration().subnetId());
        Assertions.assertEquals(true, response.iterator().next().properties().enableDiagnosticsSupport());
        Assertions.assertEquals("vcikhnvpamqgx",
            response.iterator().next().properties().logging().storageAccount().accountName());
        Assertions.assertEquals("u",
            response.iterator().next().properties().logging().storageAccount().containerName());
        Assertions.assertEquals(1817330156, response.iterator().next().properties().scalingProperties().capacity());
        Assertions.assertEquals("ggxkallatmelwuip",
            response.iterator().next().properties().scalingProperties().profiles().get(0).name());
        Assertions.assertEquals(555730544,
            response.iterator().next().properties().scalingProperties().profiles().get(0).capacity().min());
        Assertions.assertEquals(1103817240,
            response.iterator().next().properties().scalingProperties().profiles().get(0).capacity().max());
        Assertions.assertEquals("hyrnxxmu",
            response.iterator().next().properties().autoUpgradeProfile().upgradeChannel());
        Assertions.assertEquals("ndrdvstkwq", response.iterator().next().properties().userProfile().preferredEmail());
        Assertions.assertEquals("chea", response.iterator().next().sku().name());
    }
}
