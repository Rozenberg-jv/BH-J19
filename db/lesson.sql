create database bhj19;
use bhj19;

create table `employees` (
	id int primary key auto_increment,
	`name` varchar(64),
    `age` int default 18 not null,
    salary int check (salary > 100),
    sex boolean,
    start_date date,
    unique (name, age)
);

insert into employees (name, age, salary, sex, start_date)
	value ('Vasily', 26, 1000, false, '2019-05-01');
insert into employees (name, age, sex)
	value ('Tatyana', 21, true);
insert into employees values
	('Igor', 20, 500, false, '2019-02-02'),
	('Olga', 40, 1500, true, '2016-10-21'),
	('Mihail', 50, 1000, false, null);

select * from employees;
select sex from employees;
select e.name Imya, e.salary from employees e;

select * from employees where salary > 859 and age < 30;
select * from employees order by salary asc, age desc;
select * from employees order by salary asc, age desc limit 1,2;

select distinct salary from employees;

select sex, count(name) from employees group by sex;
select sex, sum(salary), avg(salary) from employees group by sex;

select * from employees where name like 'V%';


select * from employees;
update employees e set age = e.age + 1 where name = 'Igor';
delete from employees where salary is null;
-- truncate employees;
