-- create statement for type group table
create table type_group
(
   group_cd varchar(20) primary key,
   type_cd_prefix varchar(10) not null,
   group_description varchar(255) not null,
   created_by integer ,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date
)
;
-- create statement for type table
create table type_table
(
   type_cd varchar(20) primary key,
   group_cd varchar(20),
   type_description varchar(255) not null,
   status_cd varchar(20) not null,
   created_by integer ,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (group_cd) references type_group(group_cd)
)
;

