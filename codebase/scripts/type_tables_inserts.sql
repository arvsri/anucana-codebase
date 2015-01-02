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

-- profile access group and code 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('profile_access_cd','pac_','group code for profile access',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('pac_all','profile_access_cd','Everyone','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('pac_non','profile_access_cd','No One','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('pac_few','profile_access_cd','Community Members','tcs_act',1,curdate(),1,curdate());

-- message type group and code 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('message_cd','mc_','group code for messages in message inbox',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('mc_anyms','message_cd','type code message - annonymous','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('mc_user','message_cd','type code message - logged in user','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('mc_event','message_cd','type code message - event','tcs_act',1,curdate(),1,curdate());

-- Community Status 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('community_status','cs_','group code for community status',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('cs_act','community_status','community status - active','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('cs_inact','community_status','community status - inactive','tcs_act',1,curdate(),1,curdate());

-- Event Status 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('event_status','es_','group code for event status',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('es_act','event_status','event status - active','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('es_inact_sus','event_status','event status - inactive suspended','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('es_inact_proj','event_status','event status - inactive projected','tcs_act',1,curdate(),1,curdate());

-- User Event Status 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('user_event_status','ues_','group code for user event status',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_enrol','user_event_status','user event status - enrolled','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_paid','user_event_status','user event status - payment made','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_pay_failed','user_event_status','user event status - payment failed','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_dispute','user_event_status','user event status - dispute','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_cancel','user_event_status','user event status - cancelled','tcs_act',1,curdate(),1,curdate());
insert into type_table(type_cd,group_cd,type_description,status_cd,created_by,creation_dt,last_updated_by,last_update_dt)values ('ues_payrev','user_event_status','user event status - payment reversed','tcs_act',1,curdate(),1,curdate());

-- generic payment error response code 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('paygeneric_error','payge_','group code for generic payment error responses',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('paygeneric_error','Payment processing successful','payge_000','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('paygeneric_error','Generic Error while payment processing','payge_100','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('paygeneric_error','Invalid response from payment gateway','payge_200','tcs_act',1,curdate(),1,curdate());


-- payment transaction modes 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','ptm_','group code for payment modes',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','Credit Card','ptm_cc','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','Net Banking','ptm_nb','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','Cheque','ptm_cd','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','Demand Draft','ptm_dd','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_mode','Cash Pickup','ptm_co','tcs_act',1,curdate(),1,curdate());

-- payment transaction status
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_status','pts_','group code for payment status',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_status','Payment Success','pts_success','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_status','Payment Pending','pts_pending','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_status','Payment Failure','pts_failure','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_status','Payment Dispute','pts_dispute','tcs_act',1,curdate(),1,curdate());

-- payment transaction log type
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_log','ptl_','group code for payment status',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_log','Payment Transaction Request','ptl_request','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payment_tx_log','Payment Transaction Request','ptl_response','tcs_act',1,curdate(),1,curdate());

-- coupon status
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('coupon_status','coups_','group code for discount coupon status',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('coupon_status','Active','coups_act','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('coupon_status','Inactive','coups_inact','tcs_act',1,curdate(),1,curdate());

-- discount calculation strategy
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('disc_calc','dc_','group code for discount calculation strategy',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('disc_calc','Absolute Discount','dc_abs','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('disc_calc','Percentage Discount','dc_per','tcs_act',1,curdate(),1,curdate());
