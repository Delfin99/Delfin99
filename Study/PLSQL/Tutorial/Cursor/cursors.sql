PL/SQL Cursors

In PL/SQL, Cursor area also saying session cursor because session cursor store information until the session end.
Both way you can manage session cursor either implicit cursor or explicit cursor.

Using procedural statement you can get any information using session attribute.

How to use Cursor

In PL/SQL block SELECT statement can not return more than one row at a time. So Cursor use to some group of rows
(more than one row) for implementing certain logic to get all the group of records.

Classification of Cursors

1. Implicit Cursor or Internal Cursor: Manage for Oracle itself or internal process itself.

2. Explicit Cursor or User-defined Cursor: Manage for user/programmer or external processing.

Implicit Cursor

Oracle uses implicit cursors for its internal processing. Even if we execute a SELECT statement or DML statement Oracle 
reserves a private SQL area in memory called cursor.

