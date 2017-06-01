package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.nmdp.hmlfhirconvertermodels.dto.LocusBlock;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * DiploidCombination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class DiploidCombination  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("locusBlock")
  private LocusBlock locusBlock = null;

  public DiploidCombination active(Boolean active) {
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

  public DiploidCombination dateCreated(Date dateCreated) {
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

  public DiploidCombination dateUpdated(Date dateUpdated) {
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

  public DiploidCombination id(String id) {
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

  public DiploidCombination locusBlock(LocusBlock locusBlock) {
    this.locusBlock = locusBlock;
    return this;
  }

   /**
   * Get locusBlock
   * @return locusBlock
  **/
  @ApiModelProperty(value = "")
  public LocusBlock getLocusBlock() {
    return locusBlock;
  }

  public void setLocusBlock(LocusBlock locusBlock) {
    this.locusBlock = locusBlock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiploidCombination diploidCombination = (DiploidCombination) o;
    return Objects.equals(this.active, diploidCombination.active) &&
        Objects.equals(this.dateCreated, diploidCombination.dateCreated) &&
        Objects.equals(this.dateUpdated, diploidCombination.dateUpdated) &&
        Objects.equals(this.id, diploidCombination.id) &&
        Objects.equals(this.locusBlock, diploidCombination.locusBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, locusBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiploidCombination {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locusBlock: ").append(toIndentedString(locusBlock)).append("\n");
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

