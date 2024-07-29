# TokenRequestorSearchApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenRequestorSearch**](TokenRequestorSearchApi.md#tokenRequestorSearch) | **POST** /{id}/tokenrequestorsearch | API returns supported token requestors who support Token Connect |


<a id="tokenRequestorSearch"></a>
# **tokenRequestorSearch**
> TokenRequestorSearchResults tokenRequestorSearch(id, tokenRequestorSearch)

API returns supported token requestors who support Token Connect

Provides the ability to search for Token Requestor Information based on the TokenRequestorId.

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenRequestorSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenRequestorSearchApi apiInstance = new TokenRequestorSearchApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenRequestorSearch tokenRequestorSearch = new TokenRequestorSearch(); // TokenRequestorSearch | Parameters to search for a token requestor
    try {
      TokenRequestorSearchResults result = apiInstance.tokenRequestorSearch(id, tokenRequestorSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenRequestorSearchApi#tokenRequestorSearch");
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
| **tokenRequestorSearch** | [**TokenRequestorSearch**](TokenRequestorSearch.md)| Parameters to search for a token requestor | |

### Return type

[**TokenRequestorSearchResults**](TokenRequestorSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Parameters returned when searching for a token requestor |  -  |

