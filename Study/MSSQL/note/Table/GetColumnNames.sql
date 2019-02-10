-- 'INFORMATION_SCHEMA.COLUMNS'
Use [DatebaseName]
Go
Select Column_Name From Information_schema.columns Where Table_Name = N'NewCustomers'

-- 'sys.columns'
Select name From sys.columns Where OBJECT_ID = OBJECT_ID('NewCustomers')

-- 
Select * From sys.columns Where Object_id = Object_id('NewCustomers')
