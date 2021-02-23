# ImportError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | the type of the entity. One of client, product or intermediary. |  [optional]
**entityId** | **String** | unique id (as known by the consumer) of the entity that had the error |  [optional]
**title** | **String** | short summary of the type of problem |  [optional]
**description** | **String** | human-readable explanation of the error that occurred |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
CLIENT | &quot;client&quot;
PRODUCT | &quot;product&quot;
INTERMEDIARY | &quot;intermediary&quot;
