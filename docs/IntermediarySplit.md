# IntermediarySplit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intermediaryId** | **String** | unique identifier by which this intermediary is known at consumer | 
**splitPercentage** | **Double** | percentage of commission that the intermediary is entitled to. Defaults to 100 if not supplied. |  [optional]
**commissionTypeId** | **String** | (optional) commission type identifier as it is known by consumer |  [optional]
**responsible** | **Boolean** | indicates whether this intermediary is the main intermediary on the agreement (if commission_type_id is not provided) or the commission type (if commission_type_id is provided) |  [optional]
**matchIntermediaryOnStatement** | **Boolean** | match the intermediary specified on this split with the intermediary on the statement. |  [optional]
