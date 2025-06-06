// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureApplyRecoveryPointInput;

/**
 * Samples for ReplicationProtectedItems ApplyRecoveryPoint.
 */
public final class ReplicationProtectedItemsApplyRecoveryPointSamp {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationProtectedItems_ApplyRecoveryPoint.json
     */
    /**
     * Sample code: Change or apply recovery point.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        changeOrApplyRecoveryPoint(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectedItems()
            .applyRecoveryPoint("resourceGroupPS1", "vault1", "cloud1", "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "f8491e4f-817a-40dd-a90c-af773978c75b",
                new ApplyRecoveryPointInput().withProperties(new ApplyRecoveryPointInputProperties()
                    .withRecoveryPointId(
                        "/Subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/resourceGroupPS1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationFabrics/cloud1/replicationProtectionContainers/cloud_6d224fc6-f326-5d35-96de-fbf51efb3179/replicationProtectedItems/f8491e4f-817a-40dd-a90c-af773978c75b/recoveryPoints/e4d05fe9-5dfd-47be-b50b-aad306b2802d")
                    .withProviderSpecificDetails(new HyperVReplicaAzureApplyRecoveryPointInput())),
                com.azure.core.util.Context.NONE);
    }
}
