create user rbac with password 'admin';
create database rbacdb with owner rbac;
\c rbacdb;
create schema rbac_db authorization rbac;
alter ROLE rbac set search_path =rbac_db;
