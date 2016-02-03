create database PilotProject;
use PilotProject;

CREATE TABLE CUSTOMER
(
  fname varchar(20) not null,
  lname varchar(20) not null,
  address varchar(50) not null,
  dob date not null,
  passportNo varchar(10) primary key
);