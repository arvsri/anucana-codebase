-- type code status group and code 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('type_code_status','tcs_','group code for type code status',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('tcs_act','type_code_status','type code status - active','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('tcs_inact','type_code_status','type code status - inactive','tcs_act',1,curdate(),1,curdate());

-- login status type group and code
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('login_status','ls_','group code for login statuses',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ls_act','login_status','user login status - active','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ls_inact','login_status','user login status - inactive','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ls_sus','login_status','user login status - suspended','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ls_del','login_status','user login status - deleted','tcs_act',1,curdate(),1,curdate());

-- user roles group and code
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('user_roles','ur_','group code for user roles',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_gu','user_roles','user role - general user','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_cm','user_roles','user role - community member','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_cmo','user_roles','user role - community moderator','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_sa','user_roles','user role - sales agent ','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_fa','user_roles','user role - finance agent','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ur_a','user_roles','user role - admin','tcs_act',1,curdate(),1,curdate());

-- phone type group and code
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('phone_type_cd','ptc_','group code for phone type',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ptc_w','phone_type_cd','Work','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ptc_m','phone_type_cd','Mobile','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('ptc_h','phone_type_cd','Home','tcs_act',1,curdate(),1,curdate());

-- messenger type group and code
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('messenger_type_cd','mtc_','group code for messenger type',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('mtc_skype','messenger_type_cd','Skype','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('mtc_gtalk','messenger_type_cd','Gtalk','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('mtc_yahoo','messenger_type_cd','Yahoo','tcs_act',1,curdate(),1,curdate());
