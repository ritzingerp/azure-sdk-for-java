// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Boolean Enum. Example- True/False.
 */
public final class BooleanEnumProperty extends ExpandableStringEnum<BooleanEnumProperty> {
    /**
     * Static value True for BooleanEnumProperty.
     */
    public static final BooleanEnumProperty TRUE = fromString("True");

    /**
     * Static value False for BooleanEnumProperty.
     */
    public static final BooleanEnumProperty FALSE = fromString("False");

    /**
     * Creates a new instance of BooleanEnumProperty value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BooleanEnumProperty() {
    }

    /**
     * Creates or finds a BooleanEnumProperty from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BooleanEnumProperty.
     */
    public static BooleanEnumProperty fromString(String name) {
        return fromString(name, BooleanEnumProperty.class);
    }

    /**
     * Gets known BooleanEnumProperty values.
     * 
     * @return known BooleanEnumProperty values.
     */
    public static Collection<BooleanEnumProperty> values() {
        return values(BooleanEnumProperty.class);
    }
}
