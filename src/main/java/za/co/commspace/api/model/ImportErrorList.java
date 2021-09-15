/*
 * Commspace API
 *   # Authentication In order to use this API you'll need two things to authenticate: - an **account_id** which identifies which Commspace account (tenant) you're integrating into. This is provided in the url of all api methods `/accounts/{account_id}/...` - an **API Key** which authenticates your access to the account. This is provided as a header as described below  # Mapping master data  Commspace relies on master data (clients, products, intermediaries) supplied by consumer systems in order to do revenue management. We've chosen to implement a consumer-supplied key system to minimize the data mapping burden for consumers. This means that for all master data entities, the consumer supplies their own unique identifier for each entity. Commspace will store that identifier internally and link any subsequent requests with the same identifier to that same entity. In the [specification](/spec.html) you can easily spot these identifier fields as all fields named with the pattern `<entity>_id` e.g. `client_id`, `product_id`, `intermediary_id`, etc.  Some key mappings (providers, product categories, commission types) have to be pre-configured by the Commspace team ahead of time. We will take responsibility for creating the necessary mappings of your identifiers for each of these entities to their Commspace equivalents - all we require is a full list of the values that you will send.  # Generating-Reports Reports can be generated through the methods exposed at the reports root.  Because reports can take a long time to generate this API does not support blocking calls i.e. wait until the report is generated before returning a response.  This API supports two patterns for non-blocking / asynchronous generation of reports:  - **Callback pattern**. The consumer provides a callback URL to post the report to. This is the preferred pattern.  - **Polling pattern**. The consumer repeatedly polls an endpoint to retrieve the report.  ## Callback pattern To make use of this pattern, simply specify a callback_url in the request to `/accounts/{account_id}/reports`.  When the report has been generated, Commspace will submit a POST to the provided URL with the following:  - report-token is the report token returned by the createReport call  - filename contains a suggested filename.  - content is a base64 encoded string of the binary data of the report  ## Polling pattern When a report is successfully requested, the API responds with a report_token in the response. Consumers can use this token to poll the endpoint `/accounts/{account_id}/reports/{report_token}`.  If the report isn't available yet, a 202 response will be returned. If the report is available a 200 response including the report will be returned. 
 *
 * OpenAPI spec version: 1.1.2
 * Contact: api@commspace.co.za
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package za.co.commspace.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import za.co.commspace.api.model.ImportError;
/**
 * ImportErrorList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-15T08:32:32.372Z[GMT]")
public class ImportErrorList {
  @JsonProperty("errors")
  private List<ImportError> errors = null;

  public ImportErrorList errors(List<ImportError> errors) {
    this.errors = errors;
    return this;
  }

  public ImportErrorList addErrorsItem(ImportError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<ImportError> getErrors() {
    return errors;
  }

  public void setErrors(List<ImportError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportErrorList importErrorList = (ImportErrorList) o;
    return Objects.equals(this.errors, importErrorList.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportErrorList {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
