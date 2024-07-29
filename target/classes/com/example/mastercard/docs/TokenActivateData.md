

# TokenActivateData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedAccountInformation** | [**EncryptedAccountInformation**](EncryptedAccountInformation.md) |  |  [optional] |
|**tokenUniqueReference** | **String** | TokenUniqueReference for the token to be activated. Conditional field, present when AccountPan and PaymentAppInstanceId are not present. |  [optional] |
|**paymentAppInstanceId** | **String** | Identifier of the Payment App instance within a device that will be provisioned with a token. NOTE - This may contain the identifier of the Secure Element or a mobile device for some programs. Conditional field, must be present when &#x60;EncryptedAccountInformation.EncryptedData.AccountPan&#x60; is present. Must not be present when TokenUniqueReference is present. |  [optional] |
|**commentText** | **String** | Comment related to activating this token. |  [optional] |
|**reasonCode** | **String** | Reason for the activation. Valid values:   * \&quot;A\&quot; - Cardholder successfully authenticated with an activation method (activation code by text message, email, Issuer mobile application etc...) prior to activation.   * \&quot;C\&quot; - Cardholder successfully authenticated with a customer service agent prior to activation.  |  |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  |



