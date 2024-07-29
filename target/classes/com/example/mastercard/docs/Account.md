

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountPanSuffix** | **String** | Last 4 digits of Account PAN mapped (or to be mapped) to Token(s). |  [optional] |
|**financialAccountSuffix** | **String** | Last 4 digits of the financial account information mapped (or to be mapped) to token(s). Conditional field, only present when mapping is tied to a financial account. |  [optional] |
|**countryCode** | **String** | The country of the financial account. Expressed as a 3-letter (alpha-3) country code as defined in ISO 3166-1. Conditional field. Present when mapping is tied to a financial account.  |  [optional] |
|**interbankCardAssociationId** | **BigDecimal** | The id assigned by Mastercard to the financial institution. Conditional field. Present when mapping is tied to a financial account. |  [optional] |
|**institutionName** | **String** | The name of the financial institution associated with the account. Conditional field. Present when mapping is tied to a financial account. |  [optional] |
|**expirationDate** | **String** | Expiration date of Account PAN mapped (or to be mapped) to Token(s). MMYY format. |  [optional] |
|**alternateAccountIdentifierSuffix** | **String** | Alternate Account Identifier is a cardholder friendly reference to a bank account. It is typically used to identify associated tokens when the cardholder is unaware of their Account PAN. The Alternate Account Identifier Suffix exposes just the last few characters of the full identifier, in order to protect the full identifier from possible fraud. The suffix may be up to 8 characters long. |  [optional] |
|**tokens** | [**Tokens**](Tokens.md) |  |  [optional] |



