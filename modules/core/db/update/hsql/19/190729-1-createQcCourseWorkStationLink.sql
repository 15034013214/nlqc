create table NLQC_QC_COURSE_WORK_STATION_LINK (
    QC_COURSE_ID varchar(36) not null,
    WORK_STATION_ID varchar(36) not null,
    primary key (QC_COURSE_ID, WORK_STATION_ID)
);
