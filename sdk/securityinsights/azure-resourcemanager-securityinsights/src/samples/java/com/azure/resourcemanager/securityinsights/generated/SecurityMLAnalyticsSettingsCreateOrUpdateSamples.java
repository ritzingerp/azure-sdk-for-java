// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.securityinsights.models.AnomalySecurityMLAnalyticsSettings;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.SecurityMLAnalyticsSettingsDataSource;
import com.azure.resourcemanager.securityinsights.models.SettingsStatus;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.UUID;

/**
 * Samples for SecurityMLAnalyticsSettings CreateOrUpdate.
 */
public final class SecurityMLAnalyticsSettingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * securityMLAnalyticsSettings/CreateAnomalySecurityMLAnalyticsSetting.json
     */
    /**
     * Sample code: Creates or updates a Anomaly Security ML Analytics Settings.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void createsOrUpdatesAAnomalySecurityMLAnalyticsSettings(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) throws IOException {
        manager.securityMLAnalyticsSettings()
            .createOrUpdateWithResponse("myRg", "myWorkspace", "f209187f-1d17-4431-94af-c141bf5f23db",
                new AnomalySecurityMLAnalyticsSettings().withEtag("\"260090e2-0000-0d00-0000-5d6fb8670000\"")
                    .withDescription(
                        "When account logs from a source region that has rarely been logged in from during the last 14 days, an anomaly is triggered.")
                    .withDisplayName("Login from unusual region")
                    .withEnabled(true)
                    .withRequiredDataConnectors(
                        Arrays.asList(new SecurityMLAnalyticsSettingsDataSource().withConnectorId("AWS")
                            .withDataTypes(Arrays.asList("AWSCloudTrail"))))
                    .withTactics(Arrays.asList(AttackTactic.EXFILTRATION, AttackTactic.COMMAND_AND_CONTROL))
                    .withTechniques(Arrays.asList("T1037", "T1021"))
                    .withAnomalyVersion("1.0.5")
                    .withCustomizableObservations(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize(
                            "{\"multiSelectObservations\":null,\"prioritizeExcludeObservations\":null,\"singleSelectObservations\":[{\"name\":\"Device vendor\",\"description\":\"Select device vendor of network connection logs from CommonSecurityLog\",\"rerun\":\"RerunAlways\",\"sequenceNumber\":1,\"supportedValues\":[\"Palo Alto Networks\",\"Fortinet\",\"Check Point\"],\"supportedValuesKql\":null,\"value\":[\"Palo Alto Networks\"],\"valuesKql\":null}],\"singleValueObservations\":null,\"thresholdObservations\":[{\"name\":\"Daily data transfer threshold in MB\",\"description\":\"Suppress anomalies when daily data transfered (in MB) per hour is less than the chosen value\",\"maximum\":\"100\",\"minimum\":\"1\",\"rerun\":\"RerunAlways\",\"sequenceNumber\":1,\"value\":\"25\"},{\"name\":\"Number of standard deviations\",\"description\":\"Triggers anomalies when number of standard deviations is greater than the chosen value\",\"maximum\":\"10\",\"minimum\":\"2\",\"rerun\":\"RerunAlways\",\"sequenceNumber\":2,\"value\":\"3\"}]}",
                            Object.class, SerializerEncoding.JSON))
                    .withFrequency(Duration.parse("PT1H"))
                    .withSettingsStatus(SettingsStatus.PRODUCTION)
                    .withIsDefaultSettings(true)
                    .withAnomalySettingsVersion(0)
                    .withSettingsDefinitionId(UUID.fromString("f209187f-1d17-4431-94af-c141bf5f23db")),
                com.azure.core.util.Context.NONE);
    }
}
