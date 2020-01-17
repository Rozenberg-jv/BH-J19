create database bhj19;
use bhj19;

drop table employees;
drop table specialties;

create table employees (
	id int primary key auto_increment,
    name varchar(64) not null unique,
    start_date date default '2020-01-01' not null,
    salary int not null check(salary > 0),
    specialty_id int,
    foreign key (specialty_id) references specialties (id)
);

create table specialties (
	id int primary key auto_increment,
    specialty varchar(64) not null
);

insert into specialties values
	(null, 'Dev'),
    (null, 'HR'),
    (null, 'QA');

insert into employees (name, salary, specialty_id) values
	('Vasily', 2500, 1),
    ('Olga', 1900, 2),
    ('Maxim', 1200, 3);

insert into employees values
	(null, 'Roman', '2018-03-30', 1000, 3),
    (null, 'Marina', '2019-05-11', 2300, 1),
    (null, 'Tatyana', '2018-10-10', 1200, 1),
    (null, 'Oleg', '2019-11-21', 2300, 1);


select * from employees;
select * from specialties;

select * from employees e, specialties where e.specialty_id = specialties.id;
select * from employees e join specialties s on (e.specialty_id = s.id);
select * from employees e left join specialties s on (e.specialty_id = s.id);
select * from employees e right join specialties s on (e.specialty_id = s.id);

insert into employees value (null, 'Mahmud', default, 400, null);