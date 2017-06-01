package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.Genotype;
import org.nmdp.hmlfhirconvertermodels.dto.GlString;
import org.nmdp.hmlfhirconvertermodels.dto.Haploid;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * AlleleAssignment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class AlleleAssignment  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("alleleDb")
  private String alleleDb = null;

  @JsonProperty("alleleVersion")
  private String alleleVersion = null;

  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("genotypes")
  private List<Genotype> genotypes = new ArrayList<Genotype>();

  @JsonProperty("glString")
  private GlString glString = null;

  @JsonProperty("haploid")
  private List<Haploid> haploid = new ArrayList<Haploid>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  public AlleleAssignment active(Boolean active) {
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

  public AlleleAssignment alleleDb(String alleleDb) {
    this.alleleDb = alleleDb;
    return this;
  }

   /**
   * allele database
   * @return alleleDb
  **/
  @ApiModelProperty(value = "allele database")
  public String getAlleleDb() {
    return alleleDb;
  }

  public void setAlleleDb(String alleleDb) {
    this.alleleDb = alleleDb;
  }

  public AlleleAssignment alleleVersion(String alleleVersion) {
    this.alleleVersion = alleleVersion;
    return this;
  }

   /**
   * version of the allele
   * @return alleleVersion
  **/
  @ApiModelProperty(value = "version of the allele")
  public String getAlleleVersion() {
    return alleleVersion;
  }

  public void setAlleleVersion(String alleleVersion) {
    this.alleleVersion = alleleVersion;
  }

  public AlleleAssignment date(Date date) {
    this.date = date;
    return this;
  }

   /**
   * date of assignment
   * @return date
  **/
  @ApiModelProperty(value = "date of assignment")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public AlleleAssignment dateCreated(Date dateCreated) {
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

  public AlleleAssignment dateUpdated(Date dateUpdated) {
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

  public AlleleAssignment genotypes(List<Genotype> genotypes) {
    this.genotypes = genotypes;
    return this;
  }

  public AlleleAssignment addGenotypesItem(Genotype genotypesItem) {
    this.genotypes.add(genotypesItem);
    return this;
  }

   /**
   * Get genotypes
   * @return genotypes
  **/
  @ApiModelProperty(value = "")
  public List<Genotype> getGenotypes() {
    return genotypes;
  }

  public void setGenotypes(List<Genotype> genotypes) {
    this.genotypes = genotypes;
  }

  public AlleleAssignment glString(GlString glString) {
    this.glString = glString;
    return this;
  }

   /**
   * Get glString
   * @return glString
  **/
  @ApiModelProperty(value = "")
  public GlString getGlString() {
    return glString;
  }

  public void setGlString(GlString glString) {
    this.glString = glString;
  }

  public AlleleAssignment haploid(List<Haploid> haploid) {
    this.haploid = haploid;
    return this;
  }

  public AlleleAssignment addHaploidItem(Haploid haploidItem) {
    this.haploid.add(haploidItem);
    return this;
  }

   /**
   * Get haploid
   * @return haploid
  **/
  @ApiModelProperty(value = "")
  public List<Haploid> getHaploid() {
    return haploid;
  }

  public void setHaploid(List<Haploid> haploid) {
    this.haploid = haploid;
  }

  public AlleleAssignment id(String id) {
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

  public AlleleAssignment properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public AlleleAssignment addPropertiesItem(Property propertiesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleAssignment alleleAssignment = (AlleleAssignment) o;
    return Objects.equals(this.active, alleleAssignment.active) &&
        Objects.equals(this.alleleDb, alleleAssignment.alleleDb) &&
        Objects.equals(this.alleleVersion, alleleAssignment.alleleVersion) &&
        Objects.equals(this.date, alleleAssignment.date) &&
        Objects.equals(this.dateCreated, alleleAssignment.dateCreated) &&
        Objects.equals(this.dateUpdated, alleleAssignment.dateUpdated) &&
        Objects.equals(this.genotypes, alleleAssignment.genotypes) &&
        Objects.equals(this.glString, alleleAssignment.glString) &&
        Objects.equals(this.haploid, alleleAssignment.haploid) &&
        Objects.equals(this.id, alleleAssignment.id) &&
        Objects.equals(this.properties, alleleAssignment.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, alleleDb, alleleVersion, date, dateCreated, dateUpdated, genotypes, glString, haploid, id, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleAssignment {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    alleleDb: ").append(toIndentedString(alleleDb)).append("\n");
    sb.append("    alleleVersion: ").append(toIndentedString(alleleVersion)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    genotypes: ").append(toIndentedString(genotypes)).append("\n");
    sb.append("    glString: ").append(toIndentedString(glString)).append("\n");
    sb.append("    haploid: ").append(toIndentedString(haploid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

