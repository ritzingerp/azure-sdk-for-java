// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources GetMongoDBCollectionThroughput.
 */
public final class MongoDBResourcesGetMongoDBCollectionThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2025-04-15/examples/
     * CosmosDBMongoDBCollectionThroughputGet.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionThroughputGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBCollectionThroughputGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .getMongoDBCollectionThroughputWithResponse("rg1", "ddb1", "databaseName", "collectionName",
                com.azure.core.util.Context.NONE);
    }
}
