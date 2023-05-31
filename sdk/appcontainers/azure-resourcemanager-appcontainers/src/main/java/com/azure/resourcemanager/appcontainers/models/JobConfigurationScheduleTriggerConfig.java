// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cron formatted repeating trigger schedule ("* * * * *") for cronjobs. Properties completions and parallelism would be
 * set to 1 by default.
 */
@Fluent
public final class JobConfigurationScheduleTriggerConfig {
    /*
     * Minimum number of successful replica completions before overall job completion.
     */
    @JsonProperty(value = "replicaCompletionCount")
    private Integer replicaCompletionCount;

    /*
     * Cron formatted repeating schedule ("* * * * *") of a Cron Job.
     */
    @JsonProperty(value = "cronExpression", required = true)
    private String cronExpression;

    /*
     * Number of parallel replicas of a job that can run at a given time.
     */
    @JsonProperty(value = "parallelism")
    private Integer parallelism;

    /** Creates an instance of JobConfigurationScheduleTriggerConfig class. */
    public JobConfigurationScheduleTriggerConfig() {
    }

    /**
     * Get the replicaCompletionCount property: Minimum number of successful replica completions before overall job
     * completion.
     *
     * @return the replicaCompletionCount value.
     */
    public Integer replicaCompletionCount() {
        return this.replicaCompletionCount;
    }

    /**
     * Set the replicaCompletionCount property: Minimum number of successful replica completions before overall job
     * completion.
     *
     * @param replicaCompletionCount the replicaCompletionCount value to set.
     * @return the JobConfigurationScheduleTriggerConfig object itself.
     */
    public JobConfigurationScheduleTriggerConfig withReplicaCompletionCount(Integer replicaCompletionCount) {
        this.replicaCompletionCount = replicaCompletionCount;
        return this;
    }

    /**
     * Get the cronExpression property: Cron formatted repeating schedule ("* * * * *") of a Cron Job.
     *
     * @return the cronExpression value.
     */
    public String cronExpression() {
        return this.cronExpression;
    }

    /**
     * Set the cronExpression property: Cron formatted repeating schedule ("* * * * *") of a Cron Job.
     *
     * @param cronExpression the cronExpression value to set.
     * @return the JobConfigurationScheduleTriggerConfig object itself.
     */
    public JobConfigurationScheduleTriggerConfig withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * Get the parallelism property: Number of parallel replicas of a job that can run at a given time.
     *
     * @return the parallelism value.
     */
    public Integer parallelism() {
        return this.parallelism;
    }

    /**
     * Set the parallelism property: Number of parallel replicas of a job that can run at a given time.
     *
     * @param parallelism the parallelism value to set.
     * @return the JobConfigurationScheduleTriggerConfig object itself.
     */
    public JobConfigurationScheduleTriggerConfig withParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cronExpression() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cronExpression in model JobConfigurationScheduleTriggerConfig"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobConfigurationScheduleTriggerConfig.class);
}