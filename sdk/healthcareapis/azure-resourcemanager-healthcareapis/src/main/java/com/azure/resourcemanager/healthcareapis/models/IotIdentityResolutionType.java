// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of IoT identity resolution to use with the destination.
 */
public final class IotIdentityResolutionType extends ExpandableStringEnum<IotIdentityResolutionType> {
    /**
     * Static value Create for IotIdentityResolutionType.
     */
    public static final IotIdentityResolutionType CREATE = fromString("Create");

    /**
     * Static value Lookup for IotIdentityResolutionType.
     */
    public static final IotIdentityResolutionType LOOKUP = fromString("Lookup");

    /**
     * Creates a new instance of IotIdentityResolutionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IotIdentityResolutionType() {
    }

    /**
     * Creates or finds a IotIdentityResolutionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IotIdentityResolutionType.
     */
    public static IotIdentityResolutionType fromString(String name) {
        return fromString(name, IotIdentityResolutionType.class);
    }

    /**
     * Gets known IotIdentityResolutionType values.
     * 
     * @return known IotIdentityResolutionType values.
     */
    public static Collection<IotIdentityResolutionType> values() {
        return values(IotIdentityResolutionType.class);
    }
}
