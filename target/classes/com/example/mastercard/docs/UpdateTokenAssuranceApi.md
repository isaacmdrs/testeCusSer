# UpdateTokenAssuranceApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenAssuranceUpdate**](UpdateTokenAssuranceApi.md#tokenAssuranceUpdate) | **POST** /{id}/updatetokenassurance | Changes the Assurance Level of an eligible token. |


<a id="tokenAssuranceUpdate"></a>
# **tokenAssuranceUpdate**
> UpdateTokenAssuranceResults tokenAssuranceUpdate(id, updateTokenAssurance)

Changes the Assurance Level of an eligible token.

Used after an issuer has performed additional cardholder authentication to indicate an increased level of token assurance. It will only be applied to tokens that actually have a Token Assurance Level, and those that are in ACTIVE or SUSPENDED state. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.UpdateTokenAssuranceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    UpdateTokenAssuranceApi apiInstance = new UpdateTokenAssuranceApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    UpdateTokenAssurance updateTokenAssurance = new UpdateTokenAssurance(); // UpdateTokenAssurance | JSON object containing parameters to update the Token Assurance value
    try {
      UpdateTokenAssuranceResults result = apiInstance.tokenAssuranceUpdate(id, updateTokenAssurance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateTokenAssuranceApi#tokenAssuranceUpdate");
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
| **updateTokenAssurance** | [**UpdateTokenAssurance**](UpdateTokenAssurance.md)| JSON object containing parameters to update the Token Assurance value | |

### Return type

[**UpdateTokenAssuranceResults**](UpdateTokenAssuranceResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON object containing the results of the update to the Token Assurance value |  -  |

