

# UpdateAccountDataNewAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountPan** | **String** | When present, return tokens for the account matching this  Primary Account Number (PAN), for any waller provider or device. Optional, only present in Token Update. |  [optional] |
|**newFinancialAccountId** | **String** | New Financial Account Identifier to be applied to the updated token(s) if there is in fact new Financial Account Identifier. Conditional field; must be present if CurrentFinancialAccountInformation fields are present. Only present in Token Update. |  [optional] |
|**expirationDate** | **String** | New expiration date to be applied to the updated token(s). Conditional field, must not be present when IssuerProductConfigurationId or CurrentFinanciaAccountInformation is present. Optional, if updating PAN mapping or PAN Sequence Number.  Only present in Token Update. |  [optional] |
|**accountPanSequenceNumber** | **String** | New PAN sequence number to be applied to the updated token(s). Conditional field, must not be present when IssuerProductConfigurationId or CurrentFinanciaAccountInformation is present. Optional, if updating PAN mapping or Expiration Date.  Only present in Token Update. |  [optional] |



