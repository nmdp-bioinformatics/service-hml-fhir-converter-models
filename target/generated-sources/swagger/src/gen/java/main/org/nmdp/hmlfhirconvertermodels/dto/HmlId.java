package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * HmlId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class HmlId  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("rootName")
  private String rootName = null;

  public HmlId active(Boolean active) {
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

  public HmlId dateCreated(DateTime dateCreated) {
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

  public HmlId dateUpdated(DateTime dateUpdated) {
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

  public HmlId extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extendsion of hml id
   * @return extension
  **/
  @ApiModelProperty(value = "Extendsion of hml id")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public HmlId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the hmlid item
   * @return id
  **/
  @ApiModelProperty(value = "Id of the hmlid item")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HmlId rootName(String rootName) {
    this.rootName = rootName;
    return this;
  }

   /**
   * Root name of hml
   * @return rootName
  **/
  @ApiModelProperty(value = "Root name of hml")
  public String getRootName() {
    return rootName;
  }

  public void setRootName(String rootName) {
    this.rootName = rootName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HmlId hmlId = (HmlId) o;
    return Objects.equals(this.active, hmlId.active) &&
        Objects.equals(this.dateCreated, hmlId.dateCreated) &&
        Objects.equals(this.dateUpdated, hmlId.dateUpdated) &&
        Objects.equals(this.extension, hmlId.extension) &&
        Objects.equals(this.id, hmlId.id) &&
        Objects.equals(this.rootName, hmlId.rootName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, extension, id, rootName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HmlId {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rootName: ").append(toIndentedString(rootName)).append("\n");
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

