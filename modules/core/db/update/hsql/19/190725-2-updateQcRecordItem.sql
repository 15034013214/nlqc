alter table NLQC_QC_RECORD_ITEM add column REALITY_IN_MATERIAL_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column KEY_DEVICE_NAME varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column REALITY_VALUE decimal(19, 2) ;
alter table NLQC_QC_RECORD_ITEM add column QC_ITEM_NAME varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column KEY_MATERIAL_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column QC_TIME timestamp ;
alter table NLQC_QC_RECORD_ITEM add column QC_ITEM_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column QC_TYPE varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column IS_CONTROL_ITEM varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column QC_WORK_STATION_NAME varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column FORCE_RECEIVE boolean ;
alter table NLQC_QC_RECORD_ITEM add column UP_VALUE decimal(19, 2) ;
alter table NLQC_QC_RECORD_ITEM add column IS_QUALIFIED boolean ;
alter table NLQC_QC_RECORD_ITEM add column KEY_DEVICE_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column UNIT varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column ROUNDS_QC_FREQUENCY varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column QC_DEVICE varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column BELOW_VALUE decimal(19, 2) ;
alter table NLQC_QC_RECORD_ITEM add column QC_ARGS_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column QC_WORK_STATION_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column INITIATIVE_QC_FREQUENCY varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column KEY_MATERIAL_NAME varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column REFUSE_RECEIVE boolean ;
alter table NLQC_QC_RECORD_ITEM add column IS_GOBACK_REPAIR boolean ;
alter table NLQC_QC_RECORD_ITEM add column QC_ARGS_TYPE varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column ONCE_PASS boolean ;
alter table NLQC_QC_RECORD_ITEM add column FLOW_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column CAR_MODEL_NO varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column NORM_VALUE decimal(19, 2) ;
alter table NLQC_QC_RECORD_ITEM add column FIRST_QC_FREQUENCY varchar(255) ;
alter table NLQC_QC_RECORD_ITEM add column FINALLY_QC_FREQUENCY varchar(255) ;
