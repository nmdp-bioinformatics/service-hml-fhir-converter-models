package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import org.nmdp.hmlfhirconvertermodels.dto.RawRead;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * SbtNgs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class SbtNgs  implements Serializable {
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

  @JsonProperty("rawReads")
  private List<RawRead> rawReads = new ArrayList<RawRead>();

  @JsonProperty("testId")
  private String testId = null;

  @JsonProperty("testIdSource")
  private String testIdSource = null;

  public SbtNgs active(Boolean active) {
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

  public SbtNgs dateCreated(Date dateCreated) {
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

  public SbtNgs dateUpdated(Date dateUpdated) {
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

  public SbtNgs id(String id) {
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

  public SbtNgs locus(String locus) {
    this.locus = locus;
    return this;
  }

   /**
   * locus of ngs location
   * @return locus
  **/
  @ApiModelProperty(value = "locus of ngs location")
  public String getLocus() {
    return locus;
  }

  public void setLocus(String locus) {
    this.locus = locus;
  }

  public SbtNgs properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public SbtNgs addPropertiesItem(Property propertiesItem) {
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

  public SbtNgs rawReads(List<RawRead> rawReads) {
    this.rawReads = rawReads;
    return this;
  }

  public SbtNgs addRawReadsItem(RawRead rawReadsItem) {
    this.rawReads.add(rawReadsItem);
    return this;
  }

   /**
   * raw read data
   * @return rawReads
  **/
  @ApiModelProperty(value = "raw read data")
  public List<RawRead> getRawReads() {
    return rawReads;
  }

  public void setRawReads(List<RawRead> rawReads) {
    this.rawReads = rawReads;
  }

  public SbtNgs testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * id of ngs test
   * @return testId
  **/
  @ApiModelProperty(value = "id of ngs test")
  public String getTestId() {
    return testId;
  }

  public void setTestId(String testId) {
    this.testId = testId;
  }

  public SbtNgs testIdSource(String testIdSource) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SbtNgs sbtNgs = (SbtNgs) o;
    return Objects.equals(this.active, sbtNgs.active) &&
        Objects.equals(this.dateCreated, sbtNgs.dateCreated) &&
        Objects.equals(this.dateUpdated, sbtNgs.dateUpdated) &&
        Objects.equals(this.id, sbtNgs.id) &&
        Objects.equals(this.locus, sbtNgs.locus) &&
        Objects.equals(this.properties, sbtNgs.properties) &&
        Objects.equals(this.rawReads, sbtNgs.rawReads) &&
        Objects.equals(this.testId, sbtNgs.testId) &&
        Objects.equals(this.testIdSource, sbtNgs.testIdSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, locus, properties, rawReads, testId, testIdSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SbtNgs {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locus: ").append(toIndentedString(locus)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    rawReads: ").append(toIndentedString(rawReads)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testIdSource: ").append(toIndentedString(testIdSource)).append("\n");
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

