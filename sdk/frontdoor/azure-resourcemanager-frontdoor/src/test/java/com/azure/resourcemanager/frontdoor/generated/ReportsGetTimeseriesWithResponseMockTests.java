// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.models.Timeseries;
import com.azure.resourcemanager.frontdoor.models.TimeseriesAggregationInterval;
import com.azure.resourcemanager.frontdoor.models.TimeseriesType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsGetTimeseriesWithResponseMockTests {
    @Test
    public void testGetTimeseriesWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"endpoint\":\"scxmxeat\",\"startDateTimeUTC\":\"bmwnrdjyibqb\",\"endDateTimeUTC\":\"omhjrmkuhm\",\"aggregationInterval\":\"Daily\",\"timeseriesType\":\"LatencyP95\",\"country\":\"f\",\"timeseriesData\":[{\"dateTimeUTC\":\"mobcan\",\"value\":42.258137},{\"dateTimeUTC\":\"xqcwgax\",\"value\":60.46738},{\"dateTimeUTC\":\"knokzw\",\"value\":69.476006}]},\"location\":\"r\",\"tags\":{\"mmpuj\":\"xldzyyfytpqsix\",\"ovwzdbpqvybefg\":\"vyqlkjuvsmbmslzo\",\"okcvtlubses\":\"mx\"},\"id\":\"vcuartrhun\",\"name\":\"pirykycndzfqiv\",\"type\":\"reuykbbmnwagl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Timeseries response = manager.reports()
            .getTimeseriesWithResponse("cnrly", "nucaephblkwqpat", "bqsdtcjbctvi",
                OffsetDateTime.parse("2021-04-14T10:23:41Z"), OffsetDateTime.parse("2021-03-17T20:41:42Z"),
                TimeseriesAggregationInterval.DAILY, TimeseriesType.MEASUREMENT_COUNTS, "mtuowogtgitsqhzv", "rzcdbanf",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("r", response.location());
        Assertions.assertEquals("xldzyyfytpqsix", response.tags().get("mmpuj"));
        Assertions.assertEquals("scxmxeat", response.endpoint());
        Assertions.assertEquals("bmwnrdjyibqb", response.startDateTimeUtc());
        Assertions.assertEquals("omhjrmkuhm", response.endDateTimeUtc());
        Assertions.assertEquals(AggregationInterval.DAILY, response.aggregationInterval());
        Assertions.assertEquals(TimeseriesType.LATENCY_P95, response.timeseriesType());
        Assertions.assertEquals("f", response.country());
        Assertions.assertEquals("mobcan", response.timeseriesData().get(0).dateTimeUtc());
        Assertions.assertEquals(42.258137F, response.timeseriesData().get(0).value());
    }
}
