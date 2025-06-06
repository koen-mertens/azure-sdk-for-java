// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.SecurityAlertProperties;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import org.junit.jupiter.api.Assertions;

public final class SecurityAlertPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityAlertProperties model = BinaryData.fromString(
            "{\"alertDisplayName\":\"bbcswsrtjri\",\"alertType\":\"rbpbewtghfgblcg\",\"compromisedEntity\":\"zvlvqhjkbegib\",\"confidenceLevel\":\"Low\",\"confidenceReasons\":[{\"reason\":\"bwwaloa\",\"reasonType\":\"cgwrtzjuz\"},{\"reason\":\"yzm\",\"reasonType\":\"xongmtsavjcbpwxq\"},{\"reason\":\"rknftguvriuhprwm\",\"reasonType\":\"vxqtayriwwroyqbe\"},{\"reason\":\"mcqibycnojv\",\"reasonType\":\"mefqsgzvahapjyzh\"}],\"confidenceScore\":33.436857957529575,\"confidenceScoreStatus\":\"Final\",\"description\":\"rvxdjzlmw\",\"endTimeUtc\":\"2021-07-11T22:18:52Z\",\"intent\":\"CredentialAccess\",\"providerAlertId\":\"hzovawjvzunlut\",\"processingEndTime\":\"2021-09-06T05:22:37Z\",\"productComponentName\":\"rnxipei\",\"productName\":\"jzuaejxdultskzbb\",\"productVersion\":\"zumveekgpwo\",\"remediationSteps\":[\"kfpbs\",\"yofd\"],\"severity\":\"Low\",\"startTimeUtc\":\"2021-06-15T07:35:54Z\",\"status\":\"Dismissed\",\"systemAlertId\":\"ouwaboekqvkeln\",\"tactics\":[\"ImpairProcessControl\",\"DefenseEvasion\",\"PrivilegeEscalation\"],\"timeGenerated\":\"2021-08-14T03:50:42Z\",\"vendorName\":\"flhhcaal\",\"alertLink\":\"ixisxyawjoy\",\"resourceIdentifiers\":[\"dataslyjpkiid\",\"datayexz\"],\"additionalData\":{\"lhbnxkna\":\"dataixhnrztf\",\"pnapnyiropuh\":\"dataaulppggd\",\"git\":\"dataigvpgylg\"},\"friendlyName\":\"edjvcslynqw\"}")
            .toObject(SecurityAlertProperties.class);
        Assertions.assertEquals(AlertSeverity.LOW, model.severity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityAlertProperties model = new SecurityAlertProperties().withSeverity(AlertSeverity.LOW);
        model = BinaryData.fromObject(model).toObject(SecurityAlertProperties.class);
        Assertions.assertEquals(AlertSeverity.LOW, model.severity());
    }
}
