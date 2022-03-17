# FOODY

### users



```syntax
mysql> USE foody;
Database changed
```
```syntax
mysql>  CREATE TABLE users(id int primary key auto_increment,email varchar(50) UNIQUE NOT NULL,password varchar(20) UNIQUE NOT NULL,Mobile_num bigint UNIQUE NOT NULL);
Query OK, 0 rows affected (0.04 sec)
```


mysql> DESC USERS;

| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| email      | varchar(50) | NO   | UNI | NULL    |                |
| password   | varchar(20) | NO   | UNI | NULL    |                |
| Mobile_num | bigint      | NO   | UNI | NULL    |                |

4 rows in set (0.01 sec)


```syntax
mysql> INSERT INTO users(id,email,password,mobile_num)values(1,"vimal@gmail.com","vimal@3245","9566302180");
Query OK, 1 row affected (0.01 sec)
mysql> INSERT INTO users(id,email,password,mobile_num)values(2,"rohith@gmail.com","rohith@3276","9683864876");
Query OK, 1 row affected (0.00 sec)
mysql> INSERT INTO users(id,email,password,mobile_num)values(4,"kaushik@gmail.com","kaushik@5645","9845875670"),(5,"haiden@gmail.com","haiden@2002","7658678767");
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0
mysql>  INSERT INTO users(id,email,password,mobile_num)values(6,"deepak@gmail.com","deepak@5645","9566407865"),(7,"hasan@gmail.com","hasan@2001","7766879845"),(8,"aswath@gmail.com","aswath@2003","7865479876"),(9,"musuraf@gmail.com","musuraf@2000","7658987458");
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0 
```

```syntax
mysql> SELECT *FROM USERS;
```

| id | email             | password     | Mobile_num |
|----|-------------------|--------------|------------|  
|  1 | vimal@gmail.com   | vimal@3245   | 9566302180 |
|  2 | rohith@gmail.com  | rohith@3276  | 9683864876 |
|  3 | prasana@gmail.com | prasana@3245 | 9867564580 |
|  4 | kaushik@gmail.com | kaushik@5645 | 9845875670 |
|  5 | haiden@gmail.com  | haiden@2002  | 7658678767 |
|  6 | deepak@gmail.com  | deepak@5645  | 9566407865 |
|  7 | hasan@gmail.com   | hasan@2001   | 7766879845 |
|  8 | aswath@gmail.com  | aswath@2003  | 7865479876 |
|  9 | musuraf@gmail.com | musuraf@2000 | 7658987458 |

9 rows in set (0.01 sec)

* alter column and date


```syntax
mysql>alter table users add column created_date timestamp not null default current_timestamp;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0
```

mysql> desc users;

| Field        | Type        | Null | Key | Default           | Extra             |
|--------------|-------------|------|-----|-------------------|-------------------|
| id           | int         | NO   | PRI | NULL              | auto_increment    |
| email        | varchar(50) | NO   | UNI | NULL              |                   |
| password     | varchar(20) | NO   | UNI | NULL              |                   |
| Mobile_num   | bigint      | NO   | UNI | NULL              |                   |
| created_date | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

5 rows in set (0.01 sec)

```syntax
mysql> select *from users;
```


| id | email             | password     | Mobile_num | created_date        |
|----|-------------------|--------------|------------|---------------------|
|  1 | vimal@gmail.com   | vimal@3245   | 9566302180 | 2022-03-17 12:23:14 |
|  2 | rohith@gmail.com  | rohith@3276  | 9683864876 | 2022-03-17 12:23:14 |
|  4 | kaushik@gmail.com | kaushik@5645 | 9845875670 | 2022-03-17 12:23:14 |
|  5 | haiden@gmail.com  | haiden@2002  | 7658678767 | 2022-03-17 12:23:14 |
|  6 | deepak@gmail.com  | deepak@5645  | 9566407865 | 2022-03-17 12:23:14 |
|  7 | hasan@gmail.com   | hasan@2001   | 7766879845 | 2022-03-17 12:23:14 |
|  8 | aswath@gmail.com  | aswath@2003  | 7865479876 | 2022-03-17 12:23:14 |
|  9 | musuraf@gmail.com | musuraf@2000 | 7658987458 | 2022-03-17 12:23:14 |

8 rows in set (0.00 sec)

* update row
```syntax
mysql> update users set name="vimal" where id=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
mysql> update users set name="rohith" where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
mysql> update users set name="kaushik" where id=3;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0
mysql> update users set name="haiden" where id=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
```
```syntax
mysql> insert into users (id,name,email,password,mobile_num,created_date)values(3,"abisha","abi@gmail.com","abisha@2002","9765456787","2022-03-17");
Query OK, 1 row affected (0.01 sec)
```
```syntax

mysql>  update users set name="haiden" where id=5;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  update users set name="deepak" where id=6;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  update users set name="hasan" where id=7;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  update users set name="aswath" where id=8;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  update users set name="musuraf" where id=9;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
```
```syntax
mysql> select*from users;
```


| id | name    | email             | password     | Mobile_num | created_date        |
|:--:|:---------|:-------------------|:--------------|:------------|:---------------------:|
|  1 | vimal   | vimal@gmail.com   | vimal@3245   | 9566302180 | 2022-03-17 12:23:14 |
|  2 | rohith  | rohith@gmail.com  | rohith@3276  | 9683864876 | 2022-03-17 12:23:14 |
|  3 | abisha  | abi@gmail.com     | abisha@2002  | 9765456787 | 2022-03-17 00:00:00 |
|  4 | haiden  | kaushik@gmail.com | kaushik@5645 | 9845875670 | 2022-03-17 12:23:14 |
|  5 | haiden  | haiden@gmail.com  | haiden@2002  | 7658678767 | 2022-03-17 12:23:14 |
|  6 | deepak  | deepak@gmail.com  | deepak@5645  | 9566407865 | 2022-03-17 12:23:14 |
|  7 | hasan   | hasan@gmail.com   | hasan@2001   | 7766879845 | 2022-03-17 12:23:14 |
|  8 | aswath  | aswath@gmail.com  | aswath@2003  | 7865479876 | 2022-03-17 12:23:14 |
|  9 | musuraf | musuraf@gmail.com | musuraf@2000 | 7658987458 | 2022-03-17 12:23:14 |

9 rows in set (0.00 sec)

```syntax
mysql>  update users set name = "kaushik" where id=4;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0
```

mysql> select*from users;

| id | name    | email             | password     | Mobile_num | created_date        |
|----|---------|-------------------|--------------|------------|---------------------|
|  1 | vimal   | vimal@gmail.com   | vimal@3245   | 9566302180 | 2022-03-17 12:23:14 |
|  2 | rohith  | rohith@gmail.com  | rohith@3276  | 9683864876 | 2022-03-17 12:23:14 |
|  3 | abisha  | abi@gmail.com     | abisha@2002  | 9765456787 | 2022-03-17 00:00:00 |
|  4 | kaushik | kaushik@gmail.com | kaushik@5645 | 9845875670 | 2022-03-17 12:23:14 |
|  5 | haiden  | haiden@gmail.com  | haiden@2002  | 7658678767 | 2022-03-17 12:23:14 |
|  6 | deepak  | deepak@gmail.com  | deepak@5645  | 9566407865 | 2022-03-17 12:23:14 |
|  7 | hasan   | hasan@gmail.com   | hasan@2001   | 7766879845 | 2022-03-17 12:23:14 |
|  8 | aswath  | aswath@gmail.com  | aswath@2003  | 7865479876 | 2022-03-17 12:23:14 |
|  9 | musuraf | musuraf@gmail.com | musuraf@2000 | 7658987458 | 2022-03-17 12:23:14 |

9 rows in set (0.00 sec)

# Hotels
```syntax
mysql> CREATE TABLE hotels(id int primary key auto_increment, hotels_name varchar(20) NOT NULL);
Query OK, 0 rows affected (0.06 sec)
```
```syntax
mysql> DESC hotels;
```

| Field       | Type        | Null | Key | Default | Extra          |
|-------------|-------------|------|-----|---------|----------------|
| id          | int         | NO   | PRI | NULL    | auto_increment |
| hotels_name | varchar(20) | NO   |     | NULL    |                |

2 rows in set (0.01 sec)

```syntax
mysql> INSERT INTO hotels(id,hotels_name)values(1,"kaarai"),(2,"kfc"),(3,"dominos"),(4,"pizzahut"),(5,"thalapakatti");
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> INSERT INTO hotels(id,hotels_name)values(6,"mc donalds"),(7,"banana leaf"),(8,"star"),(9,"border parotta"),(10,"a2b");
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0
```
```syntax
mysql> SELECT *FROM hotels;
```


| id | hotels_name    |
|----|----------------|
|  1 | kaarai         |
|  2 | kfc            |
|  3 | dominos        |
|  4 | pizzahut       |
|  5 | thalapakatti   |
|  6 | mc donalds     |
|  7 | banana leaf    |
|  8 | star           |
|  9 | border parotta |
| 10 | a2b            |

10 rows in set (0.01 sec)



