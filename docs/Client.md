# Client

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | unique identifier by which this client is known at consumer | 
**lastName** | **String** | last name of client | 
**initials** | **String** | full initials of client. Preferably without spaces or punctuation. |  [optional]
**nationalRegistration** | **String** | ID Number / Passport / other issued registration |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) | Date of birth of client formatted per RFC3339 |  [optional]
**birthYearMonth** | **String** | Client birth year and month in &#x27;YYYY-MM&#x27; format. It is used to determine client age for analytics. Supply this if there are privacy concerns about sharing a full date_of_birth for a client. |  [optional]
**products** | [**List&lt;Product&gt;**](Product.md) | products held by this client. |  [optional]
