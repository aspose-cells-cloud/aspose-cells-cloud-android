package com.aspose.cells.android.examples;
import com.aspose.cloud.cells.api.CellsChartAreaApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.ChartAreaResponse;
import com.aspose.cloud.cells.model.FillFormatResponse;
import com.aspose.cloud.cells.model.LineResponse;

 public class CellsChartAreaApiExample {

	private final CellsChartAreaApi api = new CellsChartAreaApi();

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

	public void cellsChartAreaGetChartAreaExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		ChartAreaResponse response = api.cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder, null);

		System.out.println(response);

	}

	public void cellsChartAreaGetChartAreaBorderExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		LineResponse response = api.cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder, null);

		System.out.println(response);
	}

	public void cellsChartAreaGetChartAreaFillFormatExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		FillFormatResponse response = api.cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder,
				null);

		System.out.println(response);

	}

}