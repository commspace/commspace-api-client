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
 * ImportError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-31T12:15:05.519Z[GMT]")
public class ImportError {
  /**
   * the type of the entity. One of client, product or intermediary.
   */
  public enum EntityTypeEnum {
    CLIENT("client"),
    PRODUCT("product"),
    INTERMEDIARY("intermediary");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("entity_type")
  private EntityTypeEnum entityType = null;

  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  public ImportError entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * the type of the entity. One of client, product or intermediary.
   * @return entityType
  **/
  @Schema(example = "intermediary", description = "the type of the entity. One of client, product or intermediary.")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public ImportError entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * unique id (as known by the consumer) of the entity that had the error
   * @return entityId
  **/
  @Schema(example = "9000123", description = "unique id (as known by the consumer) of the entity that had the error")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ImportError title(String title) {
    this.title = title;
    return this;
  }

   /**
   * short summary of the type of problem
   * @return title
  **/
  @Schema(example = "invalid value", description = "short summary of the type of problem")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ImportError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * human-readable explanation of the error that occurred
   * @return description
  **/
  @Schema(example = "The value provided for intermediary doesn't map to a known intermediary", description = "human-readable explanation of the error that occurred")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportError importError = (ImportError) o;
    return Objects.equals(this.entityType, importError.entityType) &&
        Objects.equals(this.entityId, importError.entityId) &&
        Objects.equals(this.title, importError.title) &&
        Objects.equals(this.description, importError.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, entityId, title, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportError {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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