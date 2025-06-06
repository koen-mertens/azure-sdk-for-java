// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.StaticSite;
import java.io.IOException;
import java.util.List;

/**
 * ARM resource for a static site when patching.
 */
@Fluent
public final class StaticSitePatchResource extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    private StaticSite innerProperties;

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
     * Creates an instance of StaticSitePatchResource class.
     */
    public StaticSitePatchResource() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSite innerProperties() {
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
    public StaticSitePatchResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the defaultHostname property: The default autogenerated hostname for the static site.
     * 
     * @return the defaultHostname value.
     */
    public String defaultHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultHostname();
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     * 
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryUrl();
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     * 
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryUrl(String repositoryUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withRepositoryUrl(repositoryUrl);
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The target branch in the repository.
     * 
     * @param branch the branch value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the customDomains property: The custom domains associated with this static site.
     * 
     * @return the customDomains value.
     */
    public List<String> customDomains() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomains();
    }

    /**
     * Get the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     * 
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryToken();
    }

    /**
     * Set the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     * 
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryToken(String repositoryToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withRepositoryToken(repositoryToken);
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     * 
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().buildProperties();
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     * 
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBuildProperties(StaticSiteBuildProperties buildProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withBuildProperties(buildProperties);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the stagingEnvironmentPolicy property: State indicating whether staging environments are allowed or not
     * allowed for a static web app.
     * 
     * @return the stagingEnvironmentPolicy value.
     */
    public StagingEnvironmentPolicy stagingEnvironmentPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().stagingEnvironmentPolicy();
    }

    /**
     * Set the stagingEnvironmentPolicy property: State indicating whether staging environments are allowed or not
     * allowed for a static web app.
     * 
     * @param stagingEnvironmentPolicy the stagingEnvironmentPolicy value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withStagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withStagingEnvironmentPolicy(stagingEnvironmentPolicy);
        return this;
    }

    /**
     * Get the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked for this static
     * web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the allowConfigFileUpdates value.
     */
    public Boolean allowConfigFileUpdates() {
        return this.innerProperties() == null ? null : this.innerProperties().allowConfigFileUpdates();
    }

    /**
     * Set the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked for this static
     * web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param allowConfigFileUpdates the allowConfigFileUpdates value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withAllowConfigFileUpdates(Boolean allowConfigFileUpdates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withAllowConfigFileUpdates(allowConfigFileUpdates);
        return this;
    }

    /**
     * Get the templateProperties property: Template options for generating a new repository.
     * 
     * @return the templateProperties value.
     */
    public StaticSiteTemplateOptions templateProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().templateProperties();
    }

    /**
     * Set the templateProperties property: Template options for generating a new repository.
     * 
     * @param templateProperties the templateProperties value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withTemplateProperties(StaticSiteTemplateOptions templateProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withTemplateProperties(templateProperties);
        return this;
    }

    /**
     * Get the contentDistributionEndpoint property: The content distribution endpoint for the static site.
     * 
     * @return the contentDistributionEndpoint value.
     */
    public String contentDistributionEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().contentDistributionEndpoint();
    }

    /**
     * Get the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     * 
     * @return the keyVaultReferenceIdentity value.
     */
    public String keyVaultReferenceIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultReferenceIdentity();
    }

    /**
     * Get the userProvidedFunctionApps property: User provided function apps registered with the static site.
     * 
     * @return the userProvidedFunctionApps value.
     */
    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        return this.innerProperties() == null ? null : this.innerProperties().userProvidedFunctionApps();
    }

    /**
     * Get the linkedBackends property: Backends linked to the static side.
     * 
     * @return the linkedBackends value.
     */
    public List<StaticSiteLinkedBackend> linkedBackends() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedBackends();
    }

    /**
     * Get the provider property: The provider that submitted the last deployment to the primary environment of the
     * static site.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.innerProperties() == null ? null : this.innerProperties().provider();
    }

    /**
     * Set the provider property: The provider that submitted the last deployment to the primary environment of the
     * static site.
     * 
     * @param provider the provider value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withProvider(String provider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withProvider(provider);
        return this;
    }

    /**
     * Get the enterpriseGradeCdnStatus property: State indicating the status of the enterprise grade CDN serving
     * traffic to the static web app.
     * 
     * @return the enterpriseGradeCdnStatus value.
     */
    public EnterpriseGradeCdnStatus enterpriseGradeCdnStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().enterpriseGradeCdnStatus();
    }

    /**
     * Set the enterpriseGradeCdnStatus property: State indicating the status of the enterprise grade CDN serving
     * traffic to the static web app.
     * 
     * @param enterpriseGradeCdnStatus the enterpriseGradeCdnStatus value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withEnterpriseGradeCdnStatus(EnterpriseGradeCdnStatus enterpriseGradeCdnStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withEnterpriseGradeCdnStatus(enterpriseGradeCdnStatus);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: State indicating whether public traffic are allowed or not for a static web
     * app. Allowed Values: 'Enabled', 'Disabled' or an empty string.
     * 
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: State indicating whether public traffic are allowed or not for a static web
     * app. Allowed Values: 'Enabled', 'Disabled' or an empty string.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withPublicNetworkAccess(String publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSite();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the databaseConnections property: Database connections for the static site.
     * 
     * @return the databaseConnections value.
     */
    public List<DatabaseConnectionOverview> databaseConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseConnections();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSitePatchResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSitePatchResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSitePatchResource.
     */
    public static StaticSitePatchResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSitePatchResource deserializedStaticSitePatchResource = new StaticSitePatchResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSitePatchResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSitePatchResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSitePatchResource.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSitePatchResource.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSitePatchResource.innerProperties = StaticSite.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSitePatchResource;
        });
    }
}
