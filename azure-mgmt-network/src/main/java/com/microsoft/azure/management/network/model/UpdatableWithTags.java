/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.model;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.apigeneration.Method;

import java.util.Map;

/**
 * Interface for a resource which tags can be updated as a separate operation.
 *
 * @param <T> the fluent type of the resource
 */
@LangDefinition
public interface UpdatableWithTags<T> {
    /**
     * Begins a tags update for a resource.
     * <p>
     * This is the beginning of the builder pattern used to update tags for a resources
     * in Azure. The final method completing the definition and starting the actual resource update
     * process in Azure is {@link AppliableWithTags#applyTags()}.
     *
     * @return the stage of new resource update
     */
    @Method
    UpdateWithTags<T> updateTags();

    /**
     * An update allowing tags to be modified for the resource.
     *
     * @param <T> the type of the resource being update
     */
    @LangDefinition(ContainerName = "UpdatableWithTags", ContainerFileName = "IUpdate")
    interface UpdateWithTags<T> {
        /**
         * Specifies tags for the resource as a {@link Map}.
         * @param tags a {@link Map} of tags
         * @return the next stage of the resource update
         */
        AppliableWithTags<T> withTags(Map<String, String> tags);

        /**
         * Adds a tag to the resource.
         * @param key the key for the tag
         * @param value the value for the tag
         * @return the next stage of the resource update
         */
        AppliableWithTags<T> withTag(String key, String value);

        /**
         * Removes a tag from the resource.
         * @param key the key of the tag to remove
         * @return the next stage of the resource update
         */
        AppliableWithTags<T> withoutTag(String key);
    }
}
