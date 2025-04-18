// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.fluent.models.ConfigurationServiceResourceInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.ExternalChildResource;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;

import java.util.List;

/**
 * (Enterprise Tier Only)
 * An immutable client-side representation of an Azure Spring Cloud Configuration Service.
 */
@Fluent
public interface SpringConfigurationService extends ExternalChildResource<SpringConfigurationService, SpringService>,
    HasInnerModel<ConfigurationServiceResourceInner> {
    /**
     * Gets the CPU for the Configuration Service.
     *
     * @return CPU for the Configuration Service
     */
    Double cpu();

    /**
     * Gets the memory for the Configuration Service.
     *
     * @return memory for the Configuration Service, 1 GB can be represented by 1Gi or 1024Mi */
    Double memory();

    /**
     * Gets default git URI in the Configuration Service.
     *
     * @return default git URI in the Configuration Service */
    String gitUri();

    /**
     * Gets default file patterns in the Configuration Service.
     *
     * @return default file patterns in the Configuration Service */
    List<String> filePatterns();

    /**
     * Gets default branch in the Configuration Service.
     *
     * @return default branch in the Configuration Service */
    String branch();

    /**
     * Get git repository config by name.
     * @param name name of the git repository in the Configuration Service
     * @return git repository config
     */
    ConfigurationServiceGitRepository getGitRepository(String name);

    /**
     * Gets the apps that have bindings to this Configuration Service.
     *
     * @return apps that have bindings to this Configuration Service */
    List<SpringApp> getAppBindings();
}
