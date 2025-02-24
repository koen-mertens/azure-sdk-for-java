// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.VerifiedPartnerInner;
import com.azure.resourcemanager.eventgrid.models.PartnerDetails;
import com.azure.resourcemanager.eventgrid.models.VerifiedPartnerProvisioningState;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class VerifiedPartnerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VerifiedPartnerInner model = BinaryData.fromString(
            "{\"properties\":{\"partnerRegistrationImmutableId\":\"ce434753-11b7-4b67-8319-b96393ba7e06\",\"organizationName\":\"lss\",\"partnerDisplayName\":\"jomevtfycnlb\",\"partnerTopicDetails\":{\"description\":\"codkkgj\",\"longDescription\":\"ytssikiz\",\"setupUri\":\"ufqbvntnr\"},\"partnerDestinationDetails\":{\"description\":\"sorhcekx\",\"longDescription\":\"lykmxcpwzvmdo\",\"setupUri\":\"qdtiwlwxlb\"},\"provisioningState\":\"Failed\"},\"id\":\"bazqicqchygtvxby\",\"name\":\"anepubd\",\"type\":\"kxyqvgxiaodetv\"}")
            .toObject(VerifiedPartnerInner.class);
        Assertions.assertEquals(UUID.fromString("ce434753-11b7-4b67-8319-b96393ba7e06"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("lss", model.organizationName());
        Assertions.assertEquals("jomevtfycnlb", model.partnerDisplayName());
        Assertions.assertEquals("codkkgj", model.partnerTopicDetails().description());
        Assertions.assertEquals("ytssikiz", model.partnerTopicDetails().longDescription());
        Assertions.assertEquals("ufqbvntnr", model.partnerTopicDetails().setupUri());
        Assertions.assertEquals("sorhcekx", model.partnerDestinationDetails().description());
        Assertions.assertEquals("lykmxcpwzvmdo", model.partnerDestinationDetails().longDescription());
        Assertions.assertEquals("qdtiwlwxlb", model.partnerDestinationDetails().setupUri());
        Assertions.assertEquals(VerifiedPartnerProvisioningState.FAILED, model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VerifiedPartnerInner model = new VerifiedPartnerInner()
            .withPartnerRegistrationImmutableId(UUID.fromString("ce434753-11b7-4b67-8319-b96393ba7e06"))
            .withOrganizationName("lss")
            .withPartnerDisplayName("jomevtfycnlb")
            .withPartnerTopicDetails(new PartnerDetails().withDescription("codkkgj")
                .withLongDescription("ytssikiz")
                .withSetupUri("ufqbvntnr"))
            .withPartnerDestinationDetails(new PartnerDetails().withDescription("sorhcekx")
                .withLongDescription("lykmxcpwzvmdo")
                .withSetupUri("qdtiwlwxlb"))
            .withProvisioningState(VerifiedPartnerProvisioningState.FAILED);
        model = BinaryData.fromObject(model).toObject(VerifiedPartnerInner.class);
        Assertions.assertEquals(UUID.fromString("ce434753-11b7-4b67-8319-b96393ba7e06"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("lss", model.organizationName());
        Assertions.assertEquals("jomevtfycnlb", model.partnerDisplayName());
        Assertions.assertEquals("codkkgj", model.partnerTopicDetails().description());
        Assertions.assertEquals("ytssikiz", model.partnerTopicDetails().longDescription());
        Assertions.assertEquals("ufqbvntnr", model.partnerTopicDetails().setupUri());
        Assertions.assertEquals("sorhcekx", model.partnerDestinationDetails().description());
        Assertions.assertEquals("lykmxcpwzvmdo", model.partnerDestinationDetails().longDescription());
        Assertions.assertEquals("qdtiwlwxlb", model.partnerDestinationDetails().setupUri());
        Assertions.assertEquals(VerifiedPartnerProvisioningState.FAILED, model.provisioningState());
    }
}
