// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.core.utils.tracing;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.TypeConditions;
import io.clientcore.core.utils.Context;

import java.util.Map;

/**
 * Represents tracing link that connects one trace to another.
 */
@Metadata(conditions = TypeConditions.IMMUTABLE)
public class TracingLink {
    private final Context context;
    private final Map<String, Object> attributes;

    /**
     * Creates link traces without attributes
     * @param context instance of context that contains span context
     */
    public TracingLink(Context context) {
        this.context = context;
        this.attributes = null;
    }

    /**
     * Creates link with attributes.
     * @param context instance of context that contains span context
     * @param attributes instance of link attributes
     */
    public TracingLink(Context context, Map<String, Object> attributes) {
        this.context = context;
        this.attributes = attributes;
    }

    /**
     * Gets linked context
     * @return context instance
     */
    public Context getContext() {
        return context;
    }

    /**
     * Gets link attributes
     * @return attributes instance
     */
    public Map<String, Object> getAttributes() {
        return attributes;
    }
}
