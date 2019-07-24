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
);