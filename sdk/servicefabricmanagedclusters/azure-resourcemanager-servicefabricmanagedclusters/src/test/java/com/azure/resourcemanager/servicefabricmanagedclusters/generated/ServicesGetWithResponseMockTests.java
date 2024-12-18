// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.MoveCost;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceCorrelationScheme;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServicePackageActivationMode;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"serviceKind\":\"ServiceResourceProperties\",\"provisioningState\":\"hbqzmizakakankjp\",\"serviceTypeName\":\"n\",\"partitionDescription\":{\"partitionScheme\":\"Partition\"},\"servicePackageActivationMode\":\"SharedProcess\",\"serviceDnsName\":\"joylh\",\"placementConstraints\":\"muoyxprimr\",\"correlationScheme\":[{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"eecjmeis\"},{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"tvasy\"}],\"serviceLoadMetrics\":[{\"name\":\"dzaumweooh\",\"weight\":\"Low\",\"primaryDefaultLoad\":493863799,\"secondaryDefaultLoad\":105918098,\"defaultLoad\":93570001}],\"servicePlacementPolicies\":[{\"type\":\"ServicePlacementPolicy\"},{\"type\":\"ServicePlacementPolicy\"}],\"defaultMoveCost\":\"Low\",\"scalingPolicies\":[{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}},{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}},{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}},{\"scalingMechanism\":{\"kind\":\"ScalingMechanism\"},\"scalingTrigger\":{\"kind\":\"ScalingTrigger\"}}]},\"location\":\"olbaemwmdx\",\"tags\":{\"xveabf\":\"wjscjpah\",\"qcttadijaeukmrsi\":\"xnmwmqtibxyijddt\",\"eqw\":\"ekpndzaapmudq\",\"bu\":\"gp\"},\"id\":\"wyxebeybpmzz\",\"name\":\"rtffyaqitmh\",\"type\":\"eioqaqhvse\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ServiceResource response = manager.services()
            .getWithResponse("rhptilluc", "iqtgdqoh", "cwsldri", "etpwbralll", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("muoyxprimr", response.properties().placementConstraints());
        Assertions.assertEquals(ServiceCorrelationScheme.NON_ALIGNED_AFFINITY,
            response.properties().correlationScheme().get(0).scheme());
        Assertions.assertEquals("eecjmeis", response.properties().correlationScheme().get(0).serviceName());
        Assertions.assertEquals("dzaumweooh", response.properties().serviceLoadMetrics().get(0).name());
        Assertions.assertEquals(ServiceLoadMetricWeight.LOW,
            response.properties().serviceLoadMetrics().get(0).weight());
        Assertions.assertEquals(493863799, response.properties().serviceLoadMetrics().get(0).primaryDefaultLoad());
        Assertions.assertEquals(105918098, response.properties().serviceLoadMetrics().get(0).secondaryDefaultLoad());
        Assertions.assertEquals(93570001, response.properties().serviceLoadMetrics().get(0).defaultLoad());
        Assertions.assertEquals(MoveCost.LOW, response.properties().defaultMoveCost());
        Assertions.assertEquals("n", response.properties().serviceTypeName());
        Assertions.assertEquals(ServicePackageActivationMode.SHARED_PROCESS,
            response.properties().servicePackageActivationMode());
        Assertions.assertEquals("joylh", response.properties().serviceDnsName());
        Assertions.assertEquals("olbaemwmdx", response.location());
        Assertions.assertEquals("wjscjpah", response.tags().get("xveabf"));
    }
}
