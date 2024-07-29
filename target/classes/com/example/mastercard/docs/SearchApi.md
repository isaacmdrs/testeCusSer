# SearchApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchForAToken**](SearchApi.md#searchForAToken) | **POST** /{id}/search | Retrieves information associated with one or more tokens. |


<a id="searchForAToken"></a>
# **searchForAToken**
> SearchResults searchForAToken(id, search)

Retrieves information associated with one or more tokens.

Provides the ability to search for tokens based on Account PAN, Alternate Account Identifier, Token Unique Reference(TUR), Token, Payment App Instance Id, Comment Id, or Virtual Card Number. Returns all of the tokens associated with an account according to the scope of the indicated search request criteria. The response includes key state and informational data for each token, including the Token Unique Reference which is needed for subsequent token lifecycle management activities. Note - The Search API request must include only one of the available search methods Account PAN, Token Unique Reference, Token, Payment App Instance Id, Comment Id, Alternate Account Identifier, or Virtual Card Number. They cannot be used together in a single request. For Incontrol Issuers, searching based on a Real Card Number (RCN) will not be supported  and will return an &#39;EMPTY_RESULT&#39; with a HTTP 200 in the response. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    Search search = new Search(); // Search | JSON object containing parameters to search for Tokens
    try {
      SearchResults result = apiInstance.searchForAToken(id, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchForAToken");
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
| **search** | [**Search**](Search.md)| JSON object containing parameters to search for Tokens | |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful search response |  -  |
| **0** | JSON object containing details of why the operation failed |  -  |

