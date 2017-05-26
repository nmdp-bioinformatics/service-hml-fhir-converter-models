package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.nmdp.hmlfhirconvertermodels.dto.ExtendedItem;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Property
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:05:03.785-05:00")

public class Property  implements Serializable {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("dateUpdated")
  private DateTime dateUpdated = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extendedItems")
  private List<ExtendedItem> extendedItems = new ArrayList<ExtendedItem>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public Property active(Boolean active) {
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

  public Property dateCreated(DateTime dateCreated) {
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

  public Property dateUpdated(DateTime dateUpdated) {
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

  public Property description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of property
   * @return description
  **/
  @ApiModelProperty(value = "Description of property")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Property extendedItems(List<ExtendedItem> extendedItems) {
    this.extendedItems = extendedItems;
    return this;
  }

  public Property addExtendedItemsItem(ExtendedItem extendedItemsItem) {
    this.extendedItems.add(extendedItemsItem);
    return this;
  }

   /**
   * Array of generic items
   * @return extendedItems
  **/
  @ApiModelProperty(value = "Array of generic items")
  public List<ExtendedItem> getExtendedItems() {
    return extendedItems;
  }

  public void setExtendedItems(List<ExtendedItem> extendedItems) {
    this.extendedItems = extendedItems;
  }

  public Property id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of property
   * @return id
  **/
  @ApiModelProperty(value = "Id of property")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Property name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display/ Common name of property
   * @return name
  **/
  @ApiModelProperty(value = "Display/ Common name of property")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Property value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of property name
   * @return value
  **/
  @ApiModelProperty(value = "Value of property name")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.active, property.active) &&
        Objects.equals(this.dateCreated, property.dateCreated) &&
        Objects.equals(this.dateUpdated, property.dateUpdated) &&
        Objects.equals(this.description, property.description) &&
        Objects.equals(this.extendedItems, property.extendedItems) &&
        Objects.equals(this.id, property.id) &&
        Objects.equals(this.name, property.name) &&
        Objects.equals(this.value, property.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dateCreated, dateUpdated, description, extendedItems, id, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedItems: ").append(toIndentedString(extendedItems)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

