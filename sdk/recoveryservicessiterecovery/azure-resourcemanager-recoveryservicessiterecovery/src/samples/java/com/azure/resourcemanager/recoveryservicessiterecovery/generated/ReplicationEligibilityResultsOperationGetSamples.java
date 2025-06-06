// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationEligibilityResultsOperation Get.
 */
public final class ReplicationEligibilityResultsOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationEligibilityResults_Get.json
     */
    /**
     * Sample code: Gets the validation errors in case the VM is unsuitable for protection.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheValidationErrorsInCaseTheVMIsUnsuitableForProtection(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationEligibilityResultsOperations()
            .getWithResponse("testRg1", "testVm1", com.azure.core.util.Context.NONE);
    }
}
