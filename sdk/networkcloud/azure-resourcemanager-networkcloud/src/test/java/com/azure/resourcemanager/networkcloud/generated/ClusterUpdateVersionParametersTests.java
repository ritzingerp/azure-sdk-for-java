// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterUpdateVersionParameters;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpdateVersionParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpdateVersionParameters model = BinaryData.fromString("{\"targetClusterVersion\":\"aarbgjekg\"}")
            .toObject(ClusterUpdateVersionParameters.class);
        Assertions.assertEquals("aarbgjekg", model.targetClusterVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpdateVersionParameters model
            = new ClusterUpdateVersionParameters().withTargetClusterVersion("aarbgjekg");
        model = BinaryData.fromObject(model).toObject(ClusterUpdateVersionParameters.class);
        Assertions.assertEquals("aarbgjekg", model.targetClusterVersion());
    }
}
