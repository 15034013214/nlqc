create table NLQC_QC_RECORD_BILLS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QC_RECORD_BILL_ITEM varchar(255),
    CREATE_TIME timestamp,
    CAR_MODEL_NO varchar(255),
    QC_WORK_STATION_NO varchar(255),
    QC_WORK_STATION_NAME varchar(255),
    QC_ARGS_NO varchar(255),
    QC_ARGS_TYPE varchar(255),
    QC_TYPE varchar(255),
    --
    primary key (ID)
);