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
import io.swagger.client.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Client
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-08T15:04:17.157Z[GMT]")
public class Client {
  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("initials")
  private String initials = null;

  @JsonProperty("national_registration")
  private String nationalRegistration = null;

  @JsonProperty("products")
  private List<Product> products = null;

  public Client clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * unique identifier by which this client is known at consumer
   * @return clientId
  **/
  @Schema(example = "12345678", required = true, description = "unique identifier by which this client is known at consumer")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Client lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * last name of client
   * @return lastName
  **/
  @Schema(example = "Smit", required = true, description = "last name of client")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Client initials(String initials) {
    this.initials = initials;
    return this;
  }

   /**
   * full initials of client
   * @return initials
  **/
  @Schema(example = "WJ", description = "full initials of client")
  public String getInitials() {
    return initials;
  }

  public void setInitials(String initials) {
    this.initials = initials;
  }

  public Client nationalRegistration(String nationalRegistration) {
    this.nationalRegistration = nationalRegistration;
    return this;
  }

   /**
   * ID Number / Passport / other issued registration
   * @return nationalRegistration
  **/
  @Schema(example = "8901015800080", required = true, description = "ID Number / Passport / other issued registration")
  public String getNationalRegistration() {
    return nationalRegistration;
  }

  public void setNationalRegistration(String nationalRegistration) {
    this.nationalRegistration = nationalRegistration;
  }

  public Client products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Client addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * products held by this client.
   * @return products
  **/
  @Schema(description = "products held by this client.")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.clientId, client.clientId) &&
        Objects.equals(this.lastName, client.lastName) &&
        Objects.equals(this.initials, client.initials) &&
        Objects.equals(this.nationalRegistration, client.nationalRegistration) &&
        Objects.equals(this.products, client.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, lastName, initials, nationalRegistration, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    nationalRegistration: ").append(toIndentedString(nationalRegistration)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
