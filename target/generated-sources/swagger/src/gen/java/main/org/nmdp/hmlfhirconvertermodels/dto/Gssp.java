package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.nmdp.hmlfhirconvertermodels.dto.Sequence;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Gssp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class Gssp  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("primerSequence")
  private String primerSequence = null;

  @JsonProperty("primerTarget")
  private String primerTarget = null;

  @JsonProperty("registeredName")
  private String registeredName = null;

  @JsonProperty("sequence")
  private Sequence sequence = null;

  public Gssp active(Boolean active) {
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

  public Gssp dateCreated(Date dateCreated) {
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

  public Gssp dateUpdated(Date dateUpdated) {
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

  public Gssp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the typing
   * @return id
  **/
  @ApiModelProperty(value = "Id of the typing")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Gssp primerSequence(String primerSequence) {
    this.primerSequence = primerSequence;
    return this;
  }

   /**
   * sequence of primers used
   * @return primerSequence
  **/
  @ApiModelProperty(value = "sequence of primers used")
  public String getPrimerSequence() {
    return primerSequence;
  }

  public void setPrimerSequence(String primerSequence) {
    this.primerSequence = primerSequence;
  }

  public Gssp primerTarget(String primerTarget) {
    this.primerTarget = primerTarget;
    return this;
  }

   /**
   * intended primer sequence target
   * @return primerTarget
  **/
  @ApiModelProperty(value = "intended primer sequence target")
  public String getPrimerTarget() {
    return primerTarget;
  }

  public void setPrimerTarget(String primerTarget) {
    this.primerTarget = primerTarget;
  }

  public Gssp registeredName(String registeredName) {
    this.registeredName = registeredName;
    return this;
  }

   /**
   * registered name of gssp
   * @return registeredName
  **/
  @ApiModelProperty(value = "registered name of gssp")
  public String getRegisteredName() {
    return registeredName;
  }

  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }

  public Gssp sequence(Sequence sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * sequence of amplification
   * @return sequence
  **/
  @ApiModelProperty(value = "sequence of amplification")
  public Sequence getSequence() {
    return sequence;
  }

  public void setSequence(Sequence sequence) {
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
    Gssp gssp = (Gssp) o;
    return Objects.equals(this.active, gssp.active) &&
        Objects.equals(this.dateCreated, gssp.dateCreated) &&
        Objects.equals(this.dateUpdated, gssp.dateUpdated) &&
        Objects.equals(this.id, gssp.id) &&
        Objects.equals(this.primerSequence, gssp.primerSequence) &&
        Objects.equals(this.primerTarget, gssp.primerTarget) &&
        Objects.equals(this.registeredName, gssp.registeredName) &&
        Objects.equals(this.sequence, gssp.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, primerSequence, primerTarget, registeredName, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gssp {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primerSequence: ").append(toIndentedString(primerSequence)).append("\n");
    sb.append("    primerTarget: ").append(toIndentedString(primerTarget)).append("\n");
    sb.append("    registeredName: ").append(toIndentedString(registeredName)).append("\n");
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

