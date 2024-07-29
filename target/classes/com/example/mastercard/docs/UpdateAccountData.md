

# UpdateAccountData

Contains an encrypted json object. Encrypted by the ephemeral AES key using CBC mode (IV as provided in 'Iv', or zero if none provided) and PKCS#7 padding.  The JSON object being encrypted will be defined in the context of the API call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentAccount** | [**UpdateAccountDataCurrentAccount**](UpdateAccountDataCurrentAccount.md) |  |  [optional] |
|**newAccount** | [**UpdateAccountDataNewAccount**](UpdateAccountDataNewAccount.md) |  |  [optional] |



