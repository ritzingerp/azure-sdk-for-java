// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerInner;
import java.io.IOException;
import java.util.List;

/**
 * Object that includes an array of Confidential Ledgers and a possible link for next set.
 */
@Fluent
public final class ConfidentialLedgerList implements JsonSerializable<ConfidentialLedgerList> {
    /*
     * List of Confidential Ledgers
     */
    private List<ConfidentialLedgerInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side paging).
     */
    private String nextLink;

    /**
     * Creates an instance of ConfidentialLedgerList class.
     */
    public ConfidentialLedgerList() {
    }

    /**
     * Get the value property: List of Confidential Ledgers.
     * 
     * @return the value value.
     */
    public List<ConfidentialLedgerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Confidential Ledgers.
     * 
     * @param value the value value to set.
     * @return the ConfidentialLedgerList object itself.
     */
    public ConfidentialLedgerList withValue(List<ConfidentialLedgerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * 
     * @param nextLink the nextLink value to set.
     * @return the ConfidentialLedgerList object itself.
     */
    public ConfidentialLedgerList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfidentialLedgerList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfidentialLedgerList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfidentialLedgerList.
     */
    public static ConfidentialLedgerList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfidentialLedgerList deserializedConfidentialLedgerList = new ConfidentialLedgerList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ConfidentialLedgerInner> value
                        = reader.readArray(reader1 -> ConfidentialLedgerInner.fromJson(reader1));
                    deserializedConfidentialLedgerList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedConfidentialLedgerList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfidentialLedgerList;
        });
    }
}
