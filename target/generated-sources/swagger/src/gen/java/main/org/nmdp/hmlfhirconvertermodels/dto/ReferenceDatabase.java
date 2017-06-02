package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.nmdp.hmlfhirconvertermodels.dto.ReferenceSequence;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ReferenceDatabase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class ReferenceDatabase  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("availability")
  private String availability = null;

  @JsonProperty("curated")
  private Boolean curated = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referenceSequence")
  private ReferenceSequence referenceSequence = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("version")
  private String version = null;

  public ReferenceDatabase active(Boolean active) {
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

  public ReferenceDatabase availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public ReferenceDatabase curated(Boolean curated) {
    this.curated = curated;
    return this;
  }

   /**
   * Get curated
   * @return curated
  **/
  @ApiModelProperty(value = "")
  public Boolean getCurated() {
    return curated;
  }

  public void setCurated(Boolean curated) {
    this.curated = curated;
  }

  public ReferenceDatabase dateCreated(Date dateCreated) {
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

  public ReferenceDatabase dateUpdated(Date dateUpdated) {
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

  public ReferenceDatabase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReferenceDatabase id(String id) {
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

  public ReferenceDatabase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReferenceDatabase referenceSequence(ReferenceSequence referenceSequence) {
    this.referenceSequence = referenceSequence;
    return this;
  }

   /**
   * Get referenceSequence
   * @return referenceSequence
  **/
  @ApiModelProperty(value = "")
  public ReferenceSequence getReferenceSequence() {
    return referenceSequence;
  }

  public void setReferenceSequence(ReferenceSequence referenceSequence) {
    this.referenceSequence = referenceSequence;
  }

  public ReferenceDatabase uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ReferenceDatabase version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceDatabase referenceDatabase = (ReferenceDatabase) o;
    return Objects.equals(this.active, referenceDatabase.active) &&
        Objects.equals(this.availability, referenceDatabase.availability) &&
        Objects.equals(this.curated, referenceDatabase.curated) &&
        Objects.equals(this.dateCreated, referenceDatabase.dateCreated) &&
        Objects.equals(this.dateUpdated, referenceDatabase.dateUpdated) &&
        Objects.equals(this.description, referenceDatabase.description) &&
        Objects.equals(this.id, referenceDatabase.id) &&
        Objects.equals(this.name, referenceDatabase.name) &&
        Objects.equals(this.referenceSequence, referenceDatabase.referenceSequence) &&
        Objects.equals(this.uri, referenceDatabase.uri) &&
        Objects.equals(this.version, referenceDatabase.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, availability, curated, dateCreated, dateUpdated, description, id, name, referenceSequence, uri, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceDatabase {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    curated: ").append(toIndentedString(curated)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceSequence: ").append(toIndentedString(referenceSequence)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

