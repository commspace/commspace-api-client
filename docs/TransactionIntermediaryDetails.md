# TransactionIntermediaryDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intermediaryId** | **String** | unique identifier by which the intermediary is known at consumer. It must match the intermediary_id on an intermediary loaded through the /accounts/{account_id}/intermediaries POST method |  [optional]
**providerCode** | **String** | optional unique identifier by which the intermediary is known at the provider. This is used to match this transaction to an intermediary in the database. It is not necessary to provide this if intermediary_id is supplied. |  [optional]
**name** | **String** | name of intermediary. This is used to match this transaction to an intermediary in the database. It is not necessary to provide this if intermediary_id is supplied. |  [optional]
