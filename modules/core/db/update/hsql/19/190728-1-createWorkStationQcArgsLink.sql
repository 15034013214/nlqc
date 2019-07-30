create table NLQC_WORK_STATION_QC_ARGS_LINK (
    QC_ARGS_ID varchar(36) not null,
    WORK_STATION_ID varchar(36) not null,
    primary key (QC_ARGS_ID, WORK_STATION_ID)
);
