alter table NLQC_QC_ARGS alter column WORK_STATION_ID rename to WORK_STATION_ID__U92128 ^
drop index IDX_NLQC_QC_ARGS_ON_WORK_STATION ;
alter table NLQC_QC_ARGS drop constraint FK_NLQC_QC_ARGS_ON_WORK_STATION ;
