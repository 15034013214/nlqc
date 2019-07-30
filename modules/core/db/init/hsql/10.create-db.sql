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
    DEVICE_TYPE varchar(50),
    NOTE varchar(255),
    WORK_STATION_ID varchar(36),
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
    FREQUENCY_NO varchar(255),
    QUANTITY integer,
    UNIT_ID varchar(36),
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
-- begin NLQC_QC_ITEM
create table NLQC_QC_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QC_ITEM_NO varchar(255) not null,
    QC_ITEM_NAME varchar(255) not null,
    QC_ARGS_ID varchar(36),
    DEVICE_ID varchar(36),
    MATEIAL_ID varchar(36),
    UNIT varchar(255),
    NORM_VALUE decimal(19, 2),
    UP_VALUE decimal(19, 2),
    BELOW_VALUE decimal(19, 2),
    IS_FIRST_QC boolean,
    FIRST_QC_FREQUENCY_ID varchar(36),
    IS_INITIATIVE_QC boolean,
    INITIATIVE_QC_FREQUENCY_ID varchar(36),
    IS_FINALLY_QC boolean,
    FINALLY_QC_FREQUENCY_ID varchar(36),
    IS_ROUNDS_QC boolean,
    ROUNDS_QC_FREQUENCY_ID varchar(36),
    IS_CONTROL_ITEM boolean,
    PICTURE bigint,
    QC_FLOW_ID varchar(36),
    --
    primary key (ID)
)^
-- end NLQC_QC_ITEM
-- begin NLQC_QC_FLOW
create table NLQC_QC_FLOW (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QC_FLOW_NO varchar(255),
    CAR_MODEL_ID varchar(36),
    QC_COURSE_ID varchar(36),
    WORK_STATION_ID varchar(36),
    IS_USE boolean,
    --
    primary key (ID)
)^
-- end NLQC_QC_FLOW

-- begin NLQC_FINAL_RECORD
create table NLQC_FINAL_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FLOW_NO varchar(255),
    CAR_MODEL_NO varchar(255),
    CAR_MODEL_NAME varchar(255),
    FINAL_RESULT varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_FINAL_RECORD
-- begin NLQC_UNIT_FOR_FREQUENCY
create table NLQC_UNIT_FOR_FREQUENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ integer not null,
    UNIT varchar(50) not null,
    UNIT_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end NLQC_UNIT_FOR_FREQUENCY
-- begin NLQC_WORK_STATION_DEVICE_LINK
create table NLQC_WORK_STATION_DEVICE_LINK (
    WORK_STATION_ID varchar(36) not null,
    DEVICE_ID varchar(36) not null,
    primary key (WORK_STATION_ID, DEVICE_ID)
)^
-- end NLQC_WORK_STATION_DEVICE_LINK
-- begin NLQC_WORK_STATION_QC_ARGS_LINK
create table NLQC_WORK_STATION_QC_ARGS_LINK (
    QC_ARGS_ID varchar(36) not null,
    WORK_STATION_ID varchar(36) not null,
    primary key (QC_ARGS_ID, WORK_STATION_ID)
)^
-- end NLQC_WORK_STATION_QC_ARGS_LINK
-- begin NLQC_QC_COURSE_WORK_STATION_LINK
create table NLQC_QC_COURSE_WORK_STATION_LINK (
    QC_COURSE_ID varchar(36) not null,
    WORK_STATION_ID varchar(36) not null,
    primary key (QC_COURSE_ID, WORK_STATION_ID)
)^
-- end NLQC_QC_COURSE_WORK_STATION_LINK

-- begin NLQC_QC_RECORD_BILLS_ITEM
create table NLQC_QC_RECORD_BILLS_ITEM (
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
    QC_ITEM_NO varchar(255),
    QC_ARGS_NO varchar(255),
    KEY_MATERIAL_NO varchar(255),
    ACTUAL_MATERIAL_NO varchar(255),
    QC_DEVICE_NO varchar(255),
    ACTUAL_DEVICE_NO varchar(255),
    NORM_VALUE bigint,
    UP_VALUE bigint,
    DOWN_VALUE bigint,
    ACTUAL_VALUE bigint,
    UNIT varchar(255),
    FIRST_HZ_ID varchar(36),
    INITIATIVE_HZ_ID varchar(36),
    LAST_HZ_ID varchar(36),
    CIRCLE_HZ_ID varchar(36),
    QC_TIME timestamp,
    IS_CONTROL boolean,
    QC_RESULT varchar(255),
    NOTE varchar(255),
    QC_RECORD_BILLS_ID varchar(36),
    --
    primary key (ID)
)^
-- end NLQC_QC_RECORD_BILLS_ITEM
-- begin NLQC_QC_RECORD_BILLS
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
    QC_USER varchar(255),
    QC_RRESULT varchar(50),
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end NLQC_QC_RECORD_BILLS
