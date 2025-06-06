// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for Provider specific details for policies.
 */
@Immutable
public class PolicyProviderSpecificDetails implements JsonSerializable<PolicyProviderSpecificDetails> {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "PolicyProviderSpecificDetails";

    /**
     * Creates an instance of PolicyProviderSpecificDetails class.
     */
    public PolicyProviderSpecificDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
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
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyProviderSpecificDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyProviderSpecificDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicyProviderSpecificDetails.
     */
    public static PolicyProviderSpecificDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("instanceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("A2A".equals(discriminatorValue)) {
                    return A2APolicyDetails.fromJson(readerToUse.reset());
                } else if ("HyperVReplicaAzure".equals(discriminatorValue)) {
                    return HyperVReplicaAzurePolicyDetails.fromJson(readerToUse.reset());
                } else if ("HyperVReplicaBasePolicyDetails".equals(discriminatorValue)) {
                    return HyperVReplicaBasePolicyDetails.fromJson(readerToUse.reset());
                } else if ("HyperVReplica2012R2".equals(discriminatorValue)) {
                    return HyperVReplicaBluePolicyDetails.fromJson(readerToUse.reset());
                } else if ("HyperVReplica2012".equals(discriminatorValue)) {
                    return HyperVReplicaPolicyDetails.fromJson(readerToUse.reset());
                } else if ("InMageAzureV2".equals(discriminatorValue)) {
                    return InMageAzureV2PolicyDetails.fromJson(readerToUse.reset());
                } else if ("InMageBasePolicyDetails".equals(discriminatorValue)) {
                    return InMageBasePolicyDetails.fromJson(readerToUse.reset());
                } else if ("InMage".equals(discriminatorValue)) {
                    return InMagePolicyDetails.fromJson(readerToUse.reset());
                } else if ("InMageRcmFailback".equals(discriminatorValue)) {
                    return InMageRcmFailbackPolicyDetails.fromJson(readerToUse.reset());
                } else if ("InMageRcm".equals(discriminatorValue)) {
                    return InMageRcmPolicyDetails.fromJson(readerToUse.reset());
                } else if ("VMwareCbt".equals(discriminatorValue)) {
                    return VmwareCbtPolicyDetails.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static PolicyProviderSpecificDetails fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyProviderSpecificDetails deserializedPolicyProviderSpecificDetails
                = new PolicyProviderSpecificDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedPolicyProviderSpecificDetails.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyProviderSpecificDetails;
        });
    }
}
