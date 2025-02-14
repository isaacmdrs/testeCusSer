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


import com.example.mastercard.model.TokenResendActivationCode;
import com.example.mastercard.model.TokenResendActivationCodeResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenResendActivationCodeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenResendActivationCodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenResendActivationCodeApi(ApiClient apiClient) {
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
     * Build call for sendActivationCode
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResendActivationCode JSON object containing parameters required for resending an activation code for a given token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response containing the token unique reference of the token which required the activation code.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendActivationCodeCall(String id, TokenResendActivationCode tokenResendActivationCode, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tokenResendActivationCode;

        // create path and map variables
        String localVarPath = "/{id}/token/resendactivationcode"
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
    private okhttp3.Call sendActivationCodeValidateBeforeCall(String id, TokenResendActivationCode tokenResendActivationCode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling sendActivationCode(Async)");
        }

        // verify the required parameter 'tokenResendActivationCode' is set
        if (tokenResendActivationCode == null) {
            throw new ApiException("Missing the required parameter 'tokenResendActivationCode' when calling sendActivationCode(Async)");
        }

        return sendActivationCodeCall(id, tokenResendActivationCode, _callback);

    }

    /**
     * Initiates the sending of the Activation Code for a specific token to the account holder.
     * Used to trigger the process of generating and sending a new Activation Code (for a specific token) to the cardholder via the requested Activation Method. When successful, a new Activation Code Expiration Date Time period will begin, and a new Activation Code will be sent to the issuer using the Activation Code Notification (ACN) pre-digitization network message. It can only be used to do this for Activation Methods that involve the external distribution of an Activation Code to the cardholder. For example, via email or SMS. It cannot be used to send a new activation code via the \&quot;Mobile Application\&quot; activation method. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResendActivationCode JSON object containing parameters required for resending an activation code for a given token (required)
     * @return TokenResendActivationCodeResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response containing the token unique reference of the token which required the activation code.  </td><td>  -  </td></tr>
     </table>
     */
    public TokenResendActivationCodeResults sendActivationCode(String id, TokenResendActivationCode tokenResendActivationCode) throws ApiException {
        ApiResponse<TokenResendActivationCodeResults> localVarResp = sendActivationCodeWithHttpInfo(id, tokenResendActivationCode);
        return localVarResp.getData();
    }

    /**
     * Initiates the sending of the Activation Code for a specific token to the account holder.
     * Used to trigger the process of generating and sending a new Activation Code (for a specific token) to the cardholder via the requested Activation Method. When successful, a new Activation Code Expiration Date Time period will begin, and a new Activation Code will be sent to the issuer using the Activation Code Notification (ACN) pre-digitization network message. It can only be used to do this for Activation Methods that involve the external distribution of an Activation Code to the cardholder. For example, via email or SMS. It cannot be used to send a new activation code via the \&quot;Mobile Application\&quot; activation method. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResendActivationCode JSON object containing parameters required for resending an activation code for a given token (required)
     * @return ApiResponse&lt;TokenResendActivationCodeResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response containing the token unique reference of the token which required the activation code.  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenResendActivationCodeResults> sendActivationCodeWithHttpInfo(String id, TokenResendActivationCode tokenResendActivationCode) throws ApiException {
        okhttp3.Call localVarCall = sendActivationCodeValidateBeforeCall(id, tokenResendActivationCode, null);
        Type localVarReturnType = new TypeToken<TokenResendActivationCodeResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Initiates the sending of the Activation Code for a specific token to the account holder. (asynchronously)
     * Used to trigger the process of generating and sending a new Activation Code (for a specific token) to the cardholder via the requested Activation Method. When successful, a new Activation Code Expiration Date Time period will begin, and a new Activation Code will be sent to the issuer using the Activation Code Notification (ACN) pre-digitization network message. It can only be used to do this for Activation Methods that involve the external distribution of an Activation Code to the cardholder. For example, via email or SMS. It cannot be used to send a new activation code via the \&quot;Mobile Application\&quot; activation method. 
     * @param id Static endpoint iteration number (Not API Version) (required)
     * @param tokenResendActivationCode JSON object containing parameters required for resending an activation code for a given token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response containing the token unique reference of the token which required the activation code.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendActivationCodeAsync(String id, TokenResendActivationCode tokenResendActivationCode, final ApiCallback<TokenResendActivationCodeResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendActivationCodeValidateBeforeCall(id, tokenResendActivationCode, _callback);
        Type localVarReturnType = new TypeToken<TokenResendActivationCodeResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
