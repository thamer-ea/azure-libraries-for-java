/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The common Data Lake Analytics job properties.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JobProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "USql", value = USqlJobProperties.class),
    @JsonSubTypes.Type(name = "Hive", value = HiveJobProperties.class),
    @JsonSubTypes.Type(name = "Scope", value = ScopeJobProperties.class)
})
public class JobProperties {
    /**
     * The runtime version of the Data Lake Analytics engine to use for the
     * specific type of job being run.
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /**
     * The script to run. Please note that the maximum script size is 3 MB.
     */
    @JsonProperty(value = "script", required = true)
    private String script;

    /**
     * Get the runtime version of the Data Lake Analytics engine to use for the specific type of job being run.
     *
     * @return the runtimeVersion value
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtime version of the Data Lake Analytics engine to use for the specific type of job being run.
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the script to run. Please note that the maximum script size is 3 MB.
     *
     * @return the script value
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script to run. Please note that the maximum script size is 3 MB.
     *
     * @param script the script value to set
     * @return the JobProperties object itself.
     */
    public JobProperties withScript(String script) {
        this.script = script;
        return this;
    }

}