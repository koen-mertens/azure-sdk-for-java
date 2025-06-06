// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensions.generated;

import com.azure.resourcemanager.kubernetesconfiguration.extensions.fluent.models.ExtensionInner;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.Plan;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.Scope;
import com.azure.resourcemanager.kubernetesconfiguration.extensions.models.ScopeCluster;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Extensions Create.
 */
public final class ExtensionsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/extensions/stable/2024-
     * 11-01/examples/CreateExtension.json
     */
    /**
     * Sample code: Create Extension.
     * 
     * @param manager Entry point to ExtensionsManager.
     */
    public static void
        createExtension(com.azure.resourcemanager.kubernetesconfiguration.extensions.ExtensionsManager manager) {
        manager.extensions()
            .create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", "ClusterMonitor",
                new ExtensionInner().withExtensionType("azuremonitor-containers")
                    .withAutoUpgradeMinorVersion(true)
                    .withReleaseTrain("Preview")
                    .withScope(new Scope().withCluster(new ScopeCluster().withReleaseNamespace("kube-system")))
                    .withConfigurationSettings(mapOf("omsagent.env.clusterName", "clusterName1", "omsagent.secret.wsid",
                        "fakeTokenPlaceholder"))
                    .withConfigurationProtectedSettings(mapOf("omsagent.secret.key", "fakeTokenPlaceholder")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/extensions/stable/2024-
     * 11-01/examples/CreateExtensionWithPlan.json
     */
    /**
     * Sample code: Create Extension with Plan.
     * 
     * @param manager Entry point to ExtensionsManager.
     */
    public static void createExtensionWithPlan(
        com.azure.resourcemanager.kubernetesconfiguration.extensions.ExtensionsManager manager) {
        manager.extensions()
            .create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", "azureVote",
                new ExtensionInner()
                    .withPlan(new Plan().withName("azure-vote-standard")
                        .withPublisher("Microsoft")
                        .withProduct("azure-vote-standard-offer-id"))
                    .withExtensionType("azure-vote")
                    .withAutoUpgradeMinorVersion(true)
                    .withReleaseTrain("Preview"),
                com.azure.core.util.Context.NONE);
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
