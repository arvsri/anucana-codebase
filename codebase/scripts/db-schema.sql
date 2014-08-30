
    create table ADDRESS (
        ADDRESS_ID bigint not null auto_increment,
        ADDRESS_LN_1 varchar(255),
        ADDRESS_LN_2 varchar(255),
        ADDRESS_LN_3 varchar(255),
        POSTAL_CODE_ID bigint,
        primary key (ADDRESS_ID)
    );

    create table COMMUNITY (
        COMMUNITY_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        ABOUT longtext,
        EMAIL varchar(255),
        FOUNDATION_DT datetime not null,
        NAME varchar(255) not null unique,
        PHONE varchar(10),
        WEBSITE varchar(255),
        ADDRESS_ID bigint,
        INDUSTRY_CD varchar(255),
        PHONE_TYPE varchar(255),
        STATUS_CD varchar(255) not null,
        primary key (COMMUNITY_ID)
    );

    create table COMMUNITY_KEYWORD (
        KEYWORD_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        KEYWORD varchar(255) not null,
        COMMUNITY_ID bigint not null,
        primary key (KEYWORD_ID)
    );

    create table DISCOUNT_COUPON (
        DISCOUNT_COUPON_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        DISCOUNT_COUPON_CD varchar(10) not null,
        RATE float,
        SUMMARY longtext,
        VALID_FROM_DT datetime not null,
        VALID_TO_DT datetime not null,
        CALC_STRATEGY varchar(255),
        STATUS_CD varchar(255),
        primary key (DISCOUNT_COUPON_ID)
    );

    create table EVENT (
        EVENT_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        DURATION_IN_MINS bigint,
        EVENT_DT datetime not null,
        IMPORTANCE_INDEX integer,
        LONG_DESC longtext,
        NAME varchar(255) not null,
        PHONE varchar(10),
        PROJECTED_ATTENDEE_COUNT bigint,
        RATE_INR float,
        SHORT_DESC varchar(255),
        COMMUNITY_ID bigint not null,
        PHONE_TYPE varchar(255),
        LOGIN_ID bigint not null,
        STATUS_CD varchar(255) not null,
        ADDRESS_ID bigint,
        primary key (EVENT_ID)
    );

    create table MESSAGE_INBOX (
        MESSAGE_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        EMAIL varchar(255) not null,
        FIRST_NAME varchar(50) not null,
        LAST_NAME varchar(50) not null,
        MESSAGE longtext,
        SOURCE_ID bigint,
        SUBJECT varchar(255) not null,
        MESSAGE_CD varchar(255) not null,
        primary key (MESSAGE_ID)
    );

    create table PASSWORD_HISTORY (
        PASSWORD_HISTORY_ID bigint not null auto_increment,
        PASSWORD_SHA varchar(128) not null,
        LOGIN_ID bigint not null,
        primary key (PASSWORD_HISTORY_ID)
    );

    create table PAYMENT_TRANSACTION (
        PAYMENT_TRANSACTION_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        AMOUNT float,
        BANK_REFERENCE_NUMBER varchar(255),
        BUSINESS_TRANSACTION_ID varchar(29) unique,
        DISCOUNT float,
        GATEWAY_RESPONSE_ID varchar(255),
        PAYMENT_GATEWAY_TYPE varchar(255),
        PAYMENT_RESPONSE_ID varchar(255) unique,
        ERROR_CD varchar(255),
        PAYMENT_MODE varchar(255),
        STATUS varchar(255) not null,
        USER_EVENT_ID bigint,
        primary key (PAYMENT_TRANSACTION_ID)
    );

    create table PAYMENT_TRANSACTION_LOG (
        PAYMENT_TRANSACTION_LOG_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        LOG_MESSAGE longtext,
        LOG_TYPE varchar(255),
        PAYMENT_TRANSACTION_ID bigint,
        primary key (PAYMENT_TRANSACTION_LOG_ID)
    );

    create table POSTAL_CODE (
        POSTAL_CODE_ID bigint not null auto_increment,
        DISTRICT_NAME varchar(255),
        OFFICE_NAME varchar(255),
        POSTAL_CD integer,
        STATE_NAME varchar(255),
        COUNTRY_CD varchar(255),
        primary key (POSTAL_CODE_ID)
    );

    create table TYPE_GROUP (
        GROUP_CD varchar(20) not null unique,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        GROUP_DESCRIPTION varchar(255) not null,
        TYPE_CD_PREFIX varchar(10) not null,
        primary key (GROUP_CD),
        unique (GROUP_CD)
    );

    create table TYPE_TABLE (
        TYPE_CD varchar(255) not null unique,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        TYPE_DESCRIPTION varchar(255) not null,
        GROUP_CD varchar(20) not null,
        STATUS_CD varchar(255) not null,
        primary key (TYPE_CD),
        unique (TYPE_CD)
    );

    create table USER_COMMUNITY (
        USER_COMMUNITY_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        COMMUNITY_ID bigint,
        LOGIN_ID bigint,
        primary key (USER_COMMUNITY_ID)
    );

    create table USER_EVENT (
        USER_EVENT_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        NET_PAYMENT float not null,
        NUMBER_OF_SEATS integer not null,
        PAYMENT float not null,
        PHONENUMBER varchar(10),
        DISCOUNT_COUPON_ID bigint,
        EVENT_ID bigint,
        STATUS_CD varchar(255) not null,
        LOGIN_ID bigint,
        primary key (USER_EVENT_ID)
    );

    create table USER_LOGIN (
        LOGIN_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        FIRST_NAME varchar(50) not null,
        LAST_NAME varchar(50) not null,
        PASSWORD_SHA varchar(128) not null,
        USER_NAME varchar(255) not null unique,
        STATUS_CD varchar(255) not null,
        primary key (LOGIN_ID)
    );

    create table USER_LOGIN_HISTORY (
        LOGIN_HISTORY_ID bigint not null auto_increment,
        CREATED_BY bigint not null,
        CREATION_DT datetime not null,
        LOGIN_IP varchar(45) not null,
        LOGIN_ID bigint,
        primary key (LOGIN_HISTORY_ID)
    );

    create table USER_PRIMARY_INFORMATION (
        USER_PRIMARY_INFO_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        EMAIL varchar(255),
        GENDER varchar(1),
        MESSENGER varchar(255),
        PHONENUMBER varchar(10),
        ADDRESS_ID bigint,
        ADDRESS_ACCESS varchar(255),
        EMAIL_ACCESS varchar(255),
        GENDER_ACCESS varchar(255),
        MESSENGER_ACCESS varchar(255),
        MESSENGER_TYPE varchar(255),
        PHONENUMBER_ACCESS varchar(255),
        PHONE_TYPE varchar(255),
        LOGIN_ID bigint not null,
        primary key (USER_PRIMARY_INFO_ID)
    );

    create table USER_PROFILE_INFORMATION (
        USER_PROFILE_INFO_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        PROFILE_HEADING varchar(255),
        SUMMARY longtext,
        AREA_CD varchar(255),
        COUNTRY_CD varchar(255),
        INDUSTRY_CD varchar(255),
        LOGIN_ID bigint not null,
        primary key (USER_PROFILE_INFO_ID)
    );

    create table USER_ROLE (
        USER_ROLES_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        COMMENTS varchar(255),
        ROLE_CD varchar(255) not null,
        LOGIN_ID bigint not null,
        primary key (USER_ROLES_ID)
    );

    alter table ADDRESS 
        add index FKE66327D472E2C950 (POSTAL_CODE_ID), 
        add constraint FKE66327D472E2C950 
        foreign key (POSTAL_CODE_ID) 
        references POSTAL_CODE (POSTAL_CODE_ID);

    alter table COMMUNITY 
        add index FK4DDD3FC926B88BDD (INDUSTRY_CD), 
        add constraint FK4DDD3FC926B88BDD 
        foreign key (INDUSTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table COMMUNITY 
        add index FK4DDD3FC9AD755549 (STATUS_CD), 
        add constraint FK4DDD3FC9AD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table COMMUNITY 
        add index FK4DDD3FC961A10F01 (ADDRESS_ID), 
        add constraint FK4DDD3FC961A10F01 
        foreign key (ADDRESS_ID) 
        references ADDRESS (ADDRESS_ID);

    alter table COMMUNITY 
        add index FK4DDD3FC9BC2350E6 (PHONE_TYPE), 
        add constraint FK4DDD3FC9BC2350E6 
        foreign key (PHONE_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table COMMUNITY_KEYWORD 
        add index FKE8B9B75374A0E221 (COMMUNITY_ID), 
        add constraint FKE8B9B75374A0E221 
        foreign key (COMMUNITY_ID) 
        references COMMUNITY (COMMUNITY_ID);

    alter table DISCOUNT_COUPON 
        add index FK87828E4AD755549 (STATUS_CD), 
        add constraint FK87828E4AD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table DISCOUNT_COUPON 
        add index FK87828E48AC3B98 (CALC_STRATEGY), 
        add constraint FK87828E48AC3B98 
        foreign key (CALC_STRATEGY) 
        references TYPE_TABLE (TYPE_CD);

    alter table EVENT 
        add index FK3F47A7AAD755549 (STATUS_CD), 
        add constraint FK3F47A7AAD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table EVENT 
        add index FK3F47A7A13211156 (LOGIN_ID), 
        add constraint FK3F47A7A13211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table EVENT 
        add index FK3F47A7A61A10F01 (ADDRESS_ID), 
        add constraint FK3F47A7A61A10F01 
        foreign key (ADDRESS_ID) 
        references ADDRESS (ADDRESS_ID);

    alter table EVENT 
        add index FK3F47A7ABC2350E6 (PHONE_TYPE), 
        add constraint FK3F47A7ABC2350E6 
        foreign key (PHONE_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table EVENT 
        add index FK3F47A7A74A0E221 (COMMUNITY_ID), 
        add constraint FK3F47A7A74A0E221 
        foreign key (COMMUNITY_ID) 
        references COMMUNITY (COMMUNITY_ID);

    alter table MESSAGE_INBOX 
        add index FKA767500EC413B114 (MESSAGE_CD), 
        add constraint FKA767500EC413B114 
        foreign key (MESSAGE_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table PASSWORD_HISTORY 
        add index FKFDEFF6D013211156 (LOGIN_ID), 
        add constraint FKFDEFF6D013211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table PAYMENT_TRANSACTION 
        add index FK39CCD9E5662AE8EA (USER_EVENT_ID), 
        add constraint FK39CCD9E5662AE8EA 
        foreign key (USER_EVENT_ID) 
        references USER_EVENT (USER_EVENT_ID);

    alter table PAYMENT_TRANSACTION 
        add index FK39CCD9E5F3A7E16D (STATUS), 
        add constraint FK39CCD9E5F3A7E16D 
        foreign key (STATUS) 
        references TYPE_TABLE (TYPE_CD);

    alter table PAYMENT_TRANSACTION 
        add index FK39CCD9E57C111373 (ERROR_CD), 
        add constraint FK39CCD9E57C111373 
        foreign key (ERROR_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table PAYMENT_TRANSACTION 
        add index FK39CCD9E5B3825B7 (PAYMENT_MODE), 
        add constraint FK39CCD9E5B3825B7 
        foreign key (PAYMENT_MODE) 
        references TYPE_TABLE (TYPE_CD);

    alter table PAYMENT_TRANSACTION_LOG 
        add index FK727FB5CAF0E6AD2C (PAYMENT_TRANSACTION_ID), 
        add constraint FK727FB5CAF0E6AD2C 
        foreign key (PAYMENT_TRANSACTION_ID) 
        references PAYMENT_TRANSACTION (PAYMENT_TRANSACTION_ID);

    alter table PAYMENT_TRANSACTION_LOG 
        add index FK727FB5CAA0E120D0 (LOG_TYPE), 
        add constraint FK727FB5CAA0E120D0 
        foreign key (LOG_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table POSTAL_CODE 
        add index FK7B434E1EC34FB25 (COUNTRY_CD), 
        add constraint FK7B434E1EC34FB25 
        foreign key (COUNTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table TYPE_TABLE 
        add index FK132A5A69AD755549 (STATUS_CD), 
        add constraint FK132A5A69AD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table TYPE_TABLE 
        add index FK132A5A696494B98D (GROUP_CD), 
        add constraint FK132A5A696494B98D 
        foreign key (GROUP_CD) 
        references TYPE_GROUP (GROUP_CD);

    alter table USER_COMMUNITY 
        add index FKC601C5513211156 (LOGIN_ID), 
        add constraint FKC601C5513211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_COMMUNITY 
        add index FKC601C5574A0E221 (COMMUNITY_ID), 
        add constraint FKC601C5574A0E221 
        foreign key (COMMUNITY_ID) 
        references COMMUNITY (COMMUNITY_ID);

    alter table USER_EVENT 
        add index FKC6137D062FDA11C1 (EVENT_ID), 
        add constraint FKC6137D062FDA11C1 
        foreign key (EVENT_ID) 
        references EVENT (EVENT_ID);

    alter table USER_EVENT 
        add index FKC6137D0613211156 (LOGIN_ID), 
        add constraint FKC6137D0613211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_EVENT 
        add index FKC6137D06AD755549 (STATUS_CD), 
        add constraint FKC6137D06AD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_EVENT 
        add index FKC6137D069EA4A89C (DISCOUNT_COUPON_ID), 
        add constraint FKC6137D069EA4A89C 
        foreign key (DISCOUNT_COUPON_ID) 
        references DISCOUNT_COUPON (DISCOUNT_COUPON_ID);

    alter table USER_LOGIN 
        add index FKC672F9D5AD755549 (STATUS_CD), 
        add constraint FKC672F9D5AD755549 
        foreign key (STATUS_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_LOGIN_HISTORY 
        add index FKFF56C0A13211156 (LOGIN_ID), 
        add constraint FKFF56C0A13211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB9DC8FD8B (MESSENGER_ACCESS), 
        add constraint FKF5DEDBBB9DC8FD8B 
        foreign key (MESSENGER_ACCESS) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB13211156 (LOGIN_ID), 
        add constraint FKF5DEDBBB13211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB9D7A661D (GENDER_ACCESS), 
        add constraint FKF5DEDBBB9D7A661D 
        foreign key (GENDER_ACCESS) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB16CC70E2 (EMAIL_ACCESS), 
        add constraint FKF5DEDBBB16CC70E2 
        foreign key (EMAIL_ACCESS) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB4E4D9261 (MESSENGER_TYPE), 
        add constraint FKF5DEDBBB4E4D9261 
        foreign key (MESSENGER_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB61A10F01 (ADDRESS_ID), 
        add constraint FKF5DEDBBB61A10F01 
        foreign key (ADDRESS_ID) 
        references ADDRESS (ADDRESS_ID);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBBBC2350E6 (PHONE_TYPE), 
        add constraint FKF5DEDBBBBC2350E6 
        foreign key (PHONE_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB2AC48D8A (ADDRESS_ACCESS), 
        add constraint FKF5DEDBBB2AC48D8A 
        foreign key (ADDRESS_ACCESS) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFORMATION 
        add index FKF5DEDBBB6C8ED9E7 (PHONENUMBER_ACCESS), 
        add constraint FKF5DEDBBB6C8ED9E7 
        foreign key (PHONENUMBER_ACCESS) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFORMATION 
        add index FK904914E226B88BDD (INDUSTRY_CD), 
        add constraint FK904914E226B88BDD 
        foreign key (INDUSTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFORMATION 
        add index FK904914E2EC34FB25 (COUNTRY_CD), 
        add constraint FK904914E2EC34FB25 
        foreign key (COUNTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFORMATION 
        add index FK904914E213211156 (LOGIN_ID), 
        add constraint FK904914E213211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_PROFILE_INFORMATION 
        add index FK904914E2FC5BCACE (AREA_CD), 
        add constraint FK904914E2FC5BCACE 
        foreign key (AREA_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_ROLE 
        add index FKBC16F46A13211156 (LOGIN_ID), 
        add constraint FKBC16F46A13211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_ROLE 
        add index FKBC16F46A7AEBA645 (ROLE_CD), 
        add constraint FKBC16F46A7AEBA645 
        foreign key (ROLE_CD) 
        references TYPE_TABLE (TYPE_CD);
