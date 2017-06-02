package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.IupacBases;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Sequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class Sequence  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("anyAttribute")
  private Object anyAttribute = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("iupacBases")
  private List<IupacBases> iupacBases = new ArrayList<IupacBases>();

  @JsonProperty("sequence")
  private String sequence = null;

  public Sequence active(Boolean active) {
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

  public Sequence anyAttribute(Object anyAttribute) {
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

  public Sequence dateCreated(Date dateCreated) {
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

  public Sequence dateUpdated(Date dateUpdated) {
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

  public Sequence id(String id) {
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

  public Sequence iupacBases(List<IupacBases> iupacBases) {
    this.iupacBases = iupacBases;
    return this;
  }

  public Sequence addIupacBasesItem(IupacBases iupacBasesItem) {
    this.iupacBases.add(iupacBasesItem);
    return this;
  }

   /**
   * Get iupacBases
   * @return iupacBases
  **/
  @ApiModelProperty(value = "")
  public List<IupacBases> getIupacBases() {
    return iupacBases;
  }

  public void setIupacBases(List<IupacBases> iupacBases) {
    this.iupacBases = iupacBases;
  }

  public Sequence sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sequence sequence = (Sequence) o;
    return Objects.equals(this.active, sequence.active) &&
        Objects.equals(this.anyAttribute, sequence.anyAttribute) &&
        Objects.equals(this.dateCreated, sequence.dateCreated) &&
        Objects.equals(this.dateUpdated, sequence.dateUpdated) &&
        Objects.equals(this.id, sequence.id) &&
        Objects.equals(this.iupacBases, sequence.iupacBases) &&
        Objects.equals(this.sequence, sequence.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, anyAttribute, dateCreated, dateUpdated, id, iupacBases, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sequence {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anyAttribute: ").append(toIndentedString(anyAttribute)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iupacBases: ").append(toIndentedString(iupacBases)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

