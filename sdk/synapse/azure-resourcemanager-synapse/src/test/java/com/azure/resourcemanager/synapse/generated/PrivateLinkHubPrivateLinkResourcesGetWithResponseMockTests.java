// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.PrivateLinkResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkHubPrivateLinkResourcesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupId\":\"rquv\",\"requiredMembers\":[\"glpm\",\"rdcueljtiahx\",\"fqryarvsx\",\"qbglcjkaysp\"],\"requiredZoneNames\":[\"odubtlmjt\",\"blioskkfmkmf\"]},\"id\":\"jxyxgb\",\"name\":\"kqvjcteoedlr\",\"type\":\"lskkzpxvj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateLinkResource response = manager.privateLinkHubPrivateLinkResources()
            .getWithResponse("txvcm", "funlcpxxvi", "yeyng", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
