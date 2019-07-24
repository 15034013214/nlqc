package com.zk.nlqc.web.screens.qcitem;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcItem;

@UiController("nlqc_QcItem.edit")
@UiDescriptor("qc-item-edit.xml")
@EditedEntityContainer("qcItemDc")
@LoadDataBeforeShow
public class QcItemEdit extends StandardEditor<QcItem> {
}