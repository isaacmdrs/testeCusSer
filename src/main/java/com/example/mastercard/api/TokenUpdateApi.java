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


import com.example.mastercard.model.TokenUpdate;
import com.example.mastercard.model.TokenUpdateResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenUpdateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenUpdateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenUpdateApi(ApiClient apiClient) {
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
     * Build call for updateAToken
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenUpdate JSON object containing parameters for updating a token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Token Update Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateATokenCall(String id, TokenUpdate tokenUpdate, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tokenUpdate;

        // create path and map variables
        String localVarPath = "/{id}/token/update"
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
    private okhttp3.Call updateATokenValidateBeforeCall(String id, TokenUpdate tokenUpdate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateAToken(Async)");
        }

        // verify the required parameter 'tokenUpdate' is set
        if (tokenUpdate == null) {
            throw new ApiException("Missing the required parameter 'tokenUpdate' when calling updateAToken(Async)");
        }

        return updateATokenCall(id, tokenUpdate, _callback);

    }

    /**
     * Updates data belonging to one or more tokens.
     * Used to update Account PAN Mapping Information or Issuer Product Configuration ID associated to a provisioned token. To update a specific token, the API should be requested using the Token Unique Reference. To update all tokens mapped to a specific Account PAN, the API should be requested using the Account PAN. In either case, updates will only be applied to tokens in ACTIVE or SUSPENDED state, not those in IN PROGRESS or DELETED state. When updating Account PAN Mapping information, the Account PAN, Expiration Date, and Sequence Number may be updated individually or in any combination. Only the information provided will be updated. For Incontrol Issuers, updating Account Mapping Information for a Real Card Number (RCN) to provisioned token(s) will not be supported and will return an &#39;EMPTY_RESULT&#39; with a HTTP 400 in the response. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenUpdate JSON object containing parameters for updating a token (required)
     * @return TokenUpdateResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Token Update Response </td><td>  -  </td></tr>
     </table>
     */
    public TokenUpdateResults updateAToken(String id, TokenUpdate tokenUpdate) throws ApiException {
        ApiResponse<TokenUpdateResults> localVarResp = updateATokenWithHttpInfo(id, tokenUpdate);
        return localVarResp.getData();
    }

    /**
     * Updates data belonging to one or more tokens.
     * Used to update Account PAN Mapping Information or Issuer Product Configuration ID associated to a provisioned token. To update a specific token, the API should be requested using the Token Unique Reference. To update all tokens mapped to a specific Account PAN, the API should be requested using the Account PAN. In either case, updates will only be applied to tokens in ACTIVE or SUSPENDED state, not those in IN PROGRESS or DELETED state. When updating Account PAN Mapping information, the Account PAN, Expiration Date, and Sequence Number may be updated individually or in any combination. Only the information provided will be updated. For Incontrol Issuers, updating Account Mapping Information for a Real Card Number (RCN) to provisioned token(s) will not be supported and will return an &#39;EMPTY_RESULT&#39; with a HTTP 400 in the response. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenUpdate JSON object containing parameters for updating a token (required)
     * @return ApiResponse&lt;TokenUpdateResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Token Update Response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenUpdateResults> updateATokenWithHttpInfo(String id, TokenUpdate tokenUpdate) throws ApiException {
        okhttp3.Call localVarCall = updateATokenValidateBeforeCall(id, tokenUpdate, null);
        Type localVarReturnType = new TypeToken<TokenUpdateResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates data belonging to one or more tokens. (asynchronously)
     * Used to update Account PAN Mapping Information or Issuer Product Configuration ID associated to a provisioned token. To update a specific token, the API should be requested using the Token Unique Reference. To update all tokens mapped to a specific Account PAN, the API should be requested using the Account PAN. In either case, updates will only be applied to tokens in ACTIVE or SUSPENDED state, not those in IN PROGRESS or DELETED state. When updating Account PAN Mapping information, the Account PAN, Expiration Date, and Sequence Number may be updated individually or in any combination. Only the information provided will be updated. For Incontrol Issuers, updating Account Mapping Information for a Real Card Number (RCN) to provisioned token(s) will not be supported and will return an &#39;EMPTY_RESULT&#39; with a HTTP 400 in the response. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenUpdate JSON object containing parameters for updating a token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Token Update Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateATokenAsync(String id, TokenUpdate tokenUpdate, final ApiCallback<TokenUpdateResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateATokenValidateBeforeCall(id, tokenUpdate, _callback);
        Type localVarReturnType = new TypeToken<TokenUpdateResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
