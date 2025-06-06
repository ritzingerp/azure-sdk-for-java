// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.WorkflowModelInner;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Task model.
 */
@Fluent
public final class TaskModel implements JsonSerializable<TaskModel> {
    /*
     * Gets or sets the task name.
     */
    private String taskName;

    /*
     * Gets or sets the task state.
     */
    private TaskState state;

    /*
     * Gets or sets the start time.
     */
    private OffsetDateTime startTime;

    /*
     * Gets or sets the end time.
     */
    private OffsetDateTime endTime;

    /*
     * Task model custom properties.
     */
    private TaskModelCustomProperties customProperties;

    /*
     * Gets or sets the list of children workflow models.
     */
    private List<WorkflowModelInner> childrenWorkflows;

    /**
     * Creates an instance of TaskModel class.
     */
    public TaskModel() {
    }

    /**
     * Get the taskName property: Gets or sets the task name.
     * 
     * @return the taskName value.
     */
    public String taskName() {
        return this.taskName;
    }

    /**
     * Get the state property: Gets or sets the task state.
     * 
     * @return the state value.
     */
    public TaskState state() {
        return this.state;
    }

    /**
     * Get the startTime property: Gets or sets the start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: Gets or sets the end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the customProperties property: Task model custom properties.
     * 
     * @return the customProperties value.
     */
    public TaskModelCustomProperties customProperties() {
        return this.customProperties;
    }

    /**
     * Set the customProperties property: Task model custom properties.
     * 
     * @param customProperties the customProperties value to set.
     * @return the TaskModel object itself.
     */
    public TaskModel withCustomProperties(TaskModelCustomProperties customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Get the childrenWorkflows property: Gets or sets the list of children workflow models.
     * 
     * @return the childrenWorkflows value.
     */
    public List<WorkflowModelInner> childrenWorkflows() {
        return this.childrenWorkflows;
    }

    /**
     * Set the childrenWorkflows property: Gets or sets the list of children workflow models.
     * 
     * @param childrenWorkflows the childrenWorkflows value to set.
     * @return the TaskModel object itself.
     */
    public TaskModel withChildrenWorkflows(List<WorkflowModelInner> childrenWorkflows) {
        this.childrenWorkflows = childrenWorkflows;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customProperties() != null) {
            customProperties().validate();
        }
        if (childrenWorkflows() != null) {
            childrenWorkflows().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("customProperties", this.customProperties);
        jsonWriter.writeArrayField("childrenWorkflows", this.childrenWorkflows,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TaskModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TaskModel if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the TaskModel.
     */
    public static TaskModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TaskModel deserializedTaskModel = new TaskModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("taskName".equals(fieldName)) {
                    deserializedTaskModel.taskName = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedTaskModel.state = TaskState.fromString(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedTaskModel.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedTaskModel.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("customProperties".equals(fieldName)) {
                    deserializedTaskModel.customProperties = TaskModelCustomProperties.fromJson(reader);
                } else if ("childrenWorkflows".equals(fieldName)) {
                    List<WorkflowModelInner> childrenWorkflows
                        = reader.readArray(reader1 -> WorkflowModelInner.fromJson(reader1));
                    deserializedTaskModel.childrenWorkflows = childrenWorkflows;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTaskModel;
        });
    }
}
