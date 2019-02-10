There is a standard stored procedure called 'SP_RENAME' to rename column name 

-- Syntax for SQL Server rename column Name is:
SP_RENAME '[Table Name].[Old Column Name]', '[New Column Name]', 'COLUMN'

e.g.

	SP_RENAME 'Customer.YearlyIncome', 'Income', 'COLUMN'

-- Also, SSMS
