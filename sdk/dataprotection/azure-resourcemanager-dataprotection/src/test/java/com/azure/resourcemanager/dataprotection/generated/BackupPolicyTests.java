// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BackupPolicy;
import com.azure.resourcemanager.dataprotection.models.BasePolicyRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicy model = BinaryData.fromString(
            "{\"objectType\":\"BackupPolicy\",\"policyRules\":[{\"objectType\":\"BasePolicyRule\",\"name\":\"xmrhu\"},{\"objectType\":\"BasePolicyRule\",\"name\":\"lw\"},{\"objectType\":\"BasePolicyRule\",\"name\":\"cesutrgjupauut\"}],\"datasourceTypes\":[\"oqh\",\"hej\"]}")
            .toObject(BackupPolicy.class);
        Assertions.assertEquals("oqh", model.datasourceTypes().get(0));
        Assertions.assertEquals("xmrhu", model.policyRules().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicy model = new BackupPolicy().withDatasourceTypes(Arrays.asList("oqh", "hej"))
            .withPolicyRules(Arrays.asList(new BasePolicyRule().withName("xmrhu"), new BasePolicyRule().withName("lw"),
                new BasePolicyRule().withName("cesutrgjupauut")));
        model = BinaryData.fromObject(model).toObject(BackupPolicy.class);
        Assertions.assertEquals("oqh", model.datasourceTypes().get(0));
        Assertions.assertEquals("xmrhu", model.policyRules().get(0).name());
    }
}
