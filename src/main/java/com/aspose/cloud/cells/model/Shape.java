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
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;

/**
 * Shape
 */

public class Shape {
  private Link link = null;

  private String alternativeText = null;

  private Integer bottom = null;

  private Integer top = null;

  private Integer width = null;

  private String htmlText = null;

  private String textVerticalAlignment = null;

  private String autoShapeType = null;

  private Boolean isPrintable = null;

  private Integer upperLeftColumn = null;

  private Boolean isLockAspectRatio = null;

  private Boolean isGroup = null;

  private Double rotationAngle = null;

  private Integer zOrderPosition = null;

  private String textHorizontalOverflow = null;

  private String msoDrawingType = null;

  private String textOrientationType = null;

  private String placement = null;

  private String name = null;

  private Boolean isWordArt = null;

  private String linkedCell = null;

  private Integer upperLeftRow = null;

  private Boolean isLocked = null;

  private Integer lowerRightRow = null;

  private Boolean isTextWrapped = null;

  private Integer Y = null;

  private Integer X = null;

  private Boolean isHidden = null;

  private Integer left = null;

  private Integer right = null;

  private String text = null;

  private Integer lowerRightColumn = null;

  private Integer height = null;

  private String textHorizontalAlignment = null;

  private String textVerticalOverflow = null;

  public Shape link(Link link) {
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

  public Shape alternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

   /**
   * Get alternativeText
   * @return alternativeText
  **/
  @ApiModelProperty(value = "")
  public String getAlternativeText() {
    return alternativeText;
  }

  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }

  public Shape bottom(Integer bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Get bottom
   * @return bottom
  **/
  @ApiModelProperty(value = "")
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }

  public Shape top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @ApiModelProperty(value = "")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public Shape width(Integer width) {
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

  public Shape htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

   /**
   * Get htmlText
   * @return htmlText
  **/
  @ApiModelProperty(value = "")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public Shape textVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Get textVerticalAlignment
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }

  public Shape autoShapeType(String autoShapeType) {
    this.autoShapeType = autoShapeType;
    return this;
  }

   /**
   * Get autoShapeType
   * @return autoShapeType
  **/
  @ApiModelProperty(value = "")
  public String getAutoShapeType() {
    return autoShapeType;
  }

  public void setAutoShapeType(String autoShapeType) {
    this.autoShapeType = autoShapeType;
  }

  public Shape isPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
    return this;
  }

   /**
   * Get isPrintable
   * @return isPrintable
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrintable() {
    return isPrintable;
  }

  public void setIsPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
  }

  public Shape upperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
    return this;
  }

   /**
   * Get upperLeftColumn
   * @return upperLeftColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getUpperLeftColumn() {
    return upperLeftColumn;
  }

  public void setUpperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
  }

  public Shape isLockAspectRatio(Boolean isLockAspectRatio) {
    this.isLockAspectRatio = isLockAspectRatio;
    return this;
  }

   /**
   * Get isLockAspectRatio
   * @return isLockAspectRatio
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsLockAspectRatio() {
    return isLockAspectRatio;
  }

  public void setIsLockAspectRatio(Boolean isLockAspectRatio) {
    this.isLockAspectRatio = isLockAspectRatio;
  }

  public Shape isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Get isGroup
   * @return isGroup
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public Shape rotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Get rotationAngle
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "")
  public Double getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public Shape zOrderPosition(Integer zOrderPosition) {
    this.zOrderPosition = zOrderPosition;
    return this;
  }

   /**
   * Get zOrderPosition
   * @return zOrderPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getZOrderPosition() {
    return zOrderPosition;
  }

  public void setZOrderPosition(Integer zOrderPosition) {
    this.zOrderPosition = zOrderPosition;
  }

  public Shape textHorizontalOverflow(String textHorizontalOverflow) {
    this.textHorizontalOverflow = textHorizontalOverflow;
    return this;
  }

   /**
   * Get textHorizontalOverflow
   * @return textHorizontalOverflow
  **/
  @ApiModelProperty(value = "")
  public String getTextHorizontalOverflow() {
    return textHorizontalOverflow;
  }

  public void setTextHorizontalOverflow(String textHorizontalOverflow) {
    this.textHorizontalOverflow = textHorizontalOverflow;
  }

  public Shape msoDrawingType(String msoDrawingType) {
    this.msoDrawingType = msoDrawingType;
    return this;
  }

   /**
   * Get msoDrawingType
   * @return msoDrawingType
  **/
  @ApiModelProperty(value = "")
  public String getMsoDrawingType() {
    return msoDrawingType;
  }

  public void setMsoDrawingType(String msoDrawingType) {
    this.msoDrawingType = msoDrawingType;
  }

  public Shape textOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
    return this;
  }

   /**
   * Get textOrientationType
   * @return textOrientationType
  **/
  @ApiModelProperty(value = "")
  public String getTextOrientationType() {
    return textOrientationType;
  }

  public void setTextOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
  }

  public Shape placement(String placement) {
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @ApiModelProperty(value = "")
  public String getPlacement() {
    return placement;
  }

  public void setPlacement(String placement) {
    this.placement = placement;
  }

  public Shape name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Shape isWordArt(Boolean isWordArt) {
    this.isWordArt = isWordArt;
    return this;
  }

   /**
   * Get isWordArt
   * @return isWordArt
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsWordArt() {
    return isWordArt;
  }

  public void setIsWordArt(Boolean isWordArt) {
    this.isWordArt = isWordArt;
  }

  public Shape linkedCell(String linkedCell) {
    this.linkedCell = linkedCell;
    return this;
  }

   /**
   * Get linkedCell
   * @return linkedCell
  **/
  @ApiModelProperty(value = "")
  public String getLinkedCell() {
    return linkedCell;
  }

  public void setLinkedCell(String linkedCell) {
    this.linkedCell = linkedCell;
  }

  public Shape upperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
    return this;
  }

   /**
   * Get upperLeftRow
   * @return upperLeftRow
  **/
  @ApiModelProperty(value = "")
  public Integer getUpperLeftRow() {
    return upperLeftRow;
  }

  public void setUpperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
  }

  public Shape isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public Shape lowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
    return this;
  }

   /**
   * Get lowerRightRow
   * @return lowerRightRow
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightRow() {
    return lowerRightRow;
  }

  public void setLowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
  }

  public Shape isTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
    return this;
  }

   /**
   * Get isTextWrapped
   * @return isTextWrapped
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsTextWrapped() {
    return isTextWrapped;
  }

  public void setIsTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
  }

  public Shape Y(Integer Y) {
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

  public Shape X(Integer X) {
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

  public Shape isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public Shape left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @ApiModelProperty(value = "")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public Shape right(Integer right) {
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @ApiModelProperty(value = "")
  public Integer getRight() {
    return right;
  }

  public void setRight(Integer right) {
    this.right = right;
  }

  public Shape text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Shape lowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
    return this;
  }

   /**
   * Get lowerRightColumn
   * @return lowerRightColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightColumn() {
    return lowerRightColumn;
  }

  public void setLowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
  }

  public Shape height(Integer height) {
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

  public Shape textHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Get textHorizontalAlignment
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }

  public Shape textVerticalOverflow(String textVerticalOverflow) {
    this.textVerticalOverflow = textVerticalOverflow;
    return this;
  }

   /**
   * Get textVerticalOverflow
   * @return textVerticalOverflow
  **/
  @ApiModelProperty(value = "")
  public String getTextVerticalOverflow() {
    return textVerticalOverflow;
  }

  public void setTextVerticalOverflow(String textVerticalOverflow) {
    this.textVerticalOverflow = textVerticalOverflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shape shape = (Shape) o;
    return Objects.equals(this.link, shape.link) &&
        Objects.equals(this.alternativeText, shape.alternativeText) &&
        Objects.equals(this.bottom, shape.bottom) &&
        Objects.equals(this.top, shape.top) &&
        Objects.equals(this.width, shape.width) &&
        Objects.equals(this.htmlText, shape.htmlText) &&
        Objects.equals(this.textVerticalAlignment, shape.textVerticalAlignment) &&
        Objects.equals(this.autoShapeType, shape.autoShapeType) &&
        Objects.equals(this.isPrintable, shape.isPrintable) &&
        Objects.equals(this.upperLeftColumn, shape.upperLeftColumn) &&
        Objects.equals(this.isLockAspectRatio, shape.isLockAspectRatio) &&
        Objects.equals(this.isGroup, shape.isGroup) &&
        Objects.equals(this.rotationAngle, shape.rotationAngle) &&
        Objects.equals(this.zOrderPosition, shape.zOrderPosition) &&
        Objects.equals(this.textHorizontalOverflow, shape.textHorizontalOverflow) &&
        Objects.equals(this.msoDrawingType, shape.msoDrawingType) &&
        Objects.equals(this.textOrientationType, shape.textOrientationType) &&
        Objects.equals(this.placement, shape.placement) &&
        Objects.equals(this.name, shape.name) &&
        Objects.equals(this.isWordArt, shape.isWordArt) &&
        Objects.equals(this.linkedCell, shape.linkedCell) &&
        Objects.equals(this.upperLeftRow, shape.upperLeftRow) &&
        Objects.equals(this.isLocked, shape.isLocked) &&
        Objects.equals(this.lowerRightRow, shape.lowerRightRow) &&
        Objects.equals(this.isTextWrapped, shape.isTextWrapped) &&
        Objects.equals(this.Y, shape.Y) &&
        Objects.equals(this.X, shape.X) &&
        Objects.equals(this.isHidden, shape.isHidden) &&
        Objects.equals(this.left, shape.left) &&
        Objects.equals(this.right, shape.right) &&
        Objects.equals(this.text, shape.text) &&
        Objects.equals(this.lowerRightColumn, shape.lowerRightColumn) &&
        Objects.equals(this.height, shape.height) &&
        Objects.equals(this.textHorizontalAlignment, shape.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalOverflow, shape.textVerticalOverflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, alternativeText, bottom, top, width, htmlText, textVerticalAlignment, autoShapeType, isPrintable, upperLeftColumn, isLockAspectRatio, isGroup, rotationAngle, zOrderPosition, textHorizontalOverflow, msoDrawingType, textOrientationType, placement, name, isWordArt, linkedCell, upperLeftRow, isLocked, lowerRightRow, isTextWrapped, Y, X, isHidden, left, right, text, lowerRightColumn, height, textHorizontalAlignment, textVerticalOverflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shape {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    autoShapeType: ").append(toIndentedString(autoShapeType)).append("\n");
    sb.append("    isPrintable: ").append(toIndentedString(isPrintable)).append("\n");
    sb.append("    upperLeftColumn: ").append(toIndentedString(upperLeftColumn)).append("\n");
    sb.append("    isLockAspectRatio: ").append(toIndentedString(isLockAspectRatio)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    zOrderPosition: ").append(toIndentedString(zOrderPosition)).append("\n");
    sb.append("    textHorizontalOverflow: ").append(toIndentedString(textHorizontalOverflow)).append("\n");
    sb.append("    msoDrawingType: ").append(toIndentedString(msoDrawingType)).append("\n");
    sb.append("    textOrientationType: ").append(toIndentedString(textOrientationType)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isWordArt: ").append(toIndentedString(isWordArt)).append("\n");
    sb.append("    linkedCell: ").append(toIndentedString(linkedCell)).append("\n");
    sb.append("    upperLeftRow: ").append(toIndentedString(upperLeftRow)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lowerRightRow: ").append(toIndentedString(lowerRightRow)).append("\n");
    sb.append("    isTextWrapped: ").append(toIndentedString(isTextWrapped)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    lowerRightColumn: ").append(toIndentedString(lowerRightColumn)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    textVerticalOverflow: ").append(toIndentedString(textVerticalOverflow)).append("\n");
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

