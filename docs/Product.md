# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | unique identifier by which this product is known at consumer | 
**productNumber** | **String** | unique product number issued by the product provider | 
**providerId** | **String** | unique identifier by which the product provider is known by the consumer | 
**productCategoryId** | **String** | unique identifier by which the product category is known by the consumer | 
**agreements** | [**List&lt;Agreement&gt;**](Agreement.md) | array of agreements for this product | 
**inceptionDate** | [**LocalDate**](LocalDate.md) | inception date of the product formatted per RFC3339 |  [optional]
**terminationDate** | [**LocalDate**](LocalDate.md) | termination date of the product formatted per RFC3339 |  [optional]
**referenceNumber** | **String** | additional reference number for the product (optional) |  [optional]
