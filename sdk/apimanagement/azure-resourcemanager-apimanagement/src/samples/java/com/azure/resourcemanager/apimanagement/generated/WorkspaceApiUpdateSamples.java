// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.ApiUpdateContract;

/**
 * Samples for WorkspaceApi Update.
 */
public final class WorkspaceApiUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementUpdateWorkspaceApi.json
     */
    /**
     * Sample code: ApiManagementUpdateWorkspaceApi.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementUpdateWorkspaceApi(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceApis()
            .updateWithResponse("rg1", "apimService1", "wks1", "echo-api", "*",
                new ApiUpdateContract().withDisplayName("Echo API New")
                    .withServiceUrl("http://echoapi.cloudapp.net/api2")
                    .withPath("newecho"),
                com.azure.core.util.Context.NONE);
    }
}
