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
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Sso
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class Sso  implements Serializable {
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

  public Sso active(Boolean active) {
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

  public Sso dateCreated(Date dateCreated) {
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

  public Sso dateUpdated(Date dateUpdated) {
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

  public Sso id(String id) {
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

  public Sso locus(String locus) {
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

  public Sso properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Sso addPropertiesItem(Property propertiesItem) {
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

  public Sso testId(String testId) {
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

  public Sso testIdSource(String testIdSource) {
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
    Sso sso = (Sso) o;
    return Objects.equals(this.active, sso.active) &&
        Objects.equals(this.dateCreated, sso.dateCreated) &&
        Objects.equals(this.dateUpdated, sso.dateUpdated) &&
        Objects.equals(this.id, sso.id) &&
        Objects.equals(this.locus, sso.locus) &&
        Objects.equals(this.properties, sso.properties) &&
        Objects.equals(this.testId, sso.testId) &&
        Objects.equals(this.testIdSource, sso.testIdSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, locus, properties, testId, testIdSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sso {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locus: ").append(toIndentedString(locus)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

