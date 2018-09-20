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
import com.aspose.cloud.cells.model.AutoFilter;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AutoFilterResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-05T14:42:39.608+08:00")
public class AutoFilterResponse extends SaaSposeResponse {
  @SerializedName("AutoFilter")
  private AutoFilter autoFilter = null;

  public AutoFilterResponse autoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
    return this;
  }

   /**
   * Get autoFilter
   * @return autoFilter
  **/
  @ApiModelProperty(value = "")
  public AutoFilter getAutoFilter() {
    return autoFilter;
  }

  public void setAutoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoFilterResponse autoFilterResponse = (AutoFilterResponse) o;
    return Objects.equals(this.autoFilter, autoFilterResponse.autoFilter) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFilter, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoFilterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    autoFilter: ").append(toIndentedString(autoFilter)).append("\n");
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
