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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Intermediary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LoadIntermediariesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-31T07:42:49.936Z[GMT]")
public class LoadIntermediariesRequest {
  @SerializedName("intermediaries")
  private List<Intermediary> intermediaries = null;

  public LoadIntermediariesRequest intermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public LoadIntermediariesRequest addIntermediariesItem(Intermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new ArrayList<Intermediary>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

   /**
   * Get intermediaries
   * @return intermediaries
  **/
  @Schema(description = "")
  public List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadIntermediariesRequest loadIntermediariesRequest = (LoadIntermediariesRequest) o;
    return Objects.equals(this.intermediaries, loadIntermediariesRequest.intermediaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intermediaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadIntermediariesRequest {\n");
    
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
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
