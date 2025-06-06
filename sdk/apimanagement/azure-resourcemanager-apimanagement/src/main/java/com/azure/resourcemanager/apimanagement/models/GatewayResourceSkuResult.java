// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.GatewayResourceSkuResultInner;

/**
 * An immutable client-side representation of GatewayResourceSkuResult.
 */
public interface GatewayResourceSkuResult {
    /**
     * Gets the resourceType property: The type of resource the SKU applies to.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the sku property: Specifies API Management gateway SKU.
     * 
     * @return the sku value.
     */
    GatewaySku sku();

    /**
     * Gets the capacity property: Specifies the number of API Management gateway units.
     * 
     * @return the capacity value.
     */
    GatewaySkuCapacity capacity();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.GatewayResourceSkuResultInner object.
     * 
     * @return the inner object.
     */
    GatewayResourceSkuResultInner innerModel();
}
