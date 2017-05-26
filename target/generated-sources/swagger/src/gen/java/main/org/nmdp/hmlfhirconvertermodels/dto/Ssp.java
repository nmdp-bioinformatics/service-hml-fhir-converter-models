package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Ssp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class Ssp  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("locus")
  private String locus = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("scores")
  private String scores = null;

  @JsonProperty("testId")
  private String testId = null;

  @JsonProperty("testIdSource")
  private String testIdSource = null;

  public Ssp active(Boolean active) {
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

  public Ssp dateCreated(DateTime dateCreated) {
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

  public Ssp dateUpdated(DateTime dateUpdated) {
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

  public Ssp id(String id) {
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

  public Ssp locus(String locus) {
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

  public Ssp properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Ssp addPropertiesItem(Property propertiesItem) {
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

  public Ssp scores(String scores) {
    this.scores = scores;
    return this;
  }

   /**
   * scores of test id
   * @return scores
  **/
  @ApiModelProperty(value = "scores of test id")
  public String getScores() {
    return scores;
  }

  public void setScores(String scores) {
    this.scores = scores;
  }

  public Ssp testId(String testId) {
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

  public Ssp testIdSource(String testIdSource) {
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
    Ssp ssp = (Ssp) o;
    return Objects.equals(this.active, ssp.active) &&
        Objects.equals(this.dateCreated, ssp.dateCreated) &&
        Objects.equals(this.dateUpdated, ssp.dateUpdated) &&
        Objects.equals(this.id, ssp.id) &&
        Objects.equals(this.locus, ssp.locus) &&
        Objects.equals(this.properties, ssp.properties) &&
        Objects.equals(this.scores, ssp.scores) &&
        Objects.equals(this.testId, ssp.testId) &&
        Objects.equals(this.testIdSource, ssp.testIdSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, locus, properties, scores, testId, testIdSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ssp {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locus: ").append(toIndentedString(locus)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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

