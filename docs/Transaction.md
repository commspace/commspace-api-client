# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | unique identifier by which this transaction is known at consumer | 
**transactionDate** | [**LocalDate**](LocalDate.md) | date of transaction in format defined by RFC3339. | 
**productDetails** | [**TransactionProductDetails**](TransactionProductDetails.md) |  |  [optional]
**clientDetails** | [**TransactionClientDetails**](TransactionClientDetails.md) |  |  [optional]
**intermediaryDetails** | [**TransactionIntermediaryDetails**](TransactionIntermediaryDetails.md) |  |  [optional]
**transactionTypeId** | **String** | text representation of the transaction type as it is known at the consumer | 
**premium** | **Double** | the client contribution that the provider received |  [optional]
**amountExVat** | **Double** | The amount ex VAT (commission and fees) received from the provider | 
**vat** | **Double** | The VAT portion (if any) of the total amount received from the provider |  [optional]
**amount** | **Double** | The total amount received from the provider | 
**vatExempt** | **Boolean** | indicates that the item carries no VAT. If not specified defaults to false. |  [optional]
**currency** | **String** | optional indicator representing the currency of the transaction. Supply a 3 character code as defined by ISO 4217 |  [optional]
**currencyExchangeRate** | **Double** | exchange rate for conversion of the transaction currency to the payment currency. The amount fields are multiplied by this rate to determine the amount payable in the payment currency. |  [optional]
