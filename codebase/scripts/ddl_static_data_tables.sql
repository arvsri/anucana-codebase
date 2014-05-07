-- create statement for type group table
create table postal_codes
(
   postal_code_id integer primary key auto_increment,
   postal_code integer,
   country_cd varchar(20),
   state_name varchar(255) not null,
   district_name varchar(255) not null,
   office_name varchar(255) not null,
   foreign key (country_cd) references type_table(type_cd)
)
;