// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devtestlabs.models.GalleryImageReference;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties of a gallery image.
 */
@Fluent
public final class GalleryImageProperties implements JsonSerializable<GalleryImageProperties> {
    /*
     * The author of the gallery image.
     */
    private String author;

    /*
     * The creation date of the gallery image.
     */
    private OffsetDateTime createdDate;

    /*
     * The description of the gallery image.
     */
    private String description;

    /*
     * The image reference of the gallery image.
     */
    private GalleryImageReference imageReference;

    /*
     * The icon of the gallery image.
     */
    private String icon;

    /*
     * Indicates whether this gallery image is enabled.
     */
    private Boolean enabled;

    /*
     * The third party plan that applies to this image
     */
    private String planId;

    /*
     * Indicates if the plan has been authorized for programmatic deployment.
     */
    private Boolean isPlanAuthorized;

    /**
     * Creates an instance of GalleryImageProperties class.
     */
    public GalleryImageProperties() {
    }

    /**
     * Get the author property: The author of the gallery image.
     * 
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: The author of the gallery image.
     * 
     * @param author the author value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the gallery image.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the description property: The description of the gallery image.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the gallery image.
     * 
     * @param description the description value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the imageReference property: The image reference of the gallery image.
     * 
     * @return the imageReference value.
     */
    public GalleryImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: The image reference of the gallery image.
     * 
     * @param imageReference the imageReference value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withImageReference(GalleryImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the icon property: The icon of the gallery image.
     * 
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Set the icon property: The icon of the gallery image.
     * 
     * @param icon the icon value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this gallery image is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this gallery image is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the planId property: The third party plan that applies to this image.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: The third party plan that applies to this image.
     * 
     * @param planId the planId value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     * 
     * @return the isPlanAuthorized value.
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     * 
     * @param isPlanAuthorized the isPlanAuthorized value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("author", this.author);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeJsonField("imageReference", this.imageReference);
        jsonWriter.writeStringField("icon", this.icon);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("planId", this.planId);
        jsonWriter.writeBooleanField("isPlanAuthorized", this.isPlanAuthorized);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryImageProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryImageProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GalleryImageProperties.
     */
    public static GalleryImageProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryImageProperties deserializedGalleryImageProperties = new GalleryImageProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("author".equals(fieldName)) {
                    deserializedGalleryImageProperties.author = reader.getString();
                } else if ("createdDate".equals(fieldName)) {
                    deserializedGalleryImageProperties.createdDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    deserializedGalleryImageProperties.description = reader.getString();
                } else if ("imageReference".equals(fieldName)) {
                    deserializedGalleryImageProperties.imageReference = GalleryImageReference.fromJson(reader);
                } else if ("icon".equals(fieldName)) {
                    deserializedGalleryImageProperties.icon = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedGalleryImageProperties.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("planId".equals(fieldName)) {
                    deserializedGalleryImageProperties.planId = reader.getString();
                } else if ("isPlanAuthorized".equals(fieldName)) {
                    deserializedGalleryImageProperties.isPlanAuthorized = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryImageProperties;
        });
    }
}
