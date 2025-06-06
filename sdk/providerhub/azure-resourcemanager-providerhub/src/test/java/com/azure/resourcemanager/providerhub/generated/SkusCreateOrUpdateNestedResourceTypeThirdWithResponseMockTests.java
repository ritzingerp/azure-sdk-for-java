// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.providerhub.models.ProvisioningState;
import com.azure.resourcemanager.providerhub.models.SkuCapability;
import com.azure.resourcemanager.providerhub.models.SkuCost;
import com.azure.resourcemanager.providerhub.models.SkuLocationInfo;
import com.azure.resourcemanager.providerhub.models.SkuResource;
import com.azure.resourcemanager.providerhub.models.SkuResourceProperties;
import com.azure.resourcemanager.providerhub.models.SkuScaleType;
import com.azure.resourcemanager.providerhub.models.SkuSetting;
import com.azure.resourcemanager.providerhub.models.SkuSettingCapacity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SkusCreateOrUpdateNestedResourceTypeThirdWithResponseMockTests {
    @Test
    public void testCreateOrUpdateNestedResourceTypeThirdWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"skuSettings\":[{\"name\":\"n\",\"tier\":\"be\",\"size\":\"gis\",\"family\":\"wnykdidjchlrmpw\",\"kind\":\"ofldseacdhz\",\"locations\":[\"brfgdrwji\",\"ewhfjsrwqrxetf\",\"cwv\"],\"locationInfo\":[{\"location\":\"dqntycnawthv\"},{\"location\":\"ax\"},{\"location\":\"nuyeamcmhud\"}],\"requiredQuotaIds\":[\"cehokw\",\"pqtwloesqrggvrb\"],\"requiredFeatures\":[\"ukoila\",\"iduw\"],\"capacity\":{\"minimum\":111210342,\"maximum\":844410077,\"default\":518669807,\"scaleType\":\"Automatic\"},\"costs\":[{\"meterId\":\"p\"},{\"meterId\":\"ruzythqkkwhbg\"},{\"meterId\":\"vellvulnxdmnitm\"}],\"capabilities\":[{\"name\":\"tvmcly\",\"value\":\"mffhmjpddnyxfzuv\"}]},{\"name\":\"zmzqmzjqrb\",\"tier\":\"vnmdyfoeboj\",\"size\":\"pp\",\"family\":\"aohoqkpjtnq\",\"kind\":\"l\",\"locations\":[\"kdcwmqsyrilmhx\",\"qaolfylnkkbjpjv\"],\"locationInfo\":[{\"location\":\"ltm\"},{\"location\":\"wob\"},{\"location\":\"jw\"},{\"location\":\"lwyjfnqzocrdz\"}],\"requiredQuotaIds\":[\"euntgxdncaqtti\",\"koifuvnyttz\"],\"requiredFeatures\":[\"gyrihlgm\",\"behlqtxnr\",\"lkndrndpgfjodh\",\"aqotwfhipxwgsabv\"],\"capacity\":{\"minimum\":2086469129,\"maximum\":590497468,\"default\":891271107,\"scaleType\":\"None\"},\"costs\":[{\"meterId\":\"umljcirvpef\"},{\"meterId\":\"cdveititj\"},{\"meterId\":\"s\"},{\"meterId\":\"zaj\"}],\"capabilities\":[{\"name\":\"jhwjuyxx\",\"value\":\"xqvmvuay\"},{\"name\":\"uadx\",\"value\":\"xeqbwp\"},{\"name\":\"tghyksarcdr\",\"value\":\"xsl\"}]}],\"provisioningState\":\"Failed\"},\"id\":\"zladltxkpbq\",\"name\":\"v\",\"type\":\"dqqjwkrhwzdano\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ProviderHubManager manager = ProviderHubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SkuResource response = manager.skus()
            .createOrUpdateNestedResourceTypeThirdWithResponse("qggjhf", "bxrqrkijp", "uqlsdx", "qztvx", "mwwmjswenaww",
                "me",
                new SkuResourceInner().withProperties(new SkuResourceProperties()
                    .withSkuSettings(Arrays.asList(new SkuSetting().withName("qioulndhzyoeojht")
                        .withTier("lhsvidmytzlnglxp")
                        .withSize("vyoanfbcswqagywv")
                        .withFamily("igvjrktp")
                        .withKind("eukyaw")
                        .withLocations(Arrays.asList("mwhqnucsklh", "i"))
                        .withLocationInfo(Arrays.asList(new SkuLocationInfo().withLocation("tdlpbn"),
                            new SkuLocationInfo().withLocation("njg")))
                        .withRequiredQuotaIds(Arrays.asList("sv", "zfcpuoeedwjcc", "klhsyekrdrenxol", "i"))
                        .withRequiredFeatures(Arrays.asList("qbeiv"))
                        .withCapacity(new SkuSettingCapacity().withMinimum(950141294)
                            .withMaximum(94235072)
                            .withDefaultProperty(2054893353)
                            .withScaleType(SkuScaleType.MANUAL))
                        .withCosts(Arrays.asList(new SkuCost().withMeterId("rlpunytjlkesmmpa"),
                            new SkuCost().withMeterId("hubt")))
                        .withCapabilities(Arrays.asList(new SkuCapability().withName("e").withValue("niiwllbvgwz"),
                            new SkuCapability().withName("fftedousnktj").withValue("gravaqogfkbebauz")))))
                    .withProvisioningState(ProvisioningState.CREATING)),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("n", response.properties().skuSettings().get(0).name());
        Assertions.assertEquals("be", response.properties().skuSettings().get(0).tier());
        Assertions.assertEquals("gis", response.properties().skuSettings().get(0).size());
        Assertions.assertEquals("wnykdidjchlrmpw", response.properties().skuSettings().get(0).family());
        Assertions.assertEquals("ofldseacdhz", response.properties().skuSettings().get(0).kind());
        Assertions.assertEquals("brfgdrwji", response.properties().skuSettings().get(0).locations().get(0));
        Assertions.assertEquals("dqntycnawthv",
            response.properties().skuSettings().get(0).locationInfo().get(0).location());
        Assertions.assertEquals("cehokw", response.properties().skuSettings().get(0).requiredQuotaIds().get(0));
        Assertions.assertEquals("ukoila", response.properties().skuSettings().get(0).requiredFeatures().get(0));
        Assertions.assertEquals(111210342, response.properties().skuSettings().get(0).capacity().minimum());
        Assertions.assertEquals(844410077, response.properties().skuSettings().get(0).capacity().maximum());
        Assertions.assertEquals(518669807, response.properties().skuSettings().get(0).capacity().defaultProperty());
        Assertions.assertEquals(SkuScaleType.AUTOMATIC,
            response.properties().skuSettings().get(0).capacity().scaleType());
        Assertions.assertEquals("p", response.properties().skuSettings().get(0).costs().get(0).meterId());
        Assertions.assertEquals("tvmcly", response.properties().skuSettings().get(0).capabilities().get(0).name());
        Assertions.assertEquals("mffhmjpddnyxfzuv",
            response.properties().skuSettings().get(0).capabilities().get(0).value());
        Assertions.assertEquals(ProvisioningState.FAILED, response.properties().provisioningState());
    }
}
