

# AuditInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | User ID (as assigned by the Issuer/Processor) of the Customer Service Representative who triggered the API request. MDES is not the system of record for this field and does not perform any duplicate checks or other functional validations. The Issuer/Processor, must ensure that the contents of this field comply with their internal system of record. String of up to 50 characters. |  |
|**userName** | **String** | User Name of the Customer Service Representative who triggered the API request. String of up to 200 characters. |  |
|**organization** | **String** | Name of the Issuer or Processor to which the Customer Service Representative who triggered the API request belongs. String of up to 200 characters. |  |
|**phone** | **String** | Phone Number of the Customer Service Representative who triggered the API request. String of up to 20 characters. Optional. |  [optional] |



