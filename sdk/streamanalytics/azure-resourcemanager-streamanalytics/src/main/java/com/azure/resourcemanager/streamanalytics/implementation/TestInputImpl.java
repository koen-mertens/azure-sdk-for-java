// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.TestInputInner;
import com.azure.resourcemanager.streamanalytics.models.Input;
import com.azure.resourcemanager.streamanalytics.models.TestInput;

public final class TestInputImpl implements TestInput {
    private TestInputInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    TestInputImpl(TestInputInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Input input() {
        InputInner inner = this.innerModel().input();
        if (inner != null) {
            return new InputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TestInputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }
}
