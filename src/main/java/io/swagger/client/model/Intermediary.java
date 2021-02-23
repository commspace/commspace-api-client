/*
 * Commspace source data API
 * API for Commspace source data management
 *
 * OpenAPI spec version: 1.0.2
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
import io.swagger.client.model.ProviderCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Intermediary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-08T15:04:17.157Z[GMT]")
public class Intermediary {
  @JsonProperty("intermediary_id")
  private String intermediaryId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("national_registration")
  private String nationalRegistration = null;

  @JsonProperty("start_date")
  private LocalDate startDate = null;

  @JsonProperty("end_date")
  private LocalDate endDate = null;

  /**
   * the employment status of the intermediary. If not specified, the \&quot;active\&quot; status will be assumed.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    RETIRED("retired"),
    DISABLED("disabled"),
    TERMINATED("terminated"),
    DECEASED("deceased");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("intermediary_code")
  private String intermediaryCode = null;

  @JsonProperty("provider_codes")
  private List<ProviderCode> providerCodes = null;

  public Intermediary intermediaryId(String intermediaryId) {
    this.intermediaryId = intermediaryId;
    return this;
  }

   /**
   * unique identifier by which this intermediary is known at consumer
   * @return intermediaryId
  **/
  @Schema(example = "abc1234", required = true, description = "unique identifier by which this intermediary is known at consumer")
  public String getIntermediaryId() {
    return intermediaryId;
  }

  public void setIntermediaryId(String intermediaryId) {
    this.intermediaryId = intermediaryId;
  }

  public Intermediary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of intermediary
   * @return name
  **/
  @Schema(example = "Johan Botha", required = true, description = "name of intermediary")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Intermediary email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email address of intermediary
   * @return email
  **/
  @Schema(required = true, description = "email address of intermediary")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Intermediary nationalRegistration(String nationalRegistration) {
    this.nationalRegistration = nationalRegistration;
    return this;
  }

   /**
   * ID Number / Passport / other issued registration
   * @return nationalRegistration
  **/
  @Schema(example = "8207235800086", required = true, description = "ID Number / Passport / other issued registration")
  public String getNationalRegistration() {
    return nationalRegistration;
  }

  public void setNationalRegistration(String nationalRegistration) {
    this.nationalRegistration = nationalRegistration;
  }

  public Intermediary startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * appointment date of the intermediary
   * @return startDate
  **/
  @Schema(description = "appointment date of the intermediary")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Intermediary endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * date on which the employment status of the intermediary became inactive
   * @return endDate
  **/
  @Schema(description = "date on which the employment status of the intermediary became inactive")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Intermediary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * the employment status of the intermediary. If not specified, the \&quot;active\&quot; status will be assumed.
   * @return status
  **/
  @Schema(description = "the employment status of the intermediary. If not specified, the \"active\" status will be assumed.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Intermediary intermediaryCode(String intermediaryCode) {
    this.intermediaryCode = intermediaryCode;
    return this;
  }

   /**
   * business key uniquely identifying intermediary in parent organisation
   * @return intermediaryCode
  **/
  @Schema(description = "business key uniquely identifying intermediary in parent organisation")
  public String getIntermediaryCode() {
    return intermediaryCode;
  }

  public void setIntermediaryCode(String intermediaryCode) {
    this.intermediaryCode = intermediaryCode;
  }

  public Intermediary providerCodes(List<ProviderCode> providerCodes) {
    this.providerCodes = providerCodes;
    return this;
  }

  public Intermediary addProviderCodesItem(ProviderCode providerCodesItem) {
    if (this.providerCodes == null) {
      this.providerCodes = new ArrayList<>();
    }
    this.providerCodes.add(providerCodesItem);
    return this;
  }

   /**
   * Get providerCodes
   * @return providerCodes
  **/
  @Schema(description = "")
  public List<ProviderCode> getProviderCodes() {
    return providerCodes;
  }

  public void setProviderCodes(List<ProviderCode> providerCodes) {
    this.providerCodes = providerCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intermediary intermediary = (Intermediary) o;
    return Objects.equals(this.intermediaryId, intermediary.intermediaryId) &&
        Objects.equals(this.name, intermediary.name) &&
        Objects.equals(this.email, intermediary.email) &&
        Objects.equals(this.nationalRegistration, intermediary.nationalRegistration) &&
        Objects.equals(this.startDate, intermediary.startDate) &&
        Objects.equals(this.endDate, intermediary.endDate) &&
        Objects.equals(this.status, intermediary.status) &&
        Objects.equals(this.intermediaryCode, intermediary.intermediaryCode) &&
        Objects.equals(this.providerCodes, intermediary.providerCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intermediaryId, name, email, nationalRegistration, startDate, endDate, status, intermediaryCode, providerCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intermediary {\n");
    
    sb.append("    intermediaryId: ").append(toIndentedString(intermediaryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nationalRegistration: ").append(toIndentedString(nationalRegistration)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    intermediaryCode: ").append(toIndentedString(intermediaryCode)).append("\n");
    sb.append("    providerCodes: ").append(toIndentedString(providerCodes)).append("\n");
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