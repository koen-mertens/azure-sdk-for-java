// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.credential.AzureSasCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobServiceAsyncClient;
import com.azure.storage.blob.models.BlobContainerItem;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.sas.AccountSasSignatureValues;
import com.azure.storage.file.datalake.implementation.util.DataLakeImplUtils;
import com.azure.storage.file.datalake.models.DataLakeRequestConditions;
import com.azure.storage.file.datalake.models.DataLakeServiceProperties;
import com.azure.storage.file.datalake.models.FileSystemItem;
import com.azure.storage.file.datalake.models.ListFileSystemsOptions;
import com.azure.storage.file.datalake.models.PublicAccessType;
import com.azure.storage.file.datalake.models.UserDelegationKey;
import com.azure.storage.file.datalake.options.FileSystemUndeleteOptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.azure.core.util.FluxUtil.pagedFluxError;

/**
 * Client to a storage account. It may only be instantiated through a {@link DataLakeServiceClientBuilder}. This class
 * does not hold any state about a particular storage account but is instead a convenient way of sending off appropriate
 * requests to the resource on the service. It may also be used to construct URLs to file systems, files and
 * directories.
 *
 * <p>
 * This client contains operations on the main data lake service account. Operations on a file system are available on
 * {@link DataLakeFileSystemAsyncClient} through {@link #getFileSystemAsyncClient(String)}, and operations on a file or
 * directory are available on {@link DataLakeFileAsyncClient} or {@link DataLakeDirectoryAsyncClient}.
 *
 * <p>
 * Note this client is an async client that returns reactive responses from Spring Reactor Core project
 * (https://projectreactor.io/). Calling the methods in this client will <strong>NOT</strong> start the actual network
 * operation, until {@code .subscribe()} is called on the reactive response. You can simply convert one of these
 * responses to a {@link java.util.concurrent.CompletableFuture} object through {@link Mono#toFuture()}.
 */
@ServiceClient(builder = DataLakeServiceClientBuilder.class, isAsync = true)
public class DataLakeServiceAsyncClient {
    private static final ClientLogger LOGGER = new ClientLogger(DataLakeServiceAsyncClient.class);

    private final HttpPipeline pipeline;
    private final String url;

    private final String accountName;
    private final DataLakeServiceVersion serviceVersion;

    private final BlobServiceAsyncClient blobServiceAsyncClient;

    private final AzureSasCredential sasToken;

    private final boolean isTokenCredentialAuthenticated;

    /**
     * Package-private constructor for use by {@link DataLakeServiceClientBuilder}.
     *
     * @param pipeline The pipeline used to send and receive service requests.
     * @param url The endpoint where to send service requests.
     * @param serviceVersion The version of the service to receive requests.
     * @param accountName The storage account name.
     * @param blobServiceAsyncClient The underlying {@link BlobServiceAsyncClient}
     */
    DataLakeServiceAsyncClient(HttpPipeline pipeline, String url, DataLakeServiceVersion serviceVersion,
        String accountName, BlobServiceAsyncClient blobServiceAsyncClient, AzureSasCredential sasToken,
        boolean isTokenCredentialAuthenticated) {
        this.pipeline = pipeline;
        this.url = url;
        this.serviceVersion = serviceVersion;

        this.accountName = accountName;

        this.blobServiceAsyncClient = blobServiceAsyncClient;

        this.sasToken = sasToken;

        this.isTokenCredentialAuthenticated = isTokenCredentialAuthenticated;
    }

    /**
     * Initializes a {@link DataLakeFileSystemAsyncClient} object pointing to the specified file system. This method
     * does not create a file system. It simply constructs the URL to the file system and offers access to methods
     * relevant to file systems.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getFileSystemAsyncClient#String -->
     * <pre>
     * DataLakeFileSystemAsyncClient dataLakeFileSystemAsyncClient = client.getFileSystemAsyncClient&#40;&quot;fileSystemName&quot;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getFileSystemAsyncClient#String -->
     *
     * @param fileSystemName The name of the file system to point to. A value of null or empty string will be
     * interpreted as pointing to the root file system and will be replaced by "$root".
     * @return A {@link DataLakeFileSystemAsyncClient} object pointing to the specified file system
     */
    public DataLakeFileSystemAsyncClient getFileSystemAsyncClient(String fileSystemName) {
        if (CoreUtils.isNullOrEmpty(fileSystemName)) {
            fileSystemName = DataLakeFileSystemAsyncClient.ROOT_FILESYSTEM_NAME;
        }
        return new DataLakeFileSystemAsyncClient(getHttpPipeline(), getAccountUrl(), getServiceVersion(),
            getAccountName(), fileSystemName, blobServiceAsyncClient.getBlobContainerAsyncClient(fileSystemName),
            sasToken, isTokenCredentialAuthenticated);
    }

    /**
     * Gets the {@link HttpPipeline} powering this client.
     *
     * @return The pipeline.
     */
    public HttpPipeline getHttpPipeline() {
        return pipeline;
    }

    /**
     * Gets the service version the client is using.
     *
     * @return the service version the client is using.
     */
    public DataLakeServiceVersion getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Creates a new file system within a storage account. If a file system with the same name already exists, the
     * operation fails. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/create-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.createFileSystem#String -->
     * <pre>
     * DataLakeFileSystemAsyncClient dataLakeFileSystemAsyncClient =
     *     client.createFileSystem&#40;&quot;fileSystemName&quot;&#41;.block&#40;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.createFileSystem#String -->
     *
     * @param fileSystemName Name of the file system to create
     * @return A {@link Mono} containing a {@link DataLakeFileSystemAsyncClient} used to interact with the file system
     * created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataLakeFileSystemAsyncClient> createFileSystem(String fileSystemName) {
        return createFileSystemWithResponse(fileSystemName, null, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Creates a new file system within a storage account. If a file system with the same name already exists, the
     * operation fails. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/create-container">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.createFileSystemWithResponse#String-Map-PublicAccessType -->
     * <pre>
     * Map&lt;String, String&gt; metadata = Collections.singletonMap&#40;&quot;metadata&quot;, &quot;value&quot;&#41;;
     *
     * DataLakeFileSystemAsyncClient dataLakeFileSystemAsyncClient = client
     *     .createFileSystemWithResponse&#40;&quot;fileSystemName&quot;, metadata, PublicAccessType.CONTAINER&#41;.block&#40;&#41;.getValue&#40;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.createFileSystemWithResponse#String-Map-PublicAccessType -->
     *
     * @param fileSystemName Name of the file system to create
     * @param metadata Metadata to associate with the file system. If there is leading or trailing whitespace in any
     * metadata key or value, it must be removed or encoded.
     * @param accessType Specifies how the data in this file system is available to the public. See the
     * x-ms-blob-public-access header in the Azure Docs for more information. Pass null for no public access.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#getValue() value} contains a {@link
     * DataLakeFileSystemAsyncClient} used to interact with the file system created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataLakeFileSystemAsyncClient>> createFileSystemWithResponse(String fileSystemName,
        Map<String, String> metadata, PublicAccessType accessType) {
        DataLakeFileSystemAsyncClient dataLakeFileSystemAsyncClient = getFileSystemAsyncClient(fileSystemName);

        return dataLakeFileSystemAsyncClient.createWithResponse(metadata, accessType)
            .map(response -> new SimpleResponse<>(response, dataLakeFileSystemAsyncClient));
    }

    /**
     * Deletes the specified file system in the storage account. If the file system doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/rest/api/storageservices/delete-container">Azure
     * Docs</a>.
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.deleteFileSystem#String -->
     * <pre>
     * client.deleteFileSystem&#40;&quot;fileSystemName&quot;&#41;.subscribe&#40;
     *     response -&gt; System.out.printf&#40;&quot;Delete file system completed%n&quot;&#41;,
     *     error -&gt; System.out.printf&#40;&quot;Delete file system failed: %s%n&quot;, error&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.deleteFileSystem#String -->
     *
     * @param fileSystemName Name of the file system to delete
     * @return A reactive response signalling completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteFileSystem(String fileSystemName) {
        return deleteFileSystemWithResponse(fileSystemName, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Deletes the specified file system in the storage account. If the file system doesn't exist the operation fails.
     * For more information see the <a href="https://docs.microsoft.com/rest/api/storageservices/delete-container">Azure
     * Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.deleteFileSystemWithResponse#String-DataLakeRequestConditions -->
     * <pre>
     * client.deleteFileSystemWithResponse&#40;&quot;fileSystemName&quot;, new DataLakeRequestConditions&#40;&#41;&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;Delete file system completed with status %d%n&quot;, response.getStatusCode&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.deleteFileSystemWithResponse#String-DataLakeRequestConditions -->
     *
     * @param fileSystemName Name of the file system to delete
     * @param requestConditions {@link DataLakeRequestConditions}
     * @return A {@link Mono} containing status code and HTTP headers
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteFileSystemWithResponse(String fileSystemName,
        DataLakeRequestConditions requestConditions) {
        return getFileSystemAsyncClient(fileSystemName).deleteWithResponse(requestConditions);
    }

    /**
     * Gets the URL of the storage account represented by this client.
     *
     * @return the URL.
     */
    public String getAccountUrl() {
        return url;
    }

    /**
     * Returns a reactive Publisher emitting all the file systems in this account lazily as needed. For more
     * information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/list-containers2">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.listFileSystems -->
     * <pre>
     * client.listFileSystems&#40;&#41;.subscribe&#40;fileSystem -&gt; System.out.printf&#40;&quot;Name: %s%n&quot;, fileSystem.getName&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.listFileSystems -->
     *
     * @return A reactive response emitting the list of file systems.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystemItem> listFileSystems() {
        return this.listFileSystems(new ListFileSystemsOptions());
    }

    /**
     * Returns a reactive Publisher emitting all the file systems in this account lazily as needed. For more
     * information, see the <a href="https://docs.microsoft.com/rest/api/storageservices/list-containers2">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.listFileSystems#ListFileSystemsOptions -->
     * <pre>
     * ListFileSystemsOptions options = new ListFileSystemsOptions&#40;&#41;
     *     .setPrefix&#40;&quot;fileSystemNamePrefixToMatch&quot;&#41;
     *     .setDetails&#40;new FileSystemListDetails&#40;&#41;.setRetrieveMetadata&#40;true&#41;&#41;;
     *
     * client.listFileSystems&#40;options&#41;.subscribe&#40;fileSystem -&gt; System.out.printf&#40;&quot;Name: %s%n&quot;, fileSystem.getName&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.listFileSystems#ListFileSystemsOptions -->
     *
     * @param options A {@link ListFileSystemsOptions} which specifies what data should be returned by the service.
     * @return A reactive response emitting the list of file systems.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystemItem> listFileSystems(ListFileSystemsOptions options) {
        try {
            return listFileSystemsWithOptionalTimeout(options, null);
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    PagedFlux<FileSystemItem> listFileSystemsWithOptionalTimeout(ListFileSystemsOptions options, Duration timeout) {
        PagedFlux<BlobContainerItem> inputPagedFlux
            = blobServiceAsyncClient.listBlobContainers(Transforms.toListBlobContainersOptions(options));
        /* We need to create a new PagedFlux here because PagedFlux extends Flux, but not all operations were
            overridden to return PagedFlux - so we need to do the transformations and recreate a PagedFlux. */
        return PagedFlux.create(() -> (continuationToken, pageSize) -> {
            Flux<PagedResponse<BlobContainerItem>> flux;
            if (continuationToken != null && pageSize != null) {
                flux = inputPagedFlux.byPage(continuationToken, pageSize);
            } else if (continuationToken != null) {
                flux = inputPagedFlux.byPage(continuationToken);
            } else if (pageSize != null) {
                flux = inputPagedFlux.byPage(pageSize);
            } else {
                flux = inputPagedFlux.byPage();
            }

            flux = flux.onErrorMap(DataLakeImplUtils::transformBlobStorageException);
            if (timeout != null) {
                flux = flux.timeout(timeout);
            }
            return flux.map(blobsPagedResponse -> new PagedResponseBase<Void, FileSystemItem>(
                blobsPagedResponse.getRequest(), blobsPagedResponse.getStatusCode(), blobsPagedResponse.getHeaders(),
                blobsPagedResponse.getValue().stream().map(Transforms::toFileSystemItem).collect(Collectors.toList()),
                blobsPagedResponse.getContinuationToken(), null));
        });
    }

    /**
     * Gets the properties of a storage account’s DataLake service. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-blob-service-properties">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getProperties -->
     * <pre>
     * client.getProperties&#40;&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;Hour metrics enabled: %b, Minute metrics enabled: %b%n&quot;,
     *         response.getHourMetrics&#40;&#41;.isEnabled&#40;&#41;,
     *         response.getMinuteMetrics&#40;&#41;.isEnabled&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getProperties -->
     *
     * @return A reactive response containing the storage account properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataLakeServiceProperties> getProperties() {
        return getPropertiesWithResponse().flatMap(FluxUtil::toMono);
    }

    /**
     * Gets the properties of a storage account’s DataLake service. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/get-blob-service-properties">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getPropertiesWithResponse -->
     * <pre>
     * client.getPropertiesWithResponse&#40;&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;Hour metrics enabled: %b, Minute metrics enabled: %b%n&quot;,
     *         response.getValue&#40;&#41;.getHourMetrics&#40;&#41;.isEnabled&#40;&#41;,
     *         response.getValue&#40;&#41;.getMinuteMetrics&#40;&#41;.isEnabled&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getPropertiesWithResponse -->
     *
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#getValue() value} contains the storage
     * account properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataLakeServiceProperties>> getPropertiesWithResponse() {
        return this.blobServiceAsyncClient.getPropertiesWithResponse()
            .onErrorMap(DataLakeImplUtils::transformBlobStorageException)
            .map(response -> new SimpleResponse<>(response,
                Transforms.toDataLakeServiceProperties(response.getValue())));
    }

    /**
     * Sets properties for a storage account's DataLake service endpoint. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-service-properties">Azure Docs</a>.
     * Note that setting the default service version has no effect when using this client because this client explicitly
     * sets the version header on each request, overriding the default.
     * <p>This method checks to ensure the properties being sent follow the specifications indicated in the Azure Docs.
     * If CORS policies are set, CORS parameters that are not set default to the empty string.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.setProperties#DataLakeServiceProperties -->
     * <pre>
     * DataLakeRetentionPolicy loggingRetentionPolicy = new DataLakeRetentionPolicy&#40;&#41;.setEnabled&#40;true&#41;.setDays&#40;3&#41;;
     * DataLakeRetentionPolicy metricsRetentionPolicy = new DataLakeRetentionPolicy&#40;&#41;.setEnabled&#40;true&#41;.setDays&#40;1&#41;;
     *
     * DataLakeServiceProperties properties = new DataLakeServiceProperties&#40;&#41;
     *     .setLogging&#40;new DataLakeAnalyticsLogging&#40;&#41;
     *         .setWrite&#40;true&#41;
     *         .setDelete&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setRetentionPolicy&#40;loggingRetentionPolicy&#41;&#41;
     *     .setHourMetrics&#40;new DataLakeMetrics&#40;&#41;
     *         .setEnabled&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setIncludeApis&#40;true&#41;
     *         .setRetentionPolicy&#40;metricsRetentionPolicy&#41;&#41;
     *     .setMinuteMetrics&#40;new DataLakeMetrics&#40;&#41;
     *         .setEnabled&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setIncludeApis&#40;true&#41;
     *         .setRetentionPolicy&#40;metricsRetentionPolicy&#41;&#41;;
     *
     * client.setProperties&#40;properties&#41;.subscribe&#40;
     *     response -&gt; System.out.printf&#40;&quot;Setting properties completed%n&quot;&#41;,
     *     error -&gt; System.out.printf&#40;&quot;Setting properties failed: %s%n&quot;, error&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.setProperties#DataLakeServiceProperties -->
     *
     * @param properties Configures the service.
     * @return A {@link Mono} containing the storage account properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setProperties(DataLakeServiceProperties properties) {
        return setPropertiesWithResponse(properties).flatMap(FluxUtil::toMono);
    }

    /**
     * Sets properties for a storage account's DataLake service endpoint. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/set-blob-service-properties">Azure Docs</a>.
     * Note that setting the default service version has no effect when using this client because this client explicitly
     * sets the version header on each request, overriding the default.
     * <p>This method checks to ensure the properties being sent follow the specifications indicated in the Azure Docs.
     * If CORS policies are set, CORS parameters that are not set default to the empty string.</p>
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.setPropertiesWithResponse#DataLakeServiceProperties -->
     * <pre>
     * loggingRetentionPolicy = new DataLakeRetentionPolicy&#40;&#41;.setEnabled&#40;true&#41;.setDays&#40;3&#41;;
     * metricsRetentionPolicy = new DataLakeRetentionPolicy&#40;&#41;.setEnabled&#40;true&#41;.setDays&#40;1&#41;;
     *
     * properties = new DataLakeServiceProperties&#40;&#41;
     *     .setLogging&#40;new DataLakeAnalyticsLogging&#40;&#41;
     *         .setWrite&#40;true&#41;
     *         .setDelete&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setRetentionPolicy&#40;loggingRetentionPolicy&#41;&#41;
     *     .setHourMetrics&#40;new DataLakeMetrics&#40;&#41;
     *         .setEnabled&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setIncludeApis&#40;true&#41;
     *         .setRetentionPolicy&#40;metricsRetentionPolicy&#41;&#41;
     *     .setMinuteMetrics&#40;new DataLakeMetrics&#40;&#41;
     *         .setEnabled&#40;true&#41;
     *         .setVersion&#40;&quot;1.0&quot;&#41;
     *         .setIncludeApis&#40;true&#41;
     *         .setRetentionPolicy&#40;metricsRetentionPolicy&#41;&#41;;
     *
     * client.setPropertiesWithResponse&#40;properties&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;Setting properties completed with status %d%n&quot;, response.getStatusCode&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.setPropertiesWithResponse#DataLakeServiceProperties -->
     *
     * @param properties Configures the service.
     * @return A {@link Mono} containing the storage account properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> setPropertiesWithResponse(DataLakeServiceProperties properties) {
        return this.blobServiceAsyncClient.setPropertiesWithResponse(Transforms.toBlobServiceProperties(properties))
            .onErrorMap(DataLakeImplUtils::transformBlobStorageException);
    }

    /**
     * Gets a user delegation key for use with this account's data lake storage. Note: This method call is only valid
     * when using {@link TokenCredential} in this object's {@link HttpPipeline}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getUserDelegationKey#OffsetDateTime-OffsetDateTime -->
     * <pre>
     * client.getUserDelegationKey&#40;delegationKeyStartTime, delegationKeyExpiryTime&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;User delegation key: %s%n&quot;, response.getValue&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getUserDelegationKey#OffsetDateTime-OffsetDateTime -->
     *
     * @param start Start time for the key's validity. Null indicates immediate start.
     * @param expiry Expiration of the key's validity.
     * @return A {@link Mono} containing the user delegation key.
     * @throws IllegalArgumentException If {@code start} isn't null and is after {@code expiry}.
     * @throws NullPointerException If {@code expiry} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserDelegationKey> getUserDelegationKey(OffsetDateTime start, OffsetDateTime expiry) {
        return this.getUserDelegationKeyWithResponse(start, expiry).flatMap(FluxUtil::toMono);
    }

    /**
     * Gets a user delegation key for use with this account's data lake storage. Note: This method call is only valid
     * when using {@link TokenCredential} in this object's {@link HttpPipeline}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getUserDelegationKeyWithResponse#OffsetDateTime-OffsetDateTime -->
     * <pre>
     * client.getUserDelegationKeyWithResponse&#40;delegationKeyStartTime, delegationKeyExpiryTime&#41;.subscribe&#40;response -&gt;
     *     System.out.printf&#40;&quot;User delegation key: %s%n&quot;, response.getValue&#40;&#41;.getValue&#40;&#41;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.getUserDelegationKeyWithResponse#OffsetDateTime-OffsetDateTime -->
     *
     * @param start Start time for the key's validity. Null indicates immediate start.
     * @param expiry Expiration of the key's validity.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#getValue() value} containing the user
     * delegation key.
     * @throws IllegalArgumentException If {@code start} isn't null and is after {@code expiry}.
     * @throws NullPointerException If {@code expiry} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UserDelegationKey>> getUserDelegationKeyWithResponse(OffsetDateTime start,
        OffsetDateTime expiry) {
        return blobServiceAsyncClient.getUserDelegationKeyWithResponse(start, expiry)
            .onErrorMap(DataLakeImplUtils::transformBlobStorageException)
            .map(response -> new SimpleResponse<>(response,
                Transforms.toDataLakeUserDelegationKey(response.getValue())));
    }

    /**
     * Get associated account name.
     *
     * @return account name associated with this storage resource.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * <p>The snippet below generates a SAS that lasts for two days and gives the user read and list access to file
     * systems and file shares.</p>
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.generateAccountSas#AccountSasSignatureValues -->
     * <pre>
     * AccountSasPermission permissions = new AccountSasPermission&#40;&#41;
     *     .setListPermission&#40;true&#41;
     *     .setReadPermission&#40;true&#41;;
     * AccountSasResourceType resourceTypes = new AccountSasResourceType&#40;&#41;.setContainer&#40;true&#41;;
     * AccountSasService services = new AccountSasService&#40;&#41;.setBlobAccess&#40;true&#41;.setFileAccess&#40;true&#41;;
     * OffsetDateTime expiryTime = OffsetDateTime.now&#40;&#41;.plus&#40;Duration.ofDays&#40;2&#41;&#41;;
     *
     * AccountSasSignatureValues sasValues =
     *     new AccountSasSignatureValues&#40;expiryTime, permissions, services, resourceTypes&#41;;
     *
     * &#47;&#47; Client must be authenticated via StorageSharedKeyCredential
     * String sas = client.generateAccountSas&#40;sasValues&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.generateAccountSas#AccountSasSignatureValues -->
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     *
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues) {
        return blobServiceAsyncClient.generateAccountSas(accountSasSignatureValues);
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * <p>The snippet below generates a SAS that lasts for two days and gives the user read and list access to file
     * systems and file shares.</p>
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.generateAccountSas#AccountSasSignatureValues-Context -->
     * <pre>
     * AccountSasPermission permissions = new AccountSasPermission&#40;&#41;
     *     .setListPermission&#40;true&#41;
     *     .setReadPermission&#40;true&#41;;
     * AccountSasResourceType resourceTypes = new AccountSasResourceType&#40;&#41;.setContainer&#40;true&#41;;
     * AccountSasService services = new AccountSasService&#40;&#41;.setBlobAccess&#40;true&#41;.setFileAccess&#40;true&#41;;
     * OffsetDateTime expiryTime = OffsetDateTime.now&#40;&#41;.plus&#40;Duration.ofDays&#40;2&#41;&#41;;
     *
     * AccountSasSignatureValues sasValues =
     *     new AccountSasSignatureValues&#40;expiryTime, permissions, services, resourceTypes&#41;;
     *
     * &#47;&#47; Client must be authenticated via StorageSharedKeyCredential
     * String sas = client.generateAccountSas&#40;sasValues, new Context&#40;&quot;key&quot;, &quot;value&quot;&#41;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.generateAccountSas#AccountSasSignatureValues-Context -->
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     * @param context Additional context that is passed through the code when generating a SAS.
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues, Context context) {
        return generateAccountSas(accountSasSignatureValues, null, context);
    }

    /**
     * Generates an account SAS for the Azure Storage account using the specified {@link AccountSasSignatureValues}.
     * <p>Note : The client must be authenticated via {@link StorageSharedKeyCredential}
     * <p>See {@link AccountSasSignatureValues} for more information on how to construct an account SAS.</p>
     *
     * @param accountSasSignatureValues {@link AccountSasSignatureValues}
     * @param stringToSignHandler For debugging purposes only. Returns the string to sign that was used to generate the
     * signature.
     * @param context Additional context that is passed through the code when generating a SAS.
     * @return A {@code String} representing the SAS query parameters.
     */
    public String generateAccountSas(AccountSasSignatureValues accountSasSignatureValues,
        Consumer<String> stringToSignHandler, Context context) {
        return blobServiceAsyncClient.generateAccountSas(accountSasSignatureValues, stringToSignHandler, context);
    }

    /**
     * Restores a previously deleted file system.
     * If the file system associated with provided <code>deletedFileSystemName</code>
     * already exists, this call will result in a 409 (conflict).
     * This API is only functional if Container Soft Delete is enabled
     * for the storage account associated with the file system.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.undeleteFileSystem#String-String -->
     * <pre>
     * ListFileSystemsOptions listFileSystemsOptions = new ListFileSystemsOptions&#40;&#41;;
     * listFileSystemsOptions.getDetails&#40;&#41;.setRetrieveDeleted&#40;true&#41;;
     * client.listFileSystems&#40;listFileSystemsOptions&#41;.flatMap&#40;
     *     deletedFileSystem -&gt; &#123;
     *         Mono&lt;DataLakeFileSystemAsyncClient&gt; fileSystemClient = client.undeleteFileSystem&#40;
     *             deletedFileSystem.getName&#40;&#41;, deletedFileSystem.getVersion&#40;&#41;&#41;;
     *         return fileSystemClient;
     *     &#125;
     * &#41;.then&#40;&#41;.block&#40;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.undeleteFileSystem#String-String -->
     *
     * @param deletedFileSystemName The name of the previously deleted file system.
     * @param deletedFileSystemVersion The version of the previously deleted file system.
     * @return A {@link Mono} containing a {@link DataLakeFileSystemAsyncClient} used
     * to interact with the restored file system.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataLakeFileSystemAsyncClient> undeleteFileSystem(String deletedFileSystemName,
        String deletedFileSystemVersion) {
        return this
            .undeleteFileSystemWithResponse(
                new FileSystemUndeleteOptions(deletedFileSystemName, deletedFileSystemVersion))
            .flatMap(FluxUtil::toMono);
    }

    /**
     * Restores a previously deleted file system. The restored file system
     * will be renamed to the <code>destinationFileSystemName</code> if provided in <code>options</code>.
     * Otherwise <code>deletedFileSystemName</code> is used as the destination file system name.
     * If the file system associated with provided <code>destinationFileSystemName</code>
     * already exists, this call will result in a 409 (conflict).
     * This API is only functional if Container Soft Delete is enabled  for the storage account associated with the
     * file system.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.undeleteFileSystemWithResponse#FileSystemUndeleteOptions -->
     * <pre>
     * ListFileSystemsOptions listFileSystemsOptions = new ListFileSystemsOptions&#40;&#41;;
     * listFileSystemsOptions.getDetails&#40;&#41;.setRetrieveDeleted&#40;true&#41;;
     * client.listFileSystems&#40;listFileSystemsOptions&#41;.flatMap&#40;
     *     deletedFileSystem -&gt; &#123;
     *         Mono&lt;DataLakeFileSystemAsyncClient&gt; fileSystemClient = client.undeleteFileSystemWithResponse&#40;
     *             new FileSystemUndeleteOptions&#40;deletedFileSystem.getName&#40;&#41;, deletedFileSystem.getVersion&#40;&#41;&#41;&#41;
     *             .map&#40;Response::getValue&#41;;
     *         return fileSystemClient;
     *     &#125;
     * &#41;.then&#40;&#41;.block&#40;&#41;;
     * </pre>
     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.undeleteFileSystemWithResponse#FileSystemUndeleteOptions -->
     *
     * @param options {@link FileSystemUndeleteOptions}.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#getValue() value} contains a {@link
     * DataLakeFileSystemAsyncClient} used to interact with the restored file system.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataLakeFileSystemAsyncClient>>
        undeleteFileSystemWithResponse(FileSystemUndeleteOptions options) {
        return blobServiceAsyncClient
            .undeleteBlobContainerWithResponse(Transforms.toBlobContainerUndeleteOptions(options))
            .onErrorMap(DataLakeImplUtils::transformBlobStorageException)
            .map(response -> new SimpleResponse<>(response,
                getFileSystemAsyncClient(response.getValue().getBlobContainerName())));
    }

    //    /**
    //     * Renames an existing file system.
    //     *
    //     * <p><strong>Code Samples</strong></p>
    //     *
    //     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.renameFileSystem#String-String -->
    //     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.renameFileSystem#String-String -->
    //     *
    //     * @param sourceFileSystemName The current name of the file system.
    //     * @param destinationFileSystemName The new name of the file system.
    //     * @return A {@link Mono} containing a {@link DataLakeFileSystemAsyncClient} used to interact with the renamed file
    //     * system.
    //     */
    //    @ServiceMethod(returns = ReturnType.SINGLE)
    //    public Mono<DataLakeFileSystemAsyncClient> renameFileSystem(String sourceFileSystemName,
    //        String destinationFileSystemName) {
    //        return this.renameFileSystemWithResponse(sourceFileSystemName,
    //            new FileSystemRenameOptions(destinationFileSystemName)).flatMap(FluxUtil::toMono);
    //    }
    //
    //    /**
    //     * Renames an existing file system.
    //     *
    //     * <p><strong>Code Samples</strong></p>
    //     *
    //     * <!-- src_embed com.azure.storage.file.datalake.DataLakeServiceAsyncClient.renameFileSystemWithResponse#FileSystemRenameOptions -->
    //     * <!-- end com.azure.storage.file.datalake.DataLakeServiceAsyncClient.renameFileSystemWithResponse#FileSystemRenameOptions -->
    //     *
    //     * @param sourceFileSystemName The current name of the file system.
    //     * @param options {@link FileSystemRenameOptions}
    //     * @return A {@link Mono} containing a {@link Response} whose {@link Response#getValue() value} contains a
    //     * {@link DataLakeFileSystemAsyncClient} used to interact with the renamed file system.
    //     */
    //    @ServiceMethod(returns = ReturnType.SINGLE)
    //    public Mono<Response<DataLakeFileSystemAsyncClient>> renameFileSystemWithResponse(String sourceFileSystemName,
    //        FileSystemRenameOptions options) {
    //        try {
    //            return blobServiceAsyncClient.renameBlobContainerWithResponse(sourceFileSystemName,
    //                Transforms.toBlobContainerRenameOptions(options))
    //                .onErrorMap(DataLakeImplUtils::transformBlobStorageException)
    //                .map(response -> new SimpleResponse<>(response,
    //                        this.getFileSystemAsyncClient(options.getDestinationFileSystemName())));
    //        } catch (RuntimeException ex) {
    //            return monoError(logger, ex);
    //        }
    //    }
}
