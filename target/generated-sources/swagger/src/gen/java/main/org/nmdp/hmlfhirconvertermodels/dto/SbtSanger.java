package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.Amplification;
import org.nmdp.hmlfhirconvertermodels.dto.Gssp;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import org.nmdp.hmlfhirconvertermodels.dto.SubAmplification;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * SbtSanger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class SbtSanger  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("locus")
  private String locus = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("testId")
  private String testId = null;

  @JsonProperty("testIdSource")
  private String testIdSource = null;

  @JsonProperty("amplification")
  private Amplification amplification = null;

  @JsonProperty("subAmplification")
  private SubAmplification subAmplification = null;

  @JsonProperty("gssp")
  private Gssp gssp = null;

  public SbtSanger active(Boolean active) {
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

  public SbtSanger dateCreated(Date dateCreated) {
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

  public SbtSanger dateUpdated(Date dateUpdated) {
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

  public SbtSanger id(String id) {
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

  public SbtSanger locus(String locus) {
    this.locus = locus;
    return this;
  }

   /**
   * gene locus
   * @return locus
  **/
  @ApiModelProperty(value = "gene locus")
  public String getLocus() {
    return locus;
  }

  public void setLocus(String locus) {
    this.locus = locus;
  }

  public SbtSanger properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public SbtSanger addPropertiesItem(Property propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Properteis belonging to this item
   * @return properties
  **/
  @ApiModelProperty(value = "Properteis belonging to this item")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public SbtSanger testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * id of test
   * @return testId
  **/
  @ApiModelProperty(value = "id of test")
  public String getTestId() {
    return testId;
  }

  public void setTestId(String testId) {
    this.testId = testId;
  }

  public SbtSanger testIdSource(String testIdSource) {
    this.testIdSource = testIdSource;
    return this;
  }

   /**
   * source of test id
   * @return testIdSource
  **/
  @ApiModelProperty(value = "source of test id")
  public String getTestIdSource() {
    return testIdSource;
  }

  public void setTestIdSource(String testIdSource) {
    this.testIdSource = testIdSource;
  }

  public SbtSanger amplification(Amplification amplification) {
    this.amplification = amplification;
    return this;
  }

   /**
   * Get amplification
   * @return amplification
  **/
  @ApiModelProperty(value = "")
  public Amplification getAmplification() {
    return amplification;
  }

  public void setAmplification(Amplification amplification) {
    this.amplification = amplification;
  }

  public SbtSanger subAmplification(SubAmplification subAmplification) {
    this.subAmplification = subAmplification;
    return this;
  }

   /**
   * Get subAmplification
   * @return subAmplification
  **/
  @ApiModelProperty(value = "")
  public SubAmplification getSubAmplification() {
    return subAmplification;
  }

  public void setSubAmplification(SubAmplification subAmplification) {
    this.subAmplification = subAmplification;
  }

  public SbtSanger gssp(Gssp gssp) {
    this.gssp = gssp;
    return this;
  }

   /**
   * Get gssp
   * @return gssp
  **/
  @ApiModelProperty(value = "")
  public Gssp getGssp() {
    return gssp;
  }

  public void setGssp(Gssp gssp) {
    this.gssp = gssp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SbtSanger sbtSanger = (SbtSanger) o;
    return Objects.equals(this.active, sbtSanger.active) &&
        Objects.equals(this.dateCreated, sbtSanger.dateCreated) &&
        Objects.equals(this.dateUpdated, sbtSanger.dateUpdated) &&
        Objects.equals(this.id, sbtSanger.id) &&
        Objects.equals(this.locus, sbtSanger.locus) &&
        Objects.equals(this.properties, sbtSanger.properties) &&
        Objects.equals(this.testId, sbtSanger.testId) &&
        Objects.equals(this.testIdSource, sbtSanger.testIdSource) &&
        Objects.equals(this.amplification, sbtSanger.amplification) &&
        Objects.equals(this.subAmplification, sbtSanger.subAmplification) &&
        Objects.equals(this.gssp, sbtSanger.gssp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, locus, properties, testId, testIdSource, amplification, subAmplification, gssp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SbtSanger {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locus: ").append(toIndentedString(locus)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testIdSource: ").append(toIndentedString(testIdSource)).append("\n");
    sb.append("    amplification: ").append(toIndentedString(amplification)).append("\n");
    sb.append("    subAmplification: ").append(toIndentedString(subAmplification)).append("\n");
    sb.append("    gssp: ").append(toIndentedString(gssp)).append("\n");
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

