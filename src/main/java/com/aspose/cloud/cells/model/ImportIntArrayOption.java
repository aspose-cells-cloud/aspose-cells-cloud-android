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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.ImportOption;
import java.util.*;

/**
 * ImportIntArrayOption
 */

public class ImportIntArrayOption extends ImportOption {
  private FileSource source = null;

  private String importDataType = null;

  private String destinationWorksheet = null;

  private Boolean isInsert = null;

  private List<Integer> data = null;

  private Boolean isVertical = null;

  private Integer firstRow = null;

  private Integer firstColumn = null;

  public ImportIntArrayOption source(FileSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public FileSource getSource() {
    return source;
  }

  public void setSource(FileSource source) {
    this.source = source;
  }

  public ImportIntArrayOption importDataType(String importDataType) {
    this.importDataType = importDataType;
    return this;
  }

   /**
   * Get importDataType
   * @return importDataType
  **/
  @ApiModelProperty(value = "")
  public String getImportDataType() {
    return importDataType;
  }

  public void setImportDataType(String importDataType) {
    this.importDataType = importDataType;
  }

  public ImportIntArrayOption destinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
    return this;
  }

   /**
   * Get destinationWorksheet
   * @return destinationWorksheet
  **/
  @ApiModelProperty(value = "")
  public String getDestinationWorksheet() {
    return destinationWorksheet;
  }

  public void setDestinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
  }

  public ImportIntArrayOption isInsert(Boolean isInsert) {
    this.isInsert = isInsert;
    return this;
  }

   /**
   * Get isInsert
   * @return isInsert
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsInsert() {
    return isInsert;
  }

  public void setIsInsert(Boolean isInsert) {
    this.isInsert = isInsert;
  }

  public ImportIntArrayOption data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public ImportIntArrayOption addDataItem(Integer dataItem) {
    if (this.data == null) {
      this.data = null;
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }

  public ImportIntArrayOption isVertical(Boolean isVertical) {
    this.isVertical = isVertical;
    return this;
  }

   /**
   * Get isVertical
   * @return isVertical
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsVertical() {
    return isVertical;
  }

  public void setIsVertical(Boolean isVertical) {
    this.isVertical = isVertical;
  }

  public ImportIntArrayOption firstRow(Integer firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Get firstRow
   * @return firstRow
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Integer firstRow) {
    this.firstRow = firstRow;
  }

  public ImportIntArrayOption firstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
    return this;
  }

   /**
   * Get firstColumn
   * @return firstColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstColumn() {
    return firstColumn;
  }

  public void setFirstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportIntArrayOption importIntArrayOption = (ImportIntArrayOption) o;
    return Objects.equals(this.source, importIntArrayOption.source) &&
        Objects.equals(this.importDataType, importIntArrayOption.importDataType) &&
        Objects.equals(this.destinationWorksheet, importIntArrayOption.destinationWorksheet) &&
        Objects.equals(this.isInsert, importIntArrayOption.isInsert) &&
        Objects.equals(this.data, importIntArrayOption.data) &&
        Objects.equals(this.isVertical, importIntArrayOption.isVertical) &&
        Objects.equals(this.firstRow, importIntArrayOption.firstRow) &&
        Objects.equals(this.firstColumn, importIntArrayOption.firstColumn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, importDataType, destinationWorksheet, isInsert, data, isVertical, firstRow, firstColumn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportIntArrayOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    importDataType: ").append(toIndentedString(importDataType)).append("\n");
    sb.append("    destinationWorksheet: ").append(toIndentedString(destinationWorksheet)).append("\n");
    sb.append("    isInsert: ").append(toIndentedString(isInsert)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isVertical: ").append(toIndentedString(isVertical)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    firstColumn: ").append(toIndentedString(firstColumn)).append("\n");
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

