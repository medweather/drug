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
