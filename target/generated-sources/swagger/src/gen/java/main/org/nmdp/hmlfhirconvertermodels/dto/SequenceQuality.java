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
 * SequenceQuality
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class SequenceQuality  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("qualityScore")
  private String qualityScore = null;

  @JsonProperty("sequenceEnd")
  private Integer sequenceEnd = null;

  @JsonProperty("sequenceStart")
  private Integer sequenceStart = null;

  public SequenceQuality active(Boolean active) {
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

  public SequenceQuality dateCreated(Date dateCreated) {
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

  public SequenceQuality dateUpdated(Date dateUpdated) {
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

  public SequenceQuality id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SequenceQuality qualityScore(String qualityScore) {
    this.qualityScore = qualityScore;
    return this;
  }

   /**
   * Get qualityScore
   * @return qualityScore
  **/
  @ApiModelProperty(value = "")
  public String getQualityScore() {
    return qualityScore;
  }

  public void setQualityScore(String qualityScore) {
    this.qualityScore = qualityScore;
  }

  public SequenceQuality sequenceEnd(Integer sequenceEnd) {
    this.sequenceEnd = sequenceEnd;
    return this;
  }

   /**
   * Get sequenceEnd
   * @return sequenceEnd
  **/
  @ApiModelProperty(value = "")
  public Integer getSequenceEnd() {
    return sequenceEnd;
  }

  public void setSequenceEnd(Integer sequenceEnd) {
    this.sequenceEnd = sequenceEnd;
  }

  public SequenceQuality sequenceStart(Integer sequenceStart) {
    this.sequenceStart = sequenceStart;
    return this;
  }

   /**
   * Get sequenceStart
   * @return sequenceStart
  **/
  @ApiModelProperty(value = "")
  public Integer getSequenceStart() {
    return sequenceStart;
  }

  public void setSequenceStart(Integer sequenceStart) {
    this.sequenceStart = sequenceStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SequenceQuality sequenceQuality = (SequenceQuality) o;
    return Objects.equals(this.active, sequenceQuality.active) &&
        Objects.equals(this.dateCreated, sequenceQuality.dateCreated) &&
        Objects.equals(this.dateUpdated, sequenceQuality.dateUpdated) &&
        Objects.equals(this.id, sequenceQuality.id) &&
        Objects.equals(this.qualityScore, sequenceQuality.qualityScore) &&
        Objects.equals(this.sequenceEnd, sequenceQuality.sequenceEnd) &&
        Objects.equals(this.sequenceStart, sequenceQuality.sequenceStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, id, qualityScore, sequenceEnd, sequenceStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceQuality {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    qualityScore: ").append(toIndentedString(qualityScore)).append("\n");
    sb.append("    sequenceEnd: ").append(toIndentedString(sequenceEnd)).append("\n");
    sb.append("    sequenceStart: ").append(toIndentedString(sequenceStart)).append("\n");
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

