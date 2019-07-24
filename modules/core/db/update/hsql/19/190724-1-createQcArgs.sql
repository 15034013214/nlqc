create table NLQC_QC_ARGS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QC_ARGS_CODE varchar(255) not null,
    QC_ARGS_TYPE varchar(255) not null,
    QC_ARGS_NOTE varchar(255),
    WORK_STATION_ID varchar(36),
    NOTE varchar(255),
    --
    primary key (ID)
);