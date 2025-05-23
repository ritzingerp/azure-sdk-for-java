// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.fluent.models.AccessPolicyAssignmentInner;
import com.azure.resourcemanager.redisenterprise.models.AccessPolicyAssignmentList;
import com.azure.resourcemanager.redisenterprise.models.AccessPolicyAssignmentPropertiesUser;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessPolicyAssignmentListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessPolicyAssignmentList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"accessPolicyName\":\"xobnbdxkqpxok\",\"user\":{\"objectId\":\"ionpimexg\"}},\"id\":\"txgcpodgmaajr\",\"name\":\"vdjwzrlovm\",\"type\":\"lwhijcoejctbzaq\"}],\"nextLink\":\"sycbkbfk\"}")
            .toObject(AccessPolicyAssignmentList.class);
        Assertions.assertEquals("xobnbdxkqpxok", model.value().get(0).accessPolicyName());
        Assertions.assertEquals("ionpimexg", model.value().get(0).user().objectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessPolicyAssignmentList model = new AccessPolicyAssignmentList()
            .withValue(Arrays.asList(new AccessPolicyAssignmentInner().withAccessPolicyName("xobnbdxkqpxok")
                .withUser(new AccessPolicyAssignmentPropertiesUser().withObjectId("ionpimexg"))));
        model = BinaryData.fromObject(model).toObject(AccessPolicyAssignmentList.class);
        Assertions.assertEquals("xobnbdxkqpxok", model.value().get(0).accessPolicyName());
        Assertions.assertEquals("ionpimexg", model.value().get(0).user().objectId());
    }
}
