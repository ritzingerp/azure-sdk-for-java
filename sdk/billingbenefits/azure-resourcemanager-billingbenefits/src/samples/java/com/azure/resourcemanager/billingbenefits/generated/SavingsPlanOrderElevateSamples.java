// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

/**
 * Samples for SavingsPlanOrder Elevate.
 */
public final class SavingsPlanOrderElevateSamples {
    /*
     * x-ms-original-file:
     * specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/
     * SavingsPlanOrderElevate.json
     */
    /**
     * Sample code: SavingsPlanOrderElevate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanOrderElevate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrders()
            .elevateWithResponse("20000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
