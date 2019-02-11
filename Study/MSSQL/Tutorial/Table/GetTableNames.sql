-- Query to get SQL Server Database Table Names
-- 'INFORMATION_SCHEMA.TABLES'
Use [DatabaseName]
Go
Select * from Information_Schema.Tables

-- Where clause
-- to restrict the list of table names
Use [DatebaseName]
Go
Select Table_Name From Information_schema.tables Where Table_type = 'Base_Table'

-- 'sys.objects'
Use [DatabaseName]
Go
Select name, create_date, modify_date From sys.objects Where type_desc = 'User_Table'

-- 'sys.tables'
Use [DatabaseName]
Go
Select * From sys.tables
