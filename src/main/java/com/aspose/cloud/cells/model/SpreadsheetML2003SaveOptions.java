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
import com.aspose.cloud.cells.model.SaveOptions;

/**
 * SpreadsheetML2003SaveOptions
 */

public class SpreadsheetML2003SaveOptions extends SaveOptions {
  private Boolean enableHTTPCompression = null;

  private String saveFormat = null;

  private Boolean clearData = null;

  private String cachedFileFolder = null;

  private Boolean validateMergedAreas = null;

  private Boolean refreshChartCache = null;

  private Boolean createDirectory = null;

  private Boolean sortNames = null;

  private Boolean exportColumnIndexOfCell = null;

  private Boolean isIndentedFormatting = null;

  private Boolean limitAsXls = null;

  public SpreadsheetML2003SaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
    this.enableHTTPCompression = enableHTTPCompression;
    return this;
  }

   /**
   * Get enableHTTPCompression
   * @return enableHTTPCompression
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnableHTTPCompression() {
    return enableHTTPCompression;
  }

  public void setEnableHTTPCompression(Boolean enableHTTPCompression) {
    this.enableHTTPCompression = enableHTTPCompression;
  }

  public SpreadsheetML2003SaveOptions saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * Get saveFormat
   * @return saveFormat
  **/
  @ApiModelProperty(value = "")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }

  public SpreadsheetML2003SaveOptions clearData(Boolean clearData) {
    this.clearData = clearData;
    return this;
  }

   /**
   * Make the workbook empty after saving the file.
   * @return clearData
  **/
  @ApiModelProperty(value = "Make the workbook empty after saving the file.")
  public Boolean getClearData() {
    return clearData;
  }

  public void setClearData(Boolean clearData) {
    this.clearData = clearData;
  }

  public SpreadsheetML2003SaveOptions cachedFileFolder(String cachedFileFolder) {
    this.cachedFileFolder = cachedFileFolder;
    return this;
  }

   /**
   * The cached file folder is used to store some large data.
   * @return cachedFileFolder
  **/
  @ApiModelProperty(value = "The cached file folder is used to store some large data.")
  public String getCachedFileFolder() {
    return cachedFileFolder;
  }

  public void setCachedFileFolder(String cachedFileFolder) {
    this.cachedFileFolder = cachedFileFolder;
  }

  public SpreadsheetML2003SaveOptions validateMergedAreas(Boolean validateMergedAreas) {
    this.validateMergedAreas = validateMergedAreas;
    return this;
  }

   /**
   * Indicates whether validate merged areas before saving the file. The default value is false.             
   * @return validateMergedAreas
  **/
  @ApiModelProperty(value = "Indicates whether validate merged areas before saving the file. The default value is false.             ")
  public Boolean getValidateMergedAreas() {
    return validateMergedAreas;
  }

  public void setValidateMergedAreas(Boolean validateMergedAreas) {
    this.validateMergedAreas = validateMergedAreas;
  }

  public SpreadsheetML2003SaveOptions refreshChartCache(Boolean refreshChartCache) {
    this.refreshChartCache = refreshChartCache;
    return this;
  }

   /**
   * Get refreshChartCache
   * @return refreshChartCache
  **/
  @ApiModelProperty(value = "")
  public Boolean getRefreshChartCache() {
    return refreshChartCache;
  }

  public void setRefreshChartCache(Boolean refreshChartCache) {
    this.refreshChartCache = refreshChartCache;
  }

  public SpreadsheetML2003SaveOptions createDirectory(Boolean createDirectory) {
    this.createDirectory = createDirectory;
    return this;
  }

   /**
   * If true and the directory does not exist, the directory will be automatically created before saving the file.             
   * @return createDirectory
  **/
  @ApiModelProperty(value = "If true and the directory does not exist, the directory will be automatically created before saving the file.             ")
  public Boolean getCreateDirectory() {
    return createDirectory;
  }

  public void setCreateDirectory(Boolean createDirectory) {
    this.createDirectory = createDirectory;
  }

  public SpreadsheetML2003SaveOptions sortNames(Boolean sortNames) {
    this.sortNames = sortNames;
    return this;
  }

   /**
   * Get sortNames
   * @return sortNames
  **/
  @ApiModelProperty(value = "")
  public Boolean getSortNames() {
    return sortNames;
  }

  public void setSortNames(Boolean sortNames) {
    this.sortNames = sortNames;
  }

  public SpreadsheetML2003SaveOptions exportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
    this.exportColumnIndexOfCell = exportColumnIndexOfCell;
    return this;
  }

   /**
   * Get exportColumnIndexOfCell
   * @return exportColumnIndexOfCell
  **/
  @ApiModelProperty(value = "")
  public Boolean getExportColumnIndexOfCell() {
    return exportColumnIndexOfCell;
  }

  public void setExportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
    this.exportColumnIndexOfCell = exportColumnIndexOfCell;
  }

  public SpreadsheetML2003SaveOptions isIndentedFormatting(Boolean isIndentedFormatting) {
    this.isIndentedFormatting = isIndentedFormatting;
    return this;
  }

   /**
   * Get isIndentedFormatting
   * @return isIndentedFormatting
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsIndentedFormatting() {
    return isIndentedFormatting;
  }

  public void setIsIndentedFormatting(Boolean isIndentedFormatting) {
    this.isIndentedFormatting = isIndentedFormatting;
  }

  public SpreadsheetML2003SaveOptions limitAsXls(Boolean limitAsXls) {
    this.limitAsXls = limitAsXls;
    return this;
  }

   /**
   * Get limitAsXls
   * @return limitAsXls
  **/
  @ApiModelProperty(value = "")
  public Boolean getLimitAsXls() {
    return limitAsXls;
  }

  public void setLimitAsXls(Boolean limitAsXls) {
    this.limitAsXls = limitAsXls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetML2003SaveOptions spreadsheetML2003SaveOptions = (SpreadsheetML2003SaveOptions) o;
    return Objects.equals(this.enableHTTPCompression, spreadsheetML2003SaveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, spreadsheetML2003SaveOptions.saveFormat) &&
        Objects.equals(this.clearData, spreadsheetML2003SaveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, spreadsheetML2003SaveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, spreadsheetML2003SaveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, spreadsheetML2003SaveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, spreadsheetML2003SaveOptions.createDirectory) &&
        Objects.equals(this.sortNames, spreadsheetML2003SaveOptions.sortNames) &&
        Objects.equals(this.exportColumnIndexOfCell, spreadsheetML2003SaveOptions.exportColumnIndexOfCell) &&
        Objects.equals(this.isIndentedFormatting, spreadsheetML2003SaveOptions.isIndentedFormatting) &&
        Objects.equals(this.limitAsXls, spreadsheetML2003SaveOptions.limitAsXls) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames, exportColumnIndexOfCell, isIndentedFormatting, limitAsXls, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetML2003SaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
    sb.append("    exportColumnIndexOfCell: ").append(toIndentedString(exportColumnIndexOfCell)).append("\n");
    sb.append("    isIndentedFormatting: ").append(toIndentedString(isIndentedFormatting)).append("\n");
    sb.append("    limitAsXls: ").append(toIndentedString(limitAsXls)).append("\n");
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

