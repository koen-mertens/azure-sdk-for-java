// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.deidentification;

import com.azure.core.util.Configuration;
import com.azure.health.deidentification.models.DeidentificationJob;
import com.azure.identity.DefaultAzureCredentialBuilder;
import reactor.core.publisher.Mono;

public class CancelDeidentificationJobAsync {
    public static void main(String[] args) {
        DeidentificationAsyncClient deidentificationClient
            = new DeidentificationClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
            .buildAsyncClient();

        // BEGIN:com.azure.health.deidentification.cancel_deidentification_job_async
        String jobName = Configuration.getGlobalConfiguration().get("DEID_JOB_NAME");

        Mono<DeidentificationJob> jobMono = deidentificationClient.cancelJob(jobName);

        jobMono.subscribe(
            jobResult -> System.out.println(jobResult.getJobName() + " - " + jobResult.getStatus()),
            error -> System.err.println("Error: " + error)
        );
        // END:com.azure.health.deidentification.cancel_deidentification_job_async
    }
}
