package com.aspose.cells.android.examples;
import java.util.ArrayList;
import java.util.List;

import com.aspose.cloud.cells.api.CellsTaskApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.SplitWorkbookTaskParameter;
import com.aspose.cloud.cells.model.TaskData;
import com.aspose.cloud.cells.model.TaskDescription;

public class CellsTaskApiExample {

	private final CellsTaskApi api = new CellsTaskApi();

	private String BOOK1 = "Book1.xlsx";
	private String MYDOC = "myDocument.xlsx";
	private String PivTestFile = "TestCase.xlsx";
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

	public void cellsTaskPostRunTaskExample() throws ApiException {
		String name = BOOK1;

		String folder = TEMPFOLDER;
		TaskData taskData = new TaskData();
		List<TaskDescription> tasks = new ArrayList<TaskDescription>();
		TaskDescription task1 = new TaskDescription();
		task1.setTaskType("SplitWorkbook");

		SplitWorkbookTaskParameter param1 = new SplitWorkbookTaskParameter();
		param1.setDestinationFileFormat("xlsx");

		FileSource fs = new FileSource();
		fs.setFilePath(TEMPFOLDER);
		fs.setFileSourceType("CloudFileSystem");
		param1.setDestinationFilePosition(fs);
		param1.setSplitNameRule("sheetname");
		FileSource ds = new FileSource();
		ds.setFilePath(TEMPFOLDER + "\\" + BOOK1);
		ds.setFileSourceType("CloudFileSystem");
		param1.setWorkbook(ds);

		task1.setTaskParameter(param1);
		tasks.add(task1);
		taskData.setTasks(tasks);
		taskData.getTasks().add(task1);
		api.setApiClient(CellsApiUtil.Ready(folder, name));
		Object response = api.cellsTaskPostRunTask(taskData);

		System.out.println(response.toString());
	}

}