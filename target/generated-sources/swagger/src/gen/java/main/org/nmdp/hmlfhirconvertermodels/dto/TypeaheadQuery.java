package org.nmdp.hmlfhirconvertermodels.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.nmdp.hmlfhirconvertermodels.dto.QueryCriteria;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * TypeaheadQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-31T16:18:13.752-05:00")

public class TypeaheadQuery  implements Serializable {
  @JsonProperty("criteria")
  private List<QueryCriteria> criteria = new ArrayList<QueryCriteria>();

  public TypeaheadQuery criteria(List<QueryCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public TypeaheadQuery addCriteriaItem(QueryCriteria criteriaItem) {
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Query Criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "Query Criteria")
  public List<QueryCriteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<QueryCriteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeaheadQuery typeaheadQuery = (TypeaheadQuery) o;
    return Objects.equals(this.criteria, typeaheadQuery.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeaheadQuery {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

