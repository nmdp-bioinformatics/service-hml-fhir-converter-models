package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.nmdp.hmlfhirconvertermodels.dto.CollectionMethod;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import org.nmdp.hmlfhirconvertermodels.dto.Typing;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Sample
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class Sample  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("centerCode")
  private String centerCode = null;

  @JsonProperty("collectionMethods")
  private List<CollectionMethod> collectionMethods = new ArrayList<CollectionMethod>();

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("sampleId")
  private String sampleId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("typing")
  private List<Typing> typing = new ArrayList<Typing>();

  public Sample active(Boolean active) {
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

  public Sample centerCode(String centerCode) {
    this.centerCode = centerCode;
    return this;
  }

   /**
   * Center code
   * @return centerCode
  **/
  @ApiModelProperty(value = "Center code")
  public String getCenterCode() {
    return centerCode;
  }

  public void setCenterCode(String centerCode) {
    this.centerCode = centerCode;
  }

  public Sample collectionMethods(List<CollectionMethod> collectionMethods) {
    this.collectionMethods = collectionMethods;
    return this;
  }

  public Sample addCollectionMethodsItem(CollectionMethod collectionMethodsItem) {
    this.collectionMethods.add(collectionMethodsItem);
    return this;
  }

   /**
   * array of center codes
   * @return collectionMethods
  **/
  @ApiModelProperty(value = "array of center codes")
  public List<CollectionMethod> getCollectionMethods() {
    return collectionMethods;
  }

  public void setCollectionMethods(List<CollectionMethod> collectionMethods) {
    this.collectionMethods = collectionMethods;
  }

  public Sample dateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date record was created
   * @return dateCreated
  **/
  @ApiModelProperty(value = "Date record was created")
  public DateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Sample dateUpdated(DateTime dateUpdated) {
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

  public Sample sampleId(String sampleId) {
    this.sampleId = sampleId;
    return this;
  }

   /**
   * user input Id of sample
   * @return sampleId
  **/
  @ApiModelProperty(value = "user input Id of sample")
  public String getSampleId() {
    return sampleId;
  }

  public void setSampleId(String sampleId) {
    this.sampleId = sampleId;
  }

  public Sample id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of sample
   * @return id
  **/
  @ApiModelProperty(value = "Id of sample")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Sample properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Sample addPropertiesItem(Property propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * array of properties
   * @return properties
  **/
  @ApiModelProperty(value = "array of properties")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public Sample typing(List<Typing> typing) {
    this.typing = typing;
    return this;
  }

  public Sample addTypingItem(Typing typingItem) {
    this.typing.add(typingItem);
    return this;
  }

   /**
   * typing data associated with sample
   * @return typing
  **/
  @ApiModelProperty(value = "typing data associated with sample")
  public List<Typing> getTyping() {
    return typing;
  }

  public void setTyping(List<Typing> typing) {
    this.typing = typing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sample sample = (Sample) o;
    return Objects.equals(this.active, sample.active) &&
        Objects.equals(this.centerCode, sample.centerCode) &&
        Objects.equals(this.collectionMethods, sample.collectionMethods) &&
        Objects.equals(this.dateCreated, sample.dateCreated) &&
        Objects.equals(this.dateUpdated, sample.dateUpdated) &&
        Objects.equals(this.sampleId, sample.sampleId) &&
        Objects.equals(this.id, sample.id) &&
        Objects.equals(this.properties, sample.properties) &&
        Objects.equals(this.typing, sample.typing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, centerCode, collectionMethods, dateCreated, dateUpdated, sampleId, id, properties, typing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sample {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    centerCode: ").append(toIndentedString(centerCode)).append("\n");
    sb.append("    collectionMethods: ").append(toIndentedString(collectionMethods)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    sampleId: ").append(toIndentedString(sampleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
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

