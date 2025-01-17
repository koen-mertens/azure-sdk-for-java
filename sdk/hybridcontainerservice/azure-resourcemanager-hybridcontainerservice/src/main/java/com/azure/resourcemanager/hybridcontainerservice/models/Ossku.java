// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the OS SKU used by the agent pool. The default is CBLMariner if OSType is Linux. The default is Windows2019
 * when OSType is Windows.
 */
public final class Ossku extends ExpandableStringEnum<Ossku> {
    /**
     * Static value CBLMariner for Ossku.
     */
    public static final Ossku CBLMARINER = fromString("CBLMariner");

    /**
     * Static value Windows2019 for Ossku.
     */
    public static final Ossku WINDOWS2019 = fromString("Windows2019");

    /**
     * Static value Windows2022 for Ossku.
     */
    public static final Ossku WINDOWS2022 = fromString("Windows2022");

    /**
     * Creates a new instance of Ossku value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Ossku() {
    }

    /**
     * Creates or finds a Ossku from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Ossku.
     */
    public static Ossku fromString(String name) {
        return fromString(name, Ossku.class);
    }

    /**
     * Gets known Ossku values.
     * 
     * @return known Ossku values.
     */
    public static Collection<Ossku> values() {
        return values(Ossku.class);
    }
}
