// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for high level summary of firmware analysis results.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "summaryType")
@JsonTypeName("Firmware")
@Fluent
public final class FirmwareSummary extends SummaryResourceProperties {
    /*
     * Total extracted size of the firmware in bytes.
     */
    @JsonProperty(value = "extractedSize")
    private Long extractedSize;

    /*
     * Firmware file size in bytes.
     */
    @JsonProperty(value = "fileSize")
    private Long fileSize;

    /*
     * Extracted file count.
     */
    @JsonProperty(value = "extractedFileCount")
    private Long extractedFileCount;

    /*
     * Components count.
     */
    @JsonProperty(value = "componentCount")
    private Long componentCount;

    /*
     * Binary count
     */
    @JsonProperty(value = "binaryCount")
    private Long binaryCount;

    /*
     * Time used for analysis
     */
    @JsonProperty(value = "analysisTimeSeconds")
    private Long analysisTimeSeconds;

    /*
     * The number of root file systems found.
     */
    @JsonProperty(value = "rootFileSystems")
    private Long rootFileSystems;

    /**
     * Creates an instance of FirmwareSummary class.
     */
    public FirmwareSummary() {
    }

    /**
     * Get the extractedSize property: Total extracted size of the firmware in bytes.
     * 
     * @return the extractedSize value.
     */
    public Long extractedSize() {
        return this.extractedSize;
    }

    /**
     * Set the extractedSize property: Total extracted size of the firmware in bytes.
     * 
     * @param extractedSize the extractedSize value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withExtractedSize(Long extractedSize) {
        this.extractedSize = extractedSize;
        return this;
    }

    /**
     * Get the fileSize property: Firmware file size in bytes.
     * 
     * @return the fileSize value.
     */
    public Long fileSize() {
        return this.fileSize;
    }

    /**
     * Set the fileSize property: Firmware file size in bytes.
     * 
     * @param fileSize the fileSize value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get the extractedFileCount property: Extracted file count.
     * 
     * @return the extractedFileCount value.
     */
    public Long extractedFileCount() {
        return this.extractedFileCount;
    }

    /**
     * Set the extractedFileCount property: Extracted file count.
     * 
     * @param extractedFileCount the extractedFileCount value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withExtractedFileCount(Long extractedFileCount) {
        this.extractedFileCount = extractedFileCount;
        return this;
    }

    /**
     * Get the componentCount property: Components count.
     * 
     * @return the componentCount value.
     */
    public Long componentCount() {
        return this.componentCount;
    }

    /**
     * Set the componentCount property: Components count.
     * 
     * @param componentCount the componentCount value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withComponentCount(Long componentCount) {
        this.componentCount = componentCount;
        return this;
    }

    /**
     * Get the binaryCount property: Binary count.
     * 
     * @return the binaryCount value.
     */
    public Long binaryCount() {
        return this.binaryCount;
    }

    /**
     * Set the binaryCount property: Binary count.
     * 
     * @param binaryCount the binaryCount value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withBinaryCount(Long binaryCount) {
        this.binaryCount = binaryCount;
        return this;
    }

    /**
     * Get the analysisTimeSeconds property: Time used for analysis.
     * 
     * @return the analysisTimeSeconds value.
     */
    public Long analysisTimeSeconds() {
        return this.analysisTimeSeconds;
    }

    /**
     * Set the analysisTimeSeconds property: Time used for analysis.
     * 
     * @param analysisTimeSeconds the analysisTimeSeconds value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withAnalysisTimeSeconds(Long analysisTimeSeconds) {
        this.analysisTimeSeconds = analysisTimeSeconds;
        return this;
    }

    /**
     * Get the rootFileSystems property: The number of root file systems found.
     * 
     * @return the rootFileSystems value.
     */
    public Long rootFileSystems() {
        return this.rootFileSystems;
    }

    /**
     * Set the rootFileSystems property: The number of root file systems found.
     * 
     * @param rootFileSystems the rootFileSystems value to set.
     * @return the FirmwareSummary object itself.
     */
    public FirmwareSummary withRootFileSystems(Long rootFileSystems) {
        this.rootFileSystems = rootFileSystems;
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
    }
}
