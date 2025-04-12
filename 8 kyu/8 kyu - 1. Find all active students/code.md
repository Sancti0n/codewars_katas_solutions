Create a simple SELECT query to display student information of all ACTIVE students.

TABLE STRUCTURE:
students
Id (integer) 	FirstName (text) 	LastName (text) 	IsActive (boolean)

IsActive (true = 1 or false = 0)
see specification: https://www.sqlite.org/datatype3.html

## SQL
```sql
SELECT * FROM students WHERE ISActive == 1
```