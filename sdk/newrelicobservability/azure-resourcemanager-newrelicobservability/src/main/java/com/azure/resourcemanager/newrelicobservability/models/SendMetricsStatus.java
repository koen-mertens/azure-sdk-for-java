// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether metrics are being sent.
 */
public final class SendMetricsStatus extends ExpandableStringEnum<SendMetricsStatus> {
    /**
     * Static value Enabled for SendMetricsStatus.
     */
    public static final SendMetricsStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for SendMetricsStatus.
     */
    public static final SendMetricsStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SendMetricsStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SendMetricsStatus() {
    }

    /**
     * Creates or finds a SendMetricsStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SendMetricsStatus.
     */
    public static SendMetricsStatus fromString(String name) {
        return fromString(name, SendMetricsStatus.class);
    }

    /**
     * Gets known SendMetricsStatus values.
     * 
     * @return known SendMetricsStatus values.
     */
    public static Collection<SendMetricsStatus> values() {
        return values(SendMetricsStatus.class);
    }
}
