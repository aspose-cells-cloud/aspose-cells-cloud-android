/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.api;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.CellResponse;
import com.aspose.cloud.cells.model.CellsResponse;
import com.aspose.cloud.cells.model.ColumnResponse;
import com.aspose.cloud.cells.model.ColumnsResponse;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.FontSetting;
import com.aspose.cloud.cells.model.RowResponse;
import com.aspose.cloud.cells.model.RowsResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.StyleResponse;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

/**
 * API tests for CellsApi
 */

public class CellsApiTest {

    private  CellsApi api;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "JavaTest";//"CellsTests";
    private String SHEET1 = "Sheet1";
    private String SHEET2 = "Sheet2";
    private String SHEET3 = "Sheet3";
    private String SHEET4 = "Sheet4";
    private String SHEET5 = "Sheet5";
    private String SHEET6 = "Sheet6";
    private String SHEET7 = "Sheet7";
    private String SHEET8 = "Sheet8";
    private String CellName = "A1";
    private String RANGE = "A1:C10";
    private String CELLAREA = "A1:C10";
    
 
    public CellsApiTest(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Delete worksheet columns.
     * @throws Exception 
     */
    @Test
    public void cellsDeleteWorksheetColumnsTest() throws Exception {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 1;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ColumnsResponse response = api.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);
//        Assert.assertEquals("cellsDeleteWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Delete worksheet row.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsDeleteWorksheetRowTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder,null);
        Assert.assertEquals("cellsDeleteWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Delete several worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsDeleteWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 2;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder,null);
        Assert.assertEquals("cellsDeleteWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Read cell data by cell&#39;s name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetCellTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellOrMethodName = "A1";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        Object response = api.cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read cell&#39;s style info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetCellStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "A1";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        StyleResponse response = api.cellsGetWorksheetCellStyle(name, sheetName, cellName, folder,null);
        Assert.assertEquals("cellsGetWorksheetCellStyleTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Get cells info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetCellsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer offest = 1;
        Integer count = 10;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsResponse response = api.cellsGetWorksheetCells(name, sheetName, offest, count, folder,null);
        Assert.assertEquals("cellsGetWorksheetCellsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Read worksheet column data by column&#39;s index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetColumnTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ColumnResponse response = api.cellsGetWorksheetColumn(name, sheetName, columnIndex, folder,null);
        Assert.assertEquals("cellsGetWorksheetColumnTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Read worksheet columns info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ColumnsResponse response = api.cellsGetWorksheetColumns(name, sheetName, folder,null);
        Assert.assertEquals("cellsGetWorksheetColumnTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Read worksheet row data by row&#39;s index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetRowTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        RowResponse response = api.cellsGetWorksheetRow(name, sheetName, rowIndex, folder,null);
        Assert.assertEquals("cellsGetWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Read worksheet rows info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        RowsResponse response = api.cellsGetWorksheetRows(name, sheetName, folder,null);
        Assert.assertEquals("cellsGetWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Cell calculate formula
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostCellCalculateTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        CalculationOptions options = new CalculationOptions();
        options.setRecursive(true);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostCellCalculate(name, sheetName, cellName, options, folder,null);
        Assert.assertEquals("cellsPostCellCalculateTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set cell characters 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostCellCharactersTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET2;
        String cellName = "G8";
        List<FontSetting> options = new ArrayList<FontSetting>();
        Font font = new Font();
        font.setSize(10); 
        FontSetting fs1 = new FontSetting();
        fs1.setFont(font); 
        fs1.setLength(2);
        fs1.setStartIndex(0);
        options.add(fs1);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostCellCharacters(name, sheetName, cellName, options, folder,null);
        Assert.assertEquals("cellsPostCellCharactersTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Clear cells contents.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostClearContentsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer startRow = 1;
        Integer startColumn = 2;
        Integer endRow = 10;
        Integer endColumn = 7;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder,null);
        Assert.assertEquals("cellsPostClearContentsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Clear cells contents.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostClearFormatsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer endRow = 7;
        Integer endColumn = 6;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder,null);
        Assert.assertEquals("cellsPostClearFormatsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set column style
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostColumnStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Style style = new Style();
        Font font = new  Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostColumnStyle(name, sheetName, columnIndex, style, folder,null);
        Assert.assertEquals("cellsPostColumnStyleTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Copy cell into cell
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostCopyCellIntoCellTest() throws ApiException {
        String name = BOOK1;
        String destCellName = "C1";
        String sheetName = SHEET1;
        String worksheet = SHEET2;
        String cellname = CellName;
        Integer row = 1;
        Integer column = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder,null);
        Assert.assertEquals("cellsPostCopyCellIntoCellTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Copy worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostCopyWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer sourceColumnIndex = 1;
        Integer destinationColumnIndex = 2;
        Integer columnNumber = 1;
        String worksheet = SHEET2;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder,null);
        Assert.assertEquals("cellsPostCopyWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Copy worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostCopyWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer sourceRowIndex = 1;
        Integer destinationRowIndex = 1;
        Integer rowNumber = 1;
        String worksheet = SHEET2;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder,null);
        Assert.assertEquals("cellsPostCopyWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Group worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostGroupWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 1;
        Boolean hide = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder,null);
        Assert.assertEquals("cellsPostGroupWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Group worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostGroupWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 1;
        Boolean hide = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder,null);
        Assert.assertEquals("cellsPostGroupWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Hide worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostHideWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startColumn = 1;
        Integer totalColumns = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder,null);
        Assert.assertEquals("cellsPostHideWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Hide worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostHideWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder,null);
        Assert.assertEquals("cellsPostHideWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set row style.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostRowStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostRowStyle(name, sheetName, rowIndex, style, folder,null);
        Assert.assertEquals("cellsPostRowStyleTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    /**
     * Get htmlstring value into cell
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsGetCellHtmlStringTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        Object response = api.cellsGetCellHtmlString(name, sheetName, cellName, folder,null);        
        // TODO: test validations
    }    
    /**
     * Set htmlstring value into cell
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostSetCellHtmlStringTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        String folder = TEMPFOLDER;
        String htmlString ="https://api.aspose.cloud/v3.0/cells";
        CellsApiUtil.Upload(api, folder , name);
        CellResponse response = api.cellsPostSetCellHtmlString(name, sheetName, cellName,htmlString.getBytes() ,folder,null);
        Assert.assertEquals("cellsPostSetCellHtmlStringTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set cell range value 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostSetCellRangeValueTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellarea = CELLAREA;
        String value = "2017-10-1";
        String type = "Date";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder,null);
        Assert.assertEquals("cellsPostSetCellRangeValueTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set worksheet column width.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostSetWorksheetColumnWidthTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Double width = 10.0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ColumnResponse response = api.cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder,null);
        Assert.assertEquals("cellsPostSetWorksheetColumnWidthTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Ungroup worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUngroupWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 10;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder,null);
        Assert.assertEquals("cellsPostUngroupWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Ungroup worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUngroupWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 10;
        Boolean isAll = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder,null);
        Assert.assertEquals("cellsPostUngroupWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Unhide worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUnhideWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startcolumn = 1;
        Integer totalColumns = 10;
        Double width = 10.0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder,null);
        Assert.assertEquals("cellsPostUnhideWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Unhide worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUnhideWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 1;
        Double height = 10.0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder,null);
        Assert.assertEquals("cellsPostUnhideWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Update cell&#39;s style.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUpdateWorksheetCellStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        StyleResponse response = api.cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder,null);
        Assert.assertEquals("cellsPostUpdateWorksheetCellStyleTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Update cell&#39;s range style.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUpdateWorksheetRangeStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder,null);
        Assert.assertEquals("cellsPostUpdateWorksheetRangeStyleTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Update worksheet row.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostUpdateWorksheetRowTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Double height = 10.01;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        RowResponse response = api.cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder,null);
        Assert.assertEquals("cellsPostUpdateWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Set cell value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostWorksheetCellSetValueTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        String value = "2018-08-28";
        String type = "Date";
        String formula = "=Now()";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellResponse response = api.cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder,null);
        Assert.assertEquals("cellsPostWorksheetCellSetValueTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Merge cells.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostWorksheetMergeTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 7;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);
        Assert.assertEquals("cellsPostWorksheetCellSetValueTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Unmerge cells.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostWorksheetUnmergeTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 6;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);
        Assert.assertEquals("cellsPostWorksheetUnmergeTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Insert worksheet columns.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPutInsertWorksheetColumnsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 2;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ColumnsResponse response = api.cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);
        Assert.assertEquals("cellsPutInsertWorksheetColumnsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Insert new worksheet row.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPutInsertWorksheetRowTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        RowResponse response = api.cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder,null);
        Assert.assertEquals("cellsPutInsertWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Insert several new worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPutInsertWorksheetRowsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 10;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder,null);
        Assert.assertEquals("cellsPutInsertWorksheetRowsTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
}
