// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of upgrade.
 */
public final class ClusterUpgradeType extends ExpandableStringEnum<ClusterUpgradeType> {
    /**
     * Static value AKSPatchUpgrade for ClusterUpgradeType.
     */
    public static final ClusterUpgradeType AKSPATCH_UPGRADE = fromString("AKSPatchUpgrade");

    /**
     * Static value HotfixUpgrade for ClusterUpgradeType.
     */
    public static final ClusterUpgradeType HOTFIX_UPGRADE = fromString("HotfixUpgrade");

    /**
     * Creates a new instance of ClusterUpgradeType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterUpgradeType() {
    }

    /**
     * Creates or finds a ClusterUpgradeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterUpgradeType.
     */
    @JsonCreator
    public static ClusterUpgradeType fromString(String name) {
        return fromString(name, ClusterUpgradeType.class);
    }

    /**
     * Gets known ClusterUpgradeType values.
     * 
     * @return known ClusterUpgradeType values.
     */
    public static Collection<ClusterUpgradeType> values() {
        return values(ClusterUpgradeType.class);
    }
}
