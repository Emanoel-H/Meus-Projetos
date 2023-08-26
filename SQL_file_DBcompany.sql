CREATE DATABASE company;

USE company;

CREATE TABLE employees (id INT AUTO_INCREMENT, name VARCHAR(50) NOT NULL,
 surname VARCHAR(50) NOT NULL, PRIMARY KEY (id)) Engine = InnoDB;
 
USE company;

SELECT * FROM employees;