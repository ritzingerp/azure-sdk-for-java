// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Service specification.
 */
@Fluent
public final class ServiceSpecification implements JsonSerializable<ServiceSpecification> {
    /*
     * Metric specification as defined by shoebox.
     */
    private List<MetricSpecificationV1> metricSpecifications;

    /**
     * Creates an instance of ServiceSpecification class.
     */
    public ServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: Metric specification as defined by shoebox.
     * 
     * @return the metricSpecifications value.
     */
    public List<MetricSpecificationV1> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Metric specification as defined by shoebox.
     * 
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecificationV1> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("metricSpecifications", this.metricSpecifications,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceSpecification if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceSpecification.
     */
    public static ServiceSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceSpecification deserializedServiceSpecification = new ServiceSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metricSpecifications".equals(fieldName)) {
                    List<MetricSpecificationV1> metricSpecifications
                        = reader.readArray(reader1 -> MetricSpecificationV1.fromJson(reader1));
                    deserializedServiceSpecification.metricSpecifications = metricSpecifications;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceSpecification;
        });
    }
}
