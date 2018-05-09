/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a resource name availability.
 */
public class NameAvailabilityInner {
    /**
     * Error Message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Indicates whether the resource name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * Reason for name being unavailable.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable value.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
