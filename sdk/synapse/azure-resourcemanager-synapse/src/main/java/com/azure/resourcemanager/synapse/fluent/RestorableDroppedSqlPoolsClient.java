// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.RestorableDroppedSqlPoolInner;

/**
 * An instance of this class provides access to all the operations defined in RestorableDroppedSqlPoolsClient.
 */
public interface RestorableDroppedSqlPoolsClient {
    /**
     * Gets a deleted sql pool that can be restored.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     * sqlPoolName,deletionTimeInFileTimeFormat.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RestorableDroppedSqlPoolInner> getWithResponse(String resourceGroupName, String workspaceName,
        String restorableDroppedSqlPoolId, Context context);

    /**
     * Gets a deleted sql pool that can be restored.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     * sqlPoolName,deletionTimeInFileTimeFormat.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestorableDroppedSqlPoolInner get(String resourceGroupName, String workspaceName,
        String restorableDroppedSqlPoolId);

    /**
     * Gets a list of deleted Sql pools that can be restored.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableDroppedSqlPoolInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets a list of deleted Sql pools that can be restored.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableDroppedSqlPoolInner> listByWorkspace(String resourceGroupName, String workspaceName,
        Context context);
}
