/*
 * Commspace source data API
 * API for Commspace source data management
 *
 * OpenAPI spec version: 1.0.4
 * Contact: api@commspace.co.za
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Client;
import io.swagger.client.model.CreateReportRequest;
import io.swagger.client.model.ImportErrorList;
import io.swagger.client.model.Intermediary;
import io.swagger.client.model.LoadClientsRequest;
import io.swagger.client.model.LoadIntermediariesRequest;
import java.time.LocalDate;
import io.swagger.client.model.Product;
import io.swagger.client.model.ReportResponse;
import io.swagger.client.model.ReportToken;
import io.swagger.client.model.TemporaryToken;
import io.swagger.client.model.TemporaryTokenRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * retrieve report
     *
     * retrieve a report given a token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountsAccountIdReportsReportTokenGetTest() throws ApiException {
        String accountId = null;
        UUID reportToken = null;
        ReportResponse response = api.accountsAccountIdReportsReportTokenGet(accountId, reportToken);

        // TODO: test validations
    }
    /**
     * create or update clients
     *
     * Provides an idempotent way to create or update clients. Supports multiple clients per call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccountClientsTest() throws ApiException {
        String accountId = null;
        LoadClientsRequest body = null;
        api.postAccountClients(accountId, body);

        // TODO: test validations
    }
    /**
     * create report
     *
     * trigger the creation of a report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccountCreateReportTest() throws ApiException {
        String accountId = null;
        CreateReportRequest body = null;
        ReportToken response = api.postAccountCreateReport(accountId, body);

        // TODO: test validations
    }
    /**
     * create or update intermediaries
     *
     * Provides an idempotent way to create or update intermediaries. Supports multiple intermediaries per call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccountIntermediariesTest() throws ApiException {
        String accountId = null;
        LoadIntermediariesRequest body = null;
        api.postAccountIntermediaries(accountId, body);

        // TODO: test validations
    }
    /**
     * create temporary sso token
     *
     * Create a temporary SSO token for the supplied user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccountSsoTemporaryTokenTest() throws ApiException {
        String accountId = null;
        TemporaryTokenRequest body = null;
        TemporaryToken response = api.postAccountSsoTemporaryToken(accountId, body);

        // TODO: test validations
    }
    /**
     * retrieve a client
     *
     * retrieve a client given an identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveClientTest() throws ApiException {
        String accountId = null;
        String clientId = null;
        Client response = api.retrieveClient(accountId, clientId);

        // TODO: test validations
    }
    /**
     * retrieve an intermediary
     *
     * retrieve an intermediary given an identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveIntermediaryTest() throws ApiException {
        String accountId = null;
        String intermediaryId = null;
        Intermediary response = api.retrieveIntermediary(accountId, intermediaryId);

        // TODO: test validations
    }
    /**
     * retrieve a report for an intermediary
     *
     * retrieve a report given intermediary and report identifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveIntermediaryReportTest() throws ApiException {
        String accountId = null;
        String reportId = null;
        String intermediaryId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String format = null;
        String productId = null;
        String clientId = null;
        ReportResponse response = api.retrieveIntermediaryReport(accountId, reportId, intermediaryId, startDate, endDate, format, productId, clientId);

        // TODO: test validations
    }
    /**
     * retrieve a product
     *
     * retrieve a product with the given product identifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveProductTest() throws ApiException {
        String accountId = null;
        String productId = null;
        Product response = api.retrieveProduct(accountId, productId);

        // TODO: test validations
    }
    /**
     * retrieve a report
     *
     * retrieve a report given report identifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveReportTest() throws ApiException {
        String accountId = null;
        String reportId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String format = null;
        ReportResponse response = api.retrieveReport(accountId, reportId, startDate, endDate, format);

        // TODO: test validations
    }
}