// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import org.junit.jupiter.api.Assertions;

public final class ApplicationMetricDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationMetricDescription model = BinaryData.fromString(
            "{\"name\":\"qig\",\"maximumCapacity\":1427620858530935166,\"reservationCapacity\":8642059696861181136,\"totalApplicationCapacity\":5173080348817508321}")
            .toObject(ApplicationMetricDescription.class);
        Assertions.assertEquals("qig", model.name());
        Assertions.assertEquals(1427620858530935166L, model.maximumCapacity());
        Assertions.assertEquals(8642059696861181136L, model.reservationCapacity());
        Assertions.assertEquals(5173080348817508321L, model.totalApplicationCapacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationMetricDescription model = new ApplicationMetricDescription().withName("qig")
            .withMaximumCapacity(1427620858530935166L)
            .withReservationCapacity(8642059696861181136L)
            .withTotalApplicationCapacity(5173080348817508321L);
        model = BinaryData.fromObject(model).toObject(ApplicationMetricDescription.class);
        Assertions.assertEquals("qig", model.name());
        Assertions.assertEquals(1427620858530935166L, model.maximumCapacity());
        Assertions.assertEquals(8642059696861181136L, model.reservationCapacity());
        Assertions.assertEquals(5173080348817508321L, model.totalApplicationCapacity());
    }
}
