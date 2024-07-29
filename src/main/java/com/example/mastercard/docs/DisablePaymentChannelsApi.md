# DisablePaymentChannelsApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**disablePaymentChannels**](DisablePaymentChannelsApi.md#disablePaymentChannels) | **POST** /{id}/token/disablepaymentchannels | Disables one or more payment channels associated with a token in the India market. |


<a id="disablePaymentChannels"></a>
# **disablePaymentChannels**
> DisablePaymentChannelsResults disablePaymentChannels(id, disablePaymentChannels)

Disables one or more payment channels associated with a token in the India market.

Applicable to the India market only, this API is used to disable specific payment channels for a token.  A transaction submitted with a POS Entry mode for a disabled channel will be declined.  If disabledPaymentChannels are provided the current list of disabled channels will be returned. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.DisablePaymentChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    DisablePaymentChannelsApi apiInstance = new DisablePaymentChannelsApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    DisablePaymentChannels disablePaymentChannels = new DisablePaymentChannels(); // DisablePaymentChannels | JSON object containing parameters Disable selected payment channels
    try {
      DisablePaymentChannelsResults result = apiInstance.disablePaymentChannels(id, disablePaymentChannels);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DisablePaymentChannelsApi#disablePaymentChannels");
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
| **disablePaymentChannels** | [**DisablePaymentChannels**](DisablePaymentChannels.md)| JSON object containing parameters Disable selected payment channels | |

### Return type

[**DisablePaymentChannelsResults**](DisablePaymentChannelsResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disable Payment Channels Response |  -  |

