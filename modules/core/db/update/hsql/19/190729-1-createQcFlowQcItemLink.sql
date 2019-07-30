create table NLQC_QC_FLOW_QC_ITEM_LINK (
    QC_FLOW_ID varchar(36) not null,
    QC_ITEM_ID varchar(36) not null,
    primary key (QC_FLOW_ID, QC_ITEM_ID)
);
