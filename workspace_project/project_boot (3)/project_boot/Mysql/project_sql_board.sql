create table tbl_board(
board_no INT PRIMARY KEY AUTO_INCREMENT,
sel_board varchar(10) not null,
writer varchar(10) not null,
sel_date varchar(30),
area varchar(50) not null,
content varchar(50) not null,
fileName varchar(100),
dogKind varchar(20) not null, 
gender varchar(10),
writeDate timestamp default now(),
count INT NULL DEFAULT 0
);