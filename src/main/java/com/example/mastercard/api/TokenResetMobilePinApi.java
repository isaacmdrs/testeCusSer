/*
 * Mastercard Digital Enablement Service Customer Service API
 * The MDES Customer Service API provides our Issuer partners with resources to help resolve consumer queries about payment accounts enabled through our digitization platform.
 *
 * The version of the OpenAPI document: 2.1.7
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.mastercard.api;

import com.example.mastercard.ApiCallback;
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.ApiResponse;
import com.example.mastercard.Configuration;
import com.example.mastercard.Pair;
import com.example.mastercard.ProgressRequestBody;
import com.example.mastercard.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.example.mastercard.model.TokenResetMobilePin;
import com.example.mastercard.model.TokenResetMobilePinResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenResetMobilePinApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenResetMobilePinApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenResetMobilePinApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for resetMobilePin
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResetMobilePin JSON object containing parameters to initiate a mobile pin reset (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON object containing the results of a mobile pin reset </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetMobilePinCall(String id, TokenResetMobilePin tokenResetMobilePin, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = tokenResetMobilePin;

        // create path and map variables
        String localVarPath = "/{id}/token/resetmobilepin"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resetMobilePinValidateBeforeCall(String id, TokenResetMobilePin tokenResetMobilePin, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling resetMobilePin(Async)");
        }

        // verify the required parameter 'tokenResetMobilePin' is set
        if (tokenResetMobilePin == null) {
            throw new ApiException("Missing the required parameter 'tokenResetMobilePin' when calling resetMobilePin(Async)");
        }

        return resetMobilePinCall(id, tokenResetMobilePin, _callback);

    }

    /**
     * Requests the reset of the PIN associated with a Mastercard Cloud-Based Payment token.
     * Used to request that the Mobile PIN for a Mastercard Cloud-Based Payment token in a single issuer wallet is reset. The request is passed to the Credential Management System for processing. When the Mobile PIN is a token-level PIN (as opposed to a wallet-level PIN), the cardholder must choose a new PIN within 10 minutes of a Reset Mobile PIN action. Otherwise, the reset will need to be re-requested. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResetMobilePin JSON object containing parameters to initiate a mobile pin reset (required)
     * @return TokenResetMobilePinResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON object containing the results of a mobile pin reset </td><td>  -  </td></tr>
     </table>
     */
    public TokenResetMobilePinResults resetMobilePin(String id, TokenResetMobilePin tokenResetMobilePin) throws ApiException {
        ApiResponse<TokenResetMobilePinResults> localVarResp = resetMobilePinWithHttpInfo(id, tokenResetMobilePin);
        return localVarResp.getData();
    }

    /**
     * Requests the reset of the PIN associated with a Mastercard Cloud-Based Payment token.
     * Used to request that the Mobile PIN for a Mastercard Cloud-Based Payment token in a single issuer wallet is reset. The request is passed to the Credential Management System for processing. When the Mobile PIN is a token-level PIN (as opposed to a wallet-level PIN), the cardholder must choose a new PIN within 10 minutes of a Reset Mobile PIN action. Otherwise, the reset will need to be re-requested. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResetMobilePin JSON object containing parameters to initiate a mobile pin reset (required)
     * @return ApiResponse&lt;TokenResetMobilePinResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON object containing the results of a mobile pin reset </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenResetMobilePinResults> resetMobilePinWithHttpInfo(String id, TokenResetMobilePin tokenResetMobilePin) throws ApiException {
        okhttp3.Call localVarCall = resetMobilePinValidateBeforeCall(id, tokenResetMobilePin, null);
        Type localVarReturnType = new TypeToken<TokenResetMobilePinResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Requests the reset of the PIN associated with a Mastercard Cloud-Based Payment token. (asynchronously)
     * Used to request that the Mobile PIN for a Mastercard Cloud-Based Payment token in a single issuer wallet is reset. The request is passed to the Credential Management System for processing. When the Mobile PIN is a token-level PIN (as opposed to a wallet-level PIN), the cardholder must choose a new PIN within 10 minutes of a Reset Mobile PIN action. Otherwise, the reset will need to be re-requested. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResetMobilePin JSON object containing parameters to initiate a mobile pin reset (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON object containing the results of a mobile pin reset </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetMobilePinAsync(String id, TokenResetMobilePin tokenResetMobilePin, final ApiCallback<TokenResetMobilePinResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = resetMobilePinValidateBeforeCall(id, tokenResetMobilePin, _callback);
        Type localVarReturnType = new TypeToken<TokenResetMobilePinResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
