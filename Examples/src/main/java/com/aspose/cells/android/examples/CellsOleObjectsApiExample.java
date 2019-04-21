package com.aspose.cells.android.examples;
import java.io.File;


import com.aspose.cloud.cells.api.CellsOleObjectsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.OleObject;
import com.aspose.cloud.cells.model.OleObjectResponse;
import com.aspose.cloud.cells.model.OleObjectsResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

public class CellsOleObjectsApiExample {

    private final CellsOleObjectsApi api = new CellsOleObjectsApi();

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
    

    public void cellsOleObjectsDeleteWorksheetOleObjectExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer oleObjectIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsOleObjectsDeleteWorksheetOleObject(name, sheetName, oleObjectIndex, folder,null);
        
        System.out.println(response.getCode());

    }
    

    public void cellsOleObjectsDeleteWorksheetOleObjectsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName, folder,null);
        System.out.println(response.getCode());
    }
    

    public void cellsOleObjectsGetWorksheetOleObjectExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer objectNumber = 0;
        String format = null;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        File response = api.cellsOleObjectsGetWorksheetOleObject(name, sheetName, objectNumber,format, folder,null);

        // TODO: Example validations
    }

    public void cellsOleObjectsGetWorksheetOleObjectsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        OleObjectsResponse response = api.cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder,null);
        System.out.println(response.getCode());

    }
    

    public void cellsOleObjectsPostUpdateWorksheetOleObjectExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer oleObjectIndex = 0;
        OleObject ole = new OleObject();
        ole.setLeft(10);
        ole.setTop(10);
        ole.setHeight(100);
        ole.setWidth(90);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName, oleObjectIndex, ole, folder,null);

        System.out.println(response.getCode());
    }

    public void cellsOleObjectsPutWorksheetOleObjectExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        OleObject oleObject = null;
        Integer upperLeftRow = 1;
        Integer upperLeftColumn = 1;
        Integer height = 100;
        Integer width = 10;
        String oleFile = "OLEDoc.docx";
        String imageFile = "word.jpg";
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        OleObjectResponse response = api.cellsOleObjectsPutWorksheetOleObject(name, sheetName, oleObject, upperLeftRow, upperLeftColumn, height, width, oleFile, imageFile, folder,null);
        
        System.out.println(response.getCode());
    }
    
}