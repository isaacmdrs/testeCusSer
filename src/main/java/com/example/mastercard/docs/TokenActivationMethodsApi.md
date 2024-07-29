# TokenActivationMethodsApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**showActivationMethods**](TokenActivationMethodsApi.md#showActivationMethods) | **POST** /{id}/token/activationmethods | Shows the activation methods available for an inactive token. |


<a id="showActivationMethods"></a>
# **showActivationMethods**
> TokenActivationMethodsResults showActivationMethods(id, tokenActivationMethods)

Shows the activation methods available for an inactive token.

Used to retrieve the available Activation Methods for a token that is awaiting activation. Activation Methods are the means by which a cardholder may complete cardholder authentication with the issuer beyond the scope of MDES. It is possible that there are no Activation Methods for a token when an issuer did not provide any cardholder-specific information with the Tokenization Authorization Request (TAR) pre-digitization network message response. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenActivationMethodsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenActivationMethodsApi apiInstance = new TokenActivationMethodsApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenActivationMethods tokenActivationMethods = new TokenActivationMethods(); // TokenActivationMethods | JSON object containing parameters for obtaining authentication methods for a given token
    try {
      TokenActivationMethodsResults result = apiInstance.showActivationMethods(id, tokenActivationMethods);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenActivationMethodsApi#showActivationMethods");
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
| **tokenActivationMethods** | [**TokenActivationMethods**](TokenActivationMethods.md)| JSON object containing parameters for obtaining authentication methods for a given token | |

### Return type

[**TokenActivationMethodsResults**](TokenActivationMethodsResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Activation Methods for a token that is awaiting activation.  |  -  |

