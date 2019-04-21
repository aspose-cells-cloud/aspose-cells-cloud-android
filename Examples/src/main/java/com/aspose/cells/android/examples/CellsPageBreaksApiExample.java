package com.aspose.cells.android.examples;

import com.aspose.cloud.cells.api.CellsPageBreaksApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.HorizontalPageBreakResponse;
import com.aspose.cloud.cells.model.HorizontalPageBreaksResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.VerticalPageBreakResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaksResponse;



public class CellsPageBreaksApiExample {

    private final CellsPageBreaksApi api = new CellsPageBreaksApi();

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivExampleFile = "ExampleCase.xlsx";
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
    
	

    public void cellsPageBreaksDeleteHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder,null);

        // TODO: Example validations
    }
    

    public void cellsPageBreaksDeleteHorizontalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder,null);

        // TODO: Example validations
    }
    

    public void cellsPageBreaksDeleteVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder,null);

        // TODO: Example validations
    }

    public void cellsPageBreaksDeleteVerticalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer column = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        HorizontalPageBreakResponse response = api.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        HorizontalPageBreaksResponse response = api.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        VerticalPageBreakResponse response = api.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetVerticalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        VerticalPageBreaksResponse response = api.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }

    public void cellsPageBreaksPutHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer row = 1;
        Integer column = 1;
        Integer startColumn = 1;
        Integer endColumn = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksPutVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer column = 1;
        Integer row = 1;
        Integer startRow = 1;
        Integer endRow = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder,null);

        System.out.println(response.getCode());
    }
    
}