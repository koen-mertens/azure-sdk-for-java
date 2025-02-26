// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The node image upgrade type.
 */
public final class AutoUpgradeNodeImageSelectionType extends ExpandableStringEnum<AutoUpgradeNodeImageSelectionType> {
    /**
     * Static value Latest for AutoUpgradeNodeImageSelectionType.
     */
    public static final AutoUpgradeNodeImageSelectionType LATEST = fromString("Latest");

    /**
     * Static value Consistent for AutoUpgradeNodeImageSelectionType.
     */
    public static final AutoUpgradeNodeImageSelectionType CONSISTENT = fromString("Consistent");

    /**
     * Creates a new instance of AutoUpgradeNodeImageSelectionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoUpgradeNodeImageSelectionType() {
    }

    /**
     * Creates or finds a AutoUpgradeNodeImageSelectionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutoUpgradeNodeImageSelectionType.
     */
    public static AutoUpgradeNodeImageSelectionType fromString(String name) {
        return fromString(name, AutoUpgradeNodeImageSelectionType.class);
    }

    /**
     * Gets known AutoUpgradeNodeImageSelectionType values.
     * 
     * @return known AutoUpgradeNodeImageSelectionType values.
     */
    public static Collection<AutoUpgradeNodeImageSelectionType> values() {
        return values(AutoUpgradeNodeImageSelectionType.class);
    }
}
