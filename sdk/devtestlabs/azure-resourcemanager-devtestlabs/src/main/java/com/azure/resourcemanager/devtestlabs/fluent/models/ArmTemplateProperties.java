// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devtestlabs.models.ParametersValueFileInfo;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties of an Azure Resource Manager template.
 */
@Immutable
public final class ArmTemplateProperties implements JsonSerializable<ArmTemplateProperties> {
    /*
     * The display name of the ARM template.
     */
    private String displayName;

    /*
     * The description of the ARM template.
     */
    private String description;

    /*
     * The publisher of the ARM template.
     */
    private String publisher;

    /*
     * The URI to the icon of the ARM template.
     */
    private String icon;

    /*
     * The contents of the ARM template.
     */
    private Object contents;

    /*
     * The creation date of the armTemplate.
     */
    private OffsetDateTime createdDate;

    /*
     * File name and parameter values information from all azuredeploy.*.parameters.json for the ARM template.
     */
    private List<ParametersValueFileInfo> parametersValueFilesInfo;

    /*
     * Whether or not ARM template is enabled for use by lab user.
     */
    private Boolean enabled;

    /**
     * Creates an instance of ArmTemplateProperties class.
     */
    public ArmTemplateProperties() {
    }

    /**
     * Get the displayName property: The display name of the ARM template.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description of the ARM template.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the publisher property: The publisher of the ARM template.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Get the icon property: The URI to the icon of the ARM template.
     * 
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Get the contents property: The contents of the ARM template.
     * 
     * @return the contents value.
     */
    public Object contents() {
        return this.contents;
    }

    /**
     * Get the createdDate property: The creation date of the armTemplate.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the parametersValueFilesInfo property: File name and parameter values information from all
     * azuredeploy.*.parameters.json for the ARM template.
     * 
     * @return the parametersValueFilesInfo value.
     */
    public List<ParametersValueFileInfo> parametersValueFilesInfo() {
        return this.parametersValueFilesInfo;
    }

    /**
     * Get the enabled property: Whether or not ARM template is enabled for use by lab user.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parametersValueFilesInfo() != null) {
            parametersValueFilesInfo().forEach(e -> e.validate());
        }
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
     * Reads an instance of ArmTemplateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmTemplateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmTemplateProperties.
     */
    public static ArmTemplateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmTemplateProperties deserializedArmTemplateProperties = new ArmTemplateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedArmTemplateProperties.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedArmTemplateProperties.description = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedArmTemplateProperties.publisher = reader.getString();
                } else if ("icon".equals(fieldName)) {
                    deserializedArmTemplateProperties.icon = reader.getString();
                } else if ("contents".equals(fieldName)) {
                    deserializedArmTemplateProperties.contents = reader.readUntyped();
                } else if ("createdDate".equals(fieldName)) {
                    deserializedArmTemplateProperties.createdDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("parametersValueFilesInfo".equals(fieldName)) {
                    List<ParametersValueFileInfo> parametersValueFilesInfo
                        = reader.readArray(reader1 -> ParametersValueFileInfo.fromJson(reader1));
                    deserializedArmTemplateProperties.parametersValueFilesInfo = parametersValueFilesInfo;
                } else if ("enabled".equals(fieldName)) {
                    deserializedArmTemplateProperties.enabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmTemplateProperties;
        });
    }
}
