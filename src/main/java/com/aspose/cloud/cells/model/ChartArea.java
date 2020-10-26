/* 
 * <summary>
 *  Copyright (c) 2020 Aspose.Cells Cloud
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all 
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.aspose.cloud.cells.model.Area;
import com.aspose.cloud.cells.model.ChartFrame;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.Line;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import java.util.*;

/**
 * ChartArea
 */

public class ChartArea {
  private Boolean isInnerMode = null;

  private List<LinkElement> shapeProperties = null;

  private Boolean autoScaleFont = null;

  private Area area = null;

  private Integer height = null;

  private Integer width = null;

  private String backgroundMode = null;

  private Boolean isAutomaticSize = null;

  private Integer Y = null;

  private Integer X = null;

  private Boolean shadow = null;

  private Font font = null;

  private Line border = null;

  private Link link = null;

  public ChartArea isInnerMode(Boolean isInnerMode) {
    this.isInnerMode = isInnerMode;
    return this;
  }

   /**
   * Get isInnerMode
   * @return isInnerMode
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsInnerMode() {
    return isInnerMode;
  }

  public void setIsInnerMode(Boolean isInnerMode) {
    this.isInnerMode = isInnerMode;
  }

  public ChartArea shapeProperties(List<LinkElement> shapeProperties) {
    this.shapeProperties = shapeProperties;
    return this;
  }

  public ChartArea addShapePropertiesItem(LinkElement shapePropertiesItem) {
    if (this.shapeProperties == null) {
      this.shapeProperties = null;
    }
    this.shapeProperties.add(shapePropertiesItem);
    return this;
  }

   /**
   * Get shapeProperties
   * @return shapeProperties
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getShapeProperties() {
    return shapeProperties;
  }

  public void setShapeProperties(List<LinkElement> shapeProperties) {
    this.shapeProperties = shapeProperties;
  }

  public ChartArea autoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
    return this;
  }

   /**
   * Get autoScaleFont
   * @return autoScaleFont
  **/
  @ApiModelProperty(value = "")
  public Boolean getAutoScaleFont() {
    return autoScaleFont;
  }

  public void setAutoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
  }

  public ChartArea area(Area area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(value = "")
  public Area getArea() {
    return area;
  }

  public void setArea(Area area) {
    this.area = area;
  }

  public ChartArea height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ChartArea width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ChartArea backgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
    return this;
  }

   /**
   * Get backgroundMode
   * @return backgroundMode
  **/
  @ApiModelProperty(value = "")
  public String getBackgroundMode() {
    return backgroundMode;
  }

  public void setBackgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
  }

  public ChartArea isAutomaticSize(Boolean isAutomaticSize) {
    this.isAutomaticSize = isAutomaticSize;
    return this;
  }

   /**
   * Get isAutomaticSize
   * @return isAutomaticSize
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsAutomaticSize() {
    return isAutomaticSize;
  }

  public void setIsAutomaticSize(Boolean isAutomaticSize) {
    this.isAutomaticSize = isAutomaticSize;
  }

  public ChartArea Y(Integer Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Get Y
   * @return Y
  **/
  @ApiModelProperty(value = "")
  public Integer getY() {
    return Y;
  }

  public void setY(Integer Y) {
    this.Y = Y;
  }

  public ChartArea X(Integer X) {
    this.X = X;
    return this;
  }

   /**
   * Get X
   * @return X
  **/
  @ApiModelProperty(value = "")
  public Integer getX() {
    return X;
  }

  public void setX(Integer X) {
    this.X = X;
  }

  public ChartArea shadow(Boolean shadow) {
    this.shadow = shadow;
    return this;
  }

   /**
   * Get shadow
   * @return shadow
  **/
  @ApiModelProperty(value = "")
  public Boolean getShadow() {
    return shadow;
  }

  public void setShadow(Boolean shadow) {
    this.shadow = shadow;
  }

  public ChartArea font(Font font) {
    this.font = font;
    return this;
  }

   /**
   * Get font
   * @return font
  **/
  @ApiModelProperty(value = "")
  public Font getFont() {
    return font;
  }

  public void setFont(Font font) {
    this.font = font;
  }

  public ChartArea border(Line border) {
    this.border = border;
    return this;
  }

   /**
   * Get border
   * @return border
  **/
  @ApiModelProperty(value = "")
  public Line getBorder() {
    return border;
  }

  public void setBorder(Line border) {
    this.border = border;
  }

  public ChartArea link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartArea chartArea = (ChartArea) o;
    return Objects.equals(this.isInnerMode, chartArea.isInnerMode) &&
        Objects.equals(this.shapeProperties, chartArea.shapeProperties) &&
        Objects.equals(this.autoScaleFont, chartArea.autoScaleFont) &&
        Objects.equals(this.area, chartArea.area) &&
        Objects.equals(this.height, chartArea.height) &&
        Objects.equals(this.width, chartArea.width) &&
        Objects.equals(this.backgroundMode, chartArea.backgroundMode) &&
        Objects.equals(this.isAutomaticSize, chartArea.isAutomaticSize) &&
        Objects.equals(this.Y, chartArea.Y) &&
        Objects.equals(this.X, chartArea.X) &&
        Objects.equals(this.shadow, chartArea.shadow) &&
        Objects.equals(this.font, chartArea.font) &&
        Objects.equals(this.border, chartArea.border) &&
        Objects.equals(this.link, chartArea.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInnerMode, shapeProperties, autoScaleFont, area, height, width, backgroundMode, isAutomaticSize, Y, X, shadow, font, border, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartArea {\n");
    
    sb.append("    isInnerMode: ").append(toIndentedString(isInnerMode)).append("\n");
    sb.append("    shapeProperties: ").append(toIndentedString(shapeProperties)).append("\n");
    sb.append("    autoScaleFont: ").append(toIndentedString(autoScaleFont)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    backgroundMode: ").append(toIndentedString(backgroundMode)).append("\n");
    sb.append("    isAutomaticSize: ").append(toIndentedString(isAutomaticSize)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

