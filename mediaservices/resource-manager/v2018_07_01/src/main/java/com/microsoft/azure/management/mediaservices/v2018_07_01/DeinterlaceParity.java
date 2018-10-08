/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DeinterlaceParity.
 */
public enum DeinterlaceParity {
    /** Automatically detect the order of fields. */
    AUTO("Auto"),

    /** Apply top field first processing of input video. */
    TOP_FIELD_FIRST("TopFieldFirst"),

    /** Apply bottom field first processing of input video. */
    BOTTOM_FIELD_FIRST("BottomFieldFirst");

    /** The actual serialized value for a DeinterlaceParity instance. */
    private String value;

    DeinterlaceParity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DeinterlaceParity instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DeinterlaceParity object, or null if unable to parse.
     */
    @JsonCreator
    public static DeinterlaceParity fromString(String value) {
        DeinterlaceParity[] items = DeinterlaceParity.values();
        for (DeinterlaceParity item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
