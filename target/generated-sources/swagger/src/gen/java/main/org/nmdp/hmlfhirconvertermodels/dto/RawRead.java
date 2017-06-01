package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * RawRead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class RawRead  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("adapterTrimmed")
  private Boolean adapterTrimmed = null;

  @JsonProperty("availability")
  private String availability = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("paired")
  private Boolean paired = null;

  @JsonProperty("pooled")
  private Boolean pooled = null;

  @JsonProperty("qualityTrimmed")
  private Boolean qualityTrimmed = null;

  @JsonProperty("uri")
  private String uri = null;

  public RawRead active(Boolean active) {
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

  public RawRead adapterTrimmed(Boolean adapterTrimmed) {
    this.adapterTrimmed = adapterTrimmed;
    return this;
  }

   /**
   * adapter was trimmed
   * @return adapterTrimmed
  **/
  @ApiModelProperty(value = "adapter was trimmed")
  public Boolean getAdapterTrimmed() {
    return adapterTrimmed;
  }

  public void setAdapterTrimmed(Boolean adapterTrimmed) {
    this.adapterTrimmed = adapterTrimmed;
  }

  public RawRead availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * availability of reads
   * @return availability
  **/
  @ApiModelProperty(value = "availability of reads")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public RawRead dateCreated(Date dateCreated) {
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

  public RawRead dateUpdated(Date dateUpdated) {
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

  public RawRead format(String format) {
    this.format = format;
    return this;
  }

   /**
   * format of uri
   * @return format
  **/
  @ApiModelProperty(value = "format of uri")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public RawRead id(String id) {
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

  public RawRead paired(Boolean paired) {
    this.paired = paired;
    return this;
  }

   /**
   * paired reads
   * @return paired
  **/
  @ApiModelProperty(value = "paired reads")
  public Boolean getPaired() {
    return paired;
  }

  public void setPaired(Boolean paired) {
    this.paired = paired;
  }

  public RawRead pooled(Boolean pooled) {
    this.pooled = pooled;
    return this;
  }

   /**
   * pooled sample reads
   * @return pooled
  **/
  @ApiModelProperty(value = "pooled sample reads")
  public Boolean getPooled() {
    return pooled;
  }

  public void setPooled(Boolean pooled) {
    this.pooled = pooled;
  }

  public RawRead qualityTrimmed(Boolean qualityTrimmed) {
    this.qualityTrimmed = qualityTrimmed;
    return this;
  }

   /**
   * trimmed quality
   * @return qualityTrimmed
  **/
  @ApiModelProperty(value = "trimmed quality")
  public Boolean getQualityTrimmed() {
    return qualityTrimmed;
  }

  public void setQualityTrimmed(Boolean qualityTrimmed) {
    this.qualityTrimmed = qualityTrimmed;
  }

  public RawRead uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * data location uri
   * @return uri
  **/
  @ApiModelProperty(value = "data location uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawRead rawRead = (RawRead) o;
    return Objects.equals(this.active, rawRead.active) &&
        Objects.equals(this.adapterTrimmed, rawRead.adapterTrimmed) &&
        Objects.equals(this.availability, rawRead.availability) &&
        Objects.equals(this.dateCreated, rawRead.dateCreated) &&
        Objects.equals(this.dateUpdated, rawRead.dateUpdated) &&
        Objects.equals(this.format, rawRead.format) &&
        Objects.equals(this.id, rawRead.id) &&
        Objects.equals(this.paired, rawRead.paired) &&
        Objects.equals(this.pooled, rawRead.pooled) &&
        Objects.equals(this.qualityTrimmed, rawRead.qualityTrimmed) &&
        Objects.equals(this.uri, rawRead.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, adapterTrimmed, availability, dateCreated, dateUpdated, format, id, paired, pooled, qualityTrimmed, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawRead {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    adapterTrimmed: ").append(toIndentedString(adapterTrimmed)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paired: ").append(toIndentedString(paired)).append("\n");
    sb.append("    pooled: ").append(toIndentedString(pooled)).append("\n");
    sb.append("    qualityTrimmed: ").append(toIndentedString(qualityTrimmed)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

