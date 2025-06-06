// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BucketInner;

/**
 * An immutable client-side representation of Bucket.
 */
public interface Bucket {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the path property: The volume path mounted inside the bucket. The default is the root path '/' if no value
     * is provided when the bucket is created.
     * 
     * @return the path value.
     */
    String path();

    /**
     * Gets the fileSystemUser property: File System user having access to volume data. For Unix, this is the user's uid
     * and gid. For Windows, this is the user's username. Note that the Unix and Windows user details are mutually
     * exclusive, meaning one or other must be supplied, but not both.
     * 
     * @return the fileSystemUser value.
     */
    FileSystemUser fileSystemUser();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    NetappProvisioningState provisioningState();

    /**
     * Gets the status property: The bucket credentials status. There states:
     * 
     * "NoCredentialsSet": Access and Secret key pair have not been generated.
     * "CredentialsExpired": Access and Secret key pair have expired.
     * "Active": The certificate has been installed and credentials are unexpired.
     * 
     * @return the status value.
     */
    CredentialsStatus status();

    /**
     * Gets the server property: Properties of the server managing the lifecycle of volume buckets.
     * 
     * @return the server value.
     */
    BucketServerProperties server();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.BucketInner object.
     * 
     * @return the inner object.
     */
    BucketInner innerModel();

    /**
     * The entirety of the Bucket definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Bucket definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Bucket definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Bucket definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, poolName, volumeName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of the NetApp account.
             * @param poolName The name of the capacity pool.
             * @param volumeName The name of the volume.
             * @return the next definition stage.
             */
            WithCreate withExistingVolume(String resourceGroupName, String accountName, String poolName,
                String volumeName);
        }

        /**
         * The stage of the Bucket definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPath, DefinitionStages.WithFileSystemUser, DefinitionStages.WithServer {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Bucket create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Bucket create(Context context);
        }

        /**
         * The stage of the Bucket definition allowing to specify path.
         */
        interface WithPath {
            /**
             * Specifies the path property: The volume path mounted inside the bucket. The default is the root path '/'
             * if no value is provided when the bucket is created..
             * 
             * @param path The volume path mounted inside the bucket. The default is the root path '/' if no value is
             * provided when the bucket is created.
             * @return the next definition stage.
             */
            WithCreate withPath(String path);
        }

        /**
         * The stage of the Bucket definition allowing to specify fileSystemUser.
         */
        interface WithFileSystemUser {
            /**
             * Specifies the fileSystemUser property: File System user having access to volume data. For Unix, this is
             * the user's uid and gid. For Windows, this is the user's username. Note that the Unix and Windows user
             * details are mutually exclusive, meaning one or other must be supplied, but not both..
             * 
             * @param fileSystemUser File System user having access to volume data. For Unix, this is the user's uid and
             * gid. For Windows, this is the user's username. Note that the Unix and Windows user details are mutually
             * exclusive, meaning one or other must be supplied, but not both.
             * @return the next definition stage.
             */
            WithCreate withFileSystemUser(FileSystemUser fileSystemUser);
        }

        /**
         * The stage of the Bucket definition allowing to specify server.
         */
        interface WithServer {
            /**
             * Specifies the server property: Properties of the server managing the lifecycle of volume buckets.
             * 
             * @param server Properties of the server managing the lifecycle of volume buckets.
             * @return the next definition stage.
             */
            WithCreate withServer(BucketServerProperties server);
        }
    }

    /**
     * Begins update for the Bucket resource.
     * 
     * @return the stage of resource update.
     */
    Bucket.Update update();

    /**
     * The template for Bucket update.
     */
    interface Update extends UpdateStages.WithPath, UpdateStages.WithFileSystemUser, UpdateStages.WithServer {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Bucket apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Bucket apply(Context context);
    }

    /**
     * The Bucket update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Bucket update allowing to specify path.
         */
        interface WithPath {
            /**
             * Specifies the path property: The volume path mounted inside the bucket..
             * 
             * @param path The volume path mounted inside the bucket.
             * @return the next definition stage.
             */
            Update withPath(String path);
        }

        /**
         * The stage of the Bucket update allowing to specify fileSystemUser.
         */
        interface WithFileSystemUser {
            /**
             * Specifies the fileSystemUser property: File System user having access to volume data. For Unix, this is
             * the user's uid and gid. For Windows, this is the user's username. Note that the Unix and Windows user
             * details are mutually exclusive, meaning one or other must be supplied, but not both..
             * 
             * @param fileSystemUser File System user having access to volume data. For Unix, this is the user's uid and
             * gid. For Windows, this is the user's username. Note that the Unix and Windows user details are mutually
             * exclusive, meaning one or other must be supplied, but not both.
             * @return the next definition stage.
             */
            Update withFileSystemUser(FileSystemUser fileSystemUser);
        }

        /**
         * The stage of the Bucket update allowing to specify server.
         */
        interface WithServer {
            /**
             * Specifies the server property: Properties of the server managing the lifecycle of volume buckets.
             * 
             * @param server Properties of the server managing the lifecycle of volume buckets.
             * @return the next definition stage.
             */
            Update withServer(BucketServerPatchProperties server);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Bucket refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Bucket refresh(Context context);

    /**
     * Generate bucket access credentials
     * 
     * Generate the access key and secret key used for accessing the specified volume bucket. Also return expiry date
     * and time of key pair (in UTC).
     * 
     * @param body The bucket's Access and Secret key pair expiry time expressed as the number of days from now.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bucket Access Key, Secret Key, and Expiry date and time of the key pair along with {@link Response}.
     */
    Response<BucketGenerateCredentials> generateCredentialsWithResponse(BucketCredentialsExpiry body, Context context);

    /**
     * Generate bucket access credentials
     * 
     * Generate the access key and secret key used for accessing the specified volume bucket. Also return expiry date
     * and time of key pair (in UTC).
     * 
     * @param body The bucket's Access and Secret key pair expiry time expressed as the number of days from now.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bucket Access Key, Secret Key, and Expiry date and time of the key pair.
     */
    BucketGenerateCredentials generateCredentials(BucketCredentialsExpiry body);
}
