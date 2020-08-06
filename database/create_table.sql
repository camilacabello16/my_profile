use my_cv;

create table education(
	id bigint not null primary key auto_increment,
    numberorder int not null,
    time varchar(150) not null,
    nameschool varchar(150) not null
);

create table skill(
	id bigint not null primary key auto_increment,
    nameskill varchar(150) not null,
    expert int not null
);

create table profile(
	id bigint not null primary key auto_increment,
    birthday text not null,
    gender varchar(150) not null,
    phone varchar(150) not null,
    mail varchar(150) not null,
    location text not null
);

create table project(
	id bigint not null primary key auto_increment,
    nameproject text not null,
    link text not null
);

create table subject(
	id bigint not null primary key auto_increment,
    code varchar(150) not null,
    namesubject varchar(255) not null,
    grades int not null,
    wordgrades varchar(150) not null
);