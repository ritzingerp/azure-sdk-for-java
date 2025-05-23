// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * ldapServerType
 * 
 * The type of the LDAP server.
 */
public final class LdapServerType extends ExpandableStringEnum<LdapServerType> {
    /**
     * Static value ActiveDirectory for LdapServerType.
     */
    public static final LdapServerType ACTIVE_DIRECTORY = fromString("ActiveDirectory");

    /**
     * Static value OpenLDAP for LdapServerType.
     */
    public static final LdapServerType OPEN_LDAP = fromString("OpenLDAP");

    /**
     * Creates a new instance of LdapServerType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LdapServerType() {
    }

    /**
     * Creates or finds a LdapServerType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LdapServerType.
     */
    public static LdapServerType fromString(String name) {
        return fromString(name, LdapServerType.class);
    }

    /**
     * Gets known LdapServerType values.
     * 
     * @return known LdapServerType values.
     */
    public static Collection<LdapServerType> values() {
        return values(LdapServerType.class);
    }
}
