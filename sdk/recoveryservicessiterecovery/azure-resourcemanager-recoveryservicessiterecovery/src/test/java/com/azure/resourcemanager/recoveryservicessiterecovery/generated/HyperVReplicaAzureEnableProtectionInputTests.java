// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskAccountType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureDiskInputDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureEnableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LicenseType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LinuxLicenseType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SecurityConfiguration;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SecurityProfileProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SecurityType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SqlServerLicenseType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaAzureEnableProtectionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaAzureEnableProtectionInput model = BinaryData.fromString(
            "{\"instanceType\":\"HyperVReplicaAzure\",\"hvHostVmId\":\"qiynez\",\"vmName\":\"lln\",\"osType\":\"iiwv\",\"userSelectedOSName\":\"umxpymdj\",\"vhdId\":\"axroqvqpilrgunc\",\"targetStorageAccountId\":\"lduwzorxsb\",\"targetAzureNetworkId\":\"aqklxy\",\"targetAzureSubnetId\":\"kqv\",\"enableRdpOnTargetOption\":\"epdxcltuubwyvpj\",\"targetAzureVmName\":\"wcpjqduqgi\",\"logStorageAccountId\":\"xkydfbwlja\",\"disksToInclude\":[\"erkjddv\",\"gliegftcvbiif\",\"ksdwgdnk\"],\"targetAzureV1ResourceGroupId\":\"gmwdh\",\"targetAzureV2ResourceGroupId\":\"buvczldbglzoutb\",\"useManagedDisks\":\"qgz\",\"targetAvailabilitySetId\":\"ajclyzgsnorbjg\",\"targetAvailabilityZone\":\"zjotvmrxkhlo\",\"licenseType\":\"NoLicenseType\",\"sqlServerLicenseType\":\"PAYG\",\"linuxLicenseType\":\"NoLicenseType\",\"targetVmSecurityProfile\":{\"targetVmSecurityType\":\"ConfidentialVM\",\"targetVmSecureBoot\":\"Enabled\",\"targetVmTpm\":\"Enabled\",\"targetVmMonitoring\":\"Disabled\",\"targetVmConfidentialEncryption\":\"Disabled\"},\"targetVmSize\":\"osnuudtelv\",\"targetProximityPlacementGroupId\":\"ibdrqrswhbuubpyr\",\"useManagedDisksForReplication\":\"tjoxztfw\",\"diskType\":\"StandardSSD_ZRS\",\"disksToIncludeForManagedDisks\":[{\"diskId\":\"zevjnnctag\",\"logStorageAccountId\":\"v\",\"diskType\":\"StandardSSD_LRS\",\"diskEncryptionSetId\":\"pemhzcgkrepdqhqy\",\"sectorSizeInBytes\":1873371469},{\"diskId\":\"e\",\"logStorageAccountId\":\"xqabckmzeoxi\",\"diskType\":\"PremiumV2_LRS\",\"diskEncryptionSetId\":\"eoh\",\"sectorSizeInBytes\":257838821}],\"diskEncryptionSetId\":\"puz\",\"targetVmTags\":{\"angp\":\"eezn\",\"phmsexroq\":\"bfaxyxzlbc\"},\"seedManagedDiskTags\":{\"qgpkrie\":\"ktxfvonfe\",\"kyfwnwpiwxeiicr\":\"bgnixxoww\"},\"targetManagedDiskTags\":{\"dm\":\"pk\"},\"targetNicTags\":{\"ws\":\"ijvs\",\"wrasekw\":\"gkjgya\",\"wyxqiclad\":\"fcvoinwoqar\",\"ob\":\"atdavuqmcbyms\"}}")
            .toObject(HyperVReplicaAzureEnableProtectionInput.class);
        Assertions.assertEquals("qiynez", model.hvHostVmId());
        Assertions.assertEquals("lln", model.vmName());
        Assertions.assertEquals("iiwv", model.osType());
        Assertions.assertEquals("umxpymdj", model.userSelectedOSName());
        Assertions.assertEquals("axroqvqpilrgunc", model.vhdId());
        Assertions.assertEquals("lduwzorxsb", model.targetStorageAccountId());
        Assertions.assertEquals("aqklxy", model.targetAzureNetworkId());
        Assertions.assertEquals("kqv", model.targetAzureSubnetId());
        Assertions.assertEquals("epdxcltuubwyvpj", model.enableRdpOnTargetOption());
        Assertions.assertEquals("wcpjqduqgi", model.targetAzureVmName());
        Assertions.assertEquals("xkydfbwlja", model.logStorageAccountId());
        Assertions.assertEquals("erkjddv", model.disksToInclude().get(0));
        Assertions.assertEquals("gmwdh", model.targetAzureV1ResourceGroupId());
        Assertions.assertEquals("buvczldbglzoutb", model.targetAzureV2ResourceGroupId());
        Assertions.assertEquals("qgz", model.useManagedDisks());
        Assertions.assertEquals("ajclyzgsnorbjg", model.targetAvailabilitySetId());
        Assertions.assertEquals("zjotvmrxkhlo", model.targetAvailabilityZone());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals(SqlServerLicenseType.PAYG, model.sqlServerLicenseType());
        Assertions.assertEquals(LinuxLicenseType.NO_LICENSE_TYPE, model.linuxLicenseType());
        Assertions.assertEquals(SecurityType.CONFIDENTIAL_VM, model.targetVmSecurityProfile().targetVmSecurityType());
        Assertions.assertEquals(SecurityConfiguration.ENABLED, model.targetVmSecurityProfile().targetVmSecureBoot());
        Assertions.assertEquals(SecurityConfiguration.ENABLED, model.targetVmSecurityProfile().targetVmTpm());
        Assertions.assertEquals(SecurityConfiguration.DISABLED, model.targetVmSecurityProfile().targetVmMonitoring());
        Assertions.assertEquals(SecurityConfiguration.DISABLED,
            model.targetVmSecurityProfile().targetVmConfidentialEncryption());
        Assertions.assertEquals("osnuudtelv", model.targetVmSize());
        Assertions.assertEquals("ibdrqrswhbuubpyr", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("tjoxztfw", model.useManagedDisksForReplication());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_ZRS, model.diskType());
        Assertions.assertEquals("zevjnnctag", model.disksToIncludeForManagedDisks().get(0).diskId());
        Assertions.assertEquals("v", model.disksToIncludeForManagedDisks().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS,
            model.disksToIncludeForManagedDisks().get(0).diskType());
        Assertions.assertEquals("pemhzcgkrepdqhqy", model.disksToIncludeForManagedDisks().get(0).diskEncryptionSetId());
        Assertions.assertEquals(1873371469, model.disksToIncludeForManagedDisks().get(0).sectorSizeInBytes());
        Assertions.assertEquals("puz", model.diskEncryptionSetId());
        Assertions.assertEquals("eezn", model.targetVmTags().get("angp"));
        Assertions.assertEquals("ktxfvonfe", model.seedManagedDiskTags().get("qgpkrie"));
        Assertions.assertEquals("pk", model.targetManagedDiskTags().get("dm"));
        Assertions.assertEquals("ijvs", model.targetNicTags().get("ws"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaAzureEnableProtectionInput model
            = new HyperVReplicaAzureEnableProtectionInput().withHvHostVmId("qiynez")
                .withVmName("lln")
                .withOsType("iiwv")
                .withUserSelectedOSName("umxpymdj")
                .withVhdId("axroqvqpilrgunc")
                .withTargetStorageAccountId("lduwzorxsb")
                .withTargetAzureNetworkId("aqklxy")
                .withTargetAzureSubnetId("kqv")
                .withEnableRdpOnTargetOption("epdxcltuubwyvpj")
                .withTargetAzureVmName("wcpjqduqgi")
                .withLogStorageAccountId("xkydfbwlja")
                .withDisksToInclude(Arrays.asList("erkjddv", "gliegftcvbiif", "ksdwgdnk"))
                .withTargetAzureV1ResourceGroupId("gmwdh")
                .withTargetAzureV2ResourceGroupId("buvczldbglzoutb")
                .withUseManagedDisks("qgz")
                .withTargetAvailabilitySetId("ajclyzgsnorbjg")
                .withTargetAvailabilityZone("zjotvmrxkhlo")
                .withLicenseType(LicenseType.NO_LICENSE_TYPE)
                .withSqlServerLicenseType(SqlServerLicenseType.PAYG)
                .withLinuxLicenseType(LinuxLicenseType.NO_LICENSE_TYPE)
                .withTargetVmSecurityProfile(
                    new SecurityProfileProperties().withTargetVmSecurityType(SecurityType.CONFIDENTIAL_VM)
                        .withTargetVmSecureBoot(SecurityConfiguration.ENABLED)
                        .withTargetVmTpm(SecurityConfiguration.ENABLED)
                        .withTargetVmMonitoring(SecurityConfiguration.DISABLED)
                        .withTargetVmConfidentialEncryption(SecurityConfiguration.DISABLED))
                .withTargetVmSize("osnuudtelv")
                .withTargetProximityPlacementGroupId("ibdrqrswhbuubpyr")
                .withUseManagedDisksForReplication("tjoxztfw")
                .withDiskType(DiskAccountType.STANDARD_SSD_ZRS)
                .withDisksToIncludeForManagedDisks(Arrays.asList(
                    new HyperVReplicaAzureDiskInputDetails().withDiskId("zevjnnctag")
                        .withLogStorageAccountId("v")
                        .withDiskType(DiskAccountType.STANDARD_SSD_LRS)
                        .withDiskEncryptionSetId("pemhzcgkrepdqhqy")
                        .withSectorSizeInBytes(1873371469),
                    new HyperVReplicaAzureDiskInputDetails().withDiskId("e")
                        .withLogStorageAccountId("xqabckmzeoxi")
                        .withDiskType(DiskAccountType.PREMIUM_V2_LRS)
                        .withDiskEncryptionSetId("eoh")
                        .withSectorSizeInBytes(257838821)))
                .withDiskEncryptionSetId("puz")
                .withTargetVmTags(mapOf("angp", "eezn", "phmsexroq", "bfaxyxzlbc"))
                .withSeedManagedDiskTags(mapOf("qgpkrie", "ktxfvonfe", "kyfwnwpiwxeiicr", "bgnixxoww"))
                .withTargetManagedDiskTags(mapOf("dm", "pk"))
                .withTargetNicTags(
                    mapOf("ws", "ijvs", "wrasekw", "gkjgya", "wyxqiclad", "fcvoinwoqar", "ob", "atdavuqmcbyms"));
        model = BinaryData.fromObject(model).toObject(HyperVReplicaAzureEnableProtectionInput.class);
        Assertions.assertEquals("qiynez", model.hvHostVmId());
        Assertions.assertEquals("lln", model.vmName());
        Assertions.assertEquals("iiwv", model.osType());
        Assertions.assertEquals("umxpymdj", model.userSelectedOSName());
        Assertions.assertEquals("axroqvqpilrgunc", model.vhdId());
        Assertions.assertEquals("lduwzorxsb", model.targetStorageAccountId());
        Assertions.assertEquals("aqklxy", model.targetAzureNetworkId());
        Assertions.assertEquals("kqv", model.targetAzureSubnetId());
        Assertions.assertEquals("epdxcltuubwyvpj", model.enableRdpOnTargetOption());
        Assertions.assertEquals("wcpjqduqgi", model.targetAzureVmName());
        Assertions.assertEquals("xkydfbwlja", model.logStorageAccountId());
        Assertions.assertEquals("erkjddv", model.disksToInclude().get(0));
        Assertions.assertEquals("gmwdh", model.targetAzureV1ResourceGroupId());
        Assertions.assertEquals("buvczldbglzoutb", model.targetAzureV2ResourceGroupId());
        Assertions.assertEquals("qgz", model.useManagedDisks());
        Assertions.assertEquals("ajclyzgsnorbjg", model.targetAvailabilitySetId());
        Assertions.assertEquals("zjotvmrxkhlo", model.targetAvailabilityZone());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals(SqlServerLicenseType.PAYG, model.sqlServerLicenseType());
        Assertions.assertEquals(LinuxLicenseType.NO_LICENSE_TYPE, model.linuxLicenseType());
        Assertions.assertEquals(SecurityType.CONFIDENTIAL_VM, model.targetVmSecurityProfile().targetVmSecurityType());
        Assertions.assertEquals(SecurityConfiguration.ENABLED, model.targetVmSecurityProfile().targetVmSecureBoot());
        Assertions.assertEquals(SecurityConfiguration.ENABLED, model.targetVmSecurityProfile().targetVmTpm());
        Assertions.assertEquals(SecurityConfiguration.DISABLED, model.targetVmSecurityProfile().targetVmMonitoring());
        Assertions.assertEquals(SecurityConfiguration.DISABLED,
            model.targetVmSecurityProfile().targetVmConfidentialEncryption());
        Assertions.assertEquals("osnuudtelv", model.targetVmSize());
        Assertions.assertEquals("ibdrqrswhbuubpyr", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("tjoxztfw", model.useManagedDisksForReplication());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_ZRS, model.diskType());
        Assertions.assertEquals("zevjnnctag", model.disksToIncludeForManagedDisks().get(0).diskId());
        Assertions.assertEquals("v", model.disksToIncludeForManagedDisks().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_SSD_LRS,
            model.disksToIncludeForManagedDisks().get(0).diskType());
        Assertions.assertEquals("pemhzcgkrepdqhqy", model.disksToIncludeForManagedDisks().get(0).diskEncryptionSetId());
        Assertions.assertEquals(1873371469, model.disksToIncludeForManagedDisks().get(0).sectorSizeInBytes());
        Assertions.assertEquals("puz", model.diskEncryptionSetId());
        Assertions.assertEquals("eezn", model.targetVmTags().get("angp"));
        Assertions.assertEquals("ktxfvonfe", model.seedManagedDiskTags().get("qgpkrie"));
        Assertions.assertEquals("pk", model.targetManagedDiskTags().get("dm"));
        Assertions.assertEquals("ijvs", model.targetNicTags().get("ws"));
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
