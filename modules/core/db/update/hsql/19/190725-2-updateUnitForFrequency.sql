alter table NLQC_UNIT_FOR_FREQUENCY add column UNIT varchar(50) ^
update NLQC_UNIT_FOR_FREQUENCY set UNIT = 'PIECE' where UNIT is null ;
alter table NLQC_UNIT_FOR_FREQUENCY alter column UNIT set not null ;
alter table NLQC_UNIT_FOR_FREQUENCY add column VALUE_ integer ^
update NLQC_UNIT_FOR_FREQUENCY set VALUE_ = 0 where VALUE_ is null ;
alter table NLQC_UNIT_FOR_FREQUENCY alter column VALUE_ set not null ;
