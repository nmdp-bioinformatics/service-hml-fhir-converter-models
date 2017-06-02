package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.AlleleAssignment;
import org.nmdp.hmlfhirconvertermodels.dto.ConsensusSequence;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import org.nmdp.hmlfhirconvertermodels.dto.TypingMethod;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Typing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class Typing  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("alleleAssignment")
  private List<AlleleAssignment> alleleAssignment = new ArrayList<AlleleAssignment>();

  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("geneFamily")
  private String geneFamily = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("typingMethod")
  private TypingMethod typingMethod = null;

  @JsonProperty("consensusSequence")
  private ConsensusSequence consensusSequence = null;

  public Typing active(Boolean active) {
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

  public Typing alleleAssignment(List<AlleleAssignment> alleleAssignment) {
    this.alleleAssignment = alleleAssignment;
    return this;
  }

  public Typing addAlleleAssignmentItem(AlleleAssignment alleleAssignmentItem) {
    this.alleleAssignment.add(alleleAssignmentItem);
    return this;
  }

   /**
   * allele assigned by this typing
   * @return alleleAssignment
  **/
  @ApiModelProperty(value = "allele assigned by this typing")
  public List<AlleleAssignment> getAlleleAssignment() {
    return alleleAssignment;
  }

  public void setAlleleAssignment(List<AlleleAssignment> alleleAssignment) {
    this.alleleAssignment = alleleAssignment;
  }

  public Typing date(Date date) {
    this.date = date;
    return this;
  }

   /**
   * Sample date
   * @return date
  **/
  @ApiModelProperty(value = "Sample date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Typing dateCreated(Date dateCreated) {
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

  public Typing dateUpdated(Date dateUpdated) {
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

  public Typing geneFamily(String geneFamily) {
    this.geneFamily = geneFamily;
    return this;
  }

   /**
   * gene type
   * @return geneFamily
  **/
  @ApiModelProperty(value = "gene type")
  public String getGeneFamily() {
    return geneFamily;
  }

  public void setGeneFamily(String geneFamily) {
    this.geneFamily = geneFamily;
  }

  public Typing id(String id) {
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

  public Typing properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Typing addPropertiesItem(Property propertiesItem) {
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

  public Typing typingMethod(TypingMethod typingMethod) {
    this.typingMethod = typingMethod;
    return this;
  }

   /**
   * method used to determine typing
   * @return typingMethod
  **/
  @ApiModelProperty(value = "method used to determine typing")
  public TypingMethod getTypingMethod() {
    return typingMethod;
  }

  public void setTypingMethod(TypingMethod typingMethod) {
    this.typingMethod = typingMethod;
  }

  public Typing consensusSequence(ConsensusSequence consensusSequence) {
    this.consensusSequence = consensusSequence;
    return this;
  }

   /**
   * Get consensusSequence
   * @return consensusSequence
  **/
  @ApiModelProperty(value = "")
  public ConsensusSequence getConsensusSequence() {
    return consensusSequence;
  }

  public void setConsensusSequence(ConsensusSequence consensusSequence) {
    this.consensusSequence = consensusSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Typing typing = (Typing) o;
    return Objects.equals(this.active, typing.active) &&
        Objects.equals(this.alleleAssignment, typing.alleleAssignment) &&
        Objects.equals(this.date, typing.date) &&
        Objects.equals(this.dateCreated, typing.dateCreated) &&
        Objects.equals(this.dateUpdated, typing.dateUpdated) &&
        Objects.equals(this.geneFamily, typing.geneFamily) &&
        Objects.equals(this.id, typing.id) &&
        Objects.equals(this.properties, typing.properties) &&
        Objects.equals(this.typingMethod, typing.typingMethod) &&
        Objects.equals(this.consensusSequence, typing.consensusSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, alleleAssignment, date, dateCreated, dateUpdated, geneFamily, id, properties, typingMethod, consensusSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Typing {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    alleleAssignment: ").append(toIndentedString(alleleAssignment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    geneFamily: ").append(toIndentedString(geneFamily)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    typingMethod: ").append(toIndentedString(typingMethod)).append("\n");
    sb.append("    consensusSequence: ").append(toIndentedString(consensusSequence)).append("\n");
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

