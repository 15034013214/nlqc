alter table NLQC_QC_ITEM add constraint FK_NLQC_QC_ITEM_ON_QC_FLOW foreign key (QC_FLOW_ID) references NLQC_QC_FLOW(ID);
create index IDX_NLQC_QC_ITEM_ON_QC_FLOW on NLQC_QC_ITEM (QC_FLOW_ID);
