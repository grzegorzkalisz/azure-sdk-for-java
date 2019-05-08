/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The ClearRange model.
 */
@JacksonXmlRootElement(localName = "ClearRange")
public final class ClearRange {
    /**
     * The start property.
     */
    @JsonProperty(value = "Start", required = true)
    private long start;

    /**
     * The end property.
     */
    @JsonProperty(value = "End", required = true)
    private long end;

    /**
     * Get the start value.
     *
     * @return the start value.
     */
    public long start() {
        return this.start;
    }

    /**
     * Set the start value.
     *
     * @param start the start value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange withStart(long start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end value.
     *
     * @return the end value.
     */
    public long end() {
        return this.end;
    }

    /**
     * Set the end value.
     *
     * @param end the end value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange withEnd(long end) {
        this.end = end;
        return this;
    }
}
