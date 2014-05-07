-- create statement for user login
create table user_login
(
   login_id integer primary key auto_increment,
   user_name varchar(255) not null,
   password_sha varchar(128) not null,
   first_name varchar(50) not null,
   last_name varchar(50) not null,
   status_cd varchar(20) not null,
   created_by integer ,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (status_cd) references type_table(type_cd)
)
;

-- create statement for user roles
create table user_roles
(
   user_roles_id integer primary key auto_increment,
   login_id integer not null,
   role_cd varchar(20) not null,
   comments varchar(255),
   created_by integer ,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (login_id) references user_login(login_id),
   foreign key (role_cd) references type_table(type_cd)
)
;

