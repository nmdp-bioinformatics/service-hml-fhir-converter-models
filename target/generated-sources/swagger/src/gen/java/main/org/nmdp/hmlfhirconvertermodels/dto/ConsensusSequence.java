package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.ConsensusSequenceBlock;
import org.nmdp.hmlfhirconvertermodels.dto.ReferenceDatabase;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ConsensusSequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class ConsensusSequence  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("consensusSequenceBlocks")
  private List<ConsensusSequenceBlock> consensusSequenceBlocks = new ArrayList<ConsensusSequenceBlock>();

  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("referenceDatabase")
  private List<ReferenceDatabase> referenceDatabase = new ArrayList<ReferenceDatabase>();

  public ConsensusSequence active(Boolean active) {
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

  public ConsensusSequence consensusSequenceBlocks(List<ConsensusSequenceBlock> consensusSequenceBlocks) {
    this.consensusSequenceBlocks = consensusSequenceBlocks;
    return this;
  }

  public ConsensusSequence addConsensusSequenceBlocksItem(ConsensusSequenceBlock consensusSequenceBlocksItem) {
    this.consensusSequenceBlocks.add(consensusSequenceBlocksItem);
    return this;
  }

   /**
   * block of consensus sequence
   * @return consensusSequenceBlocks
  **/
  @ApiModelProperty(value = "block of consensus sequence")
  public List<ConsensusSequenceBlock> getConsensusSequenceBlocks() {
    return consensusSequenceBlocks;
  }

  public void setConsensusSequenceBlocks(List<ConsensusSequenceBlock> consensusSequenceBlocks) {
    this.consensusSequenceBlocks = consensusSequenceBlocks;
  }

  public ConsensusSequence date(Date date) {
    this.date = date;
    return this;
  }

   /**
   * date created
   * @return date
  **/
  @ApiModelProperty(value = "date created")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public ConsensusSequence dateCreated(Date dateCreated) {
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

  public ConsensusSequence dateUpdated(Date dateUpdated) {
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

  public ConsensusSequence id(String id) {
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

  public ConsensusSequence referenceDatabase(List<ReferenceDatabase> referenceDatabase) {
    this.referenceDatabase = referenceDatabase;
    return this;
  }

  public ConsensusSequence addReferenceDatabaseItem(ReferenceDatabase referenceDatabaseItem) {
    this.referenceDatabase.add(referenceDatabaseItem);
    return this;
  }

   /**
   * Get referenceDatabase
   * @return referenceDatabase
  **/
  @ApiModelProperty(value = "")
  public List<ReferenceDatabase> getReferenceDatabase() {
    return referenceDatabase;
  }

  public void setReferenceDatabase(List<ReferenceDatabase> referenceDatabase) {
    this.referenceDatabase = referenceDatabase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusSequence consensusSequence = (ConsensusSequence) o;
    return Objects.equals(this.active, consensusSequence.active) &&
        Objects.equals(this.consensusSequenceBlocks, consensusSequence.consensusSequenceBlocks) &&
        Objects.equals(this.date, consensusSequence.date) &&
        Objects.equals(this.dateCreated, consensusSequence.dateCreated) &&
        Objects.equals(this.dateUpdated, consensusSequence.dateUpdated) &&
        Objects.equals(this.id, consensusSequence.id) &&
        Objects.equals(this.referenceDatabase, consensusSequence.referenceDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, consensusSequenceBlocks, date, dateCreated, dateUpdated, id, referenceDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusSequence {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    consensusSequenceBlocks: ").append(toIndentedString(consensusSequenceBlocks)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceDatabase: ").append(toIndentedString(referenceDatabase)).append("\n");
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

