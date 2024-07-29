# TokenResendActivationCodeApi

All URIs are relative to *https://sandbox.api.mastercard.com/mdes/csapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendActivationCode**](TokenResendActivationCodeApi.md#sendActivationCode) | **POST** /{id}/token/resendactivationcode | Initiates the sending of the Activation Code for a specific token to the account holder. |


<a id="sendActivationCode"></a>
# **sendActivationCode**
> TokenResendActivationCodeResults sendActivationCode(id, tokenResendActivationCode)

Initiates the sending of the Activation Code for a specific token to the account holder.

Used to trigger the process of generating and sending a new Activation Code (for a specific token) to the cardholder via the requested Activation Method. When successful, a new Activation Code Expiration Date Time period will begin, and a new Activation Code will be sent to the issuer using the Activation Code Notification (ACN) pre-digitization network message. It can only be used to do this for Activation Methods that involve the external distribution of an Activation Code to the cardholder. For example, via email or SMS. It cannot be used to send a new activation code via the \&quot;Mobile Application\&quot; activation method. 

### Example
```java
// Import classes:
import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.Configuration;
import com.example.mastercard.models.*;
import com.example.mastercard.api.TokenResendActivationCodeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");

    TokenResendActivationCodeApi apiInstance = new TokenResendActivationCodeApi(defaultClient);
    String id = "v2"; // String | Static endpoint iteration number (Not API Version)
    TokenResendActivationCode tokenResendActivationCode = new TokenResendActivationCode(); // TokenResendActivationCode | JSON object containing parameters required for resending an activation code for a given token
    try {
      TokenResendActivationCodeResults result = apiInstance.sendActivationCode(id, tokenResendActivationCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenResendActivationCodeApi#sendActivationCode");
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
| **tokenResendActivationCode** | [**TokenResendActivationCode**](TokenResendActivationCode.md)| JSON object containing parameters required for resending an activation code for a given token | |

### Return type

[**TokenResendActivationCodeResults**](TokenResendActivationCodeResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the token unique reference of the token which required the activation code.  |  -  |

