package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.nmdp.hmlfhirconvertermodels.dto.VariantEffect;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Variant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class Variant  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("alternateBases")
  private String alternateBases = null;

  @JsonProperty("anyAttribute")
  private Object anyAttribute = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("filter")
  private String filter = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("qualityScore")
  private String qualityScore = null;

  @JsonProperty("referenceBases")
  private String referenceBases = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("variantEffect")
  private VariantEffect variantEffect = null;

  @JsonProperty("variantId")
  private String variantId = null;

  public Variant active(Boolean active) {
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

  public Variant alternateBases(String alternateBases) {
    this.alternateBases = alternateBases;
    return this;
  }

   /**
   * Get alternateBases
   * @return alternateBases
  **/
  @ApiModelProperty(value = "")
  public String getAlternateBases() {
    return alternateBases;
  }

  public void setAlternateBases(String alternateBases) {
    this.alternateBases = alternateBases;
  }

  public Variant anyAttribute(Object anyAttribute) {
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

  public Variant dateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Creation date
   * @return dateCreated
  **/
  @ApiModelProperty(value = "Creation date")
  public DateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Variant dateUpdated(DateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Date updated
   * @return dateUpdated
  **/
  @ApiModelProperty(value = "Date updated")
  public DateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(DateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public Variant end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public Variant filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Variant id(String id) {
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

  public Variant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Variant qualityScore(String qualityScore) {
    this.qualityScore = qualityScore;
    return this;
  }

   /**
   * Get qualityScore
   * @return qualityScore
  **/
  @ApiModelProperty(value = "")
  public String getQualityScore() {
    return qualityScore;
  }

  public void setQualityScore(String qualityScore) {
    this.qualityScore = qualityScore;
  }

  public Variant referenceBases(String referenceBases) {
    this.referenceBases = referenceBases;
    return this;
  }

   /**
   * Get referenceBases
   * @return referenceBases
  **/
  @ApiModelProperty(value = "")
  public String getReferenceBases() {
    return referenceBases;
  }

  public void setReferenceBases(String referenceBases) {
    this.referenceBases = referenceBases;
  }

  public Variant start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Variant uri(String uri) {
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

  public Variant variantEffect(VariantEffect variantEffect) {
    this.variantEffect = variantEffect;
    return this;
  }

   /**
   * Get variantEffect
   * @return variantEffect
  **/
  @ApiModelProperty(value = "")
  public VariantEffect getVariantEffect() {
    return variantEffect;
  }

  public void setVariantEffect(VariantEffect variantEffect) {
    this.variantEffect = variantEffect;
  }

  public Variant variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * Get variantId
   * @return variantId
  **/
  @ApiModelProperty(value = "")
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variant variant = (Variant) o;
    return Objects.equals(this.active, variant.active) &&
        Objects.equals(this.alternateBases, variant.alternateBases) &&
        Objects.equals(this.anyAttribute, variant.anyAttribute) &&
        Objects.equals(this.dateCreated, variant.dateCreated) &&
        Objects.equals(this.dateUpdated, variant.dateUpdated) &&
        Objects.equals(this.end, variant.end) &&
        Objects.equals(this.filter, variant.filter) &&
        Objects.equals(this.id, variant.id) &&
        Objects.equals(this.name, variant.name) &&
        Objects.equals(this.qualityScore, variant.qualityScore) &&
        Objects.equals(this.referenceBases, variant.referenceBases) &&
        Objects.equals(this.start, variant.start) &&
        Objects.equals(this.uri, variant.uri) &&
        Objects.equals(this.variantEffect, variant.variantEffect) &&
        Objects.equals(this.variantId, variant.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, alternateBases, anyAttribute, dateCreated, dateUpdated, end, filter, id, name, qualityScore, referenceBases, start, uri, variantEffect, variantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variant {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    alternateBases: ").append(toIndentedString(alternateBases)).append("\n");
    sb.append("    anyAttribute: ").append(toIndentedString(anyAttribute)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualityScore: ").append(toIndentedString(qualityScore)).append("\n");
    sb.append("    referenceBases: ").append(toIndentedString(referenceBases)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    variantEffect: ").append(toIndentedString(variantEffect)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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

