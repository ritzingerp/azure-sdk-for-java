// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanAction;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanActionDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroup;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroupType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProtectedItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItemOperation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanGroupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanGroup model = BinaryData.fromString(
            "{\"groupType\":\"Shutdown\",\"replicationProtectedItems\":[{\"id\":\"qm\",\"virtualMachineId\":\"zgwldoychillcec\"},{\"id\":\"huwaoaguhic\",\"virtualMachineId\":\"lizst\"},{\"id\":\"sjvh\",\"virtualMachineId\":\"eftkwqe\"},{\"id\":\"mvss\",\"virtualMachineId\":\"aepwamcxtcz\"}],\"startGroupActions\":[{\"actionName\":\"euknijduyyes\",\"failoverTypes\":[\"PlannedFailover\",\"UnplannedFailover\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"RecoveryToPrimary\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"c\",\"failoverTypes\":[\"RepairReplication\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"RecoveryToPrimary\",\"PrimaryToRecovery\",\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}],\"endGroupActions\":[{\"actionName\":\"ikdmhlakuflgbhga\",\"failoverTypes\":[\"DisableProtection\",\"ChangePit\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"PrimaryToRecovery\",\"RecoveryToPrimary\",\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"f\",\"failoverTypes\":[\"FinalizeFailback\",\"Failback\",\"SwitchProtection\"],\"failoverDirections\":[\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}]}")
            .toObject(RecoveryPlanGroup.class);
        Assertions.assertEquals(RecoveryPlanGroupType.SHUTDOWN, model.groupType());
        Assertions.assertEquals("qm", model.replicationProtectedItems().get(0).id());
        Assertions.assertEquals("zgwldoychillcec", model.replicationProtectedItems().get(0).virtualMachineId());
        Assertions.assertEquals("euknijduyyes", model.startGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.PLANNED_FAILOVER,
            model.startGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.startGroupActions().get(0).failoverDirections().get(0));
        Assertions.assertEquals("ikdmhlakuflgbhga", model.endGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.DISABLE_PROTECTION,
            model.endGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.endGroupActions().get(0).failoverDirections().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanGroup model = new RecoveryPlanGroup().withGroupType(RecoveryPlanGroupType.SHUTDOWN)
            .withReplicationProtectedItems(
                Arrays.asList(new RecoveryPlanProtectedItem().withId("qm").withVirtualMachineId("zgwldoychillcec"),
                    new RecoveryPlanProtectedItem().withId("huwaoaguhic").withVirtualMachineId("lizst"),
                    new RecoveryPlanProtectedItem().withId("sjvh").withVirtualMachineId("eftkwqe"),
                    new RecoveryPlanProtectedItem().withId("mvss").withVirtualMachineId("aepwamcxtcz")))
            .withStartGroupActions(Arrays.asList(
                new RecoveryPlanAction().withActionName("euknijduyyes")
                    .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.PLANNED_FAILOVER,
                        ReplicationProtectedItemOperation.UNPLANNED_FAILOVER))
                    .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                        PossibleOperationsDirections.RECOVERY_TO_PRIMARY))
                    .withCustomDetails(new RecoveryPlanActionDetails()),
                new RecoveryPlanAction().withActionName("c")
                    .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.REPAIR_REPLICATION))
                    .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                        PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                        PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
                        PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                    .withCustomDetails(new RecoveryPlanActionDetails())))
            .withEndGroupActions(Arrays.asList(
                new RecoveryPlanAction().withActionName("ikdmhlakuflgbhga")
                    .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.DISABLE_PROTECTION,
                        ReplicationProtectedItemOperation.CHANGE_PIT))
                    .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                        PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
                        PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                        PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                    .withCustomDetails(new RecoveryPlanActionDetails()),
                new RecoveryPlanAction().withActionName("f")
                    .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.FINALIZE_FAILBACK,
                        ReplicationProtectedItemOperation.FAILBACK,
                        ReplicationProtectedItemOperation.SWITCH_PROTECTION))
                    .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                    .withCustomDetails(new RecoveryPlanActionDetails())));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanGroup.class);
        Assertions.assertEquals(RecoveryPlanGroupType.SHUTDOWN, model.groupType());
        Assertions.assertEquals("qm", model.replicationProtectedItems().get(0).id());
        Assertions.assertEquals("zgwldoychillcec", model.replicationProtectedItems().get(0).virtualMachineId());
        Assertions.assertEquals("euknijduyyes", model.startGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.PLANNED_FAILOVER,
            model.startGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.startGroupActions().get(0).failoverDirections().get(0));
        Assertions.assertEquals("ikdmhlakuflgbhga", model.endGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.DISABLE_PROTECTION,
            model.endGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.endGroupActions().get(0).failoverDirections().get(0));
    }
}
