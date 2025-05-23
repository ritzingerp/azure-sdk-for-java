// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.PrefixListGlobalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListGlobalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListGlobalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListGlobalRulestacks;

public final class PrefixListGlobalRulestacksImpl implements PrefixListGlobalRulestacks {
    private static final ClientLogger LOGGER = new ClientLogger(PrefixListGlobalRulestacksImpl.class);

    private final PrefixListGlobalRulestacksClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public PrefixListGlobalRulestacksImpl(PrefixListGlobalRulestacksClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrefixListGlobalRulestackResource> list(String globalRulestackName) {
        PagedIterable<PrefixListGlobalRulestackResourceInner> inner = this.serviceClient().list(globalRulestackName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PrefixListGlobalRulestackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrefixListGlobalRulestackResource> list(String globalRulestackName, Context context) {
        PagedIterable<PrefixListGlobalRulestackResourceInner> inner
            = this.serviceClient().list(globalRulestackName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PrefixListGlobalRulestackResourceImpl(inner1, this.manager()));
    }

    public Response<PrefixListGlobalRulestackResource> getWithResponse(String globalRulestackName, String name,
        Context context) {
        Response<PrefixListGlobalRulestackResourceInner> inner
            = this.serviceClient().getWithResponse(globalRulestackName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrefixListGlobalRulestackResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrefixListGlobalRulestackResource get(String globalRulestackName, String name) {
        PrefixListGlobalRulestackResourceInner inner = this.serviceClient().get(globalRulestackName, name);
        if (inner != null) {
            return new PrefixListGlobalRulestackResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrefixListGlobalRulestackResource createOrUpdate(String globalRulestackName, String name,
        PrefixListGlobalRulestackResourceInner resource) {
        PrefixListGlobalRulestackResourceInner inner
            = this.serviceClient().createOrUpdate(globalRulestackName, name, resource);
        if (inner != null) {
            return new PrefixListGlobalRulestackResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrefixListGlobalRulestackResource createOrUpdate(String globalRulestackName, String name,
        PrefixListGlobalRulestackResourceInner resource, Context context) {
        PrefixListGlobalRulestackResourceInner inner
            = this.serviceClient().createOrUpdate(globalRulestackName, name, resource, context);
        if (inner != null) {
            return new PrefixListGlobalRulestackResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String globalRulestackName, String name) {
        this.serviceClient().delete(globalRulestackName, name);
    }

    public void delete(String globalRulestackName, String name, Context context) {
        this.serviceClient().delete(globalRulestackName, name, context);
    }

    private PrefixListGlobalRulestacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
