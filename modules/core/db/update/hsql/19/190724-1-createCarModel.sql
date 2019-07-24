create table NLQC_CAR_MODEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_MODEL_NO varchar(255) not null,
    CAR_MODEL_NAME varchar(255) not null,
    NOTE varchar(255),
    --
    primary key (ID)
);