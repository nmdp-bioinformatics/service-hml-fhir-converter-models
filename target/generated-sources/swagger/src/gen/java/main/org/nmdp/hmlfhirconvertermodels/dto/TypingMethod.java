package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.nmdp.hmlfhirconvertermodels.dto.SbtNgs;
import org.nmdp.hmlfhirconvertermodels.dto.SbtSanger;
import org.nmdp.hmlfhirconvertermodels.dto.Sso;
import org.nmdp.hmlfhirconvertermodels.dto.Ssp;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * TypingMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class TypingMethod  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("sbtSanger")
  private SbtSanger sbtSanger = null;

  @JsonProperty("sbtNgs")
  private SbtNgs sbtNgs = null;

  @JsonProperty("sso")
  private Sso sso = null;

  @JsonProperty("ssp")
  private Ssp ssp = null;

  public TypingMethod active(Boolean active) {
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

  public TypingMethod dateCreated(Date dateCreated) {
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

  public TypingMethod dateUpdated(Date dateUpdated) {
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

  public TypingMethod id(String id) {
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

  public TypingMethod sbtSanger(SbtSanger sbtSanger) {
    this.sbtSanger = sbtSanger;
    return this;
  }

   /**
   * method sanger sbt
   * @return sbtSanger
  **/
  @ApiModelProperty(value = "method sanger sbt")
  public SbtSanger getSbtSanger() {
    return sbtSanger;
  }

  public void setSbtSanger(SbtSanger sbtSanger) {
    this.sbtSanger = sbtSanger;
  }

  public TypingMethod sbtNgs(SbtNgs sbtNgs) {
    this.sbtNgs = sbtNgs;
    return this;
  }

   /**
   * Get sbtNgs
   * @return sbtNgs
  **/
  @ApiModelProperty(value = "")
  public SbtNgs getSbtNgs() {
    return sbtNgs;
  }

  public void setSbtNgs(SbtNgs sbtNgs) {
    this.sbtNgs = sbtNgs;
  }

  public TypingMethod sso(Sso sso) {
    this.sso = sso;
    return this;
  }

   /**
   * method sso
   * @return sso
  **/
  @ApiModelProperty(value = "method sso")
  public Sso getSso() {
    return sso;
  }

  public void setSso(Sso sso) {
    this.sso = sso;
  }

  public TypingMethod ssp(Ssp ssp) {
    this.ssp = ssp;
    return this;
  }

   /**
   * method ssp
   * @return ssp
  **/
  @ApiModelProperty(value = "method ssp")
  public Ssp getSsp() {
    return ssp;
  }

  public void setSsp(Ssp ssp) {
    this.ssp = ssp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypingMethod typingMethod = (TypingMethod) o;
    return Objects.equals(this.active, typingMethod.active) &&
        Objects.equals(this.dateCreated, typingMethod.dateCreated) &&
        Objects.equals(this.dateUpdated, typingMethod.dateUpdated) &&
        Objects.equals(this.id, typingMethod.id) &&
        Objects.equals(this.sbtSanger, typingMethod.sbtSanger) &&
        Objects.equals(this.sbtNgs, typingMethod.sbtNgs) &&
        Objects.equals(this.sso, typingMethod.sso) &&
        Objects.equals(this.ssp, typingMethod.ssp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, sbtSanger, sbtNgs, sso, ssp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypingMethod {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sbtSanger: ").append(toIndentedString(sbtSanger)).append("\n");
    sb.append("    sbtNgs: ").append(toIndentedString(sbtNgs)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    ssp: ").append(toIndentedString(ssp)).append("\n");
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

