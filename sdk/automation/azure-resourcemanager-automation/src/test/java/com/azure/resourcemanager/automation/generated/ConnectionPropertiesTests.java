// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.ConnectionProperties;
import com.azure.resourcemanager.automation.models.ConnectionTypeAssociationProperty;
import org.junit.jupiter.api.Assertions;

public final class ConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionProperties model = BinaryData.fromString(
            "{\"connectionType\":{\"name\":\"usdsttwv\"},\"fieldDefinitionValues\":{\"akufgmjz\":\"bbejdcngqqm\",\"grtwae\":\"wr\",\"zkopb\":\"u\"},\"creationTime\":\"2021-11-09T23:56:32Z\",\"lastModifiedTime\":\"2021-08-21T09:11:53Z\",\"description\":\"woyuhhziuief\"}")
            .toObject(ConnectionProperties.class);
        Assertions.assertEquals("usdsttwv", model.connectionType().name());
        Assertions.assertEquals("woyuhhziuief", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionProperties model = new ConnectionProperties()
            .withConnectionType(new ConnectionTypeAssociationProperty().withName("usdsttwv"))
            .withDescription("woyuhhziuief");
        model = BinaryData.fromObject(model).toObject(ConnectionProperties.class);
        Assertions.assertEquals("usdsttwv", model.connectionType().name());
        Assertions.assertEquals("woyuhhziuief", model.description());
    }
}
