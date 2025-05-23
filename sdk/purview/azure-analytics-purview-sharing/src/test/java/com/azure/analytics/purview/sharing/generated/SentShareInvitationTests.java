// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.analytics.purview.sharing.models.SentShareInvitation;
import com.azure.core.util.BinaryData;

public final class SentShareInvitationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SentShareInvitation model = BinaryData
            .fromString("{\"invitationKind\":\"SentShareInvitation\",\"id\":\"txukcdmp\",\"type\":\"cryuan\"}")
            .toObject(SentShareInvitation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SentShareInvitation model = new SentShareInvitation();
        model = BinaryData.fromObject(model).toObject(SentShareInvitation.class);
    }
}
