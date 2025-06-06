// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Refers to how important a clinical guidance is.
 */
public final class GuidanceRankingType extends ExpandableStringEnum<GuidanceRankingType> {

    /**
     * high.
     */
    @Generated
    public static final GuidanceRankingType HIGH = fromString("high");

    /**
     * low.
     */
    @Generated
    public static final GuidanceRankingType LOW = fromString("low");

    /**
     * Creates a new instance of GuidanceRankingType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public GuidanceRankingType() {
    }

    /**
     * Creates or finds a GuidanceRankingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GuidanceRankingType.
     */
    @Generated
    public static GuidanceRankingType fromString(String name) {
        return fromString(name, GuidanceRankingType.class);
    }

    /**
     * Gets known GuidanceRankingType values.
     *
     * @return known GuidanceRankingType values.
     */
    @Generated
    public static Collection<GuidanceRankingType> values() {
        return values(GuidanceRankingType.class);
    }
}
