alter table NLQC_FREQUENCY add column FREQUENCY varchar(255) ^
update NLQC_FREQUENCY set FREQUENCY = '' where FREQUENCY is null ;
alter table NLQC_FREQUENCY alter column FREQUENCY set not null ;
