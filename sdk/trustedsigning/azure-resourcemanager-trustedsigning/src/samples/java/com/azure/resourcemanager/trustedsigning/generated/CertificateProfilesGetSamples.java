// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

/**
 * Samples for CertificateProfiles Get.
 */
public final class CertificateProfilesGetSamples {
    /*
     * x-ms-original-file: 2024-09-30-preview/CertificateProfiles_Get.json
     */
    /**
     * Sample code: Get details of a certificate profile.
     * 
     * @param manager Entry point to TrustedSigningManager.
     */
    public static void
        getDetailsOfACertificateProfile(com.azure.resourcemanager.trustedsigning.TrustedSigningManager manager) {
        manager.certificateProfiles()
            .getWithResponse("MyResourceGroup", "MyAccount", "profileA", com.azure.core.util.Context.NONE);
    }
}
