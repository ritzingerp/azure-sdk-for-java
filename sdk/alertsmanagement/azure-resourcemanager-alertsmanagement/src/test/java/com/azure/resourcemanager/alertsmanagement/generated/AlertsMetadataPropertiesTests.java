// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.models.AlertsMetadataProperties;

public final class AlertsMetadataPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertsMetadataProperties model = BinaryData.fromString("{\"metadataIdentifier\":\"AlertsMetadataProperties\"}")
            .toObject(AlertsMetadataProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertsMetadataProperties model = new AlertsMetadataProperties();
        model = BinaryData.fromObject(model).toObject(AlertsMetadataProperties.class);
    }
}
