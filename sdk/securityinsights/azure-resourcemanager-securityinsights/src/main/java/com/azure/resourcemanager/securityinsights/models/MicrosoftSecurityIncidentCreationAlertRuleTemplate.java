// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleTemplateInner;
import com.azure.resourcemanager.securityinsights.fluent.models.MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represents MicrosoftSecurityIncidentCreation rule template.
 */
@Fluent
public final class MicrosoftSecurityIncidentCreationAlertRuleTemplate extends AlertRuleTemplateInner {
    /*
     * The alert rule kind
     */
    private AlertRuleKind kind = AlertRuleKind.MICROSOFT_SECURITY_INCIDENT_CREATION;

    /*
     * MicrosoftSecurityIncidentCreation rule template properties
     */
    private MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of MicrosoftSecurityIncidentCreationAlertRuleTemplate class.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate() {
    }

    /**
     * Get the kind property: The alert rule kind.
     * 
     * @return the kind value.
     */
    @Override
    public AlertRuleKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: MicrosoftSecurityIncidentCreation rule template properties.
     * 
     * @return the innerProperties value.
     */
    private MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
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
     * Get the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     * 
     * @return the alertRulesCreatedByTemplateCount value.
     */
    public Integer alertRulesCreatedByTemplateCount() {
        return this.innerProperties() == null ? null : this.innerProperties().alertRulesCreatedByTemplateCount();
    }

    /**
     * Set the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     * 
     * @param alertRulesCreatedByTemplateCount the alertRulesCreatedByTemplateCount value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate
        withAlertRulesCreatedByTemplateCount(Integer alertRulesCreatedByTemplateCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withAlertRulesCreatedByTemplateCount(alertRulesCreatedByTemplateCount);
        return this;
    }

    /**
     * Get the createdDateUtc property: The time that this alert rule template has been added.
     * 
     * @return the createdDateUtc value.
     */
    public OffsetDateTime createdDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateUtc();
    }

    /**
     * Get the lastUpdatedDateUtc property: The time that this alert rule template was last updated.
     * 
     * @return the lastUpdatedDateUtc value.
     */
    public OffsetDateTime lastUpdatedDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedDateUtc();
    }

    /**
     * Get the description property: The description of the alert rule template.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the alert rule template.
     * 
     * @param description the description value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the displayName property: The display name for alert rule template.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for alert rule template.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the requiredDataConnectors property: The required data connectors for this template.
     * 
     * @return the requiredDataConnectors value.
     */
    public List<AlertRuleTemplateDataSource> requiredDataConnectors() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredDataConnectors();
    }

    /**
     * Set the requiredDataConnectors property: The required data connectors for this template.
     * 
     * @param requiredDataConnectors the requiredDataConnectors value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate
        withRequiredDataConnectors(List<AlertRuleTemplateDataSource> requiredDataConnectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withRequiredDataConnectors(requiredDataConnectors);
        return this;
    }

    /**
     * Get the status property: The alert rule template status.
     * 
     * @return the status value.
     */
    public TemplateStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The alert rule template status.
     * 
     * @param status the status value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate withStatus(TemplateStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the displayNamesFilter property: the alerts' displayNames on which the cases will be generated.
     * 
     * @return the displayNamesFilter value.
     */
    public List<String> displayNamesFilter() {
        return this.innerProperties() == null ? null : this.innerProperties().displayNamesFilter();
    }

    /**
     * Set the displayNamesFilter property: the alerts' displayNames on which the cases will be generated.
     * 
     * @param displayNamesFilter the displayNamesFilter value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate withDisplayNamesFilter(List<String> displayNamesFilter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withDisplayNamesFilter(displayNamesFilter);
        return this;
    }

    /**
     * Get the displayNamesExcludeFilter property: the alerts' displayNames on which the cases will not be generated.
     * 
     * @return the displayNamesExcludeFilter value.
     */
    public List<String> displayNamesExcludeFilter() {
        return this.innerProperties() == null ? null : this.innerProperties().displayNamesExcludeFilter();
    }

    /**
     * Set the displayNamesExcludeFilter property: the alerts' displayNames on which the cases will not be generated.
     * 
     * @param displayNamesExcludeFilter the displayNamesExcludeFilter value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate
        withDisplayNamesExcludeFilter(List<String> displayNamesExcludeFilter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withDisplayNamesExcludeFilter(displayNamesExcludeFilter);
        return this;
    }

    /**
     * Get the productFilter property: The alerts' productName on which the cases will be generated.
     * 
     * @return the productFilter value.
     */
    public MicrosoftSecurityProductName productFilter() {
        return this.innerProperties() == null ? null : this.innerProperties().productFilter();
    }

    /**
     * Set the productFilter property: The alerts' productName on which the cases will be generated.
     * 
     * @param productFilter the productFilter value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate
        withProductFilter(MicrosoftSecurityProductName productFilter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withProductFilter(productFilter);
        return this;
    }

    /**
     * Get the severitiesFilter property: the alerts' severities on which the cases will be generated.
     * 
     * @return the severitiesFilter value.
     */
    public List<AlertSeverity> severitiesFilter() {
        return this.innerProperties() == null ? null : this.innerProperties().severitiesFilter();
    }

    /**
     * Set the severitiesFilter property: the alerts' severities on which the cases will be generated.
     * 
     * @param severitiesFilter the severitiesFilter value to set.
     * @return the MicrosoftSecurityIncidentCreationAlertRuleTemplate object itself.
     */
    public MicrosoftSecurityIncidentCreationAlertRuleTemplate
        withSeveritiesFilter(List<AlertSeverity> severitiesFilter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties();
        }
        this.innerProperties().withSeveritiesFilter(severitiesFilter);
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
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftSecurityIncidentCreationAlertRuleTemplate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftSecurityIncidentCreationAlertRuleTemplate if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MicrosoftSecurityIncidentCreationAlertRuleTemplate.
     */
    public static MicrosoftSecurityIncidentCreationAlertRuleTemplate fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftSecurityIncidentCreationAlertRuleTemplate deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate
                = new MicrosoftSecurityIncidentCreationAlertRuleTemplate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.systemData
                        = SystemData.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.kind
                        = AlertRuleKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate.innerProperties
                        = MicrosoftSecurityIncidentCreationAlertRuleTemplateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMicrosoftSecurityIncidentCreationAlertRuleTemplate;
        });
    }
}
