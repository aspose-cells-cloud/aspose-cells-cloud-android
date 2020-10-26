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
import com.aspose.cloud.cells.model.PdfSecurityOptions;
import com.aspose.cloud.cells.model.SaveOptions;

/**
 * PdfSaveOptions
 */

public class PdfSaveOptions extends SaveOptions {
  private Boolean enableHTTPCompression = null;

  private String saveFormat = null;

  private Boolean clearData = null;

  private String cachedFileFolder = null;

  private Boolean validateMergedAreas = null;

  private Boolean refreshChartCache = null;

  private Boolean createDirectory = null;

  private Boolean sortNames = null;

  private Boolean calculateFormula = null;

  private Boolean checkFontCompatibility = null;

  private Boolean onePagePerSheet = null;

  private String compliance = null;

  private String defaultFont = null;

  private String printingPageType = null;

  private String imageType = null;

  private Integer desiredPPI = null;

  private Integer jpegQuality = null;

  private PdfSecurityOptions securityOptions = null;

  public PdfSaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
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

  public PdfSaveOptions saveFormat(String saveFormat) {
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

  public PdfSaveOptions clearData(Boolean clearData) {
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

  public PdfSaveOptions cachedFileFolder(String cachedFileFolder) {
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

  public PdfSaveOptions validateMergedAreas(Boolean validateMergedAreas) {
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

  public PdfSaveOptions refreshChartCache(Boolean refreshChartCache) {
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

  public PdfSaveOptions createDirectory(Boolean createDirectory) {
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

  public PdfSaveOptions sortNames(Boolean sortNames) {
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

  public PdfSaveOptions calculateFormula(Boolean calculateFormula) {
    this.calculateFormula = calculateFormula;
    return this;
  }

   /**
   * Get calculateFormula
   * @return calculateFormula
  **/
  @ApiModelProperty(value = "")
  public Boolean getCalculateFormula() {
    return calculateFormula;
  }

  public void setCalculateFormula(Boolean calculateFormula) {
    this.calculateFormula = calculateFormula;
  }

  public PdfSaveOptions checkFontCompatibility(Boolean checkFontCompatibility) {
    this.checkFontCompatibility = checkFontCompatibility;
    return this;
  }

   /**
   * Get checkFontCompatibility
   * @return checkFontCompatibility
  **/
  @ApiModelProperty(value = "")
  public Boolean getCheckFontCompatibility() {
    return checkFontCompatibility;
  }

  public void setCheckFontCompatibility(Boolean checkFontCompatibility) {
    this.checkFontCompatibility = checkFontCompatibility;
  }

  public PdfSaveOptions onePagePerSheet(Boolean onePagePerSheet) {
    this.onePagePerSheet = onePagePerSheet;
    return this;
  }

   /**
   * Get onePagePerSheet
   * @return onePagePerSheet
  **/
  @ApiModelProperty(value = "")
  public Boolean getOnePagePerSheet() {
    return onePagePerSheet;
  }

  public void setOnePagePerSheet(Boolean onePagePerSheet) {
    this.onePagePerSheet = onePagePerSheet;
  }

  public PdfSaveOptions compliance(String compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @ApiModelProperty(value = "")
  public String getCompliance() {
    return compliance;
  }

  public void setCompliance(String compliance) {
    this.compliance = compliance;
  }

  public PdfSaveOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Get defaultFont
   * @return defaultFont
  **/
  @ApiModelProperty(value = "")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public PdfSaveOptions printingPageType(String printingPageType) {
    this.printingPageType = printingPageType;
    return this;
  }

   /**
   * Get printingPageType
   * @return printingPageType
  **/
  @ApiModelProperty(value = "")
  public String getPrintingPageType() {
    return printingPageType;
  }

  public void setPrintingPageType(String printingPageType) {
    this.printingPageType = printingPageType;
  }

  public PdfSaveOptions imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @ApiModelProperty(value = "")
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public PdfSaveOptions desiredPPI(Integer desiredPPI) {
    this.desiredPPI = desiredPPI;
    return this;
  }

   /**
   * Get desiredPPI
   * @return desiredPPI
  **/
  @ApiModelProperty(value = "")
  public Integer getDesiredPPI() {
    return desiredPPI;
  }

  public void setDesiredPPI(Integer desiredPPI) {
    this.desiredPPI = desiredPPI;
  }

  public PdfSaveOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Get jpegQuality
   * @return jpegQuality
  **/
  @ApiModelProperty(value = "")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public PdfSaveOptions securityOptions(PdfSecurityOptions securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

   /**
   * Get securityOptions
   * @return securityOptions
  **/
  @ApiModelProperty(value = "")
  public PdfSecurityOptions getSecurityOptions() {
    return securityOptions;
  }

  public void setSecurityOptions(PdfSecurityOptions securityOptions) {
    this.securityOptions = securityOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) o;
    return Objects.equals(this.enableHTTPCompression, pdfSaveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, pdfSaveOptions.saveFormat) &&
        Objects.equals(this.clearData, pdfSaveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, pdfSaveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, pdfSaveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, pdfSaveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, pdfSaveOptions.createDirectory) &&
        Objects.equals(this.sortNames, pdfSaveOptions.sortNames) &&
        Objects.equals(this.calculateFormula, pdfSaveOptions.calculateFormula) &&
        Objects.equals(this.checkFontCompatibility, pdfSaveOptions.checkFontCompatibility) &&
        Objects.equals(this.onePagePerSheet, pdfSaveOptions.onePagePerSheet) &&
        Objects.equals(this.compliance, pdfSaveOptions.compliance) &&
        Objects.equals(this.defaultFont, pdfSaveOptions.defaultFont) &&
        Objects.equals(this.printingPageType, pdfSaveOptions.printingPageType) &&
        Objects.equals(this.imageType, pdfSaveOptions.imageType) &&
        Objects.equals(this.desiredPPI, pdfSaveOptions.desiredPPI) &&
        Objects.equals(this.jpegQuality, pdfSaveOptions.jpegQuality) &&
        Objects.equals(this.securityOptions, pdfSaveOptions.securityOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames, calculateFormula, checkFontCompatibility, onePagePerSheet, compliance, defaultFont, printingPageType, imageType, desiredPPI, jpegQuality, securityOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
    sb.append("    calculateFormula: ").append(toIndentedString(calculateFormula)).append("\n");
    sb.append("    checkFontCompatibility: ").append(toIndentedString(checkFontCompatibility)).append("\n");
    sb.append("    onePagePerSheet: ").append(toIndentedString(onePagePerSheet)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    printingPageType: ").append(toIndentedString(printingPageType)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    desiredPPI: ").append(toIndentedString(desiredPPI)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(securityOptions)).append("\n");
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

