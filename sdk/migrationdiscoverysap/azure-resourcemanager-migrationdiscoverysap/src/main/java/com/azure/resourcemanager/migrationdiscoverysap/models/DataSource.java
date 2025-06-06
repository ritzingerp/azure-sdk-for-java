// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The data source for this resource.
 */
public final class DataSource extends ExpandableStringEnum<DataSource> {
    /**
     * Static value Excel for DataSource.
     */
    public static final DataSource EXCEL = fromString("Excel");

    /**
     * Static value Native for DataSource.
     */
    public static final DataSource NATIVE = fromString("Native");

    /**
     * Creates a new instance of DataSource value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataSource() {
    }

    /**
     * Creates or finds a DataSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataSource.
     */
    public static DataSource fromString(String name) {
        return fromString(name, DataSource.class);
    }

    /**
     * Gets known DataSource values.
     * 
     * @return known DataSource values.
     */
    public static Collection<DataSource> values() {
        return values(DataSource.class);
    }
}
