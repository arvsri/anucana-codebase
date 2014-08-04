-- give the user community moderator privileges
insert into user_role(user_roles_id,created_by,creation_dt,last_update_dt,last_updated_by,comments,role_cd,login_id) values (null,1,curdate(),curdate(),1,'Manually giving privileges','ur_cmo',(select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com') );
-- give the user admin privileges
insert into user_role(user_roles_id,created_by,creation_dt,last_update_dt,last_updated_by,comments,role_cd,login_id) values (null,1,curdate(),curdate(),1,'Manually giving privileges','ur_a',(select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com') );

-- revoke the user community moderator privileges
delete from user_role where role_cd = 'ur_cmo' and login_id = (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com');
-- revoke the user admin privileges
delete from user_role where role_cd = 'ur_a' and login_id = (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com');

