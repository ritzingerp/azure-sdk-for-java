// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for PeeringLocationsKind.
 */
public final class PeeringLocationsKind extends ExpandableStringEnum<PeeringLocationsKind> {
    /**
     * Static value Direct for PeeringLocationsKind.
     */
    public static final PeeringLocationsKind DIRECT = fromString("Direct");

    /**
     * Static value Exchange for PeeringLocationsKind.
     */
    public static final PeeringLocationsKind EXCHANGE = fromString("Exchange");

    /**
     * Creates a new instance of PeeringLocationsKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PeeringLocationsKind() {
    }

    /**
     * Creates or finds a PeeringLocationsKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PeeringLocationsKind.
     */
    public static PeeringLocationsKind fromString(String name) {
        return fromString(name, PeeringLocationsKind.class);
    }

    /**
     * Gets known PeeringLocationsKind values.
     * 
     * @return known PeeringLocationsKind values.
     */
    public static Collection<PeeringLocationsKind> values() {
        return values(PeeringLocationsKind.class);
    }
}
