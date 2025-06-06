// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Switch cluster protection input properties.
 */
@Fluent
public final class SwitchClusterProtectionInputProperties
    implements JsonSerializable<SwitchClusterProtectionInputProperties> {
    /*
     * The unique replication protection cluster name.
     */
    private String replicationProtectionClusterName;

    /*
     * Provider specific switch protection input.
     */
    private SwitchClusterProtectionProviderSpecificInput providerSpecificDetails;

    /**
     * Creates an instance of SwitchClusterProtectionInputProperties class.
     */
    public SwitchClusterProtectionInputProperties() {
    }

    /**
     * Get the replicationProtectionClusterName property: The unique replication protection cluster name.
     * 
     * @return the replicationProtectionClusterName value.
     */
    public String replicationProtectionClusterName() {
        return this.replicationProtectionClusterName;
    }

    /**
     * Set the replicationProtectionClusterName property: The unique replication protection cluster name.
     * 
     * @param replicationProtectionClusterName the replicationProtectionClusterName value to set.
     * @return the SwitchClusterProtectionInputProperties object itself.
     */
    public SwitchClusterProtectionInputProperties
        withReplicationProtectionClusterName(String replicationProtectionClusterName) {
        this.replicationProtectionClusterName = replicationProtectionClusterName;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific switch protection input.
     * 
     * @return the providerSpecificDetails value.
     */
    public SwitchClusterProtectionProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific switch protection input.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the SwitchClusterProtectionInputProperties object itself.
     */
    public SwitchClusterProtectionInputProperties
        withProviderSpecificDetails(SwitchClusterProtectionProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("replicationProtectionClusterName", this.replicationProtectionClusterName);
        jsonWriter.writeJsonField("providerSpecificDetails", this.providerSpecificDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SwitchClusterProtectionInputProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SwitchClusterProtectionInputProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SwitchClusterProtectionInputProperties.
     */
    public static SwitchClusterProtectionInputProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SwitchClusterProtectionInputProperties deserializedSwitchClusterProtectionInputProperties
                = new SwitchClusterProtectionInputProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("replicationProtectionClusterName".equals(fieldName)) {
                    deserializedSwitchClusterProtectionInputProperties.replicationProtectionClusterName
                        = reader.getString();
                } else if ("providerSpecificDetails".equals(fieldName)) {
                    deserializedSwitchClusterProtectionInputProperties.providerSpecificDetails
                        = SwitchClusterProtectionProviderSpecificInput.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSwitchClusterProtectionInputProperties;
        });
    }
}
