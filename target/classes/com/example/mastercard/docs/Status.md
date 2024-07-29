

# Status


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusCode** | **String** | The status of the Token. Valid values:   * \&quot;U\&quot; - Unmapped. The token has not yet been linked to the Account PAN. The process of tokenization is &#39;In Progress&#39;.   * \&quot;A\&quot; - Active. The token is linked to the Account PAN and may initiate new transactions to be authorized.   * \&quot;S\&quot; - Suspended. The token is linked to the Account PAN but may not perform transactions at the request of one or more suspenders.   * \&quot;D\&quot; - Deleted. The token is logically deleted but is still linked to the Account PAN for the purposes of post-authorization transaction processing.  |  [optional] |
|**statusDescription** | **String** | Description of the current status. |  [optional] |
|**statusDateTime** | **String** | Date and time the status was updated. String, ISO 8691 format - YYYY-MM-DDThh:mm:ssTZD . |  [optional] |
|**initiator** | **String** | Party that initiated the status update. Valid values:   * \&quot;I\&quot; - Issuer.   * \&quot;W\&quot; - Token Requestor (including Wallet Provider).   * \&quot;C\&quot; - Cardholder.   * \&quot;P\&quot; - Mobile PIN Validation service.   * \&quot;M\&quot; - Mobile PIN Change Validation service.  |  [optional] |
|**commentId** | **String** | Identifier of the comment added.  Conditional field, only present when comment text was provided in the request. |  [optional] |
|**reasonCode** | **String** | Reason for the status update.  Valid values:   * \&quot;A\&quot; - Cardholder successfully authenticated using a mobile App prior to activation.   * \&quot;C\&quot; - Cardholder successfully authenticated with a customer service agent prior to activation. (For &#39;Token Activate&#39;).   * \&quot;C\&quot; - Account closed. (For &#39;Token Delete&#39;).   * \&quot;F\&quot; - Cardholder reported token device found or not stolen.   * \&quot;L\&quot; - Cardholder reported/confirmed token device lost.   * \&quot;S\&quot; - Cardholder reported/confirmed token device stolen.   * \&quot;T\&quot; - Issuer or cardholder reported fraudulent/then confirmed no fraudulent token transactions.   * \&quot;Z\&quot; - Other.  |  [optional] |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  [optional] |



