// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

/**
 * Defines values for ListBlobsShowOnly.
 */
public enum ListBlobsShowOnly {
    /**
     * Enum value deleted.
     */
    DELETED("deleted");

    /**
     * The actual serialized value for a ListBlobsShowOnly instance.
     */
    private final String value;

    ListBlobsShowOnly(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListBlobsShowOnly instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ListBlobsShowOnly object, or null if unable to parse.
     */
    public static ListBlobsShowOnly fromString(String value) {
        if (value == null) {
            return null;
        }
        ListBlobsShowOnly[] items = ListBlobsShowOnly.values();
        for (ListBlobsShowOnly item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
