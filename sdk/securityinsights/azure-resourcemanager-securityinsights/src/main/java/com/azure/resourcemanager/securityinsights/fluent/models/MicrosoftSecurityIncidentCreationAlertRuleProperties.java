// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.MicrosoftSecurityIncidentCreationAlertRuleCommonProperties;
import com.azure.resourcemanager.securityinsights.models.MicrosoftSecurityProductName;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * MicrosoftSecurityIncidentCreation rule property bag.
 */
@Fluent
public final class MicrosoftSecurityIncidentCreationAlertRuleProperties
    extends MicrosoftSecurityIncidentCreationAlertRuleCommonProperties {
    /*
     * The Name of the alert rule template used to create this rule.
     */
    private String alertRuleTemplateName;

    /*
     * The description of the alert rule.
     */
    private String description;

    /*
     * The display name for alerts created by this alert rule.
     */
    private String displayName;

    /*
     * Determines whether this alert rule is enabled or disabled.
     */
    private boolean enabled;

    /*
     * The last time that this alert has been modified.
     */
    private OffsetDateTime lastModifiedUtc;

    /**
     * Creates an instance of MicrosoftSecurityIncidentCreationAlertRuleProperties class.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleProperties() {
    }

    /**
     * Get the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     * 
     * @return the alertRuleTemplateName value.
     */
    public String alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }

    /**
     * Set the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     * 
     * @param alertRuleTemplateName the alertRuleTemplateName value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleProperties object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleProperties
        withAlertRuleTemplateName(String alertRuleTemplateName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        return this;
    }

    /**
     * Get the description property: The description of the alert rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the alert rule.
     * 
     * @param description the description value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleProperties object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name for alerts created by this alert rule.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for alerts created by this alert rule.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleProperties object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the enabled property: Determines whether this alert rule is enabled or disabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this alert rule is enabled or disabled.
     * 
     * @param enabled the enabled value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleProperties object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this alert has been modified.
     * 
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftSecurityIncidentCreationAlertRuleProperties
        withDisplayNamesFilter(List<String> displayNamesFilter) {
        super.withDisplayNamesFilter(displayNamesFilter);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftSecurityIncidentCreationAlertRuleProperties
        withDisplayNamesExcludeFilter(List<String> displayNamesExcludeFilter) {
        super.withDisplayNamesExcludeFilter(displayNamesExcludeFilter);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftSecurityIncidentCreationAlertRuleProperties
        withProductFilter(MicrosoftSecurityProductName productFilter) {
        super.withProductFilter(productFilter);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftSecurityIncidentCreationAlertRuleProperties
        withSeveritiesFilter(List<AlertSeverity> severitiesFilter) {
        super.withSeveritiesFilter(severitiesFilter);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (displayName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property displayName in model MicrosoftSecurityIncidentCreationAlertRuleProperties"));
        }
        if (productFilter() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property productFilter in model MicrosoftSecurityIncidentCreationAlertRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(MicrosoftSecurityIncidentCreationAlertRuleProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("productFilter", productFilter() == null ? null : productFilter().toString());
        jsonWriter.writeArrayField("displayNamesFilter", displayNamesFilter(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("displayNamesExcludeFilter", displayNamesExcludeFilter(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("severitiesFilter", severitiesFilter(),
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("alertRuleTemplateName", this.alertRuleTemplateName);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftSecurityIncidentCreationAlertRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftSecurityIncidentCreationAlertRuleProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MicrosoftSecurityIncidentCreationAlertRuleProperties.
     */
    public static MicrosoftSecurityIncidentCreationAlertRuleProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftSecurityIncidentCreationAlertRuleProperties deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties
                = new MicrosoftSecurityIncidentCreationAlertRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("productFilter".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties
                        .withProductFilter(MicrosoftSecurityProductName.fromString(reader.getString()));
                } else if ("displayNamesFilter".equals(fieldName)) {
                    List<String> displayNamesFilter = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties
                        .withDisplayNamesFilter(displayNamesFilter);
                } else if ("displayNamesExcludeFilter".equals(fieldName)) {
                    List<String> displayNamesExcludeFilter = reader.readArray(reader1 -> reader1.getString());
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties
                        .withDisplayNamesExcludeFilter(displayNamesExcludeFilter);
                } else if ("severitiesFilter".equals(fieldName)) {
                    List<AlertSeverity> severitiesFilter
                        = reader.readArray(reader1 -> AlertSeverity.fromString(reader1.getString()));
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties
                        .withSeveritiesFilter(severitiesFilter);
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties.displayName = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties.enabled = reader.getBoolean();
                } else if ("alertRuleTemplateName".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties.alertRuleTemplateName
                        = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties.description = reader.getString();
                } else if ("lastModifiedUtc".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties.lastModifiedUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMicrosoftSecurityIncidentCreationAlertRuleProperties;
        });
    }
}
