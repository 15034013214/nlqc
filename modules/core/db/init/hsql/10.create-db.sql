-- begin NLQC_WORK_STATION
create table NLQC_WORK_STATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WORK_STATION_NO varchar(255) not null,
    WORK_STATION varchar(255),
    QCTYPE varchar(50) not null,
    QC_COURSE_ID varchar(36),
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_WORK_STATION
-- begin NLQC_QC_COURSE
create table NLQC_QC_COURSE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QC_COURSE_NO varchar(255) not null,
    QC_COURSE_NAME varchar(255),
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_QC_COURSE
-- begin NLQC_MATERIAL
create table NLQC_MATERIAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MATERIAL_NO varchar(255) not null,
    MATERIAL_NAME varchar(255) not null,
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_MATERIAL
-- begin NLQC_DEVICE
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
)^
-- end NLQC_DEVICE
-- begin NLQC_QC_ARGS
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
)^
-- end NLQC_QC_ARGS
-- begin NLQC_FREQUENCY
create table NLQC_FREQUENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUANTITY varchar(255),
    UNIT varchar(255),
    IS_INFINITY_BIG boolean,
    SHOW_TEXT varchar(255),
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_FREQUENCY
-- begin NLQC_CAR_MODEL
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
)^
-- end NLQC_CAR_MODEL
