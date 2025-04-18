// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.models;

import io.clientcore.core.models.binarydata.BinaryData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static io.clientcore.core.utils.TestUtils.assertArraysEqual;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class HttpRequestTests {
    private static final String BODY = "this is a sample body";
    private static final byte[] BODY_BYTES = BODY.getBytes(StandardCharsets.UTF_8);
    private static final long BODY_LENGTH = BODY_BYTES.length;

    @Test
    public void constructor() {
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri"));

        assertEquals(HttpMethod.POST, request.getHttpMethod());
        assertEquals(URI.create("http://request.uri"), request.getUri());
        assertNull(request.getBody());
    }

    @Test
    public void constructorWithHeaders() {
        final HttpHeaders headers = new HttpHeaders();
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri")).setHeaders(headers);

        assertEquals(HttpMethod.POST, request.getHttpMethod());
        assertEquals(URI.create("http://request.uri"), request.getUri());
        assertSame(headers, request.getHeaders());
        assertNull(request.getBody());
    }

    @ParameterizedTest(name = "[{index}] {displayName}") // BinaryData.toString would trigger buffering.
    @MethodSource("getBinaryDataBodyVariants")
    public void constructorWithBinaryDataBody(BinaryData data, Long expectedContentLength) {

        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri")).setBody(data);

        assertEquals(HttpMethod.POST, request.getHttpMethod());
        assertEquals(URI.create("http://request.uri"), request.getUri());

        assertSame(data, request.getBody());
        assertEquals(expectedContentLength, getContentLength(request));

        if (data != null) {
            assertArraysEqual(BODY_BYTES, request.getBody().toBytes());
        } else {
            assertNull(request.getBody());
        }
    }

    @ParameterizedTest(name = "[{index}] {displayName}") // BinaryData.toString would trigger buffering.
    @MethodSource("getBinaryDataBodyVariants")
    public void testSetBodyAsBinaryData(BinaryData data, Long expectedContentLength) {
        final HttpRequest request = new HttpRequest().setMethod(HttpMethod.POST).setUri("http://request.uri");

        request.setBody(data);

        assertSame(data, request.getBody());
        assertEquals(expectedContentLength, getContentLength(request));

        if (data != null) {
            assertArraysEqual(BODY_BYTES, request.getBody().toBytes());
        } else {
            assertNull(request.getBody());
        }
    }

    @Test
    public void testSetBodyAsString() {
        final HttpRequest request = new HttpRequest().setMethod(HttpMethod.POST).setUri("http://request.uri");

        request.setBody(BinaryData.fromString(BODY));

        assertEquals(BODY_LENGTH, getContentLength(request));
        assertEquals(BODY, request.getBody().toString());
        assertArraysEqual(BODY_BYTES, request.getBody().toBytes());
    }

    @Test
    public void testSetBodyAsByteArray() {
        final HttpRequest request = new HttpRequest().setMethod(HttpMethod.POST).setUri("http://request.uri");

        request.setBody(BinaryData.fromBytes(BODY_BYTES));

        assertEquals(BODY_LENGTH, getContentLength(request));
        assertEquals(BODY, request.getBody().toString());
        assertArraysEqual(BODY_BYTES, request.getBody().toBytes());
    }

    private static Stream<Arguments> getBinaryDataBodyVariants() {
        return Stream.of(
            // body, expectedContentLength
            Arguments.of(null, null), Arguments.of(BinaryData.fromString(BODY), BODY_LENGTH),
            Arguments.of(BinaryData.fromBytes(BODY_BYTES), BODY_LENGTH),
            Arguments.of(BinaryData.fromStream(new ByteArrayInputStream(BODY_BYTES)), null),
            Arguments.of(BinaryData.fromStream(new ByteArrayInputStream(BODY_BYTES), BODY_LENGTH), BODY_LENGTH));
    }

    private Long getContentLength(HttpRequest request) {
        String contentLengthValue = request.getHeaders().getValue(HttpHeaderName.CONTENT_LENGTH);
        return contentLengthValue == null ? null : Long.parseLong(contentLengthValue);
    }
}
