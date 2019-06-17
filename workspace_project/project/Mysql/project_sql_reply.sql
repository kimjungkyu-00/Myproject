create table tbl_reply(
reply_no int auto_increment primary key,
board_no int not null,
reply varchar(100) not null,
replyer varchar(20) not null,
replyDate timestamp default now()
);

alter table tbl_reply add foreign key(board_no) references tbl_board(board_no) on delete cascade;