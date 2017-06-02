package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.HmlId;
import org.nmdp.hmlfhirconvertermodels.dto.Project;
import org.nmdp.hmlfhirconvertermodels.dto.Property;
import org.nmdp.hmlfhirconvertermodels.dto.ReportingCenter;
import org.nmdp.hmlfhirconvertermodels.dto.Sample;
import org.nmdp.hmlfhirconvertermodels.dto.TypingTestName;
import org.nmdp.hmlfhirconvertermodels.dto.Version;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Hml
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-01T16:31:18.928-05:00")

public class Hml  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private Date dateCreated = null;

  @JsonProperty("dateUpdated")
  private Date dateUpdated = null;

  @JsonProperty("hmlId")
  private HmlId hmlId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("project")
  private Project project = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("reportingCenters")
  private List<ReportingCenter> reportingCenters = new ArrayList<ReportingCenter>();

  @JsonProperty("samples")
  private List<Sample> samples = new ArrayList<Sample>();

  @JsonProperty("typingTestNames")
  private List<TypingTestName> typingTestNames = new ArrayList<TypingTestName>();

  @JsonProperty("version")
  private Version version = null;

  public Hml active(Boolean active) {
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

  public Hml dateCreated(Date dateCreated) {
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

  public Hml dateUpdated(Date dateUpdated) {
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

  public Hml hmlId(HmlId hmlId) {
    this.hmlId = hmlId;
    return this;
  }

   /**
   * HmlId object
   * @return hmlId
  **/
  @ApiModelProperty(value = "HmlId object")
  public HmlId getHmlId() {
    return hmlId;
  }

  public void setHmlId(HmlId hmlId) {
    this.hmlId = hmlId;
  }

  public Hml id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the hml item
   * @return id
  **/
  @ApiModelProperty(value = "Id of the hml item")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Hml project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Project object
   * @return project
  **/
  @ApiModelProperty(value = "Project object")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Hml properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Hml addPropertiesItem(Property propertiesItem) {
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

  public Hml reportingCenters(List<ReportingCenter> reportingCenters) {
    this.reportingCenters = reportingCenters;
    return this;
  }

  public Hml addReportingCentersItem(ReportingCenter reportingCentersItem) {
    this.reportingCenters.add(reportingCentersItem);
    return this;
  }

   /**
   * Repoting centers for this item
   * @return reportingCenters
  **/
  @ApiModelProperty(value = "Repoting centers for this item")
  public List<ReportingCenter> getReportingCenters() {
    return reportingCenters;
  }

  public void setReportingCenters(List<ReportingCenter> reportingCenters) {
    this.reportingCenters = reportingCenters;
  }

  public Hml samples(List<Sample> samples) {
    this.samples = samples;
    return this;
  }

  public Hml addSamplesItem(Sample samplesItem) {
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Samples used in this item
   * @return samples
  **/
  @ApiModelProperty(value = "Samples used in this item")
  public List<Sample> getSamples() {
    return samples;
  }

  public void setSamples(List<Sample> samples) {
    this.samples = samples;
  }

  public Hml typingTestNames(List<TypingTestName> typingTestNames) {
    this.typingTestNames = typingTestNames;
    return this;
  }

  public Hml addTypingTestNamesItem(TypingTestName typingTestNamesItem) {
    this.typingTestNames.add(typingTestNamesItem);
    return this;
  }

   /**
   * Typing test names used for this item
   * @return typingTestNames
  **/
  @ApiModelProperty(value = "Typing test names used for this item")
  public List<TypingTestName> getTypingTestNames() {
    return typingTestNames;
  }

  public void setTypingTestNames(List<TypingTestName> typingTestNames) {
    this.typingTestNames = typingTestNames;
  }

  public Hml version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Version of Hml
   * @return version
  **/
  @ApiModelProperty(value = "Version of Hml")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
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
    Hml hml = (Hml) o;
    return Objects.equals(this.active, hml.active) &&
        Objects.equals(this.dateCreated, hml.dateCreated) &&
        Objects.equals(this.dateUpdated, hml.dateUpdated) &&
        Objects.equals(this.hmlId, hml.hmlId) &&
        Objects.equals(this.id, hml.id) &&
        Objects.equals(this.project, hml.project) &&
        Objects.equals(this.properties, hml.properties) &&
        Objects.equals(this.reportingCenters, hml.reportingCenters) &&
        Objects.equals(this.samples, hml.samples) &&
        Objects.equals(this.typingTestNames, hml.typingTestNames) &&
        Objects.equals(this.version, hml.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, hmlId, id, project, properties, reportingCenters, samples, typingTestNames, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hml {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    hmlId: ").append(toIndentedString(hmlId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    reportingCenters: ").append(toIndentedString(reportingCenters)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    typingTestNames: ").append(toIndentedString(typingTestNames)).append("\n");
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

