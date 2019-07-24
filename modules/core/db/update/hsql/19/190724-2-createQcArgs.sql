alter table NLQC_QC_ARGS add constraint FK_NLQC_QC_ARGS_ON_WORK_STATION foreign key (WORK_STATION_ID) references NLQC_WORK_STATION(ID);
create unique index IDX_NLQC_QC_ARGS_UNIQ_QC_ARGS_CODE on NLQC_QC_ARGS (QC_ARGS_CODE) ;
create index IDX_NLQC_QC_ARGS_ON_WORK_STATION on NLQC_QC_ARGS (WORK_STATION_ID);