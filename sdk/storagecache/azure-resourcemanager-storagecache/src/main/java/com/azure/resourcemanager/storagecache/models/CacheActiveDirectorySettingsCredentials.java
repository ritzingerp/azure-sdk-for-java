// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Active Directory admin credentials used to join the HPC Cache to a domain.
 */
@Fluent
public final class CacheActiveDirectorySettingsCredentials
    implements JsonSerializable<CacheActiveDirectorySettingsCredentials> {
    /*
     * Username of the Active Directory domain administrator. This value is stored encrypted and not returned on
     * response.
     */
    private String username;

    /*
     * Plain text password of the Active Directory domain administrator. This value is stored encrypted and not returned
     * on response.
     */
    private String password;

    /**
     * Creates an instance of CacheActiveDirectorySettingsCredentials class.
     */
    public CacheActiveDirectorySettingsCredentials() {
    }

    /**
     * Get the username property: Username of the Active Directory domain administrator. This value is stored encrypted
     * and not returned on response.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username of the Active Directory domain administrator. This value is stored encrypted
     * and not returned on response.
     * 
     * @param username the username value to set.
     * @return the CacheActiveDirectorySettingsCredentials object itself.
     */
    public CacheActiveDirectorySettingsCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Plain text password of the Active Directory domain administrator. This value is stored
     * encrypted and not returned on response.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Plain text password of the Active Directory domain administrator. This value is stored
     * encrypted and not returned on response.
     * 
     * @param password the password value to set.
     * @return the CacheActiveDirectorySettingsCredentials object itself.
     */
    public CacheActiveDirectorySettingsCredentials withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property username in model CacheActiveDirectorySettingsCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CacheActiveDirectorySettingsCredentials.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CacheActiveDirectorySettingsCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CacheActiveDirectorySettingsCredentials if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CacheActiveDirectorySettingsCredentials.
     */
    public static CacheActiveDirectorySettingsCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CacheActiveDirectorySettingsCredentials deserializedCacheActiveDirectorySettingsCredentials
                = new CacheActiveDirectorySettingsCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("username".equals(fieldName)) {
                    deserializedCacheActiveDirectorySettingsCredentials.username = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedCacheActiveDirectorySettingsCredentials.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCacheActiveDirectorySettingsCredentials;
        });
    }
}
