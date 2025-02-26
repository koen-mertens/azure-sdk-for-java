// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.AccessListClusterSuccessResponse;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccessListClustersWithResponseMockTests {
    @Test
    public void testListClustersWithResponse() throws Exception {
        String responseStr
            = "{\"kind\":\"iqg\",\"metadata\":{\"first\":\"okzrus\",\"last\":\"vhczznvfby\",\"prev\":\"sxjwwixz\",\"next\":\"mwmxqhndvnoamld\",\"total_size\":1759834581},\"data\":[{\"kind\":\"djh\",\"id\":\"lzok\",\"metadata\":{\"self\":\"xpelnjetagltsx\",\"resource_name\":\"tft\",\"created_at\":\"pnpbswveflocc\",\"updated_at\":\"mozi\",\"deleted_at\":\"ipgawtxx\"},\"display_name\":\"y\",\"spec\":{\"display_name\":\"cjxgrytf\",\"availability\":\"cy\",\"cloud\":\"lrmcaykg\",\"zone\":\"oxuztrksx\",\"region\":\"ndfcpfn\",\"kafka_bootstrap_endpoint\":\"thjtwk\",\"http_endpoint\":\"osrxuzvoa\",\"api_endpoint\":\"tcqiosmg\",\"config\":{\"kind\":\"hgxqdlyrt\"},\"environment\":{\"id\":\"ap\",\"environment\":\"tz\",\"related\":\"tbhjmznnbsoqe\",\"resource_name\":\"larvlagunbtg\"},\"network\":{\"id\":\"wlnbm\",\"environment\":\"reeudzqavb\",\"related\":\"qmjxlyyzglgouwtl\",\"resource_name\":\"jyuojqtobaxkjeyt\"},\"byok\":{\"id\":\"bfjkw\",\"related\":\"snkq\",\"resource_name\":\"syrq\"}},\"status\":{\"phase\":\"qhd\",\"cku\":2136418443}},{\"kind\":\"ulkpakd\",\"id\":\"fmjnnawtqa\",\"metadata\":{\"self\":\"uckpggqoweyir\",\"resource_name\":\"lisn\",\"created_at\":\"fl\",\"updated_at\":\"mpizru\",\"deleted_at\":\"pqxpx\"},\"display_name\":\"fcngjsa\",\"spec\":{\"display_name\":\"ixtmkzjvkviirhgf\",\"availability\":\"wsdpgratzvzb\",\"cloud\":\"byvi\",\"zone\":\"ctbrxkjzwrgxffm\",\"region\":\"kwfbkgo\",\"kafka_bootstrap_endpoint\":\"wopdbydpiz\",\"http_endpoint\":\"clnapxbiygnugjkn\",\"api_endpoint\":\"mfcttux\",\"config\":{\"kind\":\"i\"},\"environment\":{\"id\":\"qoiquvrehmrnjhv\",\"environment\":\"jztczytqj\",\"related\":\"h\",\"resource_name\":\"unfprnjletlxs\"},\"network\":{\"id\":\"ddoui\",\"environment\":\"mowaziynknlqwzdv\",\"related\":\"w\",\"resource_name\":\"qszdtmaajquhuxyl\"},\"byok\":{\"id\":\"m\",\"related\":\"g\",\"resource_name\":\"mzyospspshck\"}},\"status\":{\"phase\":\"jpmspbpssdfppy\",\"cku\":1546979917}},{\"kind\":\"eyujtvczkcnyxrx\",\"id\":\"njdxvglnkvxl\",\"metadata\":{\"self\":\"glqivbgkcv\",\"resource_name\":\"pzvuqdflvo\",\"created_at\":\"yp\",\"updated_at\":\"ubcpzgpxti\",\"deleted_at\":\"j\"},\"display_name\":\"idibgqjxgpn\",\"spec\":{\"display_name\":\"ov\",\"availability\":\"pikqmh\",\"cloud\":\"owjrmzvuporqz\",\"zone\":\"uydzvk\",\"region\":\"xcnqmxqpswokmvkh\",\"kafka_bootstrap_endpoint\":\"gdhbe\",\"http_endpoint\":\"qkzszuwiwtglxxh\",\"api_endpoint\":\"fpgpicrmnzhrgm\",\"config\":{\"kind\":\"sxvpqcbfrmbodths\"},\"environment\":{\"id\":\"vriibakclacjfr\",\"environment\":\"ousxauzlwvsgmw\",\"related\":\"qf\",\"resource_name\":\"zvuxm\"},\"network\":{\"id\":\"svth\",\"environment\":\"pz\",\"related\":\"kovmribiatt\",\"resource_name\":\"lu\"},\"byok\":{\"id\":\"tangcfhnykzcu\",\"related\":\"wvxwlmzqwmvt\",\"resource_name\":\"jmxmcuqud\"}},\"status\":{\"phase\":\"clxyn\",\"cku\":267466114}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AccessListClusterSuccessResponse response = manager.access()
            .listClustersWithResponse("izcil", "ghgshejjtbxqmu",
                new ListAccessRequestModel().withSearchFilters(mapOf("rsbycucrwn", "lxqzvn", "qbsms", "mikzeb")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("iqg", response.kind());
        Assertions.assertEquals("okzrus", response.metadata().first());
        Assertions.assertEquals("vhczznvfby", response.metadata().last());
        Assertions.assertEquals("sxjwwixz", response.metadata().prev());
        Assertions.assertEquals("mwmxqhndvnoamld", response.metadata().next());
        Assertions.assertEquals(1759834581, response.metadata().totalSize());
        Assertions.assertEquals("djh", response.data().get(0).kind());
        Assertions.assertEquals("lzok", response.data().get(0).id());
        Assertions.assertEquals("xpelnjetagltsx", response.data().get(0).metadata().self());
        Assertions.assertEquals("tft", response.data().get(0).metadata().resourceName());
        Assertions.assertEquals("pnpbswveflocc", response.data().get(0).metadata().createdAt());
        Assertions.assertEquals("mozi", response.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("ipgawtxx", response.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("y", response.data().get(0).displayName());
        Assertions.assertEquals("cjxgrytf", response.data().get(0).spec().displayName());
        Assertions.assertEquals("cy", response.data().get(0).spec().availability());
        Assertions.assertEquals("lrmcaykg", response.data().get(0).spec().cloud());
        Assertions.assertEquals("oxuztrksx", response.data().get(0).spec().zone());
        Assertions.assertEquals("ndfcpfn", response.data().get(0).spec().region());
        Assertions.assertEquals("thjtwk", response.data().get(0).spec().kafkaBootstrapEndpoint());
        Assertions.assertEquals("osrxuzvoa", response.data().get(0).spec().httpEndpoint());
        Assertions.assertEquals("tcqiosmg", response.data().get(0).spec().apiEndpoint());
        Assertions.assertEquals("hgxqdlyrt", response.data().get(0).spec().config().kind());
        Assertions.assertEquals("ap", response.data().get(0).spec().environment().id());
        Assertions.assertEquals("tz", response.data().get(0).spec().environment().environment());
        Assertions.assertEquals("tbhjmznnbsoqe", response.data().get(0).spec().environment().related());
        Assertions.assertEquals("larvlagunbtg", response.data().get(0).spec().environment().resourceName());
        Assertions.assertEquals("wlnbm", response.data().get(0).spec().network().id());
        Assertions.assertEquals("reeudzqavb", response.data().get(0).spec().network().environment());
        Assertions.assertEquals("qmjxlyyzglgouwtl", response.data().get(0).spec().network().related());
        Assertions.assertEquals("jyuojqtobaxkjeyt", response.data().get(0).spec().network().resourceName());
        Assertions.assertEquals("bfjkw", response.data().get(0).spec().byok().id());
        Assertions.assertEquals("snkq", response.data().get(0).spec().byok().related());
        Assertions.assertEquals("syrq", response.data().get(0).spec().byok().resourceName());
        Assertions.assertEquals("qhd", response.data().get(0).status().phase());
        Assertions.assertEquals(2136418443, response.data().get(0).status().cku());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
