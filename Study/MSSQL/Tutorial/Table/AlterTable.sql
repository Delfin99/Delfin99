-- Add New Column

Alter table [Customer] Add [Education] varchar(50) Null

-- Delete Column

Alter table [Customer] Drop column Profession

-- Change Column Data type

Alter Table [Customer] Alter Column Education nvarchar(75)

Alter Table [Customer] Alter Column Education nvarchar(75) Not Null

-- Add Primary Key

Alter Table [Customer] Add Constraint Customer_PK Primary Key ([CustomerKey])

-- Drop Primary constraint

Alter Table [Customer] Drop Constraint [Customer_PK]


