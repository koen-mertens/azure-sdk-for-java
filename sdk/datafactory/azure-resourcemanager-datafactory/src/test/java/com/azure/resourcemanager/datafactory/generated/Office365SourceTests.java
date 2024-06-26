// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Office365Source;

public final class Office365SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Source model = BinaryData.fromString(
            "{\"type\":\"Office365Source\",\"allowedGroups\":\"datadhdtt\",\"userScopeFilterUri\":\"datakeculxvkuxvccpda\",\"dateFilterColumn\":\"dataasi\",\"startTime\":\"datatyvvgxe\",\"endTime\":\"dataqoswjwbh\",\"outputColumns\":\"datawbchybne\",\"sourceRetryCount\":\"dataueikadhusg\",\"sourceRetryWait\":\"databgljcy\",\"maxConcurrentConnections\":\"datarzxipxhlxxkviyj\",\"disableMetricsCollection\":\"dataqyejyavxgm\",\"\":{\"h\":\"datanwxkqqxpnjqtzd\",\"eggyqlvnhmuut\":\"dataethnl\",\"gcbjclfbpfdsatr\":\"datawwtymbccmwsyfsgi\"}}")
            .toObject(Office365Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Source model = new Office365Source().withSourceRetryCount("dataueikadhusg")
            .withSourceRetryWait("databgljcy")
            .withMaxConcurrentConnections("datarzxipxhlxxkviyj")
            .withDisableMetricsCollection("dataqyejyavxgm")
            .withAllowedGroups("datadhdtt")
            .withUserScopeFilterUri("datakeculxvkuxvccpda")
            .withDateFilterColumn("dataasi")
            .withStartTime("datatyvvgxe")
            .withEndTime("dataqoswjwbh")
            .withOutputColumns("datawbchybne");
        model = BinaryData.fromObject(model).toObject(Office365Source.class);
    }
}
