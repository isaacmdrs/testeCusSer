# TokenActivateApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenActivation**](TokenActivateApi.md#tokenActivation) | **POST** /{id}/token/activate | Performs the first time activation of a token. |


<a id="tokenActivation"></a>
# **tokenActivation**
> TokenActivateResults tokenActivation(id, tokenActivate)

Performs the first time activation of a token.

Used to activate a token for a digitization that has been approved and provisioned, but requires additional cardholder authentication prior to activation. If the provisioning was not completed successfully, activation cannot be accomplished using Customer Service API. It is expected that a cardholder will complete the authentication process using an issuer&#39;s call center or using an issuer-supplied mobile application, and only then should the issuer use this API to activate the token. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenActivateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenActivateApi apiInstance = new TokenActivateApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenActivate tokenActivate = new TokenActivate(); // TokenActivate | JSON object containing parameters for activating a token
    try {
      TokenActivateResults result = apiInstance.tokenActivation(id, tokenActivate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenActivateApi#tokenActivation");
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
| **tokenActivate** | [**TokenActivate**](TokenActivate.md)| JSON object containing parameters for activating a token | |

### Return type

[**TokenActivateResults**](TokenActivateResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token Activation Response |  -  |

