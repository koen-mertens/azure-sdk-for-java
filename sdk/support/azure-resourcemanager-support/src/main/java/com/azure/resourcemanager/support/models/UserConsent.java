// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * User consent value provided.
 */
public final class UserConsent extends ExpandableStringEnum<UserConsent> {
    /**
     * Static value Yes for UserConsent.
     */
    public static final UserConsent YES = fromString("Yes");

    /**
     * Static value No for UserConsent.
     */
    public static final UserConsent NO = fromString("No");

    /**
     * Creates a new instance of UserConsent value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UserConsent() {
    }

    /**
     * Creates or finds a UserConsent from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UserConsent.
     */
    public static UserConsent fromString(String name) {
        return fromString(name, UserConsent.class);
    }

    /**
     * Gets known UserConsent values.
     * 
     * @return known UserConsent values.
     */
    public static Collection<UserConsent> values() {
        return values(UserConsent.class);
    }
}
