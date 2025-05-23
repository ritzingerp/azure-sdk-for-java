// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.JobExecution;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceProvidersJobExecutionWithResponseMockTests {
    @Test
    public void testJobExecutionWithResponse() throws Exception {
        String responseStr
            = "{\"name\":\"qywwwmhk\",\"id\":\"wa\",\"type\":\"rympmlq\",\"properties\":{\"status\":\"Failed\",\"startTime\":\"2021-10-07T10:05:11Z\",\"endTime\":\"2021-06-28T12:08:40Z\",\"template\":{\"containers\":[{\"image\":\"pfjiiknjdiqfli\",\"name\":\"hpclb\",\"command\":[\"fsbw\",\"eivbvz\",\"pbwxgoooxz\"],\"args\":[\"dmskxknpdgzigjsu\",\"swhgsaodk\"],\"env\":[{},{},{},{}],\"resources\":{}},{\"image\":\"foct\",\"name\":\"zhaquvwsxb\",\"command\":[\"kerv\",\"choadhrsxqv\",\"vspabdsrgfajgl\",\"rsubklrxhjnl\"],\"args\":[\"tjdvqydieqqkwa\",\"uwdxvqzxoebwgj\",\"bibanbau\",\"wtzvpakloz\"],\"env\":[{},{}],\"resources\":{}}],\"initContainers\":[{\"image\":\"jplssan\",\"name\":\"ttkgsux\",\"command\":[\"swgkpjhboyikebh\",\"hkslgwlokhueoij\",\"zcqypzqzufgsyf\",\"jyvdwtfxptpqayam\"],\"args\":[\"fgybmxs\"],\"env\":[{},{},{},{}],\"resources\":{}},{\"image\":\"ullojk\",\"name\":\"yhgww\",\"command\":[\"xdbdljzgdyrcvu\",\"bsgzl\",\"qhbjnqogdxwbsfpy\",\"x\"],\"args\":[\"flecominxojjl\",\"xxdhilzzdzzqjm\"],\"env\":[{}],\"resources\":{}}]}}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        JobExecution response = manager.resourceProviders()
            .jobExecutionWithResponse("ohtwzmqilr", "xy", "fni", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qywwwmhk", response.name());
        Assertions.assertEquals("wa", response.id());
        Assertions.assertEquals("rympmlq", response.type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-07T10:05:11Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T12:08:40Z"), response.endTime());
        Assertions.assertEquals("pfjiiknjdiqfli", response.template().containers().get(0).image());
        Assertions.assertEquals("hpclb", response.template().containers().get(0).name());
        Assertions.assertEquals("fsbw", response.template().containers().get(0).command().get(0));
        Assertions.assertEquals("dmskxknpdgzigjsu", response.template().containers().get(0).args().get(0));
        Assertions.assertEquals("jplssan", response.template().initContainers().get(0).image());
        Assertions.assertEquals("ttkgsux", response.template().initContainers().get(0).name());
        Assertions.assertEquals("swgkpjhboyikebh", response.template().initContainers().get(0).command().get(0));
        Assertions.assertEquals("fgybmxs", response.template().initContainers().get(0).args().get(0));
    }
}
