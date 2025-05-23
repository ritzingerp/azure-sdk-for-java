// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedcache.models.ConnectedCachePatchResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ConnectedCachePatchResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectedCachePatchResource model
            = BinaryData.fromString("{\"tags\":{\"ifpikxwczby\":\"fcbjysagithxqha\",\"rkxvdum\":\"cnpqxuhivyqniwby\"}}")
                .toObject(ConnectedCachePatchResource.class);
        Assertions.assertEquals("fcbjysagithxqha", model.tags().get("ifpikxwczby"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectedCachePatchResource model = new ConnectedCachePatchResource()
            .withTags(mapOf("ifpikxwczby", "fcbjysagithxqha", "rkxvdum", "cnpqxuhivyqniwby"));
        model = BinaryData.fromObject(model).toObject(ConnectedCachePatchResource.class);
        Assertions.assertEquals("fcbjysagithxqha", model.tags().get("ifpikxwczby"));
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
