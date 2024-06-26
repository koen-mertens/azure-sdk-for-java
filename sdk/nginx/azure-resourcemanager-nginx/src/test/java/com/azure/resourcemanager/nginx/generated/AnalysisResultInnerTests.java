// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.fluent.models.AnalysisResultInner;
import com.azure.resourcemanager.nginx.models.AnalysisDiagnostic;
import com.azure.resourcemanager.nginx.models.AnalysisResultData;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AnalysisResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AnalysisResultInner model = BinaryData.fromString(
            "{\"status\":\"tyxolniwpwc\",\"data\":{\"errors\":[{\"id\":\"giawx\",\"directive\":\"lryplwckbasyy\",\"description\":\"nddhsgcbacph\",\"file\":\"jkot\",\"line\":64.57916,\"message\":\"qgoulznd\",\"rule\":\"i\"},{\"id\":\"yqkgfg\",\"directive\":\"bmadgak\",\"description\":\"qsrxybzqqed\",\"file\":\"ytb\",\"line\":72.395676,\"message\":\"qfou\",\"rule\":\"lmmnkzsmodmglo\"}]}}")
            .toObject(AnalysisResultInner.class);
        Assertions.assertEquals("tyxolniwpwc", model.status());
        Assertions.assertEquals("giawx", model.data().errors().get(0).id());
        Assertions.assertEquals("lryplwckbasyy", model.data().errors().get(0).directive());
        Assertions.assertEquals("nddhsgcbacph", model.data().errors().get(0).description());
        Assertions.assertEquals("jkot", model.data().errors().get(0).file());
        Assertions.assertEquals(64.57916f, model.data().errors().get(0).line());
        Assertions.assertEquals("qgoulznd", model.data().errors().get(0).message());
        Assertions.assertEquals("i", model.data().errors().get(0).rule());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AnalysisResultInner model = new AnalysisResultInner().withStatus("tyxolniwpwc")
            .withData(new AnalysisResultData().withErrors(Arrays.asList(
                new AnalysisDiagnostic().withId("giawx")
                    .withDirective("lryplwckbasyy")
                    .withDescription("nddhsgcbacph")
                    .withFile("jkot")
                    .withLine(64.57916f)
                    .withMessage("qgoulznd")
                    .withRule("i"),
                new AnalysisDiagnostic().withId("yqkgfg")
                    .withDirective("bmadgak")
                    .withDescription("qsrxybzqqed")
                    .withFile("ytb")
                    .withLine(72.395676f)
                    .withMessage("qfou")
                    .withRule("lmmnkzsmodmglo"))));
        model = BinaryData.fromObject(model).toObject(AnalysisResultInner.class);
        Assertions.assertEquals("tyxolniwpwc", model.status());
        Assertions.assertEquals("giawx", model.data().errors().get(0).id());
        Assertions.assertEquals("lryplwckbasyy", model.data().errors().get(0).directive());
        Assertions.assertEquals("nddhsgcbacph", model.data().errors().get(0).description());
        Assertions.assertEquals("jkot", model.data().errors().get(0).file());
        Assertions.assertEquals(64.57916f, model.data().errors().get(0).line());
        Assertions.assertEquals("qgoulznd", model.data().errors().get(0).message());
        Assertions.assertEquals("i", model.data().errors().get(0).rule());
    }
}
