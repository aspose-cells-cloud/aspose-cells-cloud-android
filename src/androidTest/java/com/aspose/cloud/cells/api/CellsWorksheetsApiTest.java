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


import com.aspose.cloud.cells.model.AutoFitterOptions;
import com.aspose.cloud.cells.model.Comment;
import com.aspose.cloud.cells.model.CommentResponse;
import com.aspose.cloud.cells.model.CommentsResponse;
import com.aspose.cloud.cells.model.CopyOptions;
import com.aspose.cloud.cells.model.DataSorter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.aspose.cloud.cells.model.MergedCellResponse;
import com.aspose.cloud.cells.model.MergedCellsResponse;
import com.aspose.cloud.cells.model.ProtectSheetParameter;
import com.aspose.cloud.cells.model.RangesResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.SingleValueResponse;
import com.aspose.cloud.cells.model.TextItemsResponse;
import com.aspose.cloud.cells.model.Worksheet;
import com.aspose.cloud.cells.model.WorksheetMovingRequest;
import com.aspose.cloud.cells.model.WorksheetReplaceResponse;
import com.aspose.cloud.cells.model.WorksheetResponse;
import com.aspose.cloud.cells.model.WorksheetsResponse;
import org.junit.Test;

/**
 * API tests for CellsWorksheetsApi
 */

public class CellsWorksheetsApiTest {

    private final CellsWorksheetsApi api = new CellsWorksheetsApi();

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
    
	
    
    /**
     * Unprotect worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteUnprotectWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        ProtectSheetParameter protectParameter = new ProtectSheetParameter();
        protectParameter.setProtectionType("All");
        protectParameter.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder,null);

        // TODO: test validations
    }
    
    /**
     * Set worksheet background image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteWorkSheetBackgroundTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete worksheet&#39;s cell comment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteWorkSheetCommentTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "C1";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete all comments for worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteWorkSheetCommentsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsDeleteWorksheet(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Unfreeze panes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsDeleteWorksheetFreezePanesTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        Integer column = 1;
        Integer freezedRows = 2;
        Integer freezedColumns = 2;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read worksheets ranges info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetNamedRangesTest() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        RangesResponse response = api.cellsWorksheetsGetNamedRanges(name, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read worksheet info or export.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer verticalResolution = 100;
        Integer horizontalResolution = 90;
        String format = "png";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        File response = api.cellsWorksheetsGetWorksheet(name, sheetName, format,verticalResolution, horizontalResolution, folder,null);

        // TODO: test validations
    }
    
    /**
     * Calculate formula value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetCalculateFormulaTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String formula = "=NOW()";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SingleValueResponse response = api.cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet comment by cell name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetCommentTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "B3";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        CommentResponse response = api.cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetCommentsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        CommentsResponse response = api.cellsWorksheetsGetWorksheetComments(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet merged cell by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetMergedCellTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer mergedCellIndex = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        MergedCellResponse response = api.cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet merged cells.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetMergedCellsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        MergedCellsResponse response = api.cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetTextItemsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        TextItemsResponse response = api.cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read worksheets info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsGetWorkSheetsTest() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsGetWorksheets(name, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostAutofitWorksheetColumnsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstColumn = 1;
        Integer lastColumn = 10;
        AutoFitterOptions autoFitterOptions = null;
        Integer firstRow = 1;
        Integer lastRow = 19;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostAutofitWorksheetRowTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Integer firstColumn = 1;
        Integer lastColumn = 10;
        AutoFitterOptions autoFitterOptions = new AutoFitterOptions();
        autoFitterOptions.setAutoFitMergedCells(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder,null);

        // TODO: test validations
    }
    
    /**
     * Autofit worksheet rows.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostAutofitWorksheetRowsTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        AutoFitterOptions autoFitterOptions =  new AutoFitterOptions();
        autoFitterOptions.setAutoFitMergedCells(true);
        Integer startRow = 1;
        Integer endRow = 10;
        Boolean onlyAuto = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostCopyWorksheetTest() throws ApiException {
        String name ="NewCopy.xlsx";
        String sheetName = SHEET5;
        String sourceSheet = SHEET6;
        CopyOptions options = new CopyOptions();
        options.setCopyNames(true);
        String sourceWorkbook = BOOK1;
        String sourceFolder = TEMPFOLDER;
        String folder = TEMPFOLDER;
        CellsApiUtil.Ready(sourceFolder, sourceWorkbook);
		api.setApiClient( CellsApiUtil.Ready(folder, name));
		CellsApiUtil.Ready(sourceFolder, sourceWorkbook);
        SaaSposeResponse response = api.cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder,null);

        // TODO: test validations
    }
    
    /**
     * Move worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostMoveWorksheetTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        WorksheetMovingRequest moving = new WorksheetMovingRequest();
        moving.setDestinationWorksheet(SHEET3);
        moving.setPosition("after");
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder,null);

        // TODO: test validations
    }
    
    /**
     * Rename worksheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostRenameWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String newname = "renametest";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder,null);

        // TODO: test validations
    }
    
    /**
     * Update worksheet property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostUpdateWorksheetPropertyTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Worksheet sheet = new Worksheet();
        sheet.setIsGridlinesVisible(true);
        sheet.setIndex(0);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostUpdateWorksheetZoomTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer value = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder,null);

        // TODO: test validations
    }
    
    /**
     * Update worksheet&#39;s cell comment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostWorkSheetCommentTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "B3";
        Comment comment = new Comment();
        comment.setAuthor("Roy Wang");
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder,null);

        // TODO: test validations
    }
    
    /**
     * Search text.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostWorkSheetTextSearchTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String text ="123456";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        TextItemsResponse response = api.cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder,null);

        // TODO: test validations
    }
    
    /**
     * Sort worksheet range.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostWorksheetRangeSortTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellArea = CELLAREA;
        DataSorter dataSorter =new DataSorter();
        dataSorter.setCaseSensitive( true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder,null);

        // TODO: test validations
    }
    
    /**
     * Replace text.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPostWorsheetTextReplaceTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String oldValue ="1234";
        String newValue = "56678";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetReplaceResponse response = api.cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add new worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPutAddNewWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer position = 1;
        String sheettype ="VB";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder,null);

        // TODO: test validations
    }
    
    /**
     * Change worksheet visibility.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPutChangeVisibilityWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Boolean isVisible = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder,null);

        // TODO: test validations
    }
    
    /**
     * Protect worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPutProtectWorksheetTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        ProtectSheetParameter protectParameter =  new ProtectSheetParameter();
        protectParameter.setProtectionType("All");
        protectParameter.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder,null);

        // TODO: test validations
    }

//    /**
//     * Set worksheet background image.
//     *
//     *
//     *
//     * @throws ApiException
//     *          if the Api call fails
//     */
//    @Test
//    public void cellsWorksheetsPutWorkSheetBackgroundTest() throws ApiException {
//       String name = BOOK1;
//        String sheetName = SHEET1;
////        File file = new File("");
////        file.get
//        byte[] png = null;
//        try {
//            File file = new File(CellsApiUtil.GetSourceFolder() + "WaterMark.png");
//            FileInputStream fis = new FileInputStream(file);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
//            byte[] b = new byte[1000];
//            int n;
//            while ((n = fis.read(b)) != -1) {
//                bos.write(b, 0, n);
//            }
//            fis.close();
//            bos.close();
//            png = bos.toByteArray();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String folder = TEMPFOLDER;
//		api.setApiClient( CellsApiUtil.Ready(folder, name));
//        SaaSposeResponse response = api.cellsWorksheetsPutWorksheetBackground(name, sheetName, png, folder,null);
//
//        // TODO: test validations
//    }
    
    /**
     * Add worksheet&#39;s cell comment.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPutWorkSheetCommentTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "C1";
        Comment comment = new Comment ();
        comment.setAuthor ( "roy");
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        CommentResponse response = api.cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder,null);

        // TODO: test validations
    }
    
    /**
     * Set freeze panes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsWorksheetsPutWorksheetFreezePanesTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        Integer column = 1;
        Integer freezedRows = 4;
        Integer freezedColumns = 5;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder,null);

        // TODO: test validations
    }
    
}
