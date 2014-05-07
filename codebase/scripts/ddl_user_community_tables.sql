-- create statement for user communities
create table community
(
   community_id integer primary key auto_increment,
   name varchar(255) not null unique,
   foundation_dt date not null,
   about varchar(5000),
   address varchar(1000),
   email varchar(255),
   website varchar(255),
   phone varchar(20),
   phone_type varchar(20),
   industry_cd varchar(20),
   status_cd varchar(20) not null,

   created_by integer ,
   creation_dt date,
   last_updated_by integer,
   last_update_dt date,
   foreign key (phone_type) references type_table(type_cd),
   foreign key (status_cd) references type_table(type_cd),
   foreign key (industry_cd) references type_table(type_cd)
)
;

-- create statement for user_communities
create table community_keywords
(
   keyword_id integer primary key auto_increment,
   community_id integer not null,
   keyword varchar(255) not null,
   created_by integer,
   creation_dt date,
   foreign key (community_id) references community(community_id)
)
;

-- create statement for user_communities
create table user_community
(
   user_community_id integer primary key auto_increment,
   login_id integer not null,
   community_id integer not null,
   created_by integer ,
   creation_dt date,
   foreign key (login_id) references user_login(login_id),
   foreign key (community_id) references community(community_id)
)
;

