/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.RestClient;

/**
 * The interface for DataLakeAnalyticsAccountManagementClient class.
 */
public interface DataLakeAnalyticsAccountManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Get subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets Get subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    DataLakeAnalyticsAccountManagementClient withSubscriptionId(String subscriptionId);

    /**
     * Gets Client Api Version..
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    DataLakeAnalyticsAccountManagementClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    DataLakeAnalyticsAccountManagementClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    DataLakeAnalyticsAccountManagementClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the Accounts object to access its operations.
     * @return the Accounts object.
     */
    Accounts accounts();

}
