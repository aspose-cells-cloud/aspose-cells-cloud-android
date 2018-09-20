/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.aspose.cloud.cells.model.MultipleFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MultipleFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-05T14:42:39.608+08:00")
public class MultipleFilters {
  @SerializedName("MultipleFilterList")
  private List<MultipleFilter> multipleFilterList = null;

  @SerializedName("MatchBlank")
  private Boolean matchBlank = null;

  public MultipleFilters multipleFilterList(List<MultipleFilter> multipleFilterList) {
    this.multipleFilterList = multipleFilterList;
    return this;
  }

  public MultipleFilters addMultipleFilterListItem(MultipleFilter multipleFilterListItem) {
    if (this.multipleFilterList == null) {
      this.multipleFilterList = new ArrayList<MultipleFilter>();
    }
    this.multipleFilterList.add(multipleFilterListItem);
    return this;
  }

   /**
   * Get multipleFilterList
   * @return multipleFilterList
  **/
  @ApiModelProperty(value = "")
  public List<MultipleFilter> getMultipleFilterList() {
    return multipleFilterList;
  }

  public void setMultipleFilterList(List<MultipleFilter> multipleFilterList) {
    this.multipleFilterList = multipleFilterList;
  }

  public MultipleFilters matchBlank(Boolean matchBlank) {
    this.matchBlank = matchBlank;
    return this;
  }

   /**
   * Get matchBlank
   * @return matchBlank
  **/
  @ApiModelProperty(value = "")
  public Boolean isMatchBlank() {
    return matchBlank;
  }

  public void setMatchBlank(Boolean matchBlank) {
    this.matchBlank = matchBlank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleFilters multipleFilters = (MultipleFilters) o;
    return Objects.equals(this.multipleFilterList, multipleFilters.multipleFilterList) &&
        Objects.equals(this.matchBlank, multipleFilters.matchBlank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleFilterList, matchBlank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleFilters {\n");
    
    sb.append("    multipleFilterList: ").append(toIndentedString(multipleFilterList)).append("\n");
    sb.append("    matchBlank: ").append(toIndentedString(matchBlank)).append("\n");
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
