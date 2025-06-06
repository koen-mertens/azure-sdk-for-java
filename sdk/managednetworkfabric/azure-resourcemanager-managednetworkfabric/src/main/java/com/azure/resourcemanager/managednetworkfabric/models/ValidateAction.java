// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Validate action that to be performed.
 */
public final class ValidateAction extends ExpandableStringEnum<ValidateAction> {
    /**
     * Static value Cabling for ValidateAction.
     */
    public static final ValidateAction CABLING = fromString("Cabling");

    /**
     * Static value Configuration for ValidateAction.
     */
    public static final ValidateAction CONFIGURATION = fromString("Configuration");

    /**
     * Static value Connectivity for ValidateAction.
     */
    public static final ValidateAction CONNECTIVITY = fromString("Connectivity");

    /**
     * Creates a new instance of ValidateAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ValidateAction() {
    }

    /**
     * Creates or finds a ValidateAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ValidateAction.
     */
    public static ValidateAction fromString(String name) {
        return fromString(name, ValidateAction.class);
    }

    /**
     * Gets known ValidateAction values.
     * 
     * @return known ValidateAction values.
     */
    public static Collection<ValidateAction> values() {
        return values(ValidateAction.class);
    }
}
