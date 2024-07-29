# TokenUpdateApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateAToken**](TokenUpdateApi.md#updateAToken) | **POST** /{id}/token/update | Updates data belonging to one or more tokens. |


<a id="updateAToken"></a>
# **updateAToken**
> TokenUpdateResults updateAToken(id, tokenUpdate)

Updates data belonging to one or more tokens.

Used to update Account PAN Mapping Information or Issuer Product Configuration ID associated to a provisioned token. To update a specific token, the API should be requested using the Token Unique Reference. To update all tokens mapped to a specific Account PAN, the API should be requested using the Account PAN. In either case, updates will only be applied to tokens in ACTIVE or SUSPENDED state, not those in IN PROGRESS or DELETED state. When updating Account PAN Mapping information, the Account PAN, Expiration Date, and Sequence Number may be updated individually or in any combination. Only the information provided will be updated. For Incontrol Issuers, updating Account Mapping Information for a Real Card Number (RCN) to provisioned token(s) will not be supported and will return an &#39;EMPTY_RESULT&#39; with a HTTP 400 in the response. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenUpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenUpdateApi apiInstance = new TokenUpdateApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenUpdate tokenUpdate = new TokenUpdate(); // TokenUpdate | JSON object containing parameters for updating a token
    try {
      TokenUpdateResults result = apiInstance.updateAToken(id, tokenUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenUpdateApi#updateAToken");
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
| **tokenUpdate** | [**TokenUpdate**](TokenUpdate.md)| JSON object containing parameters for updating a token | |

### Return type

[**TokenUpdateResults**](TokenUpdateResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token Update Response |  -  |

