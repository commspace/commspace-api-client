# TransactionProductDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Unique identifier by which the product is known at consumer. It must match the product_id on a product loaded through the /accounts/{account_id}/clients POST method |  [optional]
**providerId** | **String** | unique identifier by which the provider is known at consumer. |  [optional]
**productNumber** | **String** | product number specified by the provider. |  [optional]
**description** | **String** | description of the product (optional) |  [optional]
**secondaryProvider** | **String** | The secondary or underlying provider (if applicable). Used for group schemes etc. |  [optional]
**grouping** | **String** | optional value to provide an additional layer of grouping on products from a particular provider |  [optional]
**groupSchemeName** | **String** | The name of the group scheme if applicable |  [optional]
