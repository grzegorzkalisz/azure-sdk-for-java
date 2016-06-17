/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.analytics.models.DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters;
import com.microsoft.azure.management.datalake.analytics.models.PageImpl;
import com.microsoft.azure.management.datalake.analytics.models.USqlAssembly;
import com.microsoft.azure.management.datalake.analytics.models.USqlAssemblyClr;
import com.microsoft.azure.management.datalake.analytics.models.USqlCredential;
import com.microsoft.azure.management.datalake.analytics.models.USqlDatabase;
import com.microsoft.azure.management.datalake.analytics.models.USqlExternalDataSource;
import com.microsoft.azure.management.datalake.analytics.models.USqlProcedure;
import com.microsoft.azure.management.datalake.analytics.models.USqlSchema;
import com.microsoft.azure.management.datalake.analytics.models.USqlSecret;
import com.microsoft.azure.management.datalake.analytics.models.USqlTable;
import com.microsoft.azure.management.datalake.analytics.models.USqlTablePartition;
import com.microsoft.azure.management.datalake.analytics.models.USqlTableStatistics;
import com.microsoft.azure.management.datalake.analytics.models.USqlTableType;
import com.microsoft.azure.management.datalake.analytics.models.USqlTableValuedFunction;
import com.microsoft.azure.management.datalake.analytics.models.USqlType;
import com.microsoft.azure.management.datalake.analytics.models.USqlView;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Catalogs.
 */
public interface Catalogs {
    /**
     * Creates the specified secret for use with external data sources in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database in which to create the secret.
     * @param secretName The name of the secret.
     * @param parameters The parameters required to create the secret (name and password)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlSecret object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlSecret> createSecret(String accountName, String databaseName, String secretName, DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates the specified secret for use with external data sources in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database in which to create the secret.
     * @param secretName The name of the secret.
     * @param parameters The parameters required to create the secret (name and password)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createSecretAsync(String accountName, String databaseName, String secretName, DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters parameters, final ServiceCallback<USqlSecret> serviceCallback) throws IllegalArgumentException;

    /**
     * Modifies the specified secret for use with external data sources in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret.
     * @param parameters The parameters required to modify the secret (name and password)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlSecret object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlSecret> updateSecret(String accountName, String databaseName, String secretName, DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Modifies the specified secret for use with external data sources in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret.
     * @param parameters The parameters required to modify the secret (name and password)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSecretAsync(String accountName, String databaseName, String secretName, DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters parameters, final ServiceCallback<USqlSecret> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the specified secret in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret to get
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlSecret object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlSecret> getSecret(String accountName, String databaseName, String secretName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the specified secret in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret to get
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSecretAsync(String accountName, String databaseName, String secretName, final ServiceCallback<USqlSecret> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes the specified secret in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret to delete
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deleteSecret(String accountName, String databaseName, String secretName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the specified secret in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param secretName The name of the secret to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSecretAsync(String accountName, String databaseName, String secretName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes all secrets in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deleteAllSecrets(String accountName, String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes all secrets in the specified database.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the secret.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAllSecretsAsync(String accountName, String databaseName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified external data source from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data source.
     * @param externalDataSourceName The name of the external data source.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlExternalDataSource object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlExternalDataSource> getExternalDataSource(String accountName, String databaseName, String externalDataSourceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified external data source from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data source.
     * @param externalDataSourceName The name of the external data source.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getExternalDataSourceAsync(String accountName, String databaseName, String externalDataSourceName, final ServiceCallback<USqlExternalDataSource> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data sources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlExternalDataSource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlExternalDataSource>> listExternalDataSources(final String accountName, final String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data sources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listExternalDataSourcesAsync(final String accountName, final String databaseName, final ListOperationCallback<USqlExternalDataSource> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data sources.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlExternalDataSource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlExternalDataSource>> listExternalDataSources(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the external data sources.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listExternalDataSourcesAsync(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlExternalDataSource> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified credential from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param credentialName The name of the credential.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlCredential object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlCredential> getCredential(String accountName, String databaseName, String credentialName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified credential from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param credentialName The name of the credential.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getCredentialAsync(String accountName, String databaseName, String credentialName, final ServiceCallback<USqlCredential> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlCredential&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlCredential>> listCredentials(final String accountName, final String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listCredentialsAsync(final String accountName, final String databaseName, final ListOperationCallback<USqlCredential> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlCredential&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlCredential>> listCredentials(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listCredentialsAsync(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlCredential> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified procedure from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedure.
     * @param schemaName The name of the schema containing the procedure.
     * @param procedureName The name of the procedure.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlProcedure object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlProcedure> getProcedure(String accountName, String databaseName, String schemaName, String procedureName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified procedure from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedure.
     * @param schemaName The name of the schema containing the procedure.
     * @param procedureName The name of the procedure.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getProcedureAsync(String accountName, String databaseName, String schemaName, String procedureName, final ServiceCallback<USqlProcedure> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedures.
     * @param schemaName The name of the schema containing the procedures.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlProcedure&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlProcedure>> listProcedures(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedures.
     * @param schemaName The name of the schema containing the procedures.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listProceduresAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlProcedure> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedures.
     * @param schemaName The name of the schema containing the procedures.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlProcedure&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlProcedure>> listProcedures(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the procedures.
     * @param schemaName The name of the schema containing the procedures.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listProceduresAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlProcedure> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified table from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table.
     * @param schemaName The name of the schema containing the table.
     * @param tableName The name of the table.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlTable object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlTable> getTable(String accountName, String databaseName, String schemaName, String tableName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified table from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table.
     * @param schemaName The name of the schema containing the table.
     * @param tableName The name of the table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTableAsync(String accountName, String databaseName, String schemaName, String tableName, final ServiceCallback<USqlTable> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the tables.
     * @param schemaName The name of the schema containing the tables.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTable>> listTables(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the tables.
     * @param schemaName The name of the schema containing the tables.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablesAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlTable> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the tables.
     * @param schemaName The name of the schema containing the tables.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTable>> listTables(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the tables.
     * @param schemaName The name of the schema containing the tables.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablesAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlTable> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified table type from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table type.
     * @param schemaName The name of the schema containing the table type.
     * @param tableTypeName The name of the table type to retrieve.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlTableType object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlTableType> getTableType(String accountName, String databaseName, String schemaName, String tableTypeName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified table type from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table type.
     * @param schemaName The name of the schema containing the table type.
     * @param tableTypeName The name of the table type to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTableTypeAsync(String accountName, String databaseName, String schemaName, String tableTypeName, final ServiceCallback<USqlTableType> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table types.
     * @param schemaName The name of the schema containing the table types.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableType>> listTableTypes(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table types.
     * @param schemaName The name of the schema containing the table types.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableTypesAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlTableType> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table types.
     * @param schemaName The name of the schema containing the table types.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableType>> listTableTypes(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table types.
     * @param schemaName The name of the schema containing the table types.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableTypesAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlTableType> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified view from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the view.
     * @param schemaName The name of the schema containing the view.
     * @param viewName The name of the view.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlView> getView(String accountName, String databaseName, String schemaName, String viewName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified view from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the view.
     * @param schemaName The name of the schema containing the view.
     * @param viewName The name of the view.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getViewAsync(String accountName, String databaseName, String schemaName, String viewName, final ServiceCallback<USqlView> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the views.
     * @param schemaName The name of the schema containing the views.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlView&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlView>> listViews(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the views.
     * @param schemaName The name of the schema containing the views.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listViewsAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlView> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the views.
     * @param schemaName The name of the schema containing the views.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlView&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlView>> listViews(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the views.
     * @param schemaName The name of the schema containing the views.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listViewsAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlView> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @param statisticsName The name of the table statistics.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlTableStatistics object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlTableStatistics> getTableStatistic(String accountName, String databaseName, String schemaName, String tableName, String statisticsName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @param statisticsName The name of the table statistics.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTableStatisticAsync(String accountName, String databaseName, String schemaName, String tableName, String statisticsName, final ServiceCallback<USqlTableStatistics> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableStatistics&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableStatistics>> listTableStatistics(final String accountName, final String databaseName, final String schemaName, final String tableName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableStatisticsAsync(final String accountName, final String databaseName, final String schemaName, final String tableName, final ListOperationCallback<USqlTableStatistics> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableStatistics&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableStatistics>> listTableStatistics(final String accountName, final String databaseName, final String schemaName, final String tableName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the statistics.
     * @param schemaName The name of the schema containing the statistics.
     * @param tableName The name of the table containing the statistics.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableStatisticsAsync(final String accountName, final String databaseName, final String schemaName, final String tableName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlTableStatistics> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified table partition from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partition.
     * @param schemaName The name of the schema containing the partition.
     * @param tableName The name of the table containing the partition.
     * @param partitionName The name of the table partition.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlTablePartition object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlTablePartition> getTablePartition(String accountName, String databaseName, String schemaName, String tableName, String partitionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified table partition from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partition.
     * @param schemaName The name of the schema containing the partition.
     * @param tableName The name of the table containing the partition.
     * @param partitionName The name of the table partition.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTablePartitionAsync(String accountName, String databaseName, String schemaName, String tableName, String partitionName, final ServiceCallback<USqlTablePartition> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partitions.
     * @param schemaName The name of the schema containing the partitions.
     * @param tableName The name of the table containing the partitions.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTablePartition&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTablePartition>> listTablePartitions(final String accountName, final String databaseName, final String schemaName, final String tableName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partitions.
     * @param schemaName The name of the schema containing the partitions.
     * @param tableName The name of the table containing the partitions.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablePartitionsAsync(final String accountName, final String databaseName, final String schemaName, final String tableName, final ListOperationCallback<USqlTablePartition> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partitions.
     * @param schemaName The name of the schema containing the partitions.
     * @param tableName The name of the table containing the partitions.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTablePartition&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTablePartition>> listTablePartitions(final String accountName, final String databaseName, final String schemaName, final String tableName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the partitions.
     * @param schemaName The name of the schema containing the partitions.
     * @param tableName The name of the table containing the partitions.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablePartitionsAsync(final String accountName, final String databaseName, final String schemaName, final String tableName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlTablePartition> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the types.
     * @param schemaName The name of the schema containing the types.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlType>> listTypes(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the types.
     * @param schemaName The name of the schema containing the types.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTypesAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlType> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the types.
     * @param schemaName The name of the schema containing the types.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlType>> listTypes(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the types.
     * @param schemaName The name of the schema containing the types.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTypesAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlType> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified table valued function from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued function.
     * @param schemaName The name of the schema containing the table valued function.
     * @param tableValuedFunctionName The name of the tableValuedFunction.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlTableValuedFunction object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlTableValuedFunction> getTableValuedFunction(String accountName, String databaseName, String schemaName, String tableValuedFunctionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified table valued function from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued function.
     * @param schemaName The name of the schema containing the table valued function.
     * @param tableValuedFunctionName The name of the tableValuedFunction.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTableValuedFunctionAsync(String accountName, String databaseName, String schemaName, String tableValuedFunctionName, final ServiceCallback<USqlTableValuedFunction> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued functions.
     * @param schemaName The name of the schema containing the table valued functions.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableValuedFunction&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableValuedFunction>> listTableValuedFunctions(final String accountName, final String databaseName, final String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued functions.
     * @param schemaName The name of the schema containing the table valued functions.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableValuedFunctionsAsync(final String accountName, final String databaseName, final String schemaName, final ListOperationCallback<USqlTableValuedFunction> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued functions.
     * @param schemaName The name of the schema containing the table valued functions.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableValuedFunction&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlTableValuedFunction>> listTableValuedFunctions(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the table valued functions.
     * @param schemaName The name of the schema containing the table valued functions.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableValuedFunctionsAsync(final String accountName, final String databaseName, final String schemaName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlTableValuedFunction> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified assembly from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @param assemblyName The name of the assembly.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlAssembly object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlAssembly> getAssembly(String accountName, String databaseName, String assemblyName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified assembly from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @param assemblyName The name of the assembly.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAssemblyAsync(String accountName, String databaseName, String assemblyName, final ServiceCallback<USqlAssembly> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlAssemblyClr&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlAssemblyClr>> listAssemblies(final String accountName, final String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAssembliesAsync(final String accountName, final String databaseName, final ListOperationCallback<USqlAssemblyClr> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlAssemblyClr&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlAssemblyClr>> listAssemblies(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the assembly.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAssembliesAsync(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlAssemblyClr> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param schemaName The name of the schema.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlSchema object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlSchema> getSchema(String accountName, String databaseName, String schemaName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified schema from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param schemaName The name of the schema.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSchemaAsync(String accountName, String databaseName, String schemaName, final ServiceCallback<USqlSchema> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlSchema&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlSchema>> listSchemas(final String accountName, final String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSchemasAsync(final String accountName, final String databaseName, final ListOperationCallback<USqlSchema> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlSchema&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlSchema>> listSchemas(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database containing the schema.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSchemasAsync(final String accountName, final String databaseName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlSchema> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the specified database from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the USqlDatabase object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<USqlDatabase> getDatabase(String accountName, String databaseName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the specified database from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDatabaseAsync(String accountName, String databaseName, final ServiceCallback<USqlDatabase> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlDatabase&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlDatabase>> listDatabases(final String accountName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listDatabasesAsync(final String accountName, final ListOperationCallback<USqlDatabase> serviceCallback) throws IllegalArgumentException;
    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlDatabase&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<USqlDatabase>> listDatabases(final String accountName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param accountName The Azure Data Lake Analytics account to execute catalog operations on.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param expand OData expansion. Expand related resources in line with the retrieved resources, e.g. Categories?$expand=Products would expand Product data in line with each Category entry. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listDatabasesAsync(final String accountName, final String filter, final Integer top, final Integer skip, final String expand, final String select, final String orderby, final Boolean count, final ListOperationCallback<USqlDatabase> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlExternalDataSource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlExternalDataSource>> listExternalDataSourcesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of external data sources from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listExternalDataSourcesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlExternalDataSource> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlCredential&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlCredential>> listCredentialsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of credentials from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listCredentialsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlCredential> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlProcedure&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlProcedure>> listProceduresNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of procedures from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listProceduresNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlProcedure> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlTable>> listTablesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of tables from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlTable> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlTableType>> listTableTypesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table types from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableTypesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlTableType> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlView&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlView>> listViewsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of views from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listViewsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlView> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableStatistics&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlTableStatistics>> listTableStatisticsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table statistics from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableStatisticsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlTableStatistics> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTablePartition&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlTablePartition>> listTablePartitionsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table partitions from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTablePartitionsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlTablePartition> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlType&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlType>> listTypesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of types within the specified database and schema from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTypesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlType> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlTableValuedFunction&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlTableValuedFunction>> listTableValuedFunctionsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of table valued functions from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listTableValuedFunctionsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlTableValuedFunction> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlAssemblyClr&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlAssemblyClr>> listAssembliesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of assemblies from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAssembliesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlAssemblyClr> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlSchema&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlSchema>> listSchemasNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of schemas from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSchemasNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlSchema> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;USqlDatabase&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<USqlDatabase>> listDatabasesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the list of databases from the Data Lake Analytics catalog.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listDatabasesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<USqlDatabase> serviceCallback) throws IllegalArgumentException;

}
