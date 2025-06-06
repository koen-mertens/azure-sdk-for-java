// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/**
 * Resource type for force deletion.
 */
public final class ForceDeletionResourceType extends ExpandableStringEnum<ForceDeletionResourceType> {

    /** Static value Microsoft.Compute/virtualMachines for ForceDeletionResourceType. */
    public static final ForceDeletionResourceType VIRTUAL_MACHINES = fromString("Microsoft.Compute/virtualMachines");

    /** Static value Microsoft.Compute/virtualMachineScaleSets for ForceDeletionResourceType. */
    public static final ForceDeletionResourceType VIRTUAL_MACHINE_SCALE_SETS
        = fromString("Microsoft.Compute/virtualMachineScaleSets");

    /**
     * Creates a new instance of ForceDeletionResourceType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForceDeletionResourceType() {
    }

    /**
     * Creates or finds a ForceDeletionResourceType from its string representation.
     * @param name a name to look for
     * @return the corresponding ForceDeletionResourceType
     */
    public static ForceDeletionResourceType fromString(String name) {
        return fromString(name, ForceDeletionResourceType.class);
    }

    /**
     * Gets known ForceDeletionResourceType values.
     *
     * @return known ForceDeletionResourceType values
     */
    public static Collection<ForceDeletionResourceType> values() {
        return values(ForceDeletionResourceType.class);
    }
}
