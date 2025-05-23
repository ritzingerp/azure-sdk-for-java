// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureBlobFSWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSWriteSettings model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSWriteSettings\",\"blockSizeInMB\":\"datauabqb\",\"maxConcurrentConnections\":\"datarb\",\"disableMetricsCollection\":\"datatszb\",\"copyBehavior\":\"dataxnjorvpcoxdlppu\",\"metadata\":[{\"name\":\"datanpclnmjkydh\",\"value\":\"datafivoz\"}],\"\":{\"x\":\"datarikwiucvvr\",\"ctrwrvnsc\":\"databjgozoelamerp\",\"jlgxrsnbtrooa\":\"dataacbrywqqeztlf\"}}")
            .toObject(AzureBlobFSWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSWriteSettings model = new AzureBlobFSWriteSettings().withMaxConcurrentConnections("datarb")
            .withDisableMetricsCollection("datatszb")
            .withCopyBehavior("dataxnjorvpcoxdlppu")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datanpclnmjkydh").withValue("datafivoz")))
            .withBlockSizeInMB("datauabqb");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSWriteSettings.class);
    }
}
