

# TokenSuspendData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenUniqueReference** | **String** | The TokenUniqueReference of the token. Length - 48 Characters |  |
|**commentText** | **String** | Comment related to suspension. |  [optional] |
|**reasonCode** | **String** | The reason for the action. Valid values:   * \&quot;L\&quot; - Cardholder reported token device lost.   * \&quot;S\&quot; - Cardholder reported token device stolen.   * \&quot;T\&quot; - Issue or cardholder reported fraudulent token transactions.   * \&quot;Z\&quot; - Other.  |  |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  |



