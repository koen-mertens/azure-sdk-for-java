// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.route.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.route.implementation.models.RouteMatrixResultResponse;
import java.io.IOException;

/**
 * Matrix result object.
 */
@Immutable
public final class RouteMatrix implements JsonSerializable<RouteMatrix> {

    /*
     * StatusCode property for the current cell in the input matrix.
     */
    @Generated
    private Integer statusCode;

    /*
     * Response object of the current cell in the input matrix.
     */
    @Generated
    private RouteMatrixResultResponse response;

    /**
     * Creates an instance of RouteMatrix class.
     */
    @Generated
    public RouteMatrix() {
    }

    /**
     * Get the statusCode property: StatusCode property for the current cell in the input matrix.
     *
     * @return the statusCode value.
     */
    @Generated
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouteMatrix from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteMatrix if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteMatrix.
     */
    @Generated
    public static RouteMatrix fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteMatrix deserializedRouteMatrix = new RouteMatrix();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("statusCode".equals(fieldName)) {
                    deserializedRouteMatrix.statusCode = reader.getNullable(JsonReader::getInt);
                } else if ("response".equals(fieldName)) {
                    deserializedRouteMatrix.response = RouteMatrixResultResponse.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRouteMatrix;
        });
    }

    /**
     * Returns a {@link RouteLegSummary} summarizing this route section.
     *
     * @return a {@code RouteLegSummary} with the summary of this route leg.
     */
    public RouteLegSummary getSummary() {
        return this.response.getSummary();
    }
}
