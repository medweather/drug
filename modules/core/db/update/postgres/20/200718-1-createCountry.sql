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
);