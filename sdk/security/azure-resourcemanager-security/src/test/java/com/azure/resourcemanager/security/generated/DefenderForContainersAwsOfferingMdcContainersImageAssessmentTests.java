// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForContainersAwsOfferingMdcContainersImageAssessment;
import org.junit.jupiter.api.Assertions;

public final class DefenderForContainersAwsOfferingMdcContainersImageAssessmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForContainersAwsOfferingMdcContainersImageAssessment model
            = BinaryData.fromString("{\"enabled\":false,\"cloudRoleArn\":\"qhy\"}")
                .toObject(DefenderForContainersAwsOfferingMdcContainersImageAssessment.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("qhy", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForContainersAwsOfferingMdcContainersImageAssessment model
            = new DefenderForContainersAwsOfferingMdcContainersImageAssessment().withEnabled(false)
                .withCloudRoleArn("qhy");
        model
            = BinaryData.fromObject(model).toObject(DefenderForContainersAwsOfferingMdcContainersImageAssessment.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("qhy", model.cloudRoleArn());
    }
}
