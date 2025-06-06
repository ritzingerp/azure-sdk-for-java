// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.resourcemanager.automation.fluent.models.DeletedAutomationAccountListResultInner;
import com.azure.resourcemanager.automation.models.DeletedAutomationAccount;
import com.azure.resourcemanager.automation.models.DeletedAutomationAccountListResult;
import java.util.Collections;
import java.util.List;

public final class DeletedAutomationAccountListResultImpl implements DeletedAutomationAccountListResult {
    private DeletedAutomationAccountListResultInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    DeletedAutomationAccountListResultImpl(DeletedAutomationAccountListResultInner innerObject,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DeletedAutomationAccount> value() {
        List<DeletedAutomationAccount> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DeletedAutomationAccountListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
