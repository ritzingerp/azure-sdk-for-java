// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The Video Sync Mode.
 */
public final class VideoSyncMode extends ExpandableStringEnum<VideoSyncMode> {
    /**
     * Static value Auto for VideoSyncMode.
     */
    public static final VideoSyncMode AUTO = fromString("Auto");

    /**
     * Static value Passthrough for VideoSyncMode.
     */
    public static final VideoSyncMode PASSTHROUGH = fromString("Passthrough");

    /**
     * Static value Cfr for VideoSyncMode.
     */
    public static final VideoSyncMode CFR = fromString("Cfr");

    /**
     * Static value Vfr for VideoSyncMode.
     */
    public static final VideoSyncMode VFR = fromString("Vfr");

    /**
     * Creates a new instance of VideoSyncMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VideoSyncMode() {
    }

    /**
     * Creates or finds a VideoSyncMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VideoSyncMode.
     */
    public static VideoSyncMode fromString(String name) {
        return fromString(name, VideoSyncMode.class);
    }

    /**
     * Gets known VideoSyncMode values.
     * 
     * @return known VideoSyncMode values.
     */
    public static Collection<VideoSyncMode> values() {
        return values(VideoSyncMode.class);
    }
}
