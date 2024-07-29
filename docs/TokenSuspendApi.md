# TokenSuspendApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**suspendAToken**](TokenSuspendApi.md#suspendAToken) | **POST** /{id}/token/suspend | Changes a token state from active to suspended. |


<a id="suspendAToken"></a>
# **suspendAToken**
> TokenSuspendResults suspendAToken(id, tokenSuspend)

Changes a token state from active to suspended.

Used to suspend an active token so that it may not initiate any new transactions. All authorizations for a SUSPENDED token will be declined. Tokens may be suspended by multiple parties (suspenders) concurrently. The token status is updated from ACTIVE to SUSPENDED when the first suspender triggers a suspend action. Additional suspenders can add their suspend action to the list of suspenders. Suspenders can unsuspend only their own suspend action. All suspenders need to perform an unsuspend action to move a token from SUSPENDED to ACTIVE. The token status will only change when the last suspender has unsuspended the token.  For CoF tokens, the only two supported suspenders are issuer and token requestor.  For Apple Pay tokens, there are some differences in behavior versus the general principles. An issuer may add themselves as a suspender to a token already suspended by a cardholder, as above. However, a cardholder cannot suspend a token already suspended by the issuer. As a special case for Apple Pay, an issuer may unsuspend (override) a token already suspended by a cardholder. However, a cardholder cannot unsuspend a token already suspended by the issuer. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenSuspendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenSuspendApi apiInstance = new TokenSuspendApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenSuspend tokenSuspend = new TokenSuspend(); // TokenSuspend | JSON object containing parameters for updating a token
    try {
      TokenSuspendResults result = apiInstance.suspendAToken(id, tokenSuspend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenSuspendApi#suspendAToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Static endpoint iteration number (Not API Version) | |
| **tokenSuspend** | [**TokenSuspend**](TokenSuspend.md)| JSON object containing parameters for updating a token | |

### Return type

[**TokenSuspendResults**](TokenSuspendResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to a token suspension |  -  |

