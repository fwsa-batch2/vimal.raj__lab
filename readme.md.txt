mysql> show databases;
+---------------------+
| Database            |
+---------------------+
| beni                |
| document            |
| information_schema  |
| mysql               |
| performance_schema  |
| raj                 |
| sakila              |
| student_information |
| sys                 |
| vimal               |
| world               |
+---------------------+
11 rows in set (0.01 sec)

mysql> use student_information;
Database changed
mysql> show tables;
Empty set (0.06 sec)

mysql> create table students (
    ->     id int primary key auto_increment,
    ->     name varchar(100) not null,
    ->     email varchar(100) not null,
    ->     mobile_no bigint not null,
    ->     password varchar(100) not null,
    ->     gender char(1) not null,
    ->     dob date,
    ->     created_date timestamp not null default current_timestamp,
    ->     unique (email),
    ->     check ( gender in ('M','F'))
    ->   );
Query OK, 0 rows affected (0.13 sec)

mysql> create table student_class (
    ->     id int primary key auto_increment,
    ->     student_id int not null,
    ->     class int not null,
    ->     status varchar(20) not null,
    ->     foreign_key (student_id) references students(id),
    ->     check( class >= 1 and class <=12),
    ->     check (status in ('ACTIVE','INACTIVE'))
    ->   );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(student_id) references students(id),
    check( class >= 1 and class <=12),
   ' at line 6
mysql> create table student_class (
    -> id int primary key auto_increment,
    -> student_id int not null,
    -> class int not null,
    -> status varchar(20) not null,
    -> freign key(student_id) references students(id),
    -> check( class >= 1 and class <=12),
    -> check (status in ('ACTIVE','INACTIVE'))
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'key(student_id) references students(id),
check( class >= 1 and class <=12),
chec' at line 6
mysql> create table student_class (
    -> id int primary key auto_increment,
    -> student_id int not null,
    -> class int not null,
    -> status varchar(20) not null,
    -> freign key(student_id) references students(id),
    -> check( class >= 1 and class <=12),
    -> check (status in ('ACTIVE','INACTIVE')) );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'key(student_id) references students(id),
check( class >= 1 and class <=12),
chec' at line 6
mysql> create table student_class ( id int primary key auto_increment, student_id int not null, class int not null, status varchar(20) not null, foreign key (student_id) references students(id), check( class >=
    -> 1 and class <=12), check (status in ('ACTIVE','INACTIVE')) );
Query OK, 0 rows affected (0.11 sec)

mysql> desc students;
+--------------+--------------+------+-----+-------------------+-------------------+
| Field        | Type         | Null | Key | Default           | Extra             |
+--------------+--------------+------+-----+-------------------+-------------------+
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+--------------+--------------+------+-----+-------------------+-------------------+
8 rows in set (0.02 sec)

mysql> desc student_class;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(1,"vimal","vimal@gmail.com",9566302180,"vimal@2002","M","18-10-2002","1-3-2022");
ERROR 1292 (22007): Incorrect date value: '18-10-2002' for column 'dob' at row 1
mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(1,"vimal","vimal@gmail.com",9566302180,"vimal@2002","M","2002-10-18","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> select *from students;
+----+-------+-----------------+------------+------------+--------+------------+---------------------+
| id | name  | email           | mobile_no  | password   | gender | dob        | created_date        |
+----+-------+-----------------+------------+------------+--------+------------+---------------------+
|  1 | vimal | vimal@gmail.com | 9566302180 | vimal@2002 | M      | 2002-10-18 | 2022-03-01 00:00:00 |
+----+-------+-----------------+------------+------------+--------+------------+---------------------+
1 row in set (0.01 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(2"deepak","deepak@gmail.com",9562302480,"deepak@2002","M","2002-5-20","2022-3-1");
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '"deepak","deepak@gmail.com",9562302480,"deepak@2002","M","2002-5-20","2022-3-1")' at line 1
mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(2,"deepak","deepak@gmail.com",6785467596,"deepak@2003","M","2003-4-12","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> select*from student;
ERROR 1146 (42S02): Table 'student_information.student' doesn't exist
mysql> select *from students;
+----+--------+------------------+------------+-------------+--------+------------+---------------------+
| id | name   | email            | mobile_no  | password    | gender | dob        | created_date        |
+----+--------+------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal  | vimal@gmail.com  | 9566302180 | vimal@2002  | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak | deepak@gmail.com | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
+----+--------+------------------+------------+-------------+--------+------------+---------------------+
2 rows in set (0.00 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(3,"kaushik","kaushik@gmail.com",9685418656,"kau@2003","M","2001-3-2","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> select  *from students;
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
| id | name    | email             | mobile_no  | password    | gender | dob        | created_date        |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal   | vimal@gmail.com   | 9566302180 | vimal@2002  | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak  | deepak@gmail.com  | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
|  3 | kaushik | kaushik@gmail.com | 9685418656 | kau@2003    | M      | 2001-03-02 | 2022-03-01 00:00:00 |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
3 rows in set (0.01 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(4,"abisha","abisha@gmail.com",9683717656,"abi@2003","F","2002-10-2","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(5,"haiden","haiden@gmail.com",9683717656,"hai@2003","m","2002-5-10","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(6,"rohith","rohith@gmail.com",9683717656,"rohith@2003","m","2002-5-20","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(6,"aswath","aswath@gmail.com",9683717656,"aswath@2003","m","2002-10-10","2022-3-1");
ERROR 1062 (23000): Duplicate entry '6' for key 'students.PRIMARY'
mysql> insert into students (id,name,email,mobile_no,password,gender,dob,created_date)values(7,"aswath","aswath@gmail.com",9683717656,"aswath@2003","m","2002-10-10","2022-3-1");
Query OK, 1 row affected (0.01 sec)

mysql> select *from students;
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
| id | name    | email             | mobile_no  | password    | gender | dob        | created_date        |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal   | vimal@gmail.com   | 9566302180 | vimal@2002  | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak  | deepak@gmail.com  | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
|  3 | kaushik | kaushik@gmail.com | 9685418656 | kau@2003    | M      | 2001-03-02 | 2022-03-01 00:00:00 |
|  4 | abisha  | abisha@gmail.com  | 9683717656 | abi@2003    | F      | 2002-10-02 | 2022-03-01 00:00:00 |
|  5 | haiden  | haiden@gmail.com  | 9683717656 | hai@2003    | m      | 2002-05-10 | 2022-03-01 00:00:00 |
|  6 | rohith  | rohith@gmail.com  | 9683717656 | rohith@2003 | m      | 2002-05-20 | 2022-03-01 00:00:00 |
|  7 | aswath  | aswath@gmail.com  | 9683717656 | aswath@2003 | m      | 2002-10-10 | 2022-03-01 00:00:00 |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
7 rows in set (0.00 sec)

mysql> select (name) from students;
+---------+
| name    |
+---------+
| vimal   |
| deepak  |
| kaushik |
| abisha  |
| haiden  |
| rohith  |
| aswath  |
+---------+
7 rows in set (0.00 sec)

mysql> update students set password = "raj@2002" where id=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from students;
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
| id | name    | email             | mobile_no  | password    | gender | dob        | created_date        |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal   | vimal@gmail.com   | 9566302180 | raj@2002    | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak  | deepak@gmail.com  | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
|  3 | kaushik | kaushik@gmail.com | 9685418656 | kau@2003    | M      | 2001-03-02 | 2022-03-01 00:00:00 |
|  4 | abisha  | abisha@gmail.com  | 9683717656 | abi@2003    | F      | 2002-10-02 | 2022-03-01 00:00:00 |
|  5 | haiden  | haiden@gmail.com  | 9683717656 | hai@2003    | m      | 2002-05-10 | 2022-03-01 00:00:00 |
|  6 | rohith  | rohith@gmail.com  | 9683717656 | rohith@2003 | m      | 2002-05-20 | 2022-03-01 00:00:00 |
|  7 | aswath  | aswath@gmail.com  | 9683717656 | aswath@2003 | m      | 2002-10-10 | 2022-03-01 00:00:00 |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
7 rows in set (0.01 sec)

mysql> desc student_class;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql> insert into student_class(id,student_id,class,status) values(1,101,10,"ACTIVE");
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`student_information`.`student_class`, CONSTRAINT `student_class_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`))
mysql> insert into student_class(id,student_id,class,status) values(1,1,10,"ACTIVE");
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_class(id,student_id,class,status) values(2,5,11,"ACTIVE"),(3,102,12"INACTIVE");
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '"INACTIVE")' at line 1
mysql> insert into student_class(id,student_id,class,status) values(2,5,11,"ACTIVE"),(3,102,12,"INACTIVE");
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`student_information`.`student_class`, CONSTRAINT `student_class_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`))
mysql> insert into student_class(id,student_id,class,status) values(2,5,11,"ACTIVE"),(3,3,12,"INACTIVE");
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |    10 | ACTIVE   |
|  2 |          5 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
+----+------------+-------+----------+
3 rows in set (0.01 sec)

mysql> insert into student_class(id,student_id,class,status) values(2,5,11,"ACTIVE"),(3,3,12,"INACTIVE"),(4,4,12,"ACTIVE"),(5,5,10,"ACTIVE"),(6,6,10,"INACTIVE"),(7,7,12,"ACTIVE");
ERROR 1062 (23000): Duplicate entry '2' for key 'student_class.PRIMARY'
mysql> insert into student_class(id,student_id,class,status) values(4,4,12,"ACTIVE"),(5,5,10,"ACTIVE"),(6,6,10,"INACTIVE"),(7,7,12,"ACTIVE");
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |    10 | ACTIVE   |
|  2 |          5 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |    10 | ACTIVE   |
|  6 |          6 |    10 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
+----+------------+-------+----------+
7 rows in set (0.00 sec)

mysql> select students.name, student_class.class
    -> from students
    -> innerjoin student_class
    -> on students.id=student_class.id
    -> where student_class.class=10;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'student_class
on students.id=student_class.id
where student_class.class=10' at line 3
mysql> update student_class set student_id=2 where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |    10 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |    10 | ACTIVE   |
|  6 |          6 |    10 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
+----+------------+-------+----------+
7 rows in set (0.01 sec)

mysql> select students.name, student_class.class
    -> from students
    -> innerjoin student_class
    -> on student.id=student_class.id
    -> where student_class.class=10;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'student_class
on student.id=student_class.id
where student_class.class=10' at line 3
mysql> select students.name, student_class.class
    -> from students
    -> inner join student_class
    -> on student.id=student_class.id
    -> where student_class.class=10;
ERROR 1054 (42S22): Unknown column 'student.id' in 'on clause'
mysql> select students.name, student_class.class
    -> from students
    -> inner join student_class
    -> on students.id=student_class.id
    -> where student_class.class=10;
+--------+-------+
| name   | class |
+--------+-------+
| vimal  |    10 |
| haiden |    10 |
| rohith |    10 |
+--------+-------+
3 rows in set (0.01 sec)

mysql> select *from students;
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
| id | name    | email             | mobile_no  | password    | gender | dob        | created_date        |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal   | vimal@gmail.com   | 9566302180 | raj@2002    | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak  | deepak@gmail.com  | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
|  3 | kaushik | kaushik@gmail.com | 9685418656 | kau@2003    | M      | 2001-03-02 | 2022-03-01 00:00:00 |
|  4 | abisha  | abisha@gmail.com  | 9683717656 | abi@2003    | F      | 2002-10-02 | 2022-03-01 00:00:00 |
|  5 | haiden  | haiden@gmail.com  | 9683717656 | hai@2003    | m      | 2002-05-10 | 2022-03-01 00:00:00 |
|  6 | rohith  | rohith@gmail.com  | 9683717656 | rohith@2003 | m      | 2002-05-20 | 2022-03-01 00:00:00 |
|  7 | aswath  | aswath@gmail.com  | 9683717656 | aswath@2003 | m      | 2002-10-10 | 2022-03-01 00:00:00 |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
7 rows in set (0.00 sec)

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |    10 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |    10 | ACTIVE   |
|  6 |          6 |    10 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
+----+------------+-------+----------+
7 rows in set (0.00 sec)

mysql> update student_class set class=4 where id=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student_class set class=4 where id=1,5,6;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',5,6' at line 1
mysql> update student_class set class="4" where id=1,5,6;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',5,6' at line 1
mysql> update student_class set class=4 where id=1 and 6;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 1  Changed: 0  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     4 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |    10 | ACTIVE   |
|  6 |          6 |    10 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
+----+------------+-------+----------+
7 rows in set (0.00 sec)

mysql> update student_class set class=4 where id=5;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student_class set class=4 where id=6;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     4 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |     4 | ACTIVE   |
|  6 |          6 |     4 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
+----+------------+-------+----------+
7 rows in set (0.00 sec)

mysql> DELETE FROM student_class WHERE id=7;
Query OK, 1 row affected (0.00 sec)

mysql> select*from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     4 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    12 | INACTIVE |
|  4 |          4 |    12 | ACTIVE   |
|  5 |          5 |     4 | ACTIVE   |
|  6 |          6 |     4 | INACTIVE |
+----+------------+-------+----------+
6 rows in set (0.01 sec)

mysql> update student set dob= NULL where id=3 between 5;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> update student set dob= NULL where id between 3 and 5;
ERROR 1146 (42S02): Table 'student_information.student' doesn't exist
mysql> update students set dob= NULL where id between 3 and 5;
Query OK, 3 rows affected (0.01 sec)
Rows matched: 3  Changed: 3  Warnings: 0

mysql> select *from students;
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
| id | name    | email             | mobile_no  | password    | gender | dob        | created_date        |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
|  1 | vimal   | vimal@gmail.com   | 9566302180 | raj@2002    | M      | 2002-10-18 | 2022-03-01 00:00:00 |
|  2 | deepak  | deepak@gmail.com  | 6785467596 | deepak@2003 | M      | 2003-04-12 | 2022-03-01 00:00:00 |
|  3 | kaushik | kaushik@gmail.com | 9685418656 | kau@2003    | M      | NULL       | 2022-03-01 00:00:00 |
|  4 | abisha  | abisha@gmail.com  | 9683717656 | abi@2003    | F      | NULL       | 2022-03-01 00:00:00 |
|  5 | haiden  | haiden@gmail.com  | 9683717656 | hai@2003    | m      | NULL       | 2022-03-01 00:00:00 |
|  6 | rohith  | rohith@gmail.com  | 9683717656 | rohith@2003 | m      | 2002-05-20 | 2022-03-01 00:00:00 |
|  7 | aswath  | aswath@gmail.com  | 9683717656 | aswath@2003 | m      | 2002-10-10 | 2022-03-01 00:00:00 |
+----+---------+-------------------+------------+-------------+--------+------------+---------------------+
7 rows in set (0.00 sec)

mysql> select name from students where dob = NULL;
Empty set (0.00 sec)

mysql> select name from students where dob is NULL;
+---------+
| name    |
+---------+
| kaushik |
| abisha  |
| haiden  |
+---------+
3 rows in set (0.00 sec)

mysql> select *from student_class where status ="ACTIVE";
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     4 | ACTIVE |
|  2 |          2 |    11 | ACTIVE |
|  4 |          4 |    12 | ACTIVE |
|  5 |          5 |     4 | ACTIVE |
+----+------------+-------+--------+
4 rows in set (0.00 sec)

mysql> select count(*),class from student_class where status ="ACTIVE" group by class;
+----------+-------+
| count(*) | class |
+----------+-------+
|        2 |     4 |
|        1 |    11 |
|        1 |    12 |
+----------+-------+
3 rows in set (0.01 sec)

mysql> update student_class set class=5 where id=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student_class set class=5 where id=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     4 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |     5 | INACTIVE |
|  4 |          4 |     5 | ACTIVE   |
|  5 |          5 |     4 | ACTIVE   |
|  6 |          6 |     4 | INACTIVE |
+----+------------+-------+----------+
6 rows in set (0.00 sec)














