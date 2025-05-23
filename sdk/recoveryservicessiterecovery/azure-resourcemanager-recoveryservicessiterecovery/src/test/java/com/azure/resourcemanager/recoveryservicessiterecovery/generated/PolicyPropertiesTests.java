// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PolicyProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PolicyProviderSpecificDetails;
import org.junit.jupiter.api.Assertions;

public final class PolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyProperties model = BinaryData.fromString(
            "{\"friendlyName\":\"blkujrllfojuidjp\",\"providerSpecificDetails\":{\"instanceType\":\"PolicyProviderSpecificDetails\"}}")
            .toObject(PolicyProperties.class);
        Assertions.assertEquals("blkujrllfojuidjp", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyProperties model = new PolicyProperties().withFriendlyName("blkujrllfojuidjp")
            .withProviderSpecificDetails(new PolicyProviderSpecificDetails());
        model = BinaryData.fromObject(model).toObject(PolicyProperties.class);
        Assertions.assertEquals("blkujrllfojuidjp", model.friendlyName());
    }
}
