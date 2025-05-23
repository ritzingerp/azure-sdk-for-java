// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.models.KpiAlias;
import org.junit.jupiter.api.Assertions;

public final class KpiAliasTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KpiAlias model = BinaryData.fromString("{\"aliasName\":\"mhjrunmpxttdbhr\",\"expression\":\"nlankxmyskpb\"}")
            .toObject(KpiAlias.class);
        Assertions.assertEquals("mhjrunmpxttdbhr", model.aliasName());
        Assertions.assertEquals("nlankxmyskpb", model.expression());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KpiAlias model = new KpiAlias().withAliasName("mhjrunmpxttdbhr").withExpression("nlankxmyskpb");
        model = BinaryData.fromObject(model).toObject(KpiAlias.class);
        Assertions.assertEquals("mhjrunmpxttdbhr", model.aliasName());
        Assertions.assertEquals("nlankxmyskpb", model.expression());
    }
}
