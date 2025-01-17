// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.models;

import java.io.InputStream;

/**
 * Result of opening an {@link InputStream} to a datalake file.
 */
public interface DataLakeFileOpenInputStreamResult {
    /**
     * Gets the {@link InputStream} of the target file.
     *
     * @return the {@link InputStream} of the target file.
     */
    InputStream getInputStream();

    /**
     * Gets the {@link PathProperties} of the target file.
     *
     * @return the {@link PathProperties} of the target file.
     */
    PathProperties getProperties();
}
