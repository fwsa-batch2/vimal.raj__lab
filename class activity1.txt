mysql>show tables;
mysql>create table user(id int primary key auto_increment,name varchar(30) not null);
Query OK, 0 rows affected (0.04 sec)mysql> create table batch(id int primary key auto_increment,name varchar(30) not null);
Query OK, 0 rows affected (0.05 sec)mysql> create table course(id int primary key auto_increment,name varchar(30) not null);
Query OK, 0 rows affected (0.05 sec)mysql> desc user;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)mysql> desc batch;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)mysql> desc course;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)mysql> insert into user values(1,"hasan");
Query OK, 1 row affected (0.02 sec)mysql> insert into user values(2,"surya");
Query OK, 1 row affected (0.02 sec)mysql> insert into batch values(1,"batch 1"),(2,"batch 2");
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0mysql> insert into batch values(1,"html"),(2,"css"),(3,"js");
ERROR 1062 (23000): Duplicate entry '1' for key 'batch.PRIMARY'
mysql> select * from batch_users;
Empty set (0.00 sec)mysql> desc batch_users;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| id    | int  | NO   | PRI | NULL    |       |
+-------+------+------+-----+---------+-------+
1 row in set (0.00 sec)mysql> drop batch_users;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'batch_users' at line 1
mysql> drop table batch_users;

mysql> create table batch_users (id int primary key auto_increment, batch_id int, foreign key (batch_id) references batch (id), user_id int , foreign key (user_id) references user(id));
Query OK, 0 rows affected (0.05 sec)mysql> desc batch_users;
+----------+------+------+-----+---------+----------------+
| Field    | Type | Null | Key | Default | Extra          |
+----------+------+------+-----+---------+----------------+
| id       | int  | NO   | PRI | NULL    | auto_increment |
| batch_id | int  | YES  | MUL | NULL    |                |
| user_id  | int  | YES  | MUL | NULL    |                |
+----------+------+------+-----+---------+----------------+
3 rows in set (0.00 sec)mysql> create table batch
    -> create table batch_courses(id int primary key auto_increment, batch
    -> create table batch_courses(id int primary key auto_increment, batch_id int , foreign key(batch_id) references batch(id),course_id int, foreign key (course_id) references course(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'create table batch_courses(id int primary key auto_increment, batch
create table' at line 2
mysql> create table batch_courses(id int primary key auto_increment, batch_id int , foreign key(batch_id) references batch(id),course_id int, foreign key (course_id) references course(id));
Query OK, 0 rows affected (0.07 sec)mysql> desc batch_course;
ERROR 1146 (42S02): Table 'Academy.batch_course' doesn't exist
mysql> desc batch_courses;
+-----------+------+------+-----+---------+----------------+
| Field     | Type | Null | Key | Default | Extra          |
+-----------+------+------+-----+---------+----------------+
| id        | int  | NO   | PRI | NULL    | auto_increment |
| batch_id  | int  | YES  | MUL | NULL    |                |
| course_id | int  | YES  | MUL | NULL    |                |
+-----------+------+------+-----+---------+----------------+
3 rows in set (0.01 sec)mysql> select * from batch;
+----+---------+
| id | name    |
+----+---------+
|  1 | batch 1 |
|  2 | batch 2 |
+----+---------+
2 rows in set (0.00 sec)mysql> insert into batch_users values(1,1,1),(2,2,2);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0mysql> insert into batch_courses values(1,1),(2,2);
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into batch_courses values(,1,1),(,2,2);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',1,1),(,2,2)' at line 1
mysql> insert into batch_courses (batch_id,course_id)values(,1,1),(,2,2);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',1,1),(,2,2)' at line 1
mysql> insert into batch_courses (batch_id,course_id)values(1,1),(2,2);
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0mysql> select * from batch_course;
ERROR 1146 (42S02): Table 'Academy.batch_course' doesn't exist
mysql> select * from batch_courses;
+----+----------+-----------+
| id | batch_id | course_id |
+----+----------+-----------+
|  1 |        1 |         1 |
|  2 |        2 |         2 |
+----+----------+-----------+
2 rows in set (0.00 sec)mysql> select batch_users.id,user.name as user_name,batch.name as batch_name from batch_users,user_name,batch_name;
ERROR 1146 (42S02): Table 'Academy.user_name' doesn't exist
mysql> select batch_users.id,user.name as user_name,batch.name as batch_name from batch_users,user,batch;
+----+-----------+------------+
| id | user_name | batch_name |
+----+-----------+------------+
|  1 | surya     | batch 1    |
|  2 | surya     | batch 1    |
|  1 | hasan     | batch 1    |
|  2 | hasan     | batch 1    |
|  1 | surya     | batch 2    |
|  2 | surya     | batch 2    |
|  1 | hasan     | batch 2    |
|  2 | hasan     | batch 2    |
+----+-----------+------------+
8 rows in set (0.01 sec)mysql> select batch_users.id,user.name as user_name,batch.name as batch_name from batch_users,user,batch on user.id=batch.id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'on user.id=batch.id' at line 1
mysql> select batch_users.id,user.name as user_name,batch.name as batch_name from batch_users,user,batch on batch_users=user.id=batch.id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'on batch_users=user.id=batch.id' at line 1
mysql> select batch_users.id,user.name as user_name,batch.name as batch_name from batch inner join user on batch.id = user.id ;
ERROR 1054 (42S22): Unknown column 'batch_users.id' in 'field list'
mysql> select user^C^Cm batch inner join user on batch.id = user.id ;^C
mysql> show tables;
+-------------------+
| Tables_in_Academy |
+-------------------+
| batch             |
| batch_courses     |
| batch_users       |
| course            |
| user              |
+-------------------+
5 rows in set (0.00 sec)mysql> select user.id, user.name, batch.name
    -> from user
    -> join batch
    -> on user.id = batch.id
    -> ;
+----+-------+---------+
| id | name  | name    |
+----+-------+---------+
|  1 | hasan | batch 1 |
|  2 | surya | batch 2 |
+----+-------+---------+
2 rows in set (0.00 sec)mysql> select batch.id, course.name, batch.name from batch join course on batch.id = course.id;
+----+------+---------+
| id | name | name    |
+----+------+---------+
|  1 | html | batch 1 |
|  2 | css  | batch 2 |
+----+------+---------+
2 rows in set (0.00 sec) 
