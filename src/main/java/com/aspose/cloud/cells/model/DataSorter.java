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
import com.aspose.cloud.cells.model.SortKey;
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
 * DataSorter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-05T14:42:39.608+08:00")
public class DataSorter {
  @SerializedName("CaseSensitive")
  private Boolean caseSensitive = null;

  @SerializedName("KeyList")
  private List<SortKey> keyList = null;

  @SerializedName("HasHeaders")
  private Boolean hasHeaders = null;

  @SerializedName("SortLeftToRight")
  private Boolean sortLeftToRight = null;

  public DataSorter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @ApiModelProperty(value = "")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public DataSorter keyList(List<SortKey> keyList) {
    this.keyList = keyList;
    return this;
  }

  public DataSorter addKeyListItem(SortKey keyListItem) {
    if (this.keyList == null) {
      this.keyList = new ArrayList<SortKey>();
    }
    this.keyList.add(keyListItem);
    return this;
  }

   /**
   * Get keyList
   * @return keyList
  **/
  @ApiModelProperty(value = "")
  public List<SortKey> getKeyList() {
    return keyList;
  }

  public void setKeyList(List<SortKey> keyList) {
    this.keyList = keyList;
  }

  public DataSorter hasHeaders(Boolean hasHeaders) {
    this.hasHeaders = hasHeaders;
    return this;
  }

   /**
   * Get hasHeaders
   * @return hasHeaders
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasHeaders() {
    return hasHeaders;
  }

  public void setHasHeaders(Boolean hasHeaders) {
    this.hasHeaders = hasHeaders;
  }

  public DataSorter sortLeftToRight(Boolean sortLeftToRight) {
    this.sortLeftToRight = sortLeftToRight;
    return this;
  }

   /**
   * Get sortLeftToRight
   * @return sortLeftToRight
  **/
  @ApiModelProperty(value = "")
  public Boolean isSortLeftToRight() {
    return sortLeftToRight;
  }

  public void setSortLeftToRight(Boolean sortLeftToRight) {
    this.sortLeftToRight = sortLeftToRight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSorter dataSorter = (DataSorter) o;
    return Objects.equals(this.caseSensitive, dataSorter.caseSensitive) &&
        Objects.equals(this.keyList, dataSorter.keyList) &&
        Objects.equals(this.hasHeaders, dataSorter.hasHeaders) &&
        Objects.equals(this.sortLeftToRight, dataSorter.sortLeftToRight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, keyList, hasHeaders, sortLeftToRight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSorter {\n");
    
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    keyList: ").append(toIndentedString(keyList)).append("\n");
    sb.append("    hasHeaders: ").append(toIndentedString(hasHeaders)).append("\n");
    sb.append("    sortLeftToRight: ").append(toIndentedString(sortLeftToRight)).append("\n");
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
