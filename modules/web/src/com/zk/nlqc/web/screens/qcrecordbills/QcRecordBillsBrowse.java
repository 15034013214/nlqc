package com.zk.nlqc.web.screens.qcrecordbills;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.QcRecordBills;

@UiController("nlqc_QcRecordItem.browse")
@UiDescriptor("qc-record-bills-browse.xml")
@LookupComponent("qcRecordBillsesTable")
@LoadDataBeforeShow
public class QcRecordBillsBrowse extends StandardLookup<QcRecordBills> {
}