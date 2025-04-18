// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/**
 * Samples for WorkflowTriggers Get.
 */
public final class WorkflowTriggersGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_Get.json
     */
    /**
     * Sample code: Get a workflow trigger.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowTrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .getWithResponse("test-resource-group", "test-workflow", "manual", com.azure.core.util.Context.NONE);
    }
}
