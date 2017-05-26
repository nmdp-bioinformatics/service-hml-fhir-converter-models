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
 * ReportingCenter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class ReportingCenter  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("centerId")
  private String centerId = null;

  @JsonProperty("context")
  private String context = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  public ReportingCenter active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Active center
   * @return active
  **/
  @ApiModelProperty(value = "Active center")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ReportingCenter centerId(String centerId) {
    this.centerId = centerId;
    return this;
  }

   /**
   * Id of reporting center
   * @return centerId
  **/
  @ApiModelProperty(value = "Id of reporting center")
  public String getCenterId() {
    return centerId;
  }

  public void setCenterId(String centerId) {
    this.centerId = centerId;
  }

  public ReportingCenter context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context of reporting center
   * @return context
  **/
  @ApiModelProperty(value = "Context of reporting center")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public ReportingCenter dateCreated(DateTime dateCreated) {
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

  public ReportingCenter dateUpdated(DateTime dateUpdated) {
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

  public ReportingCenter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of reporting center
   * @return id
  **/
  @ApiModelProperty(value = "Id of reporting center")
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
    ReportingCenter reportingCenter = (ReportingCenter) o;
    return Objects.equals(this.active, reportingCenter.active) &&
        Objects.equals(this.centerId, reportingCenter.centerId) &&
        Objects.equals(this.context, reportingCenter.context) &&
        Objects.equals(this.dateCreated, reportingCenter.dateCreated) &&
        Objects.equals(this.dateUpdated, reportingCenter.dateUpdated) &&
        Objects.equals(this.id, reportingCenter.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, centerId, context, dateCreated, dateUpdated, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingCenter {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    centerId: ").append(toIndentedString(centerId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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

