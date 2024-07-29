

# TokenUpdateData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedAccountInformation** | [**UpdateEncryptedAccountInformation**](UpdateEncryptedAccountInformation.md) |  |  [optional] |
|**tokenUniqueReference** | **String** | Unique reference of the token to be updated. Conditional field, used for updating a single token and not used when CurrentAccountPan is present. Supply either the TokenUniqueReference or the CurrentAccountPan. |  [optional] |
|**issuerProductConfigurationId** | **String** | New product configuration ID to be applied to the updated token(s). Conditional field, must not be present if any of the following are present - NewAccountPan, ExpirationDate, AccountPanSequenceNumber, NewFinancialAccountId. |  [optional] |
|**removeAlternateAccountIdentifierSuffix** | **String** | Indicates whether the aleternate account identifier suffix associated to a token should be removed as part of the request. Value values:   * \&quot;true\&quot; - Remove the alternate account identifier associated to a token   * \&quot;false\&quot; - Do not remove the alternate account identifier associated to a token  |  [optional] |
|**updateWalletProviderIndicator** | **String** | Indicates whether the updated token information should be provided to the Wallet Provider. Valid values:   * \&quot;0\&quot; - Pass the updated information to the Wallet Provider   * \&quot;1\&quot; - Do not pass the updated information to the Wallet Provider. Optional parameter. The default is 1 if not present.  |  [optional] |
|**commentText** | **String** | Comment related to the updated token(s). Maximum length 500 characters. |  [optional] |
|**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  |
|**currentFinancialAccountInformation** | [**CurrentFinancialAccountInformation**](CurrentFinancialAccountInformation.md) |  |  [optional] |



