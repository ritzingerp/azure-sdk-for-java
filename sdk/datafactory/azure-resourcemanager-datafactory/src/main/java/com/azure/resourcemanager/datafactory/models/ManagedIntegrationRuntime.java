// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIntegrationRuntimeTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Managed integration runtime, including managed elastic and managed dedicated integration runtimes.
 */
@Fluent
public final class ManagedIntegrationRuntime extends IntegrationRuntime {
    /*
     * Type of integration runtime.
     */
    private IntegrationRuntimeType type = IntegrationRuntimeType.MANAGED;

    /*
     * Integration runtime state, only valid for managed dedicated integration runtime.
     */
    private IntegrationRuntimeState state;

    /*
     * Managed integration runtime properties.
     */
    private ManagedIntegrationRuntimeTypeProperties innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();

    /*
     * Managed Virtual Network reference.
     */
    private ManagedVirtualNetworkReference managedVirtualNetwork;

    /**
     * Creates an instance of ManagedIntegrationRuntime class.
     */
    public ManagedIntegrationRuntime() {
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    @Override
    public IntegrationRuntimeType type() {
        return this.type;
    }

    /**
     * Get the state property: Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     * @return the state value.
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

    /**
     * Get the innerTypeProperties property: Managed integration runtime properties.
     * 
     * @return the innerTypeProperties value.
     */
    ManagedIntegrationRuntimeTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the managedVirtualNetwork property: Managed Virtual Network reference.
     * 
     * @return the managedVirtualNetwork value.
     */
    public ManagedVirtualNetworkReference managedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }

    /**
     * Set the managedVirtualNetwork property: Managed Virtual Network reference.
     * 
     * @param managedVirtualNetwork the managedVirtualNetwork value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withManagedVirtualNetwork(ManagedVirtualNetworkReference managedVirtualNetwork) {
        this.managedVirtualNetwork = managedVirtualNetwork;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedIntegrationRuntime withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Get the computeProperties property: The compute resource for managed integration runtime.
     * 
     * @return the computeProperties value.
     */
    public IntegrationRuntimeComputeProperties computeProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().computeProperties();
    }

    /**
     * Set the computeProperties property: The compute resource for managed integration runtime.
     * 
     * @param computeProperties the computeProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withComputeProperties(IntegrationRuntimeComputeProperties computeProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withComputeProperties(computeProperties);
        return this;
    }

    /**
     * Get the ssisProperties property: SSIS properties for managed integration runtime.
     * 
     * @return the ssisProperties value.
     */
    public IntegrationRuntimeSsisProperties ssisProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().ssisProperties();
    }

    /**
     * Set the ssisProperties property: SSIS properties for managed integration runtime.
     * 
     * @param ssisProperties the ssisProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withSsisProperties(IntegrationRuntimeSsisProperties ssisProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withSsisProperties(ssisProperties);
        return this;
    }

    /**
     * Get the customerVirtualNetwork property: The name of virtual network to which Azure-SSIS integration runtime will
     * join.
     * 
     * @return the customerVirtualNetwork value.
     */
    public IntegrationRuntimeCustomerVirtualNetwork customerVirtualNetwork() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().customerVirtualNetwork();
    }

    /**
     * Set the customerVirtualNetwork property: The name of virtual network to which Azure-SSIS integration runtime will
     * join.
     * 
     * @param customerVirtualNetwork the customerVirtualNetwork value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime
        withCustomerVirtualNetwork(IntegrationRuntimeCustomerVirtualNetwork customerVirtualNetwork) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ManagedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withCustomerVirtualNetwork(customerVirtualNetwork);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model ManagedIntegrationRuntime"));
        } else {
            innerTypeProperties().validate();
        }
        if (managedVirtualNetwork() != null) {
            managedVirtualNetwork().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedIntegrationRuntime.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("managedVirtualNetwork", this.managedVirtualNetwork);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIntegrationRuntime from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIntegrationRuntime if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedIntegrationRuntime.
     */
    public static ManagedIntegrationRuntime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIntegrationRuntime deserializedManagedIntegrationRuntime = new ManagedIntegrationRuntime();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedManagedIntegrationRuntime.withDescription(reader.getString());
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedManagedIntegrationRuntime.innerTypeProperties
                        = ManagedIntegrationRuntimeTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedManagedIntegrationRuntime.type = IntegrationRuntimeType.fromString(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedManagedIntegrationRuntime.state
                        = IntegrationRuntimeState.fromString(reader.getString());
                } else if ("managedVirtualNetwork".equals(fieldName)) {
                    deserializedManagedIntegrationRuntime.managedVirtualNetwork
                        = ManagedVirtualNetworkReference.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedManagedIntegrationRuntime.withAdditionalProperties(additionalProperties);

            return deserializedManagedIntegrationRuntime;
        });
    }
}
