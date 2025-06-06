// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dell.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * EncryptionProperties of Dell FileSystem resource.
 */
@Fluent
public final class EncryptionProperties implements JsonSerializable<EncryptionProperties> {
    /*
     * Encryption Type - MMK/CMK
     */
    private ResourceEncryptionType encryptionType;

    /*
     * Versioned Encryption Key Url - Only when user opts for CMK and hence optional
     */
    private String keyUrl;

    /*
     * Identity configuration for Customer-managed key settings defining which identity should be used to auth to Key
     * Vault - Only when user opts for CMK and hence optional
     */
    private EncryptionIdentityProperties encryptionIdentityProperties;

    /**
     * Creates an instance of EncryptionProperties class.
     */
    public EncryptionProperties() {
    }

    /**
     * Get the encryptionType property: Encryption Type - MMK/CMK.
     * 
     * @return the encryptionType value.
     */
    public ResourceEncryptionType encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: Encryption Type - MMK/CMK.
     * 
     * @param encryptionType the encryptionType value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withEncryptionType(ResourceEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Get the keyUrl property: Versioned Encryption Key Url - Only when user opts for CMK and hence optional.
     * 
     * @return the keyUrl value.
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl property: Versioned Encryption Key Url - Only when user opts for CMK and hence optional.
     * 
     * @param keyUrl the keyUrl value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

    /**
     * Get the encryptionIdentityProperties property: Identity configuration for Customer-managed key settings defining
     * which identity should be used to auth to Key Vault - Only when user opts for CMK and hence optional.
     * 
     * @return the encryptionIdentityProperties value.
     */
    public EncryptionIdentityProperties encryptionIdentityProperties() {
        return this.encryptionIdentityProperties;
    }

    /**
     * Set the encryptionIdentityProperties property: Identity configuration for Customer-managed key settings defining
     * which identity should be used to auth to Key Vault - Only when user opts for CMK and hence optional.
     * 
     * @param encryptionIdentityProperties the encryptionIdentityProperties value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties
        withEncryptionIdentityProperties(EncryptionIdentityProperties encryptionIdentityProperties) {
        this.encryptionIdentityProperties = encryptionIdentityProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryptionType in model EncryptionProperties"));
        }
        if (encryptionIdentityProperties() != null) {
            encryptionIdentityProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("encryptionType",
            this.encryptionType == null ? null : this.encryptionType.toString());
        jsonWriter.writeStringField("keyUrl", this.keyUrl);
        jsonWriter.writeJsonField("encryptionIdentityProperties", this.encryptionIdentityProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EncryptionProperties.
     */
    public static EncryptionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionProperties deserializedEncryptionProperties = new EncryptionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("encryptionType".equals(fieldName)) {
                    deserializedEncryptionProperties.encryptionType
                        = ResourceEncryptionType.fromString(reader.getString());
                } else if ("keyUrl".equals(fieldName)) {
                    deserializedEncryptionProperties.keyUrl = reader.getString();
                } else if ("encryptionIdentityProperties".equals(fieldName)) {
                    deserializedEncryptionProperties.encryptionIdentityProperties
                        = EncryptionIdentityProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionProperties;
        });
    }
}
