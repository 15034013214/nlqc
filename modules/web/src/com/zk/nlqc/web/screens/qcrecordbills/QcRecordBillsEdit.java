package com.zk.nlqc.web.screens.qcrecordbills;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.QcRecordBills;
import com.zk.nlqc.entitys.record.QcRecordBillsItem;

import javax.inject.Inject;

@UiController("nlqc_QcRecordBills.edit")
@UiDescriptor("qc-record-bills-edit.xml")
@EditedEntityContainer("qcRecordBillsDc")
@LoadDataBeforeShow
public class QcRecordBillsEdit extends StandardEditor<QcRecordBills> {
    @Inject
    private InstanceLoader<QcRecordBills> qcRecordBillsDl;
    @Inject
    private InstanceContainer<QcRecordBills> qcRecordBillsDc;
    @Inject
    private CollectionLoader<QcRecordBillsItem> deviceQcDl;
    @Inject
    private CollectionLoader<QcRecordBillsItem> guiseQcDcl;
    @Inject
    private CollectionLoader<QcRecordBillsItem> materialQcDl;
    @Inject
    private CollectionLoader<QcRecordBillsItem> quantityQcDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        qcRecordBillsDl.load();
        QcRecordBills qcRecordBills = qcRecordBillsDc.getItem();
        if(null != qcRecordBills){
            quantityQcDl.setParameter("qcRecordBill" , qcRecordBills);
            quantityQcDl.setParameter("qcArgsNo" , "1");
            quantityQcDl.load();

            deviceQcDl.setParameter("qcRecordBill" , qcRecordBills);
            deviceQcDl.setParameter("qcArgsNo" , "2");
            deviceQcDl.load();

            materialQcDl.setParameter("qcRecordBill" , qcRecordBills);
            materialQcDl.setParameter("qcArgsNo" , "3");
            materialQcDl.load();

            guiseQcDcl.setParameter("qcRecordBill" , qcRecordBills);
            guiseQcDcl.setParameter("qcArgsNo" , "4");
            guiseQcDcl.load();
        }
    }


}