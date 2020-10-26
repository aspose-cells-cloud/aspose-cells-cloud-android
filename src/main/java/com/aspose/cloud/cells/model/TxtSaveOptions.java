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
 * TxtSaveOptions
 */

public class TxtSaveOptions extends SaveOptions {
  private Boolean enableHTTPCompression = null;

  private String saveFormat = null;

  private Boolean clearData = null;

  private String cachedFileFolder = null;

  private Boolean validateMergedAreas = null;

  private Boolean refreshChartCache = null;

  private Boolean createDirectory = null;

  private Boolean sortNames = null;

  private String quoteType = null;

  private String separator = null;

  private String separatorString = null;

  private Boolean alwaysQuoted = null;

  public TxtSaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
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

  public TxtSaveOptions saveFormat(String saveFormat) {
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

  public TxtSaveOptions clearData(Boolean clearData) {
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

  public TxtSaveOptions cachedFileFolder(String cachedFileFolder) {
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

  public TxtSaveOptions validateMergedAreas(Boolean validateMergedAreas) {
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

  public TxtSaveOptions refreshChartCache(Boolean refreshChartCache) {
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

  public TxtSaveOptions createDirectory(Boolean createDirectory) {
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

  public TxtSaveOptions sortNames(Boolean sortNames) {
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

  public TxtSaveOptions quoteType(String quoteType) {
    this.quoteType = quoteType;
    return this;
  }

   /**
   * Get quoteType
   * @return quoteType
  **/
  @ApiModelProperty(value = "")
  public String getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(String quoteType) {
    this.quoteType = quoteType;
  }

  public TxtSaveOptions separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Get separator
   * @return separator
  **/
  @ApiModelProperty(value = "")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public TxtSaveOptions separatorString(String separatorString) {
    this.separatorString = separatorString;
    return this;
  }

   /**
   * Get separatorString
   * @return separatorString
  **/
  @ApiModelProperty(value = "")
  public String getSeparatorString() {
    return separatorString;
  }

  public void setSeparatorString(String separatorString) {
    this.separatorString = separatorString;
  }

  public TxtSaveOptions alwaysQuoted(Boolean alwaysQuoted) {
    this.alwaysQuoted = alwaysQuoted;
    return this;
  }

   /**
   * Get alwaysQuoted
   * @return alwaysQuoted
  **/
  @ApiModelProperty(value = "")
  public Boolean getAlwaysQuoted() {
    return alwaysQuoted;
  }

  public void setAlwaysQuoted(Boolean alwaysQuoted) {
    this.alwaysQuoted = alwaysQuoted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxtSaveOptions txtSaveOptions = (TxtSaveOptions) o;
    return Objects.equals(this.enableHTTPCompression, txtSaveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, txtSaveOptions.saveFormat) &&
        Objects.equals(this.clearData, txtSaveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, txtSaveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, txtSaveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, txtSaveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, txtSaveOptions.createDirectory) &&
        Objects.equals(this.sortNames, txtSaveOptions.sortNames) &&
        Objects.equals(this.quoteType, txtSaveOptions.quoteType) &&
        Objects.equals(this.separator, txtSaveOptions.separator) &&
        Objects.equals(this.separatorString, txtSaveOptions.separatorString) &&
        Objects.equals(this.alwaysQuoted, txtSaveOptions.alwaysQuoted) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames, quoteType, separator, separatorString, alwaysQuoted, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxtSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    separatorString: ").append(toIndentedString(separatorString)).append("\n");
    sb.append("    alwaysQuoted: ").append(toIndentedString(alwaysQuoted)).append("\n");
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

