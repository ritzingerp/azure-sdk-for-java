// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import java.util.Collection;

/** Defines App service pricing tiers. */
@Fluent
public class RuntimeStack {
    private static final AttributeCollection<RuntimeStack> COLLECTION = new AttributeCollection<>();

    /** .NET Core v2.1. */
    public static final RuntimeStack NETCORE_V2_1 = COLLECTION.addValue(new RuntimeStack("DOTNETCORE", "2.1"));

    /** .NET Core v3.1. */
    public static final RuntimeStack NETCORE_V3_1 = COLLECTION.addValue(new RuntimeStack("DOTNETCORE", "3.1"));

    /** .NET Core v8.0. */
    public static final RuntimeStack NETCORE_V8_0 = COLLECTION.addValue(new RuntimeStack("DOTNETCORE", "8.0"));

    /** .NET Core v9.0. */
    public static final RuntimeStack NETCORE_V9_0 = COLLECTION.addValue(new RuntimeStack("DOTNETCORE", "9.0"));

    /** JAVA JRE 8. */
    public static final RuntimeStack JAVA_8_JRE8 = COLLECTION.addValue(new RuntimeStack("JAVA", "8-jre8"));

    /** JAVA JAVA 11. */
    public static final RuntimeStack JAVA_11_JAVA11 = COLLECTION.addValue(new RuntimeStack("JAVA", "11-java11"));

    /** JAVA JAVA 17. */
    public static final RuntimeStack JAVA_17_JAVA17 = COLLECTION.addValue(new RuntimeStack("JAVA", "17-java17"));

    /** JAVA JAVA 21. */
    public static final RuntimeStack JAVA_21_JAVA21 = COLLECTION.addValue(new RuntimeStack("JAVA", "21-java21"));

    /** Node.JS 10.1. */
    public static final RuntimeStack NODEJS_10_1 = COLLECTION.addValue(new RuntimeStack("NODE", "10.1"));

    /** Node.JS 10.6. */
    public static final RuntimeStack NODEJS_10_6 = COLLECTION.addValue(new RuntimeStack("NODE", "10.6"));

    /** Node.JS 10.14. */
    public static final RuntimeStack NODEJS_10_14 = COLLECTION.addValue(new RuntimeStack("NODE", "10.14"));

    /** Node.JS 10 LTS. */
    public static final RuntimeStack NODEJS_10_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "10-lts"));

    /** Node.JS 12 LTS. */
    public static final RuntimeStack NODEJS_12_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "12-lts"));

    /** Node.JS 14 LTS. */
    public static final RuntimeStack NODEJS_14_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "14-lts"));

    /** Node.JS 18 LTS. */
    public static final RuntimeStack NODEJS_18_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "18-lts"));

    /** Node.JS 20 LTS. */
    public static final RuntimeStack NODEJS_20_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "20-lts"));

    /** Node.JS 22 LTS. */
    public static final RuntimeStack NODEJS_22_LTS = COLLECTION.addValue(new RuntimeStack("NODE", "22-lts"));

    /** PHP 7.2. */
    public static final RuntimeStack PHP_7_2 = COLLECTION.addValue(new RuntimeStack("PHP", "7.2"));

    /** PHP 7.3. */
    public static final RuntimeStack PHP_7_3 = COLLECTION.addValue(new RuntimeStack("PHP", "7.3"));

    /** PHP 7.4. */
    public static final RuntimeStack PHP_7_4 = COLLECTION.addValue(new RuntimeStack("PHP", "7.4"));

    /** PHP 8.2. */
    public static final RuntimeStack PHP_8_2 = COLLECTION.addValue(new RuntimeStack("PHP", "8.2"));

    /** PHP 8.3. */
    public static final RuntimeStack PHP_8_3 = COLLECTION.addValue(new RuntimeStack("PHP", "8.3"));

    /** PYTHON 3.6. */
    public static final RuntimeStack PYTHON_3_6 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.6"));

    /** PYTHON 3.7. */
    public static final RuntimeStack PYTHON_3_7 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.7"));

    /** PYTHON 3.8. */
    public static final RuntimeStack PYTHON_3_8 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.8"));

    /** PYTHON 3.9. */
    public static final RuntimeStack PYTHON_3_9 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.9"));

    /** PYTHON 3.10. */
    public static final RuntimeStack PYTHON_3_10 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.10"));

    /** PYTHON 3.11. */
    public static final RuntimeStack PYTHON_3_11 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.11"));

    /** PYTHON 3.12. */
    public static final RuntimeStack PYTHON_3_12 = COLLECTION.addValue(new RuntimeStack("PYTHON", "3.12"));

    /** RUBY 2.5. */
    public static final RuntimeStack RUBY_2_5 = COLLECTION.addValue(new RuntimeStack("RUBY", "2.5"));

    /** RUBY 2.6. */
    public static final RuntimeStack RUBY_2_6 = COLLECTION.addValue(new RuntimeStack("RUBY", "2.6"));

    /** Tomcat 8.5-java11 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_8_5_JAVA11 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "8.5-java11"));

    /** Tomcat 8.5-jre8 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_8_5_JRE8 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "8.5-jre8"));

    /** Tomcat 9.0-java21 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_9_0_JAVA21 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "9.0-java21"));

    /** Tomcat 9.0-java17 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_9_0_JAVA17 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "9.0-java17"));

    /** Tomcat 9.0-java11 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_9_0_JAVA11 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "9.0-java11"));

    /** Tomcat 9.0-jre8 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_9_0_JRE8 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "9.0-jre8"));

    /** Tomcat 10.1-java21 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_1_JAVA21
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.1-java21"));

    /** Tomcat 10.1-java17 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_1_JAVA17
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.1-java17"));

    /** Tomcat 10.1-java11 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_1_JAVA11
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.1-java11"));

    /** Tomcat 10.0-java17 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_0_JAVA17
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.0-java17"));

    /** Tomcat 10.0-java11 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_0_JAVA11
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.0-java11"));

    /** Tomcat 11.0-java11 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_11_0_JAVA11
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "11.0-java11"));

    /** Tomcat 11.0-java17 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_11_0_JAVA17
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "11.0-java17"));

    /** Tomcat 11.0-java21 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_11_0_JAVA21
        = COLLECTION.addValue(new RuntimeStack("TOMCAT", "11.0-java21"));

    /**
     * Tomcat 10.0-jre11 image with catalina root set to Azure wwwroot.
     *
     * @deprecated Use {@link #TOMCAT_10_0_JAVA11}.
     */
    @Deprecated
    // Do not add to COLLECTION
    public static final RuntimeStack TOMCAT_10_0_JRE11 = new RuntimeStack("TOMCAT", "10.0-jre11");

    /** Tomcat 10.0-jre8 image with catalina root set to Azure wwwroot. */
    public static final RuntimeStack TOMCAT_10_0_JRE8 = COLLECTION.addValue(new RuntimeStack("TOMCAT", "10.0-jre8"));

    /** JBOSS EAP 8-java17. */
    public static final RuntimeStack JBOSS_EAP_8_JAVA17 = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "8-java17"));

    /** JBOSS EAP 8-java11. */
    public static final RuntimeStack JBOSS_EAP_8_JAVA11 = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "8-java11"));

    /** JBOSS EAP 7.2-java8. */
    public static final RuntimeStack JBOSS_EAP_7_2_JAVA8
        = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "7.2-java8"));

    /** JBOSS EAP 7-java8. */
    public static final RuntimeStack JBOSS_EAP_7_JAVA8 = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "7-java8"));

    /** JBOSS EAP 7-java11. */
    public static final RuntimeStack JBOSS_EAP_7_JAVA11 = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "7-java11"));

    /** JBOSS EAP 7-java17. */
    public static final RuntimeStack JBOSS_EAP_7_JAVA17 = COLLECTION.addValue(new RuntimeStack("JBOSSEAP", "7-java17"));

    /** The name of the language runtime stack. */
    private final String stack;
    /** The version of the runtime. */
    private final String version;

    /**
     * Creates a custom app service runtime stack on Linux operating system.
     *
     * @param stack the name of the language stack
     * @param version the version of the runtime
     */
    public RuntimeStack(String stack, String version) {
        this.stack = stack;
        this.version = version;
    }

    /**
     * Gets the name of the language runtime stack.
     *
     * @return the name of the language runtime stack
     */
    public String stack() {
        return stack;
    }

    /**
     * Gets the version of the runtime stack.
     *
     * @return the version of the runtime stack
     */
    public String version() {
        return version;
    }

    /**
     * Lists the pre-defined app service runtime stacks.
     *
     * @return immutable collection of the pre-defined app service runtime stacks
     */
    public static Collection<RuntimeStack> getAll() {
        return COLLECTION.getAllValues();
    }

    @Override
    public String toString() {
        return stack + " " + version;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RuntimeStack)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RuntimeStack rhs = (RuntimeStack) obj;
        return toString().equalsIgnoreCase(rhs.toString());
    }
}
