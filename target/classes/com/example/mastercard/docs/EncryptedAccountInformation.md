

# EncryptedAccountInformation

Used when account data is supplied in Search, Activate or Update APIs. Use only if account data is present, not required otherwise. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptedData** | [**AccountData**](AccountData.md) |  |  |
|**publicKeyFingerprint** | **String** | The fingerprint of the public key used to encrypt the ephemeral AES key.  |  |
|**encryptedKey** | **String** | One-time use AES key encrypted by the MasterCard public key (as identified by publicKeyFingerprint) using the OAEP or PKCS#1 v1.5 scheme (depending on the value of oaepHashingAlgorithm.  |  |
|**oaepHashingAlgorithm** | **String** | Hashing algorithm used with the OAEP scheme. Only present when EncryptedAccountInformation.EncryptedData is present. Must be either:   * SHA256   * SHA512.  |  |
|**iv** | **String** | The initialization vector used when encrypting data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. Only present when EncryptedAccountInformation.EncryptedData is present. If not present, an IV of zero is assumed.  |  |



