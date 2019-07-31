update NLQC_FREQUENCY set SHOW_TEXT = '' where SHOW_TEXT is null ;
alter table NLQC_FREQUENCY alter column SHOW_TEXT set not null ;
