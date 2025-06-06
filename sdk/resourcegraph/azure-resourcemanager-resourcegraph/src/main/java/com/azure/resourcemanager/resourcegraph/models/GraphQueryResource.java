// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcegraph.fluent.models.GraphQueryResourceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of GraphQueryResource.
 */
public interface GraphQueryResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: This will be used to handle Optimistic Concurrency. If not present, it will always
     * overwrite the existing resource without checking conflict.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the timeModified property: Date and time in UTC of the last modification that was made to this graph query
     * definition.
     * 
     * @return the timeModified value.
     */
    OffsetDateTime timeModified();

    /**
     * Gets the description property: The description of a graph query.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the query property: KQL query that will be graph.
     * 
     * @return the query value.
     */
    String query();

    /**
     * Gets the resultKind property: Enum indicating a type of graph query.
     * 
     * @return the resultKind value.
     */
    ResultKind resultKind();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.resourcegraph.fluent.models.GraphQueryResourceInner object.
     * 
     * @return the inner object.
     */
    GraphQueryResourceInner innerModel();

    /**
     * The entirety of the GraphQueryResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The GraphQueryResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the GraphQueryResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies subscriptionId, resourceGroupName.
             * 
             * @param subscriptionId The Azure subscription Id.
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String subscriptionId, String resourceGroupName);
        }

        /**
         * The stage of the GraphQueryResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithEtag,
            DefinitionStages.WithDescription, DefinitionStages.WithQuery {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            GraphQueryResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GraphQueryResource create(Context context);
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: This will be used to handle Optimistic Concurrency. If not present, it will
             * always overwrite the existing resource without checking conflict..
             * 
             * @param etag This will be used to handle Optimistic Concurrency. If not present, it will always overwrite
             * the existing resource without checking conflict.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The description of a graph query..
             * 
             * @param description The description of a graph query.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the GraphQueryResource definition allowing to specify query.
         */
        interface WithQuery {
            /**
             * Specifies the query property: KQL query that will be graph..
             * 
             * @param query KQL query that will be graph.
             * @return the next definition stage.
             */
            WithCreate withQuery(String query);
        }
    }

    /**
     * Begins update for the GraphQueryResource resource.
     * 
     * @return the stage of resource update.
     */
    GraphQueryResource.Update update();

    /**
     * The template for GraphQueryResource update.
     */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithEtag, UpdateStages.WithDescription, UpdateStages.WithQuery {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        GraphQueryResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GraphQueryResource apply(Context context);
    }

    /**
     * The GraphQueryResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the GraphQueryResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the GraphQueryResource update allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: This will be used to handle Optimistic Concurrency. If not present, it will
             * always overwrite the existing resource without checking conflict..
             * 
             * @param etag This will be used to handle Optimistic Concurrency. If not present, it will always overwrite
             * the existing resource without checking conflict.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the GraphQueryResource update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: The description of a graph query..
             * 
             * @param description The description of a graph query.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the GraphQueryResource update allowing to specify query.
         */
        interface WithQuery {
            /**
             * Specifies the query property: KQL query that will be graph..
             * 
             * @param query KQL query that will be graph.
             * @return the next definition stage.
             */
            Update withQuery(String query);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    GraphQueryResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GraphQueryResource refresh(Context context);
}
