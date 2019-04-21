package com.aspose.cells.android.examples;


import com.aspose.cloud.cells.api.CellsAutoFilterApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AutoFilterResponse;
import com.aspose.cloud.cells.model.CellsColor;
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.ColorFilterRequest;
import com.aspose.cloud.cells.model.SaaSposeResponse;

public class CellsAutoFilterApiExamples {

	private final CellsAutoFilterApi api = new CellsAutoFilterApi();

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

	public void cellsAutoFilterDeleteWorksheetDateFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer fieldIndex = 1;
		String dateTimeGroupingType = "Day";
		Integer year = 2010;
		Integer month = 10;
		Integer day = 1;
		Integer hour = 1;
		Integer minute = 1;
		Integer second = 1;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex,
				dateTimeGroupingType, year, month, day, hour, minute, second, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterDeleteWorksheetFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer fieldIndex = 1;
		String criteria = "Example";
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria,
				folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterGetWorksheetAutoFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		AutoFilterResponse response = api.cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPostWorksheetAutoFilterRefreshExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPostWorksheetMatchBlanksExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer fieldIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder,
				null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPostWorksheetMatchNonBlanksExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer fieldIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder,
				null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetColorFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		ColorFilterRequest colorFilter = new ColorFilterRequest();
		Color color = new Color();
		color.setR(255);
		color.setG(245);
		CellsColor cellsColor = new CellsColor();
		cellsColor.setColor(color);
		colorFilter.setForegroundColor(cellsColor);
		colorFilter.setPattern("Solid");
		Boolean matchBlanks = true;
		Boolean refresh = true;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex,
				colorFilter, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetCustomFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		String operatorType1 = "LessOrEqual";
		String criteria1 = "Example";
		Boolean isAnd = false;
		String operatorType2 = "LessOrEqual";
		String criteria2 = "Example";
		Boolean matchBlanks = true;
		Boolean refresh = false;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex,
				operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetDateFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		String dateTimeGroupingType = "Day";
		Integer year = 2010;
		Integer month = 10;
		Integer day = 1;
		Integer hour = 1;
		Integer minute = 1;
		Integer second = 1;
		Boolean matchBlanks = true;
		Boolean refresh = null;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex,
				dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetDynamicFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		String dynamicFilterType = "May";
		Boolean matchBlanks = true;
		Boolean refresh = true;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex,
				dynamicFilterType, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		String criteria = "Example";
		Boolean matchBlanks = true;
		Boolean refresh = true;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria,
				matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetFilterTop10Example() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		Boolean isTop = true;
		Boolean isPercent = true;
		Integer itemCount = 1;
		Boolean matchBlanks = null;
		Boolean refresh = null;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex,
				isTop, isPercent, itemCount, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsAutoFilterPutWorksheetIconFilterExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String range = RANGE;
		Integer fieldIndex = 0;
		String iconSetType = "None";
		Integer iconId = 0;
		Boolean matchBlanks = null;
		Boolean refresh = null;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		SaaSposeResponse response = api.cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex,
				iconSetType, iconId, matchBlanks, refresh, folder, null);

		System.out.println(response.getCode());
	}

}