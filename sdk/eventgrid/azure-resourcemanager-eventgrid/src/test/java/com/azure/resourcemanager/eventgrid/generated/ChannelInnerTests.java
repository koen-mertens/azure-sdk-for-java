// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.ChannelInner;
import com.azure.resourcemanager.eventgrid.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.models.ChannelType;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.models.ReadinessState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChannelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChannelInner model = BinaryData.fromString(
            "{\"properties\":{\"channelType\":\"PartnerTopic\",\"partnerTopicInfo\":{\"azureSubscriptionId\":\"oizh\",\"resourceGroupName\":\"rxybqsoq\",\"name\":\"gkdmb\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"qes\":{\"description\":\"ufpdznrbtcqq\",\"displayName\":\"qglhq\",\"documentationUrl\":\"ufo\",\"dataSchemaUrl\":\"jywif\"}}},\"source\":\"gdf\"},\"messageForActivation\":\"lzl\",\"provisioningState\":\"Canceled\",\"readinessState\":\"Activated\",\"expirationTimeIfNotActivatedUtc\":\"2021-02-26T02:19:15Z\"},\"id\":\"mrvktsizntoc\",\"name\":\"pa\",\"type\":\"uajpsquc\"}")
            .toObject(ChannelInner.class);
        Assertions.assertEquals(ChannelType.PARTNER_TOPIC, model.channelType());
        Assertions.assertEquals("oizh", model.partnerTopicInfo().azureSubscriptionId());
        Assertions.assertEquals("rxybqsoq", model.partnerTopicInfo().resourceGroupName());
        Assertions.assertEquals("gkdmb", model.partnerTopicInfo().name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("ufpdznrbtcqq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").description());
        Assertions.assertEquals("qglhq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").displayName());
        Assertions.assertEquals("ufo",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").documentationUrl());
        Assertions.assertEquals("jywif",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").dataSchemaUrl());
        Assertions.assertEquals("gdf", model.partnerTopicInfo().source());
        Assertions.assertEquals("lzl", model.messageForActivation());
        Assertions.assertEquals(ChannelProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(ReadinessState.ACTIVATED, model.readinessState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T02:19:15Z"), model.expirationTimeIfNotActivatedUtc());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChannelInner model = new ChannelInner().withChannelType(ChannelType.PARTNER_TOPIC)
            .withPartnerTopicInfo(new PartnerTopicInfo().withAzureSubscriptionId("oizh")
                .withResourceGroupName("rxybqsoq")
                .withName("gkdmb")
                .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf("qes",
                        new InlineEventProperties().withDescription("ufpdznrbtcqq")
                            .withDisplayName("qglhq")
                            .withDocumentationUrl("ufo")
                            .withDataSchemaUrl("jywif"))))
                .withSource("gdf"))
            .withMessageForActivation("lzl")
            .withProvisioningState(ChannelProvisioningState.CANCELED)
            .withReadinessState(ReadinessState.ACTIVATED)
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-02-26T02:19:15Z"));
        model = BinaryData.fromObject(model).toObject(ChannelInner.class);
        Assertions.assertEquals(ChannelType.PARTNER_TOPIC, model.channelType());
        Assertions.assertEquals("oizh", model.partnerTopicInfo().azureSubscriptionId());
        Assertions.assertEquals("rxybqsoq", model.partnerTopicInfo().resourceGroupName());
        Assertions.assertEquals("gkdmb", model.partnerTopicInfo().name());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("ufpdznrbtcqq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").description());
        Assertions.assertEquals("qglhq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").displayName());
        Assertions.assertEquals("ufo",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").documentationUrl());
        Assertions.assertEquals("jywif",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("qes").dataSchemaUrl());
        Assertions.assertEquals("gdf", model.partnerTopicInfo().source());
        Assertions.assertEquals("lzl", model.messageForActivation());
        Assertions.assertEquals(ChannelProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(ReadinessState.ACTIVATED, model.readinessState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-26T02:19:15Z"), model.expirationTimeIfNotActivatedUtc());
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
