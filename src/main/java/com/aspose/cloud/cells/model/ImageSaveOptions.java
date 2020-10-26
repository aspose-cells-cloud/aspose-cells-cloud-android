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
 * ImageSaveOptions
 */

public class ImageSaveOptions extends SaveOptions {
  private Boolean enableHTTPCompression = null;

  private String saveFormat = null;

  private Boolean clearData = null;

  private String cachedFileFolder = null;

  private Boolean validateMergedAreas = null;

  private Boolean refreshChartCache = null;

  private Boolean createDirectory = null;

  private Boolean sortNames = null;

  private String chartImageType = null;

  private String embededImageNameInSvg = null;

  private Integer horizontalResolution = null;

  private String imageFormat = null;

  private Boolean isCellAutoFit = null;

  private Boolean onePagePerSheet = null;

  private Boolean onlyArea = null;

  private String printingPage = null;

  private Integer printWithStatusDialog = null;

  private Integer quality = null;

  private String tiffCompression = null;

  private Integer verticalResolution = null;

  public ImageSaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
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

  public ImageSaveOptions saveFormat(String saveFormat) {
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

  public ImageSaveOptions clearData(Boolean clearData) {
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

  public ImageSaveOptions cachedFileFolder(String cachedFileFolder) {
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

  public ImageSaveOptions validateMergedAreas(Boolean validateMergedAreas) {
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

  public ImageSaveOptions refreshChartCache(Boolean refreshChartCache) {
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

  public ImageSaveOptions createDirectory(Boolean createDirectory) {
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

  public ImageSaveOptions sortNames(Boolean sortNames) {
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

  public ImageSaveOptions chartImageType(String chartImageType) {
    this.chartImageType = chartImageType;
    return this;
  }

   /**
   * Get chartImageType
   * @return chartImageType
  **/
  @ApiModelProperty(value = "")
  public String getChartImageType() {
    return chartImageType;
  }

  public void setChartImageType(String chartImageType) {
    this.chartImageType = chartImageType;
  }

  public ImageSaveOptions embededImageNameInSvg(String embededImageNameInSvg) {
    this.embededImageNameInSvg = embededImageNameInSvg;
    return this;
  }

   /**
   * Get embededImageNameInSvg
   * @return embededImageNameInSvg
  **/
  @ApiModelProperty(value = "")
  public String getEmbededImageNameInSvg() {
    return embededImageNameInSvg;
  }

  public void setEmbededImageNameInSvg(String embededImageNameInSvg) {
    this.embededImageNameInSvg = embededImageNameInSvg;
  }

  public ImageSaveOptions horizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Get horizontalResolution
   * @return horizontalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public ImageSaveOptions imageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Get imageFormat
   * @return imageFormat
  **/
  @ApiModelProperty(value = "")
  public String getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }

  public ImageSaveOptions isCellAutoFit(Boolean isCellAutoFit) {
    this.isCellAutoFit = isCellAutoFit;
    return this;
  }

   /**
   * Get isCellAutoFit
   * @return isCellAutoFit
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsCellAutoFit() {
    return isCellAutoFit;
  }

  public void setIsCellAutoFit(Boolean isCellAutoFit) {
    this.isCellAutoFit = isCellAutoFit;
  }

  public ImageSaveOptions onePagePerSheet(Boolean onePagePerSheet) {
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

  public ImageSaveOptions onlyArea(Boolean onlyArea) {
    this.onlyArea = onlyArea;
    return this;
  }

   /**
   * Get onlyArea
   * @return onlyArea
  **/
  @ApiModelProperty(value = "")
  public Boolean getOnlyArea() {
    return onlyArea;
  }

  public void setOnlyArea(Boolean onlyArea) {
    this.onlyArea = onlyArea;
  }

  public ImageSaveOptions printingPage(String printingPage) {
    this.printingPage = printingPage;
    return this;
  }

   /**
   * Get printingPage
   * @return printingPage
  **/
  @ApiModelProperty(value = "")
  public String getPrintingPage() {
    return printingPage;
  }

  public void setPrintingPage(String printingPage) {
    this.printingPage = printingPage;
  }

  public ImageSaveOptions printWithStatusDialog(Integer printWithStatusDialog) {
    this.printWithStatusDialog = printWithStatusDialog;
    return this;
  }

   /**
   * Get printWithStatusDialog
   * @return printWithStatusDialog
  **/
  @ApiModelProperty(value = "")
  public Integer getPrintWithStatusDialog() {
    return printWithStatusDialog;
  }

  public void setPrintWithStatusDialog(Integer printWithStatusDialog) {
    this.printWithStatusDialog = printWithStatusDialog;
  }

  public ImageSaveOptions quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public ImageSaveOptions tiffCompression(String tiffCompression) {
    this.tiffCompression = tiffCompression;
    return this;
  }

   /**
   * Get tiffCompression
   * @return tiffCompression
  **/
  @ApiModelProperty(value = "")
  public String getTiffCompression() {
    return tiffCompression;
  }

  public void setTiffCompression(String tiffCompression) {
    this.tiffCompression = tiffCompression;
  }

  public ImageSaveOptions verticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Get verticalResolution
   * @return verticalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSaveOptions imageSaveOptions = (ImageSaveOptions) o;
    return Objects.equals(this.enableHTTPCompression, imageSaveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, imageSaveOptions.saveFormat) &&
        Objects.equals(this.clearData, imageSaveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, imageSaveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, imageSaveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, imageSaveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, imageSaveOptions.createDirectory) &&
        Objects.equals(this.sortNames, imageSaveOptions.sortNames) &&
        Objects.equals(this.chartImageType, imageSaveOptions.chartImageType) &&
        Objects.equals(this.embededImageNameInSvg, imageSaveOptions.embededImageNameInSvg) &&
        Objects.equals(this.horizontalResolution, imageSaveOptions.horizontalResolution) &&
        Objects.equals(this.imageFormat, imageSaveOptions.imageFormat) &&
        Objects.equals(this.isCellAutoFit, imageSaveOptions.isCellAutoFit) &&
        Objects.equals(this.onePagePerSheet, imageSaveOptions.onePagePerSheet) &&
        Objects.equals(this.onlyArea, imageSaveOptions.onlyArea) &&
        Objects.equals(this.printingPage, imageSaveOptions.printingPage) &&
        Objects.equals(this.printWithStatusDialog, imageSaveOptions.printWithStatusDialog) &&
        Objects.equals(this.quality, imageSaveOptions.quality) &&
        Objects.equals(this.tiffCompression, imageSaveOptions.tiffCompression) &&
        Objects.equals(this.verticalResolution, imageSaveOptions.verticalResolution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames, chartImageType, embededImageNameInSvg, horizontalResolution, imageFormat, isCellAutoFit, onePagePerSheet, onlyArea, printingPage, printWithStatusDialog, quality, tiffCompression, verticalResolution, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
    sb.append("    chartImageType: ").append(toIndentedString(chartImageType)).append("\n");
    sb.append("    embededImageNameInSvg: ").append(toIndentedString(embededImageNameInSvg)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    isCellAutoFit: ").append(toIndentedString(isCellAutoFit)).append("\n");
    sb.append("    onePagePerSheet: ").append(toIndentedString(onePagePerSheet)).append("\n");
    sb.append("    onlyArea: ").append(toIndentedString(onlyArea)).append("\n");
    sb.append("    printingPage: ").append(toIndentedString(printingPage)).append("\n");
    sb.append("    printWithStatusDialog: ").append(toIndentedString(printWithStatusDialog)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    tiffCompression: ").append(toIndentedString(tiffCompression)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
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

