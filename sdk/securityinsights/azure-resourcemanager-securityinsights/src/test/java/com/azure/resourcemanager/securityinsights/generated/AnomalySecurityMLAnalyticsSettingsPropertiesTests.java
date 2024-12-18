// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.AnomalySecurityMLAnalyticsSettingsProperties;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.SecurityMLAnalyticsSettingsDataSource;
import com.azure.resourcemanager.securityinsights.models.SettingsStatus;
import java.time.Duration;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AnomalySecurityMLAnalyticsSettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AnomalySecurityMLAnalyticsSettingsProperties model = BinaryData.fromString(
            "{\"description\":\"queqihk\",\"displayName\":\"yowltj\",\"enabled\":true,\"lastModifiedUtc\":\"2021-03-05T03:48:54Z\",\"requiredDataConnectors\":[{\"connectorId\":\"whieproqksmfxmcv\",\"dataTypes\":[\"tvkitbfjtdy\",\"tnp\",\"facqo\",\"cqrq\"]},{\"connectorId\":\"etjt\",\"dataTypes\":[\"u\",\"fdoadtxopgeh\",\"adkm\",\"zgssz\"]},{\"connectorId\":\"ctkbbxuha\",\"dataTypes\":[\"ir\",\"ccla\",\"voyn\"]},{\"connectorId\":\"uxx\",\"dataTypes\":[\"myqjog\",\"dsaidjanormovdxx\"]}],\"tactics\":[\"Execution\",\"Exfiltration\",\"DefenseEvasion\",\"Discovery\"],\"techniques\":[\"lu\"],\"anomalyVersion\":\"wemhdee\",\"customizableObservations\":\"dataslkyozd\",\"frequency\":\"PT22H16M22S\",\"settingsStatus\":\"Production\",\"isDefaultSettings\":false,\"anomalySettingsVersion\":1503256393,\"settingsDefinitionId\":\"42543b5d-088a-4e2a-be71-fc54628f9082\"}")
            .toObject(AnomalySecurityMLAnalyticsSettingsProperties.class);
        Assertions.assertEquals("queqihk", model.description());
        Assertions.assertEquals("yowltj", model.displayName());
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("whieproqksmfxmcv", model.requiredDataConnectors().get(0).connectorId());
        Assertions.assertEquals("tvkitbfjtdy", model.requiredDataConnectors().get(0).dataTypes().get(0));
        Assertions.assertEquals(AttackTactic.EXECUTION, model.tactics().get(0));
        Assertions.assertEquals("lu", model.techniques().get(0));
        Assertions.assertEquals("wemhdee", model.anomalyVersion());
        Assertions.assertEquals(Duration.parse("PT22H16M22S"), model.frequency());
        Assertions.assertEquals(SettingsStatus.PRODUCTION, model.settingsStatus());
        Assertions.assertEquals(false, model.isDefaultSettings());
        Assertions.assertEquals(1503256393, model.anomalySettingsVersion());
        Assertions.assertEquals(UUID.fromString("42543b5d-088a-4e2a-be71-fc54628f9082"), model.settingsDefinitionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AnomalySecurityMLAnalyticsSettingsProperties model
            = new AnomalySecurityMLAnalyticsSettingsProperties().withDescription("queqihk")
                .withDisplayName("yowltj")
                .withEnabled(true)
                .withRequiredDataConnectors(Arrays.asList(
                    new SecurityMLAnalyticsSettingsDataSource().withConnectorId("whieproqksmfxmcv")
                        .withDataTypes(Arrays.asList("tvkitbfjtdy", "tnp", "facqo", "cqrq")),
                    new SecurityMLAnalyticsSettingsDataSource().withConnectorId("etjt")
                        .withDataTypes(Arrays.asList("u", "fdoadtxopgeh", "adkm", "zgssz")),
                    new SecurityMLAnalyticsSettingsDataSource().withConnectorId("ctkbbxuha")
                        .withDataTypes(Arrays.asList("ir", "ccla", "voyn")),
                    new SecurityMLAnalyticsSettingsDataSource().withConnectorId("uxx")
                        .withDataTypes(Arrays.asList("myqjog", "dsaidjanormovdxx"))))
                .withTactics(Arrays.asList(AttackTactic.EXECUTION, AttackTactic.EXFILTRATION,
                    AttackTactic.DEFENSE_EVASION, AttackTactic.DISCOVERY))
                .withTechniques(Arrays.asList("lu"))
                .withAnomalyVersion("wemhdee")
                .withCustomizableObservations("dataslkyozd")
                .withFrequency(Duration.parse("PT22H16M22S"))
                .withSettingsStatus(SettingsStatus.PRODUCTION)
                .withIsDefaultSettings(false)
                .withAnomalySettingsVersion(1503256393)
                .withSettingsDefinitionId(UUID.fromString("42543b5d-088a-4e2a-be71-fc54628f9082"));
        model = BinaryData.fromObject(model).toObject(AnomalySecurityMLAnalyticsSettingsProperties.class);
        Assertions.assertEquals("queqihk", model.description());
        Assertions.assertEquals("yowltj", model.displayName());
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("whieproqksmfxmcv", model.requiredDataConnectors().get(0).connectorId());
        Assertions.assertEquals("tvkitbfjtdy", model.requiredDataConnectors().get(0).dataTypes().get(0));
        Assertions.assertEquals(AttackTactic.EXECUTION, model.tactics().get(0));
        Assertions.assertEquals("lu", model.techniques().get(0));
        Assertions.assertEquals("wemhdee", model.anomalyVersion());
        Assertions.assertEquals(Duration.parse("PT22H16M22S"), model.frequency());
        Assertions.assertEquals(SettingsStatus.PRODUCTION, model.settingsStatus());
        Assertions.assertEquals(false, model.isDefaultSettings());
        Assertions.assertEquals(1503256393, model.anomalySettingsVersion());
        Assertions.assertEquals(UUID.fromString("42543b5d-088a-4e2a-be71-fc54628f9082"), model.settingsDefinitionId());
    }
}
