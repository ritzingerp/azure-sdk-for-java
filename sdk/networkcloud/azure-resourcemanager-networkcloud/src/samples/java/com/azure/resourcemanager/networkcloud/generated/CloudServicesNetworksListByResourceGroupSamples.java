// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/**
 * Samples for CloudServicesNetworks ListByResourceGroup.
 */
public final class CloudServicesNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2024-10-01-preview/examples/
     * CloudServicesNetworks_ListByResourceGroup.json
     */
    /**
     * Sample code: List cloud services networks for resource group.
     * 
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void
        listCloudServicesNetworksForResourceGroup(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.cloudServicesNetworks().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}
