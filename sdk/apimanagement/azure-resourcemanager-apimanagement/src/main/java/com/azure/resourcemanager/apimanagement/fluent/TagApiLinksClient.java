// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagApiLinkContractInner;
import com.azure.resourcemanager.apimanagement.models.TagApiLinksGetResponse;

/**
 * An instance of this class provides access to all the operations defined in TagApiLinksClient.
 */
public interface TagApiLinksClient {
    /**
     * Lists a collection of the API links associated with a tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag-API link list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagApiLinkContractInner> listByProduct(String resourceGroupName, String serviceName, String tagId);

    /**
     * Lists a collection of the API links associated with a tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     * |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| apiId | filter | ge, le, eq,
     * ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag-API link list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagApiLinkContractInner> listByProduct(String resourceGroupName, String serviceName, String tagId,
        String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the API link for the tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API link for the tag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagApiLinksGetResponse getWithResponse(String resourceGroupName, String serviceName, String tagId, String apiLinkId,
        Context context);

    /**
     * Gets the API link for the tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API link for the tag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagApiLinkContractInner get(String resourceGroupName, String serviceName, String tagId, String apiLinkId);

    /**
     * Adds an API to the specified tag via link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag-API link details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TagApiLinkContractInner> createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String tagId, String apiLinkId, TagApiLinkContractInner parameters, Context context);

    /**
     * Adds an API to the specified tag via link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag-API link details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagApiLinkContractInner createOrUpdate(String resourceGroupName, String serviceName, String tagId, String apiLinkId,
        TagApiLinkContractInner parameters);

    /**
     * Deletes the specified API from the specified tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String tagId, String apiLinkId,
        Context context);

    /**
     * Deletes the specified API from the specified tag.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param tagId Tag identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Tag-API link identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String tagId, String apiLinkId);
}
