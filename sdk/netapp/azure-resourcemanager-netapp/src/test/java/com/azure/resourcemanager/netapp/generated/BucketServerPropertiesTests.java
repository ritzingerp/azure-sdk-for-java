// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BucketServerProperties;
import org.junit.jupiter.api.Assertions;

public final class BucketServerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BucketServerProperties model = BinaryData.fromString(
            "{\"fqdn\":\"peewchpxlkt\",\"certificateCommonName\":\"uziycsl\",\"certificateExpiryDate\":\"2021-06-28T05:31:47Z\",\"ipAddress\":\"uztcktyhjtqed\",\"certificateObject\":\"zulwmmrqzzrrj\"}")
            .toObject(BucketServerProperties.class);
        Assertions.assertEquals("peewchpxlkt", model.fqdn());
        Assertions.assertEquals("zulwmmrqzzrrj", model.certificateObject());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BucketServerProperties model
            = new BucketServerProperties().withFqdn("peewchpxlkt").withCertificateObject("zulwmmrqzzrrj");
        model = BinaryData.fromObject(model).toObject(BucketServerProperties.class);
        Assertions.assertEquals("peewchpxlkt", model.fqdn());
        Assertions.assertEquals("zulwmmrqzzrrj", model.certificateObject());
    }
}
