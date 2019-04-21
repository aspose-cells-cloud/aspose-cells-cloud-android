package com.aspose.cells.android.examples;
import java.util.ArrayList;
import java.util.List;

import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Validation;
import com.aspose.cloud.cells.model.ValidationResponse;
import com.aspose.cloud.cells.model.ValidationsResponse;


public class CellsWorksheetValidationsApiExample {

    private final CellsWorksheetValidationsApi api = new CellsWorksheetValidationsApi();

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
    
	
    

    public void cellsWorksheetValidationsDeleteWorkSheetValidationExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsWorksheetValidationsGetWorkSheetValidationExample() throws ApiException {
      	String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsWorksheetValidationsGetWorkSheetValidationsExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ValidationsResponse response = api.cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsWorksheetValidationsPostWorkSheetValidationExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        Validation validation = new Validation();
        
        CellArea area = new CellArea();
        area.setStartRow(0);
        area.setEndRow(0);
        area.setStartColumn(0);
        area.setEndColumn(0);
        List<CellArea> areaList = new ArrayList<CellArea>();
        areaList.add(area);
        validation.setFormula1("=(OR(A1=\"Yes\",A1=\"No\"))");
        validation.setType("Custom");
        validation.setIgnoreBlank(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder,null);
        System.out.println(response.getCode());
    }
    

    public void cellsWorksheetValidationsPutWorkSheetValidationExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String range = RANGE;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, folder,null);

        System.out.println(response.getCode());
    }
    
}