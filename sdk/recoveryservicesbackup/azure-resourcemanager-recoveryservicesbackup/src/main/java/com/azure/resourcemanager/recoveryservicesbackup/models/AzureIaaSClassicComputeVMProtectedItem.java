// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * IaaS VM workload-specific backup item representing the Classic Compute VM.
 */
@Fluent
public final class AzureIaaSClassicComputeVMProtectedItem extends AzureIaaSvmProtectedItem {
    /*
     * backup item type.
     */
    private String protectedItemType = "Microsoft.ClassicCompute/virtualMachines";

    /**
     * Creates an instance of AzureIaaSClassicComputeVMProtectedItem class.
     */
    public AzureIaaSClassicComputeVMProtectedItem() {
    }

    /**
     * Get the protectedItemType property: backup item type.
     * 
     * @return the protectedItemType value.
     */
    @Override
    public String protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withProtectionStatus(String protectionStatus) {
        super.withProtectionStatus(protectionStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withHealthDetails(List<AzureIaaSvmHealthDetails> healthDetails) {
        super.withHealthDetails(healthDetails);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withKpisHealths(Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withLastBackupStatus(String lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withExtendedInfo(AzureIaaSvmProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withExtendedProperties(ExtendedProperties extendedProperties) {
        super.withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem
        withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem
        withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem
        withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withPolicyName(String policyName) {
        super.withPolicyName(policyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMProtectedItem withSoftDeleteRetentionPeriod(Integer softDeleteRetentionPeriod) {
        super.withSoftDeleteRetentionPeriod(softDeleteRetentionPeriod);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (healthDetails() != null) {
            healthDetails().forEach(e -> e.validate());
        }
        if (kpisHealths() != null) {
            kpisHealths().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
        if (extendedProperties() != null) {
            extendedProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("containerName", containerName());
        jsonWriter.writeStringField("sourceResourceId", sourceResourceId());
        jsonWriter.writeStringField("policyId", policyId());
        jsonWriter.writeStringField("lastRecoveryPoint",
            lastRecoveryPoint() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(lastRecoveryPoint()));
        jsonWriter.writeStringField("backupSetName", backupSetName());
        jsonWriter.writeStringField("createMode", createMode() == null ? null : createMode().toString());
        jsonWriter.writeStringField("deferredDeleteTimeInUTC",
            deferredDeleteTimeInUtc() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(deferredDeleteTimeInUtc()));
        jsonWriter.writeBooleanField("isScheduledForDeferredDelete", isScheduledForDeferredDelete());
        jsonWriter.writeStringField("deferredDeleteTimeRemaining", deferredDeleteTimeRemaining());
        jsonWriter.writeBooleanField("isDeferredDeleteScheduleUpcoming", isDeferredDeleteScheduleUpcoming());
        jsonWriter.writeBooleanField("isRehydrate", isRehydrate());
        jsonWriter.writeArrayField("resourceGuardOperationRequests", resourceGuardOperationRequests(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("isArchiveEnabled", isArchiveEnabled());
        jsonWriter.writeStringField("policyName", policyName());
        jsonWriter.writeNumberField("softDeleteRetentionPeriodInDays", softDeleteRetentionPeriod());
        jsonWriter.writeStringField("protectionStatus", protectionStatus());
        jsonWriter.writeStringField("protectionState", protectionState() == null ? null : protectionState().toString());
        jsonWriter.writeArrayField("healthDetails", healthDetails(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("kpisHealths", kpisHealths(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("lastBackupStatus", lastBackupStatus());
        jsonWriter.writeJsonField("extendedInfo", extendedInfo());
        jsonWriter.writeJsonField("extendedProperties", extendedProperties());
        jsonWriter.writeStringField("protectedItemType", this.protectedItemType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureIaaSClassicComputeVMProtectedItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureIaaSClassicComputeVMProtectedItem if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureIaaSClassicComputeVMProtectedItem.
     */
    public static AzureIaaSClassicComputeVMProtectedItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureIaaSClassicComputeVMProtectedItem deserializedAzureIaaSClassicComputeVMProtectedItem
                = new AzureIaaSClassicComputeVMProtectedItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupManagementType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withBackupManagementType(BackupManagementType.fromString(reader.getString()));
                } else if ("workloadType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withWorkloadType(DataSourceType.fromString(reader.getString()));
                } else if ("containerName".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withContainerName(reader.getString());
                } else if ("sourceResourceId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withSourceResourceId(reader.getString());
                } else if ("policyId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withPolicyId(reader.getString());
                } else if ("lastRecoveryPoint".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withLastRecoveryPoint(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("backupSetName".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withBackupSetName(reader.getString());
                } else if ("createMode".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withCreateMode(CreateMode.fromString(reader.getString()));
                } else if ("deferredDeleteTimeInUTC".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withDeferredDeleteTimeInUtc(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("isScheduledForDeferredDelete".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withIsScheduledForDeferredDelete(reader.getNullable(JsonReader::getBoolean));
                } else if ("deferredDeleteTimeRemaining".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withDeferredDeleteTimeRemaining(reader.getString());
                } else if ("isDeferredDeleteScheduleUpcoming".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withIsDeferredDeleteScheduleUpcoming(reader.getNullable(JsonReader::getBoolean));
                } else if ("isRehydrate".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withIsRehydrate(reader.getNullable(JsonReader::getBoolean));
                } else if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withResourceGuardOperationRequests(resourceGuardOperationRequests);
                } else if ("isArchiveEnabled".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withIsArchiveEnabled(reader.getNullable(JsonReader::getBoolean));
                } else if ("policyName".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withPolicyName(reader.getString());
                } else if ("softDeleteRetentionPeriodInDays".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withSoftDeleteRetentionPeriod(reader.getNullable(JsonReader::getInt));
                } else if ("vaultId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withVaultId(reader.getString());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withFriendlyName(reader.getString());
                } else if ("virtualMachineId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withVirtualMachineId(reader.getString());
                } else if ("protectionStatus".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withProtectionStatus(reader.getString());
                } else if ("protectionState".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withProtectionState(ProtectionState.fromString(reader.getString()));
                } else if ("healthStatus".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withHealthStatus(HealthStatus.fromString(reader.getString()));
                } else if ("healthDetails".equals(fieldName)) {
                    List<AzureIaaSvmHealthDetails> healthDetails
                        = reader.readArray(reader1 -> AzureIaaSvmHealthDetails.fromJson(reader1));
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withHealthDetails(healthDetails);
                } else if ("kpisHealths".equals(fieldName)) {
                    Map<String, KpiResourceHealthDetails> kpisHealths
                        = reader.readMap(reader1 -> KpiResourceHealthDetails.fromJson(reader1));
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withKpisHealths(kpisHealths);
                } else if ("lastBackupStatus".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withLastBackupStatus(reader.getString());
                } else if ("lastBackupTime".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withLastBackupTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("protectedItemDataId".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withProtectedItemDataId(reader.getString());
                } else if ("extendedInfo".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withExtendedInfo(AzureIaaSvmProtectedItemExtendedInfo.fromJson(reader));
                } else if ("extendedProperties".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem
                        .withExtendedProperties(ExtendedProperties.fromJson(reader));
                } else if ("policyType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.withPolicyType(reader.getString());
                } else if ("protectedItemType".equals(fieldName)) {
                    deserializedAzureIaaSClassicComputeVMProtectedItem.protectedItemType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureIaaSClassicComputeVMProtectedItem;
        });
    }
}
