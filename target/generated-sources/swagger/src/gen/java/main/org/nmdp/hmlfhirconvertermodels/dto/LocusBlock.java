package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.Allele;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * LocusBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class LocusBlock  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("alleles")
  private List<Allele> alleles = new ArrayList<Allele>();

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  public LocusBlock active(Boolean active) {
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

  public LocusBlock alleles(List<Allele> alleles) {
    this.alleles = alleles;
    return this;
  }

  public LocusBlock addAllelesItem(Allele allelesItem) {
    this.alleles.add(allelesItem);
    return this;
  }

   /**
   * Get alleles
   * @return alleles
  **/
  @ApiModelProperty(value = "")
  public List<Allele> getAlleles() {
    return alleles;
  }

  public void setAlleles(List<Allele> alleles) {
    this.alleles = alleles;
  }

  public LocusBlock dateCreated(Date dateCreated) {
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

  public LocusBlock dateUpdated(Date dateUpdated) {
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

  public LocusBlock id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocusBlock locusBlock = (LocusBlock) o;
    return Objects.equals(this.active, locusBlock.active) &&
        Objects.equals(this.alleles, locusBlock.alleles) &&
        Objects.equals(this.dateCreated, locusBlock.dateCreated) &&
        Objects.equals(this.dateUpdated, locusBlock.dateUpdated) &&
        Objects.equals(this.id, locusBlock.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, alleles, dateCreated, dateUpdated, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocusBlock {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    alleles: ").append(toIndentedString(alleles)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

