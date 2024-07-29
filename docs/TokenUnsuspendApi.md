# TokenUnsuspendApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**unsuspendAToken**](TokenUnsuspendApi.md#unsuspendAToken) | **POST** /{id}/token/unsuspend | Changes a token state from suspended to active. |


<a id="unsuspendAToken"></a>
# **unsuspendAToken**
> TokenUnsuspendResults unsuspendAToken(id, tokenUnsuspend)

Changes a token state from suspended to active.

Used to unsuspend or resume a suspended token and return it to the active state where it may initiate new transactions. Tokens may be suspended by multiple parties (suspenders) concurrently. The token status is updated from ACTIVE to SUSPENDED when the first suspender triggers a suspend action. Additional suspenders can add their suspend action to the list of suspenders. Suspenders can unsuspend only their own suspend action. All suspenders need to perform an unsuspend action to move a token from SUSPENDED to ACTIVE. The token status will only change when the last suspender has unsuspended the token.  For CoF tokens, the only two supported suspenders are issuer and token requestor.  For Apple Pay tokens, there are some differences in behavior versus the general principles. An issuer may add themselves as a suspender to a token already suspended by a cardholder, as above. However, a cardholder cannot suspend a token already suspended by the issuer. As a special case for Apple Pay, an issuer may unsuspend (override) a token already suspended by a cardholder. However, a cardholder cannot unsuspend a token already suspended by the issuer. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenUnsuspendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenUnsuspendApi apiInstance = new TokenUnsuspendApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenUnsuspend tokenUnsuspend = new TokenUnsuspend(); // TokenUnsuspend | JSON object containing parameters for unsuspending a token
    try {
      TokenUnsuspendResults result = apiInstance.unsuspendAToken(id, tokenUnsuspend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenUnsuspendApi#unsuspendAToken");
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
| **tokenUnsuspend** | [**TokenUnsuspend**](TokenUnsuspend.md)| JSON object containing parameters for unsuspending a token | |

### Return type

[**TokenUnsuspendResults**](TokenUnsuspendResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to a token unsuspension |  -  |

