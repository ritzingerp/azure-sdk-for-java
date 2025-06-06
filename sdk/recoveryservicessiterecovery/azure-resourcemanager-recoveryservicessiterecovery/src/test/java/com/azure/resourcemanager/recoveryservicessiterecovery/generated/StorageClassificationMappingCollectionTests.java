// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageClassificationMappingCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageClassificationMappingCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"targetStorageClassificationId\":\"aqi\"},\"location\":\"hheioqaqhvseuf\",\"id\":\"qyrxp\",\"name\":\"lcgqlsismj\",\"type\":\"frddgamquhiosrsj\"}],\"nextLink\":\"vfcdisyirn\"}")
            .toObject(StorageClassificationMappingCollection.class);
        Assertions.assertEquals("aqi", model.value().get(0).properties().targetStorageClassificationId());
        Assertions.assertEquals("hheioqaqhvseuf", model.value().get(0).location());
        Assertions.assertEquals("vfcdisyirn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageClassificationMappingCollection model = new StorageClassificationMappingCollection()
            .withValue(Arrays.asList(new StorageClassificationMappingInner()
                .withProperties(new StorageClassificationMappingProperties().withTargetStorageClassificationId("aqi"))
                .withLocation("hheioqaqhvseuf")))
            .withNextLink("vfcdisyirn");
        model = BinaryData.fromObject(model).toObject(StorageClassificationMappingCollection.class);
        Assertions.assertEquals("aqi", model.value().get(0).properties().targetStorageClassificationId());
        Assertions.assertEquals("hheioqaqhvseuf", model.value().get(0).location());
        Assertions.assertEquals("vfcdisyirn", model.nextLink());
    }
}
