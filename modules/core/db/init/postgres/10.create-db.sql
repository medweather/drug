-- begin DRUG_MEDICAMENT
create table DRUG_MEDICAMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MEDICAMENT_NAME varchar(250),
    RELEASE_FORM varchar(1000),
    CIPHER varchar(50),
    IBD timestamp,
    --
    primary key (ID)
)^
-- end DRUG_MEDICAMENT
-- begin DRUG_COUNTRY
create table DRUG_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY_NAME varchar(250),
    COUNTRY_NAME_EN varchar(250),
    CIPHER varchar(250),
    --
    primary key (ID)
)^
-- end DRUG_COUNTRY
-- begin DRUG_STATUS_MEDICAMENT_REGISTRATION
create table DRUG_STATUS_MEDICAMENT_REGISTRATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MEDICAMENT_ID uuid,
    RELEASE_FORM varchar(255),
    COUNTRY_ID uuid,
    NUMBER_RU varchar(100),
    DATE_RU timestamp,
    STATUS varchar(50),
    INDICATION_FOR_USE text,
    SIDE_EFFECTS text,
    ATTACHMENT_ID uuid,
    --
    primary key (ID)
)^
-- end DRUG_STATUS_MEDICAMENT_REGISTRATION
