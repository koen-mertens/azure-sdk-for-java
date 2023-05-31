// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JobConfigurationScheduleTriggerConfig;
import org.junit.jupiter.api.Assertions;

public final class JobConfigurationScheduleTriggerConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobConfigurationScheduleTriggerConfig model =
            BinaryData
                .fromString(
                    "{\"replicaCompletionCount\":104545862,\"cronExpression\":\"ayvblmhvkzuhbx\",\"parallelism\":1338429110}")
                .toObject(JobConfigurationScheduleTriggerConfig.class);
        Assertions.assertEquals(104545862, model.replicaCompletionCount());
        Assertions.assertEquals("ayvblmhvkzuhbx", model.cronExpression());
        Assertions.assertEquals(1338429110, model.parallelism());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobConfigurationScheduleTriggerConfig model =
            new JobConfigurationScheduleTriggerConfig()
                .withReplicaCompletionCount(104545862)
                .withCronExpression("ayvblmhvkzuhbx")
                .withParallelism(1338429110);
        model = BinaryData.fromObject(model).toObject(JobConfigurationScheduleTriggerConfig.class);
        Assertions.assertEquals(104545862, model.replicaCompletionCount());
        Assertions.assertEquals("ayvblmhvkzuhbx", model.cronExpression());
        Assertions.assertEquals(1338429110, model.parallelism());
    }
}