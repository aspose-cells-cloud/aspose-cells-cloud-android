package com.aspose.cells.android.examples;
import java.util.ArrayList;
import java.util.List;


import com.aspose.cloud.cells.api.CellsListObjectsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.CreatePivotTableRequest;
import com.aspose.cloud.cells.model.DataSorter;
import com.aspose.cloud.cells.model.ListObject;
import com.aspose.cloud.cells.model.ListObjectResponse;
import com.aspose.cloud.cells.model.ListObjectsResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

public class CellsListObjectsApiExample {

    private final CellsListObjectsApi api = new CellsListObjectsApi();

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
    
	
    public void cellsListObjectsDeleteWorksheetListObjectExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listObjectIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsDeleteWorksheetListObject(name, sheetName, listObjectIndex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsListObjectsDeleteWorksheetListObjectsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsDeleteWorksheetListObjects(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsListObjectsGetWorksheetListObjectExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listobjectindex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ListObjectResponse response = api.cellsListObjectsGetWorksheetListObject(name, sheetName, listobjectindex, folder,null);

        System.out.println(response.getCode());
    }

    public void cellsListObjectsGetWorksheetListObjectsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ListObjectsResponse response = api.cellsListObjectsGetWorksheetListObjects(name, sheetName, folder,null);

        // TODO: Example validations
    }
    

    public void cellsListObjectsPostWorksheetListObjectExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listObjectIndex = 0;
        ListObject listObject = new ListObject();
        listObject.setShowHeaderRow(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsPostWorksheetListObject(name, sheetName, listObjectIndex, listObject, folder,null);

        // TODO: Example validations
    }
    

    public void cellsListObjectsPostWorksheetListObjectConvertToRangeExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listObjectIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsPostWorksheetListObjectConvertToRange(name, sheetName, listObjectIndex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsListObjectsPostWorksheetListObjectSortTableExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listObjectIndex = 0;
        DataSorter dataSorter =new DataSorter();
        dataSorter.setCaseSensitive(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsPostWorksheetListObjectSortTable(name, sheetName, listObjectIndex, dataSorter, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTableExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer listObjectIndex = 0;
        String destsheetName =  "Sheet2";
        CreatePivotTableRequest request =  new CreatePivotTableRequest ();
        request.setDestCellName("C1");
        request.setName("Examplep");
        List<Integer> pivotFieldColumns = new ArrayList<Integer>();
        pivotFieldColumns.add(2);
        request.setPivotFieldColumns(pivotFieldColumns);
        List<Integer> pivotFieldRows = new ArrayList<Integer>();
        pivotFieldColumns.add(2);
        request.setPivotFieldRows(pivotFieldRows);
        List<Integer> pivotFieldData = new ArrayList<Integer>();
        pivotFieldColumns.add(2);
        request.setPivotFieldData(pivotFieldData);
        request.setSourceData("=Sheet2!A1:E8");
        request.setUseSameSource(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(name, sheetName, listObjectIndex, destsheetName, request, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsListObjectsPutWorksheetListObjectExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET7;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer endRow = 6;
        Integer endColumn = 6;
        String folder = TEMPFOLDER;
        Boolean hasHeaders = null;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ListObjectResponse response = api.cellsListObjectsPutWorksheetListObject(name, sheetName, startRow, startColumn, endRow, endColumn, folder,null, hasHeaders);

        System.out.println(response.getCode());
    }
    
}