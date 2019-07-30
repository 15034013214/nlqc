alter table NLQC_FREQUENCY alter column FREQUENCY rename to FREQUENCY__U81810 ^
alter table NLQC_FREQUENCY alter column FREQUENCY__U81810 set null ;
alter table NLQC_FREQUENCY add column FREQUENCY_NO varchar(255) ;
