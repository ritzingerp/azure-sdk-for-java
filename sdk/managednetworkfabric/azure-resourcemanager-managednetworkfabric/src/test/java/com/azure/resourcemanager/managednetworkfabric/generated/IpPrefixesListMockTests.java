// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.Condition;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefix;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IpPrefixesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"configurationState\":\"Succeeded\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"MAT\",\"ipPrefixRules\":[{\"action\":\"Deny\",\"sequenceNumber\":5109634825070710854,\"networkPrefix\":\"vytzq\",\"condition\":\"GreaterThanOrEqualTo\",\"subnetMaskLength\":\"jvzmxyrazzstjvc\"},{\"action\":\"Permit\",\"sequenceNumber\":4983579071329982771,\"networkPrefix\":\"brlbozlt\",\"condition\":\"GreaterThanOrEqualTo\",\"subnetMaskLength\":\"cbibtk\"}],\"annotation\":\"ecupmwxdsokr\"},\"location\":\"rpeylfii\",\"tags\":{\"hcxwwwvun\":\"dgiql\",\"atrtcqyfjvifbmo\":\"nsgvxhxrm\"},\"id\":\"tehqyoytrcoufkq\",\"name\":\"bhukdfpknv\",\"type\":\"iv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ManagedNetworkFabricManager manager = ManagedNetworkFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IpPrefix> response = manager.ipPrefixes().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rpeylfii", response.iterator().next().location());
        Assertions.assertEquals("dgiql", response.iterator().next().tags().get("hcxwwwvun"));
        Assertions.assertEquals(CommunityActionTypes.DENY, response.iterator().next().ipPrefixRules().get(0).action());
        Assertions.assertEquals(5109634825070710854L,
            response.iterator().next().ipPrefixRules().get(0).sequenceNumber());
        Assertions.assertEquals("vytzq", response.iterator().next().ipPrefixRules().get(0).networkPrefix());
        Assertions.assertEquals(Condition.GREATER_THAN_OR_EQUAL_TO,
            response.iterator().next().ipPrefixRules().get(0).condition());
        Assertions.assertEquals("jvzmxyrazzstjvc",
            response.iterator().next().ipPrefixRules().get(0).subnetMaskLength());
        Assertions.assertEquals("ecupmwxdsokr", response.iterator().next().annotation());
    }
}
