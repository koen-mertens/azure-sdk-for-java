// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerManagedIdentityProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerUserAssignedIdentity;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServices;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for LocalRulestacks CreateOrUpdate. */
public final class LocalRulestacksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulestacksCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.localRulestacks().define("lrs1").withRegion("eastus").withExistingResourceGroup("rgopenapi").create();
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulestacksCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .localRulestacks()
            .define("lrs1")
            .withRegion("eastus")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("tagName", "value"))
            .withIdentity(
                new AzureResourceManagerManagedIdentityProperties()
                    .withType(ManagedIdentityType.NONE)
                    .withUserAssignedIdentities(
                        mapOf(
                            "key16",
                            new AzureResourceManagerUserAssignedIdentity()
                                .withClientId("aaaa")
                                .withPrincipalId("aaaaaaaaaaaaaaa"))))
            .withPanEtag("2bf4a339-294d-4c25-b0b2-ef649e9f5c12")
            .withPanLocation("eastus")
            .withScope(ScopeType.LOCAL)
            .withAssociatedSubscriptions(Arrays.asList("2bf4a339-294d-4c25-b0b2-ef649e9f5c27"))
            .withDescription("local rulestacks")
            .withDefaultMode(DefaultMode.IPS)
            .withMinAppIdVersion("8.5.3")
            .withSecurityServices(
                new SecurityServices()
                    .withVulnerabilityProfile("default")
                    .withAntiSpywareProfile("default")
                    .withAntiVirusProfile("default")
                    .withUrlFilteringProfile("default")
                    .withFileBlockingProfile("default")
                    .withDnsSubscription("default")
                    .withOutboundUnTrustCertificate("default")
                    .withOutboundTrustCertificate("default"))
            .create();
    }

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