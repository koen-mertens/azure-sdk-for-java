// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.extensions.generated;

/**
 * Samples for Extensions Delete.
 */
public final class ExtensionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/extensions/stable/2024-
     * 11-01/examples/DeleteExtension.json
     */
    /**
     * Sample code: Delete Extension.
     * 
     * @param manager Entry point to ExtensionsManager.
     */
    public static void
        deleteExtension(com.azure.resourcemanager.kubernetesconfiguration.extensions.ExtensionsManager manager) {
        manager.extensions()
            .delete("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", "ClusterMonitor", null,
                com.azure.core.util.Context.NONE);
    }
}
