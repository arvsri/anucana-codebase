-- payu money response error code 
insert into type_group(group_cd,type_cd_prefix,group_description,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','payum_','group code for payu money error responses',1,curdate(),1,curdate());

insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Address_failure','payum_e314','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Address_invalid','payum_e304','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Amount_difference','payum_e702','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Authentication_error','payum_e303','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Authentication_incomplete','payum_e335','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Authentication_service_unavailable','payum_e334','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Awaiting_processing','payum_e505','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Bank_denied','payum_e312','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Bank_server_error','payum_e208','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Batch_error','payum_e216','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Brand_invalid','payum_e201','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Card_fraud_suspected','payum_e324','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Card_issuer_timed_out','payum_e218','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Card_not_enrolled','payum_e900','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Card_number_invalid','payum_e305','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Checksum_failure','payum_e213','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Communication_error','payum_e210','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Curl_call_failure','payum_e214','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Curl_error_card_verification','payum_e203','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Curl_error_enrolled','payum_e205','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Curl_error_not_enrolled','payum_e204','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Cutoff_error','payum_e206','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Cvc_address_failure','payum_e315','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Cvc_failure','payum_e313','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Duplicate_transaction','payum_e504','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Expired_card','payum_e311','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Expiry_date_low_funds','payum_e336','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Incomplete_bank_response','payum_e219','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Incomplete_data','payum_e712','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Insufficient_funds','payum_e706','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Insufficient_funds_authentication_failure','payum_e719','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Insufficient_funds_expiry_invalid','payum_e713','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Insufficient_funds_invalid_cvv','payum_e718','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','International_card_not_allowed','payum_e903','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_account_number','payum_e717','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_amount','payum_e715','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_card_name','payum_e709','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_card_type','payum_e902','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_contact','payum_e333','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_email_id','payum_e331','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_expiry_date','payum_e323','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_fax','payum_e332','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_login','payum_e327','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_pan','payum_e707','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_pin','payum_e710','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_transaction_type','payum_e207','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_user_defined_data','payum_e711','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Invalid_zip','payum_e714','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Issuer_declined_low_funds','payum_e329','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Lost_card','payum_e310','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Merchant_invalid_pg','payum_e200','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Network_error','payum_e211','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','No_bank_response','payum_e209','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','No_error','payum_e000','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Not_captured','payum_e337','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Parameters_mismatch','payum_e328','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Password_error','payum_e326','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Payment_gateway_validation_failure','payum_e330','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','PayUMoney_api_error','payum_e600','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Permitted_bank_settings_error','payum_e716','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Pin_retries_exceeded','payum_e708','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Prefered_gateway_not_set','payum_e800','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Receipt_number_error','payum_e704','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Reserved_usage_error','payum_e215','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Restricted_card','payum_e325','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Retry_limit_exceeded','payum_e901','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Risk_denied_pg','payum_e307','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_authentication_error','payum_e317','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_cancelled','payum_e302','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_card_type','payum_e322','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_format_error','payum_e319','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_incorrect','payum_e301','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_not_enrolled','payum_e316','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_not_supported','payum_e318','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_password_error','payum_e300','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_server_error','payum_e321','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_3d_signature_error','payum_e320','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_hash_failure','payum_e700','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Secure_hash_skipped','payum_e701','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Server_communication_error','payum_e212','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','System_error_pg','payum_e309','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Tranportal_id_error','payum_e217','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_aborted','payum_e502','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_cancelled','payum_e503','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_failed','payum_e308','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_invalid','payum_e202','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_invalid_pg','payum_e306','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Transaction_number_error','payum_e703','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Unknown_error','payum_e501','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','Unknown_error_pg','payum_e500','tcs_act',1,curdate(),1,curdate());
insert into type_table(group_cd,type_description,type_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt) values ('payumoney_error','User_profile_settings_error','payum_e705','tcs_act',1,curdate(),1,curdate());