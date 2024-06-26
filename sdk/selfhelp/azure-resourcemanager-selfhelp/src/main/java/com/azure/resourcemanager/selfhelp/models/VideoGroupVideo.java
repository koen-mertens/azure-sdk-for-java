// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VideoGroup video detail.
 */
@Fluent
public class VideoGroupVideo implements JsonSerializable<VideoGroupVideo> {
    /*
     * Link to the video
     */
    private String src;

    /*
     * Title of the video
     */
    private String title;

    /**
     * Creates an instance of VideoGroupVideo class.
     */
    public VideoGroupVideo() {
    }

    /**
     * Get the src property: Link to the video.
     * 
     * @return the src value.
     */
    public String src() {
        return this.src;
    }

    /**
     * Set the src property: Link to the video.
     * 
     * @param src the src value to set.
     * @return the VideoGroupVideo object itself.
     */
    public VideoGroupVideo withSrc(String src) {
        this.src = src;
        return this;
    }

    /**
     * Get the title property: Title of the video.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title of the video.
     * 
     * @param title the title value to set.
     * @return the VideoGroupVideo object itself.
     */
    public VideoGroupVideo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("src", this.src);
        jsonWriter.writeStringField("title", this.title);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VideoGroupVideo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VideoGroupVideo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VideoGroupVideo.
     */
    public static VideoGroupVideo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VideoGroupVideo deserializedVideoGroupVideo = new VideoGroupVideo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("src".equals(fieldName)) {
                    deserializedVideoGroupVideo.src = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedVideoGroupVideo.title = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVideoGroupVideo;
        });
    }
}
