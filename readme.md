

### This is for my reading perspose

```syntax
SHOW DATABASES;
```
| Database           |
|:-----|
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |

###### 6 rows in set (0.00 sec)
* * *

### The MySQL CREATE DATABASE Statement
```syntax
CREATE DATABASE freshclass;
```
```syntax
SHOW DATABASES;
```
| Database           |
|:----|
| freshclass         |
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |

###### 7 rows in set (0.01 sec)
* * *

### The MySQL USE DATABASE Statement
```syntax
USE freshclass;
```
###### Database changed
* * *

### The MySQL CREATE TABLE Statement
```syntax
 CREATE TABLE studentslist(Id int primary key auto_increment, Firstname varchar(255) NOT NULL, Lastname varchar(255) NOT NULL,Email varchar(255) UNIQUE NOT NULL, Age int(2) NOT NULL, dateofbirth date NOT NULL);
```
###### Query OK, 0 rows affected, 1 warning (0.04 sec)
* * *

### The MySQL SHOW TABLES Statement
```syntax
SHOW TABLES;
```
| Tables_in_freshclass |
|:----|
| studentslist         |

###### 1 row in set (0.01 sec)
* * *
### The MySQL DESCRIBE TABLE Statement
```syntax
DESC studentslist;
```
```syntax
DESCRIBE studentslist;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:----|:----|:----:|:----:|:----:|:----|
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Lastname    | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |

###### 6 rows in set (0.01 sec)
* * *

### The MySQL INSERT INTO Statement

```syntax
INSERT INTO studentslist (Firstname,Lastname,Email,Age,dateofbirth) VALUES ('Prasanna','venkatesh','prasanna@freshclass.com','21','2001-01-20');
```

###### Query OK, 1 row affected (0.00 sec)

```syntax
INSERT INTO studentslist (Firstname,Lastname,Email,Age,dateofbirth) VALUES ('Vimal','raj','vimal@freshclass.com','20','2002-01-20');
```
###### Query OK, 1 row affected (0.01 sec)
* * *

### The MySQL SELECT Statement

```syntax
SELECT * FROM studentslist;
```

| Id | Firstname | Lastname | Email                   | Age | dateofbirth |
|:--:|:----------|:--------:|:------------------------|:---:|:------------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  |
|  2 | Vimal  | raj | vimal@freshclass.com |  20 | 2002-01-20  |

###### 1 row in set (0.01 sec)
* * *

### The MySQL WHERE Clause

```syntax
SELECT * FROM studentslist WHERE Id='1';
```

| Id | Firstname | Lastname | Email                   | Age | dateofbirth |
|:--:|:----------|:---------|:------------------------|:---:|:------------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  |

###### 1 row in set (0.00 sec)
* * *

### The MySQL ALTER TABLE Statement

```syntax
ALTER TABLE studentslist ADD Department varchar(70);
```
###### Query OK, 0 rows affected (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```syntax
ALTER TABLE studentslist MODIFY COLUMN Department char(100);
```
###### Query OK, 2 rows affected (0.06 sec)
###### Records: 2  Duplicates: 0  Warnings: 0

```syntax
DESC studentslist;
```

| Field       | Type         | Null | Key | Default | Extra          |
|:----|:----|:----:|:----:|:----:|:----|
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Lastname    | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
| Department  | char(100)    | YES  |     | NULL    |                |

###### 7 rows in set (0.01 sec)
```syntax
SELECT * FROM studentslist;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | NULL       |
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | NULL       |

###### 2 rows in set (0.00 sec)
* * *

### The MySQL UPDATE Statement

```syntax
 UPDATE studentslist SET Department = "Tech" WHERE Id = 1;
```
###### Query OK, 1 row affected (0.03 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```syntax
SELECT * FROM studentslist;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | NULL       |

###### 2 rows in set (0.00 sec)
* * *

### The MySQL DELETE Statement

```syntax
DELETE FROM studentslist WHERE Id=1;
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
SELECT * FROM studentslist;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:-----------|
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | NULL       |

###### 1 row in set (0.01 sec)
* * *

### The MySQL DROP TABLE Statement

```syntax
DROP TABLE studentslist;
```
###### Query OK, 0 rows affected (0.03 sec)
```syntax
DROP DATABASE freshclass;
```
###### Query OK, 0 rows affected (0.03 sec)
```syntax
SHOW DATABASES;
```
| Database           |
|:-------------------|
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |


###### 6 rows in set (0.02 sec)
* * *

# MySQL Constraints

### NOT NULL

```syntax
 CREATE TABLE Constraints(Firstname varchar(255) NOT NULL);
```

### UNIQUE

```syntax
 CREATE TABLE Constraints(Email varchar(255) UNIQUE);
```

### DEFAULT

```syntax
CREATE TABLE Constraints(Department varchar(255) DEFAULT 'Tech');
```

### CHECK

```syntax
CREATE TABLE Constraints(Age int(2) NOT NULL, CHECK (Age>=21));
```

### PRIMARY KEY

```syntax
CREATE TABLE Constraints(Id int(3) PRIMARY KEY AUTO_INCREMENT);
```

### CREATE TABLE with all Constraints without FOREIGN KEY

```syntax
CREATE TABLE Constraints(Id int(3) PRIMARY KEY AUTO_INCREMENT, Firstname varchar(255) NOT NULL, Lastname varchar(255) NOT NULL, Email varchar(255) UNIQUE, Age int(2) NOT NULL, dateofbirth date NOT NULL, Department varchar(255) DEFAULT 'Tech', CHECK (Age>=21));
```
###### Query OK, 0 rows affected, 2 warnings (0.03 sec)
### INSERT INTO

```syntax
INSERT INTO Constraints(Firstname,Lastname,Email,Age,dateofbirth) VALUES ('Prasanna','venkatesh','prasanna@freshclass.com','21','2001-01-20');
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC Constraints;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:------------|:-------------|:-----|:---:|:-------:|:---------------|
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Lastname    | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | YES  | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
| Department  | varchar(255) | YES  |     | Tech    |                |

###### 7 rows in set (0.01 sec)
### SELECT

```syntax
SELECT * FROM Constraints;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:---|:----------|:---------|:------------------------|:----|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |

###### 1 row in set (0.01 sec)

### FOREIGN KEY

```syntax
CREATE TABLE foreignkey(studId int PRIMARY KEY AUTO_INCREMENT, mark int(3), Id int, FOREIGN KEY(Id) REFERENCES constraints(Id));
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
### INSERT INTO

```syntax
INSERT INTO foreignkey(mark,PersonId) VALUES (100,1);
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC foreignkey;
```

| Field  | Type | Null | Key | Default | Extra |
|:-------|:-----|:-----|:---:|:--------|:------|
| studId | int  | NO   | PRI | NULL    |       |
| mark   | int  | YES  |     | NULL    |       |
| Id     | int  | YES  | MUL | NULL    |       |

###### 3 rows in set (0.00 sec)
### SELECT

```syntax
SELECT * FROM foreignkey;
```
| studId | mark | PersonId |
|:-------|:-----|:---------|
|      1 |  100 |        1 |

###### 1 row in set (0.01 sec)
*  *  *

# MySQL Operators

```syntax
SELECT * FROM studentslist;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | NULL       |

###### 2 rows in set (0.00 sec)

### AND

```syntax
SELECT * FROM studentslist WHERE Department = 'Design' AND Age = 20;
```
| Id | Firstname | Lastname | Email                | Age | dateofbirth | Department |
|:---|:----------|:---------|:---------------------|:----|:------------|:-----------|
|  2 | Vimal     | raj      | vimal@freshclass.com |  20 | 2002-01-20  | Design     |

###### 1 row in set (0.00 sec)

### OR

```syntax
SELECT * FROM studentslist WHERE Department = 'Design' AND Age = 20;
```
| Id | Firstname | Lastname | Email                | Age | dateofbirth | Department |
|:---|:----------|:---------|:---------------------|:----|:------------|:-----------|
|  2 | Vimal     | raj      | vimal@freshclass.com |  20 | 2002-01-20  | Design     |

###### 1 row in set (0.00 sec)

### NOT

```syntax
SELECT * FROM studentslist WHERE NOT Age = 21;
```
| Id | Firstname | Lastname | Email                | Age | dateofbirth | Department |
|:---|:----------|:---------|:---------------------|:----|:------------|:-----------|
|  2 | Vimal     | raj      | vimal@freshclass.com |  20 | 2002-01-20  | Design     |

###### 1 row in set (0.00 sec)

### BETWEEN

```syntax
SELECT * FROM studentslist WHERE Age BETWEEN 20 AND 22;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:---|:----------|:---------|:------------------------|:----|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | Design     |

###### 2 rows in set (0.00 sec)

### IN

```syntax
SELECT * FROM studentslist WHERE Department IN ('Tech');
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:---|:----------|:---------|:------------------------|:----|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |

###### 1 row in set (0.01 sec)

### LIKE

```syntax
SELECT * FROM studentslist WHERE Firstname LIKE 'Vi%';
```

| Id | Firstname | Lastname | Email                | Age | dateofbirth | Department |
|:---|:----------|:---------|:---------------------|:----|:------------|:-----------|
|  2 | Vimal     | raj      | vimal@freshclass.com |  20 | 2002-01-20  | Design     |

###### 1 row in set (0.00 sec)

```syntax
SELECT * FROM studentslist WHERE Firstname LIKE '%a';
```

| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:---|:----------|:---------|:------------------------|:----|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |

###### 1 row in set (0.00 sec)
### ANY
```syntax
CREATE TABLE Markclass_A(Id int,Mark int,Name varchar(100));
```
```syntax
INSERT INTO markclass_A (Id,Mark,Name) VALUES (1,5,'Vimal'),(2,6,'Prasanna');
```
```syntax
SELECT * FROM markclass_A;
```
| Id   | Mark | Name     |
|:-----|:-----|:---------|
|    1 |    5 | Vimal    |
|    2 |    6 | Prasanna |

###### 2 rows in set (0.00 sec)
```syntax
CREATE TABLE Markclass_B(Id int,Mark int,Name varchar(100));
```
```syntax
INSERT INTO markclass_B (Id,Mark,Name) VALUES (1,4,'Raj'),(2,6,'Venkatesh');
```
```syntax
SELECT * FROM markclass_B;
```
| Id   | Mark | Name      |
|:-----|:-----|:----------|
|    1 |    4 | Raj       |
|    2 |    6 | Venkatesh |

###### 2 rows in set (0.00 sec)

```syntax
SELECT Mark FROM markclass_A WHERE mark = ANY(SELECT mark FROM markclass_B);
```
| Mark |
|:-----|
|    6 |

###### 1 row in set (0.00 sec)

*  *  *

# MySQL Aggregate functions

```syntax
SELECT * FROM studentslist;
```
| Id | Firstname | Lastname | Email                   | Age | dateofbirth | Department |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:-----------|
|  1 | Prasanna  | venkatesh| prasanna@freshclass.com |  21 | 2001-01-20  | Tech       |
|  2 | Vimal     | raj      | vimal@freshclass.com    |  20 | 2002-01-20  | NULL       |

###### 2 rows in set (0.00 sec)

### MIN
```syntax
SELECT MIN(age) FROM Studentslist;
```
| MIN(age) |
|:---------|
|       20 |

###### 1 row in set (0.01 sec)

### MAX
```syntax
SELECT MAX(age) FROM Studentslist;
```
| MAX(age) |
|:---------|
|       21 |

###### 1 row in set (0.00 sec)

### AVG
```syntax
SELECT MAX(age) FROM Studentslist;
```
| AVG(age) |
|:---------|
|  20.5000 |

###### 1 row in set (0.00 sec)

### COUNT
```syntax
SELECT COUNT(age) FROM Studentslist;
```
| COUNT(age) |
|:---------|
|       2 |

###### 1 row in set (0.00 sec)

### SUM
```syntax
SELECT MAX(age) FROM Studentslist;
```
| SUM(age) |
|:---------|
|       41 |

###### 1 row in set (0.00 sec)
* * *

# Join

![VQ5XP](https://user-images.githubusercontent.com/83388298/153813424-8e766761-843e-4f14-8587-672a8ad78848.png)

### INNER JOIN

```syntax
SELECT * FROM markclass_A INNER JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Id   | Mark | Name     | Id   | Mark | Name      |
|:----:|:----:|:--------:|:----:|:----:|:---------:|
|    2 |    6 | Prasanna |    2 |    6 | Venkatesh |

###### 1 row in set (0.00 sec)

```syntax
SELECT markclass_A.Mark, markclass_B.Mark FROM markclass_A INNER JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Mark | Mark |
|:----:|:----:|
|    6 |    6 |

###### 1 row in set (0.01 sec)

### LEFT JOIN

```syntax
SELECT * FROM markclass_A LEFT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Id   | Mark | Name     | Id   | Mark | Name      |
|:----:|:----:|:--------:|:----:|:----:|:---------:|
|    1 |    5 | Vimal    | NULL | NULL | NULL      |
|    2 |    6 | Prasanna |    2 |    6 | Venkatesh |

###### 2 rows in set (0.00 sec)

```syntax
 SELECT markclass_A.Mark, markclass_B.Mark FROM markclass_A LEFT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Mark | Mark |
|:----:|:----:|
|    5 | NULL |
|    6 |    6 |

###### 2 rows in set (0.00 sec)

```syntax
 SELECT markclass_A.Mark, markclass_B.Mark FROM markclass_A LEFT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark WHERE markclass_B.Mark is NOT NULL;
```
| Mark | Mark |
|:----:|:----:|
|    6 |    6 |

###### 1 row in set (0.00 sec)

### RIGHT JOIN

```syntax
SELECT * FROM markclass_A RIGHT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Id   | Mark | Name     | Id   | Mark | Name      |
|:----:|:----:|:--------:|:----:|:----:|:---------:|
| NULL | NULL | NULL     |    1 |    4 | Raj       |
|    2 |    6 | Prasanna |    2 |    6 | Venkatesh |

###### 2 rows in set (0.00 sec)

```syntax
 SELECT markclass_A.Mark, markclass_B.Mark FROM markclass_A RIGHT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark;
```
| Mark | Mark |
|:----:|:----:|
| NULL |    4 |
|    6 |    6 |

###### 2 rows in set (0.00 sec)

```syntax
 SELECT markclass_A.Mark, markclass_B.Mark FROM markclass_A RIGHT JOIN markclass_B ON markclass_A.Mark = markclass_B.Mark WHERE markclass_A.Mark is NOT NULL;
```
| Mark | Mark |
|:----:|:----:|
|    6 |    6 |

###### 1 row in set (0.00 sec)

### CROSS JOIN

```syntax
SELECT * FROM markclass_A CROSS JOIN markclass_B;
```
| Id   | Mark | Name     | Id   | Mark | Name      |
|:----:|:----:|:--------:|:----:|:----:|:---------:|
|    2 |    6 | Prasanna |    1 |    4 | Raj       |
|    1 |    5 | Vimal    |    1 |    4 | Raj       |
|    2 |    6 | Prasanna |    2 |    6 | Venkatesh |
|    1 |    5 | Vimal    |    2 |    6 | Venkatesh |

###### 4 rows in set (0.00 sec)

```syntax
SELECT * FROM markclass_A CROSS JOIN markclass_B WHERE markclass_A.Mark = markclass_B.Mark;
```
| Id   | Mark | Name     | Id   | Mark | Name      |
|:----:|:----:|:---------|:----:|:----:|:----------|
|    2 |    6 | Prasanna |    2 |    6 | Venkatesh |

###### 1 row in set (0.00 sec)
* * *
