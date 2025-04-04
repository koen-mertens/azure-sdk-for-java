// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Authorization confirm consent code request contract.
 */
@Fluent
public final class AuthorizationConfirmConsentCodeRequestContract
    implements JsonSerializable<AuthorizationConfirmConsentCodeRequestContract> {
    /*
     * The consent code from the authorization server after authorizing and consenting.
     */
    private String consentCode;

    /**
     * Creates an instance of AuthorizationConfirmConsentCodeRequestContract class.
     */
    public AuthorizationConfirmConsentCodeRequestContract() {
    }

    /**
     * Get the consentCode property: The consent code from the authorization server after authorizing and consenting.
     * 
     * @return the consentCode value.
     */
    public String consentCode() {
        return this.consentCode;
    }

    /**
     * Set the consentCode property: The consent code from the authorization server after authorizing and consenting.
     * 
     * @param consentCode the consentCode value to set.
     * @return the AuthorizationConfirmConsentCodeRequestContract object itself.
     */
    public AuthorizationConfirmConsentCodeRequestContract withConsentCode(String consentCode) {
        this.consentCode = consentCode;
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
        jsonWriter.writeStringField("consentCode", this.consentCode);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizationConfirmConsentCodeRequestContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizationConfirmConsentCodeRequestContract if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthorizationConfirmConsentCodeRequestContract.
     */
    public static AuthorizationConfirmConsentCodeRequestContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthorizationConfirmConsentCodeRequestContract deserializedAuthorizationConfirmConsentCodeRequestContract
                = new AuthorizationConfirmConsentCodeRequestContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("consentCode".equals(fieldName)) {
                    deserializedAuthorizationConfirmConsentCodeRequestContract.consentCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthorizationConfirmConsentCodeRequestContract;
        });
    }
}
