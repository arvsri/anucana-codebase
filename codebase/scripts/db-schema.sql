
    create table COMMUNITY (
        COMMUNITY_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        ABOUT longtext,
        ADDRESS longtext,
        EMAIL varchar(255),
        FOUNDATION_DT datetime not null,
        NAME varchar(255) not null unique,
        PHONE varchar(255),
        WEBSITE varchar(255),
        INDUSTRY_CD varchar(255),
        PHONE_TYPE varchar(255),
        STATUS_CD varchar(255),
        primary key (COMMUNITY_ID)
    );

    create table COMMUNITY_KEYWORDS (
        KEYWORD_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        KEYWORD varchar(255) not null,
        COMMUNITY_ID bigint not null,
        primary key (KEYWORD_ID)
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
        PASSWORD_SHA varchar(128) not null,
        LOGIN_ID bigint,
        primary key (LOGIN_HISTORY_ID)
    );

    create table USER_PRIMARY_INFO (
        USER_PRIMARY_INFO_ID bigint not null auto_increment,
        CREATED_BY bigint,
        CREATION_DT datetime,
        LAST_UPDATE_DT datetime,
        LAST_UPDATED_BY bigint,
        ADDRESS longtext,
        EMAIL varchar(255),
        GENDER varchar(1),
        MESSENGER varchar(255),
        PHONENUMBER varchar(20),
        MESSENGER_TYPE varchar(255),
        PHONE_TYPE varchar(255),
        LOGIN_ID bigint not null,
        primary key (USER_PRIMARY_INFO_ID)
    );

    create table USER_PROFILE_INFO (
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

    create table USER_ROLES (
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
        add index FK4DDD3FC9BC2350E6 (PHONE_TYPE), 
        add constraint FK4DDD3FC9BC2350E6 
        foreign key (PHONE_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table COMMUNITY_KEYWORDS 
        add index FK2E7D336074A0E221 (COMMUNITY_ID), 
        add constraint FK2E7D336074A0E221 
        foreign key (COMMUNITY_ID) 
        references COMMUNITY (COMMUNITY_ID);

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

    alter table USER_PRIMARY_INFO 
        add index FK47F2A0DF13211156 (LOGIN_ID), 
        add constraint FK47F2A0DF13211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_PRIMARY_INFO 
        add index FK47F2A0DF4E4D9261 (MESSENGER_TYPE), 
        add constraint FK47F2A0DF4E4D9261 
        foreign key (MESSENGER_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PRIMARY_INFO 
        add index FK47F2A0DFBC2350E6 (PHONE_TYPE), 
        add constraint FK47F2A0DFBC2350E6 
        foreign key (PHONE_TYPE) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFO 
        add index FKD34F559826B88BDD (INDUSTRY_CD), 
        add constraint FKD34F559826B88BDD 
        foreign key (INDUSTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFO 
        add index FKD34F5598EC34FB25 (COUNTRY_CD), 
        add constraint FKD34F5598EC34FB25 
        foreign key (COUNTRY_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_PROFILE_INFO 
        add index FKD34F559813211156 (LOGIN_ID), 
        add constraint FKD34F559813211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_PROFILE_INFO 
        add index FKD34F5598FC5BCACE (AREA_CD), 
        add constraint FKD34F5598FC5BCACE 
        foreign key (AREA_CD) 
        references TYPE_TABLE (TYPE_CD);

    alter table USER_ROLES 
        add index FKC6C7992913211156 (LOGIN_ID), 
        add constraint FKC6C7992913211156 
        foreign key (LOGIN_ID) 
        references USER_LOGIN (LOGIN_ID);

    alter table USER_ROLES 
        add index FKC6C799297AEBA645 (ROLE_CD), 
        add constraint FKC6C799297AEBA645 
        foreign key (ROLE_CD) 
        references TYPE_TABLE (TYPE_CD);
