// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.ListQuotaReportResponseInner;
import com.azure.resourcemanager.netapp.models.QuotaReport;
import com.azure.resourcemanager.netapp.models.Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListQuotaReportResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListQuotaReportResponseInner model = BinaryData.fromString(
            "{\"value\":[{\"quotaType\":\"DefaultGroupQuota\",\"quotaTarget\":\"elwuipi\",\"quotaLimitUsedInKiBs\":5147167923805665994,\"quotaLimitTotalInKiBs\":518441316636125291,\"percentageUsed\":67.856186,\"isDerivedQuota\":false}],\"nextLink\":\"nayrhyrnxxmueedn\"}")
            .toObject(ListQuotaReportResponseInner.class);
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.value().get(0).quotaType());
        Assertions.assertEquals("elwuipi", model.value().get(0).quotaTarget());
        Assertions.assertEquals(5147167923805665994L, model.value().get(0).quotaLimitUsedInKiBs());
        Assertions.assertEquals(518441316636125291L, model.value().get(0).quotaLimitTotalInKiBs());
        Assertions.assertEquals(67.856186F, model.value().get(0).percentageUsed());
        Assertions.assertEquals(false, model.value().get(0).isDerivedQuota());
        Assertions.assertEquals("nayrhyrnxxmueedn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListQuotaReportResponseInner model = new ListQuotaReportResponseInner()
            .withValue(Arrays.asList(new QuotaReport().withQuotaType(Type.DEFAULT_GROUP_QUOTA)
                .withQuotaTarget("elwuipi")
                .withQuotaLimitUsedInKiBs(5147167923805665994L)
                .withQuotaLimitTotalInKiBs(518441316636125291L)
                .withPercentageUsed(67.856186F)
                .withIsDerivedQuota(false)))
            .withNextLink("nayrhyrnxxmueedn");
        model = BinaryData.fromObject(model).toObject(ListQuotaReportResponseInner.class);
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.value().get(0).quotaType());
        Assertions.assertEquals("elwuipi", model.value().get(0).quotaTarget());
        Assertions.assertEquals(5147167923805665994L, model.value().get(0).quotaLimitUsedInKiBs());
        Assertions.assertEquals(518441316636125291L, model.value().get(0).quotaLimitTotalInKiBs());
        Assertions.assertEquals(67.856186F, model.value().get(0).percentageUsed());
        Assertions.assertEquals(false, model.value().get(0).isDerivedQuota());
        Assertions.assertEquals("nayrhyrnxxmueedn", model.nextLink());
    }
}
