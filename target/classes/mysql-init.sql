-- Create table
drop table USERS;
drop table USER_ROLES;

create table USERS
(
  USERNAME VARCHAR(36) not null,
  PASSWORD VARCHAR(36) not null,
  ENABLED  smallint not null
) ;
 
alter table USERS
  add constraint USER_PK primary key (USERNAME);
 
---------------------
 
-- Create table
create table USER_ROLES
(
  ROLE_ID   VARCHAR(50) not null,
  USERNAME  VARCHAR(36) not null,
  USER_ROLE VARCHAR(30) not null
) ;
  
alter table USER_ROLES
  add constraint USER_ROLE_PK primary key (ROLE_ID);
 
alter table USER_ROLES
  add constraint USER_ROLE_UK unique (USERNAME, USER_ROLE);
  
-------------------------------
  
insert into USERS (USERNAME, PASSWORD, ENABLED)
values ('dbuser1', '12345', 1);
 
insert into USERS (USERNAME, PASSWORD, ENABLED)
values ('dbadmin1', '12345', 1);  

insert into USER_ROLES (ROLE_ID, USERNAME, USER_ROLE)
values ('1', 'dbuser1', 'USER');
 
insert into USER_ROLES (ROLE_ID, USERNAME, USER_ROLE)
values ('2', 'dbadmin1', 'ADMIN');
 
insert into USER_ROLES (ROLE_ID, USERNAME, USER_ROLE)
values ('3', 'dbadmin1', 'USER');