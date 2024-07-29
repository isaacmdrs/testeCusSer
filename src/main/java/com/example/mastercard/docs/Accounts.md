

# Accounts


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**List&lt;Account&gt;**](Account.md) | When searching by Account PAN or by Payment App Instance Id, the search response may contain more than one token. Each individual token can be updated during its lifetime and associated to a different Account PAN, or given a new Expiration Date. Different tokens within a single search response may therefore have different Account PANs and/or Expiration Dates. Account objects are used to group tokens that have exactly the same Account PAN and Account PAN Expiration Date. |  [optional] |



