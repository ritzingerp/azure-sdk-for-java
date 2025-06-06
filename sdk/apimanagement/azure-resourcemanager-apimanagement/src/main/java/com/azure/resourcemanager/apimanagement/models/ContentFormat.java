// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Format of the Content in which the API is getting imported. New formats can be added in the future.
 */
public final class ContentFormat extends ExpandableStringEnum<ContentFormat> {
    /**
     * Static value wadl-xml for ContentFormat.
     */
    public static final ContentFormat WADL_XML = fromString("wadl-xml");

    /**
     * Static value wadl-link-json for ContentFormat.
     */
    public static final ContentFormat WADL_LINK_JSON = fromString("wadl-link-json");

    /**
     * Static value swagger-json for ContentFormat.
     */
    public static final ContentFormat SWAGGER_JSON = fromString("swagger-json");

    /**
     * Static value swagger-link-json for ContentFormat.
     */
    public static final ContentFormat SWAGGER_LINK_JSON = fromString("swagger-link-json");

    /**
     * Static value wsdl for ContentFormat.
     */
    public static final ContentFormat WSDL = fromString("wsdl");

    /**
     * Static value wsdl-link for ContentFormat.
     */
    public static final ContentFormat WSDL_LINK = fromString("wsdl-link");

    /**
     * Static value openapi for ContentFormat.
     */
    public static final ContentFormat OPENAPI = fromString("openapi");

    /**
     * Static value openapi+json for ContentFormat.
     */
    public static final ContentFormat OPENAPI_JSON = fromString("openapi+json");

    /**
     * Static value openapi-link for ContentFormat.
     */
    public static final ContentFormat OPENAPI_LINK = fromString("openapi-link");

    /**
     * Static value openapi+json-link for ContentFormat.
     */
    public static final ContentFormat OPENAPI_JSON_LINK = fromString("openapi+json-link");

    /**
     * Static value graphql-link for ContentFormat.
     */
    public static final ContentFormat GRAPHQL_LINK = fromString("graphql-link");

    /**
     * Static value odata for ContentFormat.
     */
    public static final ContentFormat ODATA = fromString("odata");

    /**
     * Static value odata-link for ContentFormat.
     */
    public static final ContentFormat ODATA_LINK = fromString("odata-link");

    /**
     * Static value grpc for ContentFormat.
     */
    public static final ContentFormat GRPC = fromString("grpc");

    /**
     * Static value grpc-link for ContentFormat.
     */
    public static final ContentFormat GRPC_LINK = fromString("grpc-link");

    /**
     * Creates a new instance of ContentFormat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContentFormat() {
    }

    /**
     * Creates or finds a ContentFormat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ContentFormat.
     */
    public static ContentFormat fromString(String name) {
        return fromString(name, ContentFormat.class);
    }

    /**
     * Gets known ContentFormat values.
     * 
     * @return known ContentFormat values.
     */
    public static Collection<ContentFormat> values() {
        return values(ContentFormat.class);
    }
}
