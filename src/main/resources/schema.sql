create table students(
	id integer not null,
	firstName varchar(255) not null,
	lastName varchar(255),
	className varchar(10),
	nationality varchar(100),
	primary key(id)
);

insert into students(id, firstName, lastName, className, nationality)
values(10001, 'ABC1', 'XYZ1', '1 A', 'Singapore');
insert into students(id, firstName, lastName, className, nationality)
values(10002, 'ABC2',  'XYZ2', '2 A', 'Singapore');
insert into students(id, firstName, lastName, className, nationality)
values(10003, 'ABC3',  'XYZ3', '3 A', 'Singapore');
insert into students(id, firstName, lastName, className, nationality)
values(10004, 'ABC4',  'XYZ4', '4 A', 'Singapore');
insert into students(id, firstName, lastName, className, nationality)
values(10005, 'ABC5',  'XYZ5', '5 A', 'Singapore');
