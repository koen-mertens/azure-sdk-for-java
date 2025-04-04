// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.MetricAggregationType;
import com.azure.resourcemanager.netapp.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"jvpglydzgk\",\"display\":{\"provider\":\"eevt\",\"resource\":\"pryu\",\"operation\":\"wytpzdmovz\",\"description\":\"va\"},\"origin\":\"zqadf\",\"properties\":{\"serviceSpecification\":{\"metricSpecifications\":[{\"name\":\"glae\",\"displayName\":\"ndtic\",\"displayDescription\":\"pvz\",\"unit\":\"qtmldgxo\",\"supportedAggregationTypes\":[\"Average\",\"Average\"],\"supportedTimeGrainTypes\":[\"pkc\"],\"internalMetricName\":\"yzriykhy\",\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"jlb\",\"sourceMdmNamespace\":\"qvkjlmxho\",\"dimensions\":[{},{},{}],\"aggregationType\":\"hdwdi\",\"fillGapWithZero\":true,\"category\":\"nraauzz\",\"resourceIdDimensionNameOverride\":\"jazysdzhezwwvaiq\",\"isInternal\":false},{\"name\":\"fonkphhqyikvyla\",\"displayName\":\"avluwmncs\",\"displayDescription\":\"ijf\",\"unit\":\"vpo\",\"supportedAggregationTypes\":[\"Average\"],\"supportedTimeGrainTypes\":[\"gbdhuzqgnjdg\",\"ynscl\"],\"internalMetricName\":\"hzvhxnkomtkubo\",\"enableRegionalMdmAccount\":false,\"sourceMdmAccount\":\"vdxzxhihfrbbc\",\"sourceMdmNamespace\":\"qagt\",\"dimensions\":[{},{},{},{}],\"aggregationType\":\"lfkqojpy\",\"fillGapWithZero\":false,\"category\":\"rdcnifmzzsdy\",\"resourceIdDimensionNameOverride\":\"rnysux\",\"isInternal\":true}],\"logSpecifications\":[{\"name\":\"g\",\"displayName\":\"hocxvdfffwafqrou\"},{\"name\":\"spave\",\"displayName\":\"r\"},{\"name\":\"bunzozudh\",\"displayName\":\"gkmoyxcdyuibhmfd\"},{\"name\":\"zydvfvf\",\"displayName\":\"naeo\"}]}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jvpglydzgk", response.iterator().next().name());
        Assertions.assertEquals("eevt", response.iterator().next().display().provider());
        Assertions.assertEquals("pryu", response.iterator().next().display().resource());
        Assertions.assertEquals("wytpzdmovz", response.iterator().next().display().operation());
        Assertions.assertEquals("va", response.iterator().next().display().description());
        Assertions.assertEquals("zqadf", response.iterator().next().origin());
        Assertions.assertEquals("glae",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("ndtic",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("pvz",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("qtmldgxo",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals(MetricAggregationType.AVERAGE,
            response.iterator()
                .next()
                .serviceSpecification()
                .metricSpecifications()
                .get(0)
                .supportedAggregationTypes()
                .get(0));
        Assertions.assertEquals("pkc",
            response.iterator()
                .next()
                .serviceSpecification()
                .metricSpecifications()
                .get(0)
                .supportedTimeGrainTypes()
                .get(0));
        Assertions.assertEquals("yzriykhy",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).internalMetricName());
        Assertions.assertEquals(true,
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("jlb",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("qvkjlmxho",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals("hdwdi",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(true,
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("nraauzz",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("jazysdzhezwwvaiq",
            response.iterator()
                .next()
                .serviceSpecification()
                .metricSpecifications()
                .get(0)
                .resourceIdDimensionNameOverride());
        Assertions.assertEquals(false,
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("g",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("hocxvdfffwafqrou",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).displayName());
    }
}
