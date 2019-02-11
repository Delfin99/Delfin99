PL/SQL User Defined Exception

PL/SQL user defined exception to make your own exception. PL/SQL give you control to make your own exception base on oracle rules. User defined exception must be declared
yourself and RAISE statement to raise explicitly.

How to Define Exception

1. Declare exception

	You have to declare user defined exception name in DECLARE block.

		user_define_exception_name EXCEPTION;

	Exception and Variable both are same way declaring but exception use for store error condition not a storage item.

2. RAISE exception

	RAISE statement to raised defined exception name and control transfer to a EXCEPTION block.

		RAISE user_define_exception_name;

3. Implement exception condition

	In PL/SQL EXCEPTION block add WHEN condition to Implement user define action.

		WHEN user_define_exception_name then 
			User defined statement(action) will be taken;

Syntax

Check this user defined exception syntax,

	declare
		user_define_exception_name EXCEPTION;
	begin
		statement(s);
		if condition then
			RAISE user_define_exception_name;
		end if;
	exception
		when user_define_exception_name then
			User defined statement(action) will be taken;
	end;

Example

	declare
		myex EXCEPTION;
		i number;
	begin
		for i in (select * from enum) loop 
			if i.eno = 3 then
				RAISE myex;
			end if;
		end loop;
	exception
		when myex then
			dbms_output.put_line('Employee number already exist in enum table.');
	end;
