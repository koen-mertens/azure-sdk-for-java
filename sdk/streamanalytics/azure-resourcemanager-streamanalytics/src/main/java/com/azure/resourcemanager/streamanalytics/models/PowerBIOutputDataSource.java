// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.fluent.models.PowerBIOutputDataSourceProperties;
import java.io.IOException;

/**
 * Describes a Power BI output data source.
 */
@Fluent
public final class PowerBIOutputDataSource extends OutputDataSource {
    /*
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     */
    private String type = "PowerBI";

    /*
     * The properties that are associated with a Power BI output. Required on PUT (CreateOrReplace) requests.
     */
    private PowerBIOutputDataSourceProperties innerProperties;

    /**
     * Creates an instance of PowerBIOutputDataSource class.
     */
    public PowerBIOutputDataSource() {
    }

    /**
     * Get the type property: Indicates the type of data source output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties that are associated with a Power BI output. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    PowerBIOutputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the dataset property: The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the dataset value.
     */
    public String dataset() {
        return this.innerProperties() == null ? null : this.innerProperties().dataset();
    }

    /**
     * Set the dataset property: The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     * 
     * @param dataset the dataset value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withDataset(String dataset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withDataset(dataset);
        return this;
    }

    /**
     * Get the table property: The name of the Power BI table under the specified dataset. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the table value.
     */
    public String table() {
        return this.innerProperties() == null ? null : this.innerProperties().table();
    }

    /**
     * Set the table property: The name of the Power BI table under the specified dataset. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param table the table value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTable(String table) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withTable(table);
        return this;
    }

    /**
     * Get the groupId property: The ID of the Power BI group.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: The ID of the Power BI group.
     * 
     * @param groupId the groupId value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the groupName property: The name of the Power BI group. Use this property to help remember which specific
     * Power BI group id was used.
     * 
     * @return the groupName value.
     */
    public String groupName() {
        return this.innerProperties() == null ? null : this.innerProperties().groupName();
    }

    /**
     * Set the groupName property: The name of the Power BI group. Use this property to help remember which specific
     * Power BI group id was used.
     * 
     * @param groupName the groupName value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withGroupName(String groupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withGroupName(groupName);
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationMode();
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Get the refreshToken property: A refresh token that can be used to obtain a valid access token that can then be
     * used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure
     * Portal. It is recommended to put a dummy string value here when creating the data source and then going to the
     * Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required
     * on PUT (CreateOrReplace) requests.
     * 
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshToken();
    }

    /**
     * Set the refreshToken property: A refresh token that can be used to obtain a valid access token that can then be
     * used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure
     * Portal. It is recommended to put a dummy string value here when creating the data source and then going to the
     * Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required
     * on PUT (CreateOrReplace) requests.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withRefreshToken(String refreshToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withRefreshToken(refreshToken);
        return this;
    }

    /**
     * Get the tokenUserPrincipalName property: The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @return the tokenUserPrincipalName value.
     */
    public String tokenUserPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenUserPrincipalName();
    }

    /**
     * Set the tokenUserPrincipalName property: The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @param tokenUserPrincipalName the tokenUserPrincipalName value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTokenUserPrincipalName(String tokenUserPrincipalName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withTokenUserPrincipalName(tokenUserPrincipalName);
        return this;
    }

    /**
     * Get the tokenUserDisplayName property: The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @return the tokenUserDisplayName value.
     */
    public String tokenUserDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenUserDisplayName();
    }

    /**
     * Set the tokenUserDisplayName property: The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     * @param tokenUserDisplayName the tokenUserDisplayName value to set.
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTokenUserDisplayName(String tokenUserDisplayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PowerBIOutputDataSourceProperties();
        }
        this.innerProperties().withTokenUserDisplayName(tokenUserDisplayName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PowerBIOutputDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PowerBIOutputDataSource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PowerBIOutputDataSource.
     */
    public static PowerBIOutputDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PowerBIOutputDataSource deserializedPowerBIOutputDataSource = new PowerBIOutputDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedPowerBIOutputDataSource.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPowerBIOutputDataSource.innerProperties
                        = PowerBIOutputDataSourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPowerBIOutputDataSource;
        });
    }
}
