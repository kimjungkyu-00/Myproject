create table tbl_member(
userid varchar(50) not null primary key,
userpw varchar(50) not null,
username varchar(50) not null,
tel varchar(20) not null,
postno varchar(10),
addr varchar(50),
addr_detail varchar(50),
regdate timestamp default now(),
updatedate timestamp default now()
);