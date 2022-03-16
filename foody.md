# FOODY

### users

mysql> USE foody;
Database changed
mysql>  CREATE TABLE users(id int primary key auto_increment,email varchar(50) UNIQUE NOT NULL,password varchar(20) UNIQUE NOT NULL,Mobile_num bigint UNIQUE NOT NULL);
Query OK, 0 rows affected (0.04 sec)

mysql> DESC USERS;

| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| email      | varchar(50) | NO   | UNI | NULL    |                |
| password   | varchar(20) | NO   | UNI | NULL    |                |
| Mobile_num | bigint      | NO   | UNI | NULL    |                |

4 rows in set (0.01 sec)

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

mysql> SELECT *FROM USERS;

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

## Menu


