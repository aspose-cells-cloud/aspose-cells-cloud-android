![](https://img.shields.io/badge/REST%20API-v3.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/aspose-cells-cloud/aspose-cells-cloud-android)](https://github.com/aspose-cells-cloud/aspose-cells-cloud-android/blob/master/LICENSE)

# Android Cloud SDK for Spreadsheet Processing

Android Cloud SDK wraps Aspose.Cells Cloud API. The SDK enhances your Android apps to [process & manipulate Microsoft Excel spreadsheets](https://products.aspose.cloud/cells/android) in the cloud, without requiring Microsoft Office®.

## Excel® File Manipulation in the Cloud

- Create Excel files from scratch via API or [Smart Markers](https://docs.aspose.cloud/cells/create-excel-workbook-from-a-smartmarker-template/).
- Load, process & [convert Excel files](https://docs.aspose.cloud/cells/convert-excel-workbook-to-different-file-formats/) via Cloud SDK.
- Add, update or delete worksheet, charts, pictures, shapes, hyperlinks & validations.
- Add or remove cells area for conditional formatting from Excel worksheets.
- Insert or delete, horizontal or vertical page breaks.
- Add ListObject or convert ListObjects to a range of cells.
- Summarize data with [Pivot Tables](https://docs.aspose.cloud/cells/working-with-pivot-tables/) & Excel charts.
- Apply custom criteria to list filters of various types.
- Get, update, show or hide chart legend & titles.
- Manipulate page setup, header & footer.
- Create, update, fetch or delete document properties.
- Fetch the required shape from worksheet.
- Leverage the power of named ranges.

## Read & Write Spreadsheet Formats

**Microsoft Excel:** XLS, XLSX, XLSB, XLSM, XLT, XLTX, XLTM
**OpenOffice:** ODS
**SpreadsheetML:** XML
**Text:** CSV, TSV, TXT (TabDelimited)
**Web:** HTML, MHTML

## Save Spreadsheets As

**Microsoft Excel:** XLS, XLSX, XLSB
**OpenOffice:** ODS
**SpreadsheetML:** XML
**Text:** CSV, TSV, TXT (TabDelimited)
**Web:** HTML, MHTML
**Fixed Layout:** PDF, XPS
**Images:** PNG, JPG, TIFF, SVG
**Markdown:** MD
**Other:** DIF

## Read Other Formats

SXC, FODS

## Integrated Storage API

SDK includes support of storage operations for better user experience and unification. It gives you an ability to;

- Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default).
- Create, copy, move and delete folders.
- Copy and move files and folders across separate storages in scope of a single operation.
- Check if certain file, folder or storage exists.

## Get Started with Aspose.Cells Cloud SDK for Android

First, create an account at [Aspose for Cloud](https://dashboard.aspose.cloud/#/apps) and get your application information. Then, add the following dependency to your project's POM:
```
<repositories>
    <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>https://repository.aspose.cloud/repo/</url>
    </repository>
</repositories>
```
```
<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-cells-cloud-android</artifactId>
        <version>20.9</version>
    </dependency>
</dependencies>
```

## Add Worksheet to an Excel File from Android App

```Java
CellsApi cellsApi = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret())
String name = BOOK1;
String sheetName = SHEET1;
Integer position = 1;
String sheettype ="VB";
String folder = TEMPFOLDER;
cellsApi.uploadFile(folder +"\\" + filename, new File(sourceFolder + filename), null);
WorksheetsResponse response = cellsApi.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder,null);
```

## Convert Excel File in the Cloud

```Java
String name = BOOK1;
SaveOptions saveOptions = null;
String newfilename = "newbook.xlsx";
Boolean isAutoFitRows = true;
Boolean isAutoFitColumns = false;
String folder = TEMPFOLDER;
// Upload source file to aspose cloud storage
cellsApi.uploadFile(folder +"\\" + filename, new File(sourceFolder + filename), null);
// Invoke Aspose.Cells Cloud SDK API to convert excel workbook to different format
SaveResponse response = cellsApi.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder,null);
```

## Aspose.Cells Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Swift | Perl | GO |
|---|---|---|---|---|---|---|---|---|
| [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-dotnet) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-php) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-python)  | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-ruby) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-node)  | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-swift) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-perl) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-go) |
| [NuGet](https://www.nuget.org/packages/Aspose.Cells-Cloud/) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-cells-cloud) | [Composer](https://packagist.org/packages/aspose/cells-sdk-php) | [PIP](https://pypi.org/project/asposecellscloud/)  | [GEM](https://rubygems.org/gems/aspose_cells_cloud) | [NPM](https://www.npmjs.com/package/asposecellscloud) | [POD](https://cocoapods.org/pods/AsposeCellsCloud) |  [CPAN](https://metacpan.org/release/AsposeCellsCloud-CellsApi) | [GO](https://pkg.go.dev/github.com/aspose-cells-cloud/aspose-cells-cloud-go/v20?tab=overview) |

[Product Page](https://products.aspose.cloud/cells/android) | [Documentation](https://docs.aspose.cloud/cells/) | [Live Demo](https://products.aspose.app/cells/family) | [API Reference](https://apireference.aspose.cloud/cells/) | [Code Samples](https://github.com/aspose-cells-cloud/aspose-cells-cloud-android) | [Blog](https://blog.aspose.cloud/category/cells/) | [Free Support](https://forum.aspose.cloud/c/cells) | [Free Trial](https://dashboard.aspose.cloud/#/apps)

