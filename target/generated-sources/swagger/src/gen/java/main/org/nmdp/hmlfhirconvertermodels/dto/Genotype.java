package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.nmdp.hmlfhirconvertermodels.dto.DiploidCombination;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Genotype
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class Genotype  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("diploidCombinations")
  private List<DiploidCombination> diploidCombinations = new ArrayList<DiploidCombination>();

  @JsonProperty("id")
  private String id = null;

  public Genotype active(Boolean active) {
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

  public Genotype dateCreated(DateTime dateCreated) {
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

  public Genotype dateUpdated(DateTime dateUpdated) {
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

  public Genotype diploidCombinations(List<DiploidCombination> diploidCombinations) {
    this.diploidCombinations = diploidCombinations;
    return this;
  }

  public Genotype addDiploidCombinationsItem(DiploidCombination diploidCombinationsItem) {
    this.diploidCombinations.add(diploidCombinationsItem);
    return this;
  }

   /**
   * Get diploidCombinations
   * @return diploidCombinations
  **/
  @ApiModelProperty(value = "")
  public List<DiploidCombination> getDiploidCombinations() {
    return diploidCombinations;
  }

  public void setDiploidCombinations(List<DiploidCombination> diploidCombinations) {
    this.diploidCombinations = diploidCombinations;
  }

  public Genotype id(String id) {
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
    Genotype genotype = (Genotype) o;
    return Objects.equals(this.active, genotype.active) &&
        Objects.equals(this.dateCreated, genotype.dateCreated) &&
        Objects.equals(this.dateUpdated, genotype.dateUpdated) &&
        Objects.equals(this.diploidCombinations, genotype.diploidCombinations) &&
        Objects.equals(this.id, genotype.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, diploidCombinations, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Genotype {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    diploidCombinations: ").append(toIndentedString(diploidCombinations)).append("\n");
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

