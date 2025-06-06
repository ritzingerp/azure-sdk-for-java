// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An artifact.
 */
@Fluent
public final class ArtifactInner extends Resource {
    /*
     * The properties of the resource.
     */
    private ArtifactProperties innerProperties = new ArtifactProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ArtifactInner class.
     */
    public ArtifactInner() {
    }

    /**
     * Get the innerProperties property: The properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private ArtifactProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtifactInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtifactInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the title property: The artifact's title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Get the description property: The artifact's description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the publisher property: The artifact's publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Get the filePath property: The file path to the artifact.
     * 
     * @return the filePath value.
     */
    public String filePath() {
        return this.innerProperties() == null ? null : this.innerProperties().filePath();
    }

    /**
     * Get the icon property: The URI to the artifact icon.
     * 
     * @return the icon value.
     */
    public String icon() {
        return this.innerProperties() == null ? null : this.innerProperties().icon();
    }

    /**
     * Get the targetOsType property: The artifact's target OS.
     * 
     * @return the targetOsType value.
     */
    public String targetOsType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetOsType();
    }

    /**
     * Get the parameters property: The artifact's parameters.
     * 
     * @return the parameters value.
     */
    public Object parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Get the createdDate property: The artifact's creation date.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model ArtifactInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ArtifactInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArtifactInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArtifactInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ArtifactInner.
     */
    public static ArtifactInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArtifactInner deserializedArtifactInner = new ArtifactInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedArtifactInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedArtifactInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedArtifactInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedArtifactInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedArtifactInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedArtifactInner.innerProperties = ArtifactProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArtifactInner;
        });
    }
}
