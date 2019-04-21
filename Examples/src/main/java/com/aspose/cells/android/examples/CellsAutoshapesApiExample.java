package com.aspose.cells.android.examples;
import java.io.File;

import com.aspose.cloud.cells.api.CellsAutoshapesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AutoShapesResponse;


public class CellsAutoshapesApiExample {

    private final CellsAutoshapesApi api = new CellsAutoshapesApi();

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
    
	

    public void cellsAutoshapesGetWorksheetAutoshapeExample() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET2;
        Integer autoshapeNumber = 4;
        String format = "png";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        File response = api.cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format,folder,null);

        
    }
    

    public void cellsAutoshapesGetWorksheetAutoshapesExample() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET2;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        AutoShapesResponse response = api.cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder,null);
        
        System.out.println(response.getCode());
    }
    
}