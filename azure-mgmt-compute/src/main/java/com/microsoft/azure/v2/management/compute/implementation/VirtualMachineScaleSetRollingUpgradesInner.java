/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualMachineScaleSetRollingUpgrades.
 */
public final class VirtualMachineScaleSetRollingUpgradesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineScaleSetRollingUpgradesService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgradesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetRollingUpgradesInner(ComputeManagementClientImpl client) {
        this.service = AzureProxy.create(VirtualMachineScaleSetRollingUpgradesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * VirtualMachineScaleSetRollingUpgrades to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface VirtualMachineScaleSetRollingUpgradesService {
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginCancel(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> cancel(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeCancel(OperationDescription operationDescription);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginStartOSUpgrade(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> startOSUpgrade(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeStartOSUpgrade(OperationDescription operationDescription);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginStartExtensionUpgrade(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> startExtensionUpgrade(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeStartExtensionUpgrade(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/latest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<RollingUpgradeStatusInfoInner>> getLatest(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginCancel(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        beginCancelAsync(resourceGroupName, vmScaleSetName).blockingLast();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginCancelAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCancelAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginCancelAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginCancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void cancel(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        cancelAsync(resourceGroupName, vmScaleSetName).blockingAwait();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> cancelAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(cancelAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> cancelWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.cancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable cancelAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        return cancelWithRestResponseAsync(resourceGroupName, vmScaleSetName)
            .toCompletable();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeCancel(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCancel(operationDescription);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginStartOSUpgrade(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        beginStartOSUpgradeAsync(resourceGroupName, vmScaleSetName).blockingLast();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginStartOSUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginStartOSUpgradeAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginStartOSUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginStartOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void startOSUpgrade(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        startOSUpgradeAsync(resourceGroupName, vmScaleSetName).blockingAwait();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> startOSUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(startOSUpgradeAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> startOSUpgradeWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.startOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable startOSUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        return startOSUpgradeWithRestResponseAsync(resourceGroupName, vmScaleSetName)
            .toCompletable();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeStartOSUpgrade(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeStartOSUpgrade(operationDescription);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginStartExtensionUpgrade(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        beginStartExtensionUpgradeAsync(resourceGroupName, vmScaleSetName).blockingLast();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginStartExtensionUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginStartExtensionUpgradeAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginStartExtensionUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginStartExtensionUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void startExtensionUpgrade(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        startExtensionUpgradeAsync(resourceGroupName, vmScaleSetName).blockingAwait();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> startExtensionUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(startExtensionUpgradeAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> startExtensionUpgradeWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.startExtensionUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable startExtensionUpgradeAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        return startExtensionUpgradeWithRestResponseAsync(resourceGroupName, vmScaleSetName)
            .toCompletable();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeStartExtensionUpgrade(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeStartExtensionUpgrade(operationDescription);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RollingUpgradeStatusInfoInner object if successful.
     */
    public RollingUpgradeStatusInfoInner getLatest(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        return getLatestAsync(resourceGroupName, vmScaleSetName).blockingGet();
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<RollingUpgradeStatusInfoInner> getLatestAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName, ServiceCallback<RollingUpgradeStatusInfoInner> serviceCallback) {
        return ServiceFuture.fromBody(getLatestAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<RollingUpgradeStatusInfoInner>> getLatestWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.getLatest(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<RollingUpgradeStatusInfoInner> getLatestAsync(@NonNull String resourceGroupName, @NonNull String vmScaleSetName) {
        return getLatestWithRestResponseAsync(resourceGroupName, vmScaleSetName)
            .flatMapMaybe((BodyResponse<RollingUpgradeStatusInfoInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}