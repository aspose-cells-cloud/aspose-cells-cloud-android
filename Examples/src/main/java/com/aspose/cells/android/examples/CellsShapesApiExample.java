package com.aspose.cells.android.examples;


import com.aspose.cloud.cells.api.CellsShapesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Shape;
import com.aspose.cloud.cells.model.ShapeResponse;
import com.aspose.cloud.cells.model.ShapesResponse;


public class CellsShapesApiExample {

    private final CellsShapesApi api = new CellsShapesApi();

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
    
	
    

    public void cellsShapesDeleteWorksheetShapeExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer shapeindex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsShapesDeleteWorksheetShapesExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsShapesDeleteWorksheetShapes(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsShapesGetWorksheetShapeExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer shapeindex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ShapeResponse response = api.cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsShapesGetWorksheetShapesExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ShapesResponse response = api.cellsShapesGetWorksheetShapes(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsShapesPostWorksheetShapeExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET6;
        Integer shapeindex = 0;
        Shape dto = new Shape();
        dto.setLowerRightColumn(10);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsShapesPutWorksheetShapeExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String drawingType = "button";
        Integer upperLeftRow = 1;
        Integer upperLeftColumn = 1;
        Integer top = 10;
        Integer left = 10;
        Integer width = 100;
        Integer height = 90;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ShapeResponse response = api.cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow, upperLeftColumn, top, left, width, height, folder,null);

        System.out.println(response.getCode());
    }
    
}