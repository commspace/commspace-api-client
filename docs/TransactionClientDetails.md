# TransactionClientDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | unique identifier by which the client is known at consumer. It must match the client_id on a client loaded through the /clients api method |  [optional]
**name** | **String** | Full name of client. Not required if client_id or both last_name and initials are supplied |  [optional]
**lastName** | **String** | surname of client if individual, entity name if an entity. Not required if client_id or name is supplied. |  [optional]
**initials** | **String** | initials of client if an individual. Not required if client_id or name is supplied or client is an entity |  [optional]
**nationalRegistration** | **String** | ID Number / Passport / other issued registration |  [optional]
