// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedEnvironmentUsages List.
 */
public final class ManagedEnvironmentUsagesListSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2025-01-01/examples/ManagedEnvironmentUsages_List.json
     */
    /**
     * Sample code: List managed environment usages.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        listManagedEnvironmentUsages(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentUsages().list("examplerg", "jlaw-demo1", com.azure.core.util.Context.NONE);
    }
}
