// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.implementation.http.client;

import io.clientcore.core.http.models.HttpHeaders;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.implementation.http.HttpResponse;
import io.clientcore.core.models.binarydata.BinaryData;

/**
 * Base response class for JDK with implementations for response metadata.
 */
final class JdkHttpResponse extends HttpResponse<BinaryData> {
    private final BinaryData body;

    /**
     * Creates an instance of {@link JdkHttpResponse}.
     *
     * @param request the request which resulted in this response.
     * @param statusCode the status code of the response.
     * @param headers the headers of the response.
     * @param body the response body.
     */
    JdkHttpResponse(final HttpRequest request, int statusCode, HttpHeaders headers, BinaryData body) {
        super(request, statusCode, headers, null);
        this.body = body;
    }

    @Override
    public BinaryData getBody() {
        if (body == null) {
            if (super.getValue() == null) {
                return BinaryData.empty();
            } else {
                return super.getValue();
            }
        }

        return body;
    }
}
