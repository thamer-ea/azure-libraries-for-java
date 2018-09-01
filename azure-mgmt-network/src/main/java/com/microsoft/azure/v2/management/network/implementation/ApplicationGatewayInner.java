/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.Resource;
import com.microsoft.azure.v2.management.network.ApplicationGatewayAuthenticationCertificate;
import com.microsoft.azure.v2.management.network.ApplicationGatewayAutoscaleConfiguration;
import com.microsoft.azure.v2.management.network.ApplicationGatewayBackendHttpSettings;
import com.microsoft.azure.v2.management.network.ApplicationGatewayFrontendIPConfiguration;
import com.microsoft.azure.v2.management.network.ApplicationGatewayFrontendPort;
import com.microsoft.azure.v2.management.network.ApplicationGatewayHttpListener;
import com.microsoft.azure.v2.management.network.ApplicationGatewayIPConfiguration;
import com.microsoft.azure.v2.management.network.ApplicationGatewayOperationalState;
import com.microsoft.azure.v2.management.network.ApplicationGatewayProbe;
import com.microsoft.azure.v2.management.network.ApplicationGatewayRedirectConfiguration;
import com.microsoft.azure.v2.management.network.ApplicationGatewayRequestRoutingRule;
import com.microsoft.azure.v2.management.network.ApplicationGatewaySku;
import com.microsoft.azure.v2.management.network.ApplicationGatewaySslCertificate;
import com.microsoft.azure.v2.management.network.ApplicationGatewaySslPolicy;
import com.microsoft.azure.v2.management.network.ApplicationGatewayUrlPathMap;
import com.microsoft.azure.v2.management.network.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Application gateway resource.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicationGatewayInner extends Resource {
    /**
     * SKU of the application gateway resource.
     */
    @JsonProperty(value = "properties.sku")
    private ApplicationGatewaySku sku;

    /**
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /**
     * Operational state of the application gateway resource. Possible values
     * include: 'Stopped', 'Starting', 'Running', 'Stopping'.
     */
    @JsonProperty(value = "properties.operationalState", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationGatewayOperationalState operationalState;

    /**
     * Subnets of application the gateway resource.
     */
    @JsonProperty(value = "properties.gatewayIPConfigurations")
    private List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations;

    /**
     * Authentication certificates of the application gateway resource.
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates;

    /**
     * SSL certificates of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslCertificates")
    private List<ApplicationGatewaySslCertificateInner> sslCertificates;

    /**
     * Frontend IP addresses of the application gateway resource.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations;

    /**
     * Frontend ports of the application gateway resource.
     */
    @JsonProperty(value = "properties.frontendPorts")
    private List<ApplicationGatewayFrontendPort> frontendPorts;

    /**
     * Probes of the application gateway resource.
     */
    @JsonProperty(value = "properties.probes")
    private List<ApplicationGatewayProbe> probes;

    /**
     * Backend address pool of the application gateway resource.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<ApplicationGatewayBackendAddressPoolInner> backendAddressPools;

    /**
     * Backend http settings of the application gateway resource.
     */
    @JsonProperty(value = "properties.backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;

    /**
     * Http listeners of the application gateway resource.
     */
    @JsonProperty(value = "properties.httpListeners")
    private List<ApplicationGatewayHttpListener> httpListeners;

    /**
     * URL path map of the application gateway resource.
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<ApplicationGatewayUrlPathMap> urlPathMaps;

    /**
     * Request routing rules of the application gateway resource.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<ApplicationGatewayRequestRoutingRule> requestRoutingRules;

    /**
     * Redirect configurations of the application gateway resource.
     */
    @JsonProperty(value = "properties.redirectConfigurations")
    private List<ApplicationGatewayRedirectConfiguration> redirectConfigurations;

    /**
     * Web application firewall configuration.
     */
    @JsonProperty(value = "properties.webApplicationFirewallConfiguration")
    private ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration;

    /**
     * Whether HTTP2 is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableHttp2")
    private Boolean enableHttp2;

    /**
     * Whether FIPS is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableFips")
    private Boolean enableFips;

    /**
     * Autoscale Configuration.
     */
    @JsonProperty(value = "properties.autoscaleConfiguration")
    private ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration;

    /**
     * Resource GUID property of the application gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Provisioning state of the application gateway resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku value.
     *
     * @return the sku value.
     */
    public ApplicationGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSku(ApplicationGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the sslPolicy value.
     *
     * @return the sslPolicy value.
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set the sslPolicy value.
     *
     * @param sslPolicy the sslPolicy value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get the operationalState value.
     *
     * @return the operationalState value.
     */
    public ApplicationGatewayOperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Get the gatewayIPConfigurations value.
     *
     * @return the gatewayIPConfigurations value.
     */
    public List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations() {
        return this.gatewayIPConfigurations;
    }

    /**
     * Set the gatewayIPConfigurations value.
     *
     * @param gatewayIPConfigurations the gatewayIPConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withGatewayIPConfigurations(List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations) {
        this.gatewayIPConfigurations = gatewayIPConfigurations;
        return this;
    }

    /**
     * Get the authenticationCertificates value.
     *
     * @return the authenticationCertificates value.
     */
    public List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates value.
     *
     * @param authenticationCertificates the authenticationCertificates value
     * to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAuthenticationCertificates(List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the sslCertificates value.
     *
     * @return the sslCertificates value.
     */
    public List<ApplicationGatewaySslCertificateInner> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * Set the sslCertificates value.
     *
     * @param sslCertificates the sslCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslCertificates(List<ApplicationGatewaySslCertificateInner> sslCertificates) {
        this.sslCertificates = sslCertificates;
        return this;
    }

    /**
     * Get the frontendIPConfigurations value.
     *
     * @return the frontendIPConfigurations value.
     */
    public List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set the frontendIPConfigurations value.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to
     * set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendIPConfigurations(List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
        return this;
    }

    /**
     * Get the frontendPorts value.
     *
     * @return the frontendPorts value.
     */
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.frontendPorts;
    }

    /**
     * Set the frontendPorts value.
     *
     * @param frontendPorts the frontendPorts value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.frontendPorts = frontendPorts;
        return this;
    }

    /**
     * Get the probes value.
     *
     * @return the probes value.
     */
    public List<ApplicationGatewayProbe> probes() {
        return this.probes;
    }

    /**
     * Set the probes value.
     *
     * @param probes the probes value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProbes(List<ApplicationGatewayProbe> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the backendAddressPools value.
     *
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPoolInner> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools value.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendAddressPools(List<ApplicationGatewayBackendAddressPoolInner> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection value.
     *
     * @return the backendHttpSettingsCollection value.
     */
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection value.
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection
     * value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

    /**
     * Get the httpListeners value.
     *
     * @return the httpListeners value.
     */
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Set the httpListeners value.
     *
     * @param httpListeners the httpListeners value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    /**
     * Get the urlPathMaps value.
     *
     * @return the urlPathMaps value.
     */
    public List<ApplicationGatewayUrlPathMap> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps value.
     *
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the requestRoutingRules value.
     *
     * @return the requestRoutingRules value.
     */
    public List<ApplicationGatewayRequestRoutingRule> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules value.
     *
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the redirectConfigurations value.
     *
     * @return the redirectConfigurations value.
     */
    public List<ApplicationGatewayRedirectConfiguration> redirectConfigurations() {
        return this.redirectConfigurations;
    }

    /**
     * Set the redirectConfigurations value.
     *
     * @param redirectConfigurations the redirectConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations) {
        this.redirectConfigurations = redirectConfigurations;
        return this;
    }

    /**
     * Get the webApplicationFirewallConfiguration value.
     *
     * @return the webApplicationFirewallConfiguration value.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.webApplicationFirewallConfiguration;
    }

    /**
     * Set the webApplicationFirewallConfiguration value.
     *
     * @param webApplicationFirewallConfiguration the
     * webApplicationFirewallConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withWebApplicationFirewallConfiguration(ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
        return this;
    }

    /**
     * Get the enableHttp2 value.
     *
     * @return the enableHttp2 value.
     */
    public Boolean enableHttp2() {
        return this.enableHttp2;
    }

    /**
     * Set the enableHttp2 value.
     *
     * @param enableHttp2 the enableHttp2 value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableHttp2(Boolean enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }

    /**
     * Get the enableFips value.
     *
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Set the enableFips value.
     *
     * @param enableFips the enableFips value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableFips(Boolean enableFips) {
        this.enableFips = enableFips;
        return this;
    }

    /**
     * Get the autoscaleConfiguration value.
     *
     * @return the autoscaleConfiguration value.
     */
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.autoscaleConfiguration;
    }

    /**
     * Set the autoscaleConfiguration value.
     *
     * @param autoscaleConfiguration the autoscaleConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAutoscaleConfiguration(ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        return this;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones value.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones value.
     *
     * @param zones the zones value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withId(String id) {
        this.id = id;
        return this;
    }
}
