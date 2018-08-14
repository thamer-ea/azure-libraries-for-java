/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.trafficmanager;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v2.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for EndpointStatus.
 */
public final class EndpointStatus extends ExpandableStringEnum<EndpointStatus> {
    /**
     * Static value Enabled for EndpointStatus.
     */
    public static final EndpointStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for EndpointStatus.
     */
    public static final EndpointStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a EndpointStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointStatus.
     */
    @JsonCreator
    public static EndpointStatus fromString(String name) {
        return fromString(name, EndpointStatus.class);
    }

    /**
     * @return known EndpointStatus values.
     */
    public static Collection<EndpointStatus> values() {
        return values(EndpointStatus.class);
    }
}
