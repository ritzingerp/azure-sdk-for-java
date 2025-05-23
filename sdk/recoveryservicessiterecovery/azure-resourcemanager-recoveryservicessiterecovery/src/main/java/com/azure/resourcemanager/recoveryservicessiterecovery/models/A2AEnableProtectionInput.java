// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A2A enable protection input.
 */
@Fluent
public final class A2AEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /*
     * The class type.
     */
    private String instanceType = "A2A";

    /*
     * The fabric specific object Id of the virtual machine.
     */
    private String fabricObjectId;

    /*
     * The recovery container Id.
     */
    private String recoveryContainerId;

    /*
     * The recovery resource group Id. Valid for V2 scenarios.
     */
    private String recoveryResourceGroupId;

    /*
     * The recovery cloud service Id. Valid for V1 scenarios.
     */
    private String recoveryCloudServiceId;

    /*
     * The recovery availability set Id.
     */
    private String recoveryAvailabilitySetId;

    /*
     * The recovery proximity placement group Id.
     */
    private String recoveryProximityPlacementGroupId;

    /*
     * The list of vm disk details.
     */
    private List<A2AVmDiskInputDetails> vmDisks;

    /*
     * The list of vm managed disk details.
     */
    private List<A2AVmManagedDiskInputDetails> vmManagedDisks;

    /*
     * The multi vm group name.
     */
    private String multiVmGroupName;

    /*
     * The multi vm group id.
     */
    private String multiVmGroupId;

    /*
     * The replication protection cluster Id.
     */
    private String protectionClusterId;

    /*
     * The boot diagnostic storage account.
     */
    private String recoveryBootDiagStorageAccountId;

    /*
     * The recovery disk encryption information (for two pass flows).
     */
    private DiskEncryptionInfo diskEncryptionInfo;

    /*
     * The recovery availability zone.
     */
    private String recoveryAvailabilityZone;

    /*
     * The recovery extended location.
     */
    private ExtendedLocation recoveryExtendedLocation;

    /*
     * The recovery Azure virtual network ARM id.
     */
    private String recoveryAzureNetworkId;

    /*
     * The recovery subnet name.
     */
    private String recoverySubnetName;

    /*
     * The virtual machine scale set Id.
     */
    private String recoveryVirtualMachineScaleSetId;

    /*
     * The recovery capacity reservation group Id.
     */
    private String recoveryCapacityReservationGroupId;

    /*
     * A value indicating whether the auto protection is enabled.
     */
    private AutoProtectionOfDataDisk autoProtectionOfDataDisk;

    /**
     * Creates an instance of A2AEnableProtectionInput class.
     */
    public A2AEnableProtectionInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the fabricObjectId property: The fabric specific object Id of the virtual machine.
     * 
     * @return the fabricObjectId value.
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Set the fabricObjectId property: The fabric specific object Id of the virtual machine.
     * 
     * @param fabricObjectId the fabricObjectId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the recoveryContainerId property: The recovery container Id.
     * 
     * @return the recoveryContainerId value.
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recoveryContainerId property: The recovery container Id.
     * 
     * @param recoveryContainerId the recoveryContainerId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     * 
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     * 
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryCloudServiceId property: The recovery cloud service Id. Valid for V1 scenarios.
     * 
     * @return the recoveryCloudServiceId value.
     */
    public String recoveryCloudServiceId() {
        return this.recoveryCloudServiceId;
    }

    /**
     * Set the recoveryCloudServiceId property: The recovery cloud service Id. Valid for V1 scenarios.
     * 
     * @param recoveryCloudServiceId the recoveryCloudServiceId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryCloudServiceId(String recoveryCloudServiceId) {
        this.recoveryCloudServiceId = recoveryCloudServiceId;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySetId property: The recovery availability set Id.
     * 
     * @return the recoveryAvailabilitySetId value.
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recoveryAvailabilitySetId property: The recovery availability set Id.
     * 
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id.
     * 
     * @return the recoveryProximityPlacementGroupId value.
     */
    public String recoveryProximityPlacementGroupId() {
        return this.recoveryProximityPlacementGroupId;
    }

    /**
     * Set the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id.
     * 
     * @param recoveryProximityPlacementGroupId the recoveryProximityPlacementGroupId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryProximityPlacementGroupId(String recoveryProximityPlacementGroupId) {
        this.recoveryProximityPlacementGroupId = recoveryProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the vmDisks property: The list of vm disk details.
     * 
     * @return the vmDisks value.
     */
    public List<A2AVmDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of vm disk details.
     * 
     * @param vmDisks the vmDisks value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withVmDisks(List<A2AVmDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the vmManagedDisks property: The list of vm managed disk details.
     * 
     * @return the vmManagedDisks value.
     */
    public List<A2AVmManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the vmManagedDisks property: The list of vm managed disk details.
     * 
     * @param vmManagedDisks the vmManagedDisks value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withVmManagedDisks(List<A2AVmManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi vm group name.
     * 
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi vm group name.
     * 
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi vm group id.
     * 
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi vm group id.
     * 
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the protectionClusterId property: The replication protection cluster Id.
     * 
     * @return the protectionClusterId value.
     */
    public String protectionClusterId() {
        return this.protectionClusterId;
    }

    /**
     * Set the protectionClusterId property: The replication protection cluster Id.
     * 
     * @param protectionClusterId the protectionClusterId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withProtectionClusterId(String protectionClusterId) {
        this.protectionClusterId = protectionClusterId;
        return this;
    }

    /**
     * Get the recoveryBootDiagStorageAccountId property: The boot diagnostic storage account.
     * 
     * @return the recoveryBootDiagStorageAccountId value.
     */
    public String recoveryBootDiagStorageAccountId() {
        return this.recoveryBootDiagStorageAccountId;
    }

    /**
     * Set the recoveryBootDiagStorageAccountId property: The boot diagnostic storage account.
     * 
     * @param recoveryBootDiagStorageAccountId the recoveryBootDiagStorageAccountId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryBootDiagStorageAccountId(String recoveryBootDiagStorageAccountId) {
        this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     * 
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     * 
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Get the recoveryAvailabilityZone property: The recovery availability zone.
     * 
     * @return the recoveryAvailabilityZone value.
     */
    public String recoveryAvailabilityZone() {
        return this.recoveryAvailabilityZone;
    }

    /**
     * Set the recoveryAvailabilityZone property: The recovery availability zone.
     * 
     * @param recoveryAvailabilityZone the recoveryAvailabilityZone value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryAvailabilityZone(String recoveryAvailabilityZone) {
        this.recoveryAvailabilityZone = recoveryAvailabilityZone;
        return this;
    }

    /**
     * Get the recoveryExtendedLocation property: The recovery extended location.
     * 
     * @return the recoveryExtendedLocation value.
     */
    public ExtendedLocation recoveryExtendedLocation() {
        return this.recoveryExtendedLocation;
    }

    /**
     * Set the recoveryExtendedLocation property: The recovery extended location.
     * 
     * @param recoveryExtendedLocation the recoveryExtendedLocation value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryExtendedLocation(ExtendedLocation recoveryExtendedLocation) {
        this.recoveryExtendedLocation = recoveryExtendedLocation;
        return this;
    }

    /**
     * Get the recoveryAzureNetworkId property: The recovery Azure virtual network ARM id.
     * 
     * @return the recoveryAzureNetworkId value.
     */
    public String recoveryAzureNetworkId() {
        return this.recoveryAzureNetworkId;
    }

    /**
     * Set the recoveryAzureNetworkId property: The recovery Azure virtual network ARM id.
     * 
     * @param recoveryAzureNetworkId the recoveryAzureNetworkId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryAzureNetworkId(String recoveryAzureNetworkId) {
        this.recoveryAzureNetworkId = recoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the recoverySubnetName property: The recovery subnet name.
     * 
     * @return the recoverySubnetName value.
     */
    public String recoverySubnetName() {
        return this.recoverySubnetName;
    }

    /**
     * Set the recoverySubnetName property: The recovery subnet name.
     * 
     * @param recoverySubnetName the recoverySubnetName value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoverySubnetName(String recoverySubnetName) {
        this.recoverySubnetName = recoverySubnetName;
        return this;
    }

    /**
     * Get the recoveryVirtualMachineScaleSetId property: The virtual machine scale set Id.
     * 
     * @return the recoveryVirtualMachineScaleSetId value.
     */
    public String recoveryVirtualMachineScaleSetId() {
        return this.recoveryVirtualMachineScaleSetId;
    }

    /**
     * Set the recoveryVirtualMachineScaleSetId property: The virtual machine scale set Id.
     * 
     * @param recoveryVirtualMachineScaleSetId the recoveryVirtualMachineScaleSetId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryVirtualMachineScaleSetId(String recoveryVirtualMachineScaleSetId) {
        this.recoveryVirtualMachineScaleSetId = recoveryVirtualMachineScaleSetId;
        return this;
    }

    /**
     * Get the recoveryCapacityReservationGroupId property: The recovery capacity reservation group Id.
     * 
     * @return the recoveryCapacityReservationGroupId value.
     */
    public String recoveryCapacityReservationGroupId() {
        return this.recoveryCapacityReservationGroupId;
    }

    /**
     * Set the recoveryCapacityReservationGroupId property: The recovery capacity reservation group Id.
     * 
     * @param recoveryCapacityReservationGroupId the recoveryCapacityReservationGroupId value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryCapacityReservationGroupId(String recoveryCapacityReservationGroupId) {
        this.recoveryCapacityReservationGroupId = recoveryCapacityReservationGroupId;
        return this;
    }

    /**
     * Get the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     * 
     * @return the autoProtectionOfDataDisk value.
     */
    public AutoProtectionOfDataDisk autoProtectionOfDataDisk() {
        return this.autoProtectionOfDataDisk;
    }

    /**
     * Set the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     * 
     * @param autoProtectionOfDataDisk the autoProtectionOfDataDisk value to set.
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withAutoProtectionOfDataDisk(AutoProtectionOfDataDisk autoProtectionOfDataDisk) {
        this.autoProtectionOfDataDisk = autoProtectionOfDataDisk;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (fabricObjectId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property fabricObjectId in model A2AEnableProtectionInput"));
        }
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
        if (vmManagedDisks() != null) {
            vmManagedDisks().forEach(e -> e.validate());
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
        if (recoveryExtendedLocation() != null) {
            recoveryExtendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2AEnableProtectionInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fabricObjectId", this.fabricObjectId);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("recoveryContainerId", this.recoveryContainerId);
        jsonWriter.writeStringField("recoveryResourceGroupId", this.recoveryResourceGroupId);
        jsonWriter.writeStringField("recoveryCloudServiceId", this.recoveryCloudServiceId);
        jsonWriter.writeStringField("recoveryAvailabilitySetId", this.recoveryAvailabilitySetId);
        jsonWriter.writeStringField("recoveryProximityPlacementGroupId", this.recoveryProximityPlacementGroupId);
        jsonWriter.writeArrayField("vmDisks", this.vmDisks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("vmManagedDisks", this.vmManagedDisks,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("multiVmGroupName", this.multiVmGroupName);
        jsonWriter.writeStringField("multiVmGroupId", this.multiVmGroupId);
        jsonWriter.writeStringField("protectionClusterId", this.protectionClusterId);
        jsonWriter.writeStringField("recoveryBootDiagStorageAccountId", this.recoveryBootDiagStorageAccountId);
        jsonWriter.writeJsonField("diskEncryptionInfo", this.diskEncryptionInfo);
        jsonWriter.writeStringField("recoveryAvailabilityZone", this.recoveryAvailabilityZone);
        jsonWriter.writeJsonField("recoveryExtendedLocation", this.recoveryExtendedLocation);
        jsonWriter.writeStringField("recoveryAzureNetworkId", this.recoveryAzureNetworkId);
        jsonWriter.writeStringField("recoverySubnetName", this.recoverySubnetName);
        jsonWriter.writeStringField("recoveryVirtualMachineScaleSetId", this.recoveryVirtualMachineScaleSetId);
        jsonWriter.writeStringField("recoveryCapacityReservationGroupId", this.recoveryCapacityReservationGroupId);
        jsonWriter.writeStringField("autoProtectionOfDataDisk",
            this.autoProtectionOfDataDisk == null ? null : this.autoProtectionOfDataDisk.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of A2AEnableProtectionInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of A2AEnableProtectionInput if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the A2AEnableProtectionInput.
     */
    public static A2AEnableProtectionInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            A2AEnableProtectionInput deserializedA2AEnableProtectionInput = new A2AEnableProtectionInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fabricObjectId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.fabricObjectId = reader.getString();
                } else if ("instanceType".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.instanceType = reader.getString();
                } else if ("recoveryContainerId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryContainerId = reader.getString();
                } else if ("recoveryResourceGroupId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryResourceGroupId = reader.getString();
                } else if ("recoveryCloudServiceId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryCloudServiceId = reader.getString();
                } else if ("recoveryAvailabilitySetId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryAvailabilitySetId = reader.getString();
                } else if ("recoveryProximityPlacementGroupId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryProximityPlacementGroupId = reader.getString();
                } else if ("vmDisks".equals(fieldName)) {
                    List<A2AVmDiskInputDetails> vmDisks
                        = reader.readArray(reader1 -> A2AVmDiskInputDetails.fromJson(reader1));
                    deserializedA2AEnableProtectionInput.vmDisks = vmDisks;
                } else if ("vmManagedDisks".equals(fieldName)) {
                    List<A2AVmManagedDiskInputDetails> vmManagedDisks
                        = reader.readArray(reader1 -> A2AVmManagedDiskInputDetails.fromJson(reader1));
                    deserializedA2AEnableProtectionInput.vmManagedDisks = vmManagedDisks;
                } else if ("multiVmGroupName".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.multiVmGroupName = reader.getString();
                } else if ("multiVmGroupId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.multiVmGroupId = reader.getString();
                } else if ("protectionClusterId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.protectionClusterId = reader.getString();
                } else if ("recoveryBootDiagStorageAccountId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryBootDiagStorageAccountId = reader.getString();
                } else if ("diskEncryptionInfo".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.diskEncryptionInfo = DiskEncryptionInfo.fromJson(reader);
                } else if ("recoveryAvailabilityZone".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryAvailabilityZone = reader.getString();
                } else if ("recoveryExtendedLocation".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryExtendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("recoveryAzureNetworkId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryAzureNetworkId = reader.getString();
                } else if ("recoverySubnetName".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoverySubnetName = reader.getString();
                } else if ("recoveryVirtualMachineScaleSetId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryVirtualMachineScaleSetId = reader.getString();
                } else if ("recoveryCapacityReservationGroupId".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.recoveryCapacityReservationGroupId = reader.getString();
                } else if ("autoProtectionOfDataDisk".equals(fieldName)) {
                    deserializedA2AEnableProtectionInput.autoProtectionOfDataDisk
                        = AutoProtectionOfDataDisk.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedA2AEnableProtectionInput;
        });
    }
}
