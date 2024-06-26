// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.BillingPlanInformation;
import com.azure.resourcemanager.billingbenefits.models.ExtendedStatusInfo;
import com.azure.resourcemanager.billingbenefits.models.ProvisioningState;
import com.azure.resourcemanager.billingbenefits.models.Term;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Savings plan order properties. */
@Fluent
public final class SavingsPlanOrderModelProperties {
    /*
     * Display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Subscription that will be charged for purchasing the benefit
     */
    @JsonProperty(value = "billingScopeId")
    private String billingScopeId;

    /*
     * Fully-qualified identifier of the billing profile where the savings plan is applied. Present only for Field-led
     * or Customer-led customers.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * Fully-qualified identifier of the customer where the savings plan is applied. Present only for Partner-led
     * customers.
     */
    @JsonProperty(value = "customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * Fully-qualified identifier of the billing account where the savings plan is applied. Present only for Enterprise
     * Agreement customers.
     */
    @JsonProperty(value = "billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /*
     * Represent benefit term in ISO 8601 format.
     */
    @JsonProperty(value = "term")
    private Term term;

    /*
     * Represents the billing plan in ISO 8601 format. Required only for monthly billing plans.
     */
    @JsonProperty(value = "billingPlan")
    private BillingPlan billingPlan;

    /*
     * Expiry date time
     */
    @JsonProperty(value = "expiryDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryDateTime;

    /*
     * This is the DateTime when the savings plan benefit started.
     */
    @JsonProperty(value = "benefitStartTime")
    private OffsetDateTime benefitStartTime;

    /*
     * Information describing the type of billing plan for this savings plan.
     */
    @JsonProperty(value = "planInformation")
    private BillingPlanInformation planInformation;

    /*
     * The savingsPlans property.
     */
    @JsonProperty(value = "savingsPlans")
    private List<String> savingsPlans;

    /*
     * The extendedStatusInfo property.
     */
    @JsonProperty(value = "extendedStatusInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ExtendedStatusInfo extendedStatusInfo;

    /** Creates an instance of SavingsPlanOrderModelProperties class. */
    public SavingsPlanOrderModelProperties() {
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withBillingScopeId(String billingScopeId) {
        this.billingScopeId = billingScopeId;
        return this;
    }

    /**
     * Get the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied. Present only for Enterprise Agreement customers.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    public Term term() {
        return this.term;
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     *
     * @param term the term value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withTerm(Term term) {
        this.term = term;
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the expiryDateTime property: Expiry date time.
     *
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.benefitStartTime;
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withBenefitStartTime(OffsetDateTime benefitStartTime) {
        this.benefitStartTime = benefitStartTime;
        return this;
    }

    /**
     * Get the planInformation property: Information describing the type of billing plan for this savings plan.
     *
     * @return the planInformation value.
     */
    public BillingPlanInformation planInformation() {
        return this.planInformation;
    }

    /**
     * Set the planInformation property: Information describing the type of billing plan for this savings plan.
     *
     * @param planInformation the planInformation value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withPlanInformation(BillingPlanInformation planInformation) {
        this.planInformation = planInformation;
        return this;
    }

    /**
     * Get the savingsPlans property: The savingsPlans property.
     *
     * @return the savingsPlans value.
     */
    public List<String> savingsPlans() {
        return this.savingsPlans;
    }

    /**
     * Set the savingsPlans property: The savingsPlans property.
     *
     * @param savingsPlans the savingsPlans value to set.
     * @return the SavingsPlanOrderModelProperties object itself.
     */
    public SavingsPlanOrderModelProperties withSavingsPlans(List<String> savingsPlans) {
        this.savingsPlans = savingsPlans;
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The extendedStatusInfo property.
     *
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (planInformation() != null) {
            planInformation().validate();
        }
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
    }
}
