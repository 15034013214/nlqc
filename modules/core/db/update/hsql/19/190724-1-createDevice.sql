create table NLQC_DEVICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEVICE_NO varchar(255) not null,
    DEVICE_NAME varchar(255) not null,
    DEVICE_MODEL varchar(255),
    DEVICE_STATUS varchar(255),
    NOTE varchar(255),
    --
    primary key (ID)
);