// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Bucket Access Key, Secret Key, and Expiry date and time of the key pair.
 */
@Immutable
public final class BucketGenerateCredentialsInner implements JsonSerializable<BucketGenerateCredentialsInner> {
    /*
     * The Access Key that is required along with the Secret Key to access the bucket.
     */
    private String accessKey;

    /*
     * The Secret Key that is required along with the Access Key to access the bucket.
     */
    private String secretKey;

    /*
     * The bucket's Access and Secret key pair expiry date and time (in UTC).
     */
    private OffsetDateTime keyPairExpiry;

    /**
     * Creates an instance of BucketGenerateCredentialsInner class.
     */
    public BucketGenerateCredentialsInner() {
    }

    /**
     * Get the accessKey property: The Access Key that is required along with the Secret Key to access the bucket.
     * 
     * @return the accessKey value.
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Get the secretKey property: The Secret Key that is required along with the Access Key to access the bucket.
     * 
     * @return the secretKey value.
     */
    public String secretKey() {
        return this.secretKey;
    }

    /**
     * Get the keyPairExpiry property: The bucket's Access and Secret key pair expiry date and time (in UTC).
     * 
     * @return the keyPairExpiry value.
     */
    public OffsetDateTime keyPairExpiry() {
        return this.keyPairExpiry;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BucketGenerateCredentialsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BucketGenerateCredentialsInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BucketGenerateCredentialsInner.
     */
    public static BucketGenerateCredentialsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BucketGenerateCredentialsInner deserializedBucketGenerateCredentialsInner
                = new BucketGenerateCredentialsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accessKey".equals(fieldName)) {
                    deserializedBucketGenerateCredentialsInner.accessKey = reader.getString();
                } else if ("secretKey".equals(fieldName)) {
                    deserializedBucketGenerateCredentialsInner.secretKey = reader.getString();
                } else if ("keyPairExpiry".equals(fieldName)) {
                    deserializedBucketGenerateCredentialsInner.keyPairExpiry = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBucketGenerateCredentialsInner;
        });
    }
}
