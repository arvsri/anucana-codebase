
    create table address (
        address_id bigint not null auto_increment,
        address_ln_1 varchar(255),
        address_ln_2 varchar(255),
        lattitude double precision,
        longitude double precision,
        postal_code_id bigint,
        primary key (address_id)
    );

    create table community (
        community_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        about longtext,
        email varchar(255),
        foundation_dt datetime not null,
        name varchar(255) not null unique,
        phone varchar(10),
        website varchar(255),
        address_id bigint,
        industry_cd varchar(255),
        phone_type varchar(255),
        status_cd varchar(255) not null,
        primary key (community_id)
    );

    create table community_keyword (
        keyword_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        keyword varchar(255) not null,
        community_id bigint not null,
        primary key (keyword_id)
    );

    create table discount_coupon (
        discount_coupon_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        discount_coupon_cd varchar(10) not null,
        rate float,
        summary longtext,
        valid_from_dt datetime not null,
        valid_to_dt datetime not null,
        calc_strategy varchar(255),
        status_cd varchar(255),
        primary key (discount_coupon_id)
    );

    create table event (
        event_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        duration_in_mins bigint,
        event_dt datetime not null,
        importance_index integer,
        long_desc longtext,
        name varchar(255) not null,
        phone varchar(10),
        projected_attendee_count bigint,
        rate_inr float,
        short_desc varchar(255),
        community_id bigint,
        phone_type varchar(255),
        login_id bigint,
        status_cd varchar(255) not null,
        address_id bigint,
        primary key (event_id)
    );

    create table message_inbox (
        message_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        email varchar(255) not null,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        message longtext,
        source_id bigint,
        subject varchar(255) not null,
        message_cd varchar(255) not null,
        primary key (message_id)
    );

    create table password_history (
        password_history_id bigint not null auto_increment,
        password_sha varchar(128) not null,
        login_id bigint not null,
        primary key (password_history_id)
    );

    create table payment_transaction (
        payment_transaction_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        amount float,
        bank_reference_number varchar(255),
        business_transaction_id varchar(29) unique,
        discount float,
        gateway_response_id varchar(255),
        payment_gateway_type varchar(255),
        payment_response_id varchar(255) unique,
        error_cd varchar(255),
        payment_mode varchar(255),
        STATUS varchar(255) not null,
        user_event_id bigint,
        primary key (payment_transaction_id)
    );

    create table payment_transaction_log (
        payment_transaction_log_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        log_message longtext,
        log_type varchar(255),
        payment_transaction_id bigint,
        primary key (payment_transaction_log_id)
    );

    create table postal_code (
        postal_code_id bigint not null auto_increment,
        district_name varchar(255),
        office_name varchar(255),
        postal_cd integer,
        state_name varchar(255),
        country_cd varchar(255),
        primary key (postal_code_id)
    );

    create table type_group (
        group_cd varchar(20) not null unique,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        group_description varchar(255) not null,
        type_cd_prefix varchar(10) not null,
        primary key (group_cd),
        unique (group_cd)
    );

    create table type_table (
        type_cd varchar(255) not null unique,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        type_description varchar(255) not null,
        group_cd varchar(20) not null,
        status_cd varchar(255) not null,
        primary key (type_cd),
        unique (type_cd)
    );

    create table user_community (
        user_community_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        community_id bigint,
        login_id bigint,
        primary key (user_community_id)
    );

    create table user_event (
        user_event_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        net_payment float not null,
        number_of_seats integer not null,
        payment float not null,
        phonenumber varchar(10),
        discount_coupon_id bigint,
        event_id bigint,
        status_cd varchar(255) not null,
        login_id bigint,
        primary key (user_event_id)
    );

    create table user_login (
        login_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password_sha varchar(128) not null,
        user_name varchar(255) not null unique,
        status_cd varchar(255) not null,
        primary key (login_id)
    );

    create table user_login_history (
        login_history_id bigint not null auto_increment,
        created_by bigint not null,
        creation_dt datetime not null,
        login_ip varchar(45) not null,
        login_id bigint,
        primary key (login_history_id)
    );

    create table user_primary_information (
        user_primary_info_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        email varchar(255),
        gender varchar(1),
        messenger varchar(255),
        phonenumber varchar(10),
        address_id bigint,
        address_access varchar(255),
        email_access varchar(255),
        gender_access varchar(255),
        messenger_access varchar(255),
        messenger_type varchar(255),
        phonenumber_access varchar(255),
        phone_type varchar(255),
        login_id bigint not null,
        primary key (user_primary_info_id)
    );

    create table user_profile_information (
        user_profile_info_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        profile_heading varchar(255),
        summary longtext,
        area_cd varchar(255),
        country_cd varchar(255),
        industry_cd varchar(255),
        login_id bigint not null,
        primary key (user_profile_info_id)
    );

    create table user_role (
        user_roles_id bigint not null auto_increment,
        created_by bigint,
        creation_dt datetime,
        last_update_dt datetime,
        last_updated_by bigint,
        comments varchar(255),
        role_cd varchar(255) not null,
        login_id bigint not null,
        primary key (user_roles_id)
    );

    alter table address 
        add index FKBB979BF472E2C950 (postal_code_id), 
        add constraint FKBB979BF472E2C950 
        foreign key (postal_code_id) 
        references postal_code (postal_code_id);

    alter table community 
        add index FKA7C52FE926B88BDD (industry_cd), 
        add constraint FKA7C52FE926B88BDD 
        foreign key (industry_cd) 
        references type_table (type_cd);

    alter table community 
        add index FKA7C52FE9AD755549 (status_cd), 
        add constraint FKA7C52FE9AD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table community 
        add index FKA7C52FE961A10F01 (address_id), 
        add constraint FKA7C52FE961A10F01 
        foreign key (address_id) 
        references address (address_id);

    alter table community 
        add index FKA7C52FE9BC2350E6 (phone_type), 
        add constraint FKA7C52FE9BC2350E6 
        foreign key (phone_type) 
        references type_table (type_cd);

    alter table community_keyword 
        add index FKF173FB9374A0E221 (community_id), 
        add constraint FKF173FB9374A0E221 
        foreign key (community_id) 
        references community (community_id);

    alter table discount_coupon 
        add index FK291924E4AD755549 (status_cd), 
        add constraint FK291924E4AD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table discount_coupon 
        add index FK291924E48AC3B98 (calc_strategy), 
        add constraint FK291924E48AC3B98 
        foreign key (calc_strategy) 
        references type_table (type_cd);

    alter table event 
        add index FK5C6729AAD755549 (status_cd), 
        add constraint FK5C6729AAD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table event 
        add index FK5C6729A13211156 (login_id), 
        add constraint FK5C6729A13211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table event 
        add index FK5C6729A61A10F01 (address_id), 
        add constraint FK5C6729A61A10F01 
        foreign key (address_id) 
        references address (address_id);

    alter table event 
        add index FK5C6729ABC2350E6 (phone_type), 
        add constraint FK5C6729ABC2350E6 
        foreign key (phone_type) 
        references type_table (type_cd);

    alter table event 
        add index FK5C6729A74A0E221 (community_id), 
        add constraint FK5C6729A74A0E221 
        foreign key (community_id) 
        references community (community_id);

    alter table message_inbox 
        add index FKB70E244EC413B114 (message_cd), 
        add constraint FKB70E244EC413B114 
        foreign key (message_cd) 
        references type_table (type_cd);

    alter table password_history 
        add index FKF16E7AF013211156 (login_id), 
        add constraint FKF16E7AF013211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table payment_transaction 
        add index FK90008A25662AE8EA (user_event_id), 
        add constraint FK90008A25662AE8EA 
        foreign key (user_event_id) 
        references user_event (user_event_id);

    alter table payment_transaction 
        add index FK90008A25F3A7E16D (STATUS), 
        add constraint FK90008A25F3A7E16D 
        foreign key (STATUS) 
        references type_table (type_cd);

    alter table payment_transaction 
        add index FK90008A257C111373 (error_cd), 
        add constraint FK90008A257C111373 
        foreign key (error_cd) 
        references type_table (type_cd);

    alter table payment_transaction 
        add index FK90008A25B3825B7 (payment_mode), 
        add constraint FK90008A25B3825B7 
        foreign key (payment_mode) 
        references type_table (type_cd);

    alter table payment_transaction_log 
        add index FK2AE1C22AF0E6AD2C (payment_transaction_id), 
        add constraint FK2AE1C22AF0E6AD2C 
        foreign key (payment_transaction_id) 
        references payment_transaction (payment_transaction_id);

    alter table payment_transaction_log 
        add index FK2AE1C22AA0E120D0 (log_type), 
        add constraint FK2AE1C22AA0E120D0 
        foreign key (log_type) 
        references type_table (type_cd);

    alter table postal_code 
        add index FK859DB0E1EC34FB25 (country_cd), 
        add constraint FK859DB0E1EC34FB25 
        foreign key (country_cd) 
        references type_table (type_cd);

    alter table type_table 
        add index FKBFA55A89AD755549 (status_cd), 
        add constraint FKBFA55A89AD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table type_table 
        add index FKBFA55A896494B98D (group_cd), 
        add constraint FKBFA55A896494B98D 
        foreign key (group_cd) 
        references type_group (group_cd);

    alter table user_community 
        add index FK52D147513211156 (login_id), 
        add constraint FK52D147513211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_community 
        add index FK52D147574A0E221 (community_id), 
        add constraint FK52D147574A0E221 
        foreign key (community_id) 
        references community (community_id);

    alter table user_event 
        add index FK728E7D262FDA11C1 (event_id), 
        add constraint FK728E7D262FDA11C1 
        foreign key (event_id) 
        references event (event_id);

    alter table user_event 
        add index FK728E7D2613211156 (login_id), 
        add constraint FK728E7D2613211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_event 
        add index FK728E7D26AD755549 (status_cd), 
        add constraint FK728E7D26AD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table user_event 
        add index FK728E7D269EA4A89C (discount_coupon_id), 
        add constraint FK728E7D269EA4A89C 
        foreign key (discount_coupon_id) 
        references discount_coupon (discount_coupon_id);

    alter table user_login 
        add index FK72EDF9F5AD755549 (status_cd), 
        add constraint FK72EDF9F5AD755549 
        foreign key (status_cd) 
        references type_table (type_cd);

    alter table user_login_history 
        add index FK6F32C04A13211156 (login_id), 
        add constraint FK6F32C04A13211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_primary_information 
        add index FK764D93FB9DC8FD8B (messenger_access), 
        add constraint FK764D93FB9DC8FD8B 
        foreign key (messenger_access) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB13211156 (login_id), 
        add constraint FK764D93FB13211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_primary_information 
        add index FK764D93FB9D7A661D (gender_access), 
        add constraint FK764D93FB9D7A661D 
        foreign key (gender_access) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB16CC70E2 (email_access), 
        add constraint FK764D93FB16CC70E2 
        foreign key (email_access) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB4E4D9261 (messenger_type), 
        add constraint FK764D93FB4E4D9261 
        foreign key (messenger_type) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB61A10F01 (address_id), 
        add constraint FK764D93FB61A10F01 
        foreign key (address_id) 
        references address (address_id);

    alter table user_primary_information 
        add index FK764D93FBBC2350E6 (phone_type), 
        add constraint FK764D93FBBC2350E6 
        foreign key (phone_type) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB2AC48D8A (address_access), 
        add constraint FK764D93FB2AC48D8A 
        foreign key (address_access) 
        references type_table (type_cd);

    alter table user_primary_information 
        add index FK764D93FB6C8ED9E7 (phonenumber_access), 
        add constraint FK764D93FB6C8ED9E7 
        foreign key (phonenumber_access) 
        references type_table (type_cd);

    alter table user_profile_information 
        add index FK10B7CD2226B88BDD (industry_cd), 
        add constraint FK10B7CD2226B88BDD 
        foreign key (industry_cd) 
        references type_table (type_cd);

    alter table user_profile_information 
        add index FK10B7CD22EC34FB25 (country_cd), 
        add constraint FK10B7CD22EC34FB25 
        foreign key (country_cd) 
        references type_table (type_cd);

    alter table user_profile_information 
        add index FK10B7CD2213211156 (login_id), 
        add constraint FK10B7CD2213211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_profile_information 
        add index FK10B7CD22FC5BCACE (area_cd), 
        add constraint FK10B7CD22FC5BCACE 
        foreign key (area_cd) 
        references type_table (type_cd);

    alter table user_role 
        add index FK143BF46A13211156 (login_id), 
        add constraint FK143BF46A13211156 
        foreign key (login_id) 
        references user_login (login_id);

    alter table user_role 
        add index FK143BF46A7AEBA645 (role_cd), 
        add constraint FK143BF46A7AEBA645 
        foreign key (role_cd) 
        references type_table (type_cd);
