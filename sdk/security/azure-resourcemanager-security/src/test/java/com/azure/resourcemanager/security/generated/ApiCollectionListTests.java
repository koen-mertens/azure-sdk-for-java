// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ApiCollectionList;

public final class ApiCollectionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiCollectionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"hks\",\"discoveredVia\":\"uwazcgwdfriwg\",\"baseUrl\":\"jpozoksc\",\"numberOfApiEndpoints\":3154949128071303646,\"numberOfInactiveApiEndpoints\":767389129321249587,\"numberOfUnauthenticatedApiEndpoints\":4606623388265003254,\"numberOfExternalApiEndpoints\":8144993393329643777,\"numberOfApiEndpointsWithSensitiveDataExposed\":6457294522364535632,\"sensitivityLabel\":\"j\"},\"id\":\"xprwpxs\",\"name\":\"ohutxlcsk\",\"type\":\"tezuug\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"bgrdcgubsrtmdyl\",\"discoveredVia\":\"rpilt\",\"baseUrl\":\"zgczfcmfpfbode\",\"numberOfApiEndpoints\":7559157035650376437,\"numberOfInactiveApiEndpoints\":6223448046486071473,\"numberOfUnauthenticatedApiEndpoints\":8733136165512464192,\"numberOfExternalApiEndpoints\":7401865141313924875,\"numberOfApiEndpointsWithSensitiveDataExposed\":4238412244977278821,\"sensitivityLabel\":\"vmuqke\"},\"id\":\"zgjypanhxmpdxxz\",\"name\":\"twwzjw\",\"type\":\"tnxlkfhglhr\"}],\"nextLink\":\"x\"}")
            .toObject(ApiCollectionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiCollectionList model = new ApiCollectionList();
        model = BinaryData.fromObject(model).toObject(ApiCollectionList.class);
    }
}
