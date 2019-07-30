package com.zk.nlqc.web.screens.qcrecordbillsitem;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.QcRecordBillsItem;

@UiController("nlqc_QcRecordBillsItem.edit")
@UiDescriptor("qc-record-bills-item-edit.xml")
@EditedEntityContainer("qcRecordBillsItemDc")
@LoadDataBeforeShow
public class QcRecordBillsItemEdit extends StandardEditor<QcRecordBillsItem> {
}