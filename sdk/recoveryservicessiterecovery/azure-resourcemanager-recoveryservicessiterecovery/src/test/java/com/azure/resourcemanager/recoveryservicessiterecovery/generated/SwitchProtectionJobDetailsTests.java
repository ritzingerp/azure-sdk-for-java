// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionJobDetails;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SwitchProtectionJobDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchProtectionJobDetails model = BinaryData.fromString(
            "{\"instanceType\":\"SwitchProtectionJobDetails\",\"newReplicationProtectedItemId\":\"xvjeazrah\",\"affectedObjectDetails\":{\"cthtpq\":\"bimyiieqa\",\"zkdiuvflgzhcw\":\"fzdos\"}}")
            .toObject(SwitchProtectionJobDetails.class);
        Assertions.assertEquals("bimyiieqa", model.affectedObjectDetails().get("cthtpq"));
        Assertions.assertEquals("xvjeazrah", model.newReplicationProtectedItemId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchProtectionJobDetails model = new SwitchProtectionJobDetails()
            .withAffectedObjectDetails(mapOf("cthtpq", "bimyiieqa", "zkdiuvflgzhcw", "fzdos"))
            .withNewReplicationProtectedItemId("xvjeazrah");
        model = BinaryData.fromObject(model).toObject(SwitchProtectionJobDetails.class);
        Assertions.assertEquals("bimyiieqa", model.affectedObjectDetails().get("cthtpq"));
        Assertions.assertEquals("xvjeazrah", model.newReplicationProtectedItemId());
    }

    // Use "Map.of" if available
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
