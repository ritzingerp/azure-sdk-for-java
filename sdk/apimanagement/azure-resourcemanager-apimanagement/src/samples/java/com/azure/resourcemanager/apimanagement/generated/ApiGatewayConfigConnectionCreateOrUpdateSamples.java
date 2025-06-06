// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for ApiGatewayConfigConnection CreateOrUpdate.
 */
public final class ApiGatewayConfigConnectionCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementCreateGatewayConfigConnection.json
     */
    /**
     * Sample code: ApiManagementCreateGatewayConfigConnection.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateGatewayConfigConnection(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiGatewayConfigConnections()
            .define("gcc-01")
            .withExistingGateway("rg1", "standard-gw-01")
            .withSourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ApiManagement/services/apim-service-1/workspaces/ws-001")
            .create();
    }
}
