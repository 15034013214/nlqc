update NLQC_WORK_STATION set WORK_STATION = '' where WORK_STATION is null ;
alter table NLQC_WORK_STATION alter column WORK_STATION set not null ;
