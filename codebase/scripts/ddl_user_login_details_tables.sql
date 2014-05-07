-- create statement for user primary information
create table user_primary_info
(
   user_primary_info_id integer primary key auto_increment,
   login_id integer not null,
   address varchar(1000),
   email varchar(255),
   gender char(1),
   phone varchar(20),
   phone_type varchar(20),
   messenger varchar(255),
   messenger_type varchar(20),
   created_by integer,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (login_id) references user_login(login_id),
   foreign key (phone_type) references type_table(type_cd),
   foreign key (messenger_type) references type_table(type_cd)
)
;

-- create statement for user profile information
create table user_profile_info
(
   user_profile_info_id integer primary key auto_increment,
   login_id integer not null,
   profile_heading varchar(255),
   country_cd varchar(20),
   area_cd varchar(20),
   industry_cd varchar(20),
   summary varchar(2000),
   created_by integer,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (login_id) references user_login(login_id),
   foreign key (country_cd) references type_table(type_cd),
   foreign key (area_cd) references type_table(type_cd),
   foreign key (industry_cd) references type_table(type_cd)
)
;
