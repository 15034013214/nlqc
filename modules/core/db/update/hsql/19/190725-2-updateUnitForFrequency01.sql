update NLQC_UNIT_FOR_FREQUENCY set UNIT_NAME = '' where UNIT_NAME is null ;
alter table NLQC_UNIT_FOR_FREQUENCY alter column UNIT_NAME set not null ;
