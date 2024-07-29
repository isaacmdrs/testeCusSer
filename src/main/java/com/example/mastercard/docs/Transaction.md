

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionDateTime** | **String** | Date and time the comment was updated. String, YYYY-MM-DDThh:mm:ssTZD . |  |
|**currencyCode** | **String** | ISO-4217 currency code (3-letter alphabetic currency code). |  |
|**transactionAmount** | **String** | Amount of the transaction formatted with decimal places. |  |
|**transactionTypeCode** | **String** | Type of transaction. Valid values:   * \&quot;PURCH\&quot; - Purchase   * \&quot;PURCB\&quot; - Purchase with Cashback   * \&quot;REFND\&quot; - Refund   * \&quot;AFD\&quot; - Purchase Pre-Auth AFD   * \&quot;CLRRF\&quot; - Clearing Refund   * \&quot;NAFD\&quot; - Purchase Pre-Auth Non-AFD  |  |
|**transactionTypeDescription** | **String** | Description of the transaction type. |  |
|**transactionStatusCode** | **String** | Transaction status. Valid values:   * \&quot;AUTH\&quot; - Authorized   * \&quot;COMP\&quot; - Completed   * \&quot;DCLN\&quot; - Declined   * \&quot;PAUTH\&quot; - Pre-Authorized   * \&quot;PAUTC\&quot; - Pre-Authorization Completed   * \&quot;PAUTD\&quot; - Pre-Authorization Declined   * \&quot;REFND\&quot; - Refunded  |  |
|**merchantName** | **String** | Name of the merchant. Conditional field. When available, it must be included in the response. |  [optional] |
|**merchantCategoryCode** | **String** | Merchant category of the merchant. Conditional field. When available, it must be included in the response. |  [optional] |
|**merchantCategoryDescription** | **String** | Description of the merchant category. |  |
|**poSEntryMode** | **String** | Indicates the mode by which transaction data was collected at the merchant. Conditional field. When available, it must be included in the response.  Valid values:   * \&quot;07\&quot; - Contactless M/Chip transaction   * \&quot;09\&quot; - Digital Secure Remote Payment containing EMV data   * \&quot;81\&quot; - Digital Secure Remote Payment containing UCAF data or CoF   * \&quot;82\&quot; - CoF - PAN auto entry via server   * \&quot;90\&quot; - Dynamic Magnetic Strip Data   * \&quot;91\&quot; - Contactless magnetic stripe  |  [optional] |



