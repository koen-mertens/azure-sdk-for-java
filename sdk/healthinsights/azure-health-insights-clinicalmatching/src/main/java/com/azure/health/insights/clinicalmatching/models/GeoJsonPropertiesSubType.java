// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** `GeoJSON` object sub-type. */
public final class GeoJsonPropertiesSubType extends ExpandableStringEnum<GeoJsonPropertiesSubType> {
    /** Static value Circle for GeoJsonPropertiesSubType. */
    public static final GeoJsonPropertiesSubType CIRCLE = fromString("Circle");

    /**
     * Creates a new instance of GeoJsonPropertiesSubType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GeoJsonPropertiesSubType() {}

    /**
     * Creates or finds a GeoJsonPropertiesSubType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoJsonPropertiesSubType.
     */
    @JsonCreator
    public static GeoJsonPropertiesSubType fromString(String name) {
        return fromString(name, GeoJsonPropertiesSubType.class);
    }

    /**
     * Gets known GeoJsonPropertiesSubType values.
     *
     * @return known GeoJsonPropertiesSubType values.
     */
    public static Collection<GeoJsonPropertiesSubType> values() {
        return values(GeoJsonPropertiesSubType.class);
    }
}