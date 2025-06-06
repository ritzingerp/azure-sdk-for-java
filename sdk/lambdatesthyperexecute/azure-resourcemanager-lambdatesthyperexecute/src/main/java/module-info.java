// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.lambdatesthyperexecute {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.lambdatesthyperexecute;
    exports com.azure.resourcemanager.lambdatesthyperexecute.fluent;
    exports com.azure.resourcemanager.lambdatesthyperexecute.fluent.models;
    exports com.azure.resourcemanager.lambdatesthyperexecute.models;

    opens com.azure.resourcemanager.lambdatesthyperexecute.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.lambdatesthyperexecute.models to com.azure.core;
    opens com.azure.resourcemanager.lambdatesthyperexecute.implementation.models to com.azure.core;
}
