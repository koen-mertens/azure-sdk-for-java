// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LinkedAccessCheck model.
 */
@Fluent
public final class LinkedAccessCheck implements JsonSerializable<LinkedAccessCheck> {
    /*
     * The actionName property.
     */
    private String actionName;

    /*
     * The linkedProperty property.
     */
    private String linkedProperty;

    /*
     * The linkedAction property.
     */
    private String linkedAction;

    /*
     * The linkedActionVerb property.
     */
    private String linkedActionVerb;

    /*
     * The linkedType property.
     */
    private String linkedType;

    /**
     * Creates an instance of LinkedAccessCheck class.
     */
    public LinkedAccessCheck() {
    }

    /**
     * Get the actionName property: The actionName property.
     * 
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: The actionName property.
     * 
     * @param actionName the actionName value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the linkedProperty property: The linkedProperty property.
     * 
     * @return the linkedProperty value.
     */
    public String linkedProperty() {
        return this.linkedProperty;
    }

    /**
     * Set the linkedProperty property: The linkedProperty property.
     * 
     * @param linkedProperty the linkedProperty value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedProperty(String linkedProperty) {
        this.linkedProperty = linkedProperty;
        return this;
    }

    /**
     * Get the linkedAction property: The linkedAction property.
     * 
     * @return the linkedAction value.
     */
    public String linkedAction() {
        return this.linkedAction;
    }

    /**
     * Set the linkedAction property: The linkedAction property.
     * 
     * @param linkedAction the linkedAction value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedAction(String linkedAction) {
        this.linkedAction = linkedAction;
        return this;
    }

    /**
     * Get the linkedActionVerb property: The linkedActionVerb property.
     * 
     * @return the linkedActionVerb value.
     */
    public String linkedActionVerb() {
        return this.linkedActionVerb;
    }

    /**
     * Set the linkedActionVerb property: The linkedActionVerb property.
     * 
     * @param linkedActionVerb the linkedActionVerb value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedActionVerb(String linkedActionVerb) {
        this.linkedActionVerb = linkedActionVerb;
        return this;
    }

    /**
     * Get the linkedType property: The linkedType property.
     * 
     * @return the linkedType value.
     */
    public String linkedType() {
        return this.linkedType;
    }

    /**
     * Set the linkedType property: The linkedType property.
     * 
     * @param linkedType the linkedType value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedType(String linkedType) {
        this.linkedType = linkedType;
        return this;
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
        jsonWriter.writeStringField("actionName", this.actionName);
        jsonWriter.writeStringField("linkedProperty", this.linkedProperty);
        jsonWriter.writeStringField("linkedAction", this.linkedAction);
        jsonWriter.writeStringField("linkedActionVerb", this.linkedActionVerb);
        jsonWriter.writeStringField("linkedType", this.linkedType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkedAccessCheck from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkedAccessCheck if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkedAccessCheck.
     */
    public static LinkedAccessCheck fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkedAccessCheck deserializedLinkedAccessCheck = new LinkedAccessCheck();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionName".equals(fieldName)) {
                    deserializedLinkedAccessCheck.actionName = reader.getString();
                } else if ("linkedProperty".equals(fieldName)) {
                    deserializedLinkedAccessCheck.linkedProperty = reader.getString();
                } else if ("linkedAction".equals(fieldName)) {
                    deserializedLinkedAccessCheck.linkedAction = reader.getString();
                } else if ("linkedActionVerb".equals(fieldName)) {
                    deserializedLinkedAccessCheck.linkedActionVerb = reader.getString();
                } else if ("linkedType".equals(fieldName)) {
                    deserializedLinkedAccessCheck.linkedType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkedAccessCheck;
        });
    }
}
