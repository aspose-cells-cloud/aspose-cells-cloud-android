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
 * HtmlSaveOptions
 */

public class HtmlSaveOptions extends SaveOptions {
  private Boolean enableHTTPCompression = null;

  private String saveFormat = null;

  private Boolean clearData = null;

  private String cachedFileFolder = null;

  private Boolean validateMergedAreas = null;

  private Boolean refreshChartCache = null;

  private Boolean createDirectory = null;

  private Boolean sortNames = null;

  private String attachedFilesDirectory = null;

  private String attachedFilesUrlPrefix = null;

  private String encoding = null;

  private Boolean exportActiveWorksheetOnly = null;

  private String exportChartImageFormat = null;

  private Boolean exportImagesAsBase64 = null;

  private String hiddenColDisplayType = null;

  private String hiddenRowDisplayType = null;

  private String htmlCrossStringType = null;

  private Boolean isExpImageToTempDir = null;

  private String pageTitle = null;

  private Boolean parseHtmlTagInCell = null;

  public HtmlSaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
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

  public HtmlSaveOptions saveFormat(String saveFormat) {
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

  public HtmlSaveOptions clearData(Boolean clearData) {
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

  public HtmlSaveOptions cachedFileFolder(String cachedFileFolder) {
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

  public HtmlSaveOptions validateMergedAreas(Boolean validateMergedAreas) {
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

  public HtmlSaveOptions refreshChartCache(Boolean refreshChartCache) {
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

  public HtmlSaveOptions createDirectory(Boolean createDirectory) {
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

  public HtmlSaveOptions sortNames(Boolean sortNames) {
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

  public HtmlSaveOptions attachedFilesDirectory(String attachedFilesDirectory) {
    this.attachedFilesDirectory = attachedFilesDirectory;
    return this;
  }

   /**
   * Get attachedFilesDirectory
   * @return attachedFilesDirectory
  **/
  @ApiModelProperty(value = "")
  public String getAttachedFilesDirectory() {
    return attachedFilesDirectory;
  }

  public void setAttachedFilesDirectory(String attachedFilesDirectory) {
    this.attachedFilesDirectory = attachedFilesDirectory;
  }

  public HtmlSaveOptions attachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
    this.attachedFilesUrlPrefix = attachedFilesUrlPrefix;
    return this;
  }

   /**
   * Get attachedFilesUrlPrefix
   * @return attachedFilesUrlPrefix
  **/
  @ApiModelProperty(value = "")
  public String getAttachedFilesUrlPrefix() {
    return attachedFilesUrlPrefix;
  }

  public void setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
    this.attachedFilesUrlPrefix = attachedFilesUrlPrefix;
  }

  public HtmlSaveOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @ApiModelProperty(value = "")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public HtmlSaveOptions exportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
    this.exportActiveWorksheetOnly = exportActiveWorksheetOnly;
    return this;
  }

   /**
   * Get exportActiveWorksheetOnly
   * @return exportActiveWorksheetOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean getExportActiveWorksheetOnly() {
    return exportActiveWorksheetOnly;
  }

  public void setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
    this.exportActiveWorksheetOnly = exportActiveWorksheetOnly;
  }

  public HtmlSaveOptions exportChartImageFormat(String exportChartImageFormat) {
    this.exportChartImageFormat = exportChartImageFormat;
    return this;
  }

   /**
   * Get exportChartImageFormat
   * @return exportChartImageFormat
  **/
  @ApiModelProperty(value = "")
  public String getExportChartImageFormat() {
    return exportChartImageFormat;
  }

  public void setExportChartImageFormat(String exportChartImageFormat) {
    this.exportChartImageFormat = exportChartImageFormat;
  }

  public HtmlSaveOptions exportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
    return this;
  }

   /**
   * Get exportImagesAsBase64
   * @return exportImagesAsBase64
  **/
  @ApiModelProperty(value = "")
  public Boolean getExportImagesAsBase64() {
    return exportImagesAsBase64;
  }

  public void setExportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
  }

  public HtmlSaveOptions hiddenColDisplayType(String hiddenColDisplayType) {
    this.hiddenColDisplayType = hiddenColDisplayType;
    return this;
  }

   /**
   * Get hiddenColDisplayType
   * @return hiddenColDisplayType
  **/
  @ApiModelProperty(value = "")
  public String getHiddenColDisplayType() {
    return hiddenColDisplayType;
  }

  public void setHiddenColDisplayType(String hiddenColDisplayType) {
    this.hiddenColDisplayType = hiddenColDisplayType;
  }

  public HtmlSaveOptions hiddenRowDisplayType(String hiddenRowDisplayType) {
    this.hiddenRowDisplayType = hiddenRowDisplayType;
    return this;
  }

   /**
   * Get hiddenRowDisplayType
   * @return hiddenRowDisplayType
  **/
  @ApiModelProperty(value = "")
  public String getHiddenRowDisplayType() {
    return hiddenRowDisplayType;
  }

  public void setHiddenRowDisplayType(String hiddenRowDisplayType) {
    this.hiddenRowDisplayType = hiddenRowDisplayType;
  }

  public HtmlSaveOptions htmlCrossStringType(String htmlCrossStringType) {
    this.htmlCrossStringType = htmlCrossStringType;
    return this;
  }

   /**
   * Get htmlCrossStringType
   * @return htmlCrossStringType
  **/
  @ApiModelProperty(value = "")
  public String getHtmlCrossStringType() {
    return htmlCrossStringType;
  }

  public void setHtmlCrossStringType(String htmlCrossStringType) {
    this.htmlCrossStringType = htmlCrossStringType;
  }

  public HtmlSaveOptions isExpImageToTempDir(Boolean isExpImageToTempDir) {
    this.isExpImageToTempDir = isExpImageToTempDir;
    return this;
  }

   /**
   * Get isExpImageToTempDir
   * @return isExpImageToTempDir
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsExpImageToTempDir() {
    return isExpImageToTempDir;
  }

  public void setIsExpImageToTempDir(Boolean isExpImageToTempDir) {
    this.isExpImageToTempDir = isExpImageToTempDir;
  }

  public HtmlSaveOptions pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @ApiModelProperty(value = "")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public HtmlSaveOptions parseHtmlTagInCell(Boolean parseHtmlTagInCell) {
    this.parseHtmlTagInCell = parseHtmlTagInCell;
    return this;
  }

   /**
   * Get parseHtmlTagInCell
   * @return parseHtmlTagInCell
  **/
  @ApiModelProperty(value = "")
  public Boolean getParseHtmlTagInCell() {
    return parseHtmlTagInCell;
  }

  public void setParseHtmlTagInCell(Boolean parseHtmlTagInCell) {
    this.parseHtmlTagInCell = parseHtmlTagInCell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlSaveOptions htmlSaveOptions = (HtmlSaveOptions) o;
    return Objects.equals(this.enableHTTPCompression, htmlSaveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, htmlSaveOptions.saveFormat) &&
        Objects.equals(this.clearData, htmlSaveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, htmlSaveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, htmlSaveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, htmlSaveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, htmlSaveOptions.createDirectory) &&
        Objects.equals(this.sortNames, htmlSaveOptions.sortNames) &&
        Objects.equals(this.attachedFilesDirectory, htmlSaveOptions.attachedFilesDirectory) &&
        Objects.equals(this.attachedFilesUrlPrefix, htmlSaveOptions.attachedFilesUrlPrefix) &&
        Objects.equals(this.encoding, htmlSaveOptions.encoding) &&
        Objects.equals(this.exportActiveWorksheetOnly, htmlSaveOptions.exportActiveWorksheetOnly) &&
        Objects.equals(this.exportChartImageFormat, htmlSaveOptions.exportChartImageFormat) &&
        Objects.equals(this.exportImagesAsBase64, htmlSaveOptions.exportImagesAsBase64) &&
        Objects.equals(this.hiddenColDisplayType, htmlSaveOptions.hiddenColDisplayType) &&
        Objects.equals(this.hiddenRowDisplayType, htmlSaveOptions.hiddenRowDisplayType) &&
        Objects.equals(this.htmlCrossStringType, htmlSaveOptions.htmlCrossStringType) &&
        Objects.equals(this.isExpImageToTempDir, htmlSaveOptions.isExpImageToTempDir) &&
        Objects.equals(this.pageTitle, htmlSaveOptions.pageTitle) &&
        Objects.equals(this.parseHtmlTagInCell, htmlSaveOptions.parseHtmlTagInCell) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames, attachedFilesDirectory, attachedFilesUrlPrefix, encoding, exportActiveWorksheetOnly, exportChartImageFormat, exportImagesAsBase64, hiddenColDisplayType, hiddenRowDisplayType, htmlCrossStringType, isExpImageToTempDir, pageTitle, parseHtmlTagInCell, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
    sb.append("    attachedFilesDirectory: ").append(toIndentedString(attachedFilesDirectory)).append("\n");
    sb.append("    attachedFilesUrlPrefix: ").append(toIndentedString(attachedFilesUrlPrefix)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportActiveWorksheetOnly: ").append(toIndentedString(exportActiveWorksheetOnly)).append("\n");
    sb.append("    exportChartImageFormat: ").append(toIndentedString(exportChartImageFormat)).append("\n");
    sb.append("    exportImagesAsBase64: ").append(toIndentedString(exportImagesAsBase64)).append("\n");
    sb.append("    hiddenColDisplayType: ").append(toIndentedString(hiddenColDisplayType)).append("\n");
    sb.append("    hiddenRowDisplayType: ").append(toIndentedString(hiddenRowDisplayType)).append("\n");
    sb.append("    htmlCrossStringType: ").append(toIndentedString(htmlCrossStringType)).append("\n");
    sb.append("    isExpImageToTempDir: ").append(toIndentedString(isExpImageToTempDir)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    parseHtmlTagInCell: ").append(toIndentedString(parseHtmlTagInCell)).append("\n");
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

