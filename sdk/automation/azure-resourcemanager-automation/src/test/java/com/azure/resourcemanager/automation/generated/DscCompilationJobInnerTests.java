// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.DscCompilationJobInner;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import com.azure.resourcemanager.automation.models.JobProvisioningState;
import com.azure.resourcemanager.automation.models.JobStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DscCompilationJobInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscCompilationJobInner model = BinaryData.fromString(
            "{\"properties\":{\"configuration\":{\"name\":\"bxzpuzycisp\"},\"startedBy\":\"zahmgkbrpyydhibn\",\"jobId\":\"7806040c-6dc4-4678-873e-9cf01e9f4768\",\"creationTime\":\"2021-10-07T14:08:56Z\",\"provisioningState\":\"Failed\",\"runOn\":\"a\",\"status\":\"Failed\",\"statusDetails\":\"tqagnbuynh\",\"startTime\":\"2021-03-22T07:27:17Z\",\"endTime\":\"2021-07-11T17:28:04Z\",\"exception\":\"bfs\",\"lastModifiedTime\":\"2021-09-16T13:37:10Z\",\"lastStatusModifiedTime\":\"2021-05-02T05:08:07Z\",\"parameters\":{\"tdbhrbnla\":\"cvpnazzmhjrunmpx\",\"yskpbhen\":\"kx\",\"lqidyby\":\"tkcxywnytnrsy\",\"haaxdbabphl\":\"czfc\"}},\"id\":\"rqlfktsthsucocmn\",\"name\":\"yazttbtwwrqpue\",\"type\":\"ckzywbiexzfeyue\"}")
            .toObject(DscCompilationJobInner.class);
        Assertions.assertEquals("bxzpuzycisp", model.configuration().name());
        Assertions.assertEquals(JobProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals("a", model.runOn());
        Assertions.assertEquals(JobStatus.FAILED, model.status());
        Assertions.assertEquals("tqagnbuynh", model.statusDetails());
        Assertions.assertEquals("cvpnazzmhjrunmpx", model.parameters().get("tdbhrbnla"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscCompilationJobInner model = new DscCompilationJobInner()
            .withConfiguration(new DscConfigurationAssociationProperty().withName("bxzpuzycisp"))
            .withProvisioningState(JobProvisioningState.FAILED)
            .withRunOn("a")
            .withStatus(JobStatus.FAILED)
            .withStatusDetails("tqagnbuynh")
            .withParameters(mapOf("tdbhrbnla", "cvpnazzmhjrunmpx", "yskpbhen", "kx", "lqidyby", "tkcxywnytnrsy",
                "haaxdbabphl", "czfc"));
        model = BinaryData.fromObject(model).toObject(DscCompilationJobInner.class);
        Assertions.assertEquals("bxzpuzycisp", model.configuration().name());
        Assertions.assertEquals(JobProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals("a", model.runOn());
        Assertions.assertEquals(JobStatus.FAILED, model.status());
        Assertions.assertEquals("tqagnbuynh", model.statusDetails());
        Assertions.assertEquals("cvpnazzmhjrunmpx", model.parameters().get("tdbhrbnla"));
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
