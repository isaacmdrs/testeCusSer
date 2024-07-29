# TransactionsApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionHistory**](TransactionsApi.md#transactionHistory) | **POST** /{id}/transactions | Displays transactions performed with the token at any POI (Point of Interaction). |


<a id="transactionHistory"></a>
# **transactionHistory**
> TokenTransactionsResults transactionHistory(id, tokenTransactions)

Displays transactions performed with the token at any POI (Point of Interaction).

Used to retrieve transactions performed by a token. It only returns transactions performed within the last 30 days, to help identify a particular token, or to identify a particular recent transaction. It is not intended to provide the full transaction history of a token or Account PAN. NOTE: The Transaction History API response is not supported for static Card on File (CoF) tokens. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenTransactions tokenTransactions = new TokenTransactions(); // TokenTransactions | JSON object containing parameters for obtaining transactions performed by a token in the last 30 days
    try {
      TokenTransactionsResults result = apiInstance.transactionHistory(id, tokenTransactions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#transactionHistory");
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
| **tokenTransactions** | [**TokenTransactions**](TokenTransactions.md)| JSON object containing parameters for obtaining transactions performed by a token in the last 30 days | |

### Return type

[**TokenTransactionsResults**](TokenTransactionsResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing transactions performed by the token in the last 30 days |  -  |

