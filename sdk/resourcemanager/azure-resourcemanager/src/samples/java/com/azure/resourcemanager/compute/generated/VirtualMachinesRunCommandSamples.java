// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.RunCommandInput;

/**
 * Samples for VirtualMachines RunCommand.
 */
public final class VirtualMachinesRunCommandSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-11-01/examples/runCommandExamples/
     * VirtualMachineRunCommand.json
     */
    /**
     * Sample code: VirtualMachineRunCommand.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineRunCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .runCommand("crptestar98131", "vm3036", new RunCommandInput().withCommandId("RunPowerShellScript"),
                com.azure.core.util.Context.NONE);
    }
}
