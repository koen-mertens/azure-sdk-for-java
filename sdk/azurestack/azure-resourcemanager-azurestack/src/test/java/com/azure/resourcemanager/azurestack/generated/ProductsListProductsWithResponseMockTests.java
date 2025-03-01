// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.azurestack.AzureStackManager;
import com.azure.resourcemanager.azurestack.models.CompatibilityIssue;
import com.azure.resourcemanager.azurestack.models.DeviceConfiguration;
import com.azure.resourcemanager.azurestack.models.ProductList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProductsListProductsWithResponseMockTests {
    @Test
    public void testListProductsWithResponse() throws Exception {
        String responseStr
            = "{\"nextLink\":\"ebmnzbtbhjpglk\",\"value\":[{\"properties\":{\"displayName\":\"neuelfphsdyhtoz\",\"description\":\"kd\",\"publisherDisplayName\":\"wq\",\"publisherIdentifier\":\"v\",\"offer\":\"xclvit\",\"offerVersion\":\"qzonosggbhcohf\",\"sku\":\"sjnkal\",\"billingPartNumber\":\"tiiswacffg\",\"vmExtensionType\":\"zzewkfvhqcrai\",\"galleryItemIdentity\":\"pnppfuf\",\"iconUris\":{\"large\":\"dmhdlxyjr\",\"wide\":\"agafcnihgwqap\",\"medium\":\"dgfbcvkcvqvpke\",\"small\":\"cvdrhvoodsot\",\"hero\":\"bzdopcj\"},\"links\":[{},{},{}],\"legalTerms\":\"dldwmgxc\",\"privacyPolicy\":\"slpmutwuo\",\"payloadLength\":7807372555856533798,\"productKind\":\"hjwniyqsluic\",\"productProperties\":{\"version\":\"gk\"},\"compatibility\":{\"isCompatible\":false,\"message\":\"bmpaxmodfvu\",\"description\":\"yw\",\"issues\":[\"DisconnectedEnvironmentRequired\",\"PayAsYouGoBillingModelRequired\",\"ConnectionToInternetRequired\"]}},\"etag\":\"yhrfouyftaakcpw\",\"id\":\"yzvqt\",\"name\":\"nubexk\",\"type\":\"zksmondj\"},{\"properties\":{\"displayName\":\"xvy\",\"description\":\"mg\",\"publisherDisplayName\":\"pkwhojvpa\",\"publisherIdentifier\":\"gxysmocmbqfqvm\",\"offer\":\"xozap\",\"offerVersion\":\"elxprglyatddck\",\"sku\":\"cuejrjxgci\",\"billingPartNumber\":\"brh\",\"vmExtensionType\":\"xsdqrhzoymibmrqy\",\"galleryItemIdentity\":\"ahwfluszdtmhrk\",\"iconUris\":{\"large\":\"yyv\",\"wide\":\"acpie\",\"medium\":\"btgiwbwoenwas\",\"small\":\"tdtkcn\",\"hero\":\"wbpokulpiujwaasi\"},\"links\":[{}],\"legalTerms\":\"obyu\",\"privacyPolicy\":\"rpqlp\",\"payloadLength\":5523285325646920804,\"productKind\":\"uqgbdbutauvfbt\",\"productProperties\":{\"version\":\"hhmhykojoxa\"},\"compatibility\":{\"isCompatible\":true,\"message\":\"pichkoymkcdy\",\"description\":\"pkkpw\",\"issues\":[\"CapacityBillingModelRequired\",\"ConnectionToAzureRequired\",\"DisconnectedEnvironmentRequired\"]}},\"etag\":\"vq\",\"id\":\"ovljxywsu\",\"name\":\"syrsndsytgadgvra\",\"type\":\"aeneqnzarrwl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureStackManager manager = AzureStackManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProductList response = manager.products()
            .listProductsWithResponse("vseotgqrl", "tmuwlauwzi", "xbmp", new DeviceConfiguration(),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ebmnzbtbhjpglk", response.nextLink());
        Assertions.assertEquals("yhrfouyftaakcpw", response.value().get(0).etag());
        Assertions.assertEquals("neuelfphsdyhtoz", response.value().get(0).displayName());
        Assertions.assertEquals("kd", response.value().get(0).description());
        Assertions.assertEquals("wq", response.value().get(0).publisherDisplayName());
        Assertions.assertEquals("v", response.value().get(0).publisherIdentifier());
        Assertions.assertEquals("xclvit", response.value().get(0).offer());
        Assertions.assertEquals("qzonosggbhcohf", response.value().get(0).offerVersion());
        Assertions.assertEquals("sjnkal", response.value().get(0).sku());
        Assertions.assertEquals("tiiswacffg", response.value().get(0).billingPartNumber());
        Assertions.assertEquals("zzewkfvhqcrai", response.value().get(0).vmExtensionType());
        Assertions.assertEquals("pnppfuf", response.value().get(0).galleryItemIdentity());
        Assertions.assertEquals("dmhdlxyjr", response.value().get(0).iconUris().large());
        Assertions.assertEquals("agafcnihgwqap", response.value().get(0).iconUris().wide());
        Assertions.assertEquals("dgfbcvkcvqvpke", response.value().get(0).iconUris().medium());
        Assertions.assertEquals("cvdrhvoodsot", response.value().get(0).iconUris().small());
        Assertions.assertEquals("bzdopcj", response.value().get(0).iconUris().hero());
        Assertions.assertEquals("dldwmgxc", response.value().get(0).legalTerms());
        Assertions.assertEquals("slpmutwuo", response.value().get(0).privacyPolicy());
        Assertions.assertEquals(7807372555856533798L, response.value().get(0).payloadLength());
        Assertions.assertEquals("hjwniyqsluic", response.value().get(0).productKind());
        Assertions.assertEquals("gk", response.value().get(0).productProperties().version());
        Assertions.assertEquals(false, response.value().get(0).compatibility().isCompatible());
        Assertions.assertEquals("bmpaxmodfvu", response.value().get(0).compatibility().message());
        Assertions.assertEquals("yw", response.value().get(0).compatibility().description());
        Assertions.assertEquals(CompatibilityIssue.DISCONNECTED_ENVIRONMENT_REQUIRED,
            response.value().get(0).compatibility().issues().get(0));
    }
}
