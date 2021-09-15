# Page

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | unique identifier by which the batch this page is part of is known at consumer | 
**batchSize** | **Integer** | total number of transactions in batch | 
**pageSize** | **Integer** | number of transactions in this page | 
**pageNumber** | **Integer** | ordinal number of page in batch. page numbering starts at 0. | 
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | transactions in the page |  [optional]
