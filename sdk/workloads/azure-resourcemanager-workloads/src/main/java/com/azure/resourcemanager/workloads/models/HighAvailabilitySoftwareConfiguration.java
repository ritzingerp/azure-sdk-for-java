// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Gets or sets the HA software configuration.
 */
@Fluent
public final class HighAvailabilitySoftwareConfiguration
    implements JsonSerializable<HighAvailabilitySoftwareConfiguration> {
    /*
     * The fencing client id.
     */
    private String fencingClientId;

    /*
     * The fencing client id secret/password. The secret should never expire. This will be used pacemaker to start/stop
     * the cluster VMs.
     */
    private String fencingClientPassword;

    /**
     * Creates an instance of HighAvailabilitySoftwareConfiguration class.
     */
    public HighAvailabilitySoftwareConfiguration() {
    }

    /**
     * Get the fencingClientId property: The fencing client id.
     * 
     * @return the fencingClientId value.
     */
    public String fencingClientId() {
        return this.fencingClientId;
    }

    /**
     * Set the fencingClientId property: The fencing client id.
     * 
     * @param fencingClientId the fencingClientId value to set.
     * @return the HighAvailabilitySoftwareConfiguration object itself.
     */
    public HighAvailabilitySoftwareConfiguration withFencingClientId(String fencingClientId) {
        this.fencingClientId = fencingClientId;
        return this;
    }

    /**
     * Get the fencingClientPassword property: The fencing client id secret/password. The secret should never expire.
     * This will be used pacemaker to start/stop the cluster VMs.
     * 
     * @return the fencingClientPassword value.
     */
    public String fencingClientPassword() {
        return this.fencingClientPassword;
    }

    /**
     * Set the fencingClientPassword property: The fencing client id secret/password. The secret should never expire.
     * This will be used pacemaker to start/stop the cluster VMs.
     * 
     * @param fencingClientPassword the fencingClientPassword value to set.
     * @return the HighAvailabilitySoftwareConfiguration object itself.
     */
    public HighAvailabilitySoftwareConfiguration withFencingClientPassword(String fencingClientPassword) {
        this.fencingClientPassword = fencingClientPassword;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fencingClientId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property fencingClientId in model HighAvailabilitySoftwareConfiguration"));
        }
        if (fencingClientPassword() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property fencingClientPassword in model HighAvailabilitySoftwareConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HighAvailabilitySoftwareConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fencingClientId", this.fencingClientId);
        jsonWriter.writeStringField("fencingClientPassword", this.fencingClientPassword);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HighAvailabilitySoftwareConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HighAvailabilitySoftwareConfiguration if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HighAvailabilitySoftwareConfiguration.
     */
    public static HighAvailabilitySoftwareConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HighAvailabilitySoftwareConfiguration deserializedHighAvailabilitySoftwareConfiguration
                = new HighAvailabilitySoftwareConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fencingClientId".equals(fieldName)) {
                    deserializedHighAvailabilitySoftwareConfiguration.fencingClientId = reader.getString();
                } else if ("fencingClientPassword".equals(fieldName)) {
                    deserializedHighAvailabilitySoftwareConfiguration.fencingClientPassword = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHighAvailabilitySoftwareConfiguration;
        });
    }
}
