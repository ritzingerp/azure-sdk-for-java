// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for PolicySetDefinitionVersions DeleteAtManagementGroup.
 */
public final class PolicySetDefinitionVersionsDeleteAtManagementGroupSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2023-04-01/examples/
     * deletePolicySetDefinitionVersionAtManagementGroup.json
     */
    /**
     * Sample code: Delete a policy set definition version at management group level.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        deleteAPolicySetDefinitionVersionAtManagementGroupLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .policyClient()
            .getPolicySetDefinitionVersions()
            .deleteAtManagementGroupWithResponse("MyManagementGroup", "CostManagement", "1.2.1",
                com.azure.core.util.Context.NONE);
    }
}
