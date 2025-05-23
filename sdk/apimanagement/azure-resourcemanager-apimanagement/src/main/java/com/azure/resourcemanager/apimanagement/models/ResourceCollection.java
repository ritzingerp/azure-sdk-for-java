// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.ResourceCollectionInner;
import java.util.List;

/**
 * An immutable client-side representation of ResourceCollection.
 */
public interface ResourceCollection {
    /**
     * Gets the value property: A collection of resources.
     * 
     * @return the value value.
     */
    List<ResourceCollectionValueItem> value();

    /**
     * Gets the count property: Total record count number.
     * 
     * @return the count value.
     */
    Long count();

    /**
     * Gets the nextLink property: Next page link if any.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.ResourceCollectionInner object.
     * 
     * @return the inner object.
     */
    ResourceCollectionInner innerModel();
}
