

# AccountDataCurrentAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**virtualCardNumber** | **String** | When present, return tokens for the VirtualCardNumber matching this VCN, for any Wallet Provider or device. Optional for Token Search |  [optional] |
|**accountPan** | **String** | When present, return tokens for the Account matching this Primary Account Number (PAN), for any Wallet Provider or device. Optional for Token Search. Conditional field, used for updating  all tokens mapped to a single Account PAN and must not be present  when TokenUniqueReference or CurrentFinancialAccountInformation  is present for Token Update. |  [optional] |
|**token** | **String** | When present, the search will return one specific token. |  [optional] |
|**alternateAccountIdentifier** | **String** | When present, the search will return tokens matching this Alternate Account Identifier, for any Wallet Provider or device. Alternate Account Identifier will be minimum 9 and maximum 64 characters. Space characters are not allowed. |  [optional] |
|**financialAccountId** | **String** | When present, return tokens for the Account matching this Financial Account Information, for any Wallet Provider or device. Optional for Token Search. Conditional field, used  for updating all tokens mapped to a single Financial Account  and must not be present when TokenUniqueReference or  CurrentAccountPan is present for Token Update. |  [optional] |



