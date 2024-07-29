# TokenDeleteApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenDelete**](TokenDeleteApi.md#tokenDelete) | **POST** /{id}/token/delete | Deletes a token. |


<a id="tokenDelete"></a>
# **tokenDelete**
> TokenDeleteResults tokenDelete(id, tokenDelete)

Deletes a token.

Used to delete a token so that it may not initiate any new transactions. All authorizations for a deleted token will be declined. A deleted token may not be returned to an active state. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenDeleteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenDeleteApi apiInstance = new TokenDeleteApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenDelete tokenDelete = new TokenDelete(); // TokenDelete | JSON object containing parameters for deleting a token
    try {
      TokenDeleteResults result = apiInstance.tokenDelete(id, tokenDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenDeleteApi#tokenDelete");
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
| **tokenDelete** | [**TokenDelete**](TokenDelete.md)| JSON object containing parameters for deleting a token | |

### Return type

[**TokenDeleteResults**](TokenDeleteResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to a token deletion |  -  |

