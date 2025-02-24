// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabric.ServiceFabricManager;
import com.azure.resourcemanager.servicefabric.models.ArmServicePackageActivationMode;
import com.azure.resourcemanager.servicefabric.models.MoveCost;
import com.azure.resourcemanager.servicefabric.models.ServiceCorrelationScheme;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabric.models.ServiceResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServicesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"serviceKind\":\"ServiceResourceProperties\",\"provisioningState\":\"uwmncs\",\"serviceTypeName\":\"ijf\",\"partitionDescription\":{\"partitionScheme\":\"PartitionSchemeDescription\"},\"servicePackageActivationMode\":\"ExclusiveProcess\",\"serviceDnsName\":\"ekrsgs\",\"placementConstraints\":\"dhuzqgnjdgk\",\"correlationScheme\":[{\"scheme\":\"Invalid\",\"serviceName\":\"liqhzvhx\"},{\"scheme\":\"AlignedAffinity\",\"serviceName\":\"omtkub\"}],\"serviceLoadMetrics\":[{\"name\":\"pnvdxz\",\"weight\":\"Medium\",\"primaryDefaultLoad\":1207165403,\"secondaryDefaultLoad\":670431250,\"defaultLoad\":589968603},{\"name\":\"evqagtl\",\"weight\":\"Medium\",\"primaryDefaultLoad\":1706986082,\"secondaryDefaultLoad\":1272275597,\"defaultLoad\":2094473580}],\"servicePlacementPolicies\":[{\"type\":\"ServicePlacementPolicyDescription\"},{\"type\":\"ServicePlacementPolicyDescription\"},{\"type\":\"ServicePlacementPolicyDescription\"},{\"type\":\"ServicePlacementPolicyDescription\"}],\"defaultMoveCost\":\"High\"},\"location\":\"trdcnifmzzs\",\"tags\":{\"suxmpraf\":\"brn\"},\"etag\":\"ckh\",\"id\":\"xvd\",\"name\":\"ffwafq\",\"type\":\"oudaspavehhrvk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManager manager = ServiceFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ServiceResource> response
            = manager.services().list("uvvfonkp", "hqyikvy", "auy", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dhuzqgnjdgk", response.iterator().next().properties().placementConstraints());
        Assertions.assertEquals(ServiceCorrelationScheme.INVALID,
            response.iterator().next().properties().correlationScheme().get(0).scheme());
        Assertions.assertEquals("liqhzvhx",
            response.iterator().next().properties().correlationScheme().get(0).serviceName());
        Assertions.assertEquals("pnvdxz", response.iterator().next().properties().serviceLoadMetrics().get(0).name());
        Assertions.assertEquals(ServiceLoadMetricWeight.MEDIUM,
            response.iterator().next().properties().serviceLoadMetrics().get(0).weight());
        Assertions.assertEquals(1207165403,
            response.iterator().next().properties().serviceLoadMetrics().get(0).primaryDefaultLoad());
        Assertions.assertEquals(670431250,
            response.iterator().next().properties().serviceLoadMetrics().get(0).secondaryDefaultLoad());
        Assertions.assertEquals(589968603,
            response.iterator().next().properties().serviceLoadMetrics().get(0).defaultLoad());
        Assertions.assertEquals(MoveCost.HIGH, response.iterator().next().properties().defaultMoveCost());
        Assertions.assertEquals("ijf", response.iterator().next().properties().serviceTypeName());
        Assertions.assertEquals(ArmServicePackageActivationMode.EXCLUSIVE_PROCESS,
            response.iterator().next().properties().servicePackageActivationMode());
        Assertions.assertEquals("ekrsgs", response.iterator().next().properties().serviceDnsName());
        Assertions.assertEquals("trdcnifmzzs", response.iterator().next().location());
        Assertions.assertEquals("brn", response.iterator().next().tags().get("suxmpraf"));
    }
}
