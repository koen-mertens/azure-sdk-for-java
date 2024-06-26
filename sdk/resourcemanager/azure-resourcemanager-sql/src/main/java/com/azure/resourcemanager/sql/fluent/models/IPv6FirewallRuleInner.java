// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ProxyResourceWithWritableName;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An IPv6 server firewall rule. */
@Fluent
public final class IPv6FirewallRuleInner extends ProxyResourceWithWritableName {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private IPv6ServerFirewallRuleProperties innerProperties;

    /** Creates an instance of IPv6FirewallRuleInner class. */
    public IPv6FirewallRuleInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private IPv6ServerFirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public IPv6FirewallRuleInner withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Get the startIPv6Address property: The start IP address of the firewall rule. Must be IPv6 format.
     *
     * @return the startIPv6Address value.
     */
    public String startIPv6Address() {
        return this.innerProperties() == null ? null : this.innerProperties().startIPv6Address();
    }

    /**
     * Set the startIPv6Address property: The start IP address of the firewall rule. Must be IPv6 format.
     *
     * @param startIPv6Address the startIPv6Address value to set.
     * @return the IPv6FirewallRuleInner object itself.
     */
    public IPv6FirewallRuleInner withStartIPv6Address(String startIPv6Address) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IPv6ServerFirewallRuleProperties();
        }
        this.innerProperties().withStartIPv6Address(startIPv6Address);
        return this;
    }

    /**
     * Get the endIPv6Address property: The end IP address of the firewall rule. Must be IPv6 format. Must be greater
     * than or equal to startIpAddress.
     *
     * @return the endIPv6Address value.
     */
    public String endIPv6Address() {
        return this.innerProperties() == null ? null : this.innerProperties().endIPv6Address();
    }

    /**
     * Set the endIPv6Address property: The end IP address of the firewall rule. Must be IPv6 format. Must be greater
     * than or equal to startIpAddress.
     *
     * @param endIPv6Address the endIPv6Address value to set.
     * @return the IPv6FirewallRuleInner object itself.
     */
    public IPv6FirewallRuleInner withEndIPv6Address(String endIPv6Address) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IPv6ServerFirewallRuleProperties();
        }
        this.innerProperties().withEndIPv6Address(endIPv6Address);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
