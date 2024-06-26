// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.QosPolicy;
import org.junit.jupiter.api.Assertions;

public final class QosPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QosPolicy model = BinaryData.fromString(
            "{\"5qi\":1061424491,\"allocationAndRetentionPriorityLevel\":905798226,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"n\",\"downlink\":\"bgye\"}}")
            .toObject(QosPolicy.class);
        Assertions.assertEquals(1061424491, model.fiveQi());
        Assertions.assertEquals(905798226, model.allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.MAY_PREEMPT, model.preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE, model.preemptionVulnerability());
        Assertions.assertEquals("n", model.maximumBitRate().uplink());
        Assertions.assertEquals("bgye", model.maximumBitRate().downlink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QosPolicy model = new QosPolicy().withFiveQi(1061424491)
            .withAllocationAndRetentionPriorityLevel(905798226)
            .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
            .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
            .withMaximumBitRate(new Ambr().withUplink("n").withDownlink("bgye"));
        model = BinaryData.fromObject(model).toObject(QosPolicy.class);
        Assertions.assertEquals(1061424491, model.fiveQi());
        Assertions.assertEquals(905798226, model.allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.MAY_PREEMPT, model.preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE, model.preemptionVulnerability());
        Assertions.assertEquals("n", model.maximumBitRate().uplink());
        Assertions.assertEquals("bgye", model.maximumBitRate().downlink());
    }
}
