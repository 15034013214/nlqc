update NLQC_FREQUENCY set SHOW_TEXT = '' where SHOW_TEXT is null ;
alter table NLQC_FREQUENCY alter column SHOW_TEXT set not null ;
update NLQC_FREQUENCY set FREQUENCY_NO = '' where FREQUENCY_NO is null ;
alter table NLQC_FREQUENCY alter column FREQUENCY_NO set not null ;
