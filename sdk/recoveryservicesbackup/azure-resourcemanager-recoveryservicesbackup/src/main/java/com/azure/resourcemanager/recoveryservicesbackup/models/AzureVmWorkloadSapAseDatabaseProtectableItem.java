// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure VM workload-specific protectable item representing SAP ASE Database.
 */
@Fluent
public final class AzureVmWorkloadSapAseDatabaseProtectableItem extends AzureVmWorkloadProtectableItem {
    /*
     * Type of the backup item.
     */
    private String protectableItemType = "SAPAseDatabase";

    /**
     * Creates an instance of AzureVmWorkloadSapAseDatabaseProtectableItem class.
     */
    public AzureVmWorkloadSapAseDatabaseProtectableItem() {
    }

    /**
     * Get the protectableItemType property: Type of the backup item.
     * 
     * @return the protectableItemType value.
     */
    @Override
    public String protectableItemType() {
        return this.protectableItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem
        withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withIsProtectable(Boolean isProtectable) {
        super.withIsProtectable(isProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (prebackupvalidation() != null) {
            prebackupvalidation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("backupManagementType", backupManagementType());
        jsonWriter.writeStringField("workloadType", workloadType());
        jsonWriter.writeStringField("friendlyName", friendlyName());
        jsonWriter.writeStringField("protectionState", protectionState() == null ? null : protectionState().toString());
        jsonWriter.writeStringField("parentName", parentName());
        jsonWriter.writeStringField("parentUniqueName", parentUniqueName());
        jsonWriter.writeStringField("serverName", serverName());
        jsonWriter.writeBooleanField("isAutoProtectable", isAutoProtectable());
        jsonWriter.writeBooleanField("isAutoProtected", isAutoProtected());
        jsonWriter.writeNumberField("subinquireditemcount", subinquireditemcount());
        jsonWriter.writeNumberField("subprotectableitemcount", subprotectableitemcount());
        jsonWriter.writeJsonField("prebackupvalidation", prebackupvalidation());
        jsonWriter.writeBooleanField("isProtectable", isProtectable());
        jsonWriter.writeStringField("protectableItemType", this.protectableItemType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureVmWorkloadSapAseDatabaseProtectableItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureVmWorkloadSapAseDatabaseProtectableItem if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureVmWorkloadSapAseDatabaseProtectableItem.
     */
    public static AzureVmWorkloadSapAseDatabaseProtectableItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureVmWorkloadSapAseDatabaseProtectableItem deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                = new AzureVmWorkloadSapAseDatabaseProtectableItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupManagementType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withBackupManagementType(reader.getString());
                } else if ("workloadType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.withWorkloadType(reader.getString());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.withFriendlyName(reader.getString());
                } else if ("protectionState".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withProtectionState(ProtectionStatus.fromString(reader.getString()));
                } else if ("parentName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.withParentName(reader.getString());
                } else if ("parentUniqueName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.withParentUniqueName(reader.getString());
                } else if ("serverName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.withServerName(reader.getString());
                } else if ("isAutoProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withIsAutoProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("isAutoProtected".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withIsAutoProtected(reader.getNullable(JsonReader::getBoolean));
                } else if ("subinquireditemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withSubinquireditemcount(reader.getNullable(JsonReader::getInt));
                } else if ("subprotectableitemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withSubprotectableitemcount(reader.getNullable(JsonReader::getInt));
                } else if ("prebackupvalidation".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withPrebackupvalidation(PreBackupValidation.fromJson(reader));
                } else if ("isProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem
                        .withIsProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("protectableItemType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapAseDatabaseProtectableItem.protectableItemType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureVmWorkloadSapAseDatabaseProtectableItem;
        });
    }
}
