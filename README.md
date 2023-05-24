## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

#project back up database

1-config server and connect to him
2-list all databases
3-select db
4-list tables
5-select a table
6-backup table in a scv file

ip=127.0.0.1
port=3306
user=root
password=
database=
table=
column=
row=

/\*
#project back up database

1-config server and connect to him
2-list all databases
3-select db
4-list tables
5-select a table
6-backup table in a scv file

------------------------------stepse of best practest--------------------------

1- logic for search and select (database, table, columns, rows) from server
->folder name : server
2- logic for backup table in a scv file
->folder name : backup

3-ui logic
->folder name : view

server
-server.java -> connect to server and get all databases
-database.java -> get all tables
-table.java
-column.java
-row.java

backup
-backup.java

view
-view.java
-view.fxml

app.java

------------------------------enviroment variables--------------------------
database name : db
table name : tb
column name : cl
row name : rw

dire of this file : C:\Users\moham\Desktop\java\java\src
name of this file : .env
content of this file :
ip=
port=
db=database
tb=table
cl=column
rw=row

------------------------------what i need to connerct to another server-------------------------- (not localhost)
1- ip address of server
2- port of server

where i must add this variables ? -> in .env file

\*/
