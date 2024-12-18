// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.FullBackupStoreDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FullBackupStoreDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FullBackupStoreDetails model = BinaryData.fromString(
            "{\"objectType\":\"FullBackupStoreDetails\",\"sasUriList\":[\"cizsjqlhkrribdei\",\"qipqkghvxndz\",\"mkrefajpjorwkq\"]}")
            .toObject(FullBackupStoreDetails.class);
        Assertions.assertEquals("cizsjqlhkrribdei", model.sasUriList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FullBackupStoreDetails model = new FullBackupStoreDetails()
            .withSasUriList(Arrays.asList("cizsjqlhkrribdei", "qipqkghvxndz", "mkrefajpjorwkq"));
        model = BinaryData.fromObject(model).toObject(FullBackupStoreDetails.class);
        Assertions.assertEquals("cizsjqlhkrribdei", model.sasUriList().get(0));
    }
}
