# Exporting query result to excel (Windows)

$server = "localhost"
$db = "TestDB"
# $path = "C:/Users/Jeong/Delfin99/Delfin99/Study/Powershell/excel/Exporing/test.xlsx" #Windows
$path = "C:\Users\Jeong\Delfin99\Delfin99\Study\Powershell\excel\Exporting\excel.xlsx" #Windows

function ExportExcel {

    Write-Host "Exporting Query Result"

    $excel = New-Object -ComObject Excel.Application

    $workbook = $excel.Workbooks.Add()
    $worksheetA = $workbook.Worksheets.Add()

    $sheetA = $workbook.worksheets.Item(1)
    $sheetA.Name = "Test"

    $dataSet = New-Object "System.Data.DataSet" "Test"

    $connect = New-Object System.Data.SqlClient.SqlConnection "server=$server;database=$db;Integrated Security=sspi"
    $query = "select id, name from Person"

    $adapter = New-Object "System.Data.SqlClient.SqlDataAdapter" ($query, $connect)
    $adapter.Fill($dataSet) | Out-Null

    $connect.Close()

    $dataTable = New-Object "System.Data.DataTable" "Test"
    $dataTable = $dataSet.Tables[0]
	
	$columns = $dataTable.Columns | select ColumnName 
	
	$y_axis = 2
	foreach ($col in $columns) {
		$sheetA.Cells.Item(2, $y_axis).Font.Bold = $True
		$sheetA.Cells.Item(2, $y_axis) = $col.ColumnName.ToUpper()
		$y_axis++
	}

    $x_axis = 3
    $dataTable | ForEach-Object {
        $sheetA.Cells.Item($x_axis, 2) = $_.id
        $sheetA.Cells.Item($x_axis, 3) = $_.name
        $x_axis++
    }

    
	$sheetA.Range("B2", "C2").Interior.ColorIndex = 37
	$sheetA.Range("B2", "C2").BorderAround(1, 2, 5)
	$range = $sheetA.UsedRange
	$range.HorizontalAlignment = -4108
	$range.BorderAround(1, 2, 5)
    $range.EntireColumn.AutoFit()
	
	Remove-Item -Path $path | Where-Object {$_.name -eq "excel.xlsx"}

    $excel.ActiveWorkbook.SaveAs("$path")
    $excel.quit()
}

ExportExcel
