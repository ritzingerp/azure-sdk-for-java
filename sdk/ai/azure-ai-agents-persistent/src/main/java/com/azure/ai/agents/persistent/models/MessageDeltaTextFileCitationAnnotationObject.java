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

/**
 * Represents the data of a streamed file citation as applied to a streaming text content part.
 */
@Immutable
public final class MessageDeltaTextFileCitationAnnotationObject
    implements JsonSerializable<MessageDeltaTextFileCitationAnnotationObject> {

    /*
     * The ID of the specific file the citation is from.
     */
    @Generated
    private String fileId;

    /*
     * The specific quote in the cited file.
     */
    @Generated
    private String quote;

    /**
     * Creates an instance of MessageDeltaTextFileCitationAnnotationObject class.
     */
    @Generated
    private MessageDeltaTextFileCitationAnnotationObject() {
    }

    /**
     * Get the fileId property: The ID of the specific file the citation is from.
     *
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Get the quote property: The specific quote in the cited file.
     *
     * @return the quote value.
     */
    @Generated
    public String getQuote() {
        return this.quote;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeStringField("quote", this.quote);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaTextFileCitationAnnotationObject from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaTextFileCitationAnnotationObject if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MessageDeltaTextFileCitationAnnotationObject.
     */
    @Generated
    public static MessageDeltaTextFileCitationAnnotationObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageDeltaTextFileCitationAnnotationObject deserializedMessageDeltaTextFileCitationAnnotationObject
                = new MessageDeltaTextFileCitationAnnotationObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("file_id".equals(fieldName)) {
                    deserializedMessageDeltaTextFileCitationAnnotationObject.fileId = reader.getString();
                } else if ("quote".equals(fieldName)) {
                    deserializedMessageDeltaTextFileCitationAnnotationObject.quote = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMessageDeltaTextFileCitationAnnotationObject;
        });
    }
}
