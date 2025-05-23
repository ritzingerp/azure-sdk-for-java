// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.CheckNameAvailabilityInput;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityInput model = BinaryData.fromString("{\"name\":\"upjm\",\"type\":\"fxobbcsws\"}")
            .toObject(CheckNameAvailabilityInput.class);
        Assertions.assertEquals("upjm", model.name());
        Assertions.assertEquals("fxobbcsws", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityInput model = new CheckNameAvailabilityInput().withName("upjm").withType("fxobbcsws");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityInput.class);
        Assertions.assertEquals("upjm", model.name());
        Assertions.assertEquals("fxobbcsws", model.type());
    }
}
