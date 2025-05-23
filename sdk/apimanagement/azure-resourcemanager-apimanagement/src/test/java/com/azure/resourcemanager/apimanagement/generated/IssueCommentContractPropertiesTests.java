// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueCommentContractProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class IssueCommentContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueCommentContractProperties model = BinaryData
            .fromString("{\"text\":\"minict\",\"createdDate\":\"2021-01-01T11:11:18Z\",\"userId\":\"johiyg\"}")
            .toObject(IssueCommentContractProperties.class);
        Assertions.assertEquals("minict", model.text());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-01T11:11:18Z"), model.createdDate());
        Assertions.assertEquals("johiyg", model.userId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueCommentContractProperties model = new IssueCommentContractProperties().withText("minict")
            .withCreatedDate(OffsetDateTime.parse("2021-01-01T11:11:18Z"))
            .withUserId("johiyg");
        model = BinaryData.fromObject(model).toObject(IssueCommentContractProperties.class);
        Assertions.assertEquals("minict", model.text());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-01T11:11:18Z"), model.createdDate());
        Assertions.assertEquals("johiyg", model.userId());
    }
}
