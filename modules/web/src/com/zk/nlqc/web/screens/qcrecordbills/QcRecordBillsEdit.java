package com.zk.nlqc.web.screens.qcrecordbills;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.QcRecordBills;

@UiController("nlqc_QcRecordItem.edit")
@UiDescriptor("qc-record-bills-edit.xml")
@EditedEntityContainer("qcRecordBillsDc")
@LoadDataBeforeShow
public class QcRecordBillsEdit extends StandardEditor<QcRecordBills> {
}