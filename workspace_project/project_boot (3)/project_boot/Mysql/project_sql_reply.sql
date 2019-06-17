create table tbl_reply(
reply_no int,
board_no int not null,
reply varchar(100) not null,
replyer varchar(20) not null,
replyDate timestamp default now(),
updateDate timestamp default now()
);

alter table tbl_reply add constraint pk_reply primary key(reply_no);

alter table tbl_reply add constraint fk_reply_board foreign key(board_no) references tbl_board(board_no);