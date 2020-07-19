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
);