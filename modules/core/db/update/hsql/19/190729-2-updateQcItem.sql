alter table NLQC_QC_ITEM alter column QC_FLOW_ID rename to QC_FLOW_ID__U24829 ^
drop index IDX_NLQC_QC_ITEM_ON_QC_FLOW ;
alter table NLQC_QC_ITEM drop constraint FK_NLQC_QC_ITEM_ON_QC_FLOW ;
