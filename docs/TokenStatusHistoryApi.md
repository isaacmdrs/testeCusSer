# TokenStatusHistoryApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenStatusHistory**](TokenStatusHistoryApi.md#tokenStatusHistory) | **POST** /{id}/token/statushistory | Displays a token&#39;s previous statuses and lifecycle changes. |


<a id="tokenStatusHistory"></a>
# **tokenStatusHistory**
> TokenStatusHistoryResults tokenStatusHistory(id, tokenStatusHistory)

Displays a token&#39;s previous statuses and lifecycle changes.

Used to retrieve the historical statuses and lifecycle events  for a token, such as suspended, resumed, and finally deleted. For any FPAN, Expiry Date or PSN update,  this API will also return the corresponding updated status as part of the historical data. Note: the initial activation of the token will not be returned  with this API. We recommend all our partners to do a &#39;Search&#39;  to verify that the token was activated. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenStatusHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenStatusHistoryApi apiInstance = new TokenStatusHistoryApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenStatusHistory tokenStatusHistory = new TokenStatusHistory(); // TokenStatusHistory | JSON object containing parameters for obtaining history of a token
    try {
      TokenStatusHistoryResults result = apiInstance.tokenStatusHistory(id, tokenStatusHistory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenStatusHistoryApi#tokenStatusHistory");
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
| **tokenStatusHistory** | [**TokenStatusHistory**](TokenStatusHistory.md)| JSON object containing parameters for obtaining history of a token | |

### Return type

[**TokenStatusHistoryResults**](TokenStatusHistoryResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the history of a given token |  -  |

