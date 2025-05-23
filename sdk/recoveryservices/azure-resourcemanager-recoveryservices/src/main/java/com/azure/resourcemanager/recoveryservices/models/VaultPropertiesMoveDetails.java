// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The details of the latest move operation performed on the Azure Resource.
 */
@Immutable
public final class VaultPropertiesMoveDetails implements JsonSerializable<VaultPropertiesMoveDetails> {
    /*
     * OperationId of the Resource Move Operation
     */
    private String operationId;

    /*
     * Start Time of the Resource Move Operation
     */
    private OffsetDateTime startTimeUtc;

    /*
     * End Time of the Resource Move Operation
     */
    private OffsetDateTime completionTimeUtc;

    /*
     * Source Resource of the Resource Move Operation
     */
    private String sourceResourceId;

    /*
     * Target Resource of the Resource Move Operation
     */
    private String targetResourceId;

    /**
     * Creates an instance of VaultPropertiesMoveDetails class.
     */
    public VaultPropertiesMoveDetails() {
    }

    /**
     * Get the operationId property: OperationId of the Resource Move Operation.
     * 
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the startTimeUtc property: Start Time of the Resource Move Operation.
     * 
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the completionTimeUtc property: End Time of the Resource Move Operation.
     * 
     * @return the completionTimeUtc value.
     */
    public OffsetDateTime completionTimeUtc() {
        return this.completionTimeUtc;
    }

    /**
     * Get the sourceResourceId property: Source Resource of the Resource Move Operation.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Get the targetResourceId property: Target Resource of the Resource Move Operation.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultPropertiesMoveDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultPropertiesMoveDetails if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VaultPropertiesMoveDetails.
     */
    public static VaultPropertiesMoveDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultPropertiesMoveDetails deserializedVaultPropertiesMoveDetails = new VaultPropertiesMoveDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedVaultPropertiesMoveDetails.operationId = reader.getString();
                } else if ("startTimeUtc".equals(fieldName)) {
                    deserializedVaultPropertiesMoveDetails.startTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("completionTimeUtc".equals(fieldName)) {
                    deserializedVaultPropertiesMoveDetails.completionTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sourceResourceId".equals(fieldName)) {
                    deserializedVaultPropertiesMoveDetails.sourceResourceId = reader.getString();
                } else if ("targetResourceId".equals(fieldName)) {
                    deserializedVaultPropertiesMoveDetails.targetResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultPropertiesMoveDetails;
        });
    }
}
