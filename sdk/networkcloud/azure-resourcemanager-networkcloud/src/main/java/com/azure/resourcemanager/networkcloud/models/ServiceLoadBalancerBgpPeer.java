// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ServiceLoadBalancerBgpPeer represents the configuration of the BGP service load balancer for the Kubernetes cluster.
 */
@Fluent
public final class ServiceLoadBalancerBgpPeer implements JsonSerializable<ServiceLoadBalancerBgpPeer> {
    /*
     * The indicator of BFD enablement for this BgpPeer.
     */
    private BfdEnabled bfdEnabled;

    /*
     * The indicator to enable multi-hop peering support.
     */
    private BgpMultiHop bgpMultiHop;

    /*
     * Field Deprecated. The field was previously optional, now it will have no defined behavior and will be ignored.
     * The requested BGP hold time value. This field uses ISO 8601 duration format, for example P1H.
     */
    private String holdTime;

    /*
     * Field Deprecated. The field was previously optional, now it will have no defined behavior and will be ignored.
     * The requested BGP keepalive time value. This field uses ISO 8601 duration format, for example P1H.
     */
    private String keepAliveTime;

    /*
     * The autonomous system number used for the local end of the BGP session.
     */
    private Long myAsn;

    /*
     * The name used to identify this BGP peer for association with a BGP advertisement.
     */
    private String name;

    /*
     * The authentication password for routers enforcing TCP MD5 authenticated sessions.
     */
    private String password;

    /*
     * The IPv4 or IPv6 address used to connect this BGP session.
     */
    private String peerAddress;

    /*
     * The autonomous system number expected from the remote end of the BGP session.
     */
    private long peerAsn;

    /*
     * The port used to connect this BGP session.
     */
    private Long peerPort;

    /**
     * Creates an instance of ServiceLoadBalancerBgpPeer class.
     */
    public ServiceLoadBalancerBgpPeer() {
    }

    /**
     * Get the bfdEnabled property: The indicator of BFD enablement for this BgpPeer.
     * 
     * @return the bfdEnabled value.
     */
    public BfdEnabled bfdEnabled() {
        return this.bfdEnabled;
    }

    /**
     * Set the bfdEnabled property: The indicator of BFD enablement for this BgpPeer.
     * 
     * @param bfdEnabled the bfdEnabled value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withBfdEnabled(BfdEnabled bfdEnabled) {
        this.bfdEnabled = bfdEnabled;
        return this;
    }

    /**
     * Get the bgpMultiHop property: The indicator to enable multi-hop peering support.
     * 
     * @return the bgpMultiHop value.
     */
    public BgpMultiHop bgpMultiHop() {
        return this.bgpMultiHop;
    }

    /**
     * Set the bgpMultiHop property: The indicator to enable multi-hop peering support.
     * 
     * @param bgpMultiHop the bgpMultiHop value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withBgpMultiHop(BgpMultiHop bgpMultiHop) {
        this.bgpMultiHop = bgpMultiHop;
        return this;
    }

    /**
     * Get the holdTime property: Field Deprecated. The field was previously optional, now it will have no defined
     * behavior and will be ignored. The requested BGP hold time value. This field uses ISO 8601 duration format, for
     * example P1H.
     * 
     * @return the holdTime value.
     */
    public String holdTime() {
        return this.holdTime;
    }

    /**
     * Set the holdTime property: Field Deprecated. The field was previously optional, now it will have no defined
     * behavior and will be ignored. The requested BGP hold time value. This field uses ISO 8601 duration format, for
     * example P1H.
     * 
     * @param holdTime the holdTime value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withHoldTime(String holdTime) {
        this.holdTime = holdTime;
        return this;
    }

    /**
     * Get the keepAliveTime property: Field Deprecated. The field was previously optional, now it will have no defined
     * behavior and will be ignored. The requested BGP keepalive time value. This field uses ISO 8601 duration format,
     * for example P1H.
     * 
     * @return the keepAliveTime value.
     */
    public String keepAliveTime() {
        return this.keepAliveTime;
    }

    /**
     * Set the keepAliveTime property: Field Deprecated. The field was previously optional, now it will have no defined
     * behavior and will be ignored. The requested BGP keepalive time value. This field uses ISO 8601 duration format,
     * for example P1H.
     * 
     * @param keepAliveTime the keepAliveTime value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withKeepAliveTime(String keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
        return this;
    }

    /**
     * Get the myAsn property: The autonomous system number used for the local end of the BGP session.
     * 
     * @return the myAsn value.
     */
    public Long myAsn() {
        return this.myAsn;
    }

    /**
     * Set the myAsn property: The autonomous system number used for the local end of the BGP session.
     * 
     * @param myAsn the myAsn value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withMyAsn(Long myAsn) {
        this.myAsn = myAsn;
        return this;
    }

    /**
     * Get the name property: The name used to identify this BGP peer for association with a BGP advertisement.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name used to identify this BGP peer for association with a BGP advertisement.
     * 
     * @param name the name value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the password property: The authentication password for routers enforcing TCP MD5 authenticated sessions.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The authentication password for routers enforcing TCP MD5 authenticated sessions.
     * 
     * @param password the password value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the peerAddress property: The IPv4 or IPv6 address used to connect this BGP session.
     * 
     * @return the peerAddress value.
     */
    public String peerAddress() {
        return this.peerAddress;
    }

    /**
     * Set the peerAddress property: The IPv4 or IPv6 address used to connect this BGP session.
     * 
     * @param peerAddress the peerAddress value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
        return this;
    }

    /**
     * Get the peerAsn property: The autonomous system number expected from the remote end of the BGP session.
     * 
     * @return the peerAsn value.
     */
    public long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: The autonomous system number expected from the remote end of the BGP session.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withPeerAsn(long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the peerPort property: The port used to connect this BGP session.
     * 
     * @return the peerPort value.
     */
    public Long peerPort() {
        return this.peerPort;
    }

    /**
     * Set the peerPort property: The port used to connect this BGP session.
     * 
     * @param peerPort the peerPort value to set.
     * @return the ServiceLoadBalancerBgpPeer object itself.
     */
    public ServiceLoadBalancerBgpPeer withPeerPort(Long peerPort) {
        this.peerPort = peerPort;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property name in model ServiceLoadBalancerBgpPeer"));
        }
        if (peerAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property peerAddress in model ServiceLoadBalancerBgpPeer"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceLoadBalancerBgpPeer.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("peerAddress", this.peerAddress);
        jsonWriter.writeLongField("peerAsn", this.peerAsn);
        jsonWriter.writeStringField("bfdEnabled", this.bfdEnabled == null ? null : this.bfdEnabled.toString());
        jsonWriter.writeStringField("bgpMultiHop", this.bgpMultiHop == null ? null : this.bgpMultiHop.toString());
        jsonWriter.writeStringField("holdTime", this.holdTime);
        jsonWriter.writeStringField("keepAliveTime", this.keepAliveTime);
        jsonWriter.writeNumberField("myAsn", this.myAsn);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeNumberField("peerPort", this.peerPort);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceLoadBalancerBgpPeer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceLoadBalancerBgpPeer if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServiceLoadBalancerBgpPeer.
     */
    public static ServiceLoadBalancerBgpPeer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceLoadBalancerBgpPeer deserializedServiceLoadBalancerBgpPeer = new ServiceLoadBalancerBgpPeer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.name = reader.getString();
                } else if ("peerAddress".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.peerAddress = reader.getString();
                } else if ("peerAsn".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.peerAsn = reader.getLong();
                } else if ("bfdEnabled".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.bfdEnabled = BfdEnabled.fromString(reader.getString());
                } else if ("bgpMultiHop".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.bgpMultiHop = BgpMultiHop.fromString(reader.getString());
                } else if ("holdTime".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.holdTime = reader.getString();
                } else if ("keepAliveTime".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.keepAliveTime = reader.getString();
                } else if ("myAsn".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.myAsn = reader.getNullable(JsonReader::getLong);
                } else if ("password".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.password = reader.getString();
                } else if ("peerPort".equals(fieldName)) {
                    deserializedServiceLoadBalancerBgpPeer.peerPort = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceLoadBalancerBgpPeer;
        });
    }
}
