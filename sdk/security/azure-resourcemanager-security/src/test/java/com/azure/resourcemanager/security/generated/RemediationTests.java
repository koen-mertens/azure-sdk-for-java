// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.Remediation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RemediationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Remediation model =
            BinaryData
                .fromString(
                    "{\"description\":\"kpztrgd\",\"scripts\":[\"coqra\",\"wugyx\",\"qi\",\"we\"],\"automated\":false,\"portalLink\":\"vskbuhzacaq\"}")
                .toObject(Remediation.class);
        Assertions.assertEquals("kpztrgd", model.description());
        Assertions.assertEquals("coqra", model.scripts().get(0));
        Assertions.assertEquals(false, model.automated());
        Assertions.assertEquals("vskbuhzacaq", model.portalLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Remediation model =
            new Remediation()
                .withDescription("kpztrgd")
                .withScripts(Arrays.asList("coqra", "wugyx", "qi", "we"))
                .withAutomated(false)
                .withPortalLink("vskbuhzacaq");
        model = BinaryData.fromObject(model).toObject(Remediation.class);
        Assertions.assertEquals("kpztrgd", model.description());
        Assertions.assertEquals("coqra", model.scripts().get(0));
        Assertions.assertEquals(false, model.automated());
        Assertions.assertEquals("vskbuhzacaq", model.portalLink());
    }
}