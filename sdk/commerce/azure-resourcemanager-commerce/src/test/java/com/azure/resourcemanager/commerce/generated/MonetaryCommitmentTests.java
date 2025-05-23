// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.commerce.models.MonetaryCommitment;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class MonetaryCommitmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonetaryCommitment model = BinaryData.fromString("{\"Name\":\"Monetary"
            + " Commitment\",\"TieredDiscount\":{},\"ExcludedMeterIds\":[\"1aa0f45b-4326-4b78-b0fa-9687c4611286\",\"a60e66b9-10f9-4a92-a7aa-2bf3d302a701\",\"c826acba-6f28-454d-aae4-42fa65ea852b\",\"9baf4d39-7eb5-409a-be03-328ec7b54019\"],\"EffectiveDate\":\"2021-06-11T05:03:33Z\"}")
            .toObject(MonetaryCommitment.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T05:03:33Z"), model.effectiveDate());
        Assertions.assertEquals(UUID.fromString("1aa0f45b-4326-4b78-b0fa-9687c4611286"),
            model.excludedMeterIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonetaryCommitment model
            = new MonetaryCommitment().withEffectiveDate(OffsetDateTime.parse("2021-06-11T05:03:33Z"))
                .withTieredDiscount(mapOf())
                .withExcludedMeterIds(Arrays.asList(UUID.fromString("1aa0f45b-4326-4b78-b0fa-9687c4611286"),
                    UUID.fromString("a60e66b9-10f9-4a92-a7aa-2bf3d302a701"),
                    UUID.fromString("c826acba-6f28-454d-aae4-42fa65ea852b"),
                    UUID.fromString("9baf4d39-7eb5-409a-be03-328ec7b54019")));
        model = BinaryData.fromObject(model).toObject(MonetaryCommitment.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-11T05:03:33Z"), model.effectiveDate());
        Assertions.assertEquals(UUID.fromString("1aa0f45b-4326-4b78-b0fa-9687c4611286"),
            model.excludedMeterIds().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
