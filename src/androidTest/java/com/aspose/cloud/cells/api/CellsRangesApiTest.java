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
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.Configuration;
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.PasteOptions;
import com.aspose.cloud.cells.model.Range;
import com.aspose.cloud.cells.model.RangeCopyRequest;
import com.aspose.cloud.cells.model.RangeSetOutlineBorderRequest;
import com.aspose.cloud.cells.model.RangeSetStyleRequest;
import com.aspose.cloud.cells.model.RangeValueResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.Style;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsRangesApi
 */

public class CellsRangesApiTest {

    private CellsApi api ;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "Temp";
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
    
    public CellsRangesApiTest(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  	
    
    /**
     * Get cells list in a range by range name or row column indexes  
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesGetWorksheetCellsRangeValueTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        Integer firstRow = 0;
        Integer firstColumn = 0;
        Integer rowCount = 3;
        Integer columnCount = 2;
        CellsApiUtil.Upload(api, folder , name);
        
        RangeValueResponse response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, null, firstRow, firstColumn, rowCount, columnCount, folder,null);
        assertTrue(response.getCellsList().size() > 0);

        String rangeName = "A1:B3";
        response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, rangeName, null, null, null, null, folder,null);
//        assertTrue(response.getCellsList().size() > 0);

        rangeName = "Name_2";
        response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, rangeName, null, null, null, null, folder,null);
        assertTrue(response.getCellsList().size() > 0);
    }
    
    /**
     * Set column width of range
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeColumnWidthTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Double value = 10.01;
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        range.setColumnWidth(10.01);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range, folder,null);

        // TODO: test validations
    }
    
    /**
     * Combines a range of cells into a single cell.              
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeMergeTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder,null);

        // TODO: test validations
    }
    
    /**
     * Move the current range to the dest range.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeMoveToTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer destRow = 1;
        Integer destColumn = 1;
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn, range, folder,null);

        // TODO: test validations
    }
    
    /**
     * Sets outline border around a range of cells.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeOutlineBorderTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        RangeSetOutlineBorderRequest rangeOperate = new RangeSetOutlineBorderRequest();
        Color borderColor = new Color();
        borderColor.setG(123);
        rangeOperate.setBorderColor(borderColor);
        rangeOperate.setBorderEdge("LeftBorder");
        rangeOperate.setBorderStyle("Dotted");
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        rangeOperate.setRange(range);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate, folder,null);

        // TODO: test validations
    }
    
    /**
     * set row height of range
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeRowHeightTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Double value =  10.99;
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range, folder,null);

        // TODO: test validations
    }
    
    /**
     * Sets the style of the range.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeStyleTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        RangeSetStyleRequest rangeOperate =  new RangeSetStyleRequest();
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        rangeOperate.setRange(range);
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        rangeOperate.setStyle(style);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder,null);

        // TODO: test validations
    }
    
    /**
     * Unmerges merged cells of this range.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeUnMergeTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder,null);

        // TODO: test validations
    }
    
    /**
     * Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangeValueTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String value = "10";
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        Boolean isConverted = true;
        Boolean setStyle = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range, isConverted, setStyle, folder,null);

        // TODO: test validations
    }
    
    /**
     * copy range in the worksheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsRangesPostWorksheetCellsRangesTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        RangeCopyRequest rangeOperate =  new RangeCopyRequest();
        rangeOperate.setOperate("copydata");
        PasteOptions po = new PasteOptions();
        po.setOnlyVisibleCells(true);
        rangeOperate.setPasteOptions(po);
        Range range = new Range();
        range.setFirstColumn(1);
        range.setFirstRow(1);
        range.setColumnCount(1);
        range.setRowCount(10);
        rangeOperate.setSource(range);
        Range range2 = new Range();
        range2.setFirstColumn(10);
        range2.setFirstRow(10);
        range2.setColumnCount(1);
        range2.setRowCount(10);
        rangeOperate.setTarget(range2);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder,null);

        // TODO: test validations
    }
    
}
