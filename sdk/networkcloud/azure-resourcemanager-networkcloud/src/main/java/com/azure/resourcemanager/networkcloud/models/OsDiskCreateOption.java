// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The strategy for creating the OS disk. */
public final class OsDiskCreateOption extends ExpandableStringEnum<OsDiskCreateOption> {
    /** Static value Ephemeral for OsDiskCreateOption. */
    public static final OsDiskCreateOption EPHEMERAL = fromString("Ephemeral");

    /**
     * Creates a new instance of OsDiskCreateOption value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OsDiskCreateOption() {
    }

    /**
     * Creates or finds a OsDiskCreateOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OsDiskCreateOption.
     */
    @JsonCreator
    public static OsDiskCreateOption fromString(String name) {
        return fromString(name, OsDiskCreateOption.class);
    }

    /**
     * Gets known OsDiskCreateOption values.
     *
     * @return known OsDiskCreateOption values.
     */
    public static Collection<OsDiskCreateOption> values() {
        return values(OsDiskCreateOption.class);
    }
}