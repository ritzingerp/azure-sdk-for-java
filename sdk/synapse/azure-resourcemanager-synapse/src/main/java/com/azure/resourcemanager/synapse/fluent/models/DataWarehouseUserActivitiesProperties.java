// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User activities of a data warehouse. This currently includes the count of running or suspended queries. For more
 * information, please view the sys.dm_pdw_exec_requests dynamic management view (DMV).
 */
@Immutable
public final class DataWarehouseUserActivitiesProperties
    implements JsonSerializable<DataWarehouseUserActivitiesProperties> {
    /*
     * Count of running and suspended queries.
     */
    private Integer activeQueriesCount;

    /**
     * Creates an instance of DataWarehouseUserActivitiesProperties class.
     */
    public DataWarehouseUserActivitiesProperties() {
    }

    /**
     * Get the activeQueriesCount property: Count of running and suspended queries.
     * 
     * @return the activeQueriesCount value.
     */
    public Integer activeQueriesCount() {
        return this.activeQueriesCount;
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
     * Reads an instance of DataWarehouseUserActivitiesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataWarehouseUserActivitiesProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataWarehouseUserActivitiesProperties.
     */
    public static DataWarehouseUserActivitiesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataWarehouseUserActivitiesProperties deserializedDataWarehouseUserActivitiesProperties
                = new DataWarehouseUserActivitiesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("activeQueriesCount".equals(fieldName)) {
                    deserializedDataWarehouseUserActivitiesProperties.activeQueriesCount
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataWarehouseUserActivitiesProperties;
        });
    }
}
