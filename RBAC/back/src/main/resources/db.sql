create user rbac with password 'admin';
create database rbacdb with owner rbac;
\c rbacdb;
create schema rbac_db authorization rbac;
alter ROLE rbac set search_path =rbac_db;

drop table if exists rb_menu;
create table if not exists rb_menu(
	id serial,
    p_id integer,
    menu_text varchar(50),
    menu_url varchar(50),
    menu_icon varchar(50),
    order_num integer,
    menu_disable boolean default false,
    primary key(id)
);

insert into rb_menu(id,p_id, menu_text,menu_url, menu_icon,order_num) VALUES
(1,0,'系统管理','sys','el-icon-s-tools',0),
(7,0,'文章管理','artical','el-icon-reading',1),
(8,0,'监控中心','monitor','el-icon-camera',3);

insert into rb_menu(p_id, menu_text,menu_url, menu_icon,order_num) VALUES
(1,'用户管理','user','el-icon-user-solid',1),
(1,'角色管理','role','el-icon-s-custom',2),
(1,'权限管理','auth','el-icon-s-ticket',3),
(1,'菜单管理','menu','el-icon-menu',4);

insert into rb_menu(p_id, menu_text,menu_url, menu_icon,order_num) VALUES
(7,'文章列表','list','el-icon-document',2);

-- 用户表
drop table if exists rb_user;
create table if not exists rb_user (
   uid serial ,
   organize_id	integer,
   login_name	varchar(255),
   password	varchar(255),
   user_name	varchar(255),
   mobile		varchar(15),
   email		varchar(50),
   generate_time	timestamp,
   first_time		timestamp,
   last_login_time	timestamp,
   count			integer,
   primary key (uid)
);

-- 权限表
drop table if exists rb_authority;
create table if not exists rb_authority(
   authority_id serial,
   p_id integer,
   authority_name varchar(100),
   description varchar(200),
   primary key(authority_id)
);

-- 角色表
drop table if exists rb_role;
create table if not exists rb_role (
   role_id serial,
   parent_role_id inteter,
   role_name varchar(50),
   generate_time timestamp,
   description varchar(100),
   primary key(role_id)
);

-- 用户权限表
drop table if exists rb_user_auth;
create table if not exists rb_user_auth (
    id serial,
    u_id integer,
    a_id integer,
    primary key(id)
);

-- 角色权限表
drop table if exists rb_role_auth;
create table if not exists rb_role_auth (
    id serial,
    r_id integer,
    a_id integer,
    authority_tyep int,
    primary key (id)
);

-- 用户角色表
drop table if exists rb_user_role;
create table if not exists rb_user_role (
    id serial,
    u_id integer,
    r_id integer,
    primary key (id)
);
