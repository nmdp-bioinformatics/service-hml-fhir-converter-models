package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * VariantEffect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class VariantEffect  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("anyAttribute")
  private Object anyAttribute = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("hgvs")
  private String hgvs = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("term")
  private String term = null;

  @JsonProperty("uri")
  private String uri = null;

  public VariantEffect active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Active record
   * @return active
  **/
  @ApiModelProperty(value = "Active record")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public VariantEffect anyAttribute(Object anyAttribute) {
    this.anyAttribute = anyAttribute;
    return this;
  }

   /**
   * Get anyAttribute
   * @return anyAttribute
  **/
  @ApiModelProperty(value = "")
  public Object getAnyAttribute() {
    return anyAttribute;
  }

  public void setAnyAttribute(Object anyAttribute) {
    this.anyAttribute = anyAttribute;
  }

  public VariantEffect dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Creation date
   * @return dateCreated
  **/
  @ApiModelProperty(value = "Creation date")
  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public VariantEffect dateUpdated(Date dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Date updated
   * @return dateUpdated
  **/
  @ApiModelProperty(value = "Date updated")
  public Date getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(Date dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public VariantEffect hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * Get hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "")
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public VariantEffect id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VariantEffect term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public VariantEffect uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantEffect variantEffect = (VariantEffect) o;
    return Objects.equals(this.active, variantEffect.active) &&
        Objects.equals(this.anyAttribute, variantEffect.anyAttribute) &&
        Objects.equals(this.dateCreated, variantEffect.dateCreated) &&
        Objects.equals(this.dateUpdated, variantEffect.dateUpdated) &&
        Objects.equals(this.hgvs, variantEffect.hgvs) &&
        Objects.equals(this.id, variantEffect.id) &&
        Objects.equals(this.term, variantEffect.term) &&
        Objects.equals(this.uri, variantEffect.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, anyAttribute, dateCreated, dateUpdated, hgvs, id, term, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantEffect {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anyAttribute: ").append(toIndentedString(anyAttribute)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

