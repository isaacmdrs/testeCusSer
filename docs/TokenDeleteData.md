

# TokenDeleteData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenUniqueReference** | **String** | The TokenUniqueReference of the token. Length 48 characters. |  |
|**commentText** | **String** | Comment related to suspension. |  [optional] |
|**reasonCode** | **String** | The reason for the action. Valid values:   * \&quot;L\&quot; - Cardholder confirmed token device lost   * \&quot;S\&quot; - Cardholder confirmed token device stolen   * \&quot;F\&quot; - Issuer or cardholder confirmed fraudulent token transactions (Deprecated)   * \&quot;T\&quot; - Issuer or cardholder confirmed fraudulent token transactions   * \&quot;C\&quot; - Account closed   * \&quot;D\&quot; - Issuer consumer deleted   * \&quot;Z\&quot; - Other  |  |
|**deleteFromConsumerApp** | **String** | Indicates if the token should be deleted only from the device/token requestor or both device and the MDES platform. Valid values:   * \&quot;true\&quot; - the token will be removed only from the device/token requestor but will remain active on the MDES platform. Any historical payments (such as subscriptions) will continue to be processed but no new payments will be possible as the token will have been removed from the device/token requestor.   * \&quot;false\&quot; - the token will be deleted from both the device/token requestor and the MDES platform.  |  [optional] |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  |



