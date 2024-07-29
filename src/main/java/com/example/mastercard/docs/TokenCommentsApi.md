# TokenCommentsApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenComments**](TokenCommentsApi.md#tokenComments) | **POST** /{id}/token/comments | Displays comments previously submitted on a token. |


<a id="tokenComments"></a>
# **tokenComments**
> TokenCommentsResults tokenComments(id, tokenComments)

Displays comments previously submitted on a token.

Used to retrieve all comments associated with a token. Typically the response includes comments created earlier by Issuer Customer Service representatives detailing additional information about a particular inquiry or event. There may also be comments with warnings of potential fraud. These comments are created automatically by the MDES system when a Token requestor indicates a high risk of fraud during digitization. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenCommentsApi apiInstance = new TokenCommentsApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenComments tokenComments = new TokenComments(); // TokenComments | JSON object containing parameters for obtaining all comments assocaited to a token
    try {
      TokenCommentsResults result = apiInstance.tokenComments(id, tokenComments);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenCommentsApi#tokenComments");
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
| **tokenComments** | [**TokenComments**](TokenComments.md)| JSON object containing parameters for obtaining all comments assocaited to a token | |

### Return type

[**TokenCommentsResults**](TokenCommentsResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing all of the comments for a given token |  -  |

