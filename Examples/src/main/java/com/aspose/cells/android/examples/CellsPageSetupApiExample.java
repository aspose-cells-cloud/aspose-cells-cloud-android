package com.aspose.cells.android.examples;
import com.aspose.cloud.cells.api.CellsPageSetupApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.PageSectionsResponse;
import com.aspose.cloud.cells.model.PageSetup;
import com.aspose.cloud.cells.model.PageSetupResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

/**
 * API Examples for CellsPageSetupApi
 */

public class CellsPageSetupApiExample {

    private final CellsPageSetupApi api = new CellsPageSetupApi();

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
    
	
    

    public void cellsPageSetupDeleteHeaderFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupDeleteHeaderFooter(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupGetFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetFooter(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupGetHeaderExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetHeader(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupGetPageSetupExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        PageSetupResponse response = api.cellsPageSetupGetPageSetup(name, sheetName, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupPostFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 0;
        String script = "Example";
        Boolean isFirstPage = true;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupPostHeaderExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 1;
        String script ="trst";
        Boolean isFirstPage = false;
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder,null);

        System.out.println(response.getCode());
    }
    

    public void cellsPageSetupPostPageSetupExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        PageSetup pageSetup =new PageSetup();
        pageSetup.setBlackAndWhite(true);
        String folder = TEMPFOLDER;
		api.setApiClient( CellsApiUtil.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder,null);

        System.out.println(response.getCode());
    }
    
}