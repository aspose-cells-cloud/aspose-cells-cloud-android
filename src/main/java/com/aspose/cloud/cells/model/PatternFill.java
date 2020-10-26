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
import com.aspose.cloud.cells.model.CellsColor;
import com.aspose.cloud.cells.model.Color;

/**
 * PatternFill
 */

public class PatternFill {
  private Color foregroundColor = null;

  private String pattern = null;

  private Color backgroundColor = null;

  private Double backTransparency = null;

  private CellsColor backgroundCellsColor = null;

  private Double foreTransparency = null;

  private CellsColor foregroundCellsColor = null;

  public PatternFill foregroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Get foregroundColor
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "")
  public Color getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public PatternFill pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public PatternFill backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public PatternFill backTransparency(Double backTransparency) {
    this.backTransparency = backTransparency;
    return this;
  }

   /**
   * Get backTransparency
   * @return backTransparency
  **/
  @ApiModelProperty(value = "")
  public Double getBackTransparency() {
    return backTransparency;
  }

  public void setBackTransparency(Double backTransparency) {
    this.backTransparency = backTransparency;
  }

  public PatternFill backgroundCellsColor(CellsColor backgroundCellsColor) {
    this.backgroundCellsColor = backgroundCellsColor;
    return this;
  }

   /**
   * Get backgroundCellsColor
   * @return backgroundCellsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getBackgroundCellsColor() {
    return backgroundCellsColor;
  }

  public void setBackgroundCellsColor(CellsColor backgroundCellsColor) {
    this.backgroundCellsColor = backgroundCellsColor;
  }

  public PatternFill foreTransparency(Double foreTransparency) {
    this.foreTransparency = foreTransparency;
    return this;
  }

   /**
   * Get foreTransparency
   * @return foreTransparency
  **/
  @ApiModelProperty(value = "")
  public Double getForeTransparency() {
    return foreTransparency;
  }

  public void setForeTransparency(Double foreTransparency) {
    this.foreTransparency = foreTransparency;
  }

  public PatternFill foregroundCellsColor(CellsColor foregroundCellsColor) {
    this.foregroundCellsColor = foregroundCellsColor;
    return this;
  }

   /**
   * Get foregroundCellsColor
   * @return foregroundCellsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getForegroundCellsColor() {
    return foregroundCellsColor;
  }

  public void setForegroundCellsColor(CellsColor foregroundCellsColor) {
    this.foregroundCellsColor = foregroundCellsColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternFill patternFill = (PatternFill) o;
    return Objects.equals(this.foregroundColor, patternFill.foregroundColor) &&
        Objects.equals(this.pattern, patternFill.pattern) &&
        Objects.equals(this.backgroundColor, patternFill.backgroundColor) &&
        Objects.equals(this.backTransparency, patternFill.backTransparency) &&
        Objects.equals(this.backgroundCellsColor, patternFill.backgroundCellsColor) &&
        Objects.equals(this.foreTransparency, patternFill.foreTransparency) &&
        Objects.equals(this.foregroundCellsColor, patternFill.foregroundCellsColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foregroundColor, pattern, backgroundColor, backTransparency, backgroundCellsColor, foreTransparency, foregroundCellsColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternFill {\n");
    
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    backTransparency: ").append(toIndentedString(backTransparency)).append("\n");
    sb.append("    backgroundCellsColor: ").append(toIndentedString(backgroundCellsColor)).append("\n");
    sb.append("    foreTransparency: ").append(toIndentedString(foreTransparency)).append("\n");
    sb.append("    foregroundCellsColor: ").append(toIndentedString(foregroundCellsColor)).append("\n");
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

