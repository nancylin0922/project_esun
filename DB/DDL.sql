create database esun;

/* 使用者資料 */
create table users (
	username varchar(20),
    password varchar(40) not null,
    sysadmin varchar(1),
    primary key(username)
);

/* 投票項目 */
create table vote_items (
	id int auto_increment,
    item varchar(255) not null,
    primary key(id)
);

/* 投票紀錄 */
create table vote_list (
	voter varchar(20),
    item_id int,
    primary key(voter, item_id)
);