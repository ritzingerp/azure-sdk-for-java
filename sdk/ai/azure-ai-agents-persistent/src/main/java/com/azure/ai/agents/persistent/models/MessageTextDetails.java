// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The text and associated annotations for a single item of agent thread message content.
 */
@Immutable
public final class MessageTextDetails implements JsonSerializable<MessageTextDetails> {

    /*
     * The text data.
     */
    @Generated
    private final String value;

    /*
     * A list of annotations associated with this text.
     */
    @Generated
    private final List<MessageTextAnnotation> annotations;

    /**
     * Creates an instance of MessageTextDetails class.
     *
     * @param value the value value to set.
     * @param annotations the annotations value to set.
     */
    @Generated
    private MessageTextDetails(String value, List<MessageTextAnnotation> annotations) {
        this.value = value;
        this.annotations = annotations;
    }

    /**
     * Get the value property: The text data.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Get the annotations property: A list of annotations associated with this text.
     *
     * @return the annotations value.
     */
    @Generated
    public List<MessageTextAnnotation> getAnnotations() {
        return this.annotations;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeArrayField("annotations", this.annotations, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageTextDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageTextDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageTextDetails.
     */
    @Generated
    public static MessageTextDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String value = null;
            List<MessageTextAnnotation> annotations = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("value".equals(fieldName)) {
                    value = reader.getString();
                } else if ("annotations".equals(fieldName)) {
                    annotations = reader.readArray(reader1 -> MessageTextAnnotation.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageTextDetails(value, annotations);
        });
    }
}
