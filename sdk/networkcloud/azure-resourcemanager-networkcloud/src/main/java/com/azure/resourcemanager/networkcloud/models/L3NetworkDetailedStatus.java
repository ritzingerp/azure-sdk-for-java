// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The more detailed status of the L3 network.
 */
public final class L3NetworkDetailedStatus extends ExpandableStringEnum<L3NetworkDetailedStatus> {
    /**
     * Static value Error for L3NetworkDetailedStatus.
     */
    public static final L3NetworkDetailedStatus ERROR = fromString("Error");

    /**
     * Static value Available for L3NetworkDetailedStatus.
     */
    public static final L3NetworkDetailedStatus AVAILABLE = fromString("Available");

    /**
     * Static value Provisioning for L3NetworkDetailedStatus.
     */
    public static final L3NetworkDetailedStatus PROVISIONING = fromString("Provisioning");

    /**
     * Creates a new instance of L3NetworkDetailedStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public L3NetworkDetailedStatus() {
    }

    /**
     * Creates or finds a L3NetworkDetailedStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding L3NetworkDetailedStatus.
     */
    public static L3NetworkDetailedStatus fromString(String name) {
        return fromString(name, L3NetworkDetailedStatus.class);
    }

    /**
     * Gets known L3NetworkDetailedStatus values.
     * 
     * @return known L3NetworkDetailedStatus values.
     */
    public static Collection<L3NetworkDetailedStatus> values() {
        return values(L3NetworkDetailedStatus.class);
    }
}
