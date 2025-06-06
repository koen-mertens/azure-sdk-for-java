// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Advertise Connected Subnets. Ex: "True" | "False".
 */
public final class RedistributeConnectedSubnets extends ExpandableStringEnum<RedistributeConnectedSubnets> {
    /**
     * Static value True for RedistributeConnectedSubnets.
     */
    public static final RedistributeConnectedSubnets TRUE = fromString("True");

    /**
     * Static value False for RedistributeConnectedSubnets.
     */
    public static final RedistributeConnectedSubnets FALSE = fromString("False");

    /**
     * Creates a new instance of RedistributeConnectedSubnets value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RedistributeConnectedSubnets() {
    }

    /**
     * Creates or finds a RedistributeConnectedSubnets from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RedistributeConnectedSubnets.
     */
    public static RedistributeConnectedSubnets fromString(String name) {
        return fromString(name, RedistributeConnectedSubnets.class);
    }

    /**
     * Gets known RedistributeConnectedSubnets values.
     * 
     * @return known RedistributeConnectedSubnets values.
     */
    public static Collection<RedistributeConnectedSubnets> values() {
        return values(RedistributeConnectedSubnets.class);
    }
}
