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

import java.io.File;

import com.aspose.cloud.cells.model.OleObject;
import com.aspose.cloud.cells.model.OleObjectResponse;
import com.aspose.cloud.cells.model.OleObjectsResponse;
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
 * API tests for CellsOleObjectsApi
 */

public class CellsOleObjectsApiTest {

	private CellsApi api;

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

	public CellsOleObjectsApiTest() {
		try {
			api = new CellsApi(CellsApiUtil.GetClientId(),
					CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete OLE object.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsDeleteWorksheetOleObjectTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer oleObjectIndex = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsOleObjectsDeleteWorksheetOleObject(name, sheetName,
						oleObjectIndex, folder, null);
		Assert.assertEquals(
				"cellsOleObjectsDeleteWorksheetOleObjectTest is OK.", "OK",
				response.getStatus());
		// TODO: test validations
	}

	/**
	 * Delete all OLE objects.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsDeleteWorksheetOleObjectsTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName,
						folder, null);
		Assert.assertEquals(
				"cellsOleObjectsDeleteWorksheetOleObjectsTest is OK.", "OK",
				response.getStatus());
		// TODO: test validations
	}

	/**
	 * Get OLE object info.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsGetWorksheetOleObjectTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer objectNumber = 0;
		String format = null;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		File response = api.cellsOleObjectsGetWorksheetOleObject(name,
				sheetName, objectNumber, format, folder, null);

		// TODO: test validations
	}

	/**
	 * Get worksheet OLE objects info.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsGetWorksheetOleObjectsTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		OleObjectsResponse response = api
				.cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder,
						null);
		Assert.assertEquals("cellsOleObjectsGetWorksheetOleObjectsTest is OK.",
				"OK", response.getStatus());
		// TODO: test validations
	}

	/**
	 * Update OLE object.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsPostUpdateWorksheetOleObjectTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer oleObjectIndex = 0;
		OleObject ole = new OleObject();
		ole.setLeft(10);
		ole.setTop(10);
		ole.setHeight(100);
		ole.setWidth(90);
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName,
						oleObjectIndex, ole, folder, null);
		Assert.assertEquals(
				"cellsOleObjectsPostUpdateWorksheetOleObjectTest is OK.", "OK",
				response.getStatus());
		// TODO: test validations
	}

	/**
	 * Add OLE object
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsOleObjectsPutWorksheetOleObjectTest() throws ApiException {
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
		CellsApiUtil.Upload(api, folder, name);
		CellsApiUtil.Upload(api, folder,imageFile);
		CellsApiUtil.Upload(api,folder, oleFile);
		OleObjectResponse response = api.cellsOleObjectsPutWorksheetOleObject(
				name, sheetName, oleObject, upperLeftRow, upperLeftColumn,
				height, width, folder+"/"+oleFile, folder+"/"+imageFile, folder, null);
		Assert.assertEquals("cellsOleObjectsPutWorksheetOleObjectTest is OK.",
				"OK", response.getStatus());
		// TODO: test validations
	}

}
