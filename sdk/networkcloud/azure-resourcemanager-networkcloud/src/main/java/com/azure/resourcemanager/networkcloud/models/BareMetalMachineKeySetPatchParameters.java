// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetPatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** BareMetalMachineKeySetPatchParameters represents the body of the request to patch the bare metal machine key set. */
@Fluent
public final class BareMetalMachineKeySetPatchParameters {
    /*
     * BareMetalMachineKeySetPatchProperties represents the properties of bare metal machine key set that can be
     * patched.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private BareMetalMachineKeySetPatchProperties innerProperties;

    /*
     * The Azure resource tags that will replace the existing ones.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of BareMetalMachineKeySetPatchParameters class. */
    public BareMetalMachineKeySetPatchParameters() {
    }

    /**
     * Get the innerProperties property: BareMetalMachineKeySetPatchProperties represents the properties of bare metal
     * machine key set that can be patched.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private BareMetalMachineKeySetPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @param tags the tags value to set.
     * @return the BareMetalMachineKeySetPatchParameters object itself.
     */
    public BareMetalMachineKeySetPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.innerProperties() == null ? null : this.innerProperties().expiration();
    }

    /**
     * Set the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @param expiration the expiration value to set.
     * @return the BareMetalMachineKeySetPatchParameters object itself.
     */
    public BareMetalMachineKeySetPatchParameters withExpiration(OffsetDateTime expiration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineKeySetPatchProperties();
        }
        this.innerProperties().withExpiration(expiration);
        return this;
    }

    /**
     * Get the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @return the jumpHostsAllowed value.
     */
    public List<String> jumpHostsAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().jumpHostsAllowed();
    }

    /**
     * Set the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @param jumpHostsAllowed the jumpHostsAllowed value to set.
     * @return the BareMetalMachineKeySetPatchParameters object itself.
     */
    public BareMetalMachineKeySetPatchParameters withJumpHostsAllowed(List<String> jumpHostsAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineKeySetPatchProperties();
        }
        this.innerProperties().withJumpHostsAllowed(jumpHostsAllowed);
        return this;
    }

    /**
     * Get the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    public List<KeySetUser> userList() {
        return this.innerProperties() == null ? null : this.innerProperties().userList();
    }

    /**
     * Set the userList property: The unique list of permitted users.
     *
     * @param userList the userList value to set.
     * @return the BareMetalMachineKeySetPatchParameters object itself.
     */
    public BareMetalMachineKeySetPatchParameters withUserList(List<KeySetUser> userList) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BareMetalMachineKeySetPatchProperties();
        }
        this.innerProperties().withUserList(userList);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}