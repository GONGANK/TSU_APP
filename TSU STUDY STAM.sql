create database tsu_study_stam;

use tsu_study_stam;

create table tsu_login(
email_ varchar(30),
password_ varchar(30));

select * from tsu_login;

insert into tsu_login
values ('admin1', 'admin123');

select * from tsu_login;