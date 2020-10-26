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
import com.aspose.cloud.cells.model.CellValue;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.ImportOption;
import java.util.*;

/**
 * ImportBatchDataOption
 */

public class ImportBatchDataOption extends ImportOption {
  private FileSource source = null;

  private String importDataType = null;

  private String destinationWorksheet = null;

  private Boolean isInsert = null;

  private List<CellValue> batchData = null;

  public ImportBatchDataOption source(FileSource source) {
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

  public ImportBatchDataOption importDataType(String importDataType) {
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

  public ImportBatchDataOption destinationWorksheet(String destinationWorksheet) {
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

  public ImportBatchDataOption isInsert(Boolean isInsert) {
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

  public ImportBatchDataOption batchData(List<CellValue> batchData) {
    this.batchData = batchData;
    return this;
  }

  public ImportBatchDataOption addBatchDataItem(CellValue batchDataItem) {
    if (this.batchData == null) {
      this.batchData = null;
    }
    this.batchData.add(batchDataItem);
    return this;
  }

   /**
   * Get batchData
   * @return batchData
  **/
  @ApiModelProperty(value = "")
  public List<CellValue> getBatchData() {
    return batchData;
  }

  public void setBatchData(List<CellValue> batchData) {
    this.batchData = batchData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportBatchDataOption importBatchDataOption = (ImportBatchDataOption) o;
    return Objects.equals(this.source, importBatchDataOption.source) &&
        Objects.equals(this.importDataType, importBatchDataOption.importDataType) &&
        Objects.equals(this.destinationWorksheet, importBatchDataOption.destinationWorksheet) &&
        Objects.equals(this.isInsert, importBatchDataOption.isInsert) &&
        Objects.equals(this.batchData, importBatchDataOption.batchData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, importDataType, destinationWorksheet, isInsert, batchData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportBatchDataOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    importDataType: ").append(toIndentedString(importDataType)).append("\n");
    sb.append("    destinationWorksheet: ").append(toIndentedString(destinationWorksheet)).append("\n");
    sb.append("    isInsert: ").append(toIndentedString(isInsert)).append("\n");
    sb.append("    batchData: ").append(toIndentedString(batchData)).append("\n");
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

