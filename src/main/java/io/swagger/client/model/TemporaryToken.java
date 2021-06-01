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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * TemporaryToken
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-31T12:15:05.519Z[GMT]")
public class TemporaryToken {
  @JsonProperty("token")
  private String token = null;

  public TemporaryToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * temporary token value
   * @return token
  **/
  @Schema(example = "c5f3a6d4-5863-11ea-8e2d-0242ac130003", description = "temporary token value")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryToken temporaryToken = (TemporaryToken) o;
    return Objects.equals(this.token, temporaryToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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