PL/SQL Transaction Commit, Rollback, Savepoint, Autocommit, Set Transaction

Oracle PL/SQL transaction oriented language. Oracle transactons provides a data integrity. PL/SQL trasaction is a series of SQL data manipulation statments 
that are work logical unit. Transaction is an atomic unit all changes either committed or rollback.

At the end of the transaction that makes database changes, Oracle makes all the changes permanent save or may be undone. If your program fails in the middle 
of a transaction, Oracle detect the error and rollback the transaction and restoring the database.

1. COMMIT: COMMIT command to make changes permanent save to a database during the current transaction.

2. ROLLBACK: ROLLBACK command execute at the end of current transaction and undo/undone any changes made since the begin transaction.

3. SAVEPOINT: SAVEPOINT command save the current point with the unique name in the processing of a transaction.

4. AUTOCOMMIT: Set AUTOCOMMIT ON to execute COMMIT Statment automatically.

5. SET TRANSACTION: PL/SQL SET TRANSACTION command set the transaction properties such as read-write/read only access.

Commit

the COMMIT statement to make changes permanent save to a database during the current transaction and visible to other users,

Commit Syntax

	commit [comment "comment text"];

Commit comments are only supported for backward compatibility. In a future release commit comment will come to a deprecated.

Commit Example

	begin
	update emp_information set emp_dept = 'Web Developer' where emp_name = 'Saulin';
	commit;
	end;

Rollback

the ROLLBACK statement ends the current transaction and undoes any changes made during that transaction. If you make a mistake, such as deleting the wrong row 
from a table, a rollback restores the original data. If you cannot finish a transaction because an exception is raised or a SQL statement fails, a rollback lets
you take corrective action and perhaps start over.

ROLLBACK Syntax

	rollback [To SAVEPOINT_NAME];

ROLLBACK Example

	declare
		emp_id	emp.empno%TYPE;
	begin
		savepoint dup_found;
		update emp set eno = 1 where empname = 'Forbs ross';
	exception
		when dup_val_on_index then
			rollback to dup_found;
	end;

Above example statement is exception raised because eno = 1 is already so DUP_ON_INDEX exception rise and rollback to the dup_found savepoint named.

Savepoint

SAVEPOINT savepoint_names marks the current point in the processing of a transaction. Savepoints let you rollback part of a transaction instead of the whole transaction.

SAVEPOINT Syntax

	savepoint savepoint_name;

SAVEPOINT Example

	declare
		emp_id	emp.empno%TYPE;
	begin
		savepoint dup_found;
		update emp set eno = 1 where empname = 'Forbs ross';
	exception
		when dup_val_on_index then
			rollback to dup_found;
	end;


Autocommit

No need to execute COMMIT statment every time. You just set AUTOCOMMIT ON to execute COMMIT Statment automatically. It is automatic execute for each DML statment.
set auto commit on using following statement.

AUTOCOMMIT Example

	set autocommit on;

You can also set auto commit off,

	set autcommit off;


Set Transaction

SET TRANSACTION statment is used to set transaction are read-only or both read write. you can also assign transaction name.

SET TRANSACTION Syntax

	set transaction [read only | read write] [NAME 'transaction_name'];

Set transacton name using the SET TRANSACTION[...] NAME statement before you start the transaction.

SET TRANSACTION Example

	set transaction read write name 'tran_exp';




