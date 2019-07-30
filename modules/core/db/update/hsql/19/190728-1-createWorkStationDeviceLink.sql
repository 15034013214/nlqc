create table NLQC_WORK_STATION_DEVICE_LINK (
    WORK_STATION_ID varchar(36) not null,
    DEVICE_ID varchar(36) not null,
    primary key (WORK_STATION_ID, DEVICE_ID)
);
