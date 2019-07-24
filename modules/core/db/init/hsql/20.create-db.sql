-- begin NLQC_WORK_STATION
alter table NLQC_WORK_STATION add constraint FK_NLQC_WORK_STATION_ON_QC_COURSE foreign key (QC_COURSE_ID) references NLQC_QC_COURSE(ID)^
create index IDX_NLQC_WORK_STATION_ON_QC_COURSE on NLQC_WORK_STATION (QC_COURSE_ID)^
-- end NLQC_WORK_STATION
-- begin NLQC_QC_COURSE
create unique index IDX_NLQC_QC_COURSE_UNIQ_QC_COURSE_NO on NLQC_QC_COURSE (QC_COURSE_NO) ^
-- end NLQC_QC_COURSE
-- begin NLQC_MATERIAL
create unique index IDX_NLQC_MATERIAL_UNIQ_MATERIAL_NO on NLQC_MATERIAL (MATERIAL_NO) ^
create unique index IDX_NLQC_MATERIAL_UNIQ_MATERIAL_NAME on NLQC_MATERIAL (MATERIAL_NAME) ^
-- end NLQC_MATERIAL
-- begin NLQC_DEVICE
create unique index IDX_NLQC_DEVICE_UNIQ_DEVICE_NO on NLQC_DEVICE (DEVICE_NO) ^
-- end NLQC_DEVICE
-- begin NLQC_QC_ARGS
alter table NLQC_QC_ARGS add constraint FK_NLQC_QC_ARGS_ON_WORK_STATION foreign key (WORK_STATION_ID) references NLQC_WORK_STATION(ID)^
create index IDX_NLQC_QC_ARGS_ON_WORK_STATION on NLQC_QC_ARGS (WORK_STATION_ID)^
-- end NLQC_QC_ARGS
-- begin NLQC_CAR_MODEL
create unique index IDX_NLQC_CAR_MODEL_UNIQ_CAR_MODEL_NO on NLQC_CAR_MODEL (CAR_MODEL_NO) ^
-- end NLQC_CAR_MODEL
