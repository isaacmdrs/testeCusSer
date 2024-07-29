# TokenResetMobilePinApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resetMobilePin**](TokenResetMobilePinApi.md#resetMobilePin) | **POST** /{id}/token/resetmobilepin | Requests the reset of the PIN associated with a Mastercard Cloud-Based Payment token. |


<a id="resetMobilePin"></a>
# **resetMobilePin**
> TokenResetMobilePinResults resetMobilePin(id, tokenResetMobilePin)

Requests the reset of the PIN associated with a Mastercard Cloud-Based Payment token.

Used to request that the Mobile PIN for a Mastercard Cloud-Based Payment token in a single issuer wallet is reset. The request is passed to the Credential Management System for processing. When the Mobile PIN is a token-level PIN (as opposed to a wallet-level PIN), the cardholder must choose a new PIN within 10 minutes of a Reset Mobile PIN action. Otherwise, the reset will need to be re-requested. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenResetMobilePinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenResetMobilePinApi apiInstance = new TokenResetMobilePinApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenResetMobilePin tokenResetMobilePin = new TokenResetMobilePin(); // TokenResetMobilePin | JSON object containing parameters to initiate a mobile pin reset
    try {
      TokenResetMobilePinResults result = apiInstance.resetMobilePin(id, tokenResetMobilePin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenResetMobilePinApi#resetMobilePin");
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
| **tokenResetMobilePin** | [**TokenResetMobilePin**](TokenResetMobilePin.md)| JSON object containing parameters to initiate a mobile pin reset | |

### Return type

[**TokenResetMobilePinResults**](TokenResetMobilePinResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON object containing the results of a mobile pin reset |  -  |

