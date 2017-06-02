package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.nmdp.hmlfhirconvertermodels.dto.Sequence;
import org.nmdp.hmlfhirconvertermodels.dto.SequenceQuality;
import org.nmdp.hmlfhirconvertermodels.dto.Variant;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ConsensusSequenceBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class ConsensusSequenceBlock  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("continuity")
  private Boolean continuity = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("expectedCopyNumber")
  private Integer expectedCopyNumber = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("phaseSet")
  private String phaseSet = null;

  @JsonProperty("phasingGroup")
  private String phasingGroup = null;

  @JsonProperty("referenceSequenceId")
  private String referenceSequenceId = null;

  @JsonProperty("sequence")
  private Sequence sequence = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("strand")
  private String strand = null;

  @JsonProperty("variant")
  private Variant variant = null;

  @JsonProperty("sequenceQuality")
  private SequenceQuality sequenceQuality = null;

  public ConsensusSequenceBlock active(Boolean active) {
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

  public ConsensusSequenceBlock continuity(Boolean continuity) {
    this.continuity = continuity;
    return this;
  }

   /**
   * Get continuity
   * @return continuity
  **/
  @ApiModelProperty(value = "")
  public Boolean getContinuity() {
    return continuity;
  }

  public void setContinuity(Boolean continuity) {
    this.continuity = continuity;
  }

  public ConsensusSequenceBlock dateCreated(Date dateCreated) {
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

  public ConsensusSequenceBlock dateUpdated(Date dateUpdated) {
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

  public ConsensusSequenceBlock description(String description) {
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

  public ConsensusSequenceBlock end(Integer end) {
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

  public ConsensusSequenceBlock expectedCopyNumber(Integer expectedCopyNumber) {
    this.expectedCopyNumber = expectedCopyNumber;
    return this;
  }

   /**
   * Get expectedCopyNumber
   * @return expectedCopyNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getExpectedCopyNumber() {
    return expectedCopyNumber;
  }

  public void setExpectedCopyNumber(Integer expectedCopyNumber) {
    this.expectedCopyNumber = expectedCopyNumber;
  }

  public ConsensusSequenceBlock id(String id) {
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

  public ConsensusSequenceBlock phaseSet(String phaseSet) {
    this.phaseSet = phaseSet;
    return this;
  }

   /**
   * Get phaseSet
   * @return phaseSet
  **/
  @ApiModelProperty(value = "")
  public String getPhaseSet() {
    return phaseSet;
  }

  public void setPhaseSet(String phaseSet) {
    this.phaseSet = phaseSet;
  }

  public ConsensusSequenceBlock phasingGroup(String phasingGroup) {
    this.phasingGroup = phasingGroup;
    return this;
  }

   /**
   * Get phasingGroup
   * @return phasingGroup
  **/
  @ApiModelProperty(value = "")
  public String getPhasingGroup() {
    return phasingGroup;
  }

  public void setPhasingGroup(String phasingGroup) {
    this.phasingGroup = phasingGroup;
  }

  public ConsensusSequenceBlock referenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
    return this;
  }

   /**
   * id of reference sequence
   * @return referenceSequenceId
  **/
  @ApiModelProperty(value = "id of reference sequence")
  public String getReferenceSequenceId() {
    return referenceSequenceId;
  }

  public void setReferenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
  }

  public ConsensusSequenceBlock sequence(Sequence sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public Sequence getSequence() {
    return sequence;
  }

  public void setSequence(Sequence sequence) {
    this.sequence = sequence;
  }

  public ConsensusSequenceBlock start(Integer start) {
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

  public ConsensusSequenceBlock strand(String strand) {
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

  public ConsensusSequenceBlock variant(Variant variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @ApiModelProperty(value = "")
  public Variant getVariant() {
    return variant;
  }

  public void setVariant(Variant variant) {
    this.variant = variant;
  }

  public ConsensusSequenceBlock sequenceQuality(SequenceQuality sequenceQuality) {
    this.sequenceQuality = sequenceQuality;
    return this;
  }

   /**
   * Get sequenceQuality
   * @return sequenceQuality
  **/
  @ApiModelProperty(value = "")
  public SequenceQuality getSequenceQuality() {
    return sequenceQuality;
  }

  public void setSequenceQuality(SequenceQuality sequenceQuality) {
    this.sequenceQuality = sequenceQuality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusSequenceBlock consensusSequenceBlock = (ConsensusSequenceBlock) o;
    return Objects.equals(this.active, consensusSequenceBlock.active) &&
        Objects.equals(this.continuity, consensusSequenceBlock.continuity) &&
        Objects.equals(this.dateCreated, consensusSequenceBlock.dateCreated) &&
        Objects.equals(this.dateUpdated, consensusSequenceBlock.dateUpdated) &&
        Objects.equals(this.description, consensusSequenceBlock.description) &&
        Objects.equals(this.end, consensusSequenceBlock.end) &&
        Objects.equals(this.expectedCopyNumber, consensusSequenceBlock.expectedCopyNumber) &&
        Objects.equals(this.id, consensusSequenceBlock.id) &&
        Objects.equals(this.phaseSet, consensusSequenceBlock.phaseSet) &&
        Objects.equals(this.phasingGroup, consensusSequenceBlock.phasingGroup) &&
        Objects.equals(this.referenceSequenceId, consensusSequenceBlock.referenceSequenceId) &&
        Objects.equals(this.sequence, consensusSequenceBlock.sequence) &&
        Objects.equals(this.start, consensusSequenceBlock.start) &&
        Objects.equals(this.strand, consensusSequenceBlock.strand) &&
        Objects.equals(this.variant, consensusSequenceBlock.variant) &&
        Objects.equals(this.sequenceQuality, consensusSequenceBlock.sequenceQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, continuity, dateCreated, dateUpdated, description, end, expectedCopyNumber, id, phaseSet, phasingGroup, referenceSequenceId, sequence, start, strand, variant, sequenceQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusSequenceBlock {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    continuity: ").append(toIndentedString(continuity)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    expectedCopyNumber: ").append(toIndentedString(expectedCopyNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phaseSet: ").append(toIndentedString(phaseSet)).append("\n");
    sb.append("    phasingGroup: ").append(toIndentedString(phasingGroup)).append("\n");
    sb.append("    referenceSequenceId: ").append(toIndentedString(referenceSequenceId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    sequenceQuality: ").append(toIndentedString(sequenceQuality)).append("\n");
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

