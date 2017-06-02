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
 * ReferenceSequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class ReferenceSequence  implements Serializable {
  @JsonProperty("accession")
  private String accession = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referenceSequenceId")
  private String referenceSequenceId = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("strand")
  private String strand = null;

  @JsonProperty("uri")
  private String uri = null;

  public ReferenceSequence accession(String accession) {
    this.accession = accession;
    return this;
  }

   /**
   * Get accession
   * @return accession
  **/
  @ApiModelProperty(value = "")
  public String getAccession() {
    return accession;
  }

  public void setAccession(String accession) {
    this.accession = accession;
  }

  public ReferenceSequence active(Boolean active) {
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

  public ReferenceSequence dateCreated(Date dateCreated) {
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

  public ReferenceSequence dateUpdated(Date dateUpdated) {
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

  public ReferenceSequence description(String description) {
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

  public ReferenceSequence end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public ReferenceSequence id(String id) {
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

  public ReferenceSequence name(String name) {
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

  public ReferenceSequence referenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
    return this;
  }

   /**
   * Get referenceSequenceId
   * @return referenceSequenceId
  **/
  @ApiModelProperty(value = "")
  public String getReferenceSequenceId() {
    return referenceSequenceId;
  }

  public void setReferenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
  }

  public ReferenceSequence start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ReferenceSequence strand(String strand) {
    this.strand = strand;
    return this;
  }

   /**
   * Get strand
   * @return strand
  **/
  @ApiModelProperty(value = "")
  public String getStrand() {
    return strand;
  }

  public void setStrand(String strand) {
    this.strand = strand;
  }

  public ReferenceSequence uri(String uri) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceSequence referenceSequence = (ReferenceSequence) o;
    return Objects.equals(this.accession, referenceSequence.accession) &&
        Objects.equals(this.active, referenceSequence.active) &&
        Objects.equals(this.dateCreated, referenceSequence.dateCreated) &&
        Objects.equals(this.dateUpdated, referenceSequence.dateUpdated) &&
        Objects.equals(this.description, referenceSequence.description) &&
        Objects.equals(this.end, referenceSequence.end) &&
        Objects.equals(this.id, referenceSequence.id) &&
        Objects.equals(this.name, referenceSequence.name) &&
        Objects.equals(this.referenceSequenceId, referenceSequence.referenceSequenceId) &&
        Objects.equals(this.start, referenceSequence.start) &&
        Objects.equals(this.strand, referenceSequence.strand) &&
        Objects.equals(this.uri, referenceSequence.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accession, active, dateCreated, dateUpdated, description, end, id, name, referenceSequenceId, start, strand, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSequence {\n");
    
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceSequenceId: ").append(toIndentedString(referenceSequenceId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
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

