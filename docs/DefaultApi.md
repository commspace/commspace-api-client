# DefaultApi

All URIs are relative to *https://qaapi.commspace.co.za*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountIdReportsReportTokenGet**](DefaultApi.md#accountsAccountIdReportsReportTokenGet) | **GET** /accounts/{account_id}/reports/{report_token} | retrieve report
[**accountsAccountIdTransactionsPost**](DefaultApi.md#accountsAccountIdTransactionsPost) | **POST** /accounts/{account_id}/transactions | Submit revenue transactions
[**postAccountClients**](DefaultApi.md#postAccountClients) | **POST** /accounts/{account_id}/clients | create or update clients
[**postAccountCreateReport**](DefaultApi.md#postAccountCreateReport) | **POST** /accounts/{account_id}/reports | create report
[**postAccountIntermediaries**](DefaultApi.md#postAccountIntermediaries) | **POST** /accounts/{account_id}/intermediaries | create or update intermediaries
[**postAccountSsoTemporaryToken**](DefaultApi.md#postAccountSsoTemporaryToken) | **POST** /accounts/{account_id}/sso/temporarytoken | create temporary sso token
[**retrieveClient**](DefaultApi.md#retrieveClient) | **GET** /accounts/{account_id}/clients/{client_id} | retrieve a client
[**retrieveIntermediary**](DefaultApi.md#retrieveIntermediary) | **GET** /accounts/{account_id}/intermediaries/{intermediary_id} | retrieve an intermediary
[**retrieveIntermediaryReport**](DefaultApi.md#retrieveIntermediaryReport) | **GET** /accounts/{account_id}/intermediaries/{intermediary_id}/reports/{report_id} | retrieve a report for an intermediary
[**retrieveProduct**](DefaultApi.md#retrieveProduct) | **GET** /accounts/{account_id}/products/{product_id} | retrieve a product
[**retrieveReport**](DefaultApi.md#retrieveReport) | **GET** /accounts/{account_id}/clients/reports/{report_id} | retrieve a report

<a name="accountsAccountIdReportsReportTokenGet"></a>
# **accountsAccountIdReportsReportTokenGet**
> ReportResponse accountsAccountIdReportsReportTokenGet(accountId, reportToken)

retrieve report

retrieve a report given a token

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
UUID reportToken = new UUID(); // UUID | Unique identifier of the report to retrieve
try {
    ReportResponse result = apiInstance.accountsAccountIdReportsReportTokenGet(accountId, reportToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#accountsAccountIdReportsReportTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **reportToken** | [**UUID**](.md)| Unique identifier of the report to retrieve |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountsAccountIdTransactionsPost"></a>
# **accountsAccountIdTransactionsPost**
> accountsAccountIdTransactionsPost(accountId, body)

Submit revenue transactions

Use this method to submit new revenue transactions to Commspace.  Transactions are grouped into logical batches that are in turn communicated over the wire in pages. Batches are a means of grouping transactions in a way that makes sense from a business perspective e.g. all transactions for a given department for a given day.  Pages are a means of communicating batches in smaller chunks for performance reasons. e.g. break up a batch of 100,000 transactions into 100 pages of 1000 transactions each.  ### Worked example Imagine there are 100,000 transactions to submit on 2020-12-31 for Department A.  A logical batch of these 100,000 transactions can be created with a batch_id of &#x27;A:2020-12-31&#x27; The batch is split into 100 pages of 1000 transactions each. This will result in 100 calls made to the api for each of the 100 pages. 

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
Page body = new Page(); // Page | 
try {
    apiInstance.accountsAccountIdTransactionsPost(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#accountsAccountIdTransactionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **body** | [**Page**](Page.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountClients"></a>
# **postAccountClients**
> postAccountClients(accountId, body)

create or update clients

Provides an idempotent way to create or update clients i.e. the POST method is used for both create and updates of clients. If the supplied client_id does not exist in the Commspace database a new client record will be created. If it already exists the existing matching client record will be updated. At this stage deletion of client records is not supported Supports multiple clients per call.

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
LoadClientsRequest body = new LoadClientsRequest(); // LoadClientsRequest | 
try {
    apiInstance.postAccountClients(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAccountClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **body** | [**LoadClientsRequest**](LoadClientsRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountCreateReport"></a>
# **postAccountCreateReport**
> ReportToken postAccountCreateReport(accountId, body)

create report

trigger the creation of a report

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
CreateReportRequest body = new CreateReportRequest(); // CreateReportRequest | 
try {
    ReportToken result = apiInstance.postAccountCreateReport(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAccountCreateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **body** | [**CreateReportRequest**](CreateReportRequest.md)|  | [optional]

### Return type

[**ReportToken**](ReportToken.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountIntermediaries"></a>
# **postAccountIntermediaries**
> postAccountIntermediaries(accountId, body)

create or update intermediaries

Provides an idempotent way to create or update intermediaries i.e. the POST method is used for both create and updates of intermediaries. If the supplied intermediary_id does not exist in the Commspace database a new intermediary record will be created. If it already exists the existing matching intermediary record will be updated. At this stage deletion of intermediary records is not supported Supports multiple intermediaries per call.

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
LoadIntermediariesRequest body = new LoadIntermediariesRequest(); // LoadIntermediariesRequest | 
try {
    apiInstance.postAccountIntermediaries(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAccountIntermediaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **body** | [**LoadIntermediariesRequest**](LoadIntermediariesRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountSsoTemporaryToken"></a>
# **postAccountSsoTemporaryToken**
> TemporaryToken postAccountSsoTemporaryToken(accountId, body)

create temporary sso token

Create a temporary SSO token for the supplied user

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
TemporaryTokenRequest body = new TemporaryTokenRequest(); // TemporaryTokenRequest | 
try {
    TemporaryToken result = apiInstance.postAccountSsoTemporaryToken(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postAccountSsoTemporaryToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **body** | [**TemporaryTokenRequest**](TemporaryTokenRequest.md)|  | [optional]

### Return type

[**TemporaryToken**](TemporaryToken.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClient"></a>
# **retrieveClient**
> Client retrieveClient(accountId, clientId)

retrieve a client

retrieve a client given an identifier

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
String clientId = "clientId_example"; // String | unique identifier by which this client is known at consumer
try {
    Client result = apiInstance.retrieveClient(accountId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **clientId** | **String**| unique identifier by which this client is known at consumer |

### Return type

[**Client**](Client.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveIntermediary"></a>
# **retrieveIntermediary**
> Intermediary retrieveIntermediary(accountId, intermediaryId)

retrieve an intermediary

retrieve an intermediary given an identifier

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
String intermediaryId = "intermediaryId_example"; // String | unique identifier by which this intermediary is known at consumer
try {
    Intermediary result = apiInstance.retrieveIntermediary(accountId, intermediaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveIntermediary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **intermediaryId** | **String**| unique identifier by which this intermediary is known at consumer |

### Return type

[**Intermediary**](Intermediary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveIntermediaryReport"></a>
# **retrieveIntermediaryReport**
> ReportResponse retrieveIntermediaryReport(accountId, reportId, intermediaryId, startDate, endDate, format, productId, clientId)

retrieve a report for an intermediary

retrieve a report given intermediary and report identifiers. This method has been deprecated in favour of the /accounts/{account_id}/reports endpoint.

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
String reportId = "reportId_example"; // String | identifier of report to retrieve
String intermediaryId = "intermediaryId_example"; // String | unique identifier by which the intermediary is known at consumer
LocalDate startDate = new LocalDate(); // LocalDate | earliest date for which to retrieve report data
LocalDate endDate = new LocalDate(); // LocalDate | latest date for which to retrieve report data
String format = "format_example"; // String | desired format of the report
String productId = "productId_example"; // String | unique identifier by which the product is known at consumer
String clientId = "clientId_example"; // String | unique identifier by the client is known at consumer
try {
    ReportResponse result = apiInstance.retrieveIntermediaryReport(accountId, reportId, intermediaryId, startDate, endDate, format, productId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveIntermediaryReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **reportId** | **String**| identifier of report to retrieve |
 **intermediaryId** | **String**| unique identifier by which the intermediary is known at consumer |
 **startDate** | **LocalDate**| earliest date for which to retrieve report data |
 **endDate** | **LocalDate**| latest date for which to retrieve report data |
 **format** | **String**| desired format of the report | [enum: pdf, xls, csv, xml]
 **productId** | **String**| unique identifier by which the product is known at consumer | [optional]
 **clientId** | **String**| unique identifier by the client is known at consumer | [optional]

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveProduct"></a>
# **retrieveProduct**
> Product retrieveProduct(accountId, productId)

retrieve a product

retrieve a product with the given product identifiers

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
String productId = "productId_example"; // String | unique identifier by which this product is known at consumer
try {
    Product result = apiInstance.retrieveProduct(accountId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **productId** | **String**| unique identifier by which this product is known at consumer |

### Return type

[**Product**](Product.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveReport"></a>
# **retrieveReport**
> ReportResponse retrieveReport(accountId, reportId, startDate, endDate, format)

retrieve a report

Retrieve a report given report identifiers. This method has been deprecated in favour of the /accounts/{account_id}/reports endpoint.

### Example
```java
// Import classes:
//import za.co.commspace.ApiClient;
//import za.co.commspace.ApiException;
//import za.co.commspace.Configuration;
//import za.co.commspace.auth.*;
//import za.co.commspace.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | unique identifier for account
String reportId = "reportId_example"; // String | identifier of report to retrieve
LocalDate startDate = new LocalDate(); // LocalDate | earliest date for which to retrieve report data
LocalDate endDate = new LocalDate(); // LocalDate | latest date for which to retrieve report data
String format = "format_example"; // String | desired format of the report
try {
    ReportResponse result = apiInstance.retrieveReport(accountId, reportId, startDate, endDate, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| unique identifier for account |
 **reportId** | **String**| identifier of report to retrieve |
 **startDate** | **LocalDate**| earliest date for which to retrieve report data |
 **endDate** | **LocalDate**| latest date for which to retrieve report data |
 **format** | **String**| desired format of the report | [enum: pdf, xls, csv, xml]

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

