# CreateReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **String** | Unique identifier of the report template to use | 
**format** | [**FormatEnum**](#FormatEnum) | specify the format of the report output document |  [optional]
**callbackUrl** | **String** | url to post report results to |  [optional]
**excludePayloadFromCallback** | **Boolean** | exclude the payload from the callback. This will require a GET to .../reports/{report_token} to retrieve the report content |  [optional]
**compress** | **Boolean** | compress the result in zip format |  [optional]
**filters** | [**List&lt;ReportFilter&gt;**](ReportFilter.md) |  |  [optional]

<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
PDF | &quot;pdf&quot;
XLS | &quot;xls&quot;
CSV | &quot;csv&quot;
