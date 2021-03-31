# AgreementComplianceStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compliant** | **Boolean** | flag indicating compliance status of product | 
**reason** | **String** | textual description of reason for compliance status. required if compliant is false. This property is deprecated since 1.0.4 in favour of *reasons* attribute |  [optional]
**reasons** | **List&lt;String&gt;** | array of textual descriptions of reasons for compliance status. Required if compliant is false. |  [optional]
