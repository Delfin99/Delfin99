PL/SQL Exceptions - Built in Exceptions

PL/SQL exceptions are predefined and raised automatically into oracle engine when any error occur during a program. 

Each and every error has defined a unique number and message. When warning/error occur in program it is called an exception to contain information about the error.

In PL/SQL built in exceptions or you make user define exception. Examples of built-in type(internally) defined exceptions division by zero, out of memory. Some common 
built-in exceptions have predefined names such as ZERO_DIVIED and STORAGE_ERROR.

Normally when exception is fire, execution stops and control transfers to the exception-handling part of your PL/SQL block. Internal exceptions are raised implicitly 
(automatically) by the run-time system. User-defined exceptions must be raised explicitly by RAISE statements, which are also raise predefined exceptions.

PL/SQL exceptions consist following three, 

1. Exception Type 

2. Error Code

3. Error Message 

Syntax

	declare 
		declaration statements(s);
	begin
		statment(s);
	exception
		when built-in_exception_name_1 then
			User defined statement(action) will be taken;
		when built-in_exception_name_2 then
			User defined statement(action) will be taken;
	end;

Example

	declare
		temp enum%rowtype;
	begin
		select * into temp from enum where eno = 3;
	exception
		when no_data_found then
			dbms_output.put_line("Table haven't data");
	end;