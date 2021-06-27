/*
* Whenever I try to execute SQL in SQL console it always is in wrap mode on. So I added "wrap off" to fix the problem.
*/
SET wrap off;

/*
* We have to execute SQL command to check whether the SQL tables working fine. If we don't drop previous table it will return
* "ORA-00955: name is already used by an existing object"
* Which mean is it's duplicate, So we added DROP command to drop previous table if exists
*/
DROP TABLE customers;

/*
* Classroom assignment instruction: create table Customer
*
* Created customers table with id,name,occupation
*/
CREATE TABLE customers(
	id             integer,
	name           varchar(30),
	occupation     varchar(20)
);

/*
* Classroom assignment instruction: Insert 10 rows.
*
* Insert 10 rows value into customers id, name, occupation column
*/
INSERT INTO customers (id, name, occupation) VALUES (1, 'Rintarou Okabe', 'Engineer');
INSERT INTO customers (id, name, occupation) VALUES (2, 'Kurisu Makise', 'Carpenter');
INSERT INTO customers (id, name, occupation) VALUES (3, 'Mikasa Ackerman', 'Physiologist');
INSERT INTO customers (id, name, occupation) VALUES (4, 'Ken Kaneki', 'Soldier');
INSERT INTO customers (id, name, occupation) VALUES (5, 'Kakashi Hatake', 'Journalist');
INSERT INTO customers (id, name, occupation) VALUES (6, 'Naruto Uzumaki', 'Tailor');
INSERT INTO customers (id, name, occupation) VALUES (7, 'Itachi Uchiha', 'Butcher');
INSERT INTO customers (id, name, occupation) VALUES (8, 'Taiga Aisaka', 'Cook');
INSERT INTO customers (id, name, occupation) VALUES (9, 'Sasuke Uchiha', 'Mechanic');
INSERT INTO customers (id, name, occupation) VALUES (10, 'Satoru Gojou', 'Footballer');

/*
* Classroom assignment instruction: update 3 rows.
*
* Insert 10 rows value into customers id, name, occupation column
*/
UPDATE customers SET occupation = 'Actor' WHERE id = 8;
UPDATE customers SET occupation = 'Teacher' WHERE id = 5;
UPDATE customers SET occupation = 'Pilot' WHERE id = 10;

/*
* Classroom assignment instruction: write 4 Alter commands from today's class.
*
* 4 Alter commands to add new column in table modify the data_type/value of data_type of column, rename the column and finally delete/drop the column.
*/
ALTER TABLE customers ADD address varchar(255);
ALTER TABLE customers MODIFY address varchar(100);
ALTER TABLE customers RENAME COLUMN address TO city;
ALTER TABLE customers DROP COLUMN city;
