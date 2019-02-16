How to start SQL Server with docker

1. Starts a docker(or Visual Studio Code terminal)

	- On terminal, type 'open -a docker'

2. Login 

	- Types 'docker login'

	- ID: gokos7
	
	- Password: gokos7lovepp

3. Starts mssql container

	- Types 'docker start mssql'

4-1. For bash mode,

	- Types 'docker exec -it mssql /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'gokos7Lovepp_7'

4-2. For GUL mode,

	- Opens a Visual Studio Code 

	- Creates a new file

	- Selects a SQL 

		- Types shortcut 'command + k > m' and types 'sql'

	- Connects to SQL Server

		- Press 'command + shift + p' 

		- Types keyword 'sql connect' 

		- Selects a connect profile

5. Stop

	- Types 'docker stop mssql'

6. Logout

	- Types 'docker logout'


