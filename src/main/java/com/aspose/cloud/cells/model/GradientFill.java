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
import com.aspose.cloud.cells.model.GradientFillStop;
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
 * GradientFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-05T14:42:39.608+08:00")
public class GradientFill {
  @SerializedName("FillType")
  private String fillType = null;

  @SerializedName("Angle")
  private Double angle = null;

  @SerializedName("GradientStops")
  private List<GradientFillStop> gradientStops = null;

  @SerializedName("DirectionType")
  private String directionType = null;

  public GradientFill fillType(String fillType) {
    this.fillType = fillType;
    return this;
  }

   /**
   * Get fillType
   * @return fillType
  **/
  @ApiModelProperty(value = "")
  public String getFillType() {
    return fillType;
  }

  public void setFillType(String fillType) {
    this.fillType = fillType;
  }

  public GradientFill angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Get angle
   * @return angle
  **/
  @ApiModelProperty(value = "")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }

  public GradientFill gradientStops(List<GradientFillStop> gradientStops) {
    this.gradientStops = gradientStops;
    return this;
  }

  public GradientFill addGradientStopsItem(GradientFillStop gradientStopsItem) {
    if (this.gradientStops == null) {
      this.gradientStops = new ArrayList<GradientFillStop>();
    }
    this.gradientStops.add(gradientStopsItem);
    return this;
  }

   /**
   * Get gradientStops
   * @return gradientStops
  **/
  @ApiModelProperty(value = "")
  public List<GradientFillStop> getGradientStops() {
    return gradientStops;
  }

  public void setGradientStops(List<GradientFillStop> gradientStops) {
    this.gradientStops = gradientStops;
  }

  public GradientFill directionType(String directionType) {
    this.directionType = directionType;
    return this;
  }

   /**
   * Get directionType
   * @return directionType
  **/
  @ApiModelProperty(value = "")
  public String getDirectionType() {
    return directionType;
  }

  public void setDirectionType(String directionType) {
    this.directionType = directionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradientFill gradientFill = (GradientFill) o;
    return Objects.equals(this.fillType, gradientFill.fillType) &&
        Objects.equals(this.angle, gradientFill.angle) &&
        Objects.equals(this.gradientStops, gradientFill.gradientStops) &&
        Objects.equals(this.directionType, gradientFill.directionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillType, angle, gradientStops, directionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradientFill {\n");
    
    sb.append("    fillType: ").append(toIndentedString(fillType)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    gradientStops: ").append(toIndentedString(gradientStops)).append("\n");
    sb.append("    directionType: ").append(toIndentedString(directionType)).append("\n");
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
