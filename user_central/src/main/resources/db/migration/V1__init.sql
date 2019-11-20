drop table if exists `user`;
create table `user`
(
id  bigint  not null auto_increment comment '主键',
userName varchar(30) not null comment '用户名',
password varchar(150) not null default '' comment '=密码',
primary key (id)
)engine=InnoDB default charset=utf8 comment '用户';


drop table if exists `role`;
create table `role`
(
id  bigint  not null auto_increment comment '主键',
name varchar(30) not null comment '角色名',
primary key (id)
)engine=InnoDB default charset=utf8 comment '角色';

drop table if exists `user_role`;
create table `user_role`
(
id  bigint  not null auto_increment comment '主键',
user_id varchar(30) not null comment '用户主键',
role_id varchar(30) not null comment '角色主键',
primary key (id)
)engine=InnoDB default charset=utf8 comment '角色';

