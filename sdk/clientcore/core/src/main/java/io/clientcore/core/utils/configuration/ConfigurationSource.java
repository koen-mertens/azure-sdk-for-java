// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.utils.configuration;

import java.util.Map;

/**
 * Configuration property source which provides configuration values from a specific place. Samples may include
 * properties file supported by frameworks or other source.
 *
 * Note that environment configuration (environment variables and system properties) are supported by default and
 * don't need a source implementation.
 */
@FunctionalInterface
public interface ConfigurationSource {
    /**
     * Returns all properties (name and value) which names start with given path.
     * Null (or empty) path indicate that all properties should be returned.
     *
     * Example:
     * <p>
     * With following configuration properties:
     * <ul>
     *   <li>sdk.foo = 1</li>
     *   <li>sdk.bar.baz = 2</li>
     * </ul>
     *
     * <p>
     * {@link ConfigurationSource} implementation must the following behavior:
     * <ul>
     *       <li>{@code getProperties(null} must return both properties</li>
     *       <li>{@code getProperties("sdk")} must return both properties</li>
     *       <li>{@code getProperties("sdk.foo")} must return {"sdk.foo", "1"}</li>
     *       <li>{@code getProperties("sdk.ba")} must return empty map</li>
     * </ul>
     *
     * @param source property name prefix
     * @return Map of properties under given path.
     */
    Map<String, String> getProperties(String source);
}
