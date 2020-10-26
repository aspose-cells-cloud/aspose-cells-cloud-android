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

package com.aspose.cloud.cells.api;

import com.sun.jersey.api.client.GenericType;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.Configuration;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.client.Pair;

import com.aspose.cloud.cells.model.AccessTokenResponse;
import com.aspose.cloud.cells.model.AutoFilterResponse;
import com.aspose.cloud.cells.model.AutoFitterOptions;
import com.aspose.cloud.cells.model.AutoShapesResponse;
import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.CellResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.CellsDocumentPropertiesResponse;
import com.aspose.cloud.cells.model.CellsDocumentProperty;
import com.aspose.cloud.cells.model.CellsDocumentPropertyResponse;
import com.aspose.cloud.cells.model.CellsResponse;
import com.aspose.cloud.cells.model.Chart;
import com.aspose.cloud.cells.model.ChartAreaResponse;
import com.aspose.cloud.cells.model.ChartsResponse;
import com.aspose.cloud.cells.model.ColorFilterRequest;
import com.aspose.cloud.cells.model.ColumnResponse;
import com.aspose.cloud.cells.model.ColumnsResponse;
import com.aspose.cloud.cells.model.Comment;
import com.aspose.cloud.cells.model.CommentResponse;
import com.aspose.cloud.cells.model.CommentsResponse;
import com.aspose.cloud.cells.model.ConditionalFormattingResponse;
import com.aspose.cloud.cells.model.ConditionalFormattingsResponse;
import com.aspose.cloud.cells.model.CopyOptions;
import com.aspose.cloud.cells.model.CreatePivotTableRequest;
import com.aspose.cloud.cells.model.DataSorter;
import com.aspose.cloud.cells.model.DiscUsage;
import java.io.File;
import com.aspose.cloud.cells.model.FileVersions;
import com.aspose.cloud.cells.model.FilesList;
import com.aspose.cloud.cells.model.FilesUploadResult;
import com.aspose.cloud.cells.model.FillFormatResponse;
import com.aspose.cloud.cells.model.FontSetting;
import com.aspose.cloud.cells.model.FormatCondition;
import com.aspose.cloud.cells.model.HorizontalPageBreakResponse;
import com.aspose.cloud.cells.model.HorizontalPageBreaksResponse;
import com.aspose.cloud.cells.model.Hyperlink;
import com.aspose.cloud.cells.model.HyperlinkResponse;
import com.aspose.cloud.cells.model.HyperlinksResponse;
import com.aspose.cloud.cells.model.ImportOption;
import com.aspose.cloud.cells.model.Legend;
import com.aspose.cloud.cells.model.LegendResponse;
import com.aspose.cloud.cells.model.LineResponse;
import java.util.*;
import com.aspose.cloud.cells.model.ListObject;
import com.aspose.cloud.cells.model.ListObjectResponse;
import com.aspose.cloud.cells.model.ListObjectsResponse;
import com.aspose.cloud.cells.model.MergedCellResponse;
import com.aspose.cloud.cells.model.MergedCellsResponse;
import com.aspose.cloud.cells.model.NameResponse;
import com.aspose.cloud.cells.model.NamesResponse;
import com.aspose.cloud.cells.model.ObjectExist;
import com.aspose.cloud.cells.model.OleObject;
import com.aspose.cloud.cells.model.OleObjectResponse;
import com.aspose.cloud.cells.model.OleObjectsResponse;
import com.aspose.cloud.cells.model.PageSectionsResponse;
import com.aspose.cloud.cells.model.PageSetup;
import com.aspose.cloud.cells.model.PageSetupResponse;
import com.aspose.cloud.cells.model.PasswordRequest;
import com.aspose.cloud.cells.model.Picture;
import com.aspose.cloud.cells.model.PictureResponse;
import com.aspose.cloud.cells.model.PicturesResponse;
import com.aspose.cloud.cells.model.PivotField;
import com.aspose.cloud.cells.model.PivotFieldResponse;
import com.aspose.cloud.cells.model.PivotFilter;
import com.aspose.cloud.cells.model.PivotFilterResponse;
import com.aspose.cloud.cells.model.PivotFiltersResponse;
import com.aspose.cloud.cells.model.PivotTableFieldRequest;
import com.aspose.cloud.cells.model.PivotTableResponse;
import com.aspose.cloud.cells.model.PivotTablesResponse;
import com.aspose.cloud.cells.model.ProtectSheetParameter;
import com.aspose.cloud.cells.model.Range;
import com.aspose.cloud.cells.model.RangeCopyRequest;
import com.aspose.cloud.cells.model.RangeSetOutlineBorderRequest;
import com.aspose.cloud.cells.model.RangeSetStyleRequest;
import com.aspose.cloud.cells.model.RangeValueResponse;
import com.aspose.cloud.cells.model.RangesResponse;
import com.aspose.cloud.cells.model.RowResponse;
import com.aspose.cloud.cells.model.RowsResponse;
import com.aspose.cloud.cells.model.SaveOptions;
import com.aspose.cloud.cells.model.SaveResponse;
import com.aspose.cloud.cells.model.Shape;
import com.aspose.cloud.cells.model.ShapeResponse;
import com.aspose.cloud.cells.model.ShapesResponse;
import com.aspose.cloud.cells.model.SingleValueResponse;
import com.aspose.cloud.cells.model.SparklineGroup;
import com.aspose.cloud.cells.model.SparklineGroupResponse;
import com.aspose.cloud.cells.model.SparklineGroupsResponse;
import com.aspose.cloud.cells.model.SplitResultResponse;
import com.aspose.cloud.cells.model.StorageExist;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.StyleResponse;
import com.aspose.cloud.cells.model.TaskData;
import com.aspose.cloud.cells.model.TextItemsResponse;
import com.aspose.cloud.cells.model.TextWaterMarkerRequest;
import com.aspose.cloud.cells.model.Title;
import com.aspose.cloud.cells.model.TitleResponse;
import com.aspose.cloud.cells.model.Validation;
import com.aspose.cloud.cells.model.ValidationResponse;
import com.aspose.cloud.cells.model.ValidationsResponse;
import com.aspose.cloud.cells.model.VerticalPageBreakResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaksResponse;
import com.aspose.cloud.cells.model.WorkbookEncryptionRequest;
import com.aspose.cloud.cells.model.WorkbookProtectionRequest;
import com.aspose.cloud.cells.model.WorkbookReplaceResponse;
import com.aspose.cloud.cells.model.WorkbookResponse;
import com.aspose.cloud.cells.model.WorkbookSettings;
import com.aspose.cloud.cells.model.WorkbookSettingsResponse;
import com.aspose.cloud.cells.model.Worksheet;
import com.aspose.cloud.cells.model.WorksheetMovingRequest;
import com.aspose.cloud.cells.model.WorksheetReplaceResponse;
import com.aspose.cloud.cells.model.WorksheetResponse;
import com.aspose.cloud.cells.model.WorksheetsResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CellsApi {

  private ApiClient apiClient;

  public CellsApi() {
    this(Configuration.getDefaultApiClient());
  }
  
  public CellsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  public CellsApi( String appSid,String appKey) throws ApiException{
    ApiClient apiClient =new ApiClient();
 		apiClient.setBasePath("https://api.aspose.cloud");
 		setApiClient( apiClient);
    AccessTokenResponse response = oAuthPost("client_credentials", appSid, appKey);
		String accesstoken = response.getAccessToken();
		apiClient.setBasePath("https://api.aspose.cloud/v3.0");
		apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
		setApiClient( apiClient);
  }
  
  public CellsApi(String appSID,String appKey ,String Version) throws ApiException {
    ApiClient apiClient =new ApiClient();
    apiClient.setBasePath("https://api.aspose.cloud");
    String accesstoken = apiClient.getAccessToken("client_credentials", appSID, appKey,Version);
    apiClient.setBasePath("https://api.aspose.cloud/"+Version);
    apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
    setApiClient( apiClient);        
  }
  
    public CellsApi(String appSid, String appKey) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.aspose.cloud");
        apiClient.setApiVersion("v3.0");
        String accesstoken = apiClient.getAccessToken("client_credentials",
                appSid, appKey, "v3.0");
        apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
        setApiClient(apiClient);
    }

    public CellsApi(String appSid, String appKey, String Version)
            throws ApiException {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.aspose.cloud");
        apiClient.setApiVersion(Version);
        String accesstoken = apiClient.getAccessToken("client_credentials",
                appSid, appKey, Version);

        apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
        setApiClient(apiClient);
    }

    public CellsApi(String appSid, String appKey, String Version, String baseURI)
            throws ApiException {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(baseURI.endsWith("/") ? baseURI.substring(0,
                baseURI.length() - 1) : baseURI);
        apiClient.setApiVersion(Version);
        String accesstoken = apiClient.getAccessToken("client_credentials",
                appSid, appKey, Version);
        apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
        setApiClient(apiClient);
    }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  

  /**
   * Removes a date filter.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param fieldIndex  (required)
   * @param dateTimeGroupingType  (required)
   * @param year  (optional, default to 0)
   * @param month  (optional, default to 0)
   * @param day  (optional, default to 0)
   * @param hour  (optional, default to 0)
   * @param minute  (optional, default to 0)
   * @param second  (optional, default to 0)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterDeleteWorksheetDateFilter(String name, String sheetName, Integer fieldIndex, String dateTimeGroupingType, Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterDeleteWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterDeleteWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterDeleteWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'dateTimeGroupingType' is set
    if (dateTimeGroupingType == null) {
      throw new ApiException(400, "Missing the required parameter 'dateTimeGroupingType' when calling cellsAutoFilterDeleteWorksheetDateFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateTimeGroupingType", dateTimeGroupingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "year", year));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hour", hour));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minute", minute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "second", second));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete a filter for a filter column.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param fieldIndex  (required)
   * @param criteria  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterDeleteWorksheetFilter(String name, String sheetName, Integer fieldIndex, String criteria, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterDeleteWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterDeleteWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterDeleteWorksheetFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/filter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria", criteria));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get Auto filter Description
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return AutoFilterResponse
   * @throws ApiException if fails to make API call
   */
  public AutoFilterResponse cellsAutoFilterGetWorksheetAutoFilter(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterGetWorksheetAutoFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterGetWorksheetAutoFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AutoFilterResponse> localVarReturnType = new GenericType<AutoFilterResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPostWorksheetAutoFilterRefresh(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPostWorksheetAutoFilterRefresh");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPostWorksheetAutoFilterRefresh");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/refresh"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Match all blank cell in the list.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param fieldIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPostWorksheetMatchBlanks(String name, String sheetName, Integer fieldIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPostWorksheetMatchBlanks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPostWorksheetMatchBlanks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPostWorksheetMatchBlanks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/matchBlanks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Match all not blank cell in the list.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param fieldIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPostWorksheetMatchNonBlanks(String name, String sheetName, Integer fieldIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPostWorksheetMatchNonBlanks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPostWorksheetMatchNonBlanks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPostWorksheetMatchNonBlanks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/matchNonBlanks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param colorFilter  (optional)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetColorFilter(String name, String sheetName, String range, Integer fieldIndex, ColorFilterRequest colorFilter, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = colorFilter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetColorFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetColorFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetColorFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetColorFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/colorFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Filters a list with a custom criteria.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param operatorType1  (required)
   * @param criteria1  (required)
   * @param isAnd  (optional)
   * @param operatorType2  (optional)
   * @param criteria2  (optional)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetCustomFilter(String name, String sheetName, String range, Integer fieldIndex, String operatorType1, String criteria1, Boolean isAnd, String operatorType2, String criteria2, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'operatorType1' is set
    if (operatorType1 == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorType1' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'criteria1' is set
    if (criteria1 == null) {
      throw new ApiException(400, "Missing the required parameter 'criteria1' when calling cellsAutoFilterPutWorksheetCustomFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/custom"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType1", operatorType1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria1", criteria1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAnd", isAnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType2", operatorType2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria2", criteria2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * add date filter in worksheet 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param dateTimeGroupingType  (required)
   * @param year  (optional, default to 0)
   * @param month  (optional, default to 0)
   * @param day  (optional, default to 0)
   * @param hour  (optional, default to 0)
   * @param minute  (optional, default to 0)
   * @param second  (optional, default to 0)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetDateFilter(String name, String sheetName, String range, Integer fieldIndex, String dateTimeGroupingType, Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetDateFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'dateTimeGroupingType' is set
    if (dateTimeGroupingType == null) {
      throw new ApiException(400, "Missing the required parameter 'dateTimeGroupingType' when calling cellsAutoFilterPutWorksheetDateFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateTimeGroupingType", dateTimeGroupingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "year", year));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "day", day));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hour", hour));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minute", minute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "second", second));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param dynamicFilterType  (required)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetDynamicFilter(String name, String sheetName, String range, Integer fieldIndex, String dynamicFilterType, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetDynamicFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetDynamicFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetDynamicFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetDynamicFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'dynamicFilterType' is set
    if (dynamicFilterType == null) {
      throw new ApiException(400, "Missing the required parameter 'dynamicFilterType' when calling cellsAutoFilterPutWorksheetDynamicFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/dynamicFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dynamicFilterType", dynamicFilterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Adds a filter for a filter column.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param criteria  (required)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetFilter(String name, String sheetName, String range, Integer fieldIndex, String criteria, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'criteria' is set
    if (criteria == null) {
      throw new ApiException(400, "Missing the required parameter 'criteria' when calling cellsAutoFilterPutWorksheetFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/filter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria", criteria));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Filter the top 10 item in the list
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param isTop  (required)
   * @param isPercent  (required)
   * @param itemCount  (required)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetFilterTop10(String name, String sheetName, String range, Integer fieldIndex, Boolean isTop, Boolean isPercent, Integer itemCount, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isTop' is set
    if (isTop == null) {
      throw new ApiException(400, "Missing the required parameter 'isTop' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isPercent' is set
    if (isPercent == null) {
      throw new ApiException(400, "Missing the required parameter 'isPercent' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'itemCount' is set
    if (itemCount == null) {
      throw new ApiException(400, "Missing the required parameter 'itemCount' when calling cellsAutoFilterPutWorksheetFilterTop10");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/filterTop10"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isTop", isTop));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isPercent", isPercent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemCount", itemCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Adds an icon filter.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param range  (required)
   * @param fieldIndex  (required)
   * @param iconSetType  (required)
   * @param iconId  (required)
   * @param matchBlanks  (optional)
   * @param refresh  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsAutoFilterPutWorksheetIconFilter(String name, String sheetName, String range, Integer fieldIndex, String iconSetType, Integer iconId, Boolean matchBlanks, Boolean refresh, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'iconSetType' is set
    if (iconSetType == null) {
      throw new ApiException(400, "Missing the required parameter 'iconSetType' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'iconId' is set
    if (iconId == null) {
      throw new ApiException(400, "Missing the required parameter 'iconId' when calling cellsAutoFilterPutWorksheetIconFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoFilter/iconFilter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "iconSetType", iconSetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "iconId", iconId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", matchBlanks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", refresh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get autoshape info.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param autoshapeNumber The autoshape number. (required)
   * @param format Exported format. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsAutoshapesGetWorksheetAutoshape(String name, String sheetName, Integer autoshapeNumber, String format, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoshapesGetWorksheetAutoshape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoshapesGetWorksheetAutoshape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'autoshapeNumber' is set
    if (autoshapeNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'autoshapeNumber' when calling cellsAutoshapesGetWorksheetAutoshape");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoshapes/{autoshapeNumber}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "autoshapeNumber" + "\\}", apiClient.escapeString(autoshapeNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet autoshapes info.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return AutoShapesResponse
   * @throws ApiException if fails to make API call
   */
  public AutoShapesResponse cellsAutoshapesGetWorksheetAutoshapes(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsAutoshapesGetWorksheetAutoshapes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsAutoshapesGetWorksheetAutoshapes");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autoshapes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AutoShapesResponse> localVarReturnType = new GenericType<AutoShapesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart area info.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ChartAreaResponse
   * @throws ApiException if fails to make API call
   */
  public ChartAreaResponse cellsChartAreaGetChartArea(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartAreaGetChartArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartAreaGetChartArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartAreaGetChartArea");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ChartAreaResponse> localVarReturnType = new GenericType<ChartAreaResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart area border info.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return LineResponse
   * @throws ApiException if fails to make API call
   */
  public LineResponse cellsChartAreaGetChartAreaBorder(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartAreaGetChartAreaBorder");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartAreaGetChartAreaBorder");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartAreaGetChartAreaBorder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/border"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<LineResponse> localVarReturnType = new GenericType<LineResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart area fill format info.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return FillFormatResponse
   * @throws ApiException if fails to make API call
   */
  public FillFormatResponse cellsChartAreaGetChartAreaFillFormat(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartAreaGetChartAreaFillFormat");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartAreaGetChartAreaFillFormat");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartAreaGetChartAreaFillFormat");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/fillFormat"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FillFormatResponse> localVarReturnType = new GenericType<FillFormatResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Hide legend in chart
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsChartsDeleteWorksheetChartLegend(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsDeleteWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsDeleteWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsDeleteWorksheetChartLegend");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Hide title in chart
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsChartsDeleteWorksheetChartTitle(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsDeleteWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsDeleteWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsDeleteWorksheetChartTitle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clear the charts.
   * 
   * @param name Workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsChartsDeleteWorksheetClearCharts(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsDeleteWorksheetClearCharts");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsDeleteWorksheetClearCharts");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet chart by index.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ChartsResponse
   * @throws ApiException if fails to make API call
   */
  public ChartsResponse cellsChartsDeleteWorksheetDeleteChart(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsDeleteWorksheetDeleteChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsDeleteWorksheetDeleteChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsDeleteWorksheetDeleteChart");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ChartsResponse> localVarReturnType = new GenericType<ChartsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart info.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartNumber The chart number. (required)
   * @param format The exported file format. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsChartsGetWorksheetChart(String name, String sheetName, Integer chartNumber, String format, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsGetWorksheetChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsGetWorksheetChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartNumber' is set
    if (chartNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'chartNumber' when calling cellsChartsGetWorksheetChart");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartNumber}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartNumber" + "\\}", apiClient.escapeString(chartNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart legend
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return LegendResponse
   * @throws ApiException if fails to make API call
   */
  public LegendResponse cellsChartsGetWorksheetChartLegend(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsGetWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsGetWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsGetWorksheetChartLegend");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<LegendResponse> localVarReturnType = new GenericType<LegendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get chart title
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return TitleResponse
   * @throws ApiException if fails to make API call
   */
  public TitleResponse cellsChartsGetWorksheetChartTitle(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsGetWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsGetWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsGetWorksheetChartTitle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TitleResponse> localVarReturnType = new GenericType<TitleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet charts info.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ChartsResponse
   * @throws ApiException if fails to make API call
   */
  public ChartsResponse cellsChartsGetWorksheetCharts(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsGetWorksheetCharts");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsGetWorksheetCharts");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ChartsResponse> localVarReturnType = new GenericType<ChartsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update chart propreties
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param chartIndex  (required)
   * @param chart  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsChartsPostWorksheetChart(String name, String sheetName, Integer chartIndex, Chart chart, String folder, String storageName) throws ApiException {
    Object localVarPostBody = chart;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPostWorksheetChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPostWorksheetChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsPostWorksheetChart");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update chart legend
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param legend  (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return LegendResponse
   * @throws ApiException if fails to make API call
   */
  public LegendResponse cellsChartsPostWorksheetChartLegend(String name, String sheetName, Integer chartIndex, Legend legend, String folder, String storageName) throws ApiException {
    Object localVarPostBody = legend;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPostWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPostWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsPostWorksheetChartLegend");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<LegendResponse> localVarReturnType = new GenericType<LegendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update chart title
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param title Chart title (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return TitleResponse
   * @throws ApiException if fails to make API call
   */
  public TitleResponse cellsChartsPostWorksheetChartTitle(String name, String sheetName, Integer chartIndex, Title title, String folder, String storageName) throws ApiException {
    Object localVarPostBody = title;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPostWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPostWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsPostWorksheetChartTitle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TitleResponse> localVarReturnType = new GenericType<TitleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add new chart to worksheet.
   * 
   * @param name Workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param chartType Chart type, please refer property Type in chart resource. (required)
   * @param upperLeftRow New chart upper left row. (optional, default to 0)
   * @param upperLeftColumn New chart upperleft column. (optional, default to 0)
   * @param lowerRightRow New chart lower right row. (optional, default to 0)
   * @param lowerRightColumn New chart lower right column. (optional, default to 0)
   * @param area Specifies values from which to plot the data series.  (optional)
   * @param isVertical Specifies whether to plot the series from a range of cell values by row or by column.  (optional, default to true)
   * @param categoryData Gets or sets the range of category Axis values. It can be a range of cells (such as, \&quot;d1:e10\&quot;).  (optional)
   * @param isAutoGetSerialName Specifies whether auto update serial name.  (optional, default to true)
   * @param title Specifies chart title name. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @param dataLabels  (optional, default to true)
   * @param dataLabelsPosition  (optional, default to Above)
   * @param pivotTableSheet  (optional)
   * @param pivotTableName  (optional)
   * @return ChartsResponse
   * @throws ApiException if fails to make API call
   */
  public ChartsResponse cellsChartsPutWorksheetAddChart(String name, String sheetName, String chartType, Integer upperLeftRow, Integer upperLeftColumn, Integer lowerRightRow, Integer lowerRightColumn, String area, Boolean isVertical, String categoryData, Boolean isAutoGetSerialName, String title, String folder, String storageName, Boolean dataLabels, String dataLabelsPosition, String pivotTableSheet, String pivotTableName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPutWorksheetAddChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPutWorksheetAddChart");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartType' is set
    if (chartType == null) {
      throw new ApiException(400, "Missing the required parameter 'chartType' when calling cellsChartsPutWorksheetAddChart");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "chartType", chartType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", upperLeftRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", upperLeftColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightRow", lowerRightRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightColumn", lowerRightColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "area", area));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isVertical", isVertical));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryData", categoryData));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoGetSerialName", isAutoGetSerialName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataLabels", dataLabels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataLabelsPosition", dataLabelsPosition));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotTableSheet", pivotTableSheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotTableName", pivotTableName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ChartsResponse> localVarReturnType = new GenericType<ChartsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Show legend in chart
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsChartsPutWorksheetChartLegend(String name, String sheetName, Integer chartIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPutWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPutWorksheetChartLegend");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsPutWorksheetChartLegend");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add chart title / Set chart title visible
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param chartIndex The chart index. (required)
   * @param title Chart title. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return TitleResponse
   * @throws ApiException if fails to make API call
   */
  public TitleResponse cellsChartsPutWorksheetChartTitle(String name, String sheetName, Integer chartIndex, Title title, String folder, String storageName) throws ApiException {
    Object localVarPostBody = title;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsChartsPutWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsChartsPutWorksheetChartTitle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'chartIndex' is set
    if (chartIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'chartIndex' when calling cellsChartsPutWorksheetChartTitle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "chartIndex" + "\\}", apiClient.escapeString(chartIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TitleResponse> localVarReturnType = new GenericType<TitleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Remove conditional formatting
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormatting");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Remove cell area from conditional formatting.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param startRow  (required)
   * @param startColumn  (required)
   * @param totalRows  (required)
   * @param totalColumns  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(String name, String sheetName, Integer startRow, Integer startColumn, Integer totalRows, Integer totalColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startRow' is set
    if (startRow == null) {
      throw new ApiException(400, "Missing the required parameter 'startRow' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startColumn' is set
    if (startColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startColumn' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/area"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clear all condition formattings
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattings");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsDeleteWorksheetConditionalFormattings");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get conditional formatting
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return ConditionalFormattingResponse
   * @throws ApiException if fails to make API call
   */
  public ConditionalFormattingResponse cellsConditionalFormattingsGetWorksheetConditionalFormatting(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsGetWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsGetWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsConditionalFormattingsGetWorksheetConditionalFormatting");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConditionalFormattingResponse> localVarReturnType = new GenericType<ConditionalFormattingResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get conditional formattings 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return ConditionalFormattingsResponse
   * @throws ApiException if fails to make API call
   */
  public ConditionalFormattingsResponse cellsConditionalFormattingsGetWorksheetConditionalFormattings(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsGetWorksheetConditionalFormattings");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsGetWorksheetConditionalFormattings");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConditionalFormattingsResponse> localVarReturnType = new GenericType<ConditionalFormattingsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a condition formatting.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param cellArea  (required)
   * @param formatCondition  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsPutWorksheetConditionalFormatting(String name, String sheetName, String cellArea, FormatCondition formatCondition, String folder, String storageName) throws ApiException {
    Object localVarPostBody = formatCondition;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsPutWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsPutWorksheetConditionalFormatting");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellArea' is set
    if (cellArea == null) {
      throw new ApiException(400, "Missing the required parameter 'cellArea' when calling cellsConditionalFormattingsPutWorksheetConditionalFormatting");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellArea", cellArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a format condition.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param cellArea  (required)
   * @param type  (required)
   * @param operatorType  (required)
   * @param formula1  (required)
   * @param formula2  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatCondition(String name, String sheetName, Integer index, String cellArea, String type, String operatorType, String formula1, String formula2, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellArea' is set
    if (cellArea == null) {
      throw new ApiException(400, "Missing the required parameter 'cellArea' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'operatorType' is set
    if (operatorType == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorType' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'formula1' is set
    if (formula1 == null) {
      throw new ApiException(400, "Missing the required parameter 'formula1' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'formula2' is set
    if (formula2 == null) {
      throw new ApiException(400, "Missing the required parameter 'formula2' when calling cellsConditionalFormattingsPutWorksheetFormatCondition");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellArea", cellArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType", operatorType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula1", formula1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula2", formula2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * add a cell area for format condition             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param cellArea  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatConditionArea(String name, String sheetName, Integer index, String cellArea, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellArea' is set
    if (cellArea == null) {
      throw new ApiException(400, "Missing the required parameter 'cellArea' when calling cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/area"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellArea", cellArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a condition for format condition.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param type  (required)
   * @param operatorType  (required)
   * @param formula1  (required)
   * @param formula2  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatConditionCondition(String name, String sheetName, Integer index, String type, String operatorType, String formula1, String formula2, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'operatorType' is set
    if (operatorType == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorType' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'formula1' is set
    if (formula1 == null) {
      throw new ApiException(400, "Missing the required parameter 'formula1' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'formula2' is set
    if (formula2 == null) {
      throw new ApiException(400, "Missing the required parameter 'formula2' when calling cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/condition"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType", operatorType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula1", formula1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula2", formula2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param columnIndex The column index. (required)
   * @param columns The columns. (required)
   * @param updateReference The update reference. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ColumnsResponse
   * @throws ApiException if fails to make API call
   */
  public ColumnsResponse cellsDeleteWorksheetColumns(String name, String sheetName, Integer columnIndex, Integer columns, Boolean updateReference, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsDeleteWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsDeleteWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnIndex' is set
    if (columnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'columnIndex' when calling cellsDeleteWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columns' is set
    if (columns == null) {
      throw new ApiException(400, "Missing the required parameter 'columns' when calling cellsDeleteWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'updateReference' is set
    if (updateReference == null) {
      throw new ApiException(400, "Missing the required parameter 'updateReference' when calling cellsDeleteWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "columnIndex" + "\\}", apiClient.escapeString(columnIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateReference", updateReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ColumnsResponse> localVarReturnType = new GenericType<ColumnsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet row.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet bame. (required)
   * @param rowIndex The row index. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsDeleteWorksheetRow(String name, String sheetName, Integer rowIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsDeleteWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsDeleteWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsDeleteWorksheetRow");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "rowIndex" + "\\}", apiClient.escapeString(rowIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete several worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet bame. (required)
   * @param startrow The begin row index to be operated. (required)
   * @param totalRows Number of rows to be operated. (optional, default to 1)
   * @param updateReference Indicates if update references in other worksheets. (optional, default to true)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsDeleteWorksheetRows(String name, String sheetName, Integer startrow, Integer totalRows, Boolean updateReference, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsDeleteWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsDeleteWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startrow' is set
    if (startrow == null) {
      throw new ApiException(400, "Missing the required parameter 'startrow' when calling cellsDeleteWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startrow", startrow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateReference", updateReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read cell data by cell&#39;s name.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellName The cell&#39;s  name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object cellsGetCellHtmlString(String name, String sheetName, String cellName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetCellHtmlString");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetCellHtmlString");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsGetCellHtmlString");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read cell data by cell&#39;s name.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellOrMethodName The cell&#39;s or method name. (Method name like firstcell, endcell etc.) (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object cellsGetWorksheetCell(String name, String sheetName, String cellOrMethodName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellOrMethodName' is set
    if (cellOrMethodName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellOrMethodName' when calling cellsGetWorksheetCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellOrMethodName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellOrMethodName" + "\\}", apiClient.escapeString(cellOrMethodName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read cell&#39;s style info.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellName Cell&#39;s name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return StyleResponse
   * @throws ApiException if fails to make API call
   */
  public StyleResponse cellsGetWorksheetCellStyle(String name, String sheetName, String cellName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsGetWorksheetCellStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StyleResponse> localVarReturnType = new GenericType<StyleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get cells info.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param offest Begginig offset. (optional, default to 0)
   * @param count Maximum amount of cells in the response. (optional, default to 0)
   * @param folder Document&#39;s folder name. (optional)
   * @param storageName storage name. (optional)
   * @return CellsResponse
   * @throws ApiException if fails to make API call
   */
  public CellsResponse cellsGetWorksheetCells(String name, String sheetName, Integer offest, Integer count, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetCells");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetCells");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offest", offest));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsResponse> localVarReturnType = new GenericType<CellsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet column data by column&#39;s index.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param columnIndex The column index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ColumnResponse
   * @throws ApiException if fails to make API call
   */
  public ColumnResponse cellsGetWorksheetColumn(String name, String sheetName, Integer columnIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetColumn");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetColumn");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnIndex' is set
    if (columnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'columnIndex' when calling cellsGetWorksheetColumn");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "columnIndex" + "\\}", apiClient.escapeString(columnIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ColumnResponse> localVarReturnType = new GenericType<ColumnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet columns info.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder The workdook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ColumnsResponse
   * @throws ApiException if fails to make API call
   */
  public ColumnsResponse cellsGetWorksheetColumns(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ColumnsResponse> localVarReturnType = new GenericType<ColumnsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet row data by row&#39;s index.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param rowIndex The row index. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return RowResponse
   * @throws ApiException if fails to make API call
   */
  public RowResponse cellsGetWorksheetRow(String name, String sheetName, Integer rowIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsGetWorksheetRow");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "rowIndex" + "\\}", apiClient.escapeString(rowIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RowResponse> localVarReturnType = new GenericType<RowResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet rows info.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder The workdook folder. (optional)
   * @param storageName storage name. (optional)
   * @return RowsResponse
   * @throws ApiException if fails to make API call
   */
  public RowsResponse cellsGetWorksheetRows(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsGetWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsGetWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RowsResponse> localVarReturnType = new GenericType<RowsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet hyperlink by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param hyperlinkIndex The hyperlink&#39;s index. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsHypelinksDeleteWorksheetHyperlink(String name, String sheetName, Integer hyperlinkIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksDeleteWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksDeleteWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'hyperlinkIndex' is set
    if (hyperlinkIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'hyperlinkIndex' when calling cellsHypelinksDeleteWorksheetHyperlink");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "hyperlinkIndex" + "\\}", apiClient.escapeString(hyperlinkIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete all hyperlinks in worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsHypelinksDeleteWorksheetHyperlinks(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksDeleteWorksheetHyperlinks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksDeleteWorksheetHyperlinks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet hyperlink by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param hyperlinkIndex The hyperlink&#39;s index. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return HyperlinkResponse
   * @throws ApiException if fails to make API call
   */
  public HyperlinkResponse cellsHypelinksGetWorksheetHyperlink(String name, String sheetName, Integer hyperlinkIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksGetWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksGetWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'hyperlinkIndex' is set
    if (hyperlinkIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'hyperlinkIndex' when calling cellsHypelinksGetWorksheetHyperlink");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "hyperlinkIndex" + "\\}", apiClient.escapeString(hyperlinkIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HyperlinkResponse> localVarReturnType = new GenericType<HyperlinkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet hyperlinks.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return HyperlinksResponse
   * @throws ApiException if fails to make API call
   */
  public HyperlinksResponse cellsHypelinksGetWorksheetHyperlinks(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksGetWorksheetHyperlinks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksGetWorksheetHyperlinks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HyperlinksResponse> localVarReturnType = new GenericType<HyperlinksResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet hyperlink by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param hyperlinkIndex The hyperlink&#39;s index. (required)
   * @param hyperlink Hyperlink object (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return HyperlinkResponse
   * @throws ApiException if fails to make API call
   */
  public HyperlinkResponse cellsHypelinksPostWorksheetHyperlink(String name, String sheetName, Integer hyperlinkIndex, Hyperlink hyperlink, String folder, String storageName) throws ApiException {
    Object localVarPostBody = hyperlink;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksPostWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksPostWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'hyperlinkIndex' is set
    if (hyperlinkIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'hyperlinkIndex' when calling cellsHypelinksPostWorksheetHyperlink");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "hyperlinkIndex" + "\\}", apiClient.escapeString(hyperlinkIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HyperlinkResponse> localVarReturnType = new GenericType<HyperlinkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add worksheet hyperlink.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param firstRow  (required)
   * @param firstColumn  (required)
   * @param totalRows  (required)
   * @param totalColumns  (required)
   * @param address  (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return HyperlinkResponse
   * @throws ApiException if fails to make API call
   */
  public HyperlinkResponse cellsHypelinksPutWorksheetHyperlink(String name, String sheetName, Integer firstRow, Integer firstColumn, Integer totalRows, Integer totalColumns, String address, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstRow' is set
    if (firstRow == null) {
      throw new ApiException(400, "Missing the required parameter 'firstRow' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstColumn' is set
    if (firstColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'firstColumn' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling cellsHypelinksPutWorksheetHyperlink");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/hyperlinks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstRow", firstRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstColumn", firstColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HyperlinkResponse> localVarReturnType = new GenericType<HyperlinkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet list object by index
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param listObjectIndex List object index (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsDeleteWorksheetListObject(String name, String sheetName, Integer listObjectIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsDeleteWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsDeleteWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listObjectIndex' is set
    if (listObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'listObjectIndex' when calling cellsListObjectsDeleteWorksheetListObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listObjectIndex" + "\\}", apiClient.escapeString(listObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet list objects
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsDeleteWorksheetListObjects(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsDeleteWorksheetListObjects");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsDeleteWorksheetListObjects");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet list object info by index.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param listobjectindex list object index. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ListObjectResponse
   * @throws ApiException if fails to make API call
   */
  public ListObjectResponse cellsListObjectsGetWorksheetListObject(String name, String sheetName, Integer listobjectindex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsGetWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsGetWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listobjectindex' is set
    if (listobjectindex == null) {
      throw new ApiException(400, "Missing the required parameter 'listobjectindex' when calling cellsListObjectsGetWorksheetListObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listobjectindex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listobjectindex" + "\\}", apiClient.escapeString(listobjectindex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListObjectResponse> localVarReturnType = new GenericType<ListObjectResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet listobjects info.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ListObjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ListObjectsResponse cellsListObjectsGetWorksheetListObjects(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsGetWorksheetListObjects");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsGetWorksheetListObjects");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListObjectsResponse> localVarReturnType = new GenericType<ListObjectsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update  list object 
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param listObjectIndex list Object index (required)
   * @param listObject listObject dto in request body. (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsPostWorksheetListObject(String name, String sheetName, Integer listObjectIndex, ListObject listObject, String folder, String storageName) throws ApiException {
    Object localVarPostBody = listObject;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsPostWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsPostWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listObjectIndex' is set
    if (listObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'listObjectIndex' when calling cellsListObjectsPostWorksheetListObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listObjectIndex" + "\\}", apiClient.escapeString(listObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param listObjectIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsPostWorksheetListObjectConvertToRange(String name, String sheetName, Integer listObjectIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsPostWorksheetListObjectConvertToRange");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsPostWorksheetListObjectConvertToRange");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listObjectIndex' is set
    if (listObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'listObjectIndex' when calling cellsListObjectsPostWorksheetListObjectConvertToRange");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/ConvertToRange"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listObjectIndex" + "\\}", apiClient.escapeString(listObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param listObjectIndex  (required)
   * @param dataSorter  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsPostWorksheetListObjectSortTable(String name, String sheetName, Integer listObjectIndex, DataSorter dataSorter, String folder, String storageName) throws ApiException {
    Object localVarPostBody = dataSorter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsPostWorksheetListObjectSortTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsPostWorksheetListObjectSortTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listObjectIndex' is set
    if (listObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'listObjectIndex' when calling cellsListObjectsPostWorksheetListObjectSortTable");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/sort"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listObjectIndex" + "\\}", apiClient.escapeString(listObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param listObjectIndex  (required)
   * @param destsheetName  (required)
   * @param request  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(String name, String sheetName, Integer listObjectIndex, String destsheetName, CreatePivotTableRequest request, String folder, String storageName) throws ApiException {
    Object localVarPostBody = request;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'listObjectIndex' is set
    if (listObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'listObjectIndex' when calling cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destsheetName' is set
    if (destsheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'destsheetName' when calling cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/SummarizeWithPivotTable"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "listObjectIndex" + "\\}", apiClient.escapeString(listObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destsheetName", destsheetName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a list object into worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startRow The start row of the list range. (required)
   * @param startColumn The start row of the list range. (required)
   * @param endRow The start row of the list range. (required)
   * @param endColumn The start row of the list range. (required)
   * @param hasHeaders Whether the range has headers. (optional, default to true)
   * @param listObject List Object (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ListObjectResponse
   * @throws ApiException if fails to make API call
   */
  public ListObjectResponse cellsListObjectsPutWorksheetListObject(String name, String sheetName, Integer startRow, Integer startColumn, Integer endRow, Integer endColumn, Boolean hasHeaders, ListObject listObject, String folder, String storageName) throws ApiException {
    Object localVarPostBody = listObject;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsListObjectsPutWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsListObjectsPutWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startRow' is set
    if (startRow == null) {
      throw new ApiException(400, "Missing the required parameter 'startRow' when calling cellsListObjectsPutWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startColumn' is set
    if (startColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startColumn' when calling cellsListObjectsPutWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'endRow' is set
    if (endRow == null) {
      throw new ApiException(400, "Missing the required parameter 'endRow' when calling cellsListObjectsPutWorksheetListObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'endColumn' is set
    if (endColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'endColumn' when calling cellsListObjectsPutWorksheetListObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/listobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endColumn", endColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hasHeaders", hasHeaders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListObjectResponse> localVarReturnType = new GenericType<ListObjectResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete OLE object.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param oleObjectIndex Ole object index (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsOleObjectsDeleteWorksheetOleObject(String name, String sheetName, Integer oleObjectIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsDeleteWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsDeleteWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'oleObjectIndex' is set
    if (oleObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'oleObjectIndex' when calling cellsOleObjectsDeleteWorksheetOleObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "oleObjectIndex" + "\\}", apiClient.escapeString(oleObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete all OLE objects.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsOleObjectsDeleteWorksheetOleObjects(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsDeleteWorksheetOleObjects");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsDeleteWorksheetOleObjects");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get OLE object info.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param objectNumber The object number. (required)
   * @param format The exported object format. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsOleObjectsGetWorksheetOleObject(String name, String sheetName, Integer objectNumber, String format, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsGetWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsGetWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'objectNumber' is set
    if (objectNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'objectNumber' when calling cellsOleObjectsGetWorksheetOleObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects/{objectNumber}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "objectNumber" + "\\}", apiClient.escapeString(objectNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet OLE objects info.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return OleObjectsResponse
   * @throws ApiException if fails to make API call
   */
  public OleObjectsResponse cellsOleObjectsGetWorksheetOleObjects(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsGetWorksheetOleObjects");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsGetWorksheetOleObjects");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OleObjectsResponse> localVarReturnType = new GenericType<OleObjectsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update OLE object.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param oleObjectIndex Ole object index (required)
   * @param ole Ole Object (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsOleObjectsPostUpdateWorksheetOleObject(String name, String sheetName, Integer oleObjectIndex, OleObject ole, String folder, String storageName) throws ApiException {
    Object localVarPostBody = ole;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsPostUpdateWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsPostUpdateWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'oleObjectIndex' is set
    if (oleObjectIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'oleObjectIndex' when calling cellsOleObjectsPostUpdateWorksheetOleObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "oleObjectIndex" + "\\}", apiClient.escapeString(oleObjectIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add OLE object
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param oleObject Ole Object (optional)
   * @param upperLeftRow Upper left row index (optional, default to 0)
   * @param upperLeftColumn Upper left column index (optional, default to 0)
   * @param height Height of oleObject, in unit of pixel (optional, default to 0)
   * @param width Width of oleObject, in unit of pixel (optional, default to 0)
   * @param oleFile OLE filename (optional)
   * @param imageFile Image filename (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return OleObjectResponse
   * @throws ApiException if fails to make API call
   */
  public OleObjectResponse cellsOleObjectsPutWorksheetOleObject(String name, String sheetName, OleObject oleObject, Integer upperLeftRow, Integer upperLeftColumn, Integer height, Integer width, String oleFile, String imageFile, String folder, String storageName) throws ApiException {
    Object localVarPostBody = oleObject;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsOleObjectsPutWorksheetOleObject");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsOleObjectsPutWorksheetOleObject");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/oleobjects"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", upperLeftRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", upperLeftColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oleFile", oleFile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imageFile", imageFile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OleObjectResponse> localVarReturnType = new GenericType<OleObjectResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksDeleteHorizontalPageBreak(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksDeleteHorizontalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksDeleteHorizontalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsPageBreaksDeleteHorizontalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param row  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksDeleteHorizontalPageBreaks(String name, String sheetName, Integer row, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksDeleteHorizontalPageBreaks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksDeleteHorizontalPageBreaks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksDeleteVerticalPageBreak(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksDeleteVerticalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksDeleteVerticalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsPageBreaksDeleteVerticalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param column  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksDeleteVerticalPageBreaks(String name, String sheetName, Integer column, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksDeleteVerticalPageBreaks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksDeleteVerticalPageBreaks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/verticalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return HorizontalPageBreakResponse
   * @throws ApiException if fails to make API call
   */
  public HorizontalPageBreakResponse cellsPageBreaksGetHorizontalPageBreak(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksGetHorizontalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksGetHorizontalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsPageBreaksGetHorizontalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HorizontalPageBreakResponse> localVarReturnType = new GenericType<HorizontalPageBreakResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return HorizontalPageBreaksResponse
   * @throws ApiException if fails to make API call
   */
  public HorizontalPageBreaksResponse cellsPageBreaksGetHorizontalPageBreaks(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksGetHorizontalPageBreaks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksGetHorizontalPageBreaks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HorizontalPageBreaksResponse> localVarReturnType = new GenericType<HorizontalPageBreaksResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param index  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return VerticalPageBreakResponse
   * @throws ApiException if fails to make API call
   */
  public VerticalPageBreakResponse cellsPageBreaksGetVerticalPageBreak(String name, String sheetName, Integer index, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksGetVerticalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksGetVerticalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling cellsPageBreaksGetVerticalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VerticalPageBreakResponse> localVarReturnType = new GenericType<VerticalPageBreakResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return VerticalPageBreaksResponse
   * @throws ApiException if fails to make API call
   */
  public VerticalPageBreaksResponse cellsPageBreaksGetVerticalPageBreaks(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksGetVerticalPageBreaks");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksGetVerticalPageBreaks");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/verticalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VerticalPageBreaksResponse> localVarReturnType = new GenericType<VerticalPageBreaksResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param cellname  (optional)
   * @param row  (optional)
   * @param column  (optional)
   * @param startColumn  (optional)
   * @param endColumn  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksPutHorizontalPageBreak(String name, String sheetName, String cellname, Integer row, Integer column, Integer startColumn, Integer endColumn, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksPutHorizontalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksPutHorizontalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellname", cellname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endColumn", endColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param cellname  (optional)
   * @param column  (optional)
   * @param row  (optional)
   * @param startRow  (optional)
   * @param endRow  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageBreaksPutVerticalPageBreak(String name, String sheetName, String cellname, Integer column, Integer row, Integer startRow, Integer endRow, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageBreaksPutVerticalPageBreak");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageBreaksPutVerticalPageBreak");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/verticalpagebreaks"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellname", cellname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * clear header footer
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageSetupDeleteHeaderFooter(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupDeleteHeaderFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupDeleteHeaderFooter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup/clearheaderfooter"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * get page footer information
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return PageSectionsResponse
   * @throws ApiException if fails to make API call
   */
  public PageSectionsResponse cellsPageSetupGetFooter(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupGetFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupGetFooter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup/footer"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageSectionsResponse> localVarReturnType = new GenericType<PageSectionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * get page header information
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return PageSectionsResponse
   * @throws ApiException if fails to make API call
   */
  public PageSectionsResponse cellsPageSetupGetHeader(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupGetHeader");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupGetHeader");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup/header"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageSectionsResponse> localVarReturnType = new GenericType<PageSectionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get Page Setup information.             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return PageSetupResponse
   * @throws ApiException if fails to make API call
   */
  public PageSetupResponse cellsPageSetupGetPageSetup(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupGetPageSetup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupGetPageSetup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageSetupResponse> localVarReturnType = new GenericType<PageSetupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * update  page footer information 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param section  (required)
   * @param script  (required)
   * @param isFirstPage  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageSetupPostFooter(String name, String sheetName, Integer section, String script, Boolean isFirstPage, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupPostFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupPostFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'section' is set
    if (section == null) {
      throw new ApiException(400, "Missing the required parameter 'section' when calling cellsPageSetupPostFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'script' is set
    if (script == null) {
      throw new ApiException(400, "Missing the required parameter 'script' when calling cellsPageSetupPostFooter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isFirstPage' is set
    if (isFirstPage == null) {
      throw new ApiException(400, "Missing the required parameter 'isFirstPage' when calling cellsPageSetupPostFooter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup/footer"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "section", section));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "script", script));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFirstPage", isFirstPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * update  page header information 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param section  (required)
   * @param script  (required)
   * @param isFirstPage  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageSetupPostHeader(String name, String sheetName, Integer section, String script, Boolean isFirstPage, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupPostHeader");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupPostHeader");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'section' is set
    if (section == null) {
      throw new ApiException(400, "Missing the required parameter 'section' when calling cellsPageSetupPostHeader");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'script' is set
    if (script == null) {
      throw new ApiException(400, "Missing the required parameter 'script' when calling cellsPageSetupPostHeader");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isFirstPage' is set
    if (isFirstPage == null) {
      throw new ApiException(400, "Missing the required parameter 'isFirstPage' when calling cellsPageSetupPostHeader");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup/header"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "section", section));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "script", script));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFirstPage", isFirstPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update Page Setup information.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pageSetup  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPageSetupPostPageSetup(String name, String sheetName, PageSetup pageSetup, String folder, String storageName) throws ApiException {
    Object localVarPostBody = pageSetup;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPageSetupPostPageSetup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPageSetupPostPageSetup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pagesetup"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete a picture object in worksheet
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param pictureIndex Picture index (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPicturesDeleteWorksheetPicture(String name, String sheetName, Integer pictureIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesDeleteWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesDeleteWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pictureIndex' is set
    if (pictureIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pictureIndex' when calling cellsPicturesDeleteWorksheetPicture");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pictureIndex" + "\\}", apiClient.escapeString(pictureIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete all pictures in worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPicturesDeleteWorksheetPictures(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesDeleteWorksheetPictures");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesDeleteWorksheetPictures");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * GRead worksheet picture by number.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param pictureIndex The picture index. (required)
   * @param format The exported object format. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsPicturesGetWorksheetPicture(String name, String sheetName, Integer pictureIndex, String format, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesGetWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesGetWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pictureIndex' is set
    if (pictureIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pictureIndex' when calling cellsPicturesGetWorksheetPicture");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pictureIndex" + "\\}", apiClient.escapeString(pictureIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet pictures.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return PicturesResponse
   * @throws ApiException if fails to make API call
   */
  public PicturesResponse cellsPicturesGetWorksheetPictures(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesGetWorksheetPictures");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesGetWorksheetPictures");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PicturesResponse> localVarReturnType = new GenericType<PicturesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet picture by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param pictureIndex The picture&#39;s index. (required)
   * @param picture Picture object (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return PictureResponse
   * @throws ApiException if fails to make API call
   */
  public PictureResponse cellsPicturesPostWorksheetPicture(String name, String sheetName, Integer pictureIndex, Picture picture, String folder, String storageName) throws ApiException {
    Object localVarPostBody = picture;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesPostWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesPostWorksheetPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pictureIndex' is set
    if (pictureIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pictureIndex' when calling cellsPicturesPostWorksheetPicture");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pictureIndex" + "\\}", apiClient.escapeString(pictureIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PictureResponse> localVarReturnType = new GenericType<PictureResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a new worksheet picture.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worsheet name. (required)
   * @param picture Pictute object (optional)
   * @param upperLeftRow The image upper left row. (optional, default to 0)
   * @param upperLeftColumn The image upper left column. (optional, default to 0)
   * @param lowerRightRow The image low right row. (optional, default to 0)
   * @param lowerRightColumn The image low right column. (optional, default to 0)
   * @param picturePath The picture path, if not provided the picture data is inspected in the request body. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return PicturesResponse
   * @throws ApiException if fails to make API call
   */
  public PicturesResponse cellsPicturesPutWorksheetAddPicture(String name, String sheetName, Picture picture, Integer upperLeftRow, Integer upperLeftColumn, Integer lowerRightRow, Integer lowerRightColumn, String picturePath, String folder, String storageName) throws ApiException {
    Object localVarPostBody = picture;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPicturesPutWorksheetAddPicture");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPicturesPutWorksheetAddPicture");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pictures"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", upperLeftRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", upperLeftColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightRow", lowerRightRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightColumn", lowerRightColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "picturePath", picturePath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PicturesResponse> localVarReturnType = new GenericType<PicturesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete pivot field into into pivot table
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param pivotFieldType The fields area type. (required)
   * @param request Dto that conrains field indexes (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesDeletePivotTableField(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, PivotTableFieldRequest request, String folder, String storageName) throws ApiException {
    Object localVarPostBody = request;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesDeletePivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesDeletePivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesDeletePivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesDeletePivotTableField");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet pivot table by index
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTable(String name, String sheetName, Integer pivotTableIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesDeleteWorksheetPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesDeleteWorksheetPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesDeleteWorksheetPivotTable");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * delete  pivot filter for piovt table             
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param fieldIndex  (required)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTableFilter(String name, String sheetName, Integer pivotTableIndex, Integer fieldIndex, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesDeleteWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesDeleteWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesDeleteWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsPivotTablesDeleteWorksheetPivotTableFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{fieldIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()))
      .replaceAll("\\{" + "fieldIndex" + "\\}", apiClient.escapeString(fieldIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * delete all pivot filters for piovt table
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTableFilters(String name, String sheetName, Integer pivotTableIndex, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesDeleteWorksheetPivotTableFilters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesDeleteWorksheetPivotTableFilters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesDeleteWorksheetPivotTableFilters");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet pivot tables
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTables(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesDeleteWorksheetPivotTables");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesDeleteWorksheetPivotTables");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get pivot field into into pivot table
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param pivotFieldIndex The field index in the base fields. (required)
   * @param pivotFieldType The fields area type. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return PivotFieldResponse
   * @throws ApiException if fails to make API call
   */
  public PivotFieldResponse cellsPivotTablesGetPivotTableField(String name, String sheetName, Integer pivotTableIndex, Integer pivotFieldIndex, String pivotFieldType, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesGetPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesGetPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesGetPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldIndex' is set
    if (pivotFieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldIndex' when calling cellsPivotTablesGetPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesGetPivotTableField");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldIndex", pivotFieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotFieldResponse> localVarReturnType = new GenericType<PivotFieldResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet pivottable info by index.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivottableIndex  (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return PivotTableResponse
   * @throws ApiException if fails to make API call
   */
  public PivotTableResponse cellsPivotTablesGetWorksheetPivotTable(String name, String sheetName, Integer pivottableIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesGetWorksheetPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesGetWorksheetPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivottableIndex' is set
    if (pivottableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivottableIndex' when calling cellsPivotTablesGetWorksheetPivotTable");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivottableIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivottableIndex" + "\\}", apiClient.escapeString(pivottableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotTableResponse> localVarReturnType = new GenericType<PivotTableResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param filterIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return PivotFilterResponse
   * @throws ApiException if fails to make API call
   */
  public PivotFilterResponse cellsPivotTablesGetWorksheetPivotTableFilter(String name, String sheetName, Integer pivotTableIndex, Integer filterIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesGetWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesGetWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesGetWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'filterIndex' is set
    if (filterIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'filterIndex' when calling cellsPivotTablesGetWorksheetPivotTableFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{filterIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()))
      .replaceAll("\\{" + "filterIndex" + "\\}", apiClient.escapeString(filterIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotFilterResponse> localVarReturnType = new GenericType<PivotFilterResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return PivotFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public PivotFiltersResponse cellsPivotTablesGetWorksheetPivotTableFilters(String name, String sheetName, Integer pivotTableIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesGetWorksheetPivotTableFilters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesGetWorksheetPivotTableFilters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesGetWorksheetPivotTableFilters");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotFiltersResponse> localVarReturnType = new GenericType<PivotFiltersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet pivottables info.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return PivotTablesResponse
   * @throws ApiException if fails to make API call
   */
  public PivotTablesResponse cellsPivotTablesGetWorksheetPivotTables(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesGetWorksheetPivotTables");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesGetWorksheetPivotTables");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotTablesResponse> localVarReturnType = new GenericType<PivotTablesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update cell style for pivot table
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param column  (required)
   * @param row  (required)
   * @param style Style dto in request body. (optional)
   * @param needReCalculate  (optional, default to false)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableCellStyle(String name, String sheetName, Integer pivotTableIndex, Integer column, Integer row, Style style, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'column' is set
    if (column == null) {
      throw new ApiException(400, "Missing the required parameter 'column' when calling cellsPivotTablesPostPivotTableCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'row' is set
    if (row == null) {
      throw new ApiException(400, "Missing the required parameter 'row' when calling cellsPivotTablesPostPivotTableCellStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Format"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param pivotFieldType  (required)
   * @param fieldIndex  (required)
   * @param itemIndex  (required)
   * @param isHide  (required)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableFieldHideItem(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, Integer fieldIndex, Integer itemIndex, Boolean isHide, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'itemIndex' is set
    if (itemIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'itemIndex' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isHide' is set
    if (isHide == null) {
      throw new ApiException(400, "Missing the required parameter 'isHide' when calling cellsPivotTablesPostPivotTableFieldHideItem");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Hide"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemIndex", itemIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isHide", isHide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param fieldIndex  (required)
   * @param from  (required)
   * @param to  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableFieldMoveTo(String name, String sheetName, Integer pivotTableIndex, Integer fieldIndex, String from, String to, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'fieldIndex' is set
    if (fieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldIndex' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling cellsPivotTablesPostPivotTableFieldMoveTo");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Move"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", fieldIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update style for pivot table
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param style Style dto in request body. (optional)
   * @param needReCalculate  (optional, default to false)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableStyle(String name, String sheetName, Integer pivotTableIndex, Style style, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/FormatAll"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param pivotFieldIndex  (required)
   * @param pivotFieldType  (required)
   * @param pivotField  (required)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableUpdatePivotField(String name, String sheetName, Integer pivotTableIndex, Integer pivotFieldIndex, String pivotFieldType, PivotField pivotField, Boolean needReCalculate, String folder) throws ApiException {
    Object localVarPostBody = pivotField;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldIndex' is set
    if (pivotFieldIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldIndex' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotField' is set
    if (pivotField == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotField' when calling cellsPivotTablesPostPivotTableUpdatePivotField");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFields/{pivotFieldIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()))
      .replaceAll("\\{" + "pivotFieldIndex" + "\\}", apiClient.escapeString(pivotFieldIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param pivotFieldType  (required)
   * @param pivotField  (required)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostPivotTableUpdatePivotFields(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, PivotField pivotField, Boolean needReCalculate, String folder) throws ApiException {
    Object localVarPostBody = pivotField;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostPivotTableUpdatePivotFields");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostPivotTableUpdatePivotFields");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostPivotTableUpdatePivotFields");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesPostPivotTableUpdatePivotFields");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotField' is set
    if (pivotField == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotField' when calling cellsPivotTablesPostPivotTableUpdatePivotFields");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFields"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Calculates pivottable&#39;s data to cells.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostWorksheetPivotTableCalculate(String name, String sheetName, Integer pivotTableIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostWorksheetPivotTableCalculate");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostWorksheetPivotTableCalculate");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostWorksheetPivotTableCalculate");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Calculate"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param row  (optional)
   * @param column  (optional)
   * @param destCellName  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPostWorksheetPivotTableMove(String name, String sheetName, Integer pivotTableIndex, Integer row, Integer column, String destCellName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPostWorksheetPivotTableMove");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPostWorksheetPivotTableMove");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPostWorksheetPivotTableMove");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Move"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destCellName", destCellName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add pivot field into into pivot table
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param pivotTableIndex Pivot table index (required)
   * @param pivotFieldType The fields area type. (required)
   * @param request Dto that conrains field indexes (optional)
   * @param needReCalculate  (optional, default to false)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPutPivotTableField(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, PivotTableFieldRequest request, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = request;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPutPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPutPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPutPivotTableField");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotFieldType' is set
    if (pivotFieldType == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotFieldType' when calling cellsPivotTablesPutPivotTableField");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotFieldType", pivotFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add a pivot table into worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param request CreatePivotTableRequest dto in request body. (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @param sourceData The data for the new PivotTable cache. (optional)
   * @param destCellName The cell in the upper-left corner of the PivotTable report&#39;s destination range. (optional)
   * @param tableName The name of the new PivotTable report. (optional)
   * @param useSameSource Indicates whether using same data source when another existing pivot table has used this data source. If the property is true, it will save memory. (optional)
   * @return PivotTableResponse
   * @throws ApiException if fails to make API call
   */
  public PivotTableResponse cellsPivotTablesPutWorksheetPivotTable(String name, String sheetName, CreatePivotTableRequest request, String folder, String storageName, String sourceData, String destCellName, String tableName, Boolean useSameSource) throws ApiException {
    Object localVarPostBody = request;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPutWorksheetPivotTable");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPutWorksheetPivotTable");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceData", sourceData));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destCellName", destCellName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tableName", tableName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useSameSource", useSameSource));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PivotTableResponse> localVarReturnType = new GenericType<PivotTableResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add pivot filter for piovt table index
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param pivotTableIndex  (required)
   * @param filter  (optional)
   * @param needReCalculate  (optional, default to false)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPivotTablesPutWorksheetPivotTableFilter(String name, String sheetName, Integer pivotTableIndex, PivotFilter filter, Boolean needReCalculate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = filter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPivotTablesPutWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPivotTablesPutWorksheetPivotTableFilter");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'pivotTableIndex' is set
    if (pivotTableIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'pivotTableIndex' when calling cellsPivotTablesPutWorksheetPivotTableFilter");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "pivotTableIndex" + "\\}", apiClient.escapeString(pivotTableIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needReCalculate", needReCalculate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Cell calculate formula
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param cellName  (required)
   * @param options  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostCellCalculate(String name, String sheetName, String cellName, CalculationOptions options, String folder, String storageName) throws ApiException {
    Object localVarPostBody = options;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostCellCalculate");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostCellCalculate");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsPostCellCalculate");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/calculate"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set cell characters 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param cellName  (required)
   * @param options  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostCellCharacters(String name, String sheetName, String cellName, List<FontSetting> options, String folder, String storageName) throws ApiException {
    Object localVarPostBody = options;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostCellCharacters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostCellCharacters");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsPostCellCharacters");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/characters"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clear cells contents.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param range The range. (optional)
   * @param startRow The start row. (optional)
   * @param startColumn The start column. (optional)
   * @param endRow The end row. (optional)
   * @param endColumn The end column. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostClearContents(String name, String sheetName, String range, Integer startRow, Integer startColumn, Integer endRow, Integer endColumn, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostClearContents");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostClearContents");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/clearcontents"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endColumn", endColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clear cells contents.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param range The range. (optional)
   * @param startRow The start row. (optional)
   * @param startColumn The start column. (optional)
   * @param endRow The end row. (optional)
   * @param endColumn The end column. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostClearFormats(String name, String sheetName, String range, Integer startRow, Integer startColumn, Integer endRow, Integer endColumn, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostClearFormats");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostClearFormats");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/clearformats"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endColumn", endColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set column style
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param columnIndex The column index. (required)
   * @param style Style dto (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostColumnStyle(String name, String sheetName, Integer columnIndex, Style style, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostColumnStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostColumnStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnIndex' is set
    if (columnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'columnIndex' when calling cellsPostColumnStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "columnIndex" + "\\}", apiClient.escapeString(columnIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Copy cell into cell
   * 
   * @param name Workbook name. (required)
   * @param destCellName Destination cell name (required)
   * @param sheetName Destination worksheet name. (required)
   * @param worksheet Source worksheet name. (required)
   * @param cellname Source cell name (optional)
   * @param row Source row (optional)
   * @param column Source column (optional)
   * @param folder Folder name (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostCopyCellIntoCell(String name, String destCellName, String sheetName, String worksheet, String cellname, Integer row, Integer column, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostCopyCellIntoCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destCellName' is set
    if (destCellName == null) {
      throw new ApiException(400, "Missing the required parameter 'destCellName' when calling cellsPostCopyCellIntoCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostCopyCellIntoCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'worksheet' is set
    if (worksheet == null) {
      throw new ApiException(400, "Missing the required parameter 'worksheet' when calling cellsPostCopyCellIntoCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{destCellName}/copy"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "destCellName" + "\\}", apiClient.escapeString(destCellName.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet", worksheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellname", cellname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Copy worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param sourceColumnIndex Source column index (required)
   * @param destinationColumnIndex Destination column index (required)
   * @param columnNumber The copied column number (required)
   * @param worksheet The Worksheet (optional, default to )
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostCopyWorksheetColumns(String name, String sheetName, Integer sourceColumnIndex, Integer destinationColumnIndex, Integer columnNumber, String worksheet, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostCopyWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostCopyWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sourceColumnIndex' is set
    if (sourceColumnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceColumnIndex' when calling cellsPostCopyWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destinationColumnIndex' is set
    if (destinationColumnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationColumnIndex' when calling cellsPostCopyWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnNumber' is set
    if (columnNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'columnNumber' when calling cellsPostCopyWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/copy"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceColumnIndex", sourceColumnIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationColumnIndex", destinationColumnIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "columnNumber", columnNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet", worksheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Copy worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param sourceRowIndex Source row index (required)
   * @param destinationRowIndex Destination row index (required)
   * @param rowNumber The copied row number (required)
   * @param worksheet worksheet (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostCopyWorksheetRows(String name, String sheetName, Integer sourceRowIndex, Integer destinationRowIndex, Integer rowNumber, String worksheet, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostCopyWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostCopyWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sourceRowIndex' is set
    if (sourceRowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceRowIndex' when calling cellsPostCopyWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destinationRowIndex' is set
    if (destinationRowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationRowIndex' when calling cellsPostCopyWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowNumber' is set
    if (rowNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'rowNumber' when calling cellsPostCopyWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/copy"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceRowIndex", sourceRowIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationRowIndex", destinationRowIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rowNumber", rowNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet", worksheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Group worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param firstIndex The first column index to be operated. (required)
   * @param lastIndex The last column index to be operated. (required)
   * @param hide columns visible state (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostGroupWorksheetColumns(String name, String sheetName, Integer firstIndex, Integer lastIndex, Boolean hide, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostGroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostGroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstIndex' is set
    if (firstIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'firstIndex' when calling cellsPostGroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastIndex' is set
    if (lastIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'lastIndex' when calling cellsPostGroupWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/group"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstIndex", firstIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastIndex", lastIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hide", hide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Group worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param firstIndex The first row index to be operated. (required)
   * @param lastIndex The last row index to be operated. (required)
   * @param hide rows visible state (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostGroupWorksheetRows(String name, String sheetName, Integer firstIndex, Integer lastIndex, Boolean hide, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostGroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostGroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstIndex' is set
    if (firstIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'firstIndex' when calling cellsPostGroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastIndex' is set
    if (lastIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'lastIndex' when calling cellsPostGroupWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/group"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstIndex", firstIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastIndex", lastIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hide", hide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Hide worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startColumn The begin column index to be operated. (required)
   * @param totalColumns Number of columns to be operated. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostHideWorksheetColumns(String name, String sheetName, Integer startColumn, Integer totalColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostHideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostHideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startColumn' is set
    if (startColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startColumn' when calling cellsPostHideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsPostHideWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/hide"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Hide worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startrow The begin row index to be operated. (required)
   * @param totalRows Number of rows to be operated. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostHideWorksheetRows(String name, String sheetName, Integer startrow, Integer totalRows, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostHideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostHideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startrow' is set
    if (startrow == null) {
      throw new ApiException(400, "Missing the required parameter 'startrow' when calling cellsPostHideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsPostHideWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/hide"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startrow", startrow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set row style.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param rowIndex The row index. (required)
   * @param style Style dto (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostRowStyle(String name, String sheetName, Integer rowIndex, Style style, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostRowStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostRowStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsPostRowStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "rowIndex" + "\\}", apiClient.escapeString(rowIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set htmlstring value into cell
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellName The cell name. (required)
   * @param htmlString  (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellResponse
   * @throws ApiException if fails to make API call
   */
  public CellResponse cellsPostSetCellHtmlString(String name, String sheetName, String cellName, byte[] htmlString, String folder, String storageName) throws ApiException {
    Object localVarPostBody = htmlString;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostSetCellHtmlString");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostSetCellHtmlString");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsPostSetCellHtmlString");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'htmlString' is set
    if (htmlString == null) {
      throw new ApiException(400, "Missing the required parameter 'htmlString' when calling cellsPostSetCellHtmlString");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellResponse> localVarReturnType = new GenericType<CellResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set cell range value 
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellarea Cell area (like \&quot;A1:C2\&quot;) (required)
   * @param value Range value (required)
   * @param type Value data type (like \&quot;int\&quot;) (required)
   * @param folder Folder name (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostSetCellRangeValue(String name, String sheetName, String cellarea, String value, String type, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostSetCellRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostSetCellRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellarea' is set
    if (cellarea == null) {
      throw new ApiException(400, "Missing the required parameter 'cellarea' when calling cellsPostSetCellRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling cellsPostSetCellRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling cellsPostSetCellRangeValue");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellarea", cellarea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set worksheet column width.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param columnIndex The column index. (required)
   * @param width The width. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ColumnResponse
   * @throws ApiException if fails to make API call
   */
  public ColumnResponse cellsPostSetWorksheetColumnWidth(String name, String sheetName, Integer columnIndex, Double width, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostSetWorksheetColumnWidth");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostSetWorksheetColumnWidth");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnIndex' is set
    if (columnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'columnIndex' when calling cellsPostSetWorksheetColumnWidth");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling cellsPostSetWorksheetColumnWidth");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "columnIndex" + "\\}", apiClient.escapeString(columnIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ColumnResponse> localVarReturnType = new GenericType<ColumnResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Ungroup worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param firstIndex The first column index to be operated. (required)
   * @param lastIndex The last column index to be operated. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostUngroupWorksheetColumns(String name, String sheetName, Integer firstIndex, Integer lastIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUngroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUngroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstIndex' is set
    if (firstIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'firstIndex' when calling cellsPostUngroupWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastIndex' is set
    if (lastIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'lastIndex' when calling cellsPostUngroupWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/ungroup"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstIndex", firstIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastIndex", lastIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Ungroup worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param firstIndex The first row index to be operated. (required)
   * @param lastIndex The last row index to be operated. (required)
   * @param isAll Is all row to be operated (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostUngroupWorksheetRows(String name, String sheetName, Integer firstIndex, Integer lastIndex, Boolean isAll, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUngroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUngroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstIndex' is set
    if (firstIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'firstIndex' when calling cellsPostUngroupWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastIndex' is set
    if (lastIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'lastIndex' when calling cellsPostUngroupWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/ungroup"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstIndex", firstIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastIndex", lastIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAll", isAll));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unhide worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startcolumn The begin column index to be operated. (required)
   * @param totalColumns Number of columns to be operated. (required)
   * @param width The new column width. (optional, default to 50.0)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostUnhideWorksheetColumns(String name, String sheetName, Integer startcolumn, Integer totalColumns, Double width, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUnhideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUnhideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startcolumn' is set
    if (startcolumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startcolumn' when calling cellsPostUnhideWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsPostUnhideWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/unhide"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startcolumn", startcolumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unhide worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startrow The begin row index to be operated. (required)
   * @param totalRows Number of rows to be operated. (required)
   * @param height The new row height. (optional, default to 15.0)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostUnhideWorksheetRows(String name, String sheetName, Integer startrow, Integer totalRows, Double height, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUnhideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUnhideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startrow' is set
    if (startrow == null) {
      throw new ApiException(400, "Missing the required parameter 'startrow' when calling cellsPostUnhideWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsPostUnhideWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/unhide"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startrow", startrow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update cell&#39;s style.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param cellName The cell name. (required)
   * @param style with update style settings. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return StyleResponse
   * @throws ApiException if fails to make API call
   */
  public StyleResponse cellsPostUpdateWorksheetCellStyle(String name, String sheetName, String cellName, Style style, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUpdateWorksheetCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUpdateWorksheetCellStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsPostUpdateWorksheetCellStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StyleResponse> localVarReturnType = new GenericType<StyleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update cell&#39;s range style.
   * 
   * @param name Workbook name. (required)
   * @param sheetName Worksheet name. (required)
   * @param range The range. (required)
   * @param style with update style settings. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostUpdateWorksheetRangeStyle(String name, String sheetName, String range, Style style, String folder, String storageName) throws ApiException {
    Object localVarPostBody = style;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUpdateWorksheetRangeStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUpdateWorksheetRangeStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'range' is set
    if (range == null) {
      throw new ApiException(400, "Missing the required parameter 'range' when calling cellsPostUpdateWorksheetRangeStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet row.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param rowIndex The row index. (required)
   * @param height The new row height. (optional, default to 0.0)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return RowResponse
   * @throws ApiException if fails to make API call
   */
  public RowResponse cellsPostUpdateWorksheetRow(String name, String sheetName, Integer rowIndex, Double height, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostUpdateWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostUpdateWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsPostUpdateWorksheetRow");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "rowIndex" + "\\}", apiClient.escapeString(rowIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RowResponse> localVarReturnType = new GenericType<RowResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set cell value.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellName The cell name. (required)
   * @param value The cell value. (optional)
   * @param type The value type. (optional)
   * @param formula Formula for cell (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellResponse
   * @throws ApiException if fails to make API call
   */
  public CellResponse cellsPostWorksheetCellSetValue(String name, String sheetName, String cellName, String value, String type, String formula, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostWorksheetCellSetValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostWorksheetCellSetValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsPostWorksheetCellSetValue");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/{cellName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula", formula));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellResponse> localVarReturnType = new GenericType<CellResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Merge cells.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startRow The start row. (required)
   * @param startColumn The start column. (required)
   * @param totalRows The total rows (required)
   * @param totalColumns The total columns. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostWorksheetMerge(String name, String sheetName, Integer startRow, Integer startColumn, Integer totalRows, Integer totalColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostWorksheetMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostWorksheetMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startRow' is set
    if (startRow == null) {
      throw new ApiException(400, "Missing the required parameter 'startRow' when calling cellsPostWorksheetMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startColumn' is set
    if (startColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startColumn' when calling cellsPostWorksheetMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsPostWorksheetMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsPostWorksheetMerge");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/merge"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unmerge cells.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startRow The start row. (required)
   * @param startColumn The start column. (required)
   * @param totalRows The total rows (required)
   * @param totalColumns The total columns. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPostWorksheetUnmerge(String name, String sheetName, Integer startRow, Integer startColumn, Integer totalRows, Integer totalColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPostWorksheetUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPostWorksheetUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startRow' is set
    if (startRow == null) {
      throw new ApiException(400, "Missing the required parameter 'startRow' when calling cellsPostWorksheetUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startColumn' is set
    if (startColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'startColumn' when calling cellsPostWorksheetUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalRows' is set
    if (totalRows == null) {
      throw new ApiException(400, "Missing the required parameter 'totalRows' when calling cellsPostWorksheetUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'totalColumns' is set
    if (totalColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'totalColumns' when calling cellsPostWorksheetUnmerge");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/unmerge"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", startColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", totalColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete all custom document properties and clean built-in ones.
   * 
   * @param name The document name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsDocumentPropertiesResponse
   * @throws ApiException if fails to make API call
   */
  public CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperties(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPropertiesDeleteDocumentProperties");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/documentproperties"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsDocumentPropertiesResponse> localVarReturnType = new GenericType<CellsDocumentPropertiesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete document property.
   * 
   * @param name The document name. (required)
   * @param propertyName The property name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsDocumentPropertiesResponse
   * @throws ApiException if fails to make API call
   */
  public CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperty(String name, String propertyName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPropertiesDeleteDocumentProperty");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling cellsPropertiesDeleteDocumentProperty");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsDocumentPropertiesResponse> localVarReturnType = new GenericType<CellsDocumentPropertiesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read document properties.
   * 
   * @param name The document name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsDocumentPropertiesResponse
   * @throws ApiException if fails to make API call
   */
  public CellsDocumentPropertiesResponse cellsPropertiesGetDocumentProperties(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPropertiesGetDocumentProperties");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/documentproperties"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsDocumentPropertiesResponse> localVarReturnType = new GenericType<CellsDocumentPropertiesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read document property by name.
   * 
   * @param name The document name. (required)
   * @param propertyName The property name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsDocumentPropertyResponse
   * @throws ApiException if fails to make API call
   */
  public CellsDocumentPropertyResponse cellsPropertiesGetDocumentProperty(String name, String propertyName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPropertiesGetDocumentProperty");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling cellsPropertiesGetDocumentProperty");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsDocumentPropertyResponse> localVarReturnType = new GenericType<CellsDocumentPropertyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set/create document property.
   * 
   * @param name The document name. (required)
   * @param propertyName The property name. (required)
   * @param property with new property value. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsDocumentPropertyResponse
   * @throws ApiException if fails to make API call
   */
  public CellsDocumentPropertyResponse cellsPropertiesPutDocumentProperty(String name, String propertyName, CellsDocumentProperty property, String folder, String storageName) throws ApiException {
    Object localVarPostBody = property;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPropertiesPutDocumentProperty");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling cellsPropertiesPutDocumentProperty");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/documentproperties/{propertyName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsDocumentPropertyResponse> localVarReturnType = new GenericType<CellsDocumentPropertyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Insert worksheet columns.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param columnIndex The column index. (required)
   * @param columns The columns. (required)
   * @param updateReference The update reference. (optional, default to true)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return ColumnsResponse
   * @throws ApiException if fails to make API call
   */
  public ColumnsResponse cellsPutInsertWorksheetColumns(String name, String sheetName, Integer columnIndex, Integer columns, Boolean updateReference, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPutInsertWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPutInsertWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columnIndex' is set
    if (columnIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'columnIndex' when calling cellsPutInsertWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'columns' is set
    if (columns == null) {
      throw new ApiException(400, "Missing the required parameter 'columns' when calling cellsPutInsertWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "columnIndex" + "\\}", apiClient.escapeString(columnIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateReference", updateReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ColumnsResponse> localVarReturnType = new GenericType<ColumnsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Insert new worksheet row.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param rowIndex The new row index. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return RowResponse
   * @throws ApiException if fails to make API call
   */
  public RowResponse cellsPutInsertWorksheetRow(String name, String sheetName, Integer rowIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPutInsertWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPutInsertWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsPutInsertWorksheetRow");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "rowIndex" + "\\}", apiClient.escapeString(rowIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RowResponse> localVarReturnType = new GenericType<RowResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Insert several new worksheet rows.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param startrow The begin row index to be operated. (required)
   * @param totalRows Number of rows to be operated. (optional, default to 1)
   * @param updateReference Indicates if update references in other worksheets. (optional, default to true)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsPutInsertWorksheetRows(String name, String sheetName, Integer startrow, Integer totalRows, Boolean updateReference, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsPutInsertWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsPutInsertWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'startrow' is set
    if (startrow == null) {
      throw new ApiException(400, "Missing the required parameter 'startrow' when calling cellsPutInsertWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startrow", startrow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", totalRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateReference", updateReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get cells list in a range by range name or row column indexes  
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param namerange range name, for example: &#39;A1:B2&#39; or &#39;range_name1&#39; (optional)
   * @param firstRow the first row of the range (optional)
   * @param firstColumn the first column of the range (optional)
   * @param rowCount the count of rows in the range (optional)
   * @param columnCount the count of columns in the range (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return RangeValueResponse
   * @throws ApiException if fails to make API call
   */
  public RangeValueResponse cellsRangesGetWorksheetCellsRangeValue(String name, String sheetName, String namerange, Integer firstRow, Integer firstColumn, Integer rowCount, Integer columnCount, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesGetWorksheetCellsRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesGetWorksheetCellsRangeValue");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/value"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "namerange", namerange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstRow", firstRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstColumn", firstColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rowCount", rowCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "columnCount", columnCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RangeValueResponse> localVarReturnType = new GenericType<RangeValueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set column width of range
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param value  (required)
   * @param range  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeColumnWidth(String name, String sheetName, Double value, Range range, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeColumnWidth");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeColumnWidth");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling cellsRangesPostWorksheetCellsRangeColumnWidth");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/columnWidth"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Combines a range of cells into a single cell.              
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param range range in worksheet  (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeMerge(String name, String sheetName, Range range, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeMerge");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/merge"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Move the current range to the dest range.             
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param destRow The start row of the dest range. (required)
   * @param destColumn The start column of the dest range. (required)
   * @param range range in worksheet  (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeMoveTo(String name, String sheetName, Integer destRow, Integer destColumn, Range range, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destRow' is set
    if (destRow == null) {
      throw new ApiException(400, "Missing the required parameter 'destRow' when calling cellsRangesPostWorksheetCellsRangeMoveTo");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destColumn' is set
    if (destColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'destColumn' when calling cellsRangesPostWorksheetCellsRangeMoveTo");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/moveto"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destRow", destRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destColumn", destColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Sets outline border around a range of cells.
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param rangeOperate Range Set OutlineBorder Request  (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeOutlineBorder(String name, String sheetName, RangeSetOutlineBorderRequest rangeOperate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = rangeOperate;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeOutlineBorder");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeOutlineBorder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/outlineBorder"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * set row height of range
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param value  (required)
   * @param range  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeRowHeight(String name, String sheetName, Double value, Range range, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeRowHeight");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeRowHeight");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling cellsRangesPostWorksheetCellsRangeRowHeight");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/rowHeight"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Sets the style of the range.             
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param rangeOperate Range Set Style Request  (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeStyle(String name, String sheetName, RangeSetStyleRequest rangeOperate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = rangeOperate;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeStyle");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/style"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unmerges merged cells of this range.             
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param range range in worksheet  (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeUnmerge(String name, String sheetName, Range range, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeUnmerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeUnmerge");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/unmerge"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param value Input value (required)
   * @param range range in worksheet  (optional)
   * @param isConverted True: converted to other data type if appropriate. (optional, default to false)
   * @param setStyle True: set the number format to cell&#39;s style when converting to other data type (optional, default to false)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRangeValue(String name, String sheetName, String value, Range range, Boolean isConverted, Boolean setStyle, String folder, String storageName) throws ApiException {
    Object localVarPostBody = range;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRangeValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling cellsRangesPostWorksheetCellsRangeValue");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges/value"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isConverted", isConverted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "setStyle", setStyle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * copy range in the worksheet
   * 
   * @param name workbook name (required)
   * @param sheetName worksheet name (required)
   * @param rangeOperate copydata,copystyle,copyto,copyvalue (optional)
   * @param folder Workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsRangesPostWorksheetCellsRanges(String name, String sheetName, RangeCopyRequest rangeOperate, String folder, String storageName) throws ApiException {
    Object localVarPostBody = rangeOperate;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsRangesPostWorksheetCellsRanges");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsRangesPostWorksheetCellsRanges");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/ranges"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Convert document and save result to storage.
   * 
   * @param name The document name. (required)
   * @param saveOptions Save options. (optional)
   * @param newfilename The new file name. (optional)
   * @param isAutoFitRows Autofit rows. (optional, default to false)
   * @param isAutoFitColumns Autofit columns. (optional, default to false)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return SaveResponse
   * @throws ApiException if fails to make API call
   */
  public SaveResponse cellsSaveAsPostDocumentSaveAs(String name, SaveOptions saveOptions, String newfilename, Boolean isAutoFitRows, Boolean isAutoFitColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = saveOptions;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSaveAsPostDocumentSaveAs");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/SaveAs"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newfilename", newfilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoFitRows", isAutoFitRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoFitColumns", isAutoFitColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SaveResponse> localVarReturnType = new GenericType<SaveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete a shape in worksheet
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param shapeindex shape index in worksheet shapes. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsShapesDeleteWorksheetShape(String name, String sheetName, Integer shapeindex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesDeleteWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesDeleteWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'shapeindex' is set
    if (shapeindex == null) {
      throw new ApiException(400, "Missing the required parameter 'shapeindex' when calling cellsShapesDeleteWorksheetShape");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes/{shapeindex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "shapeindex" + "\\}", apiClient.escapeString(shapeindex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * delete all shapes in worksheet
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsShapesDeleteWorksheetShapes(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesDeleteWorksheetShapes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesDeleteWorksheetShapes");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet shape
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param shapeindex shape index in worksheet shapes. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ShapeResponse
   * @throws ApiException if fails to make API call
   */
  public ShapeResponse cellsShapesGetWorksheetShape(String name, String sheetName, Integer shapeindex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesGetWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesGetWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'shapeindex' is set
    if (shapeindex == null) {
      throw new ApiException(400, "Missing the required parameter 'shapeindex' when calling cellsShapesGetWorksheetShape");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes/{shapeindex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "shapeindex" + "\\}", apiClient.escapeString(shapeindex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ShapeResponse> localVarReturnType = new GenericType<ShapeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet shapes 
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ShapesResponse
   * @throws ApiException if fails to make API call
   */
  public ShapesResponse cellsShapesGetWorksheetShapes(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesGetWorksheetShapes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesGetWorksheetShapes");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ShapesResponse> localVarReturnType = new GenericType<ShapesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update a shape in worksheet
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param shapeindex shape index in worksheet shapes. (required)
   * @param dto  (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsShapesPostWorksheetShape(String name, String sheetName, Integer shapeindex, Shape dto, String folder, String storageName) throws ApiException {
    Object localVarPostBody = dto;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesPostWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesPostWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'shapeindex' is set
    if (shapeindex == null) {
      throw new ApiException(400, "Missing the required parameter 'shapeindex' when calling cellsShapesPostWorksheetShape");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes/{shapeindex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "shapeindex" + "\\}", apiClient.escapeString(shapeindex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add shape in worksheet
   * 
   * @param name document name. (required)
   * @param sheetName worksheet name. (required)
   * @param shapeDTO  (optional)
   * @param drawingType shape object type (optional)
   * @param upperLeftRow Upper left row index. (optional)
   * @param upperLeftColumn Upper left column index. (optional)
   * @param top Represents the vertical offset of Spinner from its left row, in unit of pixel. (optional)
   * @param left Represents the horizontal offset of Spinner from its left column, in unit of pixel. (optional)
   * @param width Represents the height of Spinner, in unit of pixel. (optional)
   * @param height Represents the width of Spinner, in unit of pixel. (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ShapeResponse
   * @throws ApiException if fails to make API call
   */
  public ShapeResponse cellsShapesPutWorksheetShape(String name, String sheetName, Shape shapeDTO, String drawingType, Integer upperLeftRow, Integer upperLeftColumn, Integer top, Integer left, Integer width, Integer height, String folder, String storageName) throws ApiException {
    Object localVarPostBody = shapeDTO;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsShapesPutWorksheetShape");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsShapesPutWorksheetShape");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/shapes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DrawingType", drawingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", upperLeftRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", upperLeftColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "left", left));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ShapeResponse> localVarReturnType = new GenericType<ShapeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param sparklineGroupIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsSparklineGroupsDeleteWorksheetSparklineGroup(String name, String sheetName, Integer sparklineGroupIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsDeleteWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsDeleteWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sparklineGroupIndex' is set
    if (sparklineGroupIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'sparklineGroupIndex' when calling cellsSparklineGroupsDeleteWorksheetSparklineGroup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups/{sparklineGroupIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "sparklineGroupIndex" + "\\}", apiClient.escapeString(sparklineGroupIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsSparklineGroupsDeleteWorksheetSparklineGroups(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsDeleteWorksheetSparklineGroups");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsDeleteWorksheetSparklineGroups");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param sparklineGroupIndex  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return SparklineGroupResponse
   * @throws ApiException if fails to make API call
   */
  public SparklineGroupResponse cellsSparklineGroupsGetWorksheetSparklineGroup(String name, String sheetName, Integer sparklineGroupIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsGetWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsGetWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sparklineGroupIndex' is set
    if (sparklineGroupIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'sparklineGroupIndex' when calling cellsSparklineGroupsGetWorksheetSparklineGroup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups/{sparklineGroupIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "sparklineGroupIndex" + "\\}", apiClient.escapeString(sparklineGroupIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SparklineGroupResponse> localVarReturnType = new GenericType<SparklineGroupResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet charts description.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return SparklineGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public SparklineGroupsResponse cellsSparklineGroupsGetWorksheetSparklineGroups(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsGetWorksheetSparklineGroups");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsGetWorksheetSparklineGroups");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SparklineGroupsResponse> localVarReturnType = new GenericType<SparklineGroupsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param sparklineGroupIndex  (required)
   * @param sparklineGroup  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsSparklineGroupsPostWorksheetSparklineGroup(String name, String sheetName, Integer sparklineGroupIndex, SparklineGroup sparklineGroup, String folder, String storageName) throws ApiException {
    Object localVarPostBody = sparklineGroup;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsPostWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsPostWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sparklineGroupIndex' is set
    if (sparklineGroupIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'sparklineGroupIndex' when calling cellsSparklineGroupsPostWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sparklineGroup' is set
    if (sparklineGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'sparklineGroup' when calling cellsSparklineGroupsPostWorksheetSparklineGroup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups/{sparklineGroupIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "sparklineGroupIndex" + "\\}", apiClient.escapeString(sparklineGroupIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param type  (required)
   * @param dataRange  (required)
   * @param isVertical  (required)
   * @param locationRange  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsSparklineGroupsPutWorksheetSparklineGroup(String name, String sheetName, String type, String dataRange, Boolean isVertical, String locationRange, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'dataRange' is set
    if (dataRange == null) {
      throw new ApiException(400, "Missing the required parameter 'dataRange' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isVertical' is set
    if (isVertical == null) {
      throw new ApiException(400, "Missing the required parameter 'isVertical' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'locationRange' is set
    if (locationRange == null) {
      throw new ApiException(400, "Missing the required parameter 'locationRange' when calling cellsSparklineGroupsPutWorksheetSparklineGroup");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sparklinegroups"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataRange", dataRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isVertical", isVertical));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationRange", locationRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Run tasks  
   * 
   * @param taskData  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object cellsTaskPostRunTask(TaskData taskData) throws ApiException {
    Object localVarPostBody = taskData;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'taskData' is set
    if (taskData == null) {
      throw new ApiException(400, "Missing the required parameter 'taskData' when calling cellsTaskPostRunTask");
    }
    
    // create path and map variables
    String localVarPath = "/cells/task/runtask";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Decrypt document.
   * 
   * @param name The document name. (required)
   * @param encryption Encryption settings, only password can be specified. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteDecryptDocument(String name, WorkbookEncryptionRequest encryption, String folder, String storageName) throws ApiException {
    Object localVarPostBody = encryption;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteDecryptDocument");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/encryption"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unprotect document from changes.
   * 
   * @param name The document name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteDocumentUnprotectFromChanges(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteDocumentUnprotectFromChanges");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/writeProtection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unprotect document.
   * 
   * @param name The document name. (required)
   * @param protection Protection settings, only password can be specified. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteUnprotectDocument(String name, WorkbookProtectionRequest protection, String folder, String storageName) throws ApiException {
    Object localVarPostBody = protection;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteUnprotectDocument");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/protection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set worksheet background image.
   * 
   * @param name  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteWorkbookBackground(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteWorkbookBackground");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/background"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clean workbook&#39;s names.
   * 
   * @param name The workbook name. (required)
   * @param nameName The name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteWorkbookName(String name, String nameName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteWorkbookName");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'nameName' is set
    if (nameName == null) {
      throw new ApiException(400, "Missing the required parameter 'nameName' when calling cellsWorkbookDeleteWorkbookName");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/names/{nameName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "nameName" + "\\}", apiClient.escapeString(nameName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clean workbook&#39;s names.
   * 
   * @param name The workbook name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookDeleteWorkbookNames(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookDeleteWorkbookNames");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/names"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read workbook info or export.
   * 
   * @param name The document name. (required)
   * @param password The document password. (optional)
   * @param format The exported file format. (optional)
   * @param isAutoFit Set document rows to be autofit. (optional, default to false)
   * @param onlySaveTable Only save table data. (optional, default to false)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @param outPath The document output folder. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsWorkbookGetWorkbook(String name, String password, String format, Boolean isAutoFit, Boolean onlySaveTable, String folder, String storageName, String outPath) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbook");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoFit", isAutoFit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaveTable", onlySaveTable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", outPath));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read workbook default style info.
   * 
   * @param name The workbook name. (required)
   * @param folder The document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return StyleResponse
   * @throws ApiException if fails to make API call
   */
  public StyleResponse cellsWorkbookGetWorkbookDefaultStyle(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookDefaultStyle");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/defaultstyle"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StyleResponse> localVarReturnType = new GenericType<StyleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read workbook&#39;s name.
   * 
   * @param name The workbook name. (required)
   * @param nameName The name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return NameResponse
   * @throws ApiException if fails to make API call
   */
  public NameResponse cellsWorkbookGetWorkbookName(String name, String nameName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookName");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'nameName' is set
    if (nameName == null) {
      throw new ApiException(400, "Missing the required parameter 'nameName' when calling cellsWorkbookGetWorkbookName");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/names/{nameName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "nameName" + "\\}", apiClient.escapeString(nameName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<NameResponse> localVarReturnType = new GenericType<NameResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get workbook&#39;s name value.
   * 
   * @param name The workbook name. (required)
   * @param nameName The name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return RangeValueResponse
   * @throws ApiException if fails to make API call
   */
  public RangeValueResponse cellsWorkbookGetWorkbookNameValue(String name, String nameName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookNameValue");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'nameName' is set
    if (nameName == null) {
      throw new ApiException(400, "Missing the required parameter 'nameName' when calling cellsWorkbookGetWorkbookNameValue");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/names/{nameName}/value"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "nameName" + "\\}", apiClient.escapeString(nameName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RangeValueResponse> localVarReturnType = new GenericType<RangeValueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read workbook&#39;s names.
   * 
   * @param name The workbook name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return NamesResponse
   * @throws ApiException if fails to make API call
   */
  public NamesResponse cellsWorkbookGetWorkbookNames(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookNames");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/names"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<NamesResponse> localVarReturnType = new GenericType<NamesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get Workbook Settings DTO
   * 
   * @param name Document name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorkbookSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public WorkbookSettingsResponse cellsWorkbookGetWorkbookSettings(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookSettings");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/settings"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorkbookSettingsResponse> localVarReturnType = new GenericType<WorkbookSettingsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read workbook&#39;s text items.
   * 
   * @param name The workbook name. (required)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return TextItemsResponse
   * @throws ApiException if fails to make API call
   */
  public TextItemsResponse cellsWorkbookGetWorkbookTextItems(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookGetWorkbookTextItems");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/textItems"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TextItemsResponse> localVarReturnType = new GenericType<TextItemsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Autofit workbook rows.
   * 
   * @param name Document name. (required)
   * @param autoFitterOptions Auto Fitter Options. (optional)
   * @param startRow Start row. (optional)
   * @param endRow End row. (optional)
   * @param onlyAuto Only auto. (optional, default to false)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostAutofitWorkbookRows(String name, AutoFitterOptions autoFitterOptions, Integer startRow, Integer endRow, Boolean onlyAuto, String folder, String storageName) throws ApiException {
    Object localVarPostBody = autoFitterOptions;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostAutofitWorkbookRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/autofitrows"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyAuto", onlyAuto));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Encript document.
   * 
   * @param name The document name. (required)
   * @param encryption Encryption parameters. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostEncryptDocument(String name, WorkbookEncryptionRequest encryption, String folder, String storageName) throws ApiException {
    Object localVarPostBody = encryption;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostEncryptDocument");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/encryption"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param importData  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostImportData(String name, ImportOption importData, String folder, String storageName) throws ApiException {
    Object localVarPostBody = importData;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostImportData");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'importData' is set
    if (importData == null) {
      throw new ApiException(400, "Missing the required parameter 'importData' when calling cellsWorkbookPostImportData");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/importdata"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Protect document.
   * 
   * @param name The document name. (required)
   * @param protection The protection settings. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostProtectDocument(String name, WorkbookProtectionRequest protection, String folder, String storageName) throws ApiException {
    Object localVarPostBody = protection;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostProtectDocument");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/protection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Calculate all formulas in workbook.
   * 
   * @param name Document name. (required)
   * @param options Calculation Options. (optional)
   * @param ignoreError ignore Error. (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostWorkbookCalculateFormula(String name, CalculationOptions options, Boolean ignoreError, String folder, String storageName) throws ApiException {
    Object localVarPostBody = options;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbookCalculateFormula");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/calculateformula"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ignoreError", ignoreError));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Smart marker processing result.
   * 
   * @param name The workbook name. (required)
   * @param xmlFile The xml file full path, if empty the data is read from request body. (optional)
   * @param folder The workbook folder full path. (optional)
   * @param storageName storage name. (optional)
   * @param outPath Path to save result (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsWorkbookPostWorkbookGetSmartMarkerResult(String name, String xmlFile, String folder, String storageName, String outPath) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbookGetSmartMarkerResult");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/smartmarker"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "xmlFile", xmlFile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", outPath));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update Workbook setting 
   * 
   * @param name Document name. (required)
   * @param settings Workbook Setting DTO (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPostWorkbookSettings(String name, WorkbookSettings settings, String folder, String storageName) throws ApiException {
    Object localVarPostBody = settings;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbookSettings");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/settings"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Split workbook.
   * 
   * @param name The workbook name. (required)
   * @param format Split format. (optional)
   * @param from Start worksheet index. (optional, default to 0)
   * @param to End worksheet index. (optional, default to 0)
   * @param horizontalResolution Image horizontal resolution. (optional, default to 0)
   * @param verticalResolution Image vertical resolution. (optional, default to 0)
   * @param folder The workbook folder. (optional)
   * @param outFolder out Folder. (optional)
   * @param storageName storage name. (optional)
   * @return SplitResultResponse
   * @throws ApiException if fails to make API call
   */
  public SplitResultResponse cellsWorkbookPostWorkbookSplit(String name, String format, Integer from, Integer to, Integer horizontalResolution, Integer verticalResolution, String folder, String outFolder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbookSplit");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/split"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "horizontalResolution", horizontalResolution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verticalResolution", verticalResolution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outFolder", outFolder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SplitResultResponse> localVarReturnType = new GenericType<SplitResultResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Merge workbooks.
   * 
   * @param name Workbook name. (required)
   * @param mergeWith The workbook to merge with. (required)
   * @param folder Source workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorkbookResponse
   * @throws ApiException if fails to make API call
   */
  public WorkbookResponse cellsWorkbookPostWorkbooksMerge(String name, String mergeWith, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbooksMerge");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'mergeWith' is set
    if (mergeWith == null) {
      throw new ApiException(400, "Missing the required parameter 'mergeWith' when calling cellsWorkbookPostWorkbooksMerge");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/merge"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mergeWith", mergeWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorkbookResponse> localVarReturnType = new GenericType<WorkbookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Replace text.
   * 
   * @param name Document name. (required)
   * @param oldValue The old value. (required)
   * @param newValue The new value. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorkbookReplaceResponse
   * @throws ApiException if fails to make API call
   */
  public WorkbookReplaceResponse cellsWorkbookPostWorkbooksTextReplace(String name, String oldValue, String newValue, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbooksTextReplace");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'oldValue' is set
    if (oldValue == null) {
      throw new ApiException(400, "Missing the required parameter 'oldValue' when calling cellsWorkbookPostWorkbooksTextReplace");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'newValue' is set
    if (newValue == null) {
      throw new ApiException(400, "Missing the required parameter 'newValue' when calling cellsWorkbookPostWorkbooksTextReplace");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/replaceText"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oldValue", oldValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newValue", newValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorkbookReplaceResponse> localVarReturnType = new GenericType<WorkbookReplaceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Search text.
   * 
   * @param name Document name. (required)
   * @param text Text sample. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return TextItemsResponse
   * @throws ApiException if fails to make API call
   */
  public TextItemsResponse cellsWorkbookPostWorkbooksTextSearch(String name, String text, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPostWorkbooksTextSearch");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'text' is set
    if (text == null) {
      throw new ApiException(400, "Missing the required parameter 'text' when calling cellsWorkbookPostWorkbooksTextSearch");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/findText"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TextItemsResponse> localVarReturnType = new GenericType<TextItemsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Convert workbook from request content to some format.
   * 
   * @param workbook  (required)
   * @param format The format to convert. (optional)
   * @param password The workbook password. (optional)
   * @param outPath Path to save result (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsWorkbookPutConvertWorkbook(File workbook, String format, String password, String outPath) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'workbook' is set
    if (workbook == null) {
      throw new ApiException(400, "Missing the required parameter 'workbook' when calling cellsWorkbookPutConvertWorkbook");
    }
    
    // create path and map variables
    String localVarPath = "/cells/convert";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", outPath));

    
    if (workbook != null)
      localVarFormParams.put("workbook", workbook);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Protect document from changes.
   * 
   * @param name Document name. (required)
   * @param password Modification password. (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPutDocumentProtectFromChanges(String name, PasswordRequest password, String folder, String storageName) throws ApiException {
    Object localVarPostBody = password;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPutDocumentProtectFromChanges");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/writeProtection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set workbook background image.
   * 
   * @param name  (required)
   * @param png  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPutWorkbookBackground(String name, byte[] png, String folder, String storageName) throws ApiException {
    Object localVarPostBody = png;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPutWorkbookBackground");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'png' is set
    if (png == null) {
      throw new ApiException(400, "Missing the required parameter 'png' when calling cellsWorkbookPutWorkbookBackground");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/background"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Create new workbook using deferent methods.
   * 
   * @param name The new document name. (required)
   * @param templateFile The template file, if the data not provided default workbook is created. (optional)
   * @param dataFile Smart marker data file, if the data not provided the request content is checked for the data. (optional)
   * @param isWriteOver write over file. (optional)
   * @param folder The new document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorkbookResponse
   * @throws ApiException if fails to make API call
   */
  public WorkbookResponse cellsWorkbookPutWorkbookCreate(String name, String templateFile, String dataFile, Boolean isWriteOver, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPutWorkbookCreate");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateFile", templateFile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataFile", dataFile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isWriteOver", isWriteOver));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorkbookResponse> localVarReturnType = new GenericType<WorkbookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set workbook background image.
   * 
   * @param name  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @param textWaterMarkerRequest The text water marker request. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorkbookPutWorkbookWaterMarker(String name, String folder, String storageName, TextWaterMarkerRequest textWaterMarkerRequest) throws ApiException {
    Object localVarPostBody = textWaterMarkerRequest;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorkbookPutWorkbookWaterMarker");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/watermarker"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet validation by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param validationIndex The validation index. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ValidationResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationResponse cellsWorksheetValidationsDeleteWorksheetValidation(String name, String sheetName, Integer validationIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsDeleteWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsDeleteWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'validationIndex' is set
    if (validationIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'validationIndex' when calling cellsWorksheetValidationsDeleteWorksheetValidation");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations/{validationIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "validationIndex" + "\\}", apiClient.escapeString(validationIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ValidationResponse> localVarReturnType = new GenericType<ValidationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Clear all validation in worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetValidationsDeleteWorksheetValidations(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsDeleteWorksheetValidations");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsDeleteWorksheetValidations");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet validation by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param validationIndex The validation index. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ValidationResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationResponse cellsWorksheetValidationsGetWorksheetValidation(String name, String sheetName, Integer validationIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsGetWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsGetWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'validationIndex' is set
    if (validationIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'validationIndex' when calling cellsWorksheetValidationsGetWorksheetValidation");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations/{validationIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "validationIndex" + "\\}", apiClient.escapeString(validationIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ValidationResponse> localVarReturnType = new GenericType<ValidationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet validations.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return ValidationsResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationsResponse cellsWorksheetValidationsGetWorksheetValidations(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsGetWorksheetValidations");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsGetWorksheetValidations");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ValidationsResponse> localVarReturnType = new GenericType<ValidationsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet validation by index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param validationIndex The validation index. (required)
   * @param validation  (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ValidationResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationResponse cellsWorksheetValidationsPostWorksheetValidation(String name, String sheetName, Integer validationIndex, Validation validation, String folder, String storageName) throws ApiException {
    Object localVarPostBody = validation;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsPostWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsPostWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'validationIndex' is set
    if (validationIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'validationIndex' when calling cellsWorksheetValidationsPostWorksheetValidation");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations/{validationIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "validationIndex" + "\\}", apiClient.escapeString(validationIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ValidationResponse> localVarReturnType = new GenericType<ValidationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add worksheet validation at index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param range Specified cells area (optional)
   * @param validation validation (optional)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return ValidationResponse
   * @throws ApiException if fails to make API call
   */
  public ValidationResponse cellsWorksheetValidationsPutWorksheetValidation(String name, String sheetName, String range, Validation validation, String folder, String storageName) throws ApiException {
    Object localVarPostBody = validation;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetValidationsPutWorksheetValidation");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetValidationsPutWorksheetValidation");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/validations"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", range));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ValidationResponse> localVarReturnType = new GenericType<ValidationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unprotect worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param protectParameter with protection settings. Only password is used here. (optional)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetResponse cellsWorksheetsDeleteUnprotectWorksheet(String name, String sheetName, ProtectSheetParameter protectParameter, String folder, String storageName) throws ApiException {
    Object localVarPostBody = protectParameter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteUnprotectWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteUnprotectWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/protection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetResponse> localVarReturnType = new GenericType<WorksheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetsResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetsResponse cellsWorksheetsDeleteWorksheet(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetsResponse> localVarReturnType = new GenericType<WorksheetsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set worksheet background image.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsDeleteWorksheetBackground(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteWorksheetBackground");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteWorksheetBackground");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/background"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete worksheet&#39;s cell comment.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellName The cell name (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsDeleteWorksheetComment(String name, String sheetName, String cellName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsWorksheetsDeleteWorksheetComment");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments/{cellName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Delete all comments for worksheet.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsDeleteWorksheetComments(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteWorksheetComments");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteWorksheetComments");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Unfreeze panes
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param row  (required)
   * @param column  (required)
   * @param freezedRows  (required)
   * @param freezedColumns  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsDeleteWorksheetFreezePanes(String name, String sheetName, Integer row, Integer column, Integer freezedRows, Integer freezedColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'row' is set
    if (row == null) {
      throw new ApiException(400, "Missing the required parameter 'row' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'column' is set
    if (column == null) {
      throw new ApiException(400, "Missing the required parameter 'column' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'freezedRows' is set
    if (freezedRows == null) {
      throw new ApiException(400, "Missing the required parameter 'freezedRows' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'freezedColumns' is set
    if (freezedColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'freezedColumns' when calling cellsWorksheetsDeleteWorksheetFreezePanes");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/freezepanes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedRows", freezedRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedColumns", freezedColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheets ranges info.
   * 
   * @param name Document name. (required)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return RangesResponse
   * @throws ApiException if fails to make API call
   */
  public RangesResponse cellsWorksheetsGetNamedRanges(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetNamedRanges");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/ranges"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RangesResponse> localVarReturnType = new GenericType<RangesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheet info or export.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param format The exported file format. (optional)
   * @param verticalResolution Image vertical resolution. (optional, default to 0)
   * @param horizontalResolution Image horizontal resolution. (optional, default to 0)
   * @param area Exported area. (optional)
   * @param pageIndex Exported page index. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File cellsWorksheetsGetWorksheet(String name, String sheetName, String format, Integer verticalResolution, Integer horizontalResolution, String area, Integer pageIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verticalResolution", verticalResolution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "horizontalResolution", horizontalResolution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "area", area));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Calculate formula value.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param formula The formula. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return SingleValueResponse
   * @throws ApiException if fails to make API call
   */
  public SingleValueResponse cellsWorksheetsGetWorksheetCalculateFormula(String name, String sheetName, String formula, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetCalculateFormula");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetCalculateFormula");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'formula' is set
    if (formula == null) {
      throw new ApiException(400, "Missing the required parameter 'formula' when calling cellsWorksheetsGetWorksheetCalculateFormula");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/formulaResult"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula", formula));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SingleValueResponse> localVarReturnType = new GenericType<SingleValueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet comment by cell name.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellName The cell name (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CommentResponse
   * @throws ApiException if fails to make API call
   */
  public CommentResponse cellsWorksheetsGetWorksheetComment(String name, String sheetName, String cellName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsWorksheetsGetWorksheetComment");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments/{cellName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CommentResponse> localVarReturnType = new GenericType<CommentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet comments.
   * 
   * @param name Workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CommentsResponse
   * @throws ApiException if fails to make API call
   */
  public CommentsResponse cellsWorksheetsGetWorksheetComments(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetComments");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetComments");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CommentsResponse> localVarReturnType = new GenericType<CommentsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet merged cell by its index.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param mergedCellIndex Merged cell index. (required)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return MergedCellResponse
   * @throws ApiException if fails to make API call
   */
  public MergedCellResponse cellsWorksheetsGetWorksheetMergedCell(String name, String sheetName, Integer mergedCellIndex, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetMergedCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetMergedCell");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'mergedCellIndex' is set
    if (mergedCellIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'mergedCellIndex' when calling cellsWorksheetsGetWorksheetMergedCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/mergedCells/{mergedCellIndex}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "mergedCellIndex" + "\\}", apiClient.escapeString(mergedCellIndex.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MergedCellResponse> localVarReturnType = new GenericType<MergedCellResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet merged cells.
   * 
   * @param name Document name. (required)
   * @param sheetName The workseet name. (required)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return MergedCellsResponse
   * @throws ApiException if fails to make API call
   */
  public MergedCellsResponse cellsWorksheetsGetWorksheetMergedCells(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetMergedCells");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetMergedCells");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/mergedCells"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MergedCellsResponse> localVarReturnType = new GenericType<MergedCellsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get worksheet text items.
   * 
   * @param name Workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param folder The workbook&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return TextItemsResponse
   * @throws ApiException if fails to make API call
   */
  public TextItemsResponse cellsWorksheetsGetWorksheetTextItems(String name, String sheetName, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheetTextItems");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsGetWorksheetTextItems");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/textItems"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TextItemsResponse> localVarReturnType = new GenericType<TextItemsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Read worksheets info.
   * 
   * @param name Document name. (required)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetsResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetsResponse cellsWorksheetsGetWorksheets(String name, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsGetWorksheets");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetsResponse> localVarReturnType = new GenericType<WorksheetsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param firstColumn  (required)
   * @param lastColumn  (required)
   * @param autoFitterOptions  (optional)
   * @param firstRow  (optional)
   * @param lastRow  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostAutofitWorksheetColumns(String name, String sheetName, Integer firstColumn, Integer lastColumn, AutoFitterOptions autoFitterOptions, Integer firstRow, Integer lastRow, String folder, String storageName) throws ApiException {
    Object localVarPostBody = autoFitterOptions;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostAutofitWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostAutofitWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstColumn' is set
    if (firstColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'firstColumn' when calling cellsWorksheetsPostAutofitWorksheetColumns");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastColumn' is set
    if (lastColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'lastColumn' when calling cellsWorksheetsPostAutofitWorksheetColumns");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autofitcolumns"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstColumn", firstColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastColumn", lastColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstRow", firstRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastRow", lastRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param rowIndex  (required)
   * @param firstColumn  (required)
   * @param lastColumn  (required)
   * @param autoFitterOptions  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostAutofitWorksheetRow(String name, String sheetName, Integer rowIndex, Integer firstColumn, Integer lastColumn, AutoFitterOptions autoFitterOptions, String folder, String storageName) throws ApiException {
    Object localVarPostBody = autoFitterOptions;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostAutofitWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostAutofitWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'rowIndex' is set
    if (rowIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'rowIndex' when calling cellsWorksheetsPostAutofitWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'firstColumn' is set
    if (firstColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'firstColumn' when calling cellsWorksheetsPostAutofitWorksheetRow");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'lastColumn' is set
    if (lastColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'lastColumn' when calling cellsWorksheetsPostAutofitWorksheetRow");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autofitrow"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rowIndex", rowIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstColumn", firstColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastColumn", lastColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Autofit worksheet rows.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param autoFitterOptions Auto Fitter Options. (optional)
   * @param startRow Start row. (optional)
   * @param endRow End row. (optional)
   * @param onlyAuto Only auto. (optional, default to false)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostAutofitWorksheetRows(String name, String sheetName, AutoFitterOptions autoFitterOptions, Integer startRow, Integer endRow, Boolean onlyAuto, String folder, String storageName) throws ApiException {
    Object localVarPostBody = autoFitterOptions;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostAutofitWorksheetRows");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostAutofitWorksheetRows");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/autofitrows"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", startRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endRow", endRow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyAuto", onlyAuto));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param sourceSheet  (required)
   * @param options  (optional)
   * @param sourceWorkbook  (optional)
   * @param sourceFolder  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostCopyWorksheet(String name, String sheetName, String sourceSheet, CopyOptions options, String sourceWorkbook, String sourceFolder, String folder, String storageName) throws ApiException {
    Object localVarPostBody = options;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostCopyWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostCopyWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sourceSheet' is set
    if (sourceSheet == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceSheet' when calling cellsWorksheetsPostCopyWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/copy"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceSheet", sourceSheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceWorkbook", sourceWorkbook));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceFolder", sourceFolder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Move worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param moving with moving parameters. (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetsResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetsResponse cellsWorksheetsPostMoveWorksheet(String name, String sheetName, WorksheetMovingRequest moving, String folder, String storageName) throws ApiException {
    Object localVarPostBody = moving;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostMoveWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostMoveWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/position"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetsResponse> localVarReturnType = new GenericType<WorksheetsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Rename worksheet
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param newname  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostRenameWorksheet(String name, String sheetName, String newname, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostRenameWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostRenameWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'newname' is set
    if (newname == null) {
      throw new ApiException(400, "Missing the required parameter 'newname' when calling cellsWorksheetsPostRenameWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/rename"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newname", newname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet property
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param sheet  (optional)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetResponse cellsWorksheetsPostUpdateWorksheetProperty(String name, String sheetName, Worksheet sheet, String folder, String storageName) throws ApiException {
    Object localVarPostBody = sheet;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostUpdateWorksheetProperty");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostUpdateWorksheetProperty");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetResponse> localVarReturnType = new GenericType<WorksheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * 
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param value  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostUpdateWorksheetZoom(String name, String sheetName, Integer value, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostUpdateWorksheetZoom");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostUpdateWorksheetZoom");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling cellsWorksheetsPostUpdateWorksheetZoom");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/zoom"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Update worksheet&#39;s cell comment.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellName The cell name (required)
   * @param comment Comment object (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostWorksheetComment(String name, String sheetName, String cellName, Comment comment, String folder, String storageName) throws ApiException {
    Object localVarPostBody = comment;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsWorksheetsPostWorksheetComment");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments/{cellName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Sort worksheet range.
   * 
   * @param name The workbook name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellArea The range to sort. (required)
   * @param dataSorter with sorting settings. (optional)
   * @param folder The workbook folder. (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPostWorksheetRangeSort(String name, String sheetName, String cellArea, DataSorter dataSorter, String folder, String storageName) throws ApiException {
    Object localVarPostBody = dataSorter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostWorksheetRangeSort");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostWorksheetRangeSort");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellArea' is set
    if (cellArea == null) {
      throw new ApiException(400, "Missing the required parameter 'cellArea' when calling cellsWorksheetsPostWorksheetRangeSort");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/sort"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cellArea", cellArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Search text.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param text Text to search. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return TextItemsResponse
   * @throws ApiException if fails to make API call
   */
  public TextItemsResponse cellsWorksheetsPostWorksheetTextSearch(String name, String sheetName, String text, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostWorksheetTextSearch");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostWorksheetTextSearch");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'text' is set
    if (text == null) {
      throw new ApiException(400, "Missing the required parameter 'text' when calling cellsWorksheetsPostWorksheetTextSearch");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/findText"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TextItemsResponse> localVarReturnType = new GenericType<TextItemsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Replace text.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param oldValue The old text to replace. (required)
   * @param newValue The new text to replace by. (required)
   * @param folder Document&#39;s folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetReplaceResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetReplaceResponse cellsWorksheetsPostWorsheetTextReplace(String name, String sheetName, String oldValue, String newValue, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPostWorsheetTextReplace");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPostWorsheetTextReplace");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'oldValue' is set
    if (oldValue == null) {
      throw new ApiException(400, "Missing the required parameter 'oldValue' when calling cellsWorksheetsPostWorsheetTextReplace");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'newValue' is set
    if (newValue == null) {
      throw new ApiException(400, "Missing the required parameter 'newValue' when calling cellsWorksheetsPostWorsheetTextReplace");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/replaceText"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oldValue", oldValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newValue", newValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetReplaceResponse> localVarReturnType = new GenericType<WorksheetReplaceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add new worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The new sheet name. (required)
   * @param position The new sheet position. (optional)
   * @param sheettype The new sheet type. (optional)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetsResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetsResponse cellsWorksheetsPutAddNewWorksheet(String name, String sheetName, Integer position, String sheettype, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutAddNewWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutAddNewWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sheettype", sheettype));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetsResponse> localVarReturnType = new GenericType<WorksheetsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Change worksheet visibility.
   * 
   * @param name Document name. (required)
   * @param sheetName Worksheet name. (required)
   * @param isVisible New worksheet visibility value. (required)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetResponse cellsWorksheetsPutChangeVisibilityWorksheet(String name, String sheetName, Boolean isVisible, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutChangeVisibilityWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutChangeVisibilityWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'isVisible' is set
    if (isVisible == null) {
      throw new ApiException(400, "Missing the required parameter 'isVisible' when calling cellsWorksheetsPutChangeVisibilityWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/visible"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isVisible", isVisible));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetResponse> localVarReturnType = new GenericType<WorksheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Protect worksheet.
   * 
   * @param name Document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param protectParameter with protection settings. (optional)
   * @param folder Document folder. (optional)
   * @param storageName storage name. (optional)
   * @return WorksheetResponse
   * @throws ApiException if fails to make API call
   */
  public WorksheetResponse cellsWorksheetsPutProtectWorksheet(String name, String sheetName, ProtectSheetParameter protectParameter, String folder, String storageName) throws ApiException {
    Object localVarPostBody = protectParameter;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutProtectWorksheet");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutProtectWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/protection"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WorksheetResponse> localVarReturnType = new GenericType<WorksheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set worksheet background image.
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param png  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPutWorksheetBackground(String name, String sheetName, byte[] png, String folder, String storageName) throws ApiException {
    Object localVarPostBody = png;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutWorksheetBackground");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutWorksheetBackground");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'png' is set
    if (png == null) {
      throw new ApiException(400, "Missing the required parameter 'png' when calling cellsWorksheetsPutWorksheetBackground");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/background"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Add worksheet&#39;s cell comment.
   * 
   * @param name The document name. (required)
   * @param sheetName The worksheet name. (required)
   * @param cellName The cell name (required)
   * @param comment Comment object (optional)
   * @param folder The document folder. (optional)
   * @param storageName storage name. (optional)
   * @return CommentResponse
   * @throws ApiException if fails to make API call
   */
  public CommentResponse cellsWorksheetsPutWorksheetComment(String name, String sheetName, String cellName, Comment comment, String folder, String storageName) throws ApiException {
    Object localVarPostBody = comment;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutWorksheetComment");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'cellName' is set
    if (cellName == null) {
      throw new ApiException(400, "Missing the required parameter 'cellName' when calling cellsWorksheetsPutWorksheetComment");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/comments/{cellName}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))
      .replaceAll("\\{" + "cellName" + "\\}", apiClient.escapeString(cellName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CommentResponse> localVarReturnType = new GenericType<CommentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Set freeze panes
   * 
   * @param name  (required)
   * @param sheetName  (required)
   * @param row  (required)
   * @param column  (required)
   * @param freezedRows  (required)
   * @param freezedColumns  (required)
   * @param folder  (optional)
   * @param storageName storage name. (optional)
   * @return CellsCloudResponse
   * @throws ApiException if fails to make API call
   */
  public CellsCloudResponse cellsWorksheetsPutWorksheetFreezePanes(String name, String sheetName, Integer row, Integer column, Integer freezedRows, Integer freezedColumns, String folder, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'sheetName' is set
    if (sheetName == null) {
      throw new ApiException(400, "Missing the required parameter 'sheetName' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'row' is set
    if (row == null) {
      throw new ApiException(400, "Missing the required parameter 'row' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'column' is set
    if (column == null) {
      throw new ApiException(400, "Missing the required parameter 'column' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'freezedRows' is set
    if (freezedRows == null) {
      throw new ApiException(400, "Missing the required parameter 'freezedRows' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'freezedColumns' is set
    if (freezedColumns == null) {
      throw new ApiException(400, "Missing the required parameter 'freezedColumns' when calling cellsWorksheetsPutWorksheetFreezePanes");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{name}/worksheets/{sheetName}/freezepanes"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", row));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", column));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedRows", freezedRows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedColumns", freezedColumns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", folder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CellsCloudResponse> localVarReturnType = new GenericType<CellsCloudResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Copy file
   * 
   * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39; (required)
   * @param destPath Destination file path (required)
   * @param srcStorageName Source storage name (optional)
   * @param destStorageName Destination storage name (optional)
   * @param versionId File version ID to copy (optional)
   * @throws ApiException if fails to make API call
   */
  public void copyFile(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'srcPath' is set
    if (srcPath == null) {
      throw new ApiException(400, "Missing the required parameter 'srcPath' when calling copyFile");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destPath' is set
    if (destPath == null) {
      throw new ApiException(400, "Missing the required parameter 'destPath' when calling copyFile");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/file/copy/{srcPath}"
      .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(srcPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destPath", destPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcStorageName", srcStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destStorageName", destStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Copy folder
   * 
   * @param srcPath Source folder path e.g. &#39;/src&#39; (required)
   * @param destPath Destination folder path e.g. &#39;/dst&#39; (required)
   * @param srcStorageName Source storage name (optional)
   * @param destStorageName Destination storage name (optional)
   * @throws ApiException if fails to make API call
   */
  public void copyFolder(String srcPath, String destPath, String srcStorageName, String destStorageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'srcPath' is set
    if (srcPath == null) {
      throw new ApiException(400, "Missing the required parameter 'srcPath' when calling copyFolder");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destPath' is set
    if (destPath == null) {
      throw new ApiException(400, "Missing the required parameter 'destPath' when calling copyFolder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/folder/copy/{srcPath}"
      .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(srcPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destPath", destPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcStorageName", srcStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destStorageName", destStorageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Create the folder
   * 
   * @param path Folder path to create e.g. &#39;folder_1/folder_2/&#39; (required)
   * @param storageName Storage name (optional)
   * @throws ApiException if fails to make API call
   */
  public void createFolder(String path, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling createFolder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/folder/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Delete file
   * 
   * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
   * @param storageName Storage name (optional)
   * @param versionId File version ID to delete (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteFile(String path, String storageName, String versionId) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling deleteFile");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/file/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Delete folder
   * 
   * @param path Folder path e.g. &#39;/folder&#39; (required)
   * @param storageName Storage name (optional)
   * @param recursive Enable to delete folders, subfolders and files (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteFolder(String path, String storageName, Boolean recursive) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling deleteFolder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/folder/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recursive", recursive));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Download file
   * 
   * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
   * @param storageName Storage name (optional)
   * @param versionId File version ID to download (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File downloadFile(String path, String storageName, String versionId) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling downloadFile");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/file/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));

    
    
    final String[] localVarAccepts = {
      "multipart/form-data"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get disc usage
   * 
   * @param storageName Storage name (optional)
   * @return DiscUsage
   * @throws ApiException if fails to make API call
   */
  public DiscUsage getDiscUsage(String storageName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/cells/storage/disc";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DiscUsage> localVarReturnType = new GenericType<DiscUsage>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get file versions
   * 
   * @param path File path e.g. &#39;/file.ext&#39; (required)
   * @param storageName Storage name (optional)
   * @return FileVersions
   * @throws ApiException if fails to make API call
   */
  public FileVersions getFileVersions(String path, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling getFileVersions");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/version/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FileVersions> localVarReturnType = new GenericType<FileVersions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Get all files and folders within a folder
   * 
   * @param path Folder path e.g. &#39;/folder&#39; (required)
   * @param storageName Storage name (optional)
   * @return FilesList
   * @throws ApiException if fails to make API call
   */
  public FilesList getFilesList(String path, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling getFilesList");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/folder/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FilesList> localVarReturnType = new GenericType<FilesList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Move file
   * 
   * @param srcPath Source file path e.g. &#39;/src.ext&#39; (required)
   * @param destPath Destination file path e.g. &#39;/dest.ext&#39; (required)
   * @param srcStorageName Source storage name (optional)
   * @param destStorageName Destination storage name (optional)
   * @param versionId File version ID to move (optional)
   * @throws ApiException if fails to make API call
   */
  public void moveFile(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'srcPath' is set
    if (srcPath == null) {
      throw new ApiException(400, "Missing the required parameter 'srcPath' when calling moveFile");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destPath' is set
    if (destPath == null) {
      throw new ApiException(400, "Missing the required parameter 'destPath' when calling moveFile");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/file/move/{srcPath}"
      .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(srcPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destPath", destPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcStorageName", srcStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destStorageName", destStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Move folder
   * 
   * @param srcPath Folder path to move e.g. &#39;/folder&#39; (required)
   * @param destPath Destination folder path to move to e.g &#39;/dst&#39; (required)
   * @param srcStorageName Source storage name (optional)
   * @param destStorageName Destination storage name (optional)
   * @throws ApiException if fails to make API call
   */
  public void moveFolder(String srcPath, String destPath, String srcStorageName, String destStorageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'srcPath' is set
    if (srcPath == null) {
      throw new ApiException(400, "Missing the required parameter 'srcPath' when calling moveFolder");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'destPath' is set
    if (destPath == null) {
      throw new ApiException(400, "Missing the required parameter 'destPath' when calling moveFolder");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/folder/move/{srcPath}"
      .replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(srcPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destPath", destPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcStorageName", srcStorageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destStorageName", destStorageName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  
  

  /**
   * Get Access token
   * 
   * @param grantType Grant Type (required)
   * @param clientId App SID (required)
   * @param clientSecret App Key (required)
   * @return AccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  public AccessTokenResponse oAuthPost(String grantType, String clientId, String clientSecret) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
      throw new ApiException(400, "Missing the required parameter 'grantType' when calling oAuthPost");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling oAuthPost");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'clientSecret' is set
    if (clientSecret == null) {
      throw new ApiException(400, "Missing the required parameter 'clientSecret' when calling oAuthPost");
    }
    
    // create path and map variables
    String localVarPath = "/connect/token";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (grantType != null)
      localVarFormParams.put("grant_type", grantType);
if (clientId != null)
      localVarFormParams.put("client_id", clientId);
if (clientSecret != null)
      localVarFormParams.put("client_secret", clientSecret);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AccessTokenResponse> localVarReturnType = new GenericType<AccessTokenResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Check if file or folder exists
   * 
   * @param path File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; (required)
   * @param storageName Storage name (optional)
   * @param versionId File version ID (optional)
   * @return ObjectExist
   * @throws ApiException if fails to make API call
   */
  public ObjectExist objectExists(String path, String storageName, String versionId) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling objectExists");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/exist/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ObjectExist> localVarReturnType = new GenericType<ObjectExist>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Check if storage exists
   * 
   * @param storageName Storage name (required)
   * @return StorageExist
   * @throws ApiException if fails to make API call
   */
  public StorageExist storageExists(String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'storageName' is set
    if (storageName == null) {
      throw new ApiException(400, "Missing the required parameter 'storageName' when calling storageExists");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/{storageName}/exist"
      .replaceAll("\\{" + "storageName" + "\\}", apiClient.escapeString(storageName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StorageExist> localVarReturnType = new GenericType<StorageExist>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  

  /**
   * Upload file
   * 
   * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              (required)
   * @param file File to upload (required)
   * @param storageName Storage name (optional)
   * @return FilesUploadResult
   * @throws ApiException if fails to make API call
   */
  public FilesUploadResult uploadFile(String path, File file, String storageName) throws ApiException {
    Object localVarPostBody = null;
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling uploadFile");
    }
    
	 // TODO Auto-generated catch block
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/cells/storage/file/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", storageName));

    
    if (file != null)
      localVarFormParams.put("File", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<FilesUploadResult> localVarReturnType = new GenericType<FilesUploadResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
