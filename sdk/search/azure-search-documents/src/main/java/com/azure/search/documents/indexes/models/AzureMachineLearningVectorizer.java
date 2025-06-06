// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies an Azure Machine Learning endpoint deployed via the Azure AI Foundry Model Catalog for generating the
 * vector embedding of a query string.
 */
@Fluent
public final class AzureMachineLearningVectorizer extends VectorSearchVectorizer {
    /*
     * The name of the kind of vectorization method being configured for use with vector search.
     */
    private VectorSearchVectorizerKind kind = VectorSearchVectorizerKind.AML;

    /*
     * Specifies the properties of the AML vectorizer.
     */
    private AzureMachineLearningParameters aMLParameters;

    /**
     * Creates an instance of AzureMachineLearningVectorizer class.
     * 
     * @param vectorizerName the vectorizerName value to set.
     */
    public AzureMachineLearningVectorizer(String vectorizerName) {
        super(vectorizerName);
    }

    /**
     * Get the kind property: The name of the kind of vectorization method being configured for use with vector search.
     * 
     * @return the kind value.
     */
    @Override
    public VectorSearchVectorizerKind getKind() {
        return this.kind;
    }

    /**
     * Get the aMLParameters property: Specifies the properties of the AML vectorizer.
     * 
     * @return the aMLParameters value.
     */
    public AzureMachineLearningParameters getAMLParameters() {
        return this.aMLParameters;
    }

    /**
     * Set the aMLParameters property: Specifies the properties of the AML vectorizer.
     * 
     * @param aMLParameters the aMLParameters value to set.
     * @return the AzureMachineLearningVectorizer object itself.
     */
    public AzureMachineLearningVectorizer setAMLParameters(AzureMachineLearningParameters aMLParameters) {
        this.aMLParameters = aMLParameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getVectorizerName());
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("amlParameters", this.aMLParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMachineLearningVectorizer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMachineLearningVectorizer if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureMachineLearningVectorizer.
     */
    public static AzureMachineLearningVectorizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean vectorizerNameFound = false;
            String vectorizerName = null;
            VectorSearchVectorizerKind kind = VectorSearchVectorizerKind.AML;
            AzureMachineLearningParameters aMLParameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    vectorizerName = reader.getString();
                    vectorizerNameFound = true;
                } else if ("kind".equals(fieldName)) {
                    kind = VectorSearchVectorizerKind.fromString(reader.getString());
                } else if ("amlParameters".equals(fieldName)) {
                    aMLParameters = AzureMachineLearningParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (vectorizerNameFound) {
                AzureMachineLearningVectorizer deserializedAzureMachineLearningVectorizer
                    = new AzureMachineLearningVectorizer(vectorizerName);
                deserializedAzureMachineLearningVectorizer.kind = kind;
                deserializedAzureMachineLearningVectorizer.aMLParameters = aMLParameters;

                return deserializedAzureMachineLearningVectorizer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
