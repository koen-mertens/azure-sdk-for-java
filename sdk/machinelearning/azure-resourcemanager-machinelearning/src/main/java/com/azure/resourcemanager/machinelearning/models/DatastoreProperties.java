// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Base definition for datastore contents configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "datastoreType",
    defaultImpl = DatastoreProperties.class)
@JsonTypeName("DatastoreProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBlob", value = AzureBlobDatastore.class),
    @JsonSubTypes.Type(name = "AzureDataLakeGen1", value = AzureDataLakeGen1Datastore.class),
    @JsonSubTypes.Type(name = "AzureDataLakeGen2", value = AzureDataLakeGen2Datastore.class),
    @JsonSubTypes.Type(name = "AzureFile", value = AzureFileDatastore.class)
})
@Fluent
public class DatastoreProperties extends ResourceBase {
    /*
     * [Required] Account credentials.
     */
    @JsonProperty(value = "credentials", required = true)
    private DatastoreCredentials credentials;

    /*
     * Readonly property to indicate if datastore is the workspace default datastore
     */
    @JsonProperty(value = "isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /** Creates an instance of DatastoreProperties class. */
    public DatastoreProperties() {
    }

    /**
     * Get the credentials property: [Required] Account credentials.
     *
     * @return the credentials value.
     */
    public DatastoreCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: [Required] Account credentials.
     *
     * @param credentials the credentials value to set.
     * @return the DatastoreProperties object itself.
     */
    public DatastoreProperties withCredentials(DatastoreCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the isDefault property: Readonly property to indicate if datastore is the workspace default datastore.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /** {@inheritDoc} */
    @Override
    public DatastoreProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatastoreProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatastoreProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (credentials() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property credentials in model DatastoreProperties"));
        } else {
            credentials().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatastoreProperties.class);
}
