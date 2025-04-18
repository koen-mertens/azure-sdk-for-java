// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for Galleries Delete.
 */
public final class GalleriesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/Galleries_Delete.json
     */
    /**
     * Sample code: Galleries_Delete.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void galleriesDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.galleries().delete("rg1", "Contoso", "StandardGallery", com.azure.core.util.Context.NONE);
    }
}
