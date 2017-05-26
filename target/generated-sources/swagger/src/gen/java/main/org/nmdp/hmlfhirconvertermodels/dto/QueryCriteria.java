package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * QueryCriteria
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class QueryCriteria  implements Serializable {
  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("queryValue")
  private Object queryValue = null;

  @JsonProperty("exclude")
  private Boolean exclude = null;

  @JsonProperty("useLike")
  private Boolean useLike = null;

  public QueryCriteria propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The property name to query
   * @return propertyName
  **/
  @ApiModelProperty(value = "The property name to query")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public QueryCriteria queryValue(Object queryValue) {
    this.queryValue = queryValue;
    return this;
  }

   /**
   * The value to query against
   * @return queryValue
  **/
  @ApiModelProperty(value = "The value to query against")
  public Object getQueryValue() {
    return queryValue;
  }

  public void setQueryValue(Object queryValue) {
    this.queryValue = queryValue;
  }

  public QueryCriteria exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Allow for positive or negative matching
   * @return exclude
  **/
  @ApiModelProperty(value = "Allow for positive or negative matching")
  public Boolean getExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  public QueryCriteria useLike(Boolean useLike) {
    this.useLike = useLike;
    return this;
  }

   /**
   * Allow for like queries
   * @return useLike
  **/
  @ApiModelProperty(value = "Allow for like queries")
  public Boolean getUseLike() {
    return useLike;
  }

  public void setUseLike(Boolean useLike) {
    this.useLike = useLike;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCriteria queryCriteria = (QueryCriteria) o;
    return Objects.equals(this.propertyName, queryCriteria.propertyName) &&
        Objects.equals(this.queryValue, queryCriteria.queryValue) &&
        Objects.equals(this.exclude, queryCriteria.exclude) &&
        Objects.equals(this.useLike, queryCriteria.useLike);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, queryValue, exclude, useLike);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCriteria {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    queryValue: ").append(toIndentedString(queryValue)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    useLike: ").append(toIndentedString(useLike)).append("\n");
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

