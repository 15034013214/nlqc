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
);