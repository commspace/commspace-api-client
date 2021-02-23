# Intermediary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intermediaryId** | **String** | unique identifier by which this intermediary is known at consumer | 
**name** | **String** | name of intermediary | 
**email** | **String** | email address of intermediary | 
**nationalRegistration** | **String** | ID Number / Passport / other issued registration | 
**startDate** | [**LocalDate**](LocalDate.md) | appointment date of the intermediary |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | date on which the employment status of the intermediary became inactive |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | the employment status of the intermediary. If not specified, the \&quot;active\&quot; status will be assumed. |  [optional]
**intermediaryCode** | **String** | business key uniquely identifying intermediary in parent organisation |  [optional]
**providerCodes** | [**List&lt;ProviderCode&gt;**](ProviderCode.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
RETIRED | &quot;retired&quot;
DISABLED | &quot;disabled&quot;
TERMINATED | &quot;terminated&quot;
DECEASED | &quot;deceased&quot;
