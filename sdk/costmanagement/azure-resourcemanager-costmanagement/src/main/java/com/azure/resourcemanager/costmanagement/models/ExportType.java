// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the query.
 */
public final class ExportType extends ExpandableStringEnum<ExportType> {
    /**
     * Static value Usage for ExportType.
     */
    public static final ExportType USAGE = fromString("Usage");

    /**
     * Static value ActualCost for ExportType.
     */
    public static final ExportType ACTUAL_COST = fromString("ActualCost");

    /**
     * Static value AmortizedCost for ExportType.
     */
    public static final ExportType AMORTIZED_COST = fromString("AmortizedCost");

    /**
     * Creates a new instance of ExportType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExportType() {
    }

    /**
     * Creates or finds a ExportType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExportType.
     */
    public static ExportType fromString(String name) {
        return fromString(name, ExportType.class);
    }

    /**
     * Gets known ExportType values.
     * 
     * @return known ExportType values.
     */
    public static Collection<ExportType> values() {
        return values(ExportType.class);
    }
}
