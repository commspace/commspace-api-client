package za.co.commspace.api;

import za.co.commspace.ApiException;
import za.co.commspace.ApiClient;
import za.co.commspace.Configuration;
import za.co.commspace.Pair;

import javax.ws.rs.core.GenericType;

import za.co.commspace.api.model.Client;
import za.co.commspace.api.model.CreateReportRequest;
import za.co.commspace.api.model.ImportErrorList;
import za.co.commspace.api.model.Intermediary;
import za.co.commspace.api.model.LoadClientsRequest;
import za.co.commspace.api.model.LoadIntermediariesRequest;
import java.time.LocalDate;
import za.co.commspace.api.model.Page;
import za.co.commspace.api.model.Product;
import za.co.commspace.api.model.ReportResponse;
import za.co.commspace.api.model.ReportToken;
import za.co.commspace.api.model.TemporaryToken;
import za.co.commspace.api.model.TemporaryTokenRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-15T08:32:32.372Z[GMT]")public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * retrieve report
   * retrieve a report given a token
   * @param accountId unique identifier for account (required)
   * @param reportToken Unique identifier of the report to retrieve (required)
   * @return ReportResponse
   * @throws ApiException if fails to make API call
   */
  public ReportResponse accountsAccountIdReportsReportTokenGet(String accountId, UUID reportToken) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsAccountIdReportsReportTokenGet");
    }
    // verify the required parameter 'reportToken' is set
    if (reportToken == null) {
      throw new ApiException(400, "Missing the required parameter 'reportToken' when calling accountsAccountIdReportsReportTokenGet");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/reports/{report_token}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "report_token" + "\\}", apiClient.escapeString(reportToken.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<ReportResponse> localVarReturnType = new GenericType<ReportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Submit revenue transactions
   * Use this method to submit new revenue transactions to Commspace.  Transactions are grouped into logical batches that are in turn communicated over the wire in pages. Batches are a means of grouping transactions in a way that makes sense from a business perspective e.g. all transactions for a given department for a given day.  Pages are a means of communicating batches in smaller chunks for performance reasons. e.g. break up a batch of 100,000 transactions into 100 pages of 1000 transactions each.  ### Worked example Imagine there are 100,000 transactions to submit on 2020-12-31 for Department A.  A logical batch of these 100,000 transactions can be created with a batch_id of &#x27;A:2020-12-31&#x27; The batch is split into 100 pages of 1000 transactions each. This will result in 100 calls made to the api for each of the 100 pages. 
   * @param accountId unique identifier for account (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountIdTransactionsPost(String accountId, Page body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsAccountIdTransactionsPost");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/transactions"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * create or update clients
   * Provides an idempotent way to create or update clients i.e. the POST method is used for both create and updates of clients. If the supplied client_id does not exist in the Commspace database a new client record will be created. If it already exists the existing matching client record will be updated. At this stage deletion of client records is not supported Supports multiple clients per call.
   * @param accountId unique identifier for account (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postAccountClients(String accountId, LoadClientsRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postAccountClients");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/clients"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * create report
   * trigger the creation of a report
   * @param accountId unique identifier for account (required)
   * @param body  (optional)
   * @return ReportToken
   * @throws ApiException if fails to make API call
   */
  public ReportToken postAccountCreateReport(String accountId, CreateReportRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postAccountCreateReport");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/reports"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<ReportToken> localVarReturnType = new GenericType<ReportToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * create or update intermediaries
   * Provides an idempotent way to create or update intermediaries i.e. the POST method is used for both create and updates of intermediaries. If the supplied intermediary_id does not exist in the Commspace database a new intermediary record will be created. If it already exists the existing matching intermediary record will be updated. At this stage deletion of intermediary records is not supported Supports multiple intermediaries per call.
   * @param accountId unique identifier for account (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postAccountIntermediaries(String accountId, LoadIntermediariesRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postAccountIntermediaries");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/intermediaries"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * create temporary sso token
   * Create a temporary SSO token for the supplied user
   * @param accountId unique identifier for account (required)
   * @param body  (optional)
   * @return TemporaryToken
   * @throws ApiException if fails to make API call
   */
  public TemporaryToken postAccountSsoTemporaryToken(String accountId, TemporaryTokenRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling postAccountSsoTemporaryToken");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/sso/temporarytoken"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<TemporaryToken> localVarReturnType = new GenericType<TemporaryToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve a client
   * retrieve a client given an identifier
   * @param accountId unique identifier for account (required)
   * @param clientId unique identifier by which this client is known at consumer (required)
   * @return Client
   * @throws ApiException if fails to make API call
   */
  public Client retrieveClient(String accountId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveClient");
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling retrieveClient");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/clients/{client_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve an intermediary
   * retrieve an intermediary given an identifier
   * @param accountId unique identifier for account (required)
   * @param intermediaryId unique identifier by which this intermediary is known at consumer (required)
   * @return Intermediary
   * @throws ApiException if fails to make API call
   */
  public Intermediary retrieveIntermediary(String accountId, String intermediaryId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveIntermediary");
    }
    // verify the required parameter 'intermediaryId' is set
    if (intermediaryId == null) {
      throw new ApiException(400, "Missing the required parameter 'intermediaryId' when calling retrieveIntermediary");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/intermediaries/{intermediary_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "intermediary_id" + "\\}", apiClient.escapeString(intermediaryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<Intermediary> localVarReturnType = new GenericType<Intermediary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve a report for an intermediary
   * retrieve a report given intermediary and report identifiers. This method has been deprecated in favour of the /accounts/{account_id}/reports endpoint.
   * @param accountId unique identifier for account (required)
   * @param reportId identifier of report to retrieve (required)
   * @param intermediaryId unique identifier by which the intermediary is known at consumer (required)
   * @param startDate earliest date for which to retrieve report data (required)
   * @param endDate latest date for which to retrieve report data (required)
   * @param format desired format of the report (required)
   * @param productId unique identifier by which the product is known at consumer (optional)
   * @param clientId unique identifier by the client is known at consumer (optional)
   * @return ReportResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ReportResponse retrieveIntermediaryReport(String accountId, String reportId, String intermediaryId, LocalDate startDate, LocalDate endDate, String format, String productId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveIntermediaryReport");
    }
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling retrieveIntermediaryReport");
    }
    // verify the required parameter 'intermediaryId' is set
    if (intermediaryId == null) {
      throw new ApiException(400, "Missing the required parameter 'intermediaryId' when calling retrieveIntermediaryReport");
    }
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling retrieveIntermediaryReport");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling retrieveIntermediaryReport");
    }
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling retrieveIntermediaryReport");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/intermediaries/{intermediary_id}/reports/{report_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()))
      .replaceAll("\\{" + "intermediary_id" + "\\}", apiClient.escapeString(intermediaryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product_id", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<ReportResponse> localVarReturnType = new GenericType<ReportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve a product
   * retrieve a product with the given product identifiers
   * @param accountId unique identifier for account (required)
   * @param productId unique identifier by which this product is known at consumer (required)
   * @return Product
   * @throws ApiException if fails to make API call
   */
  public Product retrieveProduct(String accountId, String productId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveProduct");
    }
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling retrieveProduct");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/products/{product_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "product_id" + "\\}", apiClient.escapeString(productId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<Product> localVarReturnType = new GenericType<Product>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * retrieve a report
   * Retrieve a report given report identifiers. This method has been deprecated in favour of the /accounts/{account_id}/reports endpoint.
   * @param accountId unique identifier for account (required)
   * @param reportId identifier of report to retrieve (required)
   * @param startDate earliest date for which to retrieve report data (required)
   * @param endDate latest date for which to retrieve report data (required)
   * @param format desired format of the report (required)
   * @return ReportResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ReportResponse retrieveReport(String accountId, String reportId, LocalDate startDate, LocalDate endDate, String format) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveReport");
    }
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling retrieveReport");
    }
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling retrieveReport");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling retrieveReport");
    }
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling retrieveReport");
    }
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/clients/reports/{report_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<ReportResponse> localVarReturnType = new GenericType<ReportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
