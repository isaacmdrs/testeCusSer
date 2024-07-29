

# SearchData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedAccountInformation** | [**EncryptedAccountInformation**](EncryptedAccountInformation.md) |  |  [optional] |
|**paymentAppInstanceId** | **String** | When present, the search will return tokens already present or to be provisioned to the specified Payment App instance. Note - This may contain the identifier of the Secure Element or a mobile device for some programs. Cannot be used together with any of the following search request parameters (AccountPan, TokenUniqueReference, Token, CommentId, or AlternateAccountIdentifier).  |  [optional] |
|**commentId** | **String** | When present, the search will return one specific token linked to the comment. Cannot be used together with EncryptedAccountInformation  |  [optional] |
|**tokenUniqueReference** | **String** | A unique reference assigned to a token and used to identify the token for the duration of its lifetime. When present, the search will return one specific matching token.   |  [optional] |
|**excludeDeletedIndicator** | **String** | Indicates whether deleted tokens should be included or excluded from the search results. Valid values:   * \&quot;true\&quot; - indicates deleted tokens are excluded from the search results.   * \&quot;false\&quot; - indicates deleted tokens are included in the search results.  |  [optional] |
|**includeDeviceTokensOnly** | **String** | Gives issuers the choice to receive only device tokens mapped to their payment credentials. This is an optional parameter, if the issuer decides to not include this field in their \&quot;Search\&quot; request, MDES will return all tokens mapped to the payment credentials (server, device and COF based tokens). Valid values:   * \&quot;true\&quot; - When present with the \&quot;true\&quot; value, MDES will never return any server-based tokens associated to the payment credentials.    * \&quot;false\&quot; - When present with the \&quot;false\&quot; value, MDES will return all tokens mapped to the payment credentials (server, device and COF based tokens).  |  [optional] |
|**excludeTokensDeletedFromConsumerApp** | **String** | Gives issuers the choice to only receive device tokens that are active on the consumer device. Tokens that have been deleted from the consumer app (digital wallet)  but active in MDES will be excluded when the response if set to true. This is an optional parameter, if the issuer decides to not include this field in their \&quot;Search\&quot; request, MDES will return all tokens including tokens deleted from the consumer app but active in MDES. Valid values:   * \&quot;true\&quot; - When present with the \&quot;true\&quot; value, MDES will never return any tokens that are deleted from the consumer app.    * \&quot;false\&quot; - When present with the \&quot;false\&quot; value, MDES will return tokens    that are deleted from the consumer app.  |  [optional] |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  |



