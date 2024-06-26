// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Jobs are distributed to the worker with the strongest abilities available.
 */
@Fluent
public final class BestWorkerMode extends DistributionMode {

    /*
     * The type discriminator describing a sub-type of DistributionMode.
     */
    @Generated
    private DistributionModeKind kind = DistributionModeKind.BEST_WORKER;

    /*
     * Define a scoring rule to use, when calculating a score to determine the best worker. If not set, will use a
     * default scoring formula that uses the number of job labels that the worker labels match, as well as the number of
     * label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     */
    @Generated
    private RouterRule scoringRule;

    /*
     * Options to configure 'scoringRule'. If not set, default values are used.
     */
    @Generated
    private ScoringRuleOptions scoringRuleOptions;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of BestWorkerMode class.
     */
    @Generated
    public BestWorkerMode() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of DistributionMode.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public DistributionModeKind getKind() {
        return this.kind;
    }

    /**
     * Get the scoringRule property: Define a scoring rule to use, when calculating a score to determine the best
     * worker. If not set, will use a default scoring formula that uses the number of job labels that the worker labels
     * match, as well as the number of label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     *
     * @return the scoringRule value.
     */
    @Generated
    public RouterRule getScoringRule() {
        return this.scoringRule;
    }

    /**
     * Set the scoringRule property: Define a scoring rule to use, when calculating a score to determine the best
     * worker. If not set, will use a default scoring formula that uses the number of job labels that the worker labels
     * match, as well as the number of label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     *
     * @param scoringRule the scoringRule value to set.
     * @return the BestWorkerMode object itself.
     */
    @Generated
    public BestWorkerMode setScoringRule(RouterRule scoringRule) {
        this.scoringRule = scoringRule;
        this.updatedProperties.add("scoringRule");
        return this;
    }

    /**
     * Get the scoringRuleOptions property: Options to configure 'scoringRule'. If not set, default values are used.
     *
     * @return the scoringRuleOptions value.
     */
    @Generated
    public ScoringRuleOptions getScoringRuleOptions() {
        return this.scoringRuleOptions;
    }

    /**
     * Set the scoringRuleOptions property: Options to configure 'scoringRule'. If not set, default values are used.
     *
     * @param scoringRuleOptions the scoringRuleOptions value to set.
     * @return the BestWorkerMode object itself.
     */
    @Generated
    public BestWorkerMode setScoringRuleOptions(ScoringRuleOptions scoringRuleOptions) {
        this.scoringRuleOptions = scoringRuleOptions;
        this.updatedProperties.add("scoringRuleOptions");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public BestWorkerMode setMinConcurrentOffers(Integer minConcurrentOffers) {
        super.setMinConcurrentOffers(minConcurrentOffers);
        this.updatedProperties.add("minConcurrentOffers");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public BestWorkerMode setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        super.setMaxConcurrentOffers(maxConcurrentOffers);
        this.updatedProperties.add("maxConcurrentOffers");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public BestWorkerMode setBypassSelectors(Boolean bypassSelectors) {
        super.setBypassSelectors(bypassSelectors);
        this.updatedProperties.add("bypassSelectors");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getDistributionModeAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeNumberField("minConcurrentOffers", getMinConcurrentOffers());
            jsonWriter.writeNumberField("maxConcurrentOffers", getMaxConcurrentOffers());
            jsonWriter.writeBooleanField("bypassSelectors", isBypassSelectors());
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeJsonField("scoringRule", this.scoringRule);
            jsonWriter.writeJsonField("scoringRuleOptions", this.scoringRuleOptions);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("minConcurrentOffers")) {
            if (getMinConcurrentOffers() == null) {
                jsonWriter.writeNullField("minConcurrentOffers");
            } else {
                jsonWriter.writeNumberField("minConcurrentOffers", getMinConcurrentOffers());
            }
        }
        if (updatedProperties.contains("maxConcurrentOffers")) {
            if (getMaxConcurrentOffers() == null) {
                jsonWriter.writeNullField("maxConcurrentOffers");
            } else {
                jsonWriter.writeNumberField("maxConcurrentOffers", getMaxConcurrentOffers());
            }
        }
        if (updatedProperties.contains("bypassSelectors")) {
            if (isBypassSelectors() == null) {
                jsonWriter.writeNullField("bypassSelectors");
            } else {
                jsonWriter.writeBooleanField("bypassSelectors", isBypassSelectors());
            }
        }
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("scoringRule")) {
            if (this.scoringRule == null) {
                jsonWriter.writeNullField("scoringRule");
            } else {
                JsonMergePatchHelper.getRouterRuleAccessor().prepareModelForJsonMergePatch(this.scoringRule, true);
                jsonWriter.writeJsonField("scoringRule", this.scoringRule);
                JsonMergePatchHelper.getRouterRuleAccessor().prepareModelForJsonMergePatch(this.scoringRule, false);
            }
        }
        if (updatedProperties.contains("scoringRuleOptions")) {
            if (this.scoringRuleOptions == null) {
                jsonWriter.writeNullField("scoringRuleOptions");
            } else {
                JsonMergePatchHelper.getScoringRuleOptionsAccessor()
                    .prepareModelForJsonMergePatch(this.scoringRuleOptions, true);
                jsonWriter.writeJsonField("scoringRuleOptions", this.scoringRuleOptions);
                JsonMergePatchHelper.getScoringRuleOptionsAccessor()
                    .prepareModelForJsonMergePatch(this.scoringRuleOptions, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BestWorkerMode from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BestWorkerMode if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BestWorkerMode.
     */
    @Generated
    public static BestWorkerMode fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BestWorkerMode deserializedBestWorkerMode = new BestWorkerMode();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("minConcurrentOffers".equals(fieldName)) {
                    JsonMergePatchHelper.getDistributionModeAccessor()
                        .setMinConcurrentOffers(deserializedBestWorkerMode, reader.getNullable(JsonReader::getInt));
                } else if ("maxConcurrentOffers".equals(fieldName)) {
                    JsonMergePatchHelper.getDistributionModeAccessor()
                        .setMaxConcurrentOffers(deserializedBestWorkerMode, reader.getNullable(JsonReader::getInt));
                } else if ("bypassSelectors".equals(fieldName)) {
                    JsonMergePatchHelper.getDistributionModeAccessor()
                        .setBypassSelectors(deserializedBestWorkerMode, reader.getNullable(JsonReader::getBoolean));
                } else if ("kind".equals(fieldName)) {
                    deserializedBestWorkerMode.kind = DistributionModeKind.fromString(reader.getString());
                } else if ("scoringRule".equals(fieldName)) {
                    deserializedBestWorkerMode.scoringRule = RouterRule.fromJson(reader);
                } else if ("scoringRuleOptions".equals(fieldName)) {
                    deserializedBestWorkerMode.scoringRuleOptions = ScoringRuleOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBestWorkerMode;
        });
    }
}
