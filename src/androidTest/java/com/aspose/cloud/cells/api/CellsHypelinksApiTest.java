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


import com.aspose.cloud.cells.model.Hyperlink;
import com.aspose.cloud.cells.model.HyperlinkResponse;
import com.aspose.cloud.cells.model.HyperlinksResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

/**
 * API tests for CellsHypelinksApi
 */

public class CellsHypelinksApiTest {

    private  CellsApi api ;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "JavaTest";
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
    
	
    public CellsHypelinksApiTest(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
     * Delete worksheet hyperlink by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksDeleteWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);
        Assert.assertEquals("cellsHypelinksDeleteWorkSheetHyperlinkTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Delete all hyperlinks in worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksDeleteWorkSheetHyperlinksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder,null);
        Assert.assertEquals("cellsHypelinksDeleteWorkSheetHyperlinksTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Get worksheet hyperlink by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksGetWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        HyperlinkResponse response = api.cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);
        Assert.assertEquals("cellsHypelinksGetWorkSheetHyperlinkTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Get worksheet hyperlinks.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksGetWorkSheetHyperlinksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        HyperlinksResponse response = api.cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder,null);
        Assert.assertEquals("cellsHypelinksGetWorkSheetHyperlinksTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Update worksheet hyperlink by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksPostWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setAddress( "http://www.aspose.com");
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        HyperlinkResponse response = api.cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder,null);
        Assert.assertEquals("cellsHypelinksPostWorkSheetHyperlinkTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
    /**
     * Add worksheet hyperlink.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsHypelinksPutWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstRow = 1;
        Integer firstColumn = 1;
        Integer totalRows = 2;
        Integer totalColumns = 3;
        String address = "http://wwww.aspose.com";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        HyperlinkResponse response = api.cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder,null);
        Assert.assertEquals("cellsHypelinksPutWorkSheetHyperlinkTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }
    
}
