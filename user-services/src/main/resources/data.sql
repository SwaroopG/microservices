drop table user;
create table user (id INT AUTO_INCREMENT, firstname varchar(255),lastname varchar(255),email varchar(255),
constraint unique_first_last UNIQUE (firstname, lastname));
insert into user(firstname,lastname,email) values('Swaroop', 'Gaddameedhi', 'swaroop@email.com');
insert into user(firstname,lastname,email) values('First 1', 'Last 1', 'First1@email.com');
insert into user(firstname,lastname,email) values('First 2', 'Last 2', 'Second2@email.com');
insert into user(firstname,lastname,email) values('First 3', 'Last 3', 'Third3@email.com');
insert into user(firstname,lastname,email) values('First 4', 'Last 4', 'Fourth4@email.com');
insert into user(firstname,lastname,email) values('First 5', 'Last 5', 'Fifth5@email.com');
insert into user(firstname,lastname,email) values('First 6', 'Last 6', 'Sixth6@email.com');