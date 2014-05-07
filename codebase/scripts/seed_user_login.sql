-- seed data for user name arv.sri.ggn@gmail.com. password is mylogin@01
insert into user_login
values
(
   null,
   'arv.sri.ggn@gmail.com',
   'b949af3a6707417a987a851afb690881c4caaa7e',
   'Arvind',
   'Srivastava',
   'ls_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_primary_info
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   null,
   'arv.sri.ggn@gmail.com',
   null,
   null,
   null,
   null,
   null,
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_profile_info
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   null,
   null,
   null,
   null,
   null,
   1,
   curdate(),
   1,
   curdate()
)
;

-- giving all roles to the user arv.sri.ggn@gmail.com
insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_gu',
   'general user',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_cm',
   'community member',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_cmo',
   'community moderator',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_sa',
   'sales agent',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_fa',
   'finance agent',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into user_roles
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   'ur_a',
   'admin',
   1,
   curdate(),
   1,
   curdate()
)
;
-- seed data for a communities ( java community, mainframe community)
insert into communities
values
(
   null,
   'Java Community',
   'a virtual abode for all java geeks',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into communities
values
(
   null,
   'Mainframe Community',
   'an interesting place for all boring people',
   1,
   curdate(),
   1,
   curdate()
)
;

-- seed data for user arv.sri.ggn@gmail.com joining java community
insert into user_communities
values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   (select community_id from communities where name = 'Java Community'),
   1,
   curdate(),
   1,
   curdate()
)
;


