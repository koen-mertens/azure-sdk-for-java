// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.DocumentationCollection;

public final class DocumentationCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentationCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"title\":\"arlcjiwgsxfaiocw\",\"content\":\"ujjgnfgrzxbarc\"},\"id\":\"paefzqsy\",\"name\":\"jwenjcytesmf\",\"type\":\"crtfodqhuauzm\"},{\"properties\":{\"title\":\"rtrfzh\",\"content\":\"zvhj\"},\"id\":\"dxdyyrudma\",\"name\":\"swtvd\",\"type\":\"xbqssgfenffdxbvw\"},{\"properties\":{\"title\":\"chivdrijanxndmuv\",\"content\":\"dlmz\"},\"id\":\"otprrmuhcuhtu\",\"name\":\"lxiwyo\",\"type\":\"garp\"},{\"properties\":{\"title\":\"wrapczdojqy\",\"content\":\"esipiysnjq\"},\"id\":\"owa\",\"name\":\"dcndazabun\",\"type\":\"tsewkaupwhlz\"}],\"nextLink\":\"kremgjl\"}")
            .toObject(DocumentationCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentationCollection model = new DocumentationCollection();
        model = BinaryData.fromObject(model).toObject(DocumentationCollection.class);
    }
}
