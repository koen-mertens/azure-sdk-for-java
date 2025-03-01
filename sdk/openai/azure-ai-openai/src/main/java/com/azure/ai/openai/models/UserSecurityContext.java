// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User security context contains several parameters that describe the AI application itself,
 * and the end user that interacts with the AI application. These fields assist your security
 * operations teams to investigate and mitigate security incidents by providing a comprehensive
 * approach to protecting your AI applications. (Learn more at https://aka.ms/TP4AI/Documentation/EndUserContext)
 * about protecting AI applications using Microsoft Defender for Cloud.
 */
@Fluent
public final class UserSecurityContext implements JsonSerializable<UserSecurityContext> {

    /*
     * The name of the application. Sensitive personal information should not be included in this field.
     */
    @Generated
    private String applicationName;

    /*
     * This identifier is the Microsoft Entra ID (formerly Azure Active Directory) user object ID used to authenticate
     * end-users within the generative AI application. Sensitive personal information should not be included in this
     * field.
     */
    @Generated
    private String endUserId;

    /*
     * The Microsoft 365 tenant ID the end user belongs to. It's required when the generative AI application is multi
     * tenant.
     */
    @Generated
    private String endUserTenantId;

    /*
     * Captures the original client's IP address, accepting both IPv4 and IPv6 formats.
     */
    @Generated
    private String sourceIp;

    /**
     * Creates an instance of UserSecurityContext class.
     */
    @Generated
    public UserSecurityContext() {
    }

    /**
     * Get the applicationName property: The name of the application. Sensitive personal information should not be
     * included in this field.
     *
     * @return the applicationName value.
     */
    @Generated
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the application. Sensitive personal information should not be
     * included in this field.
     *
     * @param applicationName the applicationName value to set.
     * @return the UserSecurityContext object itself.
     */
    @Generated
    public UserSecurityContext setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the endUserId property: This identifier is the Microsoft Entra ID (formerly Azure Active Directory) user
     * object ID used to authenticate end-users within the generative AI application. Sensitive personal information
     * should not be included in this field.
     *
     * @return the endUserId value.
     */
    @Generated
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * Set the endUserId property: This identifier is the Microsoft Entra ID (formerly Azure Active Directory) user
     * object ID used to authenticate end-users within the generative AI application. Sensitive personal information
     * should not be included in this field.
     *
     * @param endUserId the endUserId value to set.
     * @return the UserSecurityContext object itself.
     */
    @Generated
    public UserSecurityContext setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }

    /**
     * Get the endUserTenantId property: The Microsoft 365 tenant ID the end user belongs to. It's required when the
     * generative AI application is multi tenant.
     *
     * @return the endUserTenantId value.
     */
    @Generated
    public String getEndUserTenantId() {
        return this.endUserTenantId;
    }

    /**
     * Set the endUserTenantId property: The Microsoft 365 tenant ID the end user belongs to. It's required when the
     * generative AI application is multi tenant.
     *
     * @param endUserTenantId the endUserTenantId value to set.
     * @return the UserSecurityContext object itself.
     */
    @Generated
    public UserSecurityContext setEndUserTenantId(String endUserTenantId) {
        this.endUserTenantId = endUserTenantId;
        return this;
    }

    /**
     * Get the sourceIp property: Captures the original client's IP address, accepting both IPv4 and IPv6 formats.
     *
     * @return the sourceIp value.
     */
    @Generated
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * Set the sourceIp property: Captures the original client's IP address, accepting both IPv4 and IPv6 formats.
     *
     * @param sourceIp the sourceIp value to set.
     * @return the UserSecurityContext object itself.
     */
    @Generated
    public UserSecurityContext setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("application_name", this.applicationName);
        jsonWriter.writeStringField("end_user_id", this.endUserId);
        jsonWriter.writeStringField("end_user_tenant_id", this.endUserTenantId);
        jsonWriter.writeStringField("source_ip", this.sourceIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserSecurityContext from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserSecurityContext if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserSecurityContext.
     */
    @Generated
    public static UserSecurityContext fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserSecurityContext deserializedUserSecurityContext = new UserSecurityContext();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("application_name".equals(fieldName)) {
                    deserializedUserSecurityContext.applicationName = reader.getString();
                } else if ("end_user_id".equals(fieldName)) {
                    deserializedUserSecurityContext.endUserId = reader.getString();
                } else if ("end_user_tenant_id".equals(fieldName)) {
                    deserializedUserSecurityContext.endUserTenantId = reader.getString();
                } else if ("source_ip".equals(fieldName)) {
                    deserializedUserSecurityContext.sourceIp = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedUserSecurityContext;
        });
    }
}
