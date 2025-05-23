// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapInner;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPropertiesDestinationsItem;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapsListResult;
import com.azure.resourcemanager.managednetworkfabric.models.PollingType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"networkPacketBrokerId\":\"mhssfnwh\",\"sourceTapRuleId\":\"ah\",\"destinations\":[{\"name\":\"knfmkc\",\"destinationType\":\"Direct\",\"destinationId\":\"dgwuzron\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"hz\"},{\"name\":\"dn\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"dcikgxk\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"fzdjekebawnxzs\"}],\"pollingType\":\"Pull\",\"configurationState\":\"Failed\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"Enabled\",\"annotation\":\"j\"},\"location\":\"iwu\",\"tags\":{\"xsqtzngxbs\":\"kakrxifqnffo\",\"citlynkwfsaang\":\"lewguxcmmhipbvs\",\"c\":\"gb\",\"cgdnxqeonmzr\":\"mhidyliuajkln\"},\"id\":\"jaojpzngdrzige\",\"name\":\"wsadsqyu\",\"type\":\"dkhwqdmohhe\"},{\"properties\":{\"networkPacketBrokerId\":\"yuunx\",\"sourceTapRuleId\":\"evyigdeipnf\",\"destinations\":[{\"name\":\"jwlii\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"jzwhajod\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"o\"},{\"name\":\"dyncradxsewbe\",\"destinationType\":\"Direct\",\"destinationId\":\"pmqnmelyksygih\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"msln\"},{\"name\":\"kqvzlbbbajdexq\",\"destinationType\":\"Direct\",\"destinationId\":\"xizbfzet\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"w\"},{\"name\":\"nbmajvvyxtvvx\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"ixbka\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"mlngfwhrm\"}],\"pollingType\":\"Pull\",\"configurationState\":\"Provisioning\",\"provisioningState\":\"Failed\",\"administrativeState\":\"Enabled\",\"annotation\":\"nrzblxna\"},\"location\":\"smfndcbsyhludzjk\",\"tags\":{\"rj\":\"ohwv\",\"urmd\":\"dvt\",\"ntjna\":\"a\"},\"id\":\"fhvqiias\",\"name\":\"twskkfkuyikmxhh\",\"type\":\"sxjbjkewrigl\"},{\"properties\":{\"networkPacketBrokerId\":\"qtrefe\",\"sourceTapRuleId\":\"flxcjffzwncvde\",\"destinations\":[{\"name\":\"n\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"jptnnt\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"jqpzj\"},{\"name\":\"pjrrhpgsjbioag\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"ehmdqvaolidxd\",\"isolationDomainProperties\":{},\"destinationTapRuleId\":\"vkjcim\"}],\"pollingType\":\"Push\",\"configurationState\":\"Accepted\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"Enabled\",\"annotation\":\"hptjlrkdcyzhimm\"},\"location\":\"tdtftmizuzjd\",\"tags\":{\"kqoyimxpggk\":\"yzcslazp\",\"qpjuytvude\":\"teagbgac\",\"ifm\":\"lpbybkisb\"},\"id\":\"glpwdjr\",\"name\":\"urfshzn\",\"type\":\"rttuhaaa\"}],\"nextLink\":\"dcdjmdkqtxfrmbe\"}")
            .toObject(NetworkTapsListResult.class);
        Assertions.assertEquals("iwu", model.value().get(0).location());
        Assertions.assertEquals("kakrxifqnffo", model.value().get(0).tags().get("xsqtzngxbs"));
        Assertions.assertEquals("mhssfnwh", model.value().get(0).networkPacketBrokerId());
        Assertions.assertEquals("knfmkc", model.value().get(0).destinations().get(0).name());
        Assertions.assertEquals(DestinationType.DIRECT, model.value().get(0).destinations().get(0).destinationType());
        Assertions.assertEquals("dgwuzron", model.value().get(0).destinations().get(0).destinationId());
        Assertions.assertEquals("hz", model.value().get(0).destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals(PollingType.PULL, model.value().get(0).pollingType());
        Assertions.assertEquals("j", model.value().get(0).annotation());
        Assertions.assertEquals("dcdjmdkqtxfrmbe", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapsListResult model = new NetworkTapsListResult().withValue(Arrays.asList(
            new NetworkTapInner().withLocation("iwu")
                .withTags(mapOf("xsqtzngxbs", "kakrxifqnffo", "citlynkwfsaang", "lewguxcmmhipbvs", "c", "gb",
                    "cgdnxqeonmzr", "mhidyliuajkln"))
                .withNetworkPacketBrokerId("mhssfnwh")
                .withDestinations(Arrays.asList(
                    new NetworkTapPropertiesDestinationsItem().withName("knfmkc")
                        .withDestinationType(DestinationType.DIRECT)
                        .withDestinationId("dgwuzron")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("hz"),
                    new NetworkTapPropertiesDestinationsItem().withName("dn")
                        .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                        .withDestinationId("dcikgxk")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("fzdjekebawnxzs")))
                .withPollingType(PollingType.PULL)
                .withAnnotation("j"),
            new NetworkTapInner().withLocation("smfndcbsyhludzjk")
                .withTags(mapOf("rj", "ohwv", "urmd", "dvt", "ntjna", "a"))
                .withNetworkPacketBrokerId("yuunx")
                .withDestinations(Arrays.asList(
                    new NetworkTapPropertiesDestinationsItem().withName("jwlii")
                        .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                        .withDestinationId("jzwhajod")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("o"),
                    new NetworkTapPropertiesDestinationsItem().withName("dyncradxsewbe")
                        .withDestinationType(DestinationType.DIRECT)
                        .withDestinationId("pmqnmelyksygih")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("msln"),
                    new NetworkTapPropertiesDestinationsItem().withName("kqvzlbbbajdexq")
                        .withDestinationType(DestinationType.DIRECT)
                        .withDestinationId("xizbfzet")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("w"),
                    new NetworkTapPropertiesDestinationsItem().withName("nbmajvvyxtvvx")
                        .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                        .withDestinationId("ixbka")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("mlngfwhrm")))
                .withPollingType(PollingType.PULL)
                .withAnnotation("nrzblxna"),
            new NetworkTapInner().withLocation("tdtftmizuzjd")
                .withTags(mapOf("kqoyimxpggk", "yzcslazp", "qpjuytvude", "teagbgac", "ifm", "lpbybkisb"))
                .withNetworkPacketBrokerId("qtrefe")
                .withDestinations(Arrays.asList(
                    new NetworkTapPropertiesDestinationsItem().withName("n")
                        .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                        .withDestinationId("jptnnt")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("jqpzj"),
                    new NetworkTapPropertiesDestinationsItem().withName("pjrrhpgsjbioag")
                        .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                        .withDestinationId("ehmdqvaolidxd")
                        .withIsolationDomainProperties(new IsolationDomainProperties())
                        .withDestinationTapRuleId("vkjcim")))
                .withPollingType(PollingType.PUSH)
                .withAnnotation("hptjlrkdcyzhimm")))
            .withNextLink("dcdjmdkqtxfrmbe");
        model = BinaryData.fromObject(model).toObject(NetworkTapsListResult.class);
        Assertions.assertEquals("iwu", model.value().get(0).location());
        Assertions.assertEquals("kakrxifqnffo", model.value().get(0).tags().get("xsqtzngxbs"));
        Assertions.assertEquals("mhssfnwh", model.value().get(0).networkPacketBrokerId());
        Assertions.assertEquals("knfmkc", model.value().get(0).destinations().get(0).name());
        Assertions.assertEquals(DestinationType.DIRECT, model.value().get(0).destinations().get(0).destinationType());
        Assertions.assertEquals("dgwuzron", model.value().get(0).destinations().get(0).destinationId());
        Assertions.assertEquals("hz", model.value().get(0).destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals(PollingType.PULL, model.value().get(0).pollingType());
        Assertions.assertEquals("j", model.value().get(0).annotation());
        Assertions.assertEquals("dcdjmdkqtxfrmbe", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
