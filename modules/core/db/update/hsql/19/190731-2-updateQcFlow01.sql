-- update NLQC_QC_FLOW set CAR_MODEL_ID = <default_value> where CAR_MODEL_ID is null ;
alter table NLQC_QC_FLOW alter column CAR_MODEL_ID set not null ;
-- update NLQC_QC_FLOW set QC_COURSE_ID = <default_value> where QC_COURSE_ID is null ;
alter table NLQC_QC_FLOW alter column QC_COURSE_ID set not null ;
-- update NLQC_QC_FLOW set WORK_STATION_ID = <default_value> where WORK_STATION_ID is null ;
alter table NLQC_QC_FLOW alter column WORK_STATION_ID set not null ;
update NLQC_QC_FLOW set QC_FLOW_NO = '' where QC_FLOW_NO is null ;
alter table NLQC_QC_FLOW alter column QC_FLOW_NO set not null ;
