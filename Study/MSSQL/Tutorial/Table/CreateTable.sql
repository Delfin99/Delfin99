-- Creating a table 

Use [SQL Tutorial]
Go

Create table [Customer] 
{
	[CustomerKey]	[int] not null,
	[Name]	[varchar](150)	null,
	[DateOfBirth] [date] null,
	[EmaillAddress] [nvarchar](50) null,
	[Profession] [nvarchar](100) null
}
Go

-- Identity Column

e.g.

	[CustomerKey] [int] Identity(1, 1) Not Null

This will auto-generate numbers starting with 1 and incremented by 1.

-- Primary Key

-- Unique Key

e.g.

	[LastName] [varchar](50) Not Null Unique

The last Name will accept Unique values

-- Default Constraint

	[Profession] [nvarchar](100) Not Null Default ('Software Developer')

If the user does not provide a value to the Profession column then SQL writes Software Developer as the default value

-- Check Constraint

	..
	[Age] [int] Null,
	..
	..
	Constraint CK_Customer_Age Check ([Age] > 0 And [Age] <= 100)

Check constraint check whether the Age value is between 0 and 100

-- Creating Table using Another Table

Select .... Into .... From ...

Select Into Statement to create a table using an existing table along with data.
