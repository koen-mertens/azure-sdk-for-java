// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.SessionDetailsResourceInner;

/**
 * An immutable client-side representation of SessionDetailsResource.
 */
public interface SessionDetailsResource {
    /**
     * Gets the iterationId property: Iteration id.
     * 
     * @return the iterationId value.
     */
    String iterationId();

    /**
     * Gets the sessionId property: Session id.
     * 
     * @return the sessionId value.
     */
    String sessionId();

    /**
     * Gets the appliedConfiguration property: Applied configuration for the iteration.
     * 
     * @return the appliedConfiguration value.
     */
    String appliedConfiguration();

    /**
     * Gets the iterationStartTime property: Iteration start time.
     * 
     * @return the iterationStartTime value.
     */
    String iterationStartTime();

    /**
     * Gets the averageQueryRuntimeMs property: The aqr for the iteration.
     * 
     * @return the averageQueryRuntimeMs value.
     */
    String averageQueryRuntimeMs();

    /**
     * Gets the transactionsPerSecond property: The tps for the iteration.
     * 
     * @return the transactionsPerSecond value.
     */
    String transactionsPerSecond();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.SessionDetailsResourceInner
     * object.
     * 
     * @return the inner object.
     */
    SessionDetailsResourceInner innerModel();
}
