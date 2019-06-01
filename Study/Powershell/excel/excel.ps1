# Exporting query result to excel

$server = "localhost"
$db = "BikeStores"
$path = "/Users/jeong/Delfin99/Study/Powershell/excel/Exporing/test.xlsx"

function ExportExcel {

    Write-Host "Exporting Query Result"

    $excel = New-Object -COMObject Excel.Application

    $workbook = $excel.Workbooks.Add()
    $worksheetA = $workbook.Worksheets.Add()

    $sheetA = $workbook.worksheets.Item(1)
    $sheetA.Name = "Test"

    $dataSet = New-Object "System.Data.DataSet" "Test"

    $connect = New-Object System.Data.SqlClient.SqlConnection "server=$server;database=$db;Integrated Security=sspi"
    $query = "select first_name, last_name from sales.customers"

    $adapter = New-Object "System.Data.SqlClient.SqlDataAdapter" ($query, $connect)
    $adapter.Fill($dataSet) | Out-Null

    $connect.Close()

    $dataTable = New-Object "System.Data.DataTable" "Test"
    $dataTable = $dataSet.Tables[0]

    $x_axis = 2
    $dataTable | ForEach-Object {
        $sheetA.Cells.Item($x_axis, 2) = $_.first_name
        $sheetA.Cells.Item($x_axis, 3) = $_.last_name
        $x_axis++
    }

    $range = $sheetA.UsedRange
    $range.EntrieColumn.AutoFit()

    $excel.ActiveWorkbook.SaveAs("$path")
    $excel.quit()
}

ExportExcel
