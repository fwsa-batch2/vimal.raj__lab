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

# menu

```syntax
mysql> CREATE TABLE menu(id int primary key auto_increment, restaurants varchar(30) NOT NULL,food_name varchar(30) NOT NULL, catogories varchar(20) NOT NULL, price DECIMAL NOT NULL);
Query OK, 0 rows affected (0.05 sec)
```
```syntax
mysql> SELECT *from menu;
Empty set (0.00 sec)
```
```syntax
mysql> DESC menu;
```

| Field       | Type          | Null | Key | Default | Extra          |
|-------------|---------------|------|-----|---------|----------------|
| id          | int           | NO   | PRI | NULL    | auto_increment |
| restaurants | varchar(30)   | NO   |     | NULL    |                |
| food_name   | varchar(30)   | NO   |     | NULL    |                |
| catogories  | varchar(20)   | NO   |     | NULL    |                |
| price       | decimal(10,0) | NO   |     | NULL    |                |

5 rows in set (0.01 sec)
```syntax
mysql> insert into menu(id,restaurants,food_name,catogories,price)values(1,"kaarai","chicken biriyani","non-veg","200");
Query OK, 1 row affected (0.01 sec)
```

```syntax
mysql> insert into menu(id,restaurants,food_name,catogories,price)values(2,"kfc","crispy chicken","non-veg","300");
Query OK, 1 row affected (0.01 sec)
```
```syntax
mysql> insert into menu(id,restaurants,food_name,catogories,price)values(3,"kfc","chicken burger","non-veg","300"),(4,"pizza hut","beef pizza","non-veg","400"),(5,"border parotta","parotta","non-veg","40"),(6,"A2B","dosa","veg","120"),(7,"Thalapakatti","muttoon biriyani","non-veg","600"),(8,"star","fried rice","veg","120");
Query OK, 6 rows affected (0.01 sec)
Records: 6  Duplicates: 0  Warnings: 0
```
```syntax
mysql> SELECT *from menu;
```

| id | restaurants    | food_name        | catogories | price |
|----|----------------|------------------|------------|-------|
|  1 | kaarai         | chicken biriyani | non-veg    |   200 |
|  2 | kfc            | crispy chicken   | non-veg    |   300 |
|  3 | kfc            | chicken burger   | non-veg    |   300 |
|  4 | pizza hut      | beef pizza       | non-veg    |   400 |
|  5 | border parotta | parotta          | non-veg    |    40 |
|  6 | A2B            | dosa             | veg        |   120 |
|  7 | Thalapakatti   | muttoon biriyani | non-veg    |   600 |
|  8 | star           | fried rice       | veg        |   120 |

8 rows in set (0.00 sec)

# orders
```syntax
mysql> CREATE TABLE ORDERS(id int NOT NULL primary key auto_increment,user_id int NOT NULL, order_date timestamp, foreign key(user_id) references users(id));
Query OK, 0 rows affected (0.06 sec)
```
```syntax
mysql> desc orders;
```

| Field      | Type      | Null | Key | Default | Extra          |
|------------|-----------|------|-----|---------|----------------|
| id         | int       | NO   | PRI | NULL    | auto_increment |
| user_id    | int       | NO   | MUL | NULL    |                |
| order_date | timestamp | YES  |     | NULL    |                |

3 rows in set (0.01 sec)
```syntax

mysql> INSERT INTO orders(user_id,order_date)values(1,"2022-03-22");
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO orders(user_id,order_date)values(8,"2022-03-22");
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO orders(user_id,order_date)values(5,"2022-03-22"),(6,"2022-03-22");
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0
```
```syntax
mysql> select*from orders;
```

| id | user_id | order_date          |
|----|---------|---------------------|
|  1 |       1 | 2022-03-22 00:00:00 |
|  3 |       8 | 2022-03-22 00:00:00 |
|  4 |       5 | 2022-03-22 00:00:00 |
|  5 |       6 | 2022-03-22 00:00:00 |

4 rows in set (0.00 sec)

# ordered_items
```synatx
mysql> CREATE TABLE ordered_items(order_id int NOT NULL,food_id int NOT NULL,restaurant_id int NOT NULL,quantity int NOT NULL,price int NOT NULL,total int NOT NULL, foreign key(order_id)references orders(id),foreign key(food_id) references menu(id),foreign key(restaurant_id)references hotels(id));
Query OK, 0 rows affected (0.09 sec)
```
```syntax
mysql> desc ordered_items;
```

| Field         | Type | Null | Key | Default | Extra |
|---------------|------|------|-----|---------|-------|
| order_id      | int  | NO   | MUL | NULL    |       |
| food_id       | int  | NO   | MUL | NULL    |       |
| restaurant_id | int  | NO   | MUL | NULL    |       |
| quantity      | int  | NO   |     | NULL    |       |
| price         | int  | NO   |     | NULL    |       |
| total         | int  | NO   |     | NULL    |       |

6 rows in set (0.00 sec)
```syntax
mysql> INSERT INTO orders values(2,2,"2022-03-22");
Query OK, 1 row affected (0.01 sec)
```
```syntax
mysql> select*from orders;
```syntax

| id | user_id | order_date          |
|----|---------|---------------------|
|  1 |       1 | 2022-03-22 00:00:00 |
|  2 |       2 | 2022-03-22 00:00:00 |
|  3 |       8 | 2022-03-22 00:00:00 |
|  4 |       5 | 2022-03-22 00:00:00 |
|  5 |       6 | 2022-03-22 00:00:00 |

5 rows in set (0.00 sec)
```synatx
mysql> INSERT INTO ordered_items values(1,3,4,2,200,400);
Query OK, 1 row affected (0.01 sec)
```
```syntax
mysql> select*from ordered_items;
```

| order_id | food_id | restaurant_id | quantity | price | total |
|----------|---------|---------------|----------|-------|-------|
|        1 |       3 |             4 |        2 |   200 |   400 |

1 row in set (0.00 sec)


# payment

```syntax
mysql> CREATE TABLE payment(id int primary key auto_increment,email varchar(30) NOT NULL,bank_name varchar(30) NOT NULL, card_no int NOT NULL,cvv tinyint NOT NULL);
Query OK, 0 rows affected (0.11 sec)
```
```syntax
mysql> DESC payment;
```

| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| id        | int         | NO   | PRI | NULL    | auto_increment |
| bank_name | varchar(30) | NO   |     | NULL    |                |
| card_no   | int         | NO   |     | NULL    |                |
| cvv       | int         | NO   |     | NULL    |                |

5 rows in set (0.02 sec)


```syntax
mysql> desc payment;
```

| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| id        | int         | NO   | PRI | NULL    | auto_increment |
| bank_name | varchar(30) | NO   |     | NULL    |                |
| card_no   | bigint      | YES  |     | NULL    |                |
| cvv       |     int     | NO   |     | NULL    |                |

5 rows in set (0.02 sec)


```syntax
mysql> select*from payment;
```

| id | bank_name  | card_no          | cvv |
|----|------------|------------------|-----|
|  1 | iob        | 6788875678945673 | 334 |
|  2 | sbi        | 6785687658945673 | 445 |
|  3 | axis       | 6785378545945673 | 423 |
|  4 | sbi        | 2347657658945673 | 235 |
|  5 | city union | 7865457658945673 | 484 |

5 rows in set (0.01 sec)
# Review

```syntax
mysql> CREATE TABLE review(id int NOT NULL,rating int,comments varchar(300) NOT NULL,foreign key (id) references users(id));
Query OK, 0 rows affected (0.05 sec)
```
```syntax
mysql> desc review;
```

| Field    | Type         | Null | Key | Default | Extra |
|----------|--------------|------|-----|---------|-------|
| id       | int          | NO   | MUL | NULL    |       |
| rating   | int          | YES  |     | NULL    |       |
| comments | varchar(300) | NO   |     | NULL    |       |

3 rows in set (0.01 sec)

```SYNTAX   
mysql> INSERT INTO review(id,rating,comments)values(1,"4","wonderful food");
Query OK, 1 row affected (0.01 sec)
```
```syntax

mysql> INSERT INTO review(id,rating,comments)values(2,"4","wonderful food");
Query OK, 1 row affected (0.01 sec)
```
```syntax
mysql> INSERT INTO review(id,rating,comments)values(3,"4","wonderful food"),(4,"4","wonderful food"),(5,"4","wonderful food");
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0
```
```syntax
mysql> select*from review;
```

| id | rating | comments       |
|----|--------|----------------|
|  1 |      4 | wonderful food |
|  2 |      4 | wonderful food |
|  3 |      4 | wonderful food |
|  4 |      4 | wonderful food |
|  5 |      4 | wonderful food |

5 rows in set (0.00 sec)

# rename column name
```syntax
mysql> ALTER TABLE hotels RENAME COLUMN hotels_name TO restaurants;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0
```

```syntax
mysql> select*from orders;
```


| id | user_id | order_date          |
|----|---------|---------------------|
|  1 |       1 | 2022-03-22 00:00:00 |
|  2 |       2 | 2022-03-22 00:00:00 |
|  3 |       8 | 2022-03-22 00:00:00 |
|  4 |       5 | 2022-03-22 00:00:00 |
|  5 |       6 | 2022-03-22 00:00:00 |
|----|---------|---------------------|
5 rows in set (0.00 sec)
```syntax
mysql> select *from users;
```

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

```syntax
mysql> select*from review;
```

| id | name    | rating | comments                |
|----|---------|--------|-------------------------|
|  1 | vimal   |      3 | wonderful food          |
|  2 | rohith  |      4 | nice and wonderful food |
|  3 | prasana |      4 | nice and wonderful food |
|  4 | kaushik |      5 | nice and wonderful food |
|  5 | haiden  |      4 | nice and wonderful food |

5 rows in set (0.01 sec)
```syntax
mysql>  ALTER TABLE review add foreign key(id) references users(id);
Query OK, 5 rows affected (0.08 sec)
Records: 5  Duplicates: 0  Warnings: 0
```

## EER Model for Foody Database:

mysql> ALTER TABLE orders modify user_id int NOT NULL;
Query OK, 0 rows affected (0.16 sec)
Records: 0  Duplicates: 0  Warnings: 0
```
## EER Model for Foody Database:
<img width="440" alt="er diagram" src="https://user-images.githubusercontent.com/76813052/159823151-3f554018-499c-46a4-8cae-b03bfc759972.png">

















